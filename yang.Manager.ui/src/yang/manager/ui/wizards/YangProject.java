package yang.manager.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import java.net.URI;


/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "yang". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class YangProject extends Wizard implements INewWizard {
	private YangProjectPage page1;
	/**
	 * Constructor for Yang.
	 */
	public YangProject() {
		super();
		setNeedsProgressMonitor(true);
	}
	public void addPages(){
		super.addPages();
		page1 = new YangProjectPage("Yang Project Wizard");
		page1.setTitle("Yang Project");
		page1.setDescription("Create a new Yang Project.");
		System.out.println("adding page1?");
		addPage(page1);
		System.out.println("added?");
		//page2.setTitle("Yang Project");
		//page2.setDescription("Create a Yang file.");
	/*	System.out.println("adding page 2?");
		addPage(page2);
		System.out.println("added page 2?");
	*/	
	}
	
	@Override
	public boolean performFinish() {
		//final String containerName = page2.getContainerName();
		//String fileName = page2.getFileName();
		String name = this.page1.getProjectName();
		//String filename = this.page2.getName();
		URI folder = null;
		if(!this.page1.useDefaults()){
			folder = this.page1.getLocationURI();
		}
		System.out.println("running project support?");
		YangProjectSupport.createProject(name, folder);
		System.out.println("finished?");
  	    return true;
	}
	public void init(IWorkbench arg0, IStructuredSelection arg1) {}
}