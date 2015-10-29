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

import yang.manager.yang.MinElementsStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Min Elements Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.MinElementsStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.MinElementsStatementImpl#getMinelementsunknownstatements <em>Minelementsunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MinElementsStatementImpl extends ListSubstatementImpl implements MinElementsStatement
{
  /**
   * The default value of the '{@link #getArg() <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected static final String ARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArg() <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected String arg = ARG_EDEFAULT;

  /**
   * The cached value of the '{@link #getMinelementsunknownstatements() <em>Minelementsunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinelementsunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> minelementsunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MinElementsStatementImpl()
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
    return YangPackage.eINSTANCE.getMinElementsStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(String newArg)
  {
    String oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.MIN_ELEMENTS_STATEMENT__ARG, oldArg, arg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getMinelementsunknownstatements()
  {
    if (minelementsunknownstatements == null)
    {
      minelementsunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS);
    }
    return minelementsunknownstatements;
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
      case YangPackage.MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getMinelementsunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.MIN_ELEMENTS_STATEMENT__ARG:
        return getArg();
      case YangPackage.MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS:
        return getMinelementsunknownstatements();
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
      case YangPackage.MIN_ELEMENTS_STATEMENT__ARG:
        setArg((String)newValue);
        return;
      case YangPackage.MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS:
        getMinelementsunknownstatements().clear();
        getMinelementsunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.MIN_ELEMENTS_STATEMENT__ARG:
        setArg(ARG_EDEFAULT);
        return;
      case YangPackage.MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS:
        getMinelementsunknownstatements().clear();
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
      case YangPackage.MIN_ELEMENTS_STATEMENT__ARG:
        return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
      case YangPackage.MIN_ELEMENTS_STATEMENT__MINELEMENTSUNKNOWNSTATEMENTS:
        return minelementsunknownstatements != null && !minelementsunknownstatements.isEmpty();
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
    result.append(" (arg: ");
    result.append(arg);
    result.append(')');
    return result.toString();
  }

} //MinElementsStatementImpl
