/**
 */
package yang.manager.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yang.manager.yang.IncludeStatement;
import yang.manager.yang.IncludeSubstatements;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.IncludeStatementImpl#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link yang.manager.yang.impl.IncludeStatementImpl#getIncludesubstatements <em>Includesubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeStatementImpl extends ModuleStatementImpl implements IncludeStatement
{
  /**
   * The default value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORT_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportURI() <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportURI()
   * @generated
   * @ordered
   */
  protected String importURI = IMPORT_URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludesubstatements() <em>Includesubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludesubstatements()
   * @generated
   * @ordered
   */
  protected EList<IncludeSubstatements> includesubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncludeStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return YangPackage.eINSTANCE.getIncludeStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportURI()
  {
    return importURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportURI(String newImportURI)
  {
    String oldImportURI = importURI;
    importURI = newImportURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.INCLUDE_STATEMENT__IMPORT_URI, oldImportURI, importURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeSubstatements> getIncludesubstatements()
  {
    if (includesubstatements == null)
    {
      includesubstatements = new EObjectContainmentEList<IncludeSubstatements>(IncludeSubstatements.class, this, YangPackage.INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS);
    }
    return includesubstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case YangPackage.INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS:
        return ((InternalEList<?>)getIncludesubstatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case YangPackage.INCLUDE_STATEMENT__IMPORT_URI:
        return getImportURI();
      case YangPackage.INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS:
        return getIncludesubstatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case YangPackage.INCLUDE_STATEMENT__IMPORT_URI:
        setImportURI((String)newValue);
        return;
      case YangPackage.INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS:
        getIncludesubstatements().clear();
        getIncludesubstatements().addAll((Collection<? extends IncludeSubstatements>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.INCLUDE_STATEMENT__IMPORT_URI:
        setImportURI(IMPORT_URI_EDEFAULT);
        return;
      case YangPackage.INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS:
        getIncludesubstatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.INCLUDE_STATEMENT__IMPORT_URI:
        return IMPORT_URI_EDEFAULT == null ? importURI != null : !IMPORT_URI_EDEFAULT.equals(importURI);
      case YangPackage.INCLUDE_STATEMENT__INCLUDESUBSTATEMENTS:
        return includesubstatements != null && !includesubstatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (importURI: ");
    result.append(importURI);
    result.append(')');
    return result.toString();
  }

} //IncludeStatementImpl
