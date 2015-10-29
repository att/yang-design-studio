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

import yang.manager.yang.UnknownStatement;
import yang.manager.yang.ValueStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.ValueStatementImpl#getIntarg <em>Intarg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.ValueStatementImpl#getValueunknownstatements <em>Valueunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueStatementImpl extends EnumSubstatementImpl implements ValueStatement
{
  /**
   * The default value of the '{@link #getIntarg() <em>Intarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntarg()
   * @generated
   * @ordered
   */
  protected static final String INTARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntarg() <em>Intarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntarg()
   * @generated
   * @ordered
   */
  protected String intarg = INTARG_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueunknownstatements() <em>Valueunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> valueunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValueStatementImpl()
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
    return YangPackage.eINSTANCE.getValueStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIntarg()
  {
    return intarg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntarg(String newIntarg)
  {
    String oldIntarg = intarg;
    intarg = newIntarg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.VALUE_STATEMENT__INTARG, oldIntarg, intarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getValueunknownstatements()
  {
    if (valueunknownstatements == null)
    {
      valueunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS);
    }
    return valueunknownstatements;
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
      case YangPackage.VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getValueunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.VALUE_STATEMENT__INTARG:
        return getIntarg();
      case YangPackage.VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS:
        return getValueunknownstatements();
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
      case YangPackage.VALUE_STATEMENT__INTARG:
        setIntarg((String)newValue);
        return;
      case YangPackage.VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS:
        getValueunknownstatements().clear();
        getValueunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.VALUE_STATEMENT__INTARG:
        setIntarg(INTARG_EDEFAULT);
        return;
      case YangPackage.VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS:
        getValueunknownstatements().clear();
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
      case YangPackage.VALUE_STATEMENT__INTARG:
        return INTARG_EDEFAULT == null ? intarg != null : !INTARG_EDEFAULT.equals(intarg);
      case YangPackage.VALUE_STATEMENT__VALUEUNKNOWNSTATEMENTS:
        return valueunknownstatements != null && !valueunknownstatements.isEmpty();
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
    result.append(" (intarg: ");
    result.append(intarg);
    result.append(')');
    return result.toString();
  }

} //ValueStatementImpl
