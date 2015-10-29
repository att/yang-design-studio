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

import yang.manager.yang.BelongsToStatement;
import yang.manager.yang.BelongsToSubstatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Belongs To Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.BelongsToStatementImpl#getName <em>Name</em>}</li>
 *   <li>{@link yang.manager.yang.impl.BelongsToStatementImpl#getBelongstosubstatement <em>Belongstosubstatement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BelongsToStatementImpl extends SubmoduleStatementImpl implements BelongsToStatement
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getBelongstosubstatement() <em>Belongstosubstatement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBelongstosubstatement()
   * @generated
   * @ordered
   */
  protected EList<BelongsToSubstatement> belongstosubstatement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BelongsToStatementImpl()
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
    return YangPackage.eINSTANCE.getBelongsToStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.BELONGS_TO_STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BelongsToSubstatement> getBelongstosubstatement()
  {
    if (belongstosubstatement == null)
    {
      belongstosubstatement = new EObjectContainmentEList<BelongsToSubstatement>(BelongsToSubstatement.class, this, YangPackage.BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT);
    }
    return belongstosubstatement;
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
      case YangPackage.BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT:
        return ((InternalEList<?>)getBelongstosubstatement()).basicRemove(otherEnd, msgs);
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
      case YangPackage.BELONGS_TO_STATEMENT__NAME:
        return getName();
      case YangPackage.BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT:
        return getBelongstosubstatement();
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
      case YangPackage.BELONGS_TO_STATEMENT__NAME:
        setName((String)newValue);
        return;
      case YangPackage.BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT:
        getBelongstosubstatement().clear();
        getBelongstosubstatement().addAll((Collection<? extends BelongsToSubstatement>)newValue);
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
      case YangPackage.BELONGS_TO_STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case YangPackage.BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT:
        getBelongstosubstatement().clear();
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
      case YangPackage.BELONGS_TO_STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case YangPackage.BELONGS_TO_STATEMENT__BELONGSTOSUBSTATEMENT:
        return belongstosubstatement != null && !belongstosubstatement.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //BelongsToStatementImpl
