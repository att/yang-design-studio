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

import yang.manager.yang.RequireInstanceStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Require Instance Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.RequireInstanceStatementImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link yang.manager.yang.impl.RequireInstanceStatementImpl#getRequireunknownstatements <em>Requireunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequireInstanceStatementImpl extends TypeSubStatementImpl implements RequireInstanceStatement
{
  /**
   * The default value of the '{@link #getRequire() <em>Require</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequire()
   * @generated
   * @ordered
   */
  protected static final String REQUIRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRequire() <em>Require</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequire()
   * @generated
   * @ordered
   */
  protected String require = REQUIRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRequireunknownstatements() <em>Requireunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequireunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> requireunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequireInstanceStatementImpl()
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
    return YangPackage.eINSTANCE.getRequireInstanceStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRequire()
  {
    return require;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequire(String newRequire)
  {
    String oldRequire = require;
    require = newRequire;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIRE, oldRequire, require));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getRequireunknownstatements()
  {
    if (requireunknownstatements == null)
    {
      requireunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS);
    }
    return requireunknownstatements;
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
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getRequireunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIRE:
        return getRequire();
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS:
        return getRequireunknownstatements();
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
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIRE:
        setRequire((String)newValue);
        return;
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS:
        getRequireunknownstatements().clear();
        getRequireunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIRE:
        setRequire(REQUIRE_EDEFAULT);
        return;
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS:
        getRequireunknownstatements().clear();
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
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIRE:
        return REQUIRE_EDEFAULT == null ? require != null : !REQUIRE_EDEFAULT.equals(require);
      case YangPackage.REQUIRE_INSTANCE_STATEMENT__REQUIREUNKNOWNSTATEMENTS:
        return requireunknownstatements != null && !requireunknownstatements.isEmpty();
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
    result.append(" (require: ");
    result.append(require);
    result.append(')');
    return result.toString();
  }

} //RequireInstanceStatementImpl
