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

import yang.manager.yang.AnyxmlStatement;
import yang.manager.yang.AnyxmlSubstatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anyxml Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.AnyxmlStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.AnyxmlStatementImpl#getAnyxmlsubstatements <em>Anyxmlsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnyxmlStatementImpl extends DatadefStatementImpl implements AnyxmlStatement
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
   * The cached value of the '{@link #getAnyxmlsubstatements() <em>Anyxmlsubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnyxmlsubstatements()
   * @generated
   * @ordered
   */
  protected EList<AnyxmlSubstatement> anyxmlsubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnyxmlStatementImpl()
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
    return YangPackage.eINSTANCE.getAnyxmlStatement();
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
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.ANYXML_STATEMENT__ARG, oldArg, arg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnyxmlSubstatement> getAnyxmlsubstatements()
  {
    if (anyxmlsubstatements == null)
    {
      anyxmlsubstatements = new EObjectContainmentEList<AnyxmlSubstatement>(AnyxmlSubstatement.class, this, YangPackage.ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS);
    }
    return anyxmlsubstatements;
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
      case YangPackage.ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS:
        return ((InternalEList<?>)getAnyxmlsubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.ANYXML_STATEMENT__ARG:
        return getArg();
      case YangPackage.ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS:
        return getAnyxmlsubstatements();
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
      case YangPackage.ANYXML_STATEMENT__ARG:
        setArg((String)newValue);
        return;
      case YangPackage.ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS:
        getAnyxmlsubstatements().clear();
        getAnyxmlsubstatements().addAll((Collection<? extends AnyxmlSubstatement>)newValue);
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
      case YangPackage.ANYXML_STATEMENT__ARG:
        setArg(ARG_EDEFAULT);
        return;
      case YangPackage.ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS:
        getAnyxmlsubstatements().clear();
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
      case YangPackage.ANYXML_STATEMENT__ARG:
        return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
      case YangPackage.ANYXML_STATEMENT__ANYXMLSUBSTATEMENTS:
        return anyxmlsubstatements != null && !anyxmlsubstatements.isEmpty();
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

} //AnyxmlStatementImpl
