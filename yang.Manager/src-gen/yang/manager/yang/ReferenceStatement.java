/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.ReferenceStatement#getReference <em>Reference</em>}</li>
 *   <li>{@link yang.manager.yang.ReferenceStatement#getReferenceunknownstatements <em>Referenceunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getReferenceStatement()
 * @model
 * @generated
 */
public interface ReferenceStatement extends MultipleSubstatement, RpcSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, GroupingSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement, RefineSubstatement, DeviationSubstatement, ExtensionSubstatement, IdentitySubstatement, FeatureSubstatement, TypedefSubstatement, BitSubstatement, EnumSubstatement, WhenSubstatements, RevisionSubstatements
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see yang.manager.yang.YangPackage#getReferenceStatement_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link yang.manager.yang.ReferenceStatement#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Referenceunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenceunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenceunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getReferenceStatement_Referenceunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getReferenceunknownstatements();

} // ReferenceStatement
