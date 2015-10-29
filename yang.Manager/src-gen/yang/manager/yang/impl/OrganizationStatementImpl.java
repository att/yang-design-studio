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

import yang.manager.yang.OrganizationStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.OrganizationStatementImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link yang.manager.yang.impl.OrganizationStatementImpl#getOrganizationunknownstatements <em>Organizationunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationStatementImpl extends ModuleStatementImpl implements OrganizationStatement
{
  /**
   * The default value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganization()
   * @generated
   * @ordered
   */
  protected static final String ORGANIZATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrganization() <em>Organization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganization()
   * @generated
   * @ordered
   */
  protected String organization = ORGANIZATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getOrganizationunknownstatements() <em>Organizationunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganizationunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> organizationunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganizationStatementImpl()
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
    return YangPackage.eINSTANCE.getOrganizationStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrganization()
  {
    return organization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrganization(String newOrganization)
  {
    String oldOrganization = organization;
    organization = newOrganization;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.ORGANIZATION_STATEMENT__ORGANIZATION, oldOrganization, organization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getOrganizationunknownstatements()
  {
    if (organizationunknownstatements == null)
    {
      organizationunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS);
    }
    return organizationunknownstatements;
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
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getOrganizationunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATION:
        return getOrganization();
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS:
        return getOrganizationunknownstatements();
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
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATION:
        setOrganization((String)newValue);
        return;
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS:
        getOrganizationunknownstatements().clear();
        getOrganizationunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATION:
        setOrganization(ORGANIZATION_EDEFAULT);
        return;
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS:
        getOrganizationunknownstatements().clear();
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
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATION:
        return ORGANIZATION_EDEFAULT == null ? organization != null : !ORGANIZATION_EDEFAULT.equals(organization);
      case YangPackage.ORGANIZATION_STATEMENT__ORGANIZATIONUNKNOWNSTATEMENTS:
        return organizationunknownstatements != null && !organizationunknownstatements.isEmpty();
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
    result.append(" (organization: ");
    result.append(organization);
    result.append(')');
    return result.toString();
  }

} //OrganizationStatementImpl
