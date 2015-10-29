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

import yang.manager.yang.BaseStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.BaseStatementImpl#getBase <em>Base</em>}</li>
 *   <li>{@link yang.manager.yang.impl.BaseStatementImpl#getBaseunknownstatements <em>Baseunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BaseStatementImpl extends IdentitySubstatementImpl implements BaseStatement
{
  /**
   * The default value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected static final String BASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBase() <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBase()
   * @generated
   * @ordered
   */
  protected String base = BASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBaseunknownstatements() <em>Baseunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> baseunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BaseStatementImpl()
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
    return YangPackage.eINSTANCE.getBaseStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBase()
  {
    return base;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBase(String newBase)
  {
    String oldBase = base;
    base = newBase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.BASE_STATEMENT__BASE, oldBase, base));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getBaseunknownstatements()
  {
    if (baseunknownstatements == null)
    {
      baseunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS);
    }
    return baseunknownstatements;
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
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getBaseunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.BASE_STATEMENT__BASE:
        return getBase();
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        return getBaseunknownstatements();
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
      case YangPackage.BASE_STATEMENT__BASE:
        setBase((String)newValue);
        return;
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        getBaseunknownstatements().clear();
        getBaseunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.BASE_STATEMENT__BASE:
        setBase(BASE_EDEFAULT);
        return;
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        getBaseunknownstatements().clear();
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
      case YangPackage.BASE_STATEMENT__BASE:
        return BASE_EDEFAULT == null ? base != null : !BASE_EDEFAULT.equals(base);
      case YangPackage.BASE_STATEMENT__BASEUNKNOWNSTATEMENTS:
        return baseunknownstatements != null && !baseunknownstatements.isEmpty();
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
    result.append(" (base: ");
    result.append(base);
    result.append(')');
    return result.toString();
  }

} //BaseStatementImpl
