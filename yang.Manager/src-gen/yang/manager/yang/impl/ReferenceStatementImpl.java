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

import yang.manager.yang.ReferenceStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.ReferenceStatementImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link yang.manager.yang.impl.ReferenceStatementImpl#getReferenceunknownstatements <em>Referenceunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceStatementImpl extends MultipleSubstatementImpl implements ReferenceStatement
{
  /**
   * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected String reference = REFERENCE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReferenceunknownstatements() <em>Referenceunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> referenceunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceStatementImpl()
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
    return YangPackage.eINSTANCE.getReferenceStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(String newReference)
  {
    String oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.REFERENCE_STATEMENT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getReferenceunknownstatements()
  {
    if (referenceunknownstatements == null)
    {
      referenceunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS);
    }
    return referenceunknownstatements;
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
      case YangPackage.REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getReferenceunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.REFERENCE_STATEMENT__REFERENCE:
        return getReference();
      case YangPackage.REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS:
        return getReferenceunknownstatements();
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
      case YangPackage.REFERENCE_STATEMENT__REFERENCE:
        setReference((String)newValue);
        return;
      case YangPackage.REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS:
        getReferenceunknownstatements().clear();
        getReferenceunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.REFERENCE_STATEMENT__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case YangPackage.REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS:
        getReferenceunknownstatements().clear();
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
      case YangPackage.REFERENCE_STATEMENT__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
      case YangPackage.REFERENCE_STATEMENT__REFERENCEUNKNOWNSTATEMENTS:
        return referenceunknownstatements != null && !referenceunknownstatements.isEmpty();
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
    result.append(" (reference: ");
    result.append(reference);
    result.append(')');
    return result.toString();
  }

} //ReferenceStatementImpl
