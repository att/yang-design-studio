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

import yang.manager.yang.FeatureStatement;
import yang.manager.yang.IfFeatureStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Feature Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.IfFeatureStatementImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link yang.manager.yang.impl.IfFeatureStatementImpl#getIdent <em>Ident</em>}</li>
 *   <li>{@link yang.manager.yang.impl.IfFeatureStatementImpl#getIffeatureunknownstatements <em>Iffeatureunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfFeatureStatementImpl extends RpcSubstatementImpl implements IfFeatureStatement
{
  /**
   * The default value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected static final String PREF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPref() <em>Pref</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPref()
   * @generated
   * @ordered
   */
  protected String pref = PREF_EDEFAULT;

  /**
   * The cached value of the '{@link #getIdent() <em>Ident</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdent()
   * @generated
   * @ordered
   */
  protected FeatureStatement ident;

  /**
   * The cached value of the '{@link #getIffeatureunknownstatements() <em>Iffeatureunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIffeatureunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> iffeatureunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfFeatureStatementImpl()
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
    return YangPackage.eINSTANCE.getIfFeatureStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPref()
  {
    return pref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPref(String newPref)
  {
    String oldPref = pref;
    pref = newPref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.IF_FEATURE_STATEMENT__PREF, oldPref, pref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureStatement getIdent()
  {
    if (ident != null && ident.eIsProxy())
    {
      InternalEObject oldIdent = (InternalEObject)ident;
      ident = (FeatureStatement)eResolveProxy(oldIdent);
      if (ident != oldIdent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, YangPackage.IF_FEATURE_STATEMENT__IDENT, oldIdent, ident));
      }
    }
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureStatement basicGetIdent()
  {
    return ident;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdent(FeatureStatement newIdent)
  {
    FeatureStatement oldIdent = ident;
    ident = newIdent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.IF_FEATURE_STATEMENT__IDENT, oldIdent, ident));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getIffeatureunknownstatements()
  {
    if (iffeatureunknownstatements == null)
    {
      iffeatureunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS);
    }
    return iffeatureunknownstatements;
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
      case YangPackage.IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getIffeatureunknownstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.IF_FEATURE_STATEMENT__PREF:
        return getPref();
      case YangPackage.IF_FEATURE_STATEMENT__IDENT:
        if (resolve) return getIdent();
        return basicGetIdent();
      case YangPackage.IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS:
        return getIffeatureunknownstatements();
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
      case YangPackage.IF_FEATURE_STATEMENT__PREF:
        setPref((String)newValue);
        return;
      case YangPackage.IF_FEATURE_STATEMENT__IDENT:
        setIdent((FeatureStatement)newValue);
        return;
      case YangPackage.IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS:
        getIffeatureunknownstatements().clear();
        getIffeatureunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
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
      case YangPackage.IF_FEATURE_STATEMENT__PREF:
        setPref(PREF_EDEFAULT);
        return;
      case YangPackage.IF_FEATURE_STATEMENT__IDENT:
        setIdent((FeatureStatement)null);
        return;
      case YangPackage.IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS:
        getIffeatureunknownstatements().clear();
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
      case YangPackage.IF_FEATURE_STATEMENT__PREF:
        return PREF_EDEFAULT == null ? pref != null : !PREF_EDEFAULT.equals(pref);
      case YangPackage.IF_FEATURE_STATEMENT__IDENT:
        return ident != null;
      case YangPackage.IF_FEATURE_STATEMENT__IFFEATUREUNKNOWNSTATEMENTS:
        return iffeatureunknownstatements != null && !iffeatureunknownstatements.isEmpty();
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
    result.append(" (pref: ");
    result.append(pref);
    result.append(')');
    return result.toString();
  }

} //IfFeatureStatementImpl
