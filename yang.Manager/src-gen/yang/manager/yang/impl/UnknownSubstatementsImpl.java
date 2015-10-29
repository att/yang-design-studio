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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yang.manager.yang.UnknownSubstatements;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unknown Substatements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.UnknownSubstatementsImpl#getPref <em>Pref</em>}</li>
 *   <li>{@link yang.manager.yang.impl.UnknownSubstatementsImpl#getNamestat <em>Namestat</em>}</li>
 *   <li>{@link yang.manager.yang.impl.UnknownSubstatementsImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link yang.manager.yang.impl.UnknownSubstatementsImpl#getUnknownsubstatements <em>Unknownsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnknownSubstatementsImpl extends MinimalEObjectImpl.Container implements UnknownSubstatements
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
   * The default value of the '{@link #getNamestat() <em>Namestat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamestat()
   * @generated
   * @ordered
   */
  protected static final String NAMESTAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamestat() <em>Namestat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamestat()
   * @generated
   * @ordered
   */
  protected String namestat = NAMESTAT_EDEFAULT;

  /**
   * The default value of the '{@link #getArgument() <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected static final String ARGUMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected String argument = ARGUMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getUnknownsubstatements() <em>Unknownsubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnknownsubstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownSubstatements> unknownsubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnknownSubstatementsImpl()
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
    return YangPackage.eINSTANCE.getUnknownSubstatements();
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
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.UNKNOWN_SUBSTATEMENTS__PREF, oldPref, pref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamestat()
  {
    return namestat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamestat(String newNamestat)
  {
    String oldNamestat = namestat;
    namestat = newNamestat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.UNKNOWN_SUBSTATEMENTS__NAMESTAT, oldNamestat, namestat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(String newArgument)
  {
    String oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.UNKNOWN_SUBSTATEMENTS__ARGUMENT, oldArgument, argument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownSubstatements> getUnknownsubstatements()
  {
    if (unknownsubstatements == null)
    {
      unknownsubstatements = new EObjectContainmentEList<UnknownSubstatements>(UnknownSubstatements.class, this, YangPackage.UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS);
    }
    return unknownsubstatements;
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
      case YangPackage.UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS:
        return ((InternalEList<?>)getUnknownsubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.UNKNOWN_SUBSTATEMENTS__PREF:
        return getPref();
      case YangPackage.UNKNOWN_SUBSTATEMENTS__NAMESTAT:
        return getNamestat();
      case YangPackage.UNKNOWN_SUBSTATEMENTS__ARGUMENT:
        return getArgument();
      case YangPackage.UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS:
        return getUnknownsubstatements();
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
      case YangPackage.UNKNOWN_SUBSTATEMENTS__PREF:
        setPref((String)newValue);
        return;
      case YangPackage.UNKNOWN_SUBSTATEMENTS__NAMESTAT:
        setNamestat((String)newValue);
        return;
      case YangPackage.UNKNOWN_SUBSTATEMENTS__ARGUMENT:
        setArgument((String)newValue);
        return;
      case YangPackage.UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS:
        getUnknownsubstatements().clear();
        getUnknownsubstatements().addAll((Collection<? extends UnknownSubstatements>)newValue);
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
      case YangPackage.UNKNOWN_SUBSTATEMENTS__PREF:
        setPref(PREF_EDEFAULT);
        return;
      case YangPackage.UNKNOWN_SUBSTATEMENTS__NAMESTAT:
        setNamestat(NAMESTAT_EDEFAULT);
        return;
      case YangPackage.UNKNOWN_SUBSTATEMENTS__ARGUMENT:
        setArgument(ARGUMENT_EDEFAULT);
        return;
      case YangPackage.UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS:
        getUnknownsubstatements().clear();
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
      case YangPackage.UNKNOWN_SUBSTATEMENTS__PREF:
        return PREF_EDEFAULT == null ? pref != null : !PREF_EDEFAULT.equals(pref);
      case YangPackage.UNKNOWN_SUBSTATEMENTS__NAMESTAT:
        return NAMESTAT_EDEFAULT == null ? namestat != null : !NAMESTAT_EDEFAULT.equals(namestat);
      case YangPackage.UNKNOWN_SUBSTATEMENTS__ARGUMENT:
        return ARGUMENT_EDEFAULT == null ? argument != null : !ARGUMENT_EDEFAULT.equals(argument);
      case YangPackage.UNKNOWN_SUBSTATEMENTS__UNKNOWNSUBSTATEMENTS:
        return unknownsubstatements != null && !unknownsubstatements.isEmpty();
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
    result.append(", namestat: ");
    result.append(namestat);
    result.append(", argument: ");
    result.append(argument);
    result.append(')');
    return result.toString();
  }

} //UnknownSubstatementsImpl
