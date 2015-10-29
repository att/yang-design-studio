              package handlers;

              import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

 //           import java.io.PrintStream;  //Never used?
              import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
//import org.eclipse.debug.ui.console.FileLink;

import org.eclipse.jface.dialogs.MessageDialog;
/*            import org.eclipse.core.filesystem.IFileSystem;*/  //Never used?
/*            import org.eclipse.core.resources.IFile;*/  //Never used?
/*            import org.eclipse.core.runtime.IPath;*/  //Never used?

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
/*            import org.eclipse.ui.IWorkbench;*/  //Never used?
              import org.eclipse.ui.IWorkbenchPage;
/*            import org.eclipse.ui.IWorkbenchPartSite; */ //Never used?
              import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.console.*;
              public class YangSyntax
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
            			// no console found, so create a new one
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
                	//determine if we are using Linux or Windows
                	String OS = System.getProperty("os.name").toLowerCase();	
                	//Returns name of OS in lowercase (win, mac, nix/nux/aix, sunos)
                	//Relevant OS are win, nix/nux/aix
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
                          String namefile = ((IFileEditorInput)input).getFile().getName();	   //name of file
                          int indexext = namefile.lastIndexOf('.');			//index of extension
                          String namefileext = namefile.substring(indexext + 1, namefile.length()); // name of extension
                          namefile = namefile.substring(0, indexext); // name of file minus the extension
                          if (!namefileext.equals("yang"))	//verify that we are looking at yang file
                          {
  							IWorkbenchWindow windowErr = HandlerUtil.getActiveWorkbenchWindowChecked(event);
  							MessageDialog.openInformation(windowErr.getShell(),
  									"Error",
  									"Active file is not .yang!");//if open file is not .yang, print error message and stop
  							return null;
                          }
                	String command = "";
                	boolean windows = false;
                	boolean linux = false;
                	
                	//This is the Windows command
                   if(OS.indexOf("win") >= 0){
                	   command = "where /R c:" + "\\"+ " pyang.py";
                   	   windows = true;
                   }
                   else if(OS.indexOf("") >= 0 || OS.indexOf("") >= 0 ||OS.indexOf("") >= 0)
                   {
                	   command = "which pyang";
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
   							"IOException!" + line);
   						eio.printStackTrace();
                     return null;
                   }
                  finally
                  {
                        try
                          {
                        	  Process Findspace;
                        	  MessageConsoleStream out = getMessageStream(); // create console stream object
                        	  
                        	  if(windows)
                        	  {
                        		  String filepath = pathfilein.substring(0,pathfilein.lastIndexOf("\\"));
                            	  File f_path = new File(filepath);
                        		  Findspace = Runtime.getRuntime().exec(new String[] {
                        				  "python",line, pathfilein },null,
                      				  	f_path);
                        	  }
                        	  else if(linux)
                        	  {
                        		  String filepath = pathfilein.substring(0,pathfilein.lastIndexOf("/"));
                            	  File f_path = new File(filepath);
                        		  Findspace = Runtime.getRuntime().exec(new String[] {
                                		  "pyang", pathfilein },null,
                      				  	f_path);
                        		  
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
                            String error_warning_line;	//stores error and warning messages
                        	out.println("pyang path: " + line);
                        	out.println("file path: " + pathfilein);
                        	boolean no_err_warn = true;
                            while ((error_warning_line = Resultset.readLine()) != null)
                            {
                            	out.println("Line " + error_warning_line.substring(error_warning_line.indexOf(".yang:")+6));
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
                        	  IWorkbenchWindow windowErr = HandlerUtil.getActiveWorkbenchWindowChecked(event);
							MessageDialog.openInformation(windowErr.getShell(),
									"Error",
									"Something went wrong!");
                		  return null;
                          }
                        }
                      }
                    }
                  }
                  return null;
                }
              }

