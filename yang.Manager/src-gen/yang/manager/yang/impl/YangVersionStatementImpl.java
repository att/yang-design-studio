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
import yang.manager.yang.YangPackage;
import yang.manager.yang.YangVersionStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Version Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.YangVersionStatementImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link yang.manager.yang.impl.YangVersionStatementImpl#getYangversionunknownstatements <em>Yangversionunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class YangVersionStatementImpl extends ModuleStatementImpl implements YangVersionStatement
{
  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getYangversionunknownstatements() <em>Yangversionunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYangversionunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> yangversionunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YangVersionStatementImpl()
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
    return YangPackage.eINSTANCE.getYangVersionStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.YANG_VERSION_STATEMENT__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getYangversionunknownstatements()
  {
    if (yangversionunknownstatements == null)
    {
      yangversionunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS);
    }
    return yangversionunknownstatements;
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
      case YangPackage.YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getYangversionunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.YANG_VERSION_STATEMENT__VERSION:
        return getVersion();
      case YangPackage.YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS:
        return getYangversionunknownstatements();
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
      case YangPackage.YANG_VERSION_STATEMENT__VERSION:
        setVersion((String)newValue);
        return;
      case YangPackage.YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS:
        getYangversionunknownstatements().clear();
        getYangversionunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.YANG_VERSION_STATEMENT__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case YangPackage.YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS:
        getYangversionunknownstatements().clear();
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
      case YangPackage.YANG_VERSION_STATEMENT__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case YangPackage.YANG_VERSION_STATEMENT__YANGVERSIONUNKNOWNSTATEMENTS:
        return yangversionunknownstatements != null && !yangversionunknownstatements.isEmpty();
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
    result.append(" (version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //YangVersionStatementImpl
