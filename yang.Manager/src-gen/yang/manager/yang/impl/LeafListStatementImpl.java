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

import yang.manager.yang.LeafListStatement;
import yang.manager.yang.LeafListSubstatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Leaf List Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.LeafListStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.LeafListStatementImpl#getLeaflistsubstatements <em>Leaflistsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LeafListStatementImpl extends DatadefStatementImpl implements LeafListStatement
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
   * The cached value of the '{@link #getLeaflistsubstatements() <em>Leaflistsubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeaflistsubstatements()
   * @generated
   * @ordered
   */
  protected EList<LeafListSubstatement> leaflistsubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LeafListStatementImpl()
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
    return YangPackage.eINSTANCE.getLeafListStatement();
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
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.LEAF_LIST_STATEMENT__ARG, oldArg, arg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LeafListSubstatement> getLeaflistsubstatements()
  {
    if (leaflistsubstatements == null)
    {
      leaflistsubstatements = new EObjectContainmentEList<LeafListSubstatement>(LeafListSubstatement.class, this, YangPackage.LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS);
    }
    return leaflistsubstatements;
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
      case YangPackage.LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS:
        return ((InternalEList<?>)getLeaflistsubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.LEAF_LIST_STATEMENT__ARG:
        return getArg();
      case YangPackage.LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS:
        return getLeaflistsubstatements();
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
      case YangPackage.LEAF_LIST_STATEMENT__ARG:
        setArg((String)newValue);
        return;
      case YangPackage.LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS:
        getLeaflistsubstatements().clear();
        getLeaflistsubstatements().addAll((Collection<? extends LeafListSubstatement>)newValue);
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
      case YangPackage.LEAF_LIST_STATEMENT__ARG:
        setArg(ARG_EDEFAULT);
        return;
      case YangPackage.LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS:
        getLeaflistsubstatements().clear();
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
      case YangPackage.LEAF_LIST_STATEMENT__ARG:
        return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
      case YangPackage.LEAF_LIST_STATEMENT__LEAFLISTSUBSTATEMENTS:
        return leaflistsubstatements != null && !leaflistsubstatements.isEmpty();
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

} //LeafListStatementImpl
