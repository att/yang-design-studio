/**
 */
package yang.manager.yang;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see yang.manager.yang.YangFactory
 * @model kind="package"
 * @generated
 */
public interface YangPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "yang";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/editor/yang/Yang";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "yang";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  YangPackage eINSTANCE = yang.manager.yang.impl.YangPackageImpl.init();

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.YangFileImpl <em>File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.YangFileImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getYangFile()
   * @generated
   */
  int YANG_FILE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_FILE__NAME = 0;

  /**
   * The number of structural features of the '<em>File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_FILE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ModuleImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getModule()
   * @generated
   */
  int MODULE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = YANG_FILE__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__STATEMENTS = YANG_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = YANG_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ModuleStatementImpl <em>Module Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ModuleStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getModuleStatement()
   * @generated
   */
  int MODULE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>Module Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.SubModuleImpl <em>Sub Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.SubModuleImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getSubModule()
   * @generated
   */
  int SUB_MODULE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MODULE__NAME = YANG_FILE__NAME;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MODULE__STATEMENTS = YANG_FILE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sub Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_MODULE_FEATURE_COUNT = YANG_FILE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.SubmoduleStatementImpl <em>Submodule Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.SubmoduleStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getSubmoduleStatement()
   * @generated
   */
  int SUBMODULE_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Submodule Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUBMODULE_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DatadefStatementImpl <em>Datadef Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DatadefStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDatadefStatement()
   * @generated
   */
  int DATADEF_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Datadef Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATADEF_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.YangVersionStatementImpl <em>Version Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.YangVersionStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getYangVersionStatement()
   * @generated
   */
  int YANG_VERSION_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_VERSION_STATEMENT__VERSION = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Yangversionunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Version Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YANG_VERSION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.OrganizationStatementImpl <em>Organization Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.OrganizationStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getOrganizationStatement()
   * @generated
   */
  int ORGANIZATION_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Organization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_STATEMENT__ORGANIZATION = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Organizationunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Organization Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ContactStatementImpl <em>Contact Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ContactStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getContactStatement()
   * @generated
   */
  int CONTACT_STATEMENT = 8;

  /**
   * The feature id for the '<em><b>Contact</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_STATEMENT__CONTACT = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Contactunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Contact Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTACT_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DescriptionStatementImpl <em>Description Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DescriptionStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDescriptionStatement()
   * @generated
   */
  int DESCRIPTION_STATEMENT = 9;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_STATEMENT__DESCRIPTION = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Descriptionunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_STATEMENT__DESCRIPTIONUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Description Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.MultipleSubstatementImpl <em>Multiple Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.MultipleSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getMultipleSubstatement()
   * @generated
   */
  int MULTIPLE_SUBSTATEMENT = 41;

  /**
   * The number of structural features of the '<em>Multiple Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ReferenceStatementImpl <em>Reference Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ReferenceStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getReferenceStatement()
   * @generated
   */
  int REFERENCE_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATEMENT__REFERENCE = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Referenceunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_STATEMENT_FEATURE_COUNT = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.NamespaceStatementImpl <em>Namespace Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.NamespaceStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getNamespaceStatement()
   * @generated
   */
  int NAMESPACE_STATEMENT = 11;

  /**
   * The feature id for the '<em><b>Uri</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_STATEMENT__URI = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namespaceunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Namespace Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.PrefixStatementImpl <em>Prefix Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.PrefixStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getPrefixStatement()
   * @generated
   */
  int PREFIX_STATEMENT = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Prefixunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATEMENT__PREFIXUNKNOWNSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Prefix Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.TypeSubStatementImpl <em>Type Sub Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.TypeSubStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getTypeSubStatement()
   * @generated
   */
  int TYPE_SUB_STATEMENT = 90;

  /**
   * The number of structural features of the '<em>Type Sub Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SUB_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RequireInstanceStatementImpl <em>Require Instance Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RequireInstanceStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRequireInstanceStatement()
   * @generated
   */
  int REQUIRE_INSTANCE_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Require</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_INSTANCE_STATEMENT__REQUIRE = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Requireunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Require Instance Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRE_INSTANCE_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.PathStatementImpl <em>Path Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.PathStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getPathStatement()
   * @generated
   */
  int PATH_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_STATEMENT__PATH = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pathunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_STATEMENT__PATHUNKNOWNSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Path Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.BitSubstatementImpl <em>Bit Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.BitSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getBitSubstatement()
   * @generated
   */
  int BIT_SUBSTATEMENT = 92;

  /**
   * The number of structural features of the '<em>Bit Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.PositionStatementImpl <em>Position Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.PositionStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getPositionStatement()
   * @generated
   */
  int POSITION_STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Intarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_STATEMENT__INTARG = BIT_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Positionunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_STATEMENT__POSITIONUNKNOWNSTATEMENTS = BIT_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Position Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_STATEMENT_FEATURE_COUNT = BIT_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.EnumSubstatementImpl <em>Enum Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.EnumSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getEnumSubstatement()
   * @generated
   */
  int ENUM_SUBSTATEMENT = 94;

  /**
   * The number of structural features of the '<em>Enum Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ValueStatementImpl <em>Value Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ValueStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getValueStatement()
   * @generated
   */
  int VALUE_STATEMENT = 16;

  /**
   * The feature id for the '<em><b>Intarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STATEMENT__INTARG = ENUM_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Valueunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS = ENUM_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Value Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STATEMENT_FEATURE_COUNT = ENUM_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ErrorAppTagStatementImpl <em>Error App Tag Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ErrorAppTagStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getErrorAppTagStatement()
   * @generated
   */
  int ERROR_APP_TAG_STATEMENT = 17;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_APP_TAG_STATEMENT__ARG = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Erroraunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_APP_TAG_STATEMENT__ERRORAUNKNOWNSTATEMENTS = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error App Tag Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_APP_TAG_STATEMENT_FEATURE_COUNT = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ErrorMessageStatementImpl <em>Error Message Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ErrorMessageStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getErrorMessageStatement()
   * @generated
   */
  int ERROR_MESSAGE_STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_STATEMENT__ARG = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Errormunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_STATEMENT__ERRORMUNKNOWNSTATEMENTS = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Message Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_MESSAGE_STATEMENT_FEATURE_COUNT = MULTIPLE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.LeafSubstatementImpl <em>Leaf Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.LeafSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getLeafSubstatement()
   * @generated
   */
  int LEAF_SUBSTATEMENT = 57;

  /**
   * The number of structural features of the '<em>Leaf Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.UnitsStatementImpl <em>Units Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.UnitsStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getUnitsStatement()
   * @generated
   */
  int UNITS_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNITS_STATEMENT__ARG = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unitsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNITS_STATEMENT__UNITSUNKNOWNSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Units Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNITS_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DefaultStatementImpl <em>Default Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DefaultStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDefaultStatement()
   * @generated
   */
  int DEFAULT_STATEMENT = 20;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT__ARG = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Defaultunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT__DEFAULTUNKNOWNSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Default Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RpcSubstatementImpl <em>Rpc Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RpcSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRpcSubstatement()
   * @generated
   */
  int RPC_SUBSTATEMENT = 43;

  /**
   * The number of structural features of the '<em>Rpc Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.StatusStatementImpl <em>Status Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.StatusStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getStatusStatement()
   * @generated
   */
  int STATUS_STATEMENT = 21;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATEMENT__STATUS = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statusunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATEMENT__STATUSUNKNOWNSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Status Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATUS_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ImportSubstatementsImpl <em>Import Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ImportSubstatementsImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getImportSubstatements()
   * @generated
   */
  int IMPORT_SUBSTATEMENTS = 96;

  /**
   * The number of structural features of the '<em>Import Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RevisionDateStatementImpl <em>Revision Date Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RevisionDateStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRevisionDateStatement()
   * @generated
   */
  int REVISION_DATE_STATEMENT = 22;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_DATE_STATEMENT__DATE = IMPORT_SUBSTATEMENTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Revisiondateunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_DATE_STATEMENT__REVISIONDATEUNKNOWNSTATEMENTS = IMPORT_SUBSTATEMENTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Revision Date Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_DATE_STATEMENT_FEATURE_COUNT = IMPORT_SUBSTATEMENTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ListSubstatementImpl <em>List Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ListSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getListSubstatement()
   * @generated
   */
  int LIST_SUBSTATEMENT = 53;

  /**
   * The number of structural features of the '<em>List Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.UniqueStatementImpl <em>Unique Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.UniqueStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getUniqueStatement()
   * @generated
   */
  int UNIQUE_STATEMENT = 23;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Uniqueunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_STATEMENT__UNIQUEUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Unique Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.KeyStatementImpl <em>Key Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.KeyStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getKeyStatement()
   * @generated
   */
  int KEY_STATEMENT = 24;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Keyunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_STATEMENT__KEYUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Key Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.OrderedbyStatementImpl <em>Orderedby Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.OrderedbyStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getOrderedbyStatement()
   * @generated
   */
  int ORDEREDBY_STATEMENT = 25;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDEREDBY_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Orderedbyunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDEREDBY_STATEMENT__ORDEREDBYUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Orderedby Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORDEREDBY_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ContainerSubstatementImpl <em>Container Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ContainerSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getContainerSubstatement()
   * @generated
   */
  int CONTAINER_SUBSTATEMENT = 51;

  /**
   * The number of structural features of the '<em>Container Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.PresenceStatementImpl <em>Presence Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.PresenceStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getPresenceStatement()
   * @generated
   */
  int PRESENCE_STATEMENT = 26;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_STATEMENT__ARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Presenceunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_STATEMENT__PRESENCEUNKNOWNSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Presence Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENCE_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.MandatoryStatementImpl <em>Mandatory Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.MandatoryStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getMandatoryStatement()
   * @generated
   */
  int MANDATORY_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_STATEMENT__BOOLARG = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mandatoryunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_STATEMENT__MANDATORYUNKNOWNSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mandatory Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ConfigStatementImpl <em>Config Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ConfigStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getConfigStatement()
   * @generated
   */
  int CONFIG_STATEMENT = 28;

  /**
   * The feature id for the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_STATEMENT__BOOLARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Configunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Config Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.FractionDigitsStatementImpl <em>Fraction Digits Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.FractionDigitsStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getFractionDigitsStatement()
   * @generated
   */
  int FRACTION_DIGITS_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_DIGITS_STATEMENT__ARG = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fractiondigitsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_DIGITS_STATEMENT__FRACTIONDIGITSUNKNOWNSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fraction Digits Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FRACTION_DIGITS_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.IfFeatureStatementImpl <em>If Feature Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.IfFeatureStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getIfFeatureStatement()
   * @generated
   */
  int IF_FEATURE_STATEMENT = 30;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT__PREF = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Ident</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT__IDENT = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Iffeatureunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Feature Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_FEATURE_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.IdentitySubstatementImpl <em>Identity Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.IdentitySubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getIdentitySubstatement()
   * @generated
   */
  int IDENTITY_SUBSTATEMENT = 82;

  /**
   * The number of structural features of the '<em>Identity Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.BaseStatementImpl <em>Base Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.BaseStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getBaseStatement()
   * @generated
   */
  int BASE_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT__BASE = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Baseunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT__BASEUNKNOWNSTATEMENTS = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Base Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_STATEMENT_FEATURE_COUNT = IDENTITY_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ArgumentSubstatementImpl <em>Argument Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ArgumentSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getArgumentSubstatement()
   * @generated
   */
  int ARGUMENT_SUBSTATEMENT = 80;

  /**
   * The number of structural features of the '<em>Argument Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.YinElementStatementImpl <em>Yin Element Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.YinElementStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getYinElementStatement()
   * @generated
   */
  int YIN_ELEMENT_STATEMENT = 32;

  /**
   * The feature id for the '<em><b>Boolarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YIN_ELEMENT_STATEMENT__BOOLARG = ARGUMENT_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Yinelementunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YIN_ELEMENT_STATEMENT__YINELEMENTUNKNOWNSTATEMENTS = ARGUMENT_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Yin Element Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int YIN_ELEMENT_STATEMENT_FEATURE_COUNT = ARGUMENT_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.MinElementsStatementImpl <em>Min Elements Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.MinElementsStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getMinElementsStatement()
   * @generated
   */
  int MIN_ELEMENTS_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_ELEMENTS_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Minelementsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Min Elements Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MIN_ELEMENTS_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.MaxElementsStatementImpl <em>Max Elements Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.MaxElementsStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getMaxElementsStatement()
   * @generated
   */
  int MAX_ELEMENTS_STATEMENT = 34;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_ELEMENTS_STATEMENT__ARG = LIST_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Maxelementsunknownstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_ELEMENTS_STATEMENT__MAXELEMENTSUNKNOWNSTATEMENTS = LIST_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Max Elements Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAX_ELEMENTS_STATEMENT_FEATURE_COUNT = LIST_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.UnknownStatementImpl <em>Unknown Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.UnknownStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getUnknownStatement()
   * @generated
   */
  int UNKNOWN_STATEMENT = 35;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__PREF = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Namestat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__NAMESTAT = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__ARGUMENT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Unknownsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT__UNKNOWNSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Unknown Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.UnknownSubstatementsImpl <em>Unknown Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.UnknownSubstatementsImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getUnknownSubstatements()
   * @generated
   */
  int UNKNOWN_SUBSTATEMENTS = 36;

  /**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__PREF = 0;

  /**
   * The feature id for the '<em><b>Namestat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__NAMESTAT = 1;

  /**
   * The feature id for the '<em><b>Argument</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__ARGUMENT = 2;

  /**
   * The feature id for the '<em><b>Unknownsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS = 3;

  /**
   * The number of structural features of the '<em>Unknown Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_SUBSTATEMENTS_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RangeStatementImpl <em>Range Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RangeStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRangeStatement()
   * @generated
   */
  int RANGE_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Range</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_STATEMENT__RANGE = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rangesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_STATEMENT__RANGESUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Range Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RANGE_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.PatternStatementImpl <em>Pattern Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.PatternStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getPatternStatement()
   * @generated
   */
  int PATTERN_STATEMENT = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_STATEMENT__NAME = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Patternsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_STATEMENT__PATTERNSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Pattern Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.LengthStatementImpl <em>Length Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.LengthStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getLengthStatement()
   * @generated
   */
  int LENGTH_STATEMENT = 39;

  /**
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_STATEMENT__LENGTH = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Lengthsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_STATEMENT__LENGTHSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Length Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LENGTH_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.MustStatementImpl <em>Must Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.MustStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getMustStatement()
   * @generated
   */
  int MUST_STATEMENT = 40;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_STATEMENT__ARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Mustsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_STATEMENT__MUSTSUBSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Must Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUST_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RpcStatementImpl <em>Rpc Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RpcStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRpcStatement()
   * @generated
   */
  int RPC_STATEMENT = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rpcsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_STATEMENT__RPCSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rpc Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RPC_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.InputStatementImpl <em>Input Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.InputStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getInputStatement()
   * @generated
   */
  int INPUT_STATEMENT = 44;

  /**
   * The feature id for the '<em><b>Inputsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT__INPUTSUBSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Input Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.InputSubstatementImpl <em>Input Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.InputSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getInputSubstatement()
   * @generated
   */
  int INPUT_SUBSTATEMENT = 45;

  /**
   * The number of structural features of the '<em>Input Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.OutputStatementImpl <em>Output Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.OutputStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getOutputStatement()
   * @generated
   */
  int OUTPUT_STATEMENT = 46;

  /**
   * The feature id for the '<em><b>Outputsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS = RPC_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Output Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_STATEMENT_FEATURE_COUNT = RPC_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.OutputSubstatementImpl <em>Output Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.OutputSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getOutputSubstatement()
   * @generated
   */
  int OUTPUT_SUBSTATEMENT = 47;

  /**
   * The number of structural features of the '<em>Output Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.NotificationStatementImpl <em>Notification Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.NotificationStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getNotificationStatement()
   * @generated
   */
  int NOTIFICATION_STATEMENT = 48;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Notificationsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_STATEMENT__NOTIFICATIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Notification Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.NotificationSubstatementImpl <em>Notification Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.NotificationSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getNotificationSubstatement()
   * @generated
   */
  int NOTIFICATION_SUBSTATEMENT = 49;

  /**
   * The number of structural features of the '<em>Notification Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTIFICATION_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ContainerStatementImpl <em>Container Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ContainerStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getContainerStatement()
   * @generated
   */
  int CONTAINER_STATEMENT = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Containersubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STATEMENT__CONTAINERSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Container Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ListStatementImpl <em>List Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ListStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getListStatement()
   * @generated
   */
  int LIST_STATEMENT = 52;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Listsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATEMENT__LISTSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.GroupingStatementImpl <em>Grouping Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.GroupingStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getGroupingStatement()
   * @generated
   */
  int GROUPING_STATEMENT = 54;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Groupingsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_STATEMENT__GROUPINGSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Grouping Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.GroupingSubstatementImpl <em>Grouping Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.GroupingSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getGroupingSubstatement()
   * @generated
   */
  int GROUPING_SUBSTATEMENT = 55;

  /**
   * The number of structural features of the '<em>Grouping Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.LeafStatementImpl <em>Leaf Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.LeafStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getLeafStatement()
   * @generated
   */
  int LEAF_STATEMENT = 56;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Leafsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_STATEMENT__LEAFSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Leaf Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.LeafListStatementImpl <em>Leaf List Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.LeafListStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getLeafListStatement()
   * @generated
   */
  int LEAF_LIST_STATEMENT = 58;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_STATEMENT__ARG = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Leaflistsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Leaf List Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.LeafListSubstatementImpl <em>Leaf List Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.LeafListSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getLeafListSubstatement()
   * @generated
   */
  int LEAF_LIST_SUBSTATEMENT = 59;

  /**
   * The number of structural features of the '<em>Leaf List Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LEAF_LIST_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ChoiceStatementImpl <em>Choice Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ChoiceStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getChoiceStatement()
   * @generated
   */
  int CHOICE_STATEMENT = 60;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_STATEMENT__NAME = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Choicesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_STATEMENT__CHOICESUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Choice Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ChoiceSubstatementImpl <em>Choice Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ChoiceSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getChoiceSubstatement()
   * @generated
   */
  int CHOICE_SUBSTATEMENT = 61;

  /**
   * The number of structural features of the '<em>Choice Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHOICE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.CaseStatementImpl <em>Case Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.CaseStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getCaseStatement()
   * @generated
   */
  int CASE_STATEMENT = 62;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__NAME = CHOICE_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Casesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT__CASESUBSTATEMENTS = CHOICE_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_STATEMENT_FEATURE_COUNT = CHOICE_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.CaseSubstatementImpl <em>Case Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.CaseSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getCaseSubstatement()
   * @generated
   */
  int CASE_SUBSTATEMENT = 63;

  /**
   * The number of structural features of the '<em>Case Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CASE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.AnyxmlStatementImpl <em>Anyxml Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.AnyxmlStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getAnyxmlStatement()
   * @generated
   */
  int ANYXML_STATEMENT = 64;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_STATEMENT__ARG = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Anyxmlsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anyxml Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.AnyxmlSubstatementImpl <em>Anyxml Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.AnyxmlSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getAnyxmlSubstatement()
   * @generated
   */
  int ANYXML_SUBSTATEMENT = 65;

  /**
   * The number of structural features of the '<em>Anyxml Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANYXML_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.UsesStatementImpl <em>Uses Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.UsesStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getUsesStatement()
   * @generated
   */
  int USES_STATEMENT = 66;

  /**
   * The feature id for the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT__PRE = DATADEF_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT__ARG = DATADEF_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Usessubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT__USESSUBSTATEMENTS = DATADEF_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Uses Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_STATEMENT_FEATURE_COUNT = DATADEF_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.UsesSubstatementImpl <em>Uses Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.UsesSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getUsesSubstatement()
   * @generated
   */
  int USES_SUBSTATEMENT = 67;

  /**
   * The number of structural features of the '<em>Uses Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USES_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.AugmentUsesStatementImpl <em>Augment Uses Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.AugmentUsesStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getAugmentUsesStatement()
   * @generated
   */
  int AUGMENT_USES_STATEMENT = 68;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_USES_STATEMENT__ARG = USES_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Augmentsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS = USES_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Augment Uses Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_USES_STATEMENT_FEATURE_COUNT = USES_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.AugmentStatementImpl <em>Augment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.AugmentStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getAugmentStatement()
   * @generated
   */
  int AUGMENT_STATEMENT = 69;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_STATEMENT__ARG = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Augmentsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_STATEMENT__AUGMENTSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Augment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.AugmentSubstatementImpl <em>Augment Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.AugmentSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getAugmentSubstatement()
   * @generated
   */
  int AUGMENT_SUBSTATEMENT = 70;

  /**
   * The number of structural features of the '<em>Augment Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUGMENT_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RefineStatementImpl <em>Refine Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RefineStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRefineStatement()
   * @generated
   */
  int REFINE_STATEMENT = 71;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_STATEMENT__ARG = USES_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refinesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_STATEMENT__REFINESUBSTATEMENTS = USES_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Refine Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_STATEMENT_FEATURE_COUNT = USES_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RefineSubstatementImpl <em>Refine Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RefineSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRefineSubstatement()
   * @generated
   */
  int REFINE_SUBSTATEMENT = 72;

  /**
   * The number of structural features of the '<em>Refine Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DeviationStatementImpl <em>Deviation Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DeviationStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDeviationStatement()
   * @generated
   */
  int DEVIATION_STATEMENT = 73;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_STATEMENT__ARG = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deviationsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_STATEMENT__DEVIATIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Deviation Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DeviationSubstatementImpl <em>Deviation Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DeviationSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDeviationSubstatement()
   * @generated
   */
  int DEVIATION_SUBSTATEMENT = 74;

  /**
   * The number of structural features of the '<em>Deviation Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATION_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DeviateStatementImpl <em>Deviate Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DeviateStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDeviateStatement()
   * @generated
   */
  int DEVIATE_STATEMENT = 75;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_STATEMENT__ARG = DEVIATION_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Deviatesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_STATEMENT__DEVIATESUBSTATEMENTS = DEVIATION_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Deviate Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_STATEMENT_FEATURE_COUNT = DEVIATION_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.DeviateSubstatementImpl <em>Deviate Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.DeviateSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getDeviateSubstatement()
   * @generated
   */
  int DEVIATE_SUBSTATEMENT = 76;

  /**
   * The number of structural features of the '<em>Deviate Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEVIATE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ExtensionStatementImpl <em>Extension Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ExtensionStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getExtensionStatement()
   * @generated
   */
  int EXTENSION_STATEMENT = 77;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_STATEMENT__ARG = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extensionsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_STATEMENT__EXTENSIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extension Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ExtensionSubstatementImpl <em>Extension Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ExtensionSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getExtensionSubstatement()
   * @generated
   */
  int EXTENSION_SUBSTATEMENT = 78;

  /**
   * The number of structural features of the '<em>Extension Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTENSION_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ArgumentStatementImpl <em>Argument Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ArgumentStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getArgumentStatement()
   * @generated
   */
  int ARGUMENT_STATEMENT = 79;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STATEMENT__ARG = EXTENSION_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Argumentsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STATEMENT__ARGUMENTSUBSTATEMENTS = EXTENSION_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Argument Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_STATEMENT_FEATURE_COUNT = EXTENSION_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.IdentityStatementImpl <em>Identity Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.IdentityStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getIdentityStatement()
   * @generated
   */
  int IDENTITY_STATEMENT = 81;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Identitysubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STATEMENT__IDENTITYSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Identity Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDENTITY_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.FeatureStatementImpl <em>Feature Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.FeatureStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getFeatureStatement()
   * @generated
   */
  int FEATURE_STATEMENT = 83;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Featuresubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_STATEMENT__FEATURESUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.FeatureSubstatementImpl <em>Feature Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.FeatureSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getFeatureSubstatement()
   * @generated
   */
  int FEATURE_SUBSTATEMENT = 84;

  /**
   * The number of structural features of the '<em>Feature Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.BelongsToStatementImpl <em>Belongs To Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.BelongsToStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getBelongsToStatement()
   * @generated
   */
  int BELONGS_TO_STATEMENT = 85;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_STATEMENT__NAME = SUBMODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Belongstosubstatement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT = SUBMODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Belongs To Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_STATEMENT_FEATURE_COUNT = SUBMODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.BelongsToSubstatementImpl <em>Belongs To Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.BelongsToSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getBelongsToSubstatement()
   * @generated
   */
  int BELONGS_TO_SUBSTATEMENT = 86;

  /**
   * The number of structural features of the '<em>Belongs To Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BELONGS_TO_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.TypedefStatementImpl <em>Typedef Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.TypedefStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getTypedefStatement()
   * @generated
   */
  int TYPEDEF_STATEMENT = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_STATEMENT__NAME = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Typedefsubstatemnet</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_STATEMENT__TYPEDEFSUBSTATEMNET = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typedef Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.TypedefSubstatementImpl <em>Typedef Substatement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.TypedefSubstatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getTypedefSubstatement()
   * @generated
   */
  int TYPEDEF_SUBSTATEMENT = 88;

  /**
   * The number of structural features of the '<em>Typedef Substatement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPEDEF_SUBSTATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.TypeStatementImpl <em>Type Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.TypeStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getTypeStatement()
   * @generated
   */
  int TYPE_STATEMENT = 89;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__TYPE = LEAF_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__PRE = LEAF_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Importtype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__IMPORTTYPE = LEAF_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Typesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT__TYPESUBSTATEMENTS = LEAF_SUBSTATEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Type Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_STATEMENT_FEATURE_COUNT = LEAF_SUBSTATEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.BitStatementImpl <em>Bit Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.BitStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getBitStatement()
   * @generated
   */
  int BIT_STATEMENT = 91;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STATEMENT__NAME = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Bitsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STATEMENT__BITSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Bit Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.EnumStatementImpl <em>Enum Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.EnumStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getEnumStatement()
   * @generated
   */
  int ENUM_STATEMENT = 93;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STATEMENT__NAME = TYPE_SUB_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Enumsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STATEMENT__ENUMSUBSTATEMENTS = TYPE_SUB_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_STATEMENT_FEATURE_COUNT = TYPE_SUB_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.ImportStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getImportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 95;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORT_URI = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Importsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORTSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.IncludeStatementImpl <em>Include Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.IncludeStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getIncludeStatement()
   * @generated
   */
  int INCLUDE_STATEMENT = 97;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT__IMPORT_URI = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Includesubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Include Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.IncludeSubstatementsImpl <em>Include Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.IncludeSubstatementsImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getIncludeSubstatements()
   * @generated
   */
  int INCLUDE_SUBSTATEMENTS = 98;

  /**
   * The number of structural features of the '<em>Include Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.WhenStatementImpl <em>When Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.WhenStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getWhenStatement()
   * @generated
   */
  int WHEN_STATEMENT = 99;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STATEMENT__ARG = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Whensubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STATEMENT__WHENSUBSTATEMENTS = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>When Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_STATEMENT_FEATURE_COUNT = CONTAINER_SUBSTATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.WhenSubstatementsImpl <em>When Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.WhenSubstatementsImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getWhenSubstatements()
   * @generated
   */
  int WHEN_SUBSTATEMENTS = 100;

  /**
   * The number of structural features of the '<em>When Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHEN_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RevisionStatementImpl <em>Revision Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RevisionStatementImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRevisionStatement()
   * @generated
   */
  int REVISION_STATEMENT = 101;

  /**
   * The feature id for the '<em><b>Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_STATEMENT__DATE = MODULE_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Revisionsubstatements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_STATEMENT__REVISIONSUBSTATEMENTS = MODULE_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Revision Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_STATEMENT_FEATURE_COUNT = MODULE_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.RevisionSubstatementsImpl <em>Revision Substatements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.RevisionSubstatementsImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getRevisionSubstatements()
   * @generated
   */
  int REVISION_SUBSTATEMENTS = 102;

  /**
   * The number of structural features of the '<em>Revision Substatements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REVISION_SUBSTATEMENTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link yang.manager.yang.impl.BuiltInTypeImpl <em>Built In Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see yang.manager.yang.impl.BuiltInTypeImpl
   * @see yang.manager.yang.impl.YangPackageImpl#getBuiltInType()
   * @generated
   */
  int BUILT_IN_TYPE = 103;

  /**
   * The feature id for the '<em><b>Btype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE__BTYPE = 0;

  /**
   * The number of structural features of the '<em>Built In Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUILT_IN_TYPE_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link yang.manager.yang.YangFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File</em>'.
   * @see yang.manager.yang.YangFile
   * @generated
   */
  EClass getYangFile();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.YangFile#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.YangFile#getName()
   * @see #getYangFile()
   * @generated
   */
  EAttribute getYangFile_Name();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see yang.manager.yang.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.Module#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see yang.manager.yang.Module#getStatements()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Statements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ModuleStatement <em>Module Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module Statement</em>'.
   * @see yang.manager.yang.ModuleStatement
   * @generated
   */
  EClass getModuleStatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.SubModule <em>Sub Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Module</em>'.
   * @see yang.manager.yang.SubModule
   * @generated
   */
  EClass getSubModule();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.SubModule#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see yang.manager.yang.SubModule#getStatements()
   * @see #getSubModule()
   * @generated
   */
  EReference getSubModule_Statements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.SubmoduleStatement <em>Submodule Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Submodule Statement</em>'.
   * @see yang.manager.yang.SubmoduleStatement
   * @generated
   */
  EClass getSubmoduleStatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DatadefStatement <em>Datadef Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datadef Statement</em>'.
   * @see yang.manager.yang.DatadefStatement
   * @generated
   */
  EClass getDatadefStatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.YangVersionStatement <em>Version Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Version Statement</em>'.
   * @see yang.manager.yang.YangVersionStatement
   * @generated
   */
  EClass getYangVersionStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.YangVersionStatement#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see yang.manager.yang.YangVersionStatement#getVersion()
   * @see #getYangVersionStatement()
   * @generated
   */
  EAttribute getYangVersionStatement_Version();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.YangVersionStatement#getYangversionunknownstatements <em>Yangversionunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Yangversionunknownstatements</em>'.
   * @see yang.manager.yang.YangVersionStatement#getYangversionunknownstatements()
   * @see #getYangVersionStatement()
   * @generated
   */
  EReference getYangVersionStatement_Yangversionunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.OrganizationStatement <em>Organization Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organization Statement</em>'.
   * @see yang.manager.yang.OrganizationStatement
   * @generated
   */
  EClass getOrganizationStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.OrganizationStatement#getOrganization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Organization</em>'.
   * @see yang.manager.yang.OrganizationStatement#getOrganization()
   * @see #getOrganizationStatement()
   * @generated
   */
  EAttribute getOrganizationStatement_Organization();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.OrganizationStatement#getOrganizationunknownstatements <em>Organizationunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Organizationunknownstatements</em>'.
   * @see yang.manager.yang.OrganizationStatement#getOrganizationunknownstatements()
   * @see #getOrganizationStatement()
   * @generated
   */
  EReference getOrganizationStatement_Organizationunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ContactStatement <em>Contact Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contact Statement</em>'.
   * @see yang.manager.yang.ContactStatement
   * @generated
   */
  EClass getContactStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ContactStatement#getContact <em>Contact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Contact</em>'.
   * @see yang.manager.yang.ContactStatement#getContact()
   * @see #getContactStatement()
   * @generated
   */
  EAttribute getContactStatement_Contact();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ContactStatement#getContactunknownstatements <em>Contactunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contactunknownstatements</em>'.
   * @see yang.manager.yang.ContactStatement#getContactunknownstatements()
   * @see #getContactStatement()
   * @generated
   */
  EReference getContactStatement_Contactunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DescriptionStatement <em>Description Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Statement</em>'.
   * @see yang.manager.yang.DescriptionStatement
   * @generated
   */
  EClass getDescriptionStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.DescriptionStatement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see yang.manager.yang.DescriptionStatement#getDescription()
   * @see #getDescriptionStatement()
   * @generated
   */
  EAttribute getDescriptionStatement_Description();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.DescriptionStatement#getDescriptionunknownstatements <em>Descriptionunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Descriptionunknownstatements</em>'.
   * @see yang.manager.yang.DescriptionStatement#getDescriptionunknownstatements()
   * @see #getDescriptionStatement()
   * @generated
   */
  EReference getDescriptionStatement_Descriptionunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ReferenceStatement <em>Reference Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Statement</em>'.
   * @see yang.manager.yang.ReferenceStatement
   * @generated
   */
  EClass getReferenceStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ReferenceStatement#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see yang.manager.yang.ReferenceStatement#getReference()
   * @see #getReferenceStatement()
   * @generated
   */
  EAttribute getReferenceStatement_Reference();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ReferenceStatement#getReferenceunknownstatements <em>Referenceunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Referenceunknownstatements</em>'.
   * @see yang.manager.yang.ReferenceStatement#getReferenceunknownstatements()
   * @see #getReferenceStatement()
   * @generated
   */
  EReference getReferenceStatement_Referenceunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.NamespaceStatement <em>Namespace Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace Statement</em>'.
   * @see yang.manager.yang.NamespaceStatement
   * @generated
   */
  EClass getNamespaceStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.NamespaceStatement#getUri <em>Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Uri</em>'.
   * @see yang.manager.yang.NamespaceStatement#getUri()
   * @see #getNamespaceStatement()
   * @generated
   */
  EAttribute getNamespaceStatement_Uri();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.NamespaceStatement#getNamespaceunknownstatements <em>Namespaceunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaceunknownstatements</em>'.
   * @see yang.manager.yang.NamespaceStatement#getNamespaceunknownstatements()
   * @see #getNamespaceStatement()
   * @generated
   */
  EReference getNamespaceStatement_Namespaceunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.PrefixStatement <em>Prefix Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Statement</em>'.
   * @see yang.manager.yang.PrefixStatement
   * @generated
   */
  EClass getPrefixStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.PrefixStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.PrefixStatement#getName()
   * @see #getPrefixStatement()
   * @generated
   */
  EAttribute getPrefixStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.PrefixStatement#getPrefixunknownstatements <em>Prefixunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefixunknownstatements</em>'.
   * @see yang.manager.yang.PrefixStatement#getPrefixunknownstatements()
   * @see #getPrefixStatement()
   * @generated
   */
  EReference getPrefixStatement_Prefixunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RequireInstanceStatement <em>Require Instance Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Require Instance Statement</em>'.
   * @see yang.manager.yang.RequireInstanceStatement
   * @generated
   */
  EClass getRequireInstanceStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.RequireInstanceStatement#getRequire <em>Require</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Require</em>'.
   * @see yang.manager.yang.RequireInstanceStatement#getRequire()
   * @see #getRequireInstanceStatement()
   * @generated
   */
  EAttribute getRequireInstanceStatement_Require();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.RequireInstanceStatement#getRequireunknownstatements <em>Requireunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Requireunknownstatements</em>'.
   * @see yang.manager.yang.RequireInstanceStatement#getRequireunknownstatements()
   * @see #getRequireInstanceStatement()
   * @generated
   */
  EReference getRequireInstanceStatement_Requireunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.PathStatement <em>Path Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Statement</em>'.
   * @see yang.manager.yang.PathStatement
   * @generated
   */
  EClass getPathStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.PathStatement#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see yang.manager.yang.PathStatement#getPath()
   * @see #getPathStatement()
   * @generated
   */
  EAttribute getPathStatement_Path();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.PathStatement#getPathunknownstatements <em>Pathunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pathunknownstatements</em>'.
   * @see yang.manager.yang.PathStatement#getPathunknownstatements()
   * @see #getPathStatement()
   * @generated
   */
  EReference getPathStatement_Pathunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.PositionStatement <em>Position Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Statement</em>'.
   * @see yang.manager.yang.PositionStatement
   * @generated
   */
  EClass getPositionStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.PositionStatement#getIntarg <em>Intarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intarg</em>'.
   * @see yang.manager.yang.PositionStatement#getIntarg()
   * @see #getPositionStatement()
   * @generated
   */
  EAttribute getPositionStatement_Intarg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.PositionStatement#getPositionunknownstatements <em>Positionunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Positionunknownstatements</em>'.
   * @see yang.manager.yang.PositionStatement#getPositionunknownstatements()
   * @see #getPositionStatement()
   * @generated
   */
  EReference getPositionStatement_Positionunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ValueStatement <em>Value Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Statement</em>'.
   * @see yang.manager.yang.ValueStatement
   * @generated
   */
  EClass getValueStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ValueStatement#getIntarg <em>Intarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Intarg</em>'.
   * @see yang.manager.yang.ValueStatement#getIntarg()
   * @see #getValueStatement()
   * @generated
   */
  EAttribute getValueStatement_Intarg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ValueStatement#getValueunknownstatements <em>Valueunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Valueunknownstatements</em>'.
   * @see yang.manager.yang.ValueStatement#getValueunknownstatements()
   * @see #getValueStatement()
   * @generated
   */
  EReference getValueStatement_Valueunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ErrorAppTagStatement <em>Error App Tag Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error App Tag Statement</em>'.
   * @see yang.manager.yang.ErrorAppTagStatement
   * @generated
   */
  EClass getErrorAppTagStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ErrorAppTagStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.ErrorAppTagStatement#getArg()
   * @see #getErrorAppTagStatement()
   * @generated
   */
  EAttribute getErrorAppTagStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ErrorAppTagStatement#getErroraunknownstatements <em>Erroraunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Erroraunknownstatements</em>'.
   * @see yang.manager.yang.ErrorAppTagStatement#getErroraunknownstatements()
   * @see #getErrorAppTagStatement()
   * @generated
   */
  EReference getErrorAppTagStatement_Erroraunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ErrorMessageStatement <em>Error Message Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Message Statement</em>'.
   * @see yang.manager.yang.ErrorMessageStatement
   * @generated
   */
  EClass getErrorMessageStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ErrorMessageStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.ErrorMessageStatement#getArg()
   * @see #getErrorMessageStatement()
   * @generated
   */
  EAttribute getErrorMessageStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ErrorMessageStatement#getErrormunknownstatements <em>Errormunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Errormunknownstatements</em>'.
   * @see yang.manager.yang.ErrorMessageStatement#getErrormunknownstatements()
   * @see #getErrorMessageStatement()
   * @generated
   */
  EReference getErrorMessageStatement_Errormunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.UnitsStatement <em>Units Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Units Statement</em>'.
   * @see yang.manager.yang.UnitsStatement
   * @generated
   */
  EClass getUnitsStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnitsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.UnitsStatement#getArg()
   * @see #getUnitsStatement()
   * @generated
   */
  EAttribute getUnitsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.UnitsStatement#getUnitsunknownstatements <em>Unitsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unitsunknownstatements</em>'.
   * @see yang.manager.yang.UnitsStatement#getUnitsunknownstatements()
   * @see #getUnitsStatement()
   * @generated
   */
  EReference getUnitsStatement_Unitsunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DefaultStatement <em>Default Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Statement</em>'.
   * @see yang.manager.yang.DefaultStatement
   * @generated
   */
  EClass getDefaultStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.DefaultStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.DefaultStatement#getArg()
   * @see #getDefaultStatement()
   * @generated
   */
  EAttribute getDefaultStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.DefaultStatement#getDefaultunknownstatements <em>Defaultunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Defaultunknownstatements</em>'.
   * @see yang.manager.yang.DefaultStatement#getDefaultunknownstatements()
   * @see #getDefaultStatement()
   * @generated
   */
  EReference getDefaultStatement_Defaultunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.StatusStatement <em>Status Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Status Statement</em>'.
   * @see yang.manager.yang.StatusStatement
   * @generated
   */
  EClass getStatusStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.StatusStatement#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see yang.manager.yang.StatusStatement#getStatus()
   * @see #getStatusStatement()
   * @generated
   */
  EAttribute getStatusStatement_Status();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.StatusStatement#getStatusunknownstatements <em>Statusunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statusunknownstatements</em>'.
   * @see yang.manager.yang.StatusStatement#getStatusunknownstatements()
   * @see #getStatusStatement()
   * @generated
   */
  EReference getStatusStatement_Statusunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RevisionDateStatement <em>Revision Date Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revision Date Statement</em>'.
   * @see yang.manager.yang.RevisionDateStatement
   * @generated
   */
  EClass getRevisionDateStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.RevisionDateStatement#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see yang.manager.yang.RevisionDateStatement#getDate()
   * @see #getRevisionDateStatement()
   * @generated
   */
  EAttribute getRevisionDateStatement_Date();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.RevisionDateStatement#getRevisiondateunknownstatements <em>Revisiondateunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Revisiondateunknownstatements</em>'.
   * @see yang.manager.yang.RevisionDateStatement#getRevisiondateunknownstatements()
   * @see #getRevisionDateStatement()
   * @generated
   */
  EReference getRevisionDateStatement_Revisiondateunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.UniqueStatement <em>Unique Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Statement</em>'.
   * @see yang.manager.yang.UniqueStatement
   * @generated
   */
  EClass getUniqueStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UniqueStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.UniqueStatement#getArg()
   * @see #getUniqueStatement()
   * @generated
   */
  EAttribute getUniqueStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.UniqueStatement#getUniqueunknownstatements <em>Uniqueunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uniqueunknownstatements</em>'.
   * @see yang.manager.yang.UniqueStatement#getUniqueunknownstatements()
   * @see #getUniqueStatement()
   * @generated
   */
  EReference getUniqueStatement_Uniqueunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.KeyStatement <em>Key Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key Statement</em>'.
   * @see yang.manager.yang.KeyStatement
   * @generated
   */
  EClass getKeyStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.KeyStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.KeyStatement#getArg()
   * @see #getKeyStatement()
   * @generated
   */
  EAttribute getKeyStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.KeyStatement#getKeyunknownstatements <em>Keyunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Keyunknownstatements</em>'.
   * @see yang.manager.yang.KeyStatement#getKeyunknownstatements()
   * @see #getKeyStatement()
   * @generated
   */
  EReference getKeyStatement_Keyunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.OrderedbyStatement <em>Orderedby Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Orderedby Statement</em>'.
   * @see yang.manager.yang.OrderedbyStatement
   * @generated
   */
  EClass getOrderedbyStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.OrderedbyStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.OrderedbyStatement#getArg()
   * @see #getOrderedbyStatement()
   * @generated
   */
  EAttribute getOrderedbyStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.OrderedbyStatement#getOrderedbyunknownstatements <em>Orderedbyunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Orderedbyunknownstatements</em>'.
   * @see yang.manager.yang.OrderedbyStatement#getOrderedbyunknownstatements()
   * @see #getOrderedbyStatement()
   * @generated
   */
  EReference getOrderedbyStatement_Orderedbyunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.PresenceStatement <em>Presence Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Presence Statement</em>'.
   * @see yang.manager.yang.PresenceStatement
   * @generated
   */
  EClass getPresenceStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.PresenceStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.PresenceStatement#getArg()
   * @see #getPresenceStatement()
   * @generated
   */
  EAttribute getPresenceStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.PresenceStatement#getPresenceunknownstatements <em>Presenceunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Presenceunknownstatements</em>'.
   * @see yang.manager.yang.PresenceStatement#getPresenceunknownstatements()
   * @see #getPresenceStatement()
   * @generated
   */
  EReference getPresenceStatement_Presenceunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.MandatoryStatement <em>Mandatory Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory Statement</em>'.
   * @see yang.manager.yang.MandatoryStatement
   * @generated
   */
  EClass getMandatoryStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.MandatoryStatement#getBoolarg <em>Boolarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolarg</em>'.
   * @see yang.manager.yang.MandatoryStatement#getBoolarg()
   * @see #getMandatoryStatement()
   * @generated
   */
  EAttribute getMandatoryStatement_Boolarg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.MandatoryStatement#getMandatoryunknownstatements <em>Mandatoryunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mandatoryunknownstatements</em>'.
   * @see yang.manager.yang.MandatoryStatement#getMandatoryunknownstatements()
   * @see #getMandatoryStatement()
   * @generated
   */
  EReference getMandatoryStatement_Mandatoryunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ConfigStatement <em>Config Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Statement</em>'.
   * @see yang.manager.yang.ConfigStatement
   * @generated
   */
  EClass getConfigStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ConfigStatement#getBoolarg <em>Boolarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolarg</em>'.
   * @see yang.manager.yang.ConfigStatement#getBoolarg()
   * @see #getConfigStatement()
   * @generated
   */
  EAttribute getConfigStatement_Boolarg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ConfigStatement#getConfigunknownstatements <em>Configunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configunknownstatements</em>'.
   * @see yang.manager.yang.ConfigStatement#getConfigunknownstatements()
   * @see #getConfigStatement()
   * @generated
   */
  EReference getConfigStatement_Configunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.FractionDigitsStatement <em>Fraction Digits Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fraction Digits Statement</em>'.
   * @see yang.manager.yang.FractionDigitsStatement
   * @generated
   */
  EClass getFractionDigitsStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.FractionDigitsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.FractionDigitsStatement#getArg()
   * @see #getFractionDigitsStatement()
   * @generated
   */
  EAttribute getFractionDigitsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.FractionDigitsStatement#getFractiondigitsunknownstatements <em>Fractiondigitsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fractiondigitsunknownstatements</em>'.
   * @see yang.manager.yang.FractionDigitsStatement#getFractiondigitsunknownstatements()
   * @see #getFractionDigitsStatement()
   * @generated
   */
  EReference getFractionDigitsStatement_Fractiondigitsunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.IfFeatureStatement <em>If Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Feature Statement</em>'.
   * @see yang.manager.yang.IfFeatureStatement
   * @generated
   */
  EClass getIfFeatureStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.IfFeatureStatement#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see yang.manager.yang.IfFeatureStatement#getPref()
   * @see #getIfFeatureStatement()
   * @generated
   */
  EAttribute getIfFeatureStatement_Pref();

  /**
   * Returns the meta object for the reference '{@link yang.manager.yang.IfFeatureStatement#getIdent <em>Ident</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ident</em>'.
   * @see yang.manager.yang.IfFeatureStatement#getIdent()
   * @see #getIfFeatureStatement()
   * @generated
   */
  EReference getIfFeatureStatement_Ident();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.IfFeatureStatement#getIffeatureunknownstatements <em>Iffeatureunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Iffeatureunknownstatements</em>'.
   * @see yang.manager.yang.IfFeatureStatement#getIffeatureunknownstatements()
   * @see #getIfFeatureStatement()
   * @generated
   */
  EReference getIfFeatureStatement_Iffeatureunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.BaseStatement <em>Base Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Statement</em>'.
   * @see yang.manager.yang.BaseStatement
   * @generated
   */
  EClass getBaseStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.BaseStatement#getBase <em>Base</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base</em>'.
   * @see yang.manager.yang.BaseStatement#getBase()
   * @see #getBaseStatement()
   * @generated
   */
  EAttribute getBaseStatement_Base();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.BaseStatement#getBaseunknownstatements <em>Baseunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Baseunknownstatements</em>'.
   * @see yang.manager.yang.BaseStatement#getBaseunknownstatements()
   * @see #getBaseStatement()
   * @generated
   */
  EReference getBaseStatement_Baseunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.YinElementStatement <em>Yin Element Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Yin Element Statement</em>'.
   * @see yang.manager.yang.YinElementStatement
   * @generated
   */
  EClass getYinElementStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.YinElementStatement#getBoolarg <em>Boolarg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolarg</em>'.
   * @see yang.manager.yang.YinElementStatement#getBoolarg()
   * @see #getYinElementStatement()
   * @generated
   */
  EAttribute getYinElementStatement_Boolarg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.YinElementStatement#getYinelementunknownstatements <em>Yinelementunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Yinelementunknownstatements</em>'.
   * @see yang.manager.yang.YinElementStatement#getYinelementunknownstatements()
   * @see #getYinElementStatement()
   * @generated
   */
  EReference getYinElementStatement_Yinelementunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.MinElementsStatement <em>Min Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Min Elements Statement</em>'.
   * @see yang.manager.yang.MinElementsStatement
   * @generated
   */
  EClass getMinElementsStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.MinElementsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.MinElementsStatement#getArg()
   * @see #getMinElementsStatement()
   * @generated
   */
  EAttribute getMinElementsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.MinElementsStatement#getMinelementsunknownstatements <em>Minelementsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Minelementsunknownstatements</em>'.
   * @see yang.manager.yang.MinElementsStatement#getMinelementsunknownstatements()
   * @see #getMinElementsStatement()
   * @generated
   */
  EReference getMinElementsStatement_Minelementsunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.MaxElementsStatement <em>Max Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Max Elements Statement</em>'.
   * @see yang.manager.yang.MaxElementsStatement
   * @generated
   */
  EClass getMaxElementsStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.MaxElementsStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.MaxElementsStatement#getArg()
   * @see #getMaxElementsStatement()
   * @generated
   */
  EAttribute getMaxElementsStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.MaxElementsStatement#getMaxelementsunknownstatements <em>Maxelementsunknownstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Maxelementsunknownstatements</em>'.
   * @see yang.manager.yang.MaxElementsStatement#getMaxelementsunknownstatements()
   * @see #getMaxElementsStatement()
   * @generated
   */
  EReference getMaxElementsStatement_Maxelementsunknownstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.UnknownStatement <em>Unknown Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Statement</em>'.
   * @see yang.manager.yang.UnknownStatement
   * @generated
   */
  EClass getUnknownStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnknownStatement#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see yang.manager.yang.UnknownStatement#getPref()
   * @see #getUnknownStatement()
   * @generated
   */
  EAttribute getUnknownStatement_Pref();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnknownStatement#getNamestat <em>Namestat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namestat</em>'.
   * @see yang.manager.yang.UnknownStatement#getNamestat()
   * @see #getUnknownStatement()
   * @generated
   */
  EAttribute getUnknownStatement_Namestat();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnknownStatement#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see yang.manager.yang.UnknownStatement#getArgument()
   * @see #getUnknownStatement()
   * @generated
   */
  EAttribute getUnknownStatement_Argument();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.UnknownStatement#getUnknownsubstatements <em>Unknownsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unknownsubstatements</em>'.
   * @see yang.manager.yang.UnknownStatement#getUnknownsubstatements()
   * @see #getUnknownStatement()
   * @generated
   */
  EReference getUnknownStatement_Unknownsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.UnknownSubstatements <em>Unknown Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown Substatements</em>'.
   * @see yang.manager.yang.UnknownSubstatements
   * @generated
   */
  EClass getUnknownSubstatements();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnknownSubstatements#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see yang.manager.yang.UnknownSubstatements#getPref()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EAttribute getUnknownSubstatements_Pref();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnknownSubstatements#getNamestat <em>Namestat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Namestat</em>'.
   * @see yang.manager.yang.UnknownSubstatements#getNamestat()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EAttribute getUnknownSubstatements_Namestat();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UnknownSubstatements#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Argument</em>'.
   * @see yang.manager.yang.UnknownSubstatements#getArgument()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EAttribute getUnknownSubstatements_Argument();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.UnknownSubstatements#getUnknownsubstatements <em>Unknownsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Unknownsubstatements</em>'.
   * @see yang.manager.yang.UnknownSubstatements#getUnknownsubstatements()
   * @see #getUnknownSubstatements()
   * @generated
   */
  EReference getUnknownSubstatements_Unknownsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RangeStatement <em>Range Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Range Statement</em>'.
   * @see yang.manager.yang.RangeStatement
   * @generated
   */
  EClass getRangeStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.RangeStatement#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Range</em>'.
   * @see yang.manager.yang.RangeStatement#getRange()
   * @see #getRangeStatement()
   * @generated
   */
  EAttribute getRangeStatement_Range();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.RangeStatement#getRangesubstatements <em>Rangesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rangesubstatements</em>'.
   * @see yang.manager.yang.RangeStatement#getRangesubstatements()
   * @see #getRangeStatement()
   * @generated
   */
  EReference getRangeStatement_Rangesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.PatternStatement <em>Pattern Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern Statement</em>'.
   * @see yang.manager.yang.PatternStatement
   * @generated
   */
  EClass getPatternStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.PatternStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.PatternStatement#getName()
   * @see #getPatternStatement()
   * @generated
   */
  EAttribute getPatternStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.PatternStatement#getPatternsubstatements <em>Patternsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Patternsubstatements</em>'.
   * @see yang.manager.yang.PatternStatement#getPatternsubstatements()
   * @see #getPatternStatement()
   * @generated
   */
  EReference getPatternStatement_Patternsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.LengthStatement <em>Length Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Length Statement</em>'.
   * @see yang.manager.yang.LengthStatement
   * @generated
   */
  EClass getLengthStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.LengthStatement#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see yang.manager.yang.LengthStatement#getLength()
   * @see #getLengthStatement()
   * @generated
   */
  EAttribute getLengthStatement_Length();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.LengthStatement#getLengthsubstatements <em>Lengthsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Lengthsubstatements</em>'.
   * @see yang.manager.yang.LengthStatement#getLengthsubstatements()
   * @see #getLengthStatement()
   * @generated
   */
  EReference getLengthStatement_Lengthsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.MustStatement <em>Must Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Must Statement</em>'.
   * @see yang.manager.yang.MustStatement
   * @generated
   */
  EClass getMustStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.MustStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.MustStatement#getArg()
   * @see #getMustStatement()
   * @generated
   */
  EAttribute getMustStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.MustStatement#getMustsubstatements <em>Mustsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mustsubstatements</em>'.
   * @see yang.manager.yang.MustStatement#getMustsubstatements()
   * @see #getMustStatement()
   * @generated
   */
  EReference getMustStatement_Mustsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.MultipleSubstatement <em>Multiple Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Substatement</em>'.
   * @see yang.manager.yang.MultipleSubstatement
   * @generated
   */
  EClass getMultipleSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RpcStatement <em>Rpc Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rpc Statement</em>'.
   * @see yang.manager.yang.RpcStatement
   * @generated
   */
  EClass getRpcStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.RpcStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.RpcStatement#getName()
   * @see #getRpcStatement()
   * @generated
   */
  EAttribute getRpcStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.RpcStatement#getRpcsubstatements <em>Rpcsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rpcsubstatements</em>'.
   * @see yang.manager.yang.RpcStatement#getRpcsubstatements()
   * @see #getRpcStatement()
   * @generated
   */
  EReference getRpcStatement_Rpcsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RpcSubstatement <em>Rpc Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rpc Substatement</em>'.
   * @see yang.manager.yang.RpcSubstatement
   * @generated
   */
  EClass getRpcSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.InputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Statement</em>'.
   * @see yang.manager.yang.InputStatement
   * @generated
   */
  EClass getInputStatement();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.InputStatement#getInputsubstatements <em>Inputsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inputsubstatements</em>'.
   * @see yang.manager.yang.InputStatement#getInputsubstatements()
   * @see #getInputStatement()
   * @generated
   */
  EReference getInputStatement_Inputsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.InputSubstatement <em>Input Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Substatement</em>'.
   * @see yang.manager.yang.InputSubstatement
   * @generated
   */
  EClass getInputSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.OutputStatement <em>Output Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Statement</em>'.
   * @see yang.manager.yang.OutputStatement
   * @generated
   */
  EClass getOutputStatement();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.OutputStatement#getOutputsubstatements <em>Outputsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outputsubstatements</em>'.
   * @see yang.manager.yang.OutputStatement#getOutputsubstatements()
   * @see #getOutputStatement()
   * @generated
   */
  EReference getOutputStatement_Outputsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.OutputSubstatement <em>Output Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Substatement</em>'.
   * @see yang.manager.yang.OutputSubstatement
   * @generated
   */
  EClass getOutputSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.NotificationStatement <em>Notification Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification Statement</em>'.
   * @see yang.manager.yang.NotificationStatement
   * @generated
   */
  EClass getNotificationStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.NotificationStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.NotificationStatement#getName()
   * @see #getNotificationStatement()
   * @generated
   */
  EAttribute getNotificationStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.NotificationStatement#getNotificationsubstatements <em>Notificationsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notificationsubstatements</em>'.
   * @see yang.manager.yang.NotificationStatement#getNotificationsubstatements()
   * @see #getNotificationStatement()
   * @generated
   */
  EReference getNotificationStatement_Notificationsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.NotificationSubstatement <em>Notification Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notification Substatement</em>'.
   * @see yang.manager.yang.NotificationSubstatement
   * @generated
   */
  EClass getNotificationSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ContainerStatement <em>Container Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Statement</em>'.
   * @see yang.manager.yang.ContainerStatement
   * @generated
   */
  EClass getContainerStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ContainerStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.ContainerStatement#getName()
   * @see #getContainerStatement()
   * @generated
   */
  EAttribute getContainerStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ContainerStatement#getContainersubstatements <em>Containersubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Containersubstatements</em>'.
   * @see yang.manager.yang.ContainerStatement#getContainersubstatements()
   * @see #getContainerStatement()
   * @generated
   */
  EReference getContainerStatement_Containersubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ContainerSubstatement <em>Container Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container Substatement</em>'.
   * @see yang.manager.yang.ContainerSubstatement
   * @generated
   */
  EClass getContainerSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ListStatement <em>List Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Statement</em>'.
   * @see yang.manager.yang.ListStatement
   * @generated
   */
  EClass getListStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ListStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.ListStatement#getName()
   * @see #getListStatement()
   * @generated
   */
  EAttribute getListStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ListStatement#getListsubstatements <em>Listsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Listsubstatements</em>'.
   * @see yang.manager.yang.ListStatement#getListsubstatements()
   * @see #getListStatement()
   * @generated
   */
  EReference getListStatement_Listsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ListSubstatement <em>List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Substatement</em>'.
   * @see yang.manager.yang.ListSubstatement
   * @generated
   */
  EClass getListSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.GroupingStatement <em>Grouping Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping Statement</em>'.
   * @see yang.manager.yang.GroupingStatement
   * @generated
   */
  EClass getGroupingStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.GroupingStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.GroupingStatement#getName()
   * @see #getGroupingStatement()
   * @generated
   */
  EAttribute getGroupingStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.GroupingStatement#getGroupingsubstatements <em>Groupingsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Groupingsubstatements</em>'.
   * @see yang.manager.yang.GroupingStatement#getGroupingsubstatements()
   * @see #getGroupingStatement()
   * @generated
   */
  EReference getGroupingStatement_Groupingsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.GroupingSubstatement <em>Grouping Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping Substatement</em>'.
   * @see yang.manager.yang.GroupingSubstatement
   * @generated
   */
  EClass getGroupingSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.LeafStatement <em>Leaf Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf Statement</em>'.
   * @see yang.manager.yang.LeafStatement
   * @generated
   */
  EClass getLeafStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.LeafStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.LeafStatement#getName()
   * @see #getLeafStatement()
   * @generated
   */
  EAttribute getLeafStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.LeafStatement#getLeafsubstatements <em>Leafsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Leafsubstatements</em>'.
   * @see yang.manager.yang.LeafStatement#getLeafsubstatements()
   * @see #getLeafStatement()
   * @generated
   */
  EReference getLeafStatement_Leafsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.LeafSubstatement <em>Leaf Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf Substatement</em>'.
   * @see yang.manager.yang.LeafSubstatement
   * @generated
   */
  EClass getLeafSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.LeafListStatement <em>Leaf List Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf List Statement</em>'.
   * @see yang.manager.yang.LeafListStatement
   * @generated
   */
  EClass getLeafListStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.LeafListStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.LeafListStatement#getArg()
   * @see #getLeafListStatement()
   * @generated
   */
  EAttribute getLeafListStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.LeafListStatement#getLeaflistsubstatements <em>Leaflistsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Leaflistsubstatements</em>'.
   * @see yang.manager.yang.LeafListStatement#getLeaflistsubstatements()
   * @see #getLeafListStatement()
   * @generated
   */
  EReference getLeafListStatement_Leaflistsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.LeafListSubstatement <em>Leaf List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Leaf List Substatement</em>'.
   * @see yang.manager.yang.LeafListSubstatement
   * @generated
   */
  EClass getLeafListSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ChoiceStatement <em>Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Statement</em>'.
   * @see yang.manager.yang.ChoiceStatement
   * @generated
   */
  EClass getChoiceStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ChoiceStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.ChoiceStatement#getName()
   * @see #getChoiceStatement()
   * @generated
   */
  EAttribute getChoiceStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ChoiceStatement#getChoicesubstatements <em>Choicesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Choicesubstatements</em>'.
   * @see yang.manager.yang.ChoiceStatement#getChoicesubstatements()
   * @see #getChoiceStatement()
   * @generated
   */
  EReference getChoiceStatement_Choicesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ChoiceSubstatement <em>Choice Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Choice Substatement</em>'.
   * @see yang.manager.yang.ChoiceSubstatement
   * @generated
   */
  EClass getChoiceSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Statement</em>'.
   * @see yang.manager.yang.CaseStatement
   * @generated
   */
  EClass getCaseStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.CaseStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.CaseStatement#getName()
   * @see #getCaseStatement()
   * @generated
   */
  EAttribute getCaseStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.CaseStatement#getCasesubstatements <em>Casesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Casesubstatements</em>'.
   * @see yang.manager.yang.CaseStatement#getCasesubstatements()
   * @see #getCaseStatement()
   * @generated
   */
  EReference getCaseStatement_Casesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.CaseSubstatement <em>Case Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case Substatement</em>'.
   * @see yang.manager.yang.CaseSubstatement
   * @generated
   */
  EClass getCaseSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.AnyxmlStatement <em>Anyxml Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anyxml Statement</em>'.
   * @see yang.manager.yang.AnyxmlStatement
   * @generated
   */
  EClass getAnyxmlStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.AnyxmlStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.AnyxmlStatement#getArg()
   * @see #getAnyxmlStatement()
   * @generated
   */
  EAttribute getAnyxmlStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.AnyxmlStatement#getAnyxmlsubstatements <em>Anyxmlsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Anyxmlsubstatements</em>'.
   * @see yang.manager.yang.AnyxmlStatement#getAnyxmlsubstatements()
   * @see #getAnyxmlStatement()
   * @generated
   */
  EReference getAnyxmlStatement_Anyxmlsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.AnyxmlSubstatement <em>Anyxml Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anyxml Substatement</em>'.
   * @see yang.manager.yang.AnyxmlSubstatement
   * @generated
   */
  EClass getAnyxmlSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.UsesStatement <em>Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Statement</em>'.
   * @see yang.manager.yang.UsesStatement
   * @generated
   */
  EClass getUsesStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.UsesStatement#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre</em>'.
   * @see yang.manager.yang.UsesStatement#getPre()
   * @see #getUsesStatement()
   * @generated
   */
  EAttribute getUsesStatement_Pre();

  /**
   * Returns the meta object for the reference '{@link yang.manager.yang.UsesStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Arg</em>'.
   * @see yang.manager.yang.UsesStatement#getArg()
   * @see #getUsesStatement()
   * @generated
   */
  EReference getUsesStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.UsesStatement#getUsessubstatements <em>Usessubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usessubstatements</em>'.
   * @see yang.manager.yang.UsesStatement#getUsessubstatements()
   * @see #getUsesStatement()
   * @generated
   */
  EReference getUsesStatement_Usessubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.UsesSubstatement <em>Uses Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Uses Substatement</em>'.
   * @see yang.manager.yang.UsesSubstatement
   * @generated
   */
  EClass getUsesSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.AugmentUsesStatement <em>Augment Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Augment Uses Statement</em>'.
   * @see yang.manager.yang.AugmentUsesStatement
   * @generated
   */
  EClass getAugmentUsesStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.AugmentUsesStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.AugmentUsesStatement#getArg()
   * @see #getAugmentUsesStatement()
   * @generated
   */
  EAttribute getAugmentUsesStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.AugmentUsesStatement#getAugmentsubstatements <em>Augmentsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Augmentsubstatements</em>'.
   * @see yang.manager.yang.AugmentUsesStatement#getAugmentsubstatements()
   * @see #getAugmentUsesStatement()
   * @generated
   */
  EReference getAugmentUsesStatement_Augmentsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.AugmentStatement <em>Augment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Augment Statement</em>'.
   * @see yang.manager.yang.AugmentStatement
   * @generated
   */
  EClass getAugmentStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.AugmentStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.AugmentStatement#getArg()
   * @see #getAugmentStatement()
   * @generated
   */
  EAttribute getAugmentStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.AugmentStatement#getAugmentsubstatements <em>Augmentsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Augmentsubstatements</em>'.
   * @see yang.manager.yang.AugmentStatement#getAugmentsubstatements()
   * @see #getAugmentStatement()
   * @generated
   */
  EReference getAugmentStatement_Augmentsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.AugmentSubstatement <em>Augment Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Augment Substatement</em>'.
   * @see yang.manager.yang.AugmentSubstatement
   * @generated
   */
  EClass getAugmentSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RefineStatement <em>Refine Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refine Statement</em>'.
   * @see yang.manager.yang.RefineStatement
   * @generated
   */
  EClass getRefineStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.RefineStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.RefineStatement#getArg()
   * @see #getRefineStatement()
   * @generated
   */
  EAttribute getRefineStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.RefineStatement#getRefinesubstatements <em>Refinesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Refinesubstatements</em>'.
   * @see yang.manager.yang.RefineStatement#getRefinesubstatements()
   * @see #getRefineStatement()
   * @generated
   */
  EReference getRefineStatement_Refinesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RefineSubstatement <em>Refine Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refine Substatement</em>'.
   * @see yang.manager.yang.RefineSubstatement
   * @generated
   */
  EClass getRefineSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DeviationStatement <em>Deviation Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviation Statement</em>'.
   * @see yang.manager.yang.DeviationStatement
   * @generated
   */
  EClass getDeviationStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.DeviationStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.DeviationStatement#getArg()
   * @see #getDeviationStatement()
   * @generated
   */
  EAttribute getDeviationStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.DeviationStatement#getDeviationsubstatements <em>Deviationsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deviationsubstatements</em>'.
   * @see yang.manager.yang.DeviationStatement#getDeviationsubstatements()
   * @see #getDeviationStatement()
   * @generated
   */
  EReference getDeviationStatement_Deviationsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DeviationSubstatement <em>Deviation Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviation Substatement</em>'.
   * @see yang.manager.yang.DeviationSubstatement
   * @generated
   */
  EClass getDeviationSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DeviateStatement <em>Deviate Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviate Statement</em>'.
   * @see yang.manager.yang.DeviateStatement
   * @generated
   */
  EClass getDeviateStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.DeviateStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.DeviateStatement#getArg()
   * @see #getDeviateStatement()
   * @generated
   */
  EAttribute getDeviateStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.DeviateStatement#getDeviatesubstatements <em>Deviatesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deviatesubstatements</em>'.
   * @see yang.manager.yang.DeviateStatement#getDeviatesubstatements()
   * @see #getDeviateStatement()
   * @generated
   */
  EReference getDeviateStatement_Deviatesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.DeviateSubstatement <em>Deviate Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deviate Substatement</em>'.
   * @see yang.manager.yang.DeviateSubstatement
   * @generated
   */
  EClass getDeviateSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ExtensionStatement <em>Extension Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Statement</em>'.
   * @see yang.manager.yang.ExtensionStatement
   * @generated
   */
  EClass getExtensionStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ExtensionStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.ExtensionStatement#getArg()
   * @see #getExtensionStatement()
   * @generated
   */
  EAttribute getExtensionStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ExtensionStatement#getExtensionsubstatements <em>Extensionsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extensionsubstatements</em>'.
   * @see yang.manager.yang.ExtensionStatement#getExtensionsubstatements()
   * @see #getExtensionStatement()
   * @generated
   */
  EReference getExtensionStatement_Extensionsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ExtensionSubstatement <em>Extension Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extension Substatement</em>'.
   * @see yang.manager.yang.ExtensionSubstatement
   * @generated
   */
  EClass getExtensionSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ArgumentStatement <em>Argument Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Statement</em>'.
   * @see yang.manager.yang.ArgumentStatement
   * @generated
   */
  EClass getArgumentStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ArgumentStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.ArgumentStatement#getArg()
   * @see #getArgumentStatement()
   * @generated
   */
  EAttribute getArgumentStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ArgumentStatement#getArgumentsubstatements <em>Argumentsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Argumentsubstatements</em>'.
   * @see yang.manager.yang.ArgumentStatement#getArgumentsubstatements()
   * @see #getArgumentStatement()
   * @generated
   */
  EReference getArgumentStatement_Argumentsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ArgumentSubstatement <em>Argument Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Substatement</em>'.
   * @see yang.manager.yang.ArgumentSubstatement
   * @generated
   */
  EClass getArgumentSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.IdentityStatement <em>Identity Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Statement</em>'.
   * @see yang.manager.yang.IdentityStatement
   * @generated
   */
  EClass getIdentityStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.IdentityStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.IdentityStatement#getName()
   * @see #getIdentityStatement()
   * @generated
   */
  EAttribute getIdentityStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.IdentityStatement#getIdentitysubstatements <em>Identitysubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Identitysubstatements</em>'.
   * @see yang.manager.yang.IdentityStatement#getIdentitysubstatements()
   * @see #getIdentityStatement()
   * @generated
   */
  EReference getIdentityStatement_Identitysubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.IdentitySubstatement <em>Identity Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Identity Substatement</em>'.
   * @see yang.manager.yang.IdentitySubstatement
   * @generated
   */
  EClass getIdentitySubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.FeatureStatement <em>Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Statement</em>'.
   * @see yang.manager.yang.FeatureStatement
   * @generated
   */
  EClass getFeatureStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.FeatureStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.FeatureStatement#getName()
   * @see #getFeatureStatement()
   * @generated
   */
  EAttribute getFeatureStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.FeatureStatement#getFeaturesubstatements <em>Featuresubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Featuresubstatements</em>'.
   * @see yang.manager.yang.FeatureStatement#getFeaturesubstatements()
   * @see #getFeatureStatement()
   * @generated
   */
  EReference getFeatureStatement_Featuresubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.FeatureSubstatement <em>Feature Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Substatement</em>'.
   * @see yang.manager.yang.FeatureSubstatement
   * @generated
   */
  EClass getFeatureSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.BelongsToStatement <em>Belongs To Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To Statement</em>'.
   * @see yang.manager.yang.BelongsToStatement
   * @generated
   */
  EClass getBelongsToStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.BelongsToStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.BelongsToStatement#getName()
   * @see #getBelongsToStatement()
   * @generated
   */
  EAttribute getBelongsToStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.BelongsToStatement#getBelongstosubstatement <em>Belongstosubstatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Belongstosubstatement</em>'.
   * @see yang.manager.yang.BelongsToStatement#getBelongstosubstatement()
   * @see #getBelongsToStatement()
   * @generated
   */
  EReference getBelongsToStatement_Belongstosubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.BelongsToSubstatement <em>Belongs To Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Belongs To Substatement</em>'.
   * @see yang.manager.yang.BelongsToSubstatement
   * @generated
   */
  EClass getBelongsToSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.TypedefStatement <em>Typedef Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Statement</em>'.
   * @see yang.manager.yang.TypedefStatement
   * @generated
   */
  EClass getTypedefStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.TypedefStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.TypedefStatement#getName()
   * @see #getTypedefStatement()
   * @generated
   */
  EAttribute getTypedefStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.TypedefStatement#getTypedefsubstatemnet <em>Typedefsubstatemnet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typedefsubstatemnet</em>'.
   * @see yang.manager.yang.TypedefStatement#getTypedefsubstatemnet()
   * @see #getTypedefStatement()
   * @generated
   */
  EReference getTypedefStatement_Typedefsubstatemnet();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.TypedefSubstatement <em>Typedef Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typedef Substatement</em>'.
   * @see yang.manager.yang.TypedefSubstatement
   * @generated
   */
  EClass getTypedefSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.TypeStatement <em>Type Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Statement</em>'.
   * @see yang.manager.yang.TypeStatement
   * @generated
   */
  EClass getTypeStatement();

  /**
   * Returns the meta object for the containment reference '{@link yang.manager.yang.TypeStatement#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see yang.manager.yang.TypeStatement#getType()
   * @see #getTypeStatement()
   * @generated
   */
  EReference getTypeStatement_Type();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.TypeStatement#getPre <em>Pre</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pre</em>'.
   * @see yang.manager.yang.TypeStatement#getPre()
   * @see #getTypeStatement()
   * @generated
   */
  EAttribute getTypeStatement_Pre();

  /**
   * Returns the meta object for the reference '{@link yang.manager.yang.TypeStatement#getImporttype <em>Importtype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Importtype</em>'.
   * @see yang.manager.yang.TypeStatement#getImporttype()
   * @see #getTypeStatement()
   * @generated
   */
  EReference getTypeStatement_Importtype();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.TypeStatement#getTypesubstatements <em>Typesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Typesubstatements</em>'.
   * @see yang.manager.yang.TypeStatement#getTypesubstatements()
   * @see #getTypeStatement()
   * @generated
   */
  EReference getTypeStatement_Typesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.TypeSubStatement <em>Type Sub Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Sub Statement</em>'.
   * @see yang.manager.yang.TypeSubStatement
   * @generated
   */
  EClass getTypeSubStatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.BitStatement <em>Bit Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Statement</em>'.
   * @see yang.manager.yang.BitStatement
   * @generated
   */
  EClass getBitStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.BitStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.BitStatement#getName()
   * @see #getBitStatement()
   * @generated
   */
  EAttribute getBitStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.BitStatement#getBitsubstatements <em>Bitsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bitsubstatements</em>'.
   * @see yang.manager.yang.BitStatement#getBitsubstatements()
   * @see #getBitStatement()
   * @generated
   */
  EReference getBitStatement_Bitsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.BitSubstatement <em>Bit Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Substatement</em>'.
   * @see yang.manager.yang.BitSubstatement
   * @generated
   */
  EClass getBitSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.EnumStatement <em>Enum Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Statement</em>'.
   * @see yang.manager.yang.EnumStatement
   * @generated
   */
  EClass getEnumStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.EnumStatement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see yang.manager.yang.EnumStatement#getName()
   * @see #getEnumStatement()
   * @generated
   */
  EAttribute getEnumStatement_Name();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.EnumStatement#getEnumsubstatements <em>Enumsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enumsubstatements</em>'.
   * @see yang.manager.yang.EnumStatement#getEnumsubstatements()
   * @see #getEnumStatement()
   * @generated
   */
  EReference getEnumStatement_Enumsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.EnumSubstatement <em>Enum Substatement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Substatement</em>'.
   * @see yang.manager.yang.EnumSubstatement
   * @generated
   */
  EClass getEnumSubstatement();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see yang.manager.yang.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.ImportStatement#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see yang.manager.yang.ImportStatement#getImportURI()
   * @see #getImportStatement()
   * @generated
   */
  EAttribute getImportStatement_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.ImportStatement#getImportsubstatements <em>Importsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Importsubstatements</em>'.
   * @see yang.manager.yang.ImportStatement#getImportsubstatements()
   * @see #getImportStatement()
   * @generated
   */
  EReference getImportStatement_Importsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.ImportSubstatements <em>Import Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Substatements</em>'.
   * @see yang.manager.yang.ImportSubstatements
   * @generated
   */
  EClass getImportSubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.IncludeStatement <em>Include Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Statement</em>'.
   * @see yang.manager.yang.IncludeStatement
   * @generated
   */
  EClass getIncludeStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.IncludeStatement#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see yang.manager.yang.IncludeStatement#getImportURI()
   * @see #getIncludeStatement()
   * @generated
   */
  EAttribute getIncludeStatement_ImportURI();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.IncludeStatement#getIncludesubstatements <em>Includesubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includesubstatements</em>'.
   * @see yang.manager.yang.IncludeStatement#getIncludesubstatements()
   * @see #getIncludeStatement()
   * @generated
   */
  EReference getIncludeStatement_Includesubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.IncludeSubstatements <em>Include Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include Substatements</em>'.
   * @see yang.manager.yang.IncludeSubstatements
   * @generated
   */
  EClass getIncludeSubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.WhenStatement <em>When Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Statement</em>'.
   * @see yang.manager.yang.WhenStatement
   * @generated
   */
  EClass getWhenStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.WhenStatement#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see yang.manager.yang.WhenStatement#getArg()
   * @see #getWhenStatement()
   * @generated
   */
  EAttribute getWhenStatement_Arg();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.WhenStatement#getWhensubstatements <em>Whensubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Whensubstatements</em>'.
   * @see yang.manager.yang.WhenStatement#getWhensubstatements()
   * @see #getWhenStatement()
   * @generated
   */
  EReference getWhenStatement_Whensubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.WhenSubstatements <em>When Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>When Substatements</em>'.
   * @see yang.manager.yang.WhenSubstatements
   * @generated
   */
  EClass getWhenSubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RevisionStatement <em>Revision Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revision Statement</em>'.
   * @see yang.manager.yang.RevisionStatement
   * @generated
   */
  EClass getRevisionStatement();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.RevisionStatement#getDate <em>Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date</em>'.
   * @see yang.manager.yang.RevisionStatement#getDate()
   * @see #getRevisionStatement()
   * @generated
   */
  EAttribute getRevisionStatement_Date();

  /**
   * Returns the meta object for the containment reference list '{@link yang.manager.yang.RevisionStatement#getRevisionsubstatements <em>Revisionsubstatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Revisionsubstatements</em>'.
   * @see yang.manager.yang.RevisionStatement#getRevisionsubstatements()
   * @see #getRevisionStatement()
   * @generated
   */
  EReference getRevisionStatement_Revisionsubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.RevisionSubstatements <em>Revision Substatements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Revision Substatements</em>'.
   * @see yang.manager.yang.RevisionSubstatements
   * @generated
   */
  EClass getRevisionSubstatements();

  /**
   * Returns the meta object for class '{@link yang.manager.yang.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Built In Type</em>'.
   * @see yang.manager.yang.BuiltInType
   * @generated
   */
  EClass getBuiltInType();

  /**
   * Returns the meta object for the attribute '{@link yang.manager.yang.BuiltInType#getBtype <em>Btype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Btype</em>'.
   * @see yang.manager.yang.BuiltInType#getBtype()
   * @see #getBuiltInType()
   * @generated
   */
  EAttribute getBuiltInType_Btype();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  YangFactory getYangFactory();

} //YangPackage
