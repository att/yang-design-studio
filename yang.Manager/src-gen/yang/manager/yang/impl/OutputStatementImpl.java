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

import yang.manager.yang.OutputStatement;
import yang.manager.yang.OutputSubstatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.OutputStatementImpl#getOutputsubstatements <em>Outputsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputStatementImpl extends RpcSubstatementImpl implements OutputStatement
{
  /**
   * The cached value of the '{@link #getOutputsubstatements() <em>Outputsubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputsubstatements()
   * @generated
   * @ordered
   */
  protected EList<OutputSubstatement> outputsubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OutputStatementImpl()
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
    return YangPackage.eINSTANCE.getOutputStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OutputSubstatement> getOutputsubstatements()
  {
    if (outputsubstatements == null)
    {
      outputsubstatements = new EObjectContainmentEList<OutputSubstatement>(OutputSubstatement.class, this, YangPackage.OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS);
    }
    return outputsubstatements;
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
      case YangPackage.OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS:
        return ((InternalEList<?>)getOutputsubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS:
        return getOutputsubstatements();
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
      case YangPackage.OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS:
        getOutputsubstatements().clear();
        getOutputsubstatements().addAll((Collection<? extends OutputSubstatement>)newValue);
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
      case YangPackage.OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS:
        getOutputsubstatements().clear();
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
      case YangPackage.OUTPUT_STATEMENT__OUTPUTSUBSTATEMENTS:
        return outputsubstatements != null && !outputsubstatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OutputStatementImpl
