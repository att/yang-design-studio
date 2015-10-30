Copyright (c) 2012-2015 AT&T Intellectual Property

YANG DESIGN STUDIO
==================

An Eclipse plugin to create, edit, visualize and render YANG Models. Utilizes XText, PYANG, GRAPHVIZ and other underlying opensource components.

Here you will find the Source Code and Plugin for the AT&T YANG Design Studio Eclipse Plugin.  Once installed in Eclipse, it provides the following functionality:

1.	Check Yang Syntax
	* The results are displayed in the Eclipse Console and Problems Window
2.	Create YIN/XML File
	* The results are displayed in a new presentation window and saved to file
3.	Create Tree File (with selectable tree depth
	* The results are displayed in a new presentation window and saved to file
4.	Create UML file
	* The results are displayed in a new presentation window and saved to file
5.	Create PNG from UML
	* The UML output is displayed in a new presentation window
	* The PNG is displayed in a new pop-up window created by the image viewer and saved to the <img> directory under the Eclipse Workspace directory for the Yang Model
6.	Create XSD file
	* The results are displayed in a new presentation window and saved to file
7.	Create JS Tree
	* The results are displayed in a new presentation window and saved to file.
	* The user can interact with the JSTree output by expanding or contracting the depth of the YANG model namespace
8.	Create Skeleton XML File
	* The results are displayed in a new presentation window and saved to file
	* The user can manipulate the XML output file, such as adding instance data, to illustrate a sample instantiation of the YANG model
9.	Create DSDL File
	* The results are displayed in a new presentation window and saved to file
10.	Create XSLT File
	* The results are displayed in a new presentation window and saved to file
11.	About ATT-YANG IDE (aka YANG Design Studio)
	* A display of developer, version and dependency information
12. New YANG Project Creation Wizard
13. New YANG Module Creation Wizard
14. Comprehensive WSYWYG YANG Module Editor

**Organization of Repo:**
-------------------------

- yang.Manager: XText Grammar
- yang.Manager.tests: Testing Source -- not used at this time
- yang.Manager.ui: Main Handler code for the plugin user selections
- YangFeature: feature.xml
- YangUpdate: Eclipse Update Site, with the Eclipse Plugin generated in this build of the code.


**Recommendation for Compiling the Source Code**
------------------------------------------------

The following procedure should be adopted to generate a new Eclipse Update Site:

- Clone the project code from this repo
- Import all source into Eclipse
- Modify source as needed
- Select Site Map (find this in YangUpdate->plugins->site.xml)
- Select Add Feature and search for YangFeature and add it in (it should look something like YangFeature(1.0.0.<datever>))
- Build the update site
- Go to the corresponding Eclipse workspace directory and delete all older entries in the YangUpdate features and plugins sub-directories
- Zip up the YangUpdate directory for distribution and loading into Eclipse instances

**Plugin Installation Information**
-----------------------------------

Information on installing the plugin dependencies as well as the plugin itself can be found in Docs/.  Please follow the instructions in sequence as indicated by the file names.