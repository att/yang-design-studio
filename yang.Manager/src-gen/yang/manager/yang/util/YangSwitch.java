/**
 */
package yang.manager.yang.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import yang.manager.yang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see yang.manager.yang.YangPackage
 * @generated
 */
public class YangSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static YangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = YangPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case YangPackage.YANG_FILE:
      {
        YangFile yangFile = (YangFile)theEObject;
        T result = caseYangFile(yangFile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = caseYangFile(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MODULE_STATEMENT:
      {
        ModuleStatement moduleStatement = (ModuleStatement)theEObject;
        T result = caseModuleStatement(moduleStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.SUB_MODULE:
      {
        SubModule subModule = (SubModule)theEObject;
        T result = caseSubModule(subModule);
        if (result == null) result = caseYangFile(subModule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.SUBMODULE_STATEMENT:
      {
        SubmoduleStatement submoduleStatement = (SubmoduleStatement)theEObject;
        T result = caseSubmoduleStatement(submoduleStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DATADEF_STATEMENT:
      {
        DatadefStatement datadefStatement = (DatadefStatement)theEObject;
        T result = caseDatadefStatement(datadefStatement);
        if (result == null) result = caseModuleStatement(datadefStatement);
        if (result == null) result = caseSubmoduleStatement(datadefStatement);
        if (result == null) result = caseInputSubstatement(datadefStatement);
        if (result == null) result = caseOutputSubstatement(datadefStatement);
        if (result == null) result = caseNotificationSubstatement(datadefStatement);
        if (result == null) result = caseContainerSubstatement(datadefStatement);
        if (result == null) result = caseListSubstatement(datadefStatement);
        if (result == null) result = caseGroupingSubstatement(datadefStatement);
        if (result == null) result = caseCaseSubstatement(datadefStatement);
        if (result == null) result = caseAugmentSubstatement(datadefStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.YANG_VERSION_STATEMENT:
      {
        YangVersionStatement yangVersionStatement = (YangVersionStatement)theEObject;
        T result = caseYangVersionStatement(yangVersionStatement);
        if (result == null) result = caseModuleStatement(yangVersionStatement);
        if (result == null) result = caseSubmoduleStatement(yangVersionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ORGANIZATION_STATEMENT:
      {
        OrganizationStatement organizationStatement = (OrganizationStatement)theEObject;
        T result = caseOrganizationStatement(organizationStatement);
        if (result == null) result = caseModuleStatement(organizationStatement);
        if (result == null) result = caseSubmoduleStatement(organizationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CONTACT_STATEMENT:
      {
        ContactStatement contactStatement = (ContactStatement)theEObject;
        T result = caseContactStatement(contactStatement);
        if (result == null) result = caseModuleStatement(contactStatement);
        if (result == null) result = caseSubmoduleStatement(contactStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DESCRIPTION_STATEMENT:
      {
        DescriptionStatement descriptionStatement = (DescriptionStatement)theEObject;
        T result = caseDescriptionStatement(descriptionStatement);
        if (result == null) result = caseModuleStatement(descriptionStatement);
        if (result == null) result = caseSubmoduleStatement(descriptionStatement);
        if (result == null) result = caseMultipleSubstatement(descriptionStatement);
        if (result == null) result = caseRpcSubstatement(descriptionStatement);
        if (result == null) result = caseNotificationSubstatement(descriptionStatement);
        if (result == null) result = caseContainerSubstatement(descriptionStatement);
        if (result == null) result = caseListSubstatement(descriptionStatement);
        if (result == null) result = caseGroupingSubstatement(descriptionStatement);
        if (result == null) result = caseLeafSubstatement(descriptionStatement);
        if (result == null) result = caseLeafListSubstatement(descriptionStatement);
        if (result == null) result = caseChoiceSubstatement(descriptionStatement);
        if (result == null) result = caseCaseSubstatement(descriptionStatement);
        if (result == null) result = caseAnyxmlSubstatement(descriptionStatement);
        if (result == null) result = caseUsesSubstatement(descriptionStatement);
        if (result == null) result = caseAugmentSubstatement(descriptionStatement);
        if (result == null) result = caseRefineSubstatement(descriptionStatement);
        if (result == null) result = caseDeviationSubstatement(descriptionStatement);
        if (result == null) result = caseExtensionSubstatement(descriptionStatement);
        if (result == null) result = caseIdentitySubstatement(descriptionStatement);
        if (result == null) result = caseFeatureSubstatement(descriptionStatement);
        if (result == null) result = caseTypedefSubstatement(descriptionStatement);
        if (result == null) result = caseBitSubstatement(descriptionStatement);
        if (result == null) result = caseEnumSubstatement(descriptionStatement);
        if (result == null) result = caseWhenSubstatements(descriptionStatement);
        if (result == null) result = caseRevisionSubstatements(descriptionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REFERENCE_STATEMENT:
      {
        ReferenceStatement referenceStatement = (ReferenceStatement)theEObject;
        T result = caseReferenceStatement(referenceStatement);
        if (result == null) result = caseMultipleSubstatement(referenceStatement);
        if (result == null) result = caseRpcSubstatement(referenceStatement);
        if (result == null) result = caseNotificationSubstatement(referenceStatement);
        if (result == null) result = caseContainerSubstatement(referenceStatement);
        if (result == null) result = caseListSubstatement(referenceStatement);
        if (result == null) result = caseGroupingSubstatement(referenceStatement);
        if (result == null) result = caseLeafSubstatement(referenceStatement);
        if (result == null) result = caseLeafListSubstatement(referenceStatement);
        if (result == null) result = caseChoiceSubstatement(referenceStatement);
        if (result == null) result = caseCaseSubstatement(referenceStatement);
        if (result == null) result = caseAnyxmlSubstatement(referenceStatement);
        if (result == null) result = caseUsesSubstatement(referenceStatement);
        if (result == null) result = caseAugmentSubstatement(referenceStatement);
        if (result == null) result = caseRefineSubstatement(referenceStatement);
        if (result == null) result = caseDeviationSubstatement(referenceStatement);
        if (result == null) result = caseExtensionSubstatement(referenceStatement);
        if (result == null) result = caseIdentitySubstatement(referenceStatement);
        if (result == null) result = caseFeatureSubstatement(referenceStatement);
        if (result == null) result = caseTypedefSubstatement(referenceStatement);
        if (result == null) result = caseBitSubstatement(referenceStatement);
        if (result == null) result = caseEnumSubstatement(referenceStatement);
        if (result == null) result = caseWhenSubstatements(referenceStatement);
        if (result == null) result = caseRevisionSubstatements(referenceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.NAMESPACE_STATEMENT:
      {
        NamespaceStatement namespaceStatement = (NamespaceStatement)theEObject;
        T result = caseNamespaceStatement(namespaceStatement);
        if (result == null) result = caseModuleStatement(namespaceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.PREFIX_STATEMENT:
      {
        PrefixStatement prefixStatement = (PrefixStatement)theEObject;
        T result = casePrefixStatement(prefixStatement);
        if (result == null) result = caseModuleStatement(prefixStatement);
        if (result == null) result = caseBelongsToSubstatement(prefixStatement);
        if (result == null) result = caseImportSubstatements(prefixStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REQUIRE_INSTANCE_STATEMENT:
      {
        RequireInstanceStatement requireInstanceStatement = (RequireInstanceStatement)theEObject;
        T result = caseRequireInstanceStatement(requireInstanceStatement);
        if (result == null) result = caseTypeSubStatement(requireInstanceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.PATH_STATEMENT:
      {
        PathStatement pathStatement = (PathStatement)theEObject;
        T result = casePathStatement(pathStatement);
        if (result == null) result = caseTypeSubStatement(pathStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.POSITION_STATEMENT:
      {
        PositionStatement positionStatement = (PositionStatement)theEObject;
        T result = casePositionStatement(positionStatement);
        if (result == null) result = caseBitSubstatement(positionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.VALUE_STATEMENT:
      {
        ValueStatement valueStatement = (ValueStatement)theEObject;
        T result = caseValueStatement(valueStatement);
        if (result == null) result = caseEnumSubstatement(valueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ERROR_APP_TAG_STATEMENT:
      {
        ErrorAppTagStatement errorAppTagStatement = (ErrorAppTagStatement)theEObject;
        T result = caseErrorAppTagStatement(errorAppTagStatement);
        if (result == null) result = caseMultipleSubstatement(errorAppTagStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ERROR_MESSAGE_STATEMENT:
      {
        ErrorMessageStatement errorMessageStatement = (ErrorMessageStatement)theEObject;
        T result = caseErrorMessageStatement(errorMessageStatement);
        if (result == null) result = caseMultipleSubstatement(errorMessageStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.UNITS_STATEMENT:
      {
        UnitsStatement unitsStatement = (UnitsStatement)theEObject;
        T result = caseUnitsStatement(unitsStatement);
        if (result == null) result = caseLeafSubstatement(unitsStatement);
        if (result == null) result = caseLeafListSubstatement(unitsStatement);
        if (result == null) result = caseDeviateSubstatement(unitsStatement);
        if (result == null) result = caseTypedefSubstatement(unitsStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DEFAULT_STATEMENT:
      {
        DefaultStatement defaultStatement = (DefaultStatement)theEObject;
        T result = caseDefaultStatement(defaultStatement);
        if (result == null) result = caseLeafSubstatement(defaultStatement);
        if (result == null) result = caseLeafListSubstatement(defaultStatement);
        if (result == null) result = caseChoiceSubstatement(defaultStatement);
        if (result == null) result = caseRefineSubstatement(defaultStatement);
        if (result == null) result = caseDeviateSubstatement(defaultStatement);
        if (result == null) result = caseTypedefSubstatement(defaultStatement);
        if (result == null) result = caseTypeSubStatement(defaultStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.STATUS_STATEMENT:
      {
        StatusStatement statusStatement = (StatusStatement)theEObject;
        T result = caseStatusStatement(statusStatement);
        if (result == null) result = caseRpcSubstatement(statusStatement);
        if (result == null) result = caseNotificationSubstatement(statusStatement);
        if (result == null) result = caseContainerSubstatement(statusStatement);
        if (result == null) result = caseListSubstatement(statusStatement);
        if (result == null) result = caseGroupingSubstatement(statusStatement);
        if (result == null) result = caseLeafSubstatement(statusStatement);
        if (result == null) result = caseLeafListSubstatement(statusStatement);
        if (result == null) result = caseChoiceSubstatement(statusStatement);
        if (result == null) result = caseCaseSubstatement(statusStatement);
        if (result == null) result = caseAnyxmlSubstatement(statusStatement);
        if (result == null) result = caseUsesSubstatement(statusStatement);
        if (result == null) result = caseAugmentSubstatement(statusStatement);
        if (result == null) result = caseExtensionSubstatement(statusStatement);
        if (result == null) result = caseIdentitySubstatement(statusStatement);
        if (result == null) result = caseFeatureSubstatement(statusStatement);
        if (result == null) result = caseTypedefSubstatement(statusStatement);
        if (result == null) result = caseBitSubstatement(statusStatement);
        if (result == null) result = caseEnumSubstatement(statusStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REVISION_DATE_STATEMENT:
      {
        RevisionDateStatement revisionDateStatement = (RevisionDateStatement)theEObject;
        T result = caseRevisionDateStatement(revisionDateStatement);
        if (result == null) result = caseImportSubstatements(revisionDateStatement);
        if (result == null) result = caseIncludeSubstatements(revisionDateStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.UNIQUE_STATEMENT:
      {
        UniqueStatement uniqueStatement = (UniqueStatement)theEObject;
        T result = caseUniqueStatement(uniqueStatement);
        if (result == null) result = caseListSubstatement(uniqueStatement);
        if (result == null) result = caseDeviateSubstatement(uniqueStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.KEY_STATEMENT:
      {
        KeyStatement keyStatement = (KeyStatement)theEObject;
        T result = caseKeyStatement(keyStatement);
        if (result == null) result = caseListSubstatement(keyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ORDEREDBY_STATEMENT:
      {
        OrderedbyStatement orderedbyStatement = (OrderedbyStatement)theEObject;
        T result = caseOrderedbyStatement(orderedbyStatement);
        if (result == null) result = caseListSubstatement(orderedbyStatement);
        if (result == null) result = caseLeafListSubstatement(orderedbyStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.PRESENCE_STATEMENT:
      {
        PresenceStatement presenceStatement = (PresenceStatement)theEObject;
        T result = casePresenceStatement(presenceStatement);
        if (result == null) result = caseContainerSubstatement(presenceStatement);
        if (result == null) result = caseRefineSubstatement(presenceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MANDATORY_STATEMENT:
      {
        MandatoryStatement mandatoryStatement = (MandatoryStatement)theEObject;
        T result = caseMandatoryStatement(mandatoryStatement);
        if (result == null) result = caseLeafSubstatement(mandatoryStatement);
        if (result == null) result = caseChoiceSubstatement(mandatoryStatement);
        if (result == null) result = caseAnyxmlSubstatement(mandatoryStatement);
        if (result == null) result = caseRefineSubstatement(mandatoryStatement);
        if (result == null) result = caseDeviateSubstatement(mandatoryStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CONFIG_STATEMENT:
      {
        ConfigStatement configStatement = (ConfigStatement)theEObject;
        T result = caseConfigStatement(configStatement);
        if (result == null) result = caseContainerSubstatement(configStatement);
        if (result == null) result = caseListSubstatement(configStatement);
        if (result == null) result = caseLeafSubstatement(configStatement);
        if (result == null) result = caseLeafListSubstatement(configStatement);
        if (result == null) result = caseChoiceSubstatement(configStatement);
        if (result == null) result = caseAnyxmlSubstatement(configStatement);
        if (result == null) result = caseRefineSubstatement(configStatement);
        if (result == null) result = caseDeviateSubstatement(configStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.FRACTION_DIGITS_STATEMENT:
      {
        FractionDigitsStatement fractionDigitsStatement = (FractionDigitsStatement)theEObject;
        T result = caseFractionDigitsStatement(fractionDigitsStatement);
        if (result == null) result = caseTypeSubStatement(fractionDigitsStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.IF_FEATURE_STATEMENT:
      {
        IfFeatureStatement ifFeatureStatement = (IfFeatureStatement)theEObject;
        T result = caseIfFeatureStatement(ifFeatureStatement);
        if (result == null) result = caseRpcSubstatement(ifFeatureStatement);
        if (result == null) result = caseNotificationSubstatement(ifFeatureStatement);
        if (result == null) result = caseContainerSubstatement(ifFeatureStatement);
        if (result == null) result = caseListSubstatement(ifFeatureStatement);
        if (result == null) result = caseLeafSubstatement(ifFeatureStatement);
        if (result == null) result = caseLeafListSubstatement(ifFeatureStatement);
        if (result == null) result = caseChoiceSubstatement(ifFeatureStatement);
        if (result == null) result = caseCaseSubstatement(ifFeatureStatement);
        if (result == null) result = caseAnyxmlSubstatement(ifFeatureStatement);
        if (result == null) result = caseUsesSubstatement(ifFeatureStatement);
        if (result == null) result = caseAugmentSubstatement(ifFeatureStatement);
        if (result == null) result = caseFeatureSubstatement(ifFeatureStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.BASE_STATEMENT:
      {
        BaseStatement baseStatement = (BaseStatement)theEObject;
        T result = caseBaseStatement(baseStatement);
        if (result == null) result = caseIdentitySubstatement(baseStatement);
        if (result == null) result = caseTypeSubStatement(baseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.YIN_ELEMENT_STATEMENT:
      {
        YinElementStatement yinElementStatement = (YinElementStatement)theEObject;
        T result = caseYinElementStatement(yinElementStatement);
        if (result == null) result = caseArgumentSubstatement(yinElementStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MIN_ELEMENTS_STATEMENT:
      {
        MinElementsStatement minElementsStatement = (MinElementsStatement)theEObject;
        T result = caseMinElementsStatement(minElementsStatement);
        if (result == null) result = caseListSubstatement(minElementsStatement);
        if (result == null) result = caseLeafListSubstatement(minElementsStatement);
        if (result == null) result = caseRefineSubstatement(minElementsStatement);
        if (result == null) result = caseDeviateSubstatement(minElementsStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MAX_ELEMENTS_STATEMENT:
      {
        MaxElementsStatement maxElementsStatement = (MaxElementsStatement)theEObject;
        T result = caseMaxElementsStatement(maxElementsStatement);
        if (result == null) result = caseListSubstatement(maxElementsStatement);
        if (result == null) result = caseLeafListSubstatement(maxElementsStatement);
        if (result == null) result = caseRefineSubstatement(maxElementsStatement);
        if (result == null) result = caseDeviateSubstatement(maxElementsStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.UNKNOWN_STATEMENT:
      {
        UnknownStatement unknownStatement = (UnknownStatement)theEObject;
        T result = caseUnknownStatement(unknownStatement);
        if (result == null) result = caseModuleStatement(unknownStatement);
        if (result == null) result = caseSubmoduleStatement(unknownStatement);
        if (result == null) result = caseMultipleSubstatement(unknownStatement);
        if (result == null) result = caseRpcSubstatement(unknownStatement);
        if (result == null) result = caseInputSubstatement(unknownStatement);
        if (result == null) result = caseOutputSubstatement(unknownStatement);
        if (result == null) result = caseNotificationSubstatement(unknownStatement);
        if (result == null) result = caseContainerSubstatement(unknownStatement);
        if (result == null) result = caseListSubstatement(unknownStatement);
        if (result == null) result = caseGroupingSubstatement(unknownStatement);
        if (result == null) result = caseLeafSubstatement(unknownStatement);
        if (result == null) result = caseLeafListSubstatement(unknownStatement);
        if (result == null) result = caseChoiceSubstatement(unknownStatement);
        if (result == null) result = caseCaseSubstatement(unknownStatement);
        if (result == null) result = caseAnyxmlSubstatement(unknownStatement);
        if (result == null) result = caseUsesSubstatement(unknownStatement);
        if (result == null) result = caseAugmentSubstatement(unknownStatement);
        if (result == null) result = caseRefineSubstatement(unknownStatement);
        if (result == null) result = caseDeviationSubstatement(unknownStatement);
        if (result == null) result = caseDeviateSubstatement(unknownStatement);
        if (result == null) result = caseExtensionSubstatement(unknownStatement);
        if (result == null) result = caseArgumentSubstatement(unknownStatement);
        if (result == null) result = caseIdentitySubstatement(unknownStatement);
        if (result == null) result = caseFeatureSubstatement(unknownStatement);
        if (result == null) result = caseBelongsToSubstatement(unknownStatement);
        if (result == null) result = caseTypedefSubstatement(unknownStatement);
        if (result == null) result = caseTypeSubStatement(unknownStatement);
        if (result == null) result = caseBitSubstatement(unknownStatement);
        if (result == null) result = caseEnumSubstatement(unknownStatement);
        if (result == null) result = caseImportSubstatements(unknownStatement);
        if (result == null) result = caseIncludeSubstatements(unknownStatement);
        if (result == null) result = caseWhenSubstatements(unknownStatement);
        if (result == null) result = caseRevisionSubstatements(unknownStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.UNKNOWN_SUBSTATEMENTS:
      {
        UnknownSubstatements unknownSubstatements = (UnknownSubstatements)theEObject;
        T result = caseUnknownSubstatements(unknownSubstatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.RANGE_STATEMENT:
      {
        RangeStatement rangeStatement = (RangeStatement)theEObject;
        T result = caseRangeStatement(rangeStatement);
        if (result == null) result = caseTypeSubStatement(rangeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.PATTERN_STATEMENT:
      {
        PatternStatement patternStatement = (PatternStatement)theEObject;
        T result = casePatternStatement(patternStatement);
        if (result == null) result = caseTypeSubStatement(patternStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LENGTH_STATEMENT:
      {
        LengthStatement lengthStatement = (LengthStatement)theEObject;
        T result = caseLengthStatement(lengthStatement);
        if (result == null) result = caseTypeSubStatement(lengthStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MUST_STATEMENT:
      {
        MustStatement mustStatement = (MustStatement)theEObject;
        T result = caseMustStatement(mustStatement);
        if (result == null) result = caseContainerSubstatement(mustStatement);
        if (result == null) result = caseListSubstatement(mustStatement);
        if (result == null) result = caseLeafSubstatement(mustStatement);
        if (result == null) result = caseLeafListSubstatement(mustStatement);
        if (result == null) result = caseAnyxmlSubstatement(mustStatement);
        if (result == null) result = caseRefineSubstatement(mustStatement);
        if (result == null) result = caseDeviateSubstatement(mustStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.MULTIPLE_SUBSTATEMENT:
      {
        MultipleSubstatement multipleSubstatement = (MultipleSubstatement)theEObject;
        T result = caseMultipleSubstatement(multipleSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.RPC_STATEMENT:
      {
        RpcStatement rpcStatement = (RpcStatement)theEObject;
        T result = caseRpcStatement(rpcStatement);
        if (result == null) result = caseModuleStatement(rpcStatement);
        if (result == null) result = caseSubmoduleStatement(rpcStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.RPC_SUBSTATEMENT:
      {
        RpcSubstatement rpcSubstatement = (RpcSubstatement)theEObject;
        T result = caseRpcSubstatement(rpcSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.INPUT_STATEMENT:
      {
        InputStatement inputStatement = (InputStatement)theEObject;
        T result = caseInputStatement(inputStatement);
        if (result == null) result = caseRpcSubstatement(inputStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.INPUT_SUBSTATEMENT:
      {
        InputSubstatement inputSubstatement = (InputSubstatement)theEObject;
        T result = caseInputSubstatement(inputSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.OUTPUT_STATEMENT:
      {
        OutputStatement outputStatement = (OutputStatement)theEObject;
        T result = caseOutputStatement(outputStatement);
        if (result == null) result = caseRpcSubstatement(outputStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.OUTPUT_SUBSTATEMENT:
      {
        OutputSubstatement outputSubstatement = (OutputSubstatement)theEObject;
        T result = caseOutputSubstatement(outputSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.NOTIFICATION_STATEMENT:
      {
        NotificationStatement notificationStatement = (NotificationStatement)theEObject;
        T result = caseNotificationStatement(notificationStatement);
        if (result == null) result = caseModuleStatement(notificationStatement);
        if (result == null) result = caseSubmoduleStatement(notificationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.NOTIFICATION_SUBSTATEMENT:
      {
        NotificationSubstatement notificationSubstatement = (NotificationSubstatement)theEObject;
        T result = caseNotificationSubstatement(notificationSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CONTAINER_STATEMENT:
      {
        ContainerStatement containerStatement = (ContainerStatement)theEObject;
        T result = caseContainerStatement(containerStatement);
        if (result == null) result = caseDatadefStatement(containerStatement);
        if (result == null) result = caseChoiceSubstatement(containerStatement);
        if (result == null) result = caseModuleStatement(containerStatement);
        if (result == null) result = caseSubmoduleStatement(containerStatement);
        if (result == null) result = caseInputSubstatement(containerStatement);
        if (result == null) result = caseOutputSubstatement(containerStatement);
        if (result == null) result = caseNotificationSubstatement(containerStatement);
        if (result == null) result = caseContainerSubstatement(containerStatement);
        if (result == null) result = caseListSubstatement(containerStatement);
        if (result == null) result = caseGroupingSubstatement(containerStatement);
        if (result == null) result = caseCaseSubstatement(containerStatement);
        if (result == null) result = caseAugmentSubstatement(containerStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CONTAINER_SUBSTATEMENT:
      {
        ContainerSubstatement containerSubstatement = (ContainerSubstatement)theEObject;
        T result = caseContainerSubstatement(containerSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LIST_STATEMENT:
      {
        ListStatement listStatement = (ListStatement)theEObject;
        T result = caseListStatement(listStatement);
        if (result == null) result = caseDatadefStatement(listStatement);
        if (result == null) result = caseChoiceSubstatement(listStatement);
        if (result == null) result = caseModuleStatement(listStatement);
        if (result == null) result = caseSubmoduleStatement(listStatement);
        if (result == null) result = caseInputSubstatement(listStatement);
        if (result == null) result = caseOutputSubstatement(listStatement);
        if (result == null) result = caseNotificationSubstatement(listStatement);
        if (result == null) result = caseContainerSubstatement(listStatement);
        if (result == null) result = caseListSubstatement(listStatement);
        if (result == null) result = caseGroupingSubstatement(listStatement);
        if (result == null) result = caseCaseSubstatement(listStatement);
        if (result == null) result = caseAugmentSubstatement(listStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LIST_SUBSTATEMENT:
      {
        ListSubstatement listSubstatement = (ListSubstatement)theEObject;
        T result = caseListSubstatement(listSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.GROUPING_STATEMENT:
      {
        GroupingStatement groupingStatement = (GroupingStatement)theEObject;
        T result = caseGroupingStatement(groupingStatement);
        if (result == null) result = caseModuleStatement(groupingStatement);
        if (result == null) result = caseSubmoduleStatement(groupingStatement);
        if (result == null) result = caseRpcSubstatement(groupingStatement);
        if (result == null) result = caseInputSubstatement(groupingStatement);
        if (result == null) result = caseOutputSubstatement(groupingStatement);
        if (result == null) result = caseNotificationSubstatement(groupingStatement);
        if (result == null) result = caseContainerSubstatement(groupingStatement);
        if (result == null) result = caseListSubstatement(groupingStatement);
        if (result == null) result = caseGroupingSubstatement(groupingStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.GROUPING_SUBSTATEMENT:
      {
        GroupingSubstatement groupingSubstatement = (GroupingSubstatement)theEObject;
        T result = caseGroupingSubstatement(groupingSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LEAF_STATEMENT:
      {
        LeafStatement leafStatement = (LeafStatement)theEObject;
        T result = caseLeafStatement(leafStatement);
        if (result == null) result = caseDatadefStatement(leafStatement);
        if (result == null) result = caseChoiceSubstatement(leafStatement);
        if (result == null) result = caseModuleStatement(leafStatement);
        if (result == null) result = caseSubmoduleStatement(leafStatement);
        if (result == null) result = caseInputSubstatement(leafStatement);
        if (result == null) result = caseOutputSubstatement(leafStatement);
        if (result == null) result = caseNotificationSubstatement(leafStatement);
        if (result == null) result = caseContainerSubstatement(leafStatement);
        if (result == null) result = caseListSubstatement(leafStatement);
        if (result == null) result = caseGroupingSubstatement(leafStatement);
        if (result == null) result = caseCaseSubstatement(leafStatement);
        if (result == null) result = caseAugmentSubstatement(leafStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LEAF_SUBSTATEMENT:
      {
        LeafSubstatement leafSubstatement = (LeafSubstatement)theEObject;
        T result = caseLeafSubstatement(leafSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LEAF_LIST_STATEMENT:
      {
        LeafListStatement leafListStatement = (LeafListStatement)theEObject;
        T result = caseLeafListStatement(leafListStatement);
        if (result == null) result = caseDatadefStatement(leafListStatement);
        if (result == null) result = caseChoiceSubstatement(leafListStatement);
        if (result == null) result = caseModuleStatement(leafListStatement);
        if (result == null) result = caseSubmoduleStatement(leafListStatement);
        if (result == null) result = caseInputSubstatement(leafListStatement);
        if (result == null) result = caseOutputSubstatement(leafListStatement);
        if (result == null) result = caseNotificationSubstatement(leafListStatement);
        if (result == null) result = caseContainerSubstatement(leafListStatement);
        if (result == null) result = caseListSubstatement(leafListStatement);
        if (result == null) result = caseGroupingSubstatement(leafListStatement);
        if (result == null) result = caseCaseSubstatement(leafListStatement);
        if (result == null) result = caseAugmentSubstatement(leafListStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.LEAF_LIST_SUBSTATEMENT:
      {
        LeafListSubstatement leafListSubstatement = (LeafListSubstatement)theEObject;
        T result = caseLeafListSubstatement(leafListSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CHOICE_STATEMENT:
      {
        ChoiceStatement choiceStatement = (ChoiceStatement)theEObject;
        T result = caseChoiceStatement(choiceStatement);
        if (result == null) result = caseDatadefStatement(choiceStatement);
        if (result == null) result = caseModuleStatement(choiceStatement);
        if (result == null) result = caseSubmoduleStatement(choiceStatement);
        if (result == null) result = caseInputSubstatement(choiceStatement);
        if (result == null) result = caseOutputSubstatement(choiceStatement);
        if (result == null) result = caseNotificationSubstatement(choiceStatement);
        if (result == null) result = caseContainerSubstatement(choiceStatement);
        if (result == null) result = caseListSubstatement(choiceStatement);
        if (result == null) result = caseGroupingSubstatement(choiceStatement);
        if (result == null) result = caseCaseSubstatement(choiceStatement);
        if (result == null) result = caseAugmentSubstatement(choiceStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CHOICE_SUBSTATEMENT:
      {
        ChoiceSubstatement choiceSubstatement = (ChoiceSubstatement)theEObject;
        T result = caseChoiceSubstatement(choiceSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CASE_STATEMENT:
      {
        CaseStatement caseStatement = (CaseStatement)theEObject;
        T result = caseCaseStatement(caseStatement);
        if (result == null) result = caseChoiceSubstatement(caseStatement);
        if (result == null) result = caseAugmentSubstatement(caseStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.CASE_SUBSTATEMENT:
      {
        CaseSubstatement caseSubstatement = (CaseSubstatement)theEObject;
        T result = caseCaseSubstatement(caseSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ANYXML_STATEMENT:
      {
        AnyxmlStatement anyxmlStatement = (AnyxmlStatement)theEObject;
        T result = caseAnyxmlStatement(anyxmlStatement);
        if (result == null) result = caseDatadefStatement(anyxmlStatement);
        if (result == null) result = caseChoiceSubstatement(anyxmlStatement);
        if (result == null) result = caseModuleStatement(anyxmlStatement);
        if (result == null) result = caseSubmoduleStatement(anyxmlStatement);
        if (result == null) result = caseInputSubstatement(anyxmlStatement);
        if (result == null) result = caseOutputSubstatement(anyxmlStatement);
        if (result == null) result = caseNotificationSubstatement(anyxmlStatement);
        if (result == null) result = caseContainerSubstatement(anyxmlStatement);
        if (result == null) result = caseListSubstatement(anyxmlStatement);
        if (result == null) result = caseGroupingSubstatement(anyxmlStatement);
        if (result == null) result = caseCaseSubstatement(anyxmlStatement);
        if (result == null) result = caseAugmentSubstatement(anyxmlStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ANYXML_SUBSTATEMENT:
      {
        AnyxmlSubstatement anyxmlSubstatement = (AnyxmlSubstatement)theEObject;
        T result = caseAnyxmlSubstatement(anyxmlSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.USES_STATEMENT:
      {
        UsesStatement usesStatement = (UsesStatement)theEObject;
        T result = caseUsesStatement(usesStatement);
        if (result == null) result = caseDatadefStatement(usesStatement);
        if (result == null) result = caseModuleStatement(usesStatement);
        if (result == null) result = caseSubmoduleStatement(usesStatement);
        if (result == null) result = caseInputSubstatement(usesStatement);
        if (result == null) result = caseOutputSubstatement(usesStatement);
        if (result == null) result = caseNotificationSubstatement(usesStatement);
        if (result == null) result = caseContainerSubstatement(usesStatement);
        if (result == null) result = caseListSubstatement(usesStatement);
        if (result == null) result = caseGroupingSubstatement(usesStatement);
        if (result == null) result = caseCaseSubstatement(usesStatement);
        if (result == null) result = caseAugmentSubstatement(usesStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.USES_SUBSTATEMENT:
      {
        UsesSubstatement usesSubstatement = (UsesSubstatement)theEObject;
        T result = caseUsesSubstatement(usesSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.AUGMENT_USES_STATEMENT:
      {
        AugmentUsesStatement augmentUsesStatement = (AugmentUsesStatement)theEObject;
        T result = caseAugmentUsesStatement(augmentUsesStatement);
        if (result == null) result = caseUsesSubstatement(augmentUsesStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.AUGMENT_STATEMENT:
      {
        AugmentStatement augmentStatement = (AugmentStatement)theEObject;
        T result = caseAugmentStatement(augmentStatement);
        if (result == null) result = caseModuleStatement(augmentStatement);
        if (result == null) result = caseSubmoduleStatement(augmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.AUGMENT_SUBSTATEMENT:
      {
        AugmentSubstatement augmentSubstatement = (AugmentSubstatement)theEObject;
        T result = caseAugmentSubstatement(augmentSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REFINE_STATEMENT:
      {
        RefineStatement refineStatement = (RefineStatement)theEObject;
        T result = caseRefineStatement(refineStatement);
        if (result == null) result = caseUsesSubstatement(refineStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REFINE_SUBSTATEMENT:
      {
        RefineSubstatement refineSubstatement = (RefineSubstatement)theEObject;
        T result = caseRefineSubstatement(refineSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DEVIATION_STATEMENT:
      {
        DeviationStatement deviationStatement = (DeviationStatement)theEObject;
        T result = caseDeviationStatement(deviationStatement);
        if (result == null) result = caseModuleStatement(deviationStatement);
        if (result == null) result = caseSubmoduleStatement(deviationStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DEVIATION_SUBSTATEMENT:
      {
        DeviationSubstatement deviationSubstatement = (DeviationSubstatement)theEObject;
        T result = caseDeviationSubstatement(deviationSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DEVIATE_STATEMENT:
      {
        DeviateStatement deviateStatement = (DeviateStatement)theEObject;
        T result = caseDeviateStatement(deviateStatement);
        if (result == null) result = caseDeviationSubstatement(deviateStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.DEVIATE_SUBSTATEMENT:
      {
        DeviateSubstatement deviateSubstatement = (DeviateSubstatement)theEObject;
        T result = caseDeviateSubstatement(deviateSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.EXTENSION_STATEMENT:
      {
        ExtensionStatement extensionStatement = (ExtensionStatement)theEObject;
        T result = caseExtensionStatement(extensionStatement);
        if (result == null) result = caseModuleStatement(extensionStatement);
        if (result == null) result = caseSubmoduleStatement(extensionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.EXTENSION_SUBSTATEMENT:
      {
        ExtensionSubstatement extensionSubstatement = (ExtensionSubstatement)theEObject;
        T result = caseExtensionSubstatement(extensionSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ARGUMENT_STATEMENT:
      {
        ArgumentStatement argumentStatement = (ArgumentStatement)theEObject;
        T result = caseArgumentStatement(argumentStatement);
        if (result == null) result = caseExtensionSubstatement(argumentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ARGUMENT_SUBSTATEMENT:
      {
        ArgumentSubstatement argumentSubstatement = (ArgumentSubstatement)theEObject;
        T result = caseArgumentSubstatement(argumentSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.IDENTITY_STATEMENT:
      {
        IdentityStatement identityStatement = (IdentityStatement)theEObject;
        T result = caseIdentityStatement(identityStatement);
        if (result == null) result = caseModuleStatement(identityStatement);
        if (result == null) result = caseSubmoduleStatement(identityStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.IDENTITY_SUBSTATEMENT:
      {
        IdentitySubstatement identitySubstatement = (IdentitySubstatement)theEObject;
        T result = caseIdentitySubstatement(identitySubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.FEATURE_STATEMENT:
      {
        FeatureStatement featureStatement = (FeatureStatement)theEObject;
        T result = caseFeatureStatement(featureStatement);
        if (result == null) result = caseModuleStatement(featureStatement);
        if (result == null) result = caseSubmoduleStatement(featureStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.FEATURE_SUBSTATEMENT:
      {
        FeatureSubstatement featureSubstatement = (FeatureSubstatement)theEObject;
        T result = caseFeatureSubstatement(featureSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.BELONGS_TO_STATEMENT:
      {
        BelongsToStatement belongsToStatement = (BelongsToStatement)theEObject;
        T result = caseBelongsToStatement(belongsToStatement);
        if (result == null) result = caseSubmoduleStatement(belongsToStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.BELONGS_TO_SUBSTATEMENT:
      {
        BelongsToSubstatement belongsToSubstatement = (BelongsToSubstatement)theEObject;
        T result = caseBelongsToSubstatement(belongsToSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.TYPEDEF_STATEMENT:
      {
        TypedefStatement typedefStatement = (TypedefStatement)theEObject;
        T result = caseTypedefStatement(typedefStatement);
        if (result == null) result = caseModuleStatement(typedefStatement);
        if (result == null) result = caseSubmoduleStatement(typedefStatement);
        if (result == null) result = caseRpcSubstatement(typedefStatement);
        if (result == null) result = caseInputSubstatement(typedefStatement);
        if (result == null) result = caseOutputSubstatement(typedefStatement);
        if (result == null) result = caseNotificationSubstatement(typedefStatement);
        if (result == null) result = caseContainerSubstatement(typedefStatement);
        if (result == null) result = caseListSubstatement(typedefStatement);
        if (result == null) result = caseGroupingSubstatement(typedefStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.TYPEDEF_SUBSTATEMENT:
      {
        TypedefSubstatement typedefSubstatement = (TypedefSubstatement)theEObject;
        T result = caseTypedefSubstatement(typedefSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.TYPE_STATEMENT:
      {
        TypeStatement typeStatement = (TypeStatement)theEObject;
        T result = caseTypeStatement(typeStatement);
        if (result == null) result = caseLeafSubstatement(typeStatement);
        if (result == null) result = caseLeafListSubstatement(typeStatement);
        if (result == null) result = caseTypedefSubstatement(typeStatement);
        if (result == null) result = caseTypeSubStatement(typeStatement);
        if (result == null) result = caseImportSubstatements(typeStatement);
        if (result == null) result = caseIncludeSubstatements(typeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.TYPE_SUB_STATEMENT:
      {
        TypeSubStatement typeSubStatement = (TypeSubStatement)theEObject;
        T result = caseTypeSubStatement(typeSubStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.BIT_STATEMENT:
      {
        BitStatement bitStatement = (BitStatement)theEObject;
        T result = caseBitStatement(bitStatement);
        if (result == null) result = caseTypeSubStatement(bitStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.BIT_SUBSTATEMENT:
      {
        BitSubstatement bitSubstatement = (BitSubstatement)theEObject;
        T result = caseBitSubstatement(bitSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ENUM_STATEMENT:
      {
        EnumStatement enumStatement = (EnumStatement)theEObject;
        T result = caseEnumStatement(enumStatement);
        if (result == null) result = caseTypeSubStatement(enumStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.ENUM_SUBSTATEMENT:
      {
        EnumSubstatement enumSubstatement = (EnumSubstatement)theEObject;
        T result = caseEnumSubstatement(enumSubstatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
        if (result == null) result = caseModuleStatement(importStatement);
        if (result == null) result = caseSubmoduleStatement(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.IMPORT_SUBSTATEMENTS:
      {
        ImportSubstatements importSubstatements = (ImportSubstatements)theEObject;
        T result = caseImportSubstatements(importSubstatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.INCLUDE_STATEMENT:
      {
        IncludeStatement includeStatement = (IncludeStatement)theEObject;
        T result = caseIncludeStatement(includeStatement);
        if (result == null) result = caseModuleStatement(includeStatement);
        if (result == null) result = caseSubmoduleStatement(includeStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.INCLUDE_SUBSTATEMENTS:
      {
        IncludeSubstatements includeSubstatements = (IncludeSubstatements)theEObject;
        T result = caseIncludeSubstatements(includeSubstatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.WHEN_STATEMENT:
      {
        WhenStatement whenStatement = (WhenStatement)theEObject;
        T result = caseWhenStatement(whenStatement);
        if (result == null) result = caseContainerSubstatement(whenStatement);
        if (result == null) result = caseListSubstatement(whenStatement);
        if (result == null) result = caseLeafSubstatement(whenStatement);
        if (result == null) result = caseLeafListSubstatement(whenStatement);
        if (result == null) result = caseChoiceSubstatement(whenStatement);
        if (result == null) result = caseCaseSubstatement(whenStatement);
        if (result == null) result = caseAnyxmlSubstatement(whenStatement);
        if (result == null) result = caseUsesSubstatement(whenStatement);
        if (result == null) result = caseAugmentSubstatement(whenStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.WHEN_SUBSTATEMENTS:
      {
        WhenSubstatements whenSubstatements = (WhenSubstatements)theEObject;
        T result = caseWhenSubstatements(whenSubstatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REVISION_STATEMENT:
      {
        RevisionStatement revisionStatement = (RevisionStatement)theEObject;
        T result = caseRevisionStatement(revisionStatement);
        if (result == null) result = caseModuleStatement(revisionStatement);
        if (result == null) result = caseSubmoduleStatement(revisionStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.REVISION_SUBSTATEMENTS:
      {
        RevisionSubstatements revisionSubstatements = (RevisionSubstatements)theEObject;
        T result = caseRevisionSubstatements(revisionSubstatements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YangPackage.BUILT_IN_TYPE:
      {
        BuiltInType builtInType = (BuiltInType)theEObject;
        T result = caseBuiltInType(builtInType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>File</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>File</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYangFile(YangFile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleStatement(ModuleStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubModule(SubModule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Submodule Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Submodule Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubmoduleStatement(SubmoduleStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Datadef Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Datadef Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDatadefStatement(DatadefStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Version Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Version Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYangVersionStatement(YangVersionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organization Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organization Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganizationStatement(OrganizationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contact Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contact Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContactStatement(ContactStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescriptionStatement(DescriptionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceStatement(ReferenceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespaceStatement(NamespaceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixStatement(PrefixStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Require Instance Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Require Instance Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequireInstanceStatement(RequireInstanceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathStatement(PathStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePositionStatement(PositionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueStatement(ValueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error App Tag Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error App Tag Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorAppTagStatement(ErrorAppTagStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Message Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Message Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorMessageStatement(ErrorMessageStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Units Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Units Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnitsStatement(UnitsStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultStatement(DefaultStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Status Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Status Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatusStatement(StatusStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revision Date Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revision Date Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevisionDateStatement(RevisionDateStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unique Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unique Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUniqueStatement(UniqueStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyStatement(KeyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Orderedby Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Orderedby Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderedbyStatement(OrderedbyStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Presence Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Presence Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePresenceStatement(PresenceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatoryStatement(MandatoryStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigStatement(ConfigStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fraction Digits Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fraction Digits Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFractionDigitsStatement(FractionDigitsStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Feature Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Feature Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfFeatureStatement(IfFeatureStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Base Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Base Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBaseStatement(BaseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Yin Element Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Yin Element Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseYinElementStatement(YinElementStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Min Elements Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Min Elements Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinElementsStatement(MinElementsStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Max Elements Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Max Elements Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaxElementsStatement(MaxElementsStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unknown Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unknown Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnknownStatement(UnknownStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unknown Substatements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unknown Substatements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnknownSubstatements(UnknownSubstatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRangeStatement(RangeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePatternStatement(PatternStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Length Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Length Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLengthStatement(LengthStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Must Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Must Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMustStatement(MustStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiple Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiple Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultipleSubstatement(MultipleSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rpc Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rpc Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRpcStatement(RpcStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rpc Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rpc Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRpcSubstatement(RpcSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputStatement(InputStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputSubstatement(InputSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputStatement(OutputStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputSubstatement(OutputSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Notification Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Notification Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotificationStatement(NotificationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Notification Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Notification Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotificationSubstatement(NotificationSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerStatement(ContainerStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Container Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Container Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContainerSubstatement(ContainerSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListStatement(ListStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListSubstatement(ListSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grouping Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grouping Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupingStatement(GroupingStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grouping Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grouping Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroupingSubstatement(GroupingSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeafStatement(LeafStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeafSubstatement(LeafSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf List Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf List Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeafListStatement(LeafListStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Leaf List Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Leaf List Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLeafListSubstatement(LeafListSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceStatement(ChoiceStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceSubstatement(ChoiceSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseStatement(CaseStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseSubstatement(CaseSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anyxml Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anyxml Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyxmlStatement(AnyxmlStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anyxml Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anyxml Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnyxmlSubstatement(AnyxmlSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uses Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uses Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsesStatement(UsesStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Uses Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Uses Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsesSubstatement(UsesSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Augment Uses Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Augment Uses Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAugmentUsesStatement(AugmentUsesStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Augment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Augment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAugmentStatement(AugmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Augment Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Augment Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAugmentSubstatement(AugmentSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refine Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refine Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefineStatement(RefineStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refine Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refine Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefineSubstatement(RefineSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deviation Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deviation Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviationStatement(DeviationStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deviation Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deviation Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviationSubstatement(DeviationSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deviate Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deviate Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviateStatement(DeviateStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Deviate Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Deviate Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDeviateSubstatement(DeviateSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionStatement(ExtensionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extension Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extension Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExtensionSubstatement(ExtensionSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentStatement(ArgumentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Argument Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Argument Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgumentSubstatement(ArgumentSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identity Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identity Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentityStatement(IdentityStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Identity Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Identity Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdentitySubstatement(IdentitySubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureStatement(FeatureStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureSubstatement(FeatureSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Belongs To Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Belongs To Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBelongsToStatement(BelongsToStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Belongs To Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Belongs To Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBelongsToSubstatement(BelongsToSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typedef Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typedef Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedefStatement(TypedefStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typedef Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typedef Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedefSubstatement(TypedefSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeStatement(TypeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Sub Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Sub Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeSubStatement(TypeSubStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitStatement(BitStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBitSubstatement(BitSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumStatement(EnumStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Substatement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Substatement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumSubstatement(EnumSubstatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportStatement(ImportStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Substatements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Substatements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportSubstatements(ImportSubstatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeStatement(IncludeStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include Substatements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include Substatements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncludeSubstatements(IncludeSubstatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenStatement(WhenStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>When Substatements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>When Substatements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhenSubstatements(WhenSubstatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revision Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revision Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevisionStatement(RevisionStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Revision Substatements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Revision Substatements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRevisionSubstatements(RevisionSubstatements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInType(BuiltInType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //YangSwitch
