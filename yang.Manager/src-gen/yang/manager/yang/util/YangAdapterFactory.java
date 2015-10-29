/**
 */
package yang.manager.yang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import yang.manager.yang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see yang.manager.yang.YangPackage
 * @generated
 */
public class YangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static YangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = YangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YangSwitch<Adapter> modelSwitch =
    new YangSwitch<Adapter>()
    {
      @Override
      public Adapter caseYangFile(YangFile object)
      {
        return createYangFileAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseModuleStatement(ModuleStatement object)
      {
        return createModuleStatementAdapter();
      }
      @Override
      public Adapter caseSubModule(SubModule object)
      {
        return createSubModuleAdapter();
      }
      @Override
      public Adapter caseSubmoduleStatement(SubmoduleStatement object)
      {
        return createSubmoduleStatementAdapter();
      }
      @Override
      public Adapter caseDatadefStatement(DatadefStatement object)
      {
        return createDatadefStatementAdapter();
      }
      @Override
      public Adapter caseYangVersionStatement(YangVersionStatement object)
      {
        return createYangVersionStatementAdapter();
      }
      @Override
      public Adapter caseOrganizationStatement(OrganizationStatement object)
      {
        return createOrganizationStatementAdapter();
      }
      @Override
      public Adapter caseContactStatement(ContactStatement object)
      {
        return createContactStatementAdapter();
      }
      @Override
      public Adapter caseDescriptionStatement(DescriptionStatement object)
      {
        return createDescriptionStatementAdapter();
      }
      @Override
      public Adapter caseReferenceStatement(ReferenceStatement object)
      {
        return createReferenceStatementAdapter();
      }
      @Override
      public Adapter caseNamespaceStatement(NamespaceStatement object)
      {
        return createNamespaceStatementAdapter();
      }
      @Override
      public Adapter casePrefixStatement(PrefixStatement object)
      {
        return createPrefixStatementAdapter();
      }
      @Override
      public Adapter caseRequireInstanceStatement(RequireInstanceStatement object)
      {
        return createRequireInstanceStatementAdapter();
      }
      @Override
      public Adapter casePathStatement(PathStatement object)
      {
        return createPathStatementAdapter();
      }
      @Override
      public Adapter casePositionStatement(PositionStatement object)
      {
        return createPositionStatementAdapter();
      }
      @Override
      public Adapter caseValueStatement(ValueStatement object)
      {
        return createValueStatementAdapter();
      }
      @Override
      public Adapter caseErrorAppTagStatement(ErrorAppTagStatement object)
      {
        return createErrorAppTagStatementAdapter();
      }
      @Override
      public Adapter caseErrorMessageStatement(ErrorMessageStatement object)
      {
        return createErrorMessageStatementAdapter();
      }
      @Override
      public Adapter caseUnitsStatement(UnitsStatement object)
      {
        return createUnitsStatementAdapter();
      }
      @Override
      public Adapter caseDefaultStatement(DefaultStatement object)
      {
        return createDefaultStatementAdapter();
      }
      @Override
      public Adapter caseStatusStatement(StatusStatement object)
      {
        return createStatusStatementAdapter();
      }
      @Override
      public Adapter caseRevisionDateStatement(RevisionDateStatement object)
      {
        return createRevisionDateStatementAdapter();
      }
      @Override
      public Adapter caseUniqueStatement(UniqueStatement object)
      {
        return createUniqueStatementAdapter();
      }
      @Override
      public Adapter caseKeyStatement(KeyStatement object)
      {
        return createKeyStatementAdapter();
      }
      @Override
      public Adapter caseOrderedbyStatement(OrderedbyStatement object)
      {
        return createOrderedbyStatementAdapter();
      }
      @Override
      public Adapter casePresenceStatement(PresenceStatement object)
      {
        return createPresenceStatementAdapter();
      }
      @Override
      public Adapter caseMandatoryStatement(MandatoryStatement object)
      {
        return createMandatoryStatementAdapter();
      }
      @Override
      public Adapter caseConfigStatement(ConfigStatement object)
      {
        return createConfigStatementAdapter();
      }
      @Override
      public Adapter caseFractionDigitsStatement(FractionDigitsStatement object)
      {
        return createFractionDigitsStatementAdapter();
      }
      @Override
      public Adapter caseIfFeatureStatement(IfFeatureStatement object)
      {
        return createIfFeatureStatementAdapter();
      }
      @Override
      public Adapter caseBaseStatement(BaseStatement object)
      {
        return createBaseStatementAdapter();
      }
      @Override
      public Adapter caseYinElementStatement(YinElementStatement object)
      {
        return createYinElementStatementAdapter();
      }
      @Override
      public Adapter caseMinElementsStatement(MinElementsStatement object)
      {
        return createMinElementsStatementAdapter();
      }
      @Override
      public Adapter caseMaxElementsStatement(MaxElementsStatement object)
      {
        return createMaxElementsStatementAdapter();
      }
      @Override
      public Adapter caseUnknownStatement(UnknownStatement object)
      {
        return createUnknownStatementAdapter();
      }
      @Override
      public Adapter caseUnknownSubstatements(UnknownSubstatements object)
      {
        return createUnknownSubstatementsAdapter();
      }
      @Override
      public Adapter caseRangeStatement(RangeStatement object)
      {
        return createRangeStatementAdapter();
      }
      @Override
      public Adapter casePatternStatement(PatternStatement object)
      {
        return createPatternStatementAdapter();
      }
      @Override
      public Adapter caseLengthStatement(LengthStatement object)
      {
        return createLengthStatementAdapter();
      }
      @Override
      public Adapter caseMustStatement(MustStatement object)
      {
        return createMustStatementAdapter();
      }
      @Override
      public Adapter caseMultipleSubstatement(MultipleSubstatement object)
      {
        return createMultipleSubstatementAdapter();
      }
      @Override
      public Adapter caseRpcStatement(RpcStatement object)
      {
        return createRpcStatementAdapter();
      }
      @Override
      public Adapter caseRpcSubstatement(RpcSubstatement object)
      {
        return createRpcSubstatementAdapter();
      }
      @Override
      public Adapter caseInputStatement(InputStatement object)
      {
        return createInputStatementAdapter();
      }
      @Override
      public Adapter caseInputSubstatement(InputSubstatement object)
      {
        return createInputSubstatementAdapter();
      }
      @Override
      public Adapter caseOutputStatement(OutputStatement object)
      {
        return createOutputStatementAdapter();
      }
      @Override
      public Adapter caseOutputSubstatement(OutputSubstatement object)
      {
        return createOutputSubstatementAdapter();
      }
      @Override
      public Adapter caseNotificationStatement(NotificationStatement object)
      {
        return createNotificationStatementAdapter();
      }
      @Override
      public Adapter caseNotificationSubstatement(NotificationSubstatement object)
      {
        return createNotificationSubstatementAdapter();
      }
      @Override
      public Adapter caseContainerStatement(ContainerStatement object)
      {
        return createContainerStatementAdapter();
      }
      @Override
      public Adapter caseContainerSubstatement(ContainerSubstatement object)
      {
        return createContainerSubstatementAdapter();
      }
      @Override
      public Adapter caseListStatement(ListStatement object)
      {
        return createListStatementAdapter();
      }
      @Override
      public Adapter caseListSubstatement(ListSubstatement object)
      {
        return createListSubstatementAdapter();
      }
      @Override
      public Adapter caseGroupingStatement(GroupingStatement object)
      {
        return createGroupingStatementAdapter();
      }
      @Override
      public Adapter caseGroupingSubstatement(GroupingSubstatement object)
      {
        return createGroupingSubstatementAdapter();
      }
      @Override
      public Adapter caseLeafStatement(LeafStatement object)
      {
        return createLeafStatementAdapter();
      }
      @Override
      public Adapter caseLeafSubstatement(LeafSubstatement object)
      {
        return createLeafSubstatementAdapter();
      }
      @Override
      public Adapter caseLeafListStatement(LeafListStatement object)
      {
        return createLeafListStatementAdapter();
      }
      @Override
      public Adapter caseLeafListSubstatement(LeafListSubstatement object)
      {
        return createLeafListSubstatementAdapter();
      }
      @Override
      public Adapter caseChoiceStatement(ChoiceStatement object)
      {
        return createChoiceStatementAdapter();
      }
      @Override
      public Adapter caseChoiceSubstatement(ChoiceSubstatement object)
      {
        return createChoiceSubstatementAdapter();
      }
      @Override
      public Adapter caseCaseStatement(CaseStatement object)
      {
        return createCaseStatementAdapter();
      }
      @Override
      public Adapter caseCaseSubstatement(CaseSubstatement object)
      {
        return createCaseSubstatementAdapter();
      }
      @Override
      public Adapter caseAnyxmlStatement(AnyxmlStatement object)
      {
        return createAnyxmlStatementAdapter();
      }
      @Override
      public Adapter caseAnyxmlSubstatement(AnyxmlSubstatement object)
      {
        return createAnyxmlSubstatementAdapter();
      }
      @Override
      public Adapter caseUsesStatement(UsesStatement object)
      {
        return createUsesStatementAdapter();
      }
      @Override
      public Adapter caseUsesSubstatement(UsesSubstatement object)
      {
        return createUsesSubstatementAdapter();
      }
      @Override
      public Adapter caseAugmentUsesStatement(AugmentUsesStatement object)
      {
        return createAugmentUsesStatementAdapter();
      }
      @Override
      public Adapter caseAugmentStatement(AugmentStatement object)
      {
        return createAugmentStatementAdapter();
      }
      @Override
      public Adapter caseAugmentSubstatement(AugmentSubstatement object)
      {
        return createAugmentSubstatementAdapter();
      }
      @Override
      public Adapter caseRefineStatement(RefineStatement object)
      {
        return createRefineStatementAdapter();
      }
      @Override
      public Adapter caseRefineSubstatement(RefineSubstatement object)
      {
        return createRefineSubstatementAdapter();
      }
      @Override
      public Adapter caseDeviationStatement(DeviationStatement object)
      {
        return createDeviationStatementAdapter();
      }
      @Override
      public Adapter caseDeviationSubstatement(DeviationSubstatement object)
      {
        return createDeviationSubstatementAdapter();
      }
      @Override
      public Adapter caseDeviateStatement(DeviateStatement object)
      {
        return createDeviateStatementAdapter();
      }
      @Override
      public Adapter caseDeviateSubstatement(DeviateSubstatement object)
      {
        return createDeviateSubstatementAdapter();
      }
      @Override
      public Adapter caseExtensionStatement(ExtensionStatement object)
      {
        return createExtensionStatementAdapter();
      }
      @Override
      public Adapter caseExtensionSubstatement(ExtensionSubstatement object)
      {
        return createExtensionSubstatementAdapter();
      }
      @Override
      public Adapter caseArgumentStatement(ArgumentStatement object)
      {
        return createArgumentStatementAdapter();
      }
      @Override
      public Adapter caseArgumentSubstatement(ArgumentSubstatement object)
      {
        return createArgumentSubstatementAdapter();
      }
      @Override
      public Adapter caseIdentityStatement(IdentityStatement object)
      {
        return createIdentityStatementAdapter();
      }
      @Override
      public Adapter caseIdentitySubstatement(IdentitySubstatement object)
      {
        return createIdentitySubstatementAdapter();
      }
      @Override
      public Adapter caseFeatureStatement(FeatureStatement object)
      {
        return createFeatureStatementAdapter();
      }
      @Override
      public Adapter caseFeatureSubstatement(FeatureSubstatement object)
      {
        return createFeatureSubstatementAdapter();
      }
      @Override
      public Adapter caseBelongsToStatement(BelongsToStatement object)
      {
        return createBelongsToStatementAdapter();
      }
      @Override
      public Adapter caseBelongsToSubstatement(BelongsToSubstatement object)
      {
        return createBelongsToSubstatementAdapter();
      }
      @Override
      public Adapter caseTypedefStatement(TypedefStatement object)
      {
        return createTypedefStatementAdapter();
      }
      @Override
      public Adapter caseTypedefSubstatement(TypedefSubstatement object)
      {
        return createTypedefSubstatementAdapter();
      }
      @Override
      public Adapter caseTypeStatement(TypeStatement object)
      {
        return createTypeStatementAdapter();
      }
      @Override
      public Adapter caseTypeSubStatement(TypeSubStatement object)
      {
        return createTypeSubStatementAdapter();
      }
      @Override
      public Adapter caseBitStatement(BitStatement object)
      {
        return createBitStatementAdapter();
      }
      @Override
      public Adapter caseBitSubstatement(BitSubstatement object)
      {
        return createBitSubstatementAdapter();
      }
      @Override
      public Adapter caseEnumStatement(EnumStatement object)
      {
        return createEnumStatementAdapter();
      }
      @Override
      public Adapter caseEnumSubstatement(EnumSubstatement object)
      {
        return createEnumSubstatementAdapter();
      }
      @Override
      public Adapter caseImportStatement(ImportStatement object)
      {
        return createImportStatementAdapter();
      }
      @Override
      public Adapter caseImportSubstatements(ImportSubstatements object)
      {
        return createImportSubstatementsAdapter();
      }
      @Override
      public Adapter caseIncludeStatement(IncludeStatement object)
      {
        return createIncludeStatementAdapter();
      }
      @Override
      public Adapter caseIncludeSubstatements(IncludeSubstatements object)
      {
        return createIncludeSubstatementsAdapter();
      }
      @Override
      public Adapter caseWhenStatement(WhenStatement object)
      {
        return createWhenStatementAdapter();
      }
      @Override
      public Adapter caseWhenSubstatements(WhenSubstatements object)
      {
        return createWhenSubstatementsAdapter();
      }
      @Override
      public Adapter caseRevisionStatement(RevisionStatement object)
      {
        return createRevisionStatementAdapter();
      }
      @Override
      public Adapter caseRevisionSubstatements(RevisionSubstatements object)
      {
        return createRevisionSubstatementsAdapter();
      }
      @Override
      public Adapter caseBuiltInType(BuiltInType object)
      {
        return createBuiltInTypeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.YangFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.YangFile
   * @generated
   */
  public Adapter createYangFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ModuleStatement <em>Module Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ModuleStatement
   * @generated
   */
  public Adapter createModuleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.SubModule <em>Sub Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.SubModule
   * @generated
   */
  public Adapter createSubModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.SubmoduleStatement <em>Submodule Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.SubmoduleStatement
   * @generated
   */
  public Adapter createSubmoduleStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DatadefStatement <em>Datadef Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DatadefStatement
   * @generated
   */
  public Adapter createDatadefStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.YangVersionStatement <em>Version Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.YangVersionStatement
   * @generated
   */
  public Adapter createYangVersionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.OrganizationStatement <em>Organization Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.OrganizationStatement
   * @generated
   */
  public Adapter createOrganizationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ContactStatement <em>Contact Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ContactStatement
   * @generated
   */
  public Adapter createContactStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DescriptionStatement <em>Description Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DescriptionStatement
   * @generated
   */
  public Adapter createDescriptionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ReferenceStatement <em>Reference Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ReferenceStatement
   * @generated
   */
  public Adapter createReferenceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.NamespaceStatement <em>Namespace Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.NamespaceStatement
   * @generated
   */
  public Adapter createNamespaceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.PrefixStatement <em>Prefix Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.PrefixStatement
   * @generated
   */
  public Adapter createPrefixStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RequireInstanceStatement <em>Require Instance Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RequireInstanceStatement
   * @generated
   */
  public Adapter createRequireInstanceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.PathStatement <em>Path Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.PathStatement
   * @generated
   */
  public Adapter createPathStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.PositionStatement <em>Position Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.PositionStatement
   * @generated
   */
  public Adapter createPositionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ValueStatement <em>Value Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ValueStatement
   * @generated
   */
  public Adapter createValueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ErrorAppTagStatement <em>Error App Tag Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ErrorAppTagStatement
   * @generated
   */
  public Adapter createErrorAppTagStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ErrorMessageStatement <em>Error Message Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ErrorMessageStatement
   * @generated
   */
  public Adapter createErrorMessageStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.UnitsStatement <em>Units Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.UnitsStatement
   * @generated
   */
  public Adapter createUnitsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DefaultStatement <em>Default Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DefaultStatement
   * @generated
   */
  public Adapter createDefaultStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.StatusStatement <em>Status Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.StatusStatement
   * @generated
   */
  public Adapter createStatusStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RevisionDateStatement <em>Revision Date Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RevisionDateStatement
   * @generated
   */
  public Adapter createRevisionDateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.UniqueStatement <em>Unique Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.UniqueStatement
   * @generated
   */
  public Adapter createUniqueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.KeyStatement <em>Key Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.KeyStatement
   * @generated
   */
  public Adapter createKeyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.OrderedbyStatement <em>Orderedby Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.OrderedbyStatement
   * @generated
   */
  public Adapter createOrderedbyStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.PresenceStatement <em>Presence Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.PresenceStatement
   * @generated
   */
  public Adapter createPresenceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.MandatoryStatement <em>Mandatory Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.MandatoryStatement
   * @generated
   */
  public Adapter createMandatoryStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ConfigStatement <em>Config Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ConfigStatement
   * @generated
   */
  public Adapter createConfigStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.FractionDigitsStatement <em>Fraction Digits Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.FractionDigitsStatement
   * @generated
   */
  public Adapter createFractionDigitsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.IfFeatureStatement <em>If Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.IfFeatureStatement
   * @generated
   */
  public Adapter createIfFeatureStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.BaseStatement <em>Base Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.BaseStatement
   * @generated
   */
  public Adapter createBaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.YinElementStatement <em>Yin Element Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.YinElementStatement
   * @generated
   */
  public Adapter createYinElementStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.MinElementsStatement <em>Min Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.MinElementsStatement
   * @generated
   */
  public Adapter createMinElementsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.MaxElementsStatement <em>Max Elements Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.MaxElementsStatement
   * @generated
   */
  public Adapter createMaxElementsStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.UnknownStatement <em>Unknown Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.UnknownStatement
   * @generated
   */
  public Adapter createUnknownStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.UnknownSubstatements <em>Unknown Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.UnknownSubstatements
   * @generated
   */
  public Adapter createUnknownSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RangeStatement <em>Range Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RangeStatement
   * @generated
   */
  public Adapter createRangeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.PatternStatement <em>Pattern Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.PatternStatement
   * @generated
   */
  public Adapter createPatternStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.LengthStatement <em>Length Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.LengthStatement
   * @generated
   */
  public Adapter createLengthStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.MustStatement <em>Must Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.MustStatement
   * @generated
   */
  public Adapter createMustStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.MultipleSubstatement <em>Multiple Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.MultipleSubstatement
   * @generated
   */
  public Adapter createMultipleSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RpcStatement <em>Rpc Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RpcStatement
   * @generated
   */
  public Adapter createRpcStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RpcSubstatement <em>Rpc Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RpcSubstatement
   * @generated
   */
  public Adapter createRpcSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.InputStatement <em>Input Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.InputStatement
   * @generated
   */
  public Adapter createInputStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.InputSubstatement <em>Input Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.InputSubstatement
   * @generated
   */
  public Adapter createInputSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.OutputStatement <em>Output Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.OutputStatement
   * @generated
   */
  public Adapter createOutputStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.OutputSubstatement <em>Output Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.OutputSubstatement
   * @generated
   */
  public Adapter createOutputSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.NotificationStatement <em>Notification Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.NotificationStatement
   * @generated
   */
  public Adapter createNotificationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.NotificationSubstatement <em>Notification Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.NotificationSubstatement
   * @generated
   */
  public Adapter createNotificationSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ContainerStatement <em>Container Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ContainerStatement
   * @generated
   */
  public Adapter createContainerStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ContainerSubstatement <em>Container Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ContainerSubstatement
   * @generated
   */
  public Adapter createContainerSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ListStatement <em>List Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ListStatement
   * @generated
   */
  public Adapter createListStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ListSubstatement <em>List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ListSubstatement
   * @generated
   */
  public Adapter createListSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.GroupingStatement <em>Grouping Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.GroupingStatement
   * @generated
   */
  public Adapter createGroupingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.GroupingSubstatement <em>Grouping Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.GroupingSubstatement
   * @generated
   */
  public Adapter createGroupingSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.LeafStatement <em>Leaf Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.LeafStatement
   * @generated
   */
  public Adapter createLeafStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.LeafSubstatement <em>Leaf Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.LeafSubstatement
   * @generated
   */
  public Adapter createLeafSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.LeafListStatement <em>Leaf List Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.LeafListStatement
   * @generated
   */
  public Adapter createLeafListStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.LeafListSubstatement <em>Leaf List Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.LeafListSubstatement
   * @generated
   */
  public Adapter createLeafListSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ChoiceStatement <em>Choice Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ChoiceStatement
   * @generated
   */
  public Adapter createChoiceStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ChoiceSubstatement <em>Choice Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ChoiceSubstatement
   * @generated
   */
  public Adapter createChoiceSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.CaseStatement <em>Case Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.CaseStatement
   * @generated
   */
  public Adapter createCaseStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.CaseSubstatement <em>Case Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.CaseSubstatement
   * @generated
   */
  public Adapter createCaseSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.AnyxmlStatement <em>Anyxml Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.AnyxmlStatement
   * @generated
   */
  public Adapter createAnyxmlStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.AnyxmlSubstatement <em>Anyxml Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.AnyxmlSubstatement
   * @generated
   */
  public Adapter createAnyxmlSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.UsesStatement <em>Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.UsesStatement
   * @generated
   */
  public Adapter createUsesStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.UsesSubstatement <em>Uses Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.UsesSubstatement
   * @generated
   */
  public Adapter createUsesSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.AugmentUsesStatement <em>Augment Uses Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.AugmentUsesStatement
   * @generated
   */
  public Adapter createAugmentUsesStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.AugmentStatement <em>Augment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.AugmentStatement
   * @generated
   */
  public Adapter createAugmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.AugmentSubstatement <em>Augment Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.AugmentSubstatement
   * @generated
   */
  public Adapter createAugmentSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RefineStatement <em>Refine Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RefineStatement
   * @generated
   */
  public Adapter createRefineStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RefineSubstatement <em>Refine Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RefineSubstatement
   * @generated
   */
  public Adapter createRefineSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DeviationStatement <em>Deviation Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DeviationStatement
   * @generated
   */
  public Adapter createDeviationStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DeviationSubstatement <em>Deviation Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DeviationSubstatement
   * @generated
   */
  public Adapter createDeviationSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DeviateStatement <em>Deviate Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DeviateStatement
   * @generated
   */
  public Adapter createDeviateStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.DeviateSubstatement <em>Deviate Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.DeviateSubstatement
   * @generated
   */
  public Adapter createDeviateSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ExtensionStatement <em>Extension Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ExtensionStatement
   * @generated
   */
  public Adapter createExtensionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ExtensionSubstatement <em>Extension Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ExtensionSubstatement
   * @generated
   */
  public Adapter createExtensionSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ArgumentStatement <em>Argument Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ArgumentStatement
   * @generated
   */
  public Adapter createArgumentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ArgumentSubstatement <em>Argument Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ArgumentSubstatement
   * @generated
   */
  public Adapter createArgumentSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.IdentityStatement <em>Identity Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.IdentityStatement
   * @generated
   */
  public Adapter createIdentityStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.IdentitySubstatement <em>Identity Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.IdentitySubstatement
   * @generated
   */
  public Adapter createIdentitySubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.FeatureStatement <em>Feature Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.FeatureStatement
   * @generated
   */
  public Adapter createFeatureStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.FeatureSubstatement <em>Feature Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.FeatureSubstatement
   * @generated
   */
  public Adapter createFeatureSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.BelongsToStatement <em>Belongs To Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.BelongsToStatement
   * @generated
   */
  public Adapter createBelongsToStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.BelongsToSubstatement <em>Belongs To Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.BelongsToSubstatement
   * @generated
   */
  public Adapter createBelongsToSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.TypedefStatement <em>Typedef Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.TypedefStatement
   * @generated
   */
  public Adapter createTypedefStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.TypedefSubstatement <em>Typedef Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.TypedefSubstatement
   * @generated
   */
  public Adapter createTypedefSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.TypeStatement <em>Type Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.TypeStatement
   * @generated
   */
  public Adapter createTypeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.TypeSubStatement <em>Type Sub Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.TypeSubStatement
   * @generated
   */
  public Adapter createTypeSubStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.BitStatement <em>Bit Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.BitStatement
   * @generated
   */
  public Adapter createBitStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.BitSubstatement <em>Bit Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.BitSubstatement
   * @generated
   */
  public Adapter createBitSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.EnumStatement <em>Enum Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.EnumStatement
   * @generated
   */
  public Adapter createEnumStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.EnumSubstatement <em>Enum Substatement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.EnumSubstatement
   * @generated
   */
  public Adapter createEnumSubstatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ImportStatement
   * @generated
   */
  public Adapter createImportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.ImportSubstatements <em>Import Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.ImportSubstatements
   * @generated
   */
  public Adapter createImportSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.IncludeStatement <em>Include Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.IncludeStatement
   * @generated
   */
  public Adapter createIncludeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.IncludeSubstatements <em>Include Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.IncludeSubstatements
   * @generated
   */
  public Adapter createIncludeSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.WhenStatement <em>When Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.WhenStatement
   * @generated
   */
  public Adapter createWhenStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.WhenSubstatements <em>When Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.WhenSubstatements
   * @generated
   */
  public Adapter createWhenSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RevisionStatement <em>Revision Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RevisionStatement
   * @generated
   */
  public Adapter createRevisionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.RevisionSubstatements <em>Revision Substatements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.RevisionSubstatements
   * @generated
   */
  public Adapter createRevisionSubstatementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link yang.manager.yang.BuiltInType <em>Built In Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see yang.manager.yang.BuiltInType
   * @generated
   */
  public Adapter createBuiltInTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //YangAdapterFactory
