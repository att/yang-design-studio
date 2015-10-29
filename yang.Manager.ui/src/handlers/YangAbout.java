package handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


public class YangAbout
  extends AbstractHandler
  {
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil
				.getActiveWorkbenchWindowChecked(event);
		MessageDialog.openInformation(window.getShell(),
				"AT&T YANG Plugin for Eclipse",
				"Developed by: Kevin D'Souza and Jonathan Pang, AT&T Labs.\n"
				+ "Version 1.5\n"
				+ "Release Date 6/28/15.\n\n"
				+ "Eclipse Public License -v 1.0\n\n"
				+ "http://opensource.org/licenses/eclipse-1.0.txt\n\n"				
				+ "Copyright 2015 AT&T Intellectual Property. All other rights reserved.\n\n"
				+ "FEATURE HIGHLIGHTS: \n"
				+ "(a) Validation of YANG Module Conformance to IETF RFC 6020, \n"
				+ "(b) Tree, UML, XSD, JSTREE, XML, XSLT and PNG Rendition of YANG Module \n\n"
				+ "This Plugin depends on projects developed by other open source projects:\n\n"
				+ "Eclipse Release Juno or later:\n"
				+ "  (Eclipse Public License: https://www.eclipse.org/legal/epl-v10.html);\n"
				+ "Xtext Release 2.6.2 or later:\n"
				+ "  (Eclipse Public License: https://www.eclipse.org/legal/epl-v10.html);\n"
				+ "Python 2.7 or later:\n"
				+ "  (Python License: https://docs.python.org/2/license.html);\n"
				+ "plantuml.jar:\n"
				+ "  (MIT License: http://plantuml.sourceforge.net/download.html#mit);\n"
				+ "GraphViz/Dot:\n"
				+ "  (Eclipse Public License: https://www.eclipse.org/legal/epl-v10.html);\n"
				+ "PYANG 1.4.1 or later:\n"
				+ "  (New BSD License: https://code.google.com/p/pyang/);\n\n"
				+ "Updates to following ENV Varaibles needed: $YANG_MODPATH; $GRAPHVIZ_DOT\n\n");
		return null;
	}
}