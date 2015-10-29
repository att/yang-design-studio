package quickfix;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IMarkerResolution;
import org.eclipse.ui.IMarkerResolutionGenerator;



class QuickFixes implements IMarkerResolutionGenerator {
   public IMarkerResolution[] getResolutions(IMarker mk) {
      try {
         Object problem = mk.getAttribute("WhatsUp");
         return new IMarkerResolution[] {
            new Quick("Fix #1 for "+problem),
            new Quick("Fix #2 for "+problem),
         };
      }
      catch (CoreException e) {
         return new IMarkerResolution[0];
      }
   }
}

