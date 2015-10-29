/**
 */
package yang.manager.yang;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see yang.manager.yang.YangPackage
 * @generated
 */
public interface YangFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  YangFactory eINSTANCE = yang.manager.yang.impl.YangFactoryImpl.init();

  /**
   * Returns a new object of class '<em>File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>File</em>'.
   * @generated
   */
  YangFile createYangFile();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Module Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Statement</em>'.
   * @generated
   */
  ModuleStatement createModuleStatement();

  /**
   * Returns a new object of class '<em>Sub Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Module</em>'.
   * @generated
   */
  SubModule createSubModule();

  /**
   * Returns a new object of class '<em>Submodule Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Submodule Statement</em>'.
   * @generated
   */
  SubmoduleStatement createSubmoduleStatement();

  /**
   * Returns a new object of class '<em>Datadef Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Datadef Statement</em>'.
   * @generated
   */
  DatadefStatement createDatadefStatement();

  /**
   * Returns a new object of class '<em>Version Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version Statement</em>'.
   * @generated
   */
  YangVersionStatement createYangVersionStatement();

  /**
   * Returns a new object of class '<em>Organization Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Organization Statement</em>'.
   * @generated
   */
  OrganizationStatement createOrganizationStatement();

  /**
   * Returns a new object of class '<em>Contact Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contact Statement</em>'.
   * @generated
   */
  ContactStatement createContactStatement();

  /**
   * Returns a new object of class '<em>Description Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description Statement</em>'.
   * @generated
   */
  DescriptionStatement createDescriptionStatement();

  /**
   * Returns a new object of class '<em>Reference Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reference Statement</em>'.
   * @generated
   */
  ReferenceStatement createReferenceStatement();

  /**
   * Returns a new object of class '<em>Namespace Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace Statement</em>'.
   * @generated
   */
  NamespaceStatement createNamespaceStatement();

  /**
   * Returns a new object of class '<em>Prefix Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Statement</em>'.
   * @generated
   */
  PrefixStatement createPrefixStatement();

  /**
   * Returns a new object of class '<em>Require Instance Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Require Instance Statement</em>'.
   * @generated
   */
  RequireInstanceStatement createRequireInstanceStatement();

  /**
   * Returns a new object of class '<em>Path Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Path Statement</em>'.
   * @generated
   */
  PathStatement createPathStatement();

  /**
   * Returns a new object of class '<em>Position Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Position Statement</em>'.
   * @generated
   */
  PositionStatement createPositionStatement();

  /**
   * Returns a new object of class '<em>Value Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Statement</em>'.
   * @generated
   */
  ValueStatement createValueStatement();

  /**
   * Returns a new object of class '<em>Error App Tag Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error App Tag Statement</em>'.
   * @generated
   */
  ErrorAppTagStatement createErrorAppTagStatement();

  /**
   * Returns a new object of class '<em>Error Message Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Error Message Statement</em>'.
   * @generated
   */
  ErrorMessageStatement createErrorMessageStatement();

  /**
   * Returns a new object of class '<em>Units Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Units Statement</em>'.
   * @generated
   */
  UnitsStatement createUnitsStatement();

  /**
   * Returns a new object of class '<em>Default Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Statement</em>'.
   * @generated
   */
  DefaultStatement createDefaultStatement();

  /**
   * Returns a new object of class '<em>Status Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Status Statement</em>'.
   * @generated
   */
  StatusStatement createStatusStatement();

  /**
   * Returns a new object of class '<em>Revision Date Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Revision Date Statement</em>'.
   * @generated
   */
  RevisionDateStatement createRevisionDateStatement();

  /**
   * Returns a new object of class '<em>Unique Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Statement</em>'.
   * @generated
   */
  UniqueStatement createUniqueStatement();

  /**
   * Returns a new object of class '<em>Key Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key Statement</em>'.
   * @generated
   */
  KeyStatement createKeyStatement();

  /**
   * Returns a new object of class '<em>Orderedby Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Orderedby Statement</em>'.
   * @generated
   */
  OrderedbyStatement createOrderedbyStatement();

  /**
   * Returns a new object of class '<em>Presence Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Presence Statement</em>'.
   * @generated
   */
  PresenceStatement createPresenceStatement();

  /**
   * Returns a new object of class '<em>Mandatory Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory Statement</em>'.
   * @generated
   */
  MandatoryStatement createMandatoryStatement();

  /**
   * Returns a new object of class '<em>Config Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Config Statement</em>'.
   * @generated
   */
  ConfigStatement createConfigStatement();

  /**
   * Returns a new object of class '<em>Fraction Digits Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fraction Digits Statement</em>'.
   * @generated
   */
  FractionDigitsStatement createFractionDigitsStatement();

  /**
   * Returns a new object of class '<em>If Feature Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Feature Statement</em>'.
   * @generated
   */
  IfFeatureStatement createIfFeatureStatement();

  /**
   * Returns a new object of class '<em>Base Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Base Statement</em>'.
   * @generated
   */
  BaseStatement createBaseStatement();

  /**
   * Returns a new object of class '<em>Yin Element Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yin Element Statement</em>'.
   * @generated
   */
  YinElementStatement createYinElementStatement();

  /**
   * Returns a new object of class '<em>Min Elements Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Min Elements Statement</em>'.
   * @generated
   */
  MinElementsStatement createMinElementsStatement();

  /**
   * Returns a new object of class '<em>Max Elements Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Max Elements Statement</em>'.
   * @generated
   */
  MaxElementsStatement createMaxElementsStatement();

  /**
   * Returns a new object of class '<em>Unknown Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unknown Statement</em>'.
   * @generated
   */
  UnknownStatement createUnknownStatement();

  /**
   * Returns a new object of class '<em>Unknown Substatements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unknown Substatements</em>'.
   * @generated
   */
  UnknownSubstatements createUnknownSubstatements();

  /**
   * Returns a new object of class '<em>Range Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Statement</em>'.
   * @generated
   */
  RangeStatement createRangeStatement();

  /**
   * Returns a new object of class '<em>Pattern Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Statement</em>'.
   * @generated
   */
  PatternStatement createPatternStatement();

  /**
   * Returns a new object of class '<em>Length Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Length Statement</em>'.
   * @generated
   */
  LengthStatement createLengthStatement();

  /**
   * Returns a new object of class '<em>Must Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Must Statement</em>'.
   * @generated
   */
  MustStatement createMustStatement();

  /**
   * Returns a new object of class '<em>Multiple Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Substatement</em>'.
   * @generated
   */
  MultipleSubstatement createMultipleSubstatement();

  /**
   * Returns a new object of class '<em>Rpc Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rpc Statement</em>'.
   * @generated
   */
  RpcStatement createRpcStatement();

  /**
   * Returns a new object of class '<em>Rpc Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rpc Substatement</em>'.
   * @generated
   */
  RpcSubstatement createRpcSubstatement();

  /**
   * Returns a new object of class '<em>Input Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Statement</em>'.
   * @generated
   */
  InputStatement createInputStatement();

  /**
   * Returns a new object of class '<em>Input Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Input Substatement</em>'.
   * @generated
   */
  InputSubstatement createInputSubstatement();

  /**
   * Returns a new object of class '<em>Output Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Statement</em>'.
   * @generated
   */
  OutputStatement createOutputStatement();

  /**
   * Returns a new object of class '<em>Output Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Output Substatement</em>'.
   * @generated
   */
  OutputSubstatement createOutputSubstatement();

  /**
   * Returns a new object of class '<em>Notification Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Notification Statement</em>'.
   * @generated
   */
  NotificationStatement createNotificationStatement();

  /**
   * Returns a new object of class '<em>Notification Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Notification Substatement</em>'.
   * @generated
   */
  NotificationSubstatement createNotificationSubstatement();

  /**
   * Returns a new object of class '<em>Container Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Statement</em>'.
   * @generated
   */
  ContainerStatement createContainerStatement();

  /**
   * Returns a new object of class '<em>Container Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Container Substatement</em>'.
   * @generated
   */
  ContainerSubstatement createContainerSubstatement();

  /**
   * Returns a new object of class '<em>List Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Statement</em>'.
   * @generated
   */
  ListStatement createListStatement();

  /**
   * Returns a new object of class '<em>List Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Substatement</em>'.
   * @generated
   */
  ListSubstatement createListSubstatement();

  /**
   * Returns a new object of class '<em>Grouping Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grouping Statement</em>'.
   * @generated
   */
  GroupingStatement createGroupingStatement();

  /**
   * Returns a new object of class '<em>Grouping Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grouping Substatement</em>'.
   * @generated
   */
  GroupingSubstatement createGroupingSubstatement();

  /**
   * Returns a new object of class '<em>Leaf Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf Statement</em>'.
   * @generated
   */
  LeafStatement createLeafStatement();

  /**
   * Returns a new object of class '<em>Leaf Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf Substatement</em>'.
   * @generated
   */
  LeafSubstatement createLeafSubstatement();

  /**
   * Returns a new object of class '<em>Leaf List Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf List Statement</em>'.
   * @generated
   */
  LeafListStatement createLeafListStatement();

  /**
   * Returns a new object of class '<em>Leaf List Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Leaf List Substatement</em>'.
   * @generated
   */
  LeafListSubstatement createLeafListSubstatement();

  /**
   * Returns a new object of class '<em>Choice Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice Statement</em>'.
   * @generated
   */
  ChoiceStatement createChoiceStatement();

  /**
   * Returns a new object of class '<em>Choice Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choice Substatement</em>'.
   * @generated
   */
  ChoiceSubstatement createChoiceSubstatement();

  /**
   * Returns a new object of class '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Statement</em>'.
   * @generated
   */
  CaseStatement createCaseStatement();

  /**
   * Returns a new object of class '<em>Case Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Substatement</em>'.
   * @generated
   */
  CaseSubstatement createCaseSubstatement();

  /**
   * Returns a new object of class '<em>Anyxml Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anyxml Statement</em>'.
   * @generated
   */
  AnyxmlStatement createAnyxmlStatement();

  /**
   * Returns a new object of class '<em>Anyxml Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anyxml Substatement</em>'.
   * @generated
   */
  AnyxmlSubstatement createAnyxmlSubstatement();

  /**
   * Returns a new object of class '<em>Uses Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses Statement</em>'.
   * @generated
   */
  UsesStatement createUsesStatement();

  /**
   * Returns a new object of class '<em>Uses Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Uses Substatement</em>'.
   * @generated
   */
  UsesSubstatement createUsesSubstatement();

  /**
   * Returns a new object of class '<em>Augment Uses Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Augment Uses Statement</em>'.
   * @generated
   */
  AugmentUsesStatement createAugmentUsesStatement();

  /**
   * Returns a new object of class '<em>Augment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Augment Statement</em>'.
   * @generated
   */
  AugmentStatement createAugmentStatement();

  /**
   * Returns a new object of class '<em>Augment Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Augment Substatement</em>'.
   * @generated
   */
  AugmentSubstatement createAugmentSubstatement();

  /**
   * Returns a new object of class '<em>Refine Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refine Statement</em>'.
   * @generated
   */
  RefineStatement createRefineStatement();

  /**
   * Returns a new object of class '<em>Refine Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refine Substatement</em>'.
   * @generated
   */
  RefineSubstatement createRefineSubstatement();

  /**
   * Returns a new object of class '<em>Deviation Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deviation Statement</em>'.
   * @generated
   */
  DeviationStatement createDeviationStatement();

  /**
   * Returns a new object of class '<em>Deviation Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deviation Substatement</em>'.
   * @generated
   */
  DeviationSubstatement createDeviationSubstatement();

  /**
   * Returns a new object of class '<em>Deviate Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deviate Statement</em>'.
   * @generated
   */
  DeviateStatement createDeviateStatement();

  /**
   * Returns a new object of class '<em>Deviate Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Deviate Substatement</em>'.
   * @generated
   */
  DeviateSubstatement createDeviateSubstatement();

  /**
   * Returns a new object of class '<em>Extension Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Statement</em>'.
   * @generated
   */
  ExtensionStatement createExtensionStatement();

  /**
   * Returns a new object of class '<em>Extension Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extension Substatement</em>'.
   * @generated
   */
  ExtensionSubstatement createExtensionSubstatement();

  /**
   * Returns a new object of class '<em>Argument Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Statement</em>'.
   * @generated
   */
  ArgumentStatement createArgumentStatement();

  /**
   * Returns a new object of class '<em>Argument Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument Substatement</em>'.
   * @generated
   */
  ArgumentSubstatement createArgumentSubstatement();

  /**
   * Returns a new object of class '<em>Identity Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Statement</em>'.
   * @generated
   */
  IdentityStatement createIdentityStatement();

  /**
   * Returns a new object of class '<em>Identity Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Substatement</em>'.
   * @generated
   */
  IdentitySubstatement createIdentitySubstatement();

  /**
   * Returns a new object of class '<em>Feature Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Statement</em>'.
   * @generated
   */
  FeatureStatement createFeatureStatement();

  /**
   * Returns a new object of class '<em>Feature Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Substatement</em>'.
   * @generated
   */
  FeatureSubstatement createFeatureSubstatement();

  /**
   * Returns a new object of class '<em>Belongs To Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belongs To Statement</em>'.
   * @generated
   */
  BelongsToStatement createBelongsToStatement();

  /**
   * Returns a new object of class '<em>Belongs To Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Belongs To Substatement</em>'.
   * @generated
   */
  BelongsToSubstatement createBelongsToSubstatement();

  /**
   * Returns a new object of class '<em>Typedef Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef Statement</em>'.
   * @generated
   */
  TypedefStatement createTypedefStatement();

  /**
   * Returns a new object of class '<em>Typedef Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef Substatement</em>'.
   * @generated
   */
  TypedefSubstatement createTypedefSubstatement();

  /**
   * Returns a new object of class '<em>Type Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Statement</em>'.
   * @generated
   */
  TypeStatement createTypeStatement();

  /**
   * Returns a new object of class '<em>Type Sub Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Sub Statement</em>'.
   * @generated
   */
  TypeSubStatement createTypeSubStatement();

  /**
   * Returns a new object of class '<em>Bit Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Statement</em>'.
   * @generated
   */
  BitStatement createBitStatement();

  /**
   * Returns a new object of class '<em>Bit Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Substatement</em>'.
   * @generated
   */
  BitSubstatement createBitSubstatement();

  /**
   * Returns a new object of class '<em>Enum Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Statement</em>'.
   * @generated
   */
  EnumStatement createEnumStatement();

  /**
   * Returns a new object of class '<em>Enum Substatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Substatement</em>'.
   * @generated
   */
  EnumSubstatement createEnumSubstatement();

  /**
   * Returns a new object of class '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Statement</em>'.
   * @generated
   */
  ImportStatement createImportStatement();

  /**
   * Returns a new object of class '<em>Import Substatements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Substatements</em>'.
   * @generated
   */
  ImportSubstatements createImportSubstatements();

  /**
   * Returns a new object of class '<em>Include Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Statement</em>'.
   * @generated
   */
  IncludeStatement createIncludeStatement();

  /**
   * Returns a new object of class '<em>Include Substatements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Substatements</em>'.
   * @generated
   */
  IncludeSubstatements createIncludeSubstatements();

  /**
   * Returns a new object of class '<em>When Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Statement</em>'.
   * @generated
   */
  WhenStatement createWhenStatement();

  /**
   * Returns a new object of class '<em>When Substatements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>When Substatements</em>'.
   * @generated
   */
  WhenSubstatements createWhenSubstatements();

  /**
   * Returns a new object of class '<em>Revision Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Revision Statement</em>'.
   * @generated
   */
  RevisionStatement createRevisionStatement();

  /**
   * Returns a new object of class '<em>Revision Substatements</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Revision Substatements</em>'.
   * @generated
   */
  RevisionSubstatements createRevisionSubstatements();

  /**
   * Returns a new object of class '<em>Built In Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Built In Type</em>'.
   * @generated
   */
  BuiltInType createBuiltInType();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  YangPackage getYangPackage();

} //YangFactory
