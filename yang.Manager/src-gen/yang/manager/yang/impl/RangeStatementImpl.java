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

import yang.manager.yang.MultipleSubstatement;
import yang.manager.yang.RangeStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Range Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.RangeStatementImpl#getRange <em>Range</em>}</li>
 *   <li>{@link yang.manager.yang.impl.RangeStatementImpl#getRangesubstatements <em>Rangesubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RangeStatementImpl extends TypeSubStatementImpl implements RangeStatement
{
  /**
   * The default value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected static final String RANGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRange() <em>Range</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRange()
   * @generated
   * @ordered
   */
  protected String range = RANGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRangesubstatements() <em>Rangesubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRangesubstatements()
   * @generated
   * @ordered
   */
  protected EList<MultipleSubstatement> rangesubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RangeStatementImpl()
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
    return YangPackage.eINSTANCE.getRangeStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRange()
  {
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRange(String newRange)
  {
    String oldRange = range;
    range = newRange;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.RANGE_STATEMENT__RANGE, oldRange, range));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultipleSubstatement> getRangesubstatements()
  {
    if (rangesubstatements == null)
    {
      rangesubstatements = new EObjectContainmentEList<MultipleSubstatement>(MultipleSubstatement.class, this, YangPackage.RANGE_STATEMENT__RANGESUBSTATEMENTS);
    }
    return rangesubstatements;
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
      case YangPackage.RANGE_STATEMENT__RANGESUBSTATEMENTS:
        return ((InternalEList<?>)getRangesubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.RANGE_STATEMENT__RANGE:
        return getRange();
      case YangPackage.RANGE_STATEMENT__RANGESUBSTATEMENTS:
        return getRangesubstatements();
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
      case YangPackage.RANGE_STATEMENT__RANGE:
        setRange((String)newValue);
        return;
      case YangPackage.RANGE_STATEMENT__RANGESUBSTATEMENTS:
        getRangesubstatements().clear();
        getRangesubstatements().addAll((Collection<? extends MultipleSubstatement>)newValue);
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
      case YangPackage.RANGE_STATEMENT__RANGE:
        setRange(RANGE_EDEFAULT);
        return;
      case YangPackage.RANGE_STATEMENT__RANGESUBSTATEMENTS:
        getRangesubstatements().clear();
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
      case YangPackage.RANGE_STATEMENT__RANGE:
        return RANGE_EDEFAULT == null ? range != null : !RANGE_EDEFAULT.equals(range);
      case YangPackage.RANGE_STATEMENT__RANGESUBSTATEMENTS:
        return rangesubstatements != null && !rangesubstatements.isEmpty();
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
    result.append(" (range: ");
    result.append(range);
    result.append(')');
    return result.toString();
  }

} //RangeStatementImpl
