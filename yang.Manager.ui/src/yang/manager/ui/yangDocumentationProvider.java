package yang.manager.ui;
 
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;

import yang.manager.yang.*;

public class yangDocumentationProvider implements IEObjectDocumentationProvider {
 
    public String getDocumentation(EObject o) {
        if (o instanceof LeafStatement) {
            return "A leaf node contains simple data like an integer or a string.  It has<br>" +
            	   "exactly one value of a particular type and no child nodes.<br> <br>" +
            	   "YANG Example:<br> <br>" +
            	   "<code> &emsp; leaf host-name &#123 <br>" +
            	   " &emsp; &emsp; type string;<br>" +
            	   " &emsp; &emsp; description \"Hostname for this system\";<br>" +
            	   " &emsp; }</code>";
        }
        else if(o instanceof Module) {
        	return "A module contains three types of statements: module-header<br>" +
   "statements, revision statements, and definition statements.  The<br>" +
   "module header statements describe the module and xgive information<br>" +
   "about the module itself, the revision statements give information<br>" +
   "about the history of the module, and the definition statements are<br>" +
   "the body of the module where the data model is defined.";
        }
        else if(o instanceof LeafListStatement) {
        	return " Where the \"leaf\" statement is used to define a simple scalar variable<br>" +
   "of a particular type, the \"leaf-list\" statement is used to define an<br>" +
   "array of a particular type.  The \"leaf-list\" statement takes one<br>" +
   "argument, which is an identifier, followed by a block of<br>" +
   "substatements that holds detailed leaf-list information.<br>" +
   "The values in a leaf-list MUST be unique.<br> <br>" +
   "YANG Example:<br> <br>" +
   "<code> &emsp; leaf-list domain-search &#123<br>" +
   " &emsp; &emsp; type string;<br>" +
   " &emsp; &emsp; description \"List of domain names to search\";<br>" +
   " &emsp; };<br></code>"; 
        }
        else if(o instanceof ContainerStatement) {
        	return "A container may contain any number of child nodes of any type<br>" +
    			   "YANG Example:<br> <br>" +
    			   "<code> &emsp;      container system &#123<br>" +
    			   " &emsp; &emsp; container login &#123<br>" +
    			   " &emsp; &emsp; &emsp; leaf message &#123<br>" +
    			   " &emsp; &emsp; &emsp; &emsp;    type string;<br>" +
    			   " &emsp; &emsp; &emsp; &emsp;  description<br>" +
    			   " &emsp; &emsp; &emsp; &emsp; &emsp;   \"Message given at start of login session\";<br>" +
    			   " &emsp; &emsp; &emsp; &#125; <br>" +
    			   " &emsp; &emsp; &#125; <br>" +
         		   " &emsp; &#125; </code>";
        }
        else if(o instanceof ListStatement) {
        	return " A list defines a sequence of list entries.  Each entry is like a<br>"+
   "structure or a record instance, and is uniquely identified by the<br>"+
   "values of its key leafs.  A list can define multiple key leafs and<br>"+
   "may contain any number of child nodes of any type (including leafs,<br>"+
   "lists, containers etc.).<br>" +
   "<b>IMPORTANT: Lists must contain at least one key</b> <br> <br>"+

   "YANG Example:<br> <br>"+

   "<code>&emsp;   list user {<br>"+
   " &emsp; &emsp;      key \"name\";<br>"+
   " &emsp; &emsp;      leaf name {<br>"+
   " &emsp; &emsp; &emsp;         type string;<br>"+
   " &emsp; &emsp;     }<br>"+
   " &emsp; &emsp;     leaf full-name {<br>"+
   " &emsp; &emsp; &emsp;        type string;<br>"+
   " &emsp; &emsp;     }<br>"+
   " &emsp; &emsp;      leaf class {<br>"+
   " &emsp; &emsp; &emsp;    type string;<br>"+
   " &emsp; &emsp;      }<br>"+
   " &emsp;  }</code>";
        }
        else if(o instanceof TypedefStatement) {
        	return "  YANG can define derived types from base types using the \"typedef\"<br>"+
   "statement.  A base type can be either a built-in type or a derived<br>"+
   "type, allowing a hierarchy of derived types.<br>"+
   "A derived type can be used as the argument for the \"type\" statement.<br> <br>"+

   "YANG Example:<br> <br>"+

     "<code>  &emsp; typedef percent {<br>"+
         " &emsp; &emsp; type uint8 {<br>"+
        "  &emsp;  &emsp;  &emsp;     range \"0 .. 100\";<br>"+
       "  &emsp;  &emsp;  }<br>"+
      "   &emsp;  &emsp;  description \"Percentage\";<br>"+
     " &emsp; }<br> <br>"+

     " &emsp; leaf completed {<br>"+
      "   &emsp;  &emsp;  type percent;<br>"+
     " &emsp; }</code>";

        }
        else if(o instanceof GroupingStatement) {
        	return "Groups of nodes can be assembled into reusable collections using the<br>"+
        			"\"grouping\" statement.  A grouping defines a set of nodes that are<br>"+
        			"instantiated with the \"uses\" statement:<br>"+

" &emsp;  <code>grouping target {<br>"+
" &emsp; &emsp;   leaf address {<br>"+
" &emsp; &emsp; &emsp;      type inet:ip-address;<br>"+
" &emsp; &emsp; &emsp;     description \"Target IP address\";<br>"+
" &emsp; &emsp; }<br>"+
" &emsp; &emsp; leaf port {<br>"+
" &emsp; &emsp; &emsp;     type inet:port-number;<br>"+
" &emsp; &emsp; &emsp;     description \"Target port number\";<br>"+
" &emsp; &emsp;  }<br>"+
" &emsp;  }<br>"+

" &emsp; container peer {<br>"+
" &emsp; &emsp;     container destination {<br>"+
" &emsp; &emsp; &emsp;      uses target;<br>"+
" &emsp; &emsp;  }<br>"+
" &emsp;  }</code>";
        }
        else if(o instanceof ChoiceStatement) {
        	return "The \"choice\" statement contains a set of \"case\" statements that define<br>"+
   "sets of schema nodes that cannot appear together.  Each \"case\" may<br>"+
   "contain multiple nodes, but each node may appear in only one \"case\"<br>"+
   "under a \"choice\".<br> <br>"+
   
   "YANG Example:<br> <br>"+

	  "<code> &emsp;   container food {<br>"+
	  " &emsp; &emsp;   choice snack {<br>"+
	  " &emsp; &emsp; &emsp; case sports-arena {<br>"+
	  " &emsp; &emsp; &emsp; &emsp;     leaf pretzel {<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp;         type empty;<br>"+
	  " &emsp; &emsp; &emsp; &emsp;     }<br>"+
	  " &emsp; &emsp; &emsp; &emsp;     leaf beer {<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp;        type empty;<br>"+
	  " &emsp; &emsp; &emsp; &emsp;      }<br>"+
	  " &emsp; &emsp; &emsp;  }<br>"+
	  " &emsp; &emsp; &emsp;  case late-night {<br>"+
	  " &emsp; &emsp; &emsp; &emsp;    leaf chocolate {<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp;        type enumeration {<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;            enum dark;<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;            enum milk;<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp; &emsp;            enum first-available;<br>"+
	  " &emsp; &emsp; &emsp; &emsp; &emsp;        }<br>"+
	  " &emsp; &emsp; &emsp; &emsp;    }<br>"+
	  " &emsp; &emsp; &emsp; }<br>"+
	  " &emsp; &emsp;}<br>"+
	  " &emsp;}</code>";
        }
        else if(o instanceof AugmentStatement) {
        	return "The \"augment\" statement defines the location in the data model<br>"+
   "hierarchy where new nodes are inserted, and the \"when\" statement<br>"+
   "defines the conditions when the new nodes are valid.<br> <br>"+
   "YANG Example:<br> <br>"+

	    "<code> &emsp; augment /system/login/user {<br>"+
	    " &emsp; &emsp;      when \"class != \'wheel\'\";<br>"+
	    " &emsp; &emsp; &emsp;     leaf uid {<br>"+
	    " &emsp; &emsp; &emsp; &emsp;  type uint16 {<br>"+
	    " &emsp; &emsp; &emsp; &emsp; &emsp;      range \"1000 .. 30000\";<br>"+
	    " &emsp; &emsp; &emsp; &emsp;   }<br>"+
	    " &emsp; &emsp; &emsp; }<br>"+
	    " &emsp; &emsp;  }<br>"+
	    " &emsp;   }</code>";
        }
        else if(o instanceof RpcStatement) {
        	return "YANG allows the definition of NETCONF RPCs.  The operations' names,<br>"+
   "input parameters, and output parameters are modeled using YANG data<br>"+
   "definition statements.<br> <br>"+
   
   "YANG Example:<br> <br>"+

	"<code>  &emsp; rpc activate-software-image {<br>"+
	" &emsp; &emsp;          input {<br>"+
	" &emsp; &emsp; &emsp;              leaf image-name {<br>"+
	" &emsp; &emsp; &emsp; &emsp;                  type string;<br>"+
	" &emsp; &emsp; &emsp;             }<br>"+
	" &emsp; &emsp;         }<br>"+
	" &emsp; &emsp;         output {<br>"+
	" &emsp; &emsp; &emsp;             leaf status {<br>"+
	" &emsp; &emsp; &emsp; &emsp;                 type string;<br>"+
	" &emsp; &emsp; &emsp;             }<br>"+
	" &emsp; &emsp;         }<br>"+
	" &emsp;     }</code>";
        }
        else if(o instanceof NotificationStatement) {
        	return "The \"notification\" statement is used to define a NETCONF<br>" +
   "notification.  It takes one argument, which is an identifier,<br>" +
   "followed by a block of substatements that holds detailed notification<br>" +
   "information.<br> <br>" +
   
   "YANG Example:<br> <br>" +

	   "<code>&emsp; link-failure {<br>" +
	     "&emsp; &emsp;    description \"A link failure has been detected\";<br>" +
	     "&emsp; &emsp;     leaf if-name {<br>" +
	     "&emsp; &emsp; &emsp;   type leafref {<br>" +
	     "&emsp; &emsp; &emsp; &emsp;      path \"/interface/name\";<br>" +
	     "&emsp; &emsp; &emsp;  }<br>" +
	     "&emsp; &emsp; }<br>" +
	     "&emsp; &emsp; leaf if-admin-status {<br>" +
	     "&emsp; &emsp; &emsp;  type admin-status;<br>" +
	     "&emsp; &emsp;  }<br>" +
	     "&emsp; &emsp; leaf if-oper-status {<br>" +
	     "&emsp; &emsp; &emsp;  type oper-status;<br>" +
	     "&emsp; &emsp; }<br>" +
	     "&emsp; }</code>";
        
        }
        else if(o instanceof FeatureStatement) {
        	return "Features are instantiated through the \"if-feature\" statement<br> <br>"+
        "The \"feature\" statement is used to define a mechanism by which<br>" +
   "portions of the schema are marked as conditional. Schema nodes tagged with a feature <br>" +
   "are ignored by the device unless the device supports the given feature.  This<br>" +
   "allows portions of the YANG module to be conditional based on<br>" +
   "conditions on the device.  The model can represent the abilities of<br>" +
   "the device within the model, giving a richer model that allows for<br>" +
   "differing device abilities and roles.";
        }
        else if(o instanceof IdentityStatement) {
        	return "The \"identity\" statement is used to define a new globally unique,<br>" +
   "abstract, and untyped identity.  Its only purpose is to denote its<br>" +
   "name, semantics, and existence.  An identity can either be defined<br>" +
   "from scratch or derived from a base identity.  The identity\'s<br>" +
   "argument is an identifier that is the name of the identity.  It is<br>" +
   "followed by a block of substatements that holds detailed identity<br>" +
   "information.";


        }//extra template hover overs
        else if(o instanceof LeafListStatement) {
        	return "A module contains three types of statements: module-header<br>";
        }
        else if(o instanceof LeafListStatement) {
        	return "A module contains three types of statements: module-header<br>";
        }
        else if(o instanceof LeafListStatement) {
        	return "A module contains three types of statements: module-header<br>";
        }
        else if(o instanceof LeafListStatement) {
        	return "A module contains three types of statements: module-header<br>";
        }
        else if(o instanceof LeafListStatement) {
        	return "A module contains three types of statements: module-header<br>";
        }
        return null;
    }
 
}