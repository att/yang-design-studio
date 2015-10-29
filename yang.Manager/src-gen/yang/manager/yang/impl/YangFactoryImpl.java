/**
 */
package yang.manager.yang.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import yang.manager.yang.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YangFactoryImpl extends EFactoryImpl implements YangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static YangFactory init()
  {
    try
    {
      YangFactory theYangFactory = (YangFactory)EPackage.Registry.INSTANCE.getEFactory(YangPackage.eNS_URI);
      if (theYangFactory != null)
      {
        return theYangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new YangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case YangPackage.YANG_FILE: return createYangFile();
      case YangPackage.MODULE: return createModule();
      case YangPackage.MODULE_STATEMENT: return createModuleStatement();
      case YangPackage.SUB_MODULE: return createSubModule();
      case YangPackage.SUBMODULE_STATEMENT: return createSubmoduleStatement();
      case YangPackage.DATADEF_STATEMENT: return createDatadefStatement();
      case YangPackage.YANG_VERSION_STATEMENT: return createYangVersionStatement();
      case YangPackage.ORGANIZATION_STATEMENT: return createOrganizationStatement();
      case YangPackage.CONTACT_STATEMENT: return createContactStatement();
      case YangPackage.DESCRIPTION_STATEMENT: return createDescriptionStatement();
      case YangPackage.REFERENCE_STATEMENT: return createReferenceStatement();
      case YangPackage.NAMESPACE_STATEMENT: return createNamespaceStatement();
      case YangPackage.PREFIX_STATEMENT: return createPrefixStatement();
      case YangPackage.REQUIRE_INSTANCE_STATEMENT: return createRequireInstanceStatement();
      case YangPackage.PATH_STATEMENT: return createPathStatement();
      case YangPackage.POSITION_STATEMENT: return createPositionStatement();
      case YangPackage.VALUE_STATEMENT: return createValueStatement();
      case YangPackage.ERROR_APP_TAG_STATEMENT: return createErrorAppTagStatement();
      case YangPackage.ERROR_MESSAGE_STATEMENT: return createErrorMessageStatement();
      case YangPackage.UNITS_STATEMENT: return createUnitsStatement();
      case YangPackage.DEFAULT_STATEMENT: return createDefaultStatement();
      case YangPackage.STATUS_STATEMENT: return createStatusStatement();
      case YangPackage.REVISION_DATE_STATEMENT: return createRevisionDateStatement();
      case YangPackage.UNIQUE_STATEMENT: return createUniqueStatement();
      case YangPackage.KEY_STATEMENT: return createKeyStatement();
      case YangPackage.ORDEREDBY_STATEMENT: return createOrderedbyStatement();
      case YangPackage.PRESENCE_STATEMENT: return createPresenceStatement();
      case YangPackage.MANDATORY_STATEMENT: return createMandatoryStatement();
      case YangPackage.CONFIG_STATEMENT: return createConfigStatement();
      case YangPackage.FRACTION_DIGITS_STATEMENT: return createFractionDigitsStatement();
      case YangPackage.IF_FEATURE_STATEMENT: return createIfFeatureStatement();
      case YangPackage.BASE_STATEMENT: return createBaseStatement();
      case YangPackage.YIN_ELEMENT_STATEMENT: return createYinElementStatement();
      case YangPackage.MIN_ELEMENTS_STATEMENT: return createMinElementsStatement();
      case YangPackage.MAX_ELEMENTS_STATEMENT: return createMaxElementsStatement();
      case YangPackage.UNKNOWN_STATEMENT: return createUnknownStatement();
      case YangPackage.UNKNOWN_SUBSTATEMENTS: return createUnknownSubstatements();
      case YangPackage.RANGE_STATEMENT: return createRangeStatement();
      case YangPackage.PATTERN_STATEMENT: return createPatternStatement();
      case YangPackage.LENGTH_STATEMENT: return createLengthStatement();
      case YangPackage.MUST_STATEMENT: return createMustStatement();
      case YangPackage.MULTIPLE_SUBSTATEMENT: return createMultipleSubstatement();
      case YangPackage.RPC_STATEMENT: return createRpcStatement();
      case YangPackage.RPC_SUBSTATEMENT: return createRpcSubstatement();
      case YangPackage.INPUT_STATEMENT: return createInputStatement();
      case YangPackage.INPUT_SUBSTATEMENT: return createInputSubstatement();
      case YangPackage.OUTPUT_STATEMENT: return createOutputStatement();
      case YangPackage.OUTPUT_SUBSTATEMENT: return createOutputSubstatement();
      case YangPackage.NOTIFICATION_STATEMENT: return createNotificationStatement();
      case YangPackage.NOTIFICATION_SUBSTATEMENT: return createNotificationSubstatement();
      case YangPackage.CONTAINER_STATEMENT: return createContainerStatement();
      case YangPackage.CONTAINER_SUBSTATEMENT: return createContainerSubstatement();
      case YangPackage.LIST_STATEMENT: return createListStatement();
      case YangPackage.LIST_SUBSTATEMENT: return createListSubstatement();
      case YangPackage.GROUPING_STATEMENT: return createGroupingStatement();
      case YangPackage.GROUPING_SUBSTATEMENT: return createGroupingSubstatement();
      case YangPackage.LEAF_STATEMENT: return createLeafStatement();
      case YangPackage.LEAF_SUBSTATEMENT: return createLeafSubstatement();
      case YangPackage.LEAF_LIST_STATEMENT: return createLeafListStatement();
      case YangPackage.LEAF_LIST_SUBSTATEMENT: return createLeafListSubstatement();
      case YangPackage.CHOICE_STATEMENT: return createChoiceStatement();
      case YangPackage.CHOICE_SUBSTATEMENT: return createChoiceSubstatement();
      case YangPackage.CASE_STATEMENT: return createCaseStatement();
      case YangPackage.CASE_SUBSTATEMENT: return createCaseSubstatement();
      case YangPackage.ANYXML_STATEMENT: return createAnyxmlStatement();
      case YangPackage.ANYXML_SUBSTATEMENT: return createAnyxmlSubstatement();
      case YangPackage.USES_STATEMENT: return createUsesStatement();
      case YangPackage.USES_SUBSTATEMENT: return createUsesSubstatement();
      case YangPackage.AUGMENT_USES_STATEMENT: return createAugmentUsesStatement();
      case YangPackage.AUGMENT_STATEMENT: return createAugmentStatement();
      case YangPackage.AUGMENT_SUBSTATEMENT: return createAugmentSubstatement();
      case YangPackage.REFINE_STATEMENT: return createRefineStatement();
      case YangPackage.REFINE_SUBSTATEMENT: return createRefineSubstatement();
      case YangPackage.DEVIATION_STATEMENT: return createDeviationStatement();
      case YangPackage.DEVIATION_SUBSTATEMENT: return createDeviationSubstatement();
      case YangPackage.DEVIATE_STATEMENT: return createDeviateStatement();
      case YangPackage.DEVIATE_SUBSTATEMENT: return createDeviateSubstatement();
      case YangPackage.EXTENSION_STATEMENT: return createExtensionStatement();
      case YangPackage.EXTENSION_SUBSTATEMENT: return createExtensionSubstatement();
      case YangPackage.ARGUMENT_STATEMENT: return createArgumentStatement();
      case YangPackage.ARGUMENT_SUBSTATEMENT: return createArgumentSubstatement();
      case YangPackage.IDENTITY_STATEMENT: return createIdentityStatement();
      case YangPackage.IDENTITY_SUBSTATEMENT: return createIdentitySubstatement();
      case YangPackage.FEATURE_STATEMENT: return createFeatureStatement();
      case YangPackage.FEATURE_SUBSTATEMENT: return createFeatureSubstatement();
      case YangPackage.BELONGS_TO_STATEMENT: return createBelongsToStatement();
      case YangPackage.BELONGS_TO_SUBSTATEMENT: return createBelongsToSubstatement();
      case YangPackage.TYPEDEF_STATEMENT: return createTypedefStatement();
      case YangPackage.TYPEDEF_SUBSTATEMENT: return createTypedefSubstatement();
      case YangPackage.TYPE_STATEMENT: return createTypeStatement();
      case YangPackage.TYPE_SUB_STATEMENT: return createTypeSubStatement();
      case YangPackage.BIT_STATEMENT: return createBitStatement();
      case YangPackage.BIT_SUBSTATEMENT: return createBitSubstatement();
      case YangPackage.ENUM_STATEMENT: return createEnumStatement();
      case YangPackage.ENUM_SUBSTATEMENT: return createEnumSubstatement();
      case YangPackage.IMPORT_STATEMENT: return createImportStatement();
      case YangPackage.IMPORT_SUBSTATEMENTS: return createImportSubstatements();
      case YangPackage.INCLUDE_STATEMENT: return createIncludeStatement();
      case YangPackage.INCLUDE_SUBSTATEMENTS: return createIncludeSubstatements();
      case YangPackage.WHEN_STATEMENT: return createWhenStatement();
      case YangPackage.WHEN_SUBSTATEMENTS: return createWhenSubstatements();
      case YangPackage.REVISION_STATEMENT: return createRevisionStatement();
      case YangPackage.REVISION_SUBSTATEMENTS: return createRevisionSubstatements();
      case YangPackage.BUILT_IN_TYPE: return createBuiltInType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangFile createYangFile()
  {
    YangFileImpl yangFile = new YangFileImpl();
    return yangFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleStatement createModuleStatement()
  {
    ModuleStatementImpl moduleStatement = new ModuleStatementImpl();
    return moduleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubModule createSubModule()
  {
    SubModuleImpl subModule = new SubModuleImpl();
    return subModule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubmoduleStatement createSubmoduleStatement()
  {
    SubmoduleStatementImpl submoduleStatement = new SubmoduleStatementImpl();
    return submoduleStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatadefStatement createDatadefStatement()
  {
    DatadefStatementImpl datadefStatement = new DatadefStatementImpl();
    return datadefStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangVersionStatement createYangVersionStatement()
  {
    YangVersionStatementImpl yangVersionStatement = new YangVersionStatementImpl();
    return yangVersionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrganizationStatement createOrganizationStatement()
  {
    OrganizationStatementImpl organizationStatement = new OrganizationStatementImpl();
    return organizationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContactStatement createContactStatement()
  {
    ContactStatementImpl contactStatement = new ContactStatementImpl();
    return contactStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DescriptionStatement createDescriptionStatement()
  {
    DescriptionStatementImpl descriptionStatement = new DescriptionStatementImpl();
    return descriptionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceStatement createReferenceStatement()
  {
    ReferenceStatementImpl referenceStatement = new ReferenceStatementImpl();
    return referenceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamespaceStatement createNamespaceStatement()
  {
    NamespaceStatementImpl namespaceStatement = new NamespaceStatementImpl();
    return namespaceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixStatement createPrefixStatement()
  {
    PrefixStatementImpl prefixStatement = new PrefixStatementImpl();
    return prefixStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequireInstanceStatement createRequireInstanceStatement()
  {
    RequireInstanceStatementImpl requireInstanceStatement = new RequireInstanceStatementImpl();
    return requireInstanceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathStatement createPathStatement()
  {
    PathStatementImpl pathStatement = new PathStatementImpl();
    return pathStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PositionStatement createPositionStatement()
  {
    PositionStatementImpl positionStatement = new PositionStatementImpl();
    return positionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueStatement createValueStatement()
  {
    ValueStatementImpl valueStatement = new ValueStatementImpl();
    return valueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorAppTagStatement createErrorAppTagStatement()
  {
    ErrorAppTagStatementImpl errorAppTagStatement = new ErrorAppTagStatementImpl();
    return errorAppTagStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ErrorMessageStatement createErrorMessageStatement()
  {
    ErrorMessageStatementImpl errorMessageStatement = new ErrorMessageStatementImpl();
    return errorMessageStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnitsStatement createUnitsStatement()
  {
    UnitsStatementImpl unitsStatement = new UnitsStatementImpl();
    return unitsStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultStatement createDefaultStatement()
  {
    DefaultStatementImpl defaultStatement = new DefaultStatementImpl();
    return defaultStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StatusStatement createStatusStatement()
  {
    StatusStatementImpl statusStatement = new StatusStatementImpl();
    return statusStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RevisionDateStatement createRevisionDateStatement()
  {
    RevisionDateStatementImpl revisionDateStatement = new RevisionDateStatementImpl();
    return revisionDateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniqueStatement createUniqueStatement()
  {
    UniqueStatementImpl uniqueStatement = new UniqueStatementImpl();
    return uniqueStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KeyStatement createKeyStatement()
  {
    KeyStatementImpl keyStatement = new KeyStatementImpl();
    return keyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrderedbyStatement createOrderedbyStatement()
  {
    OrderedbyStatementImpl orderedbyStatement = new OrderedbyStatementImpl();
    return orderedbyStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PresenceStatement createPresenceStatement()
  {
    PresenceStatementImpl presenceStatement = new PresenceStatementImpl();
    return presenceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MandatoryStatement createMandatoryStatement()
  {
    MandatoryStatementImpl mandatoryStatement = new MandatoryStatementImpl();
    return mandatoryStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConfigStatement createConfigStatement()
  {
    ConfigStatementImpl configStatement = new ConfigStatementImpl();
    return configStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractionDigitsStatement createFractionDigitsStatement()
  {
    FractionDigitsStatementImpl fractionDigitsStatement = new FractionDigitsStatementImpl();
    return fractionDigitsStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfFeatureStatement createIfFeatureStatement()
  {
    IfFeatureStatementImpl ifFeatureStatement = new IfFeatureStatementImpl();
    return ifFeatureStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseStatement createBaseStatement()
  {
    BaseStatementImpl baseStatement = new BaseStatementImpl();
    return baseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YinElementStatement createYinElementStatement()
  {
    YinElementStatementImpl yinElementStatement = new YinElementStatementImpl();
    return yinElementStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinElementsStatement createMinElementsStatement()
  {
    MinElementsStatementImpl minElementsStatement = new MinElementsStatementImpl();
    return minElementsStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxElementsStatement createMaxElementsStatement()
  {
    MaxElementsStatementImpl maxElementsStatement = new MaxElementsStatementImpl();
    return maxElementsStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownStatement createUnknownStatement()
  {
    UnknownStatementImpl unknownStatement = new UnknownStatementImpl();
    return unknownStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnknownSubstatements createUnknownSubstatements()
  {
    UnknownSubstatementsImpl unknownSubstatements = new UnknownSubstatementsImpl();
    return unknownSubstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeStatement createRangeStatement()
  {
    RangeStatementImpl rangeStatement = new RangeStatementImpl();
    return rangeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternStatement createPatternStatement()
  {
    PatternStatementImpl patternStatement = new PatternStatementImpl();
    return patternStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LengthStatement createLengthStatement()
  {
    LengthStatementImpl lengthStatement = new LengthStatementImpl();
    return lengthStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MustStatement createMustStatement()
  {
    MustStatementImpl mustStatement = new MustStatementImpl();
    return mustStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultipleSubstatement createMultipleSubstatement()
  {
    MultipleSubstatementImpl multipleSubstatement = new MultipleSubstatementImpl();
    return multipleSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RpcStatement createRpcStatement()
  {
    RpcStatementImpl rpcStatement = new RpcStatementImpl();
    return rpcStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RpcSubstatement createRpcSubstatement()
  {
    RpcSubstatementImpl rpcSubstatement = new RpcSubstatementImpl();
    return rpcSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputStatement createInputStatement()
  {
    InputStatementImpl inputStatement = new InputStatementImpl();
    return inputStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputSubstatement createInputSubstatement()
  {
    InputSubstatementImpl inputSubstatement = new InputSubstatementImpl();
    return inputSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputStatement createOutputStatement()
  {
    OutputStatementImpl outputStatement = new OutputStatementImpl();
    return outputStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputSubstatement createOutputSubstatement()
  {
    OutputSubstatementImpl outputSubstatement = new OutputSubstatementImpl();
    return outputSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationStatement createNotificationStatement()
  {
    NotificationStatementImpl notificationStatement = new NotificationStatementImpl();
    return notificationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationSubstatement createNotificationSubstatement()
  {
    NotificationSubstatementImpl notificationSubstatement = new NotificationSubstatementImpl();
    return notificationSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerStatement createContainerStatement()
  {
    ContainerStatementImpl containerStatement = new ContainerStatementImpl();
    return containerStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContainerSubstatement createContainerSubstatement()
  {
    ContainerSubstatementImpl containerSubstatement = new ContainerSubstatementImpl();
    return containerSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListStatement createListStatement()
  {
    ListStatementImpl listStatement = new ListStatementImpl();
    return listStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListSubstatement createListSubstatement()
  {
    ListSubstatementImpl listSubstatement = new ListSubstatementImpl();
    return listSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupingStatement createGroupingStatement()
  {
    GroupingStatementImpl groupingStatement = new GroupingStatementImpl();
    return groupingStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupingSubstatement createGroupingSubstatement()
  {
    GroupingSubstatementImpl groupingSubstatement = new GroupingSubstatementImpl();
    return groupingSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafStatement createLeafStatement()
  {
    LeafStatementImpl leafStatement = new LeafStatementImpl();
    return leafStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafSubstatement createLeafSubstatement()
  {
    LeafSubstatementImpl leafSubstatement = new LeafSubstatementImpl();
    return leafSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafListStatement createLeafListStatement()
  {
    LeafListStatementImpl leafListStatement = new LeafListStatementImpl();
    return leafListStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LeafListSubstatement createLeafListSubstatement()
  {
    LeafListSubstatementImpl leafListSubstatement = new LeafListSubstatementImpl();
    return leafListSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoiceStatement createChoiceStatement()
  {
    ChoiceStatementImpl choiceStatement = new ChoiceStatementImpl();
    return choiceStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChoiceSubstatement createChoiceSubstatement()
  {
    ChoiceSubstatementImpl choiceSubstatement = new ChoiceSubstatementImpl();
    return choiceSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseStatement createCaseStatement()
  {
    CaseStatementImpl caseStatement = new CaseStatementImpl();
    return caseStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CaseSubstatement createCaseSubstatement()
  {
    CaseSubstatementImpl caseSubstatement = new CaseSubstatementImpl();
    return caseSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyxmlStatement createAnyxmlStatement()
  {
    AnyxmlStatementImpl anyxmlStatement = new AnyxmlStatementImpl();
    return anyxmlStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyxmlSubstatement createAnyxmlSubstatement()
  {
    AnyxmlSubstatementImpl anyxmlSubstatement = new AnyxmlSubstatementImpl();
    return anyxmlSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesStatement createUsesStatement()
  {
    UsesStatementImpl usesStatement = new UsesStatementImpl();
    return usesStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UsesSubstatement createUsesSubstatement()
  {
    UsesSubstatementImpl usesSubstatement = new UsesSubstatementImpl();
    return usesSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AugmentUsesStatement createAugmentUsesStatement()
  {
    AugmentUsesStatementImpl augmentUsesStatement = new AugmentUsesStatementImpl();
    return augmentUsesStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AugmentStatement createAugmentStatement()
  {
    AugmentStatementImpl augmentStatement = new AugmentStatementImpl();
    return augmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AugmentSubstatement createAugmentSubstatement()
  {
    AugmentSubstatementImpl augmentSubstatement = new AugmentSubstatementImpl();
    return augmentSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefineStatement createRefineStatement()
  {
    RefineStatementImpl refineStatement = new RefineStatementImpl();
    return refineStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RefineSubstatement createRefineSubstatement()
  {
    RefineSubstatementImpl refineSubstatement = new RefineSubstatementImpl();
    return refineSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviationStatement createDeviationStatement()
  {
    DeviationStatementImpl deviationStatement = new DeviationStatementImpl();
    return deviationStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviationSubstatement createDeviationSubstatement()
  {
    DeviationSubstatementImpl deviationSubstatement = new DeviationSubstatementImpl();
    return deviationSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviateStatement createDeviateStatement()
  {
    DeviateStatementImpl deviateStatement = new DeviateStatementImpl();
    return deviateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeviateSubstatement createDeviateSubstatement()
  {
    DeviateSubstatementImpl deviateSubstatement = new DeviateSubstatementImpl();
    return deviateSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionStatement createExtensionStatement()
  {
    ExtensionStatementImpl extensionStatement = new ExtensionStatementImpl();
    return extensionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtensionSubstatement createExtensionSubstatement()
  {
    ExtensionSubstatementImpl extensionSubstatement = new ExtensionSubstatementImpl();
    return extensionSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentStatement createArgumentStatement()
  {
    ArgumentStatementImpl argumentStatement = new ArgumentStatementImpl();
    return argumentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentSubstatement createArgumentSubstatement()
  {
    ArgumentSubstatementImpl argumentSubstatement = new ArgumentSubstatementImpl();
    return argumentSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentityStatement createIdentityStatement()
  {
    IdentityStatementImpl identityStatement = new IdentityStatementImpl();
    return identityStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdentitySubstatement createIdentitySubstatement()
  {
    IdentitySubstatementImpl identitySubstatement = new IdentitySubstatementImpl();
    return identitySubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureStatement createFeatureStatement()
  {
    FeatureStatementImpl featureStatement = new FeatureStatementImpl();
    return featureStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureSubstatement createFeatureSubstatement()
  {
    FeatureSubstatementImpl featureSubstatement = new FeatureSubstatementImpl();
    return featureSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BelongsToStatement createBelongsToStatement()
  {
    BelongsToStatementImpl belongsToStatement = new BelongsToStatementImpl();
    return belongsToStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BelongsToSubstatement createBelongsToSubstatement()
  {
    BelongsToSubstatementImpl belongsToSubstatement = new BelongsToSubstatementImpl();
    return belongsToSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefStatement createTypedefStatement()
  {
    TypedefStatementImpl typedefStatement = new TypedefStatementImpl();
    return typedefStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefSubstatement createTypedefSubstatement()
  {
    TypedefSubstatementImpl typedefSubstatement = new TypedefSubstatementImpl();
    return typedefSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeStatement createTypeStatement()
  {
    TypeStatementImpl typeStatement = new TypeStatementImpl();
    return typeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSubStatement createTypeSubStatement()
  {
    TypeSubStatementImpl typeSubStatement = new TypeSubStatementImpl();
    return typeSubStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitStatement createBitStatement()
  {
    BitStatementImpl bitStatement = new BitStatementImpl();
    return bitStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BitSubstatement createBitSubstatement()
  {
    BitSubstatementImpl bitSubstatement = new BitSubstatementImpl();
    return bitSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumStatement createEnumStatement()
  {
    EnumStatementImpl enumStatement = new EnumStatementImpl();
    return enumStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumSubstatement createEnumSubstatement()
  {
    EnumSubstatementImpl enumSubstatement = new EnumSubstatementImpl();
    return enumSubstatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportStatement createImportStatement()
  {
    ImportStatementImpl importStatement = new ImportStatementImpl();
    return importStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportSubstatements createImportSubstatements()
  {
    ImportSubstatementsImpl importSubstatements = new ImportSubstatementsImpl();
    return importSubstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeStatement createIncludeStatement()
  {
    IncludeStatementImpl includeStatement = new IncludeStatementImpl();
    return includeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeSubstatements createIncludeSubstatements()
  {
    IncludeSubstatementsImpl includeSubstatements = new IncludeSubstatementsImpl();
    return includeSubstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenStatement createWhenStatement()
  {
    WhenStatementImpl whenStatement = new WhenStatementImpl();
    return whenStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WhenSubstatements createWhenSubstatements()
  {
    WhenSubstatementsImpl whenSubstatements = new WhenSubstatementsImpl();
    return whenSubstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RevisionStatement createRevisionStatement()
  {
    RevisionStatementImpl revisionStatement = new RevisionStatementImpl();
    return revisionStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RevisionSubstatements createRevisionSubstatements()
  {
    RevisionSubstatementsImpl revisionSubstatements = new RevisionSubstatementsImpl();
    return revisionSubstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInType createBuiltInType()
  {
    BuiltInTypeImpl builtInType = new BuiltInTypeImpl();
    return builtInType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangPackage getYangPackage()
  {
    return (YangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static YangPackage getPackage()
  {
    return YangPackage.eINSTANCE;
  }

} //YangFactoryImpl
