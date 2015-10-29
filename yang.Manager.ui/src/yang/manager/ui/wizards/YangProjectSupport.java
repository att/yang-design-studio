package yang.manager.ui.wizards;


import java.net.URI;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
 import org.eclipse.core.runtime.IProgressMonitor;


public class YangProjectSupport
{
   public static IProject createProject(String projectName, URI location)
   {
     Assert.isNotNull(projectName);
     Assert.isTrue(projectName.trim().length() > 0);
   
     
     IProject project = createBaseProject(projectName, location);
     try
     {
       addNature(project);
       
       String[] paths = { "Yang-Modules" };
       addToProjectStructure(project, paths);
     }
    catch (CoreException e)
     {
       e.printStackTrace();
       project = null;
     }
     return project;
   }
   
   private static IProject createBaseProject(String projectName, URI location)
   {
     IProject newProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
     if (!newProject.exists())
     {
       URI projectLocation = location;
       IProjectDescription desc = newProject.getWorkspace().newProjectDescription(newProject.getName());
       if ((location != null) && (ResourcesPlugin.getWorkspace().getRoot().getLocationURI().equals(location))) {
         projectLocation = null;
       }
       desc.setLocationURI(projectLocation);
       try
       {
         newProject.create(desc, null);
         if (!newProject.isOpen()) {
           newProject.open(null);
         }
       }
       catch (CoreException e)
       {
         e.printStackTrace();
       }
     }
     System.out.println("returning project");
     return newProject;
   }
   
   private static void createFolder(IFolder folder)
     throws CoreException
   {
     IContainer parent = folder.getParent();
     if ((parent instanceof IFolder)) {
       createFolder((IFolder)parent);
     }
     if (!folder.exists()) {
       folder.create(false, true, null);
     }
   }
   
   private static void addToProjectStructure(IProject newProject, String[] paths)
     throws CoreException
   {
     for (String path : paths)
     {
       IFolder etcFolders = newProject.getFolder(path);
       createFolder(etcFolders);
     }
   }
   
   private static void addNature(IProject project)
     throws CoreException
   {
     if (!project.hasNature("org.eclipse.xtext.ui.shared.xtextNature"))
     {
       IProjectDescription description = project.getDescription();
       String[] prevNatures = description.getNatureIds();
       String[] newNatures = new String[prevNatures.length + 1];
       System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
       newNatures[prevNatures.length] = "org.eclipse.xtext.ui.shared.xtextNature";
       description.setNatureIds(newNatures);
       
       IProgressMonitor monitor = null;
      project.setDescription(description, monitor);
      System.out.println("nature Set!");
     }
   }
 }