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

import yang.manager.yang.ContactStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contact Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.ContactStatementImpl#getContact <em>Contact</em>}</li>
 *   <li>{@link yang.manager.yang.impl.ContactStatementImpl#getContactunknownstatements <em>Contactunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContactStatementImpl extends ModuleStatementImpl implements ContactStatement
{
  /**
   * The default value of the '{@link #getContact() <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected static final String CONTACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContact() <em>Contact</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContact()
   * @generated
   * @ordered
   */
  protected String contact = CONTACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getContactunknownstatements() <em>Contactunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContactunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> contactunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContactStatementImpl()
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
    return YangPackage.eINSTANCE.getContactStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getContact()
  {
    return contact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContact(String newContact)
  {
    String oldContact = contact;
    contact = newContact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.CONTACT_STATEMENT__CONTACT, oldContact, contact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getContactunknownstatements()
  {
    if (contactunknownstatements == null)
    {
      contactunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS);
    }
    return contactunknownstatements;
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
      case YangPackage.CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getContactunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.CONTACT_STATEMENT__CONTACT:
        return getContact();
      case YangPackage.CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS:
        return getContactunknownstatements();
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
      case YangPackage.CONTACT_STATEMENT__CONTACT:
        setContact((String)newValue);
        return;
      case YangPackage.CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS:
        getContactunknownstatements().clear();
        getContactunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.CONTACT_STATEMENT__CONTACT:
        setContact(CONTACT_EDEFAULT);
        return;
      case YangPackage.CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS:
        getContactunknownstatements().clear();
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
      case YangPackage.CONTACT_STATEMENT__CONTACT:
        return CONTACT_EDEFAULT == null ? contact != null : !CONTACT_EDEFAULT.equals(contact);
      case YangPackage.CONTACT_STATEMENT__CONTACTUNKNOWNSTATEMENTS:
        return contactunknownstatements != null && !contactunknownstatements.isEmpty();
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
    result.append(" (contact: ");
    result.append(contact);
    result.append(')');
    return result.toString();
  }

} //ContactStatementImpl
