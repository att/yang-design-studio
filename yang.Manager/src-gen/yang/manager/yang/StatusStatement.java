/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.StatusStatement#getStatus <em>Status</em>}</li>
 *   <li>{@link yang.manager.yang.StatusStatement#getStatusunknownstatements <em>Statusunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getStatusStatement()
 * @model
 * @generated
 */
public interface StatusStatement extends RpcSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, GroupingSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement, ExtensionSubstatement, IdentitySubstatement, FeatureSubstatement, TypedefSubstatement, BitSubstatement, EnumSubstatement
{
  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see yang.manager.yang.YangPackage#getStatusStatement_Status()
   * @model
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link yang.manager.yang.StatusStatement#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

  /**
   * Returns the value of the '<em><b>Statusunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statusunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statusunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getStatusStatement_Statusunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getStatusunknownstatements();

} // StatusStatement
