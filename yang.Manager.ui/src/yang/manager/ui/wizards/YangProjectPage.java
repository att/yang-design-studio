package yang.manager.ui.wizards;
/*
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
*/
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;


/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (yang).
 */

public class YangProjectPage extends WizardNewProjectCreationPage {
	public YangProjectPage(String title)
	{
		super(title);
		//setPageComplete(true);
	}
	protected boolean validatePage()
	{
		if (getProjectName().contains(" "))
		{
			setErrorMessage("The Project Name must not contain 'spaces'.");
			return false;
		}
		return super.validatePage();
	}
}