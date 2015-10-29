/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.DescriptionStatement#getDescription <em>Description</em>}</li>
 *   <li>{@link yang.manager.yang.DescriptionStatement#getDescriptionunknownstatements <em>Descriptionunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getDescriptionStatement()
 * @model
 * @generated
 */
public interface DescriptionStatement extends ModuleStatement, SubmoduleStatement, MultipleSubstatement, RpcSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, GroupingSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement, RefineSubstatement, DeviationSubstatement, ExtensionSubstatement, IdentitySubstatement, FeatureSubstatement, TypedefSubstatement, BitSubstatement, EnumSubstatement, WhenSubstatements, RevisionSubstatements
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see yang.manager.yang.YangPackage#getDescriptionStatement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link yang.manager.yang.DescriptionStatement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Descriptionunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Descriptionunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Descriptionunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getDescriptionStatement_Descriptionunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getDescriptionunknownstatements();

} // DescriptionStatement
