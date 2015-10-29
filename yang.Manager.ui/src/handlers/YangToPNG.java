package handlers;

//KLD: This handler is created to generate a .PNG file from the YANG file.
// Applies to older version of pyang: For this to work the KLD Fix to the pyang/uml.py
// file should be installed into the pyang/plugins directory, replacing the original uml.py

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;






//           import java.io.PrintStream;  //Never used?
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
/*            import org.eclipse.core.filesystem.IFileSystem;*/  //Never used?
/*            import org.eclipse.core.resources.IFile;*/  //Never used?
/*            import org.eclipse.core.runtime.IPath;*/  //Never used?
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
/*            import org.eclipse.ui.IWorkbench;*/  //Never used?
import org.eclipse.ui.IWorkbenchPage;
/*            import org.eclipse.ui.IWorkbenchPartSite; */ //Never used?
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.ide.IDE;

public class YangToPNG 
extends AbstractHandler
{
  private static MessageConsole findConsole(String name) {//Find and return console, otherwise make one

		if (ConsolePlugin.getDefault() == null)
			return null;
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager YangConsole = plugin.getConsoleManager();
		IConsole[] existing = YangConsole.getConsoles();
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName())) {
				YangConsole.showConsoleView(existing[i]);
				return (MessageConsole) existing[i];
			}
		MessageConsole myConsole = new MessageConsole(name, null);
		YangConsole.addConsoles(new IConsole[] { myConsole });
		return myConsole;
	}

public MessageConsoleStream getMessageStream() {
		MessageConsole myConsole = findConsole("Yang Console"); //calls function to find/create the Yang console
		if (myConsole != null) {

			IWorkbench wb = PlatformUI.getWorkbench();
			IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
			IWorkbenchPage page = win.getActivePage();
			String id = IConsoleConstants.ID_CONSOLE_VIEW;
			IConsoleView view;
			try {

				view = (IConsoleView) page.showView(id);
				view.display(myConsole);

				return myConsole.newMessageStream();
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
public Object execute(ExecutionEvent event)
  throws ExecutionException
{
	String OS = System.getProperty("os.name").toLowerCase();	
	IWorkbenchWindow win = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    IWorkbenchPage page = win.getActivePage();
    if (page != null)
    {
      IEditorPart editor = page.getActiveEditor();
      
      if (editor != null)
      {
        IEditorInput input = editor.getEditorInput();
        if ((input instanceof IFileEditorInput))
        {
          if (editor.isDirty()) {
            page.saveEditor(editor, true);
          }
          String pathfilein = ((IFileEditorInput)input).getFile().getLocation().toOSString();
          String namefile = ((IFileEditorInput)input).getFile().getName();
          int indexext = namefile.lastIndexOf('.');
          String namefileext = namefile.substring(indexext + 1, namefile.length());
          namefile = namefile.substring(0, indexext);
          if (!namefileext.equals("yang"))
          {
				IWorkbenchWindow windowErr = HandlerUtil.getActiveWorkbenchWindowChecked(event);
				MessageDialog.openInformation(windowErr.getShell(),
						"Error",
						"Active file is not .yang!");
				return null;
          }
          String command = "";
          String commandplantuml = "";

          boolean windows = false;
          boolean linux = false;
	
          if(OS.indexOf("win") >= 0){
        	  command = "where /R c:" + "\\"+ " pyang.py";
        	  commandplantuml = "where /R c:" + "\\"+ " plantuml.jar";
        	  windows = true;
          }
          else if(OS.indexOf("") >= 0 || OS.indexOf("") >= 0 ||OS.indexOf("") >= 0)
          {
        	  command = "which pyang";
        	  commandplantuml = "which plantuml.jar";
        	  linux = true;
          }
          String line = "";

          try
          {
        	  Process FindPyangPath= Runtime.getRuntime().exec(command);
        	  BufferedReader Resultset = new BufferedReader(new InputStreamReader(FindPyangPath.getInputStream()));
        	  Boolean dummy = true;
        	  String line2 = "";
        	  while ((line2 = Resultset.readLine()) != null && dummy == true) {
        		  line = line + line2;
      
        		  if(line.length()> 8 && (line2 == "" || line2 == null))
        		  {
        			  dummy = false;//Because it reads the line after finding the location   
        		  }
   
        		  System.out.println("1" +line);//check to see what file location is printed
        	  }
        	  if (line.isEmpty())
        	  {
        		  IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        		  MessageDialog.openInformation(window.getShell(),
        				  "Error",
        				  "Unable to find pyang.py!");
        		  return null;
        	  }
          }
          catch(IOException eio)//This should never execute
          {
        	  IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
        	  MessageDialog.openInformation(window.getShell(),
        			  "Error",
        			  "IOException!" + "line: " + line
        			  );
        	  eio.printStackTrace();
        	  return null;
          }
          finally
          {
        	  String filepath = "";
        	  if(windows)
        	  {
        		  filepath = pathfilein.substring(0,pathfilein.lastIndexOf("\\")+1);
        	  }
        	  else if(linux)
        	  {
        		  filepath = pathfilein.substring(0,pathfilein.lastIndexOf("/")+1);
        	  }
        	  namefile = namefile.substring(0, indexext); // name of file minus the extension
          
        	  String namefileout = filepath + namefile + ".uml";
        	  String namepngfileout = filepath + "img\\" + namefile + ".png";
        	  File fileToOpen = new File(namefileout);
        	  FileDialog dlg = new FileDialog(editor.getSite().getShell(), 8192);
        	  MessageBox mb = new MessageBox(dlg.getParent(), 456);


           	  mb.setMessage("Do you wish to specify a location to store output?");
           	  int result = mb.open(); 
           	  if (result == 256) { //Cancel Selected
           		  return null;
           	  }
           	  else if (result == 64) //Yes Selected
           	  {
           		  Shell shell = dlg.getParent();

           		  FileDialog dialog = new FileDialog(shell, 8192);
           		  dialog.setText("Select File Location");
           		  dialog.setFilterNames(new String[] { "uml Files", "All Files (*.*)" });
           		  dialog.setFilterExtensions(new String[] { "*.uml", "*.*" });
           		  dialog.setFilterPath(filepath);
           		  dialog.setFileName(namefile + ".uml");
           		  dialog.open();
           		  namefileout = dialog.getFilterPath() + "/" + dialog.getFileName();
           	  }
           	  try 
           	  {
           		  Files.deleteIfExists(Paths.get(namefileout));
           	  } 
           	  catch (IOException x) {
           		  System.err.println(x);
           	  }
           	  try
           	  {
            	  String OPTIONS = "";
            	  IWorkbenchWindow windowDepth = HandlerUtil.getActiveWorkbenchWindowChecked(event);
            	  ElementListSelectionDialog dialog = 
            			  new ElementListSelectionDialog(windowDepth.getShell(), new LabelProvider());
            			dialog.setElements(new String[] { " ", " --uml-inline-groupings", " --uml-inline-augments" });
            			dialog.setTitle("Choose Optional Detailed Rendition");
            			if (dialog.open() != Window.OK) {
            			    return false;
            			}
            			Object[] result2 = dialog.getResult(); 
            			OPTIONS = (String) result2[0];
        				OPTIONS = OPTIONS.trim();

            	  Process Findspace;
            	  MessageConsoleStream out = getMessageStream(); // create console stream object
            	  File f_path = new File(filepath);
            	  if(windows)
            	  {
            		  
            		  Findspace = Runtime.getRuntime().exec(new String[] {
            				  "python",line, "-f", "uml",OPTIONS, "-o", namefileout, pathfilein },null,
          				  	f_path);
            		  out.println("python " +line+ " -f uml " + OPTIONS+" -o " +  namefileout + " " + pathfilein);
            	  }
            	  else if(linux)
            	  {
            		  
            		  Findspace = Runtime.getRuntime().exec(new String[] {
                    		  "pyang", "-f","uml",OPTIONS, "-o", namefileout, pathfilein },null,
          				  	f_path);
            		  out.println("pyang " + line + "-f uml " + OPTIONS+" -o " +  namefileout + " " + pathfilein);
            	  }
            	  else
            	  {
            		  IWorkbenchWindow windowErr = HandlerUtil.getActiveWorkbenchWindowChecked(event);
						MessageDialog.openInformation(windowErr.getShell(),
								"Error",
								"OS is not Linux or Windows!");
            		  return null;
            	  }

                BufferedReader Resultset = new BufferedReader(new InputStreamReader(Findspace.getErrorStream()));
                String error_line;
                out.println("pyang path: " + line);
            	out.println("file path: " + pathfilein);
                boolean no_err_warn = true;
                while ((error_line = Resultset.readLine()) != null)
                {
                  out.println(error_line);
              	  no_err_warn = false;
                }
                if (no_err_warn)
                {
                	out.println("No Errors or Warnings");
                }

                out.println();
           	  }
           	  catch (IOException eio1)
           	  {
           		  eio1.printStackTrace();
           	  }
           	  finally//Open the new file in the workbench
           	  {
           		  fileToOpen = new File(namefileout);
           		  MessageConsoleStream out = getMessageStream(); // create console stream object
           		  out.println(namefileout);
           		  out.println();

           		  if ((fileToOpen.exists()) && (fileToOpen.isFile()))
           		  {
           			  IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
           			  IWorkbenchPage page2 = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
           			  try
           			  {
           				  IDE.openEditorOnFileStore(page2, fileStore);
           			  }
           			  catch (PartInitException localPartInitException) {}
           		  }

           		  String lineplantuml = "";

           		  try {
           			  Process FindPlantUmlPath= Runtime.getRuntime().exec(commandplantuml);
           			  BufferedReader Resultsetplantuml = new BufferedReader(new InputStreamReader(FindPlantUmlPath.getInputStream()));
           			  Boolean dummyplantuml = true;
           			  String lineplantuml2 = "";
           			  while ((lineplantuml2 = Resultsetplantuml.readLine()) != null && dummyplantuml == true) {
           				  lineplantuml = lineplantuml + lineplantuml2;

           				  if(lineplantuml.length()> 12 && (lineplantuml2 == "" || lineplantuml2 == null))
           				  {
           					  dummyplantuml = false;//Because it reads the line after finding the location   
           				  }
           			  }
           			  if (lineplantuml.isEmpty())
           			  {
           			 	IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
           			 	MessageDialog.openInformation(window.getShell(),
           			 			"Error",
           			 			"Unable to find plantuml.jar!");
           			 	return null;
           			  }
           		  }
           		  catch (IOException ex)//This should never execute
           		  {
           			  IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
           			  MessageDialog.openInformation(window.getShell(),
           					  "Error",
           					  "IOException!" + "lineplantuml: " + lineplantuml
           				);
           			  ex.printStackTrace();
           			  return null;
           		  }
      
           		  try
           		  {
           			  Process Findspace;
           			  File f_path = new File(filepath);
           			  if(windows)
           			  {
           				  Findspace = Runtime.getRuntime().exec(new String[] {
	             				  "java", "-jar", lineplantuml, "-Tpng", namefileout}, null,
										f_path);
           				  out.println("Generating UML .PNG FILE.....");
           			  }
           			  else if(linux)
           			  {
           				  Findspace = Runtime.getRuntime().exec(new String[] {
           						  "java", "-jar", lineplantuml, "-Tpng", namefileout}, null,
         				  		f_path);
           				  out.println("Generating UML .PNG FILE.....");
           			  }
           			  else
           			  {
           				  IWorkbenchWindow windowErr = HandlerUtil.getActiveWorkbenchWindowChecked(event);
							MessageDialog.openInformation(windowErr.getShell(),
								"Error",
								"OS is not Linux or Windows!");
							return null;
           			  }

           			  BufferedReader Resultset = new BufferedReader(new InputStreamReader(Findspace.getErrorStream()));
           			  String error_line;
        	
           			  boolean no_err_warn = true;
           			  while ((error_line = Resultset.readLine()) != null)
           			  {
           				  out.println(error_line);
           				  no_err_warn = false;
           			  }
           			  if (no_err_warn)
           			  {
           				  out.println("No Errors or Warnings on PNG Generation");
           			  }
           			  out.println();
           		  }
           		  catch (IOException eio2)
           		  {
           			  eio2.printStackTrace();
           		  }
           		  finally//Open the new file in the workbench
           		  {
           			  fileToOpen = new File(namepngfileout);
           			  MessageConsoleStream pngout = getMessageStream(); // create console stream object
           			  pngout.println(namepngfileout);
               		  pngout.println();

           			  if ((fileToOpen.exists()) && (fileToOpen.isFile()))
           			  {
           				  IFileStore fileStore = EFS.getLocalFileSystem().getStore(fileToOpen.toURI());
           				  IWorkbenchPage page2 = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
           				  try
           				  {
           					  IDE.openEditorOnFileStore(page2, fileStore);
           				  }
           				  catch (PartInitException localPartInitException) {}
           			  }
           		  }
           	  }
          }
        }
      }
    }
    return null;
  }
}