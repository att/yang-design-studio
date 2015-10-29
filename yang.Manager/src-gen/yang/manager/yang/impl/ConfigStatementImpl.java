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

import yang.manager.yang.ConfigStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.ConfigStatementImpl#getBoolarg <em>Boolarg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.ConfigStatementImpl#getConfigunknownstatements <em>Configunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigStatementImpl extends ContainerSubstatementImpl implements ConfigStatement
{
  /**
   * The default value of the '{@link #getBoolarg() <em>Boolarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolarg()
   * @generated
   * @ordered
   */
  protected static final String BOOLARG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolarg() <em>Boolarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolarg()
   * @generated
   * @ordered
   */
  protected String boolarg = BOOLARG_EDEFAULT;

  /**
   * The cached value of the '{@link #getConfigunknownstatements() <em>Configunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> configunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConfigStatementImpl()
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
    return YangPackage.eINSTANCE.getConfigStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolarg()
  {
    return boolarg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolarg(String newBoolarg)
  {
    String oldBoolarg = boolarg;
    boolarg = newBoolarg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.CONFIG_STATEMENT__BOOLARG, oldBoolarg, boolarg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getConfigunknownstatements()
  {
    if (configunknownstatements == null)
    {
      configunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS);
    }
    return configunknownstatements;
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
      case YangPackage.CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getConfigunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.CONFIG_STATEMENT__BOOLARG:
        return getBoolarg();
      case YangPackage.CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS:
        return getConfigunknownstatements();
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
      case YangPackage.CONFIG_STATEMENT__BOOLARG:
        setBoolarg((String)newValue);
        return;
      case YangPackage.CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS:
        getConfigunknownstatements().clear();
        getConfigunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.CONFIG_STATEMENT__BOOLARG:
        setBoolarg(BOOLARG_EDEFAULT);
        return;
      case YangPackage.CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS:
        getConfigunknownstatements().clear();
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
      case YangPackage.CONFIG_STATEMENT__BOOLARG:
        return BOOLARG_EDEFAULT == null ? boolarg != null : !BOOLARG_EDEFAULT.equals(boolarg);
      case YangPackage.CONFIG_STATEMENT__CONFIGUNKNOWNSTATEMENTS:
        return configunknownstatements != null && !configunknownstatements.isEmpty();
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
    result.append(" (boolarg: ");
    result.append(boolarg);
    result.append(')');
    return result.toString();
  }

} //ConfigStatementImpl
