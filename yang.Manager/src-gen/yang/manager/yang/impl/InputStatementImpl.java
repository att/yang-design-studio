/**
 */
package yang.manager.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yang.manager.yang.InputStatement;
import yang.manager.yang.InputSubstatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.InputStatementImpl#getInputsubstatements <em>Inputsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputStatementImpl extends RpcSubstatementImpl implements InputStatement
{
  /**
   * The cached value of the '{@link #getInputsubstatements() <em>Inputsubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputsubstatements()
   * @generated
   * @ordered
   */
  protected EList<InputSubstatement> inputsubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InputStatementImpl()
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
    return YangPackage.eINSTANCE.getInputStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InputSubstatement> getInputsubstatements()
  {
    if (inputsubstatements == null)
    {
      inputsubstatements = new EObjectContainmentEList<InputSubstatement>(InputSubstatement.class, this, YangPackage.INPUT_STATEMENT__INPUTSUBSTATEMENTS);
    }
    return inputsubstatements;
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
      case YangPackage.INPUT_STATEMENT__INPUTSUBSTATEMENTS:
        return ((InternalEList<?>)getInputsubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.INPUT_STATEMENT__INPUTSUBSTATEMENTS:
        return getInputsubstatements();
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
      case YangPackage.INPUT_STATEMENT__INPUTSUBSTATEMENTS:
        getInputsubstatements().clear();
        getInputsubstatements().addAll((Collection<? extends InputSubstatement>)newValue);
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
      case YangPackage.INPUT_STATEMENT__INPUTSUBSTATEMENTS:
        getInputsubstatements().clear();
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
      case YangPackage.INPUT_STATEMENT__INPUTSUBSTATEMENTS:
        return inputsubstatements != null && !inputsubstatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InputStatementImpl
