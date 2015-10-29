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

import yang.manager.yang.AugmentSubstatement;
import yang.manager.yang.AugmentUsesStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Augment Uses Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.AugmentUsesStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.AugmentUsesStatementImpl#getAugmentsubstatements <em>Augmentsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AugmentUsesStatementImpl extends UsesSubstatementImpl implements AugmentUsesStatement
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
   * The cached value of the '{@link #getAugmentsubstatements() <em>Augmentsubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAugmentsubstatements()
   * @generated
   * @ordered
   */
  protected EList<AugmentSubstatement> augmentsubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AugmentUsesStatementImpl()
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
    return YangPackage.eINSTANCE.getAugmentUsesStatement();
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
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.AUGMENT_USES_STATEMENT__ARG, oldArg, arg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AugmentSubstatement> getAugmentsubstatements()
  {
    if (augmentsubstatements == null)
    {
      augmentsubstatements = new EObjectContainmentEList<AugmentSubstatement>(AugmentSubstatement.class, this, YangPackage.AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS);
    }
    return augmentsubstatements;
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
      case YangPackage.AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS:
        return ((InternalEList<?>)getAugmentsubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.AUGMENT_USES_STATEMENT__ARG:
        return getArg();
      case YangPackage.AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS:
        return getAugmentsubstatements();
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
      case YangPackage.AUGMENT_USES_STATEMENT__ARG:
        setArg((String)newValue);
        return;
      case YangPackage.AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS:
        getAugmentsubstatements().clear();
        getAugmentsubstatements().addAll((Collection<? extends AugmentSubstatement>)newValue);
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
      case YangPackage.AUGMENT_USES_STATEMENT__ARG:
        setArg(ARG_EDEFAULT);
        return;
      case YangPackage.AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS:
        getAugmentsubstatements().clear();
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
      case YangPackage.AUGMENT_USES_STATEMENT__ARG:
        return ARG_EDEFAULT == null ? arg != null : !ARG_EDEFAULT.equals(arg);
      case YangPackage.AUGMENT_USES_STATEMENT__AUGMENTSUBSTATEMENTS:
        return augmentsubstatements != null && !augmentsubstatements.isEmpty();
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

} //AugmentUsesStatementImpl
