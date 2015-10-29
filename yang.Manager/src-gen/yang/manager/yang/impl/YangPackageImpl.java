/**
 */
package yang.manager.yang.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import yang.manager.yang.YangFactory;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YangPackageImpl extends EPackageImpl implements YangPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected String packageFilename = "yang.ecore";

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yangFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subModuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass submoduleStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datadefStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yangVersionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contactStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass referenceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requireInstanceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pathStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass positionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorAppTagStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass errorMessageStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unitsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statusStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revisionDateStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uniqueStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orderedbyStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass presenceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass configStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fractionDigitsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifFeatureStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass yinElementStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass minElementsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass maxElementsStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownSubstatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rangeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lengthStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mustStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multipleSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rpcStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rpcSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inputSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass outputSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notificationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notificationSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass containerSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupingStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupingSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafListStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leafListSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass choiceSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyxmlStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyxmlSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usesStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usesSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass augmentUsesStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass augmentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass augmentSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refineStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refineSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviationStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviationSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviateStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass deviateSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extensionSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identityStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass identitySubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass belongsToStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass belongsToSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedefStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedefSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeSubStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bitSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumSubstatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importSubstatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeSubstatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass whenSubstatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revisionStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass revisionSubstatementsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInTypeEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see yang.manager.yang.YangPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private YangPackageImpl()
  {
    super(eNS_URI, YangFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link YangPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @generated
   */
  public static YangPackage init()
  {
    if (isInited) return (YangPackage)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI);

    // Obtain or create and register package
    YangPackageImpl theYangPackage = (YangPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof YangPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new YangPackageImpl());

    isInited = true;

    // Load packages
    theYangPackage.loadPackage();

    // Fix loaded packages
    theYangPackage.fixPackageContents();

    // Mark meta-data to indicate it can't be changed
    theYangPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(YangPackage.eNS_URI, theYangPackage);
    return theYangPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYangFile()
  {
    if (yangFileEClass == null)
    {
      yangFileEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(0);
    }
    return yangFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYangFile_Name()
  {
        return (EAttribute)getYangFile().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    if (moduleEClass == null)
    {
      moduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(1);
    }
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Statements()
  {
        return (EReference)getModule().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModuleStatement()
  {
    if (moduleStatementEClass == null)
    {
      moduleStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(2);
    }
    return moduleStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubModule()
  {
    if (subModuleEClass == null)
    {
      subModuleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(3);
    }
    return subModuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubModule_Statements()
  {
        return (EReference)getSubModule().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubmoduleStatement()
  {
    if (submoduleStatementEClass == null)
    {
      submoduleStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(4);
    }
    return submoduleStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatadefStatement()
  {
    if (datadefStatementEClass == null)
    {
      datadefStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(5);
    }
    return datadefStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYangVersionStatement()
  {
    if (yangVersionStatementEClass == null)
    {
      yangVersionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(6);
    }
    return yangVersionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYangVersionStatement_Version()
  {
        return (EAttribute)getYangVersionStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getYangVersionStatement_Yangversionunknownstatements()
  {
        return (EReference)getYangVersionStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganizationStatement()
  {
    if (organizationStatementEClass == null)
    {
      organizationStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(7);
    }
    return organizationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganizationStatement_Organization()
  {
        return (EAttribute)getOrganizationStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganizationStatement_Organizationunknownstatements()
  {
        return (EReference)getOrganizationStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContactStatement()
  {
    if (contactStatementEClass == null)
    {
      contactStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(8);
    }
    return contactStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContactStatement_Contact()
  {
        return (EAttribute)getContactStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContactStatement_Contactunknownstatements()
  {
        return (EReference)getContactStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescriptionStatement()
  {
    if (descriptionStatementEClass == null)
    {
      descriptionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(9);
    }
    return descriptionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescriptionStatement_Description()
  {
        return (EAttribute)getDescriptionStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDescriptionStatement_Descriptionunknownstatements()
  {
        return (EReference)getDescriptionStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReferenceStatement()
  {
    if (referenceStatementEClass == null)
    {
      referenceStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(10);
    }
    return referenceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReferenceStatement_Reference()
  {
        return (EAttribute)getReferenceStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReferenceStatement_Referenceunknownstatements()
  {
        return (EReference)getReferenceStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespaceStatement()
  {
    if (namespaceStatementEClass == null)
    {
      namespaceStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(11);
    }
    return namespaceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespaceStatement_Uri()
  {
        return (EAttribute)getNamespaceStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNamespaceStatement_Namespaceunknownstatements()
  {
        return (EReference)getNamespaceStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixStatement()
  {
    if (prefixStatementEClass == null)
    {
      prefixStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(12);
    }
    return prefixStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixStatement_Name()
  {
        return (EAttribute)getPrefixStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefixStatement_Prefixunknownstatements()
  {
        return (EReference)getPrefixStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequireInstanceStatement()
  {
    if (requireInstanceStatementEClass == null)
    {
      requireInstanceStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(13);
    }
    return requireInstanceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequireInstanceStatement_Require()
  {
        return (EAttribute)getRequireInstanceStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequireInstanceStatement_Requireunknownstatements()
  {
        return (EReference)getRequireInstanceStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPathStatement()
  {
    if (pathStatementEClass == null)
    {
      pathStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(14);
    }
    return pathStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPathStatement_Path()
  {
        return (EAttribute)getPathStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPathStatement_Pathunknownstatements()
  {
        return (EReference)getPathStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPositionStatement()
  {
    if (positionStatementEClass == null)
    {
      positionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(15);
    }
    return positionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPositionStatement_Intarg()
  {
        return (EAttribute)getPositionStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPositionStatement_Positionunknownstatements()
  {
        return (EReference)getPositionStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueStatement()
  {
    if (valueStatementEClass == null)
    {
      valueStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(16);
    }
    return valueStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueStatement_Intarg()
  {
        return (EAttribute)getValueStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueStatement_Valueunknownstatements()
  {
        return (EReference)getValueStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorAppTagStatement()
  {
    if (errorAppTagStatementEClass == null)
    {
      errorAppTagStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(17);
    }
    return errorAppTagStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorAppTagStatement_Arg()
  {
        return (EAttribute)getErrorAppTagStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorAppTagStatement_Erroraunknownstatements()
  {
        return (EReference)getErrorAppTagStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getErrorMessageStatement()
  {
    if (errorMessageStatementEClass == null)
    {
      errorMessageStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(18);
    }
    return errorMessageStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getErrorMessageStatement_Arg()
  {
        return (EAttribute)getErrorMessageStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getErrorMessageStatement_Errormunknownstatements()
  {
        return (EReference)getErrorMessageStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnitsStatement()
  {
    if (unitsStatementEClass == null)
    {
      unitsStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(19);
    }
    return unitsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnitsStatement_Arg()
  {
        return (EAttribute)getUnitsStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnitsStatement_Unitsunknownstatements()
  {
        return (EReference)getUnitsStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultStatement()
  {
    if (defaultStatementEClass == null)
    {
      defaultStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(20);
    }
    return defaultStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultStatement_Arg()
  {
        return (EAttribute)getDefaultStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefaultStatement_Defaultunknownstatements()
  {
        return (EReference)getDefaultStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatusStatement()
  {
    if (statusStatementEClass == null)
    {
      statusStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(21);
    }
    return statusStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatusStatement_Status()
  {
        return (EAttribute)getStatusStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatusStatement_Statusunknownstatements()
  {
        return (EReference)getStatusStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevisionDateStatement()
  {
    if (revisionDateStatementEClass == null)
    {
      revisionDateStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(22);
    }
    return revisionDateStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRevisionDateStatement_Date()
  {
        return (EAttribute)getRevisionDateStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRevisionDateStatement_Revisiondateunknownstatements()
  {
        return (EReference)getRevisionDateStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUniqueStatement()
  {
    if (uniqueStatementEClass == null)
    {
      uniqueStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(23);
    }
    return uniqueStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUniqueStatement_Arg()
  {
        return (EAttribute)getUniqueStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUniqueStatement_Uniqueunknownstatements()
  {
        return (EReference)getUniqueStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyStatement()
  {
    if (keyStatementEClass == null)
    {
      keyStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(24);
    }
    return keyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKeyStatement_Arg()
  {
        return (EAttribute)getKeyStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyStatement_Keyunknownstatements()
  {
        return (EReference)getKeyStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrderedbyStatement()
  {
    if (orderedbyStatementEClass == null)
    {
      orderedbyStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(25);
    }
    return orderedbyStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrderedbyStatement_Arg()
  {
        return (EAttribute)getOrderedbyStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrderedbyStatement_Orderedbyunknownstatements()
  {
        return (EReference)getOrderedbyStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPresenceStatement()
  {
    if (presenceStatementEClass == null)
    {
      presenceStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(26);
    }
    return presenceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPresenceStatement_Arg()
  {
        return (EAttribute)getPresenceStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPresenceStatement_Presenceunknownstatements()
  {
        return (EReference)getPresenceStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatoryStatement()
  {
    if (mandatoryStatementEClass == null)
    {
      mandatoryStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(27);
    }
    return mandatoryStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMandatoryStatement_Boolarg()
  {
        return (EAttribute)getMandatoryStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMandatoryStatement_Mandatoryunknownstatements()
  {
        return (EReference)getMandatoryStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConfigStatement()
  {
    if (configStatementEClass == null)
    {
      configStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(28);
    }
    return configStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConfigStatement_Boolarg()
  {
        return (EAttribute)getConfigStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConfigStatement_Configunknownstatements()
  {
        return (EReference)getConfigStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFractionDigitsStatement()
  {
    if (fractionDigitsStatementEClass == null)
    {
      fractionDigitsStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(29);
    }
    return fractionDigitsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFractionDigitsStatement_Arg()
  {
        return (EAttribute)getFractionDigitsStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFractionDigitsStatement_Fractiondigitsunknownstatements()
  {
        return (EReference)getFractionDigitsStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfFeatureStatement()
  {
    if (ifFeatureStatementEClass == null)
    {
      ifFeatureStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(30);
    }
    return ifFeatureStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIfFeatureStatement_Pref()
  {
        return (EAttribute)getIfFeatureStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfFeatureStatement_Ident()
  {
        return (EReference)getIfFeatureStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfFeatureStatement_Iffeatureunknownstatements()
  {
        return (EReference)getIfFeatureStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseStatement()
  {
    if (baseStatementEClass == null)
    {
      baseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(31);
    }
    return baseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBaseStatement_Base()
  {
        return (EAttribute)getBaseStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBaseStatement_Baseunknownstatements()
  {
        return (EReference)getBaseStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getYinElementStatement()
  {
    if (yinElementStatementEClass == null)
    {
      yinElementStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(32);
    }
    return yinElementStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getYinElementStatement_Boolarg()
  {
        return (EAttribute)getYinElementStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getYinElementStatement_Yinelementunknownstatements()
  {
        return (EReference)getYinElementStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMinElementsStatement()
  {
    if (minElementsStatementEClass == null)
    {
      minElementsStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(33);
    }
    return minElementsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMinElementsStatement_Arg()
  {
        return (EAttribute)getMinElementsStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMinElementsStatement_Minelementsunknownstatements()
  {
        return (EReference)getMinElementsStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMaxElementsStatement()
  {
    if (maxElementsStatementEClass == null)
    {
      maxElementsStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(34);
    }
    return maxElementsStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMaxElementsStatement_Arg()
  {
        return (EAttribute)getMaxElementsStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMaxElementsStatement_Maxelementsunknownstatements()
  {
        return (EReference)getMaxElementsStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownStatement()
  {
    if (unknownStatementEClass == null)
    {
      unknownStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(35);
    }
    return unknownStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownStatement_Pref()
  {
        return (EAttribute)getUnknownStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownStatement_Namestat()
  {
        return (EAttribute)getUnknownStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownStatement_Argument()
  {
        return (EAttribute)getUnknownStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnknownStatement_Unknownsubstatements()
  {
        return (EReference)getUnknownStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknownSubstatements()
  {
    if (unknownSubstatementsEClass == null)
    {
      unknownSubstatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(36);
    }
    return unknownSubstatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownSubstatements_Pref()
  {
        return (EAttribute)getUnknownSubstatements().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownSubstatements_Namestat()
  {
        return (EAttribute)getUnknownSubstatements().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknownSubstatements_Argument()
  {
        return (EAttribute)getUnknownSubstatements().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnknownSubstatements_Unknownsubstatements()
  {
        return (EReference)getUnknownSubstatements().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRangeStatement()
  {
    if (rangeStatementEClass == null)
    {
      rangeStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(37);
    }
    return rangeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRangeStatement_Range()
  {
        return (EAttribute)getRangeStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRangeStatement_Rangesubstatements()
  {
        return (EReference)getRangeStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternStatement()
  {
    if (patternStatementEClass == null)
    {
      patternStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(38);
    }
    return patternStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternStatement_Name()
  {
        return (EAttribute)getPatternStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternStatement_Patternsubstatements()
  {
        return (EReference)getPatternStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLengthStatement()
  {
    if (lengthStatementEClass == null)
    {
      lengthStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(39);
    }
    return lengthStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLengthStatement_Length()
  {
        return (EAttribute)getLengthStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLengthStatement_Lengthsubstatements()
  {
        return (EReference)getLengthStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMustStatement()
  {
    if (mustStatementEClass == null)
    {
      mustStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(40);
    }
    return mustStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMustStatement_Arg()
  {
        return (EAttribute)getMustStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMustStatement_Mustsubstatements()
  {
        return (EReference)getMustStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultipleSubstatement()
  {
    if (multipleSubstatementEClass == null)
    {
      multipleSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(41);
    }
    return multipleSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRpcStatement()
  {
    if (rpcStatementEClass == null)
    {
      rpcStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(42);
    }
    return rpcStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRpcStatement_Name()
  {
        return (EAttribute)getRpcStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRpcStatement_Rpcsubstatements()
  {
        return (EReference)getRpcStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRpcSubstatement()
  {
    if (rpcSubstatementEClass == null)
    {
      rpcSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(43);
    }
    return rpcSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputStatement()
  {
    if (inputStatementEClass == null)
    {
      inputStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(44);
    }
    return inputStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInputStatement_Inputsubstatements()
  {
        return (EReference)getInputStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInputSubstatement()
  {
    if (inputSubstatementEClass == null)
    {
      inputSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(45);
    }
    return inputSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputStatement()
  {
    if (outputStatementEClass == null)
    {
      outputStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(46);
    }
    return outputStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOutputStatement_Outputsubstatements()
  {
        return (EReference)getOutputStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOutputSubstatement()
  {
    if (outputSubstatementEClass == null)
    {
      outputSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(47);
    }
    return outputSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotificationStatement()
  {
    if (notificationStatementEClass == null)
    {
      notificationStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(48);
    }
    return notificationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotificationStatement_Name()
  {
        return (EAttribute)getNotificationStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNotificationStatement_Notificationsubstatements()
  {
        return (EReference)getNotificationStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotificationSubstatement()
  {
    if (notificationSubstatementEClass == null)
    {
      notificationSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(49);
    }
    return notificationSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerStatement()
  {
    if (containerStatementEClass == null)
    {
      containerStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(50);
    }
    return containerStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContainerStatement_Name()
  {
        return (EAttribute)getContainerStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContainerStatement_Containersubstatements()
  {
        return (EReference)getContainerStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContainerSubstatement()
  {
    if (containerSubstatementEClass == null)
    {
      containerSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(51);
    }
    return containerSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListStatement()
  {
    if (listStatementEClass == null)
    {
      listStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(52);
    }
    return listStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getListStatement_Name()
  {
        return (EAttribute)getListStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListStatement_Listsubstatements()
  {
        return (EReference)getListStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListSubstatement()
  {
    if (listSubstatementEClass == null)
    {
      listSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(53);
    }
    return listSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupingStatement()
  {
    if (groupingStatementEClass == null)
    {
      groupingStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(54);
    }
    return groupingStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGroupingStatement_Name()
  {
        return (EAttribute)getGroupingStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGroupingStatement_Groupingsubstatements()
  {
        return (EReference)getGroupingStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGroupingSubstatement()
  {
    if (groupingSubstatementEClass == null)
    {
      groupingSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(55);
    }
    return groupingSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeafStatement()
  {
    if (leafStatementEClass == null)
    {
      leafStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(56);
    }
    return leafStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLeafStatement_Name()
  {
        return (EAttribute)getLeafStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeafStatement_Leafsubstatements()
  {
        return (EReference)getLeafStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeafSubstatement()
  {
    if (leafSubstatementEClass == null)
    {
      leafSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(57);
    }
    return leafSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeafListStatement()
  {
    if (leafListStatementEClass == null)
    {
      leafListStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(58);
    }
    return leafListStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLeafListStatement_Arg()
  {
        return (EAttribute)getLeafListStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLeafListStatement_Leaflistsubstatements()
  {
        return (EReference)getLeafListStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLeafListSubstatement()
  {
    if (leafListSubstatementEClass == null)
    {
      leafListSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(59);
    }
    return leafListSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoiceStatement()
  {
    if (choiceStatementEClass == null)
    {
      choiceStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(60);
    }
    return choiceStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getChoiceStatement_Name()
  {
        return (EAttribute)getChoiceStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getChoiceStatement_Choicesubstatements()
  {
        return (EReference)getChoiceStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getChoiceSubstatement()
  {
    if (choiceSubstatementEClass == null)
    {
      choiceSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(61);
    }
    return choiceSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseStatement()
  {
    if (caseStatementEClass == null)
    {
      caseStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(62);
    }
    return caseStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCaseStatement_Name()
  {
        return (EAttribute)getCaseStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCaseStatement_Casesubstatements()
  {
        return (EReference)getCaseStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCaseSubstatement()
  {
    if (caseSubstatementEClass == null)
    {
      caseSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(63);
    }
    return caseSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyxmlStatement()
  {
    if (anyxmlStatementEClass == null)
    {
      anyxmlStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(64);
    }
    return anyxmlStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnyxmlStatement_Arg()
  {
        return (EAttribute)getAnyxmlStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnyxmlStatement_Anyxmlsubstatements()
  {
        return (EReference)getAnyxmlStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnyxmlSubstatement()
  {
    if (anyxmlSubstatementEClass == null)
    {
      anyxmlSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(65);
    }
    return anyxmlSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsesStatement()
  {
    if (usesStatementEClass == null)
    {
      usesStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(66);
    }
    return usesStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsesStatement_Pre()
  {
        return (EAttribute)getUsesStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsesStatement_Arg()
  {
        return (EReference)getUsesStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUsesStatement_Usessubstatements()
  {
        return (EReference)getUsesStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsesSubstatement()
  {
    if (usesSubstatementEClass == null)
    {
      usesSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(67);
    }
    return usesSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAugmentUsesStatement()
  {
    if (augmentUsesStatementEClass == null)
    {
      augmentUsesStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(68);
    }
    return augmentUsesStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAugmentUsesStatement_Arg()
  {
        return (EAttribute)getAugmentUsesStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAugmentUsesStatement_Augmentsubstatements()
  {
        return (EReference)getAugmentUsesStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAugmentStatement()
  {
    if (augmentStatementEClass == null)
    {
      augmentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(69);
    }
    return augmentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAugmentStatement_Arg()
  {
        return (EAttribute)getAugmentStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAugmentStatement_Augmentsubstatements()
  {
        return (EReference)getAugmentStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAugmentSubstatement()
  {
    if (augmentSubstatementEClass == null)
    {
      augmentSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(70);
    }
    return augmentSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefineStatement()
  {
    if (refineStatementEClass == null)
    {
      refineStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(71);
    }
    return refineStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRefineStatement_Arg()
  {
        return (EAttribute)getRefineStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRefineStatement_Refinesubstatements()
  {
        return (EReference)getRefineStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRefineSubstatement()
  {
    if (refineSubstatementEClass == null)
    {
      refineSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(72);
    }
    return refineSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviationStatement()
  {
    if (deviationStatementEClass == null)
    {
      deviationStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(73);
    }
    return deviationStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviationStatement_Arg()
  {
        return (EAttribute)getDeviationStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviationStatement_Deviationsubstatements()
  {
        return (EReference)getDeviationStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviationSubstatement()
  {
    if (deviationSubstatementEClass == null)
    {
      deviationSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(74);
    }
    return deviationSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviateStatement()
  {
    if (deviateStatementEClass == null)
    {
      deviateStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(75);
    }
    return deviateStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeviateStatement_Arg()
  {
        return (EAttribute)getDeviateStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeviateStatement_Deviatesubstatements()
  {
        return (EReference)getDeviateStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeviateSubstatement()
  {
    if (deviateSubstatementEClass == null)
    {
      deviateSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(76);
    }
    return deviateSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensionStatement()
  {
    if (extensionStatementEClass == null)
    {
      extensionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(77);
    }
    return extensionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtensionStatement_Arg()
  {
        return (EAttribute)getExtensionStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtensionStatement_Extensionsubstatements()
  {
        return (EReference)getExtensionStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtensionSubstatement()
  {
    if (extensionSubstatementEClass == null)
    {
      extensionSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(78);
    }
    return extensionSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentStatement()
  {
    if (argumentStatementEClass == null)
    {
      argumentStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(79);
    }
    return argumentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgumentStatement_Arg()
  {
        return (EAttribute)getArgumentStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArgumentStatement_Argumentsubstatements()
  {
        return (EReference)getArgumentStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentSubstatement()
  {
    if (argumentSubstatementEClass == null)
    {
      argumentSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(80);
    }
    return argumentSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentityStatement()
  {
    if (identityStatementEClass == null)
    {
      identityStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(81);
    }
    return identityStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIdentityStatement_Name()
  {
        return (EAttribute)getIdentityStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdentityStatement_Identitysubstatements()
  {
        return (EReference)getIdentityStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdentitySubstatement()
  {
    if (identitySubstatementEClass == null)
    {
      identitySubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(82);
    }
    return identitySubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureStatement()
  {
    if (featureStatementEClass == null)
    {
      featureStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(83);
    }
    return featureStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFeatureStatement_Name()
  {
        return (EAttribute)getFeatureStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureStatement_Featuresubstatements()
  {
        return (EReference)getFeatureStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureSubstatement()
  {
    if (featureSubstatementEClass == null)
    {
      featureSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(84);
    }
    return featureSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBelongsToStatement()
  {
    if (belongsToStatementEClass == null)
    {
      belongsToStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(85);
    }
    return belongsToStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBelongsToStatement_Name()
  {
        return (EAttribute)getBelongsToStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBelongsToStatement_Belongstosubstatement()
  {
        return (EReference)getBelongsToStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBelongsToSubstatement()
  {
    if (belongsToSubstatementEClass == null)
    {
      belongsToSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(86);
    }
    return belongsToSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedefStatement()
  {
    if (typedefStatementEClass == null)
    {
      typedefStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(87);
    }
    return typedefStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypedefStatement_Name()
  {
        return (EAttribute)getTypedefStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedefStatement_Typedefsubstatemnet()
  {
        return (EReference)getTypedefStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedefSubstatement()
  {
    if (typedefSubstatementEClass == null)
    {
      typedefSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(88);
    }
    return typedefSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeStatement()
  {
    if (typeStatementEClass == null)
    {
      typeStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(89);
    }
    return typeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeStatement_Type()
  {
        return (EReference)getTypeStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeStatement_Pre()
  {
        return (EAttribute)getTypeStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeStatement_Importtype()
  {
        return (EReference)getTypeStatement().getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeStatement_Typesubstatements()
  {
        return (EReference)getTypeStatement().getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeSubStatement()
  {
    if (typeSubStatementEClass == null)
    {
      typeSubStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(90);
    }
    return typeSubStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitStatement()
  {
    if (bitStatementEClass == null)
    {
      bitStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(91);
    }
    return bitStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBitStatement_Name()
  {
        return (EAttribute)getBitStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBitStatement_Bitsubstatements()
  {
        return (EReference)getBitStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBitSubstatement()
  {
    if (bitSubstatementEClass == null)
    {
      bitSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(92);
    }
    return bitSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumStatement()
  {
    if (enumStatementEClass == null)
    {
      enumStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(93);
    }
    return enumStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumStatement_Name()
  {
        return (EAttribute)getEnumStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumStatement_Enumsubstatements()
  {
        return (EReference)getEnumStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumSubstatement()
  {
    if (enumSubstatementEClass == null)
    {
      enumSubstatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(94);
    }
    return enumSubstatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportStatement()
  {
    if (importStatementEClass == null)
    {
      importStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(95);
    }
    return importStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportStatement_ImportURI()
  {
        return (EAttribute)getImportStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportStatement_Importsubstatements()
  {
        return (EReference)getImportStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportSubstatements()
  {
    if (importSubstatementsEClass == null)
    {
      importSubstatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(96);
    }
    return importSubstatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeStatement()
  {
    if (includeStatementEClass == null)
    {
      includeStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(97);
    }
    return includeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeStatement_ImportURI()
  {
        return (EAttribute)getIncludeStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIncludeStatement_Includesubstatements()
  {
        return (EReference)getIncludeStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeSubstatements()
  {
    if (includeSubstatementsEClass == null)
    {
      includeSubstatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(98);
    }
    return includeSubstatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenStatement()
  {
    if (whenStatementEClass == null)
    {
      whenStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(99);
    }
    return whenStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhenStatement_Arg()
  {
        return (EAttribute)getWhenStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhenStatement_Whensubstatements()
  {
        return (EReference)getWhenStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhenSubstatements()
  {
    if (whenSubstatementsEClass == null)
    {
      whenSubstatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(100);
    }
    return whenSubstatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevisionStatement()
  {
    if (revisionStatementEClass == null)
    {
      revisionStatementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(101);
    }
    return revisionStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRevisionStatement_Date()
  {
        return (EAttribute)getRevisionStatement().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRevisionStatement_Revisionsubstatements()
  {
        return (EReference)getRevisionStatement().getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRevisionSubstatements()
  {
    if (revisionSubstatementsEClass == null)
    {
      revisionSubstatementsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(102);
    }
    return revisionSubstatementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInType()
  {
    if (builtInTypeEClass == null)
    {
      builtInTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(YangPackage.eNS_URI).getEClassifiers().get(103);
    }
    return builtInTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBuiltInType_Btype()
  {
        return (EAttribute)getBuiltInType().getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YangFactory getYangFactory()
  {
    return (YangFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isLoaded = false;

  /**
   * Laods the package and any sub-packages from their serialized form.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void loadPackage()
  {
    if (isLoaded) return;
    isLoaded = true;

    URL url = getClass().getResource(packageFilename);
    if (url == null)
    {
      throw new RuntimeException("Missing serialized package: " + packageFilename);
    }
    URI uri = URI.createURI(url.toString());
    Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
    try
    {
      resource.load(null);
    }
    catch (IOException exception)
    {
      throw new WrappedException(exception);
    }
    initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
    createResource(eNS_URI);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isFixed = false;

  /**
   * Fixes up the loaded package, to make it appear as if it had been programmatically built.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void fixPackageContents()
  {
    if (isFixed) return;
    isFixed = true;
    fixEClassifiers();
  }

  /**
   * Sets the instance class on the given classifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void fixInstanceClass(EClassifier eClassifier)
  {
    if (eClassifier.getInstanceClassName() == null)
    {
      eClassifier.setInstanceClassName("yang.manager.yang." + eClassifier.getName());
      setGeneratedClassName(eClassifier);
    }
  }

} //YangPackageImpl
