/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Choice Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.ChoiceStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.manager.yang.ChoiceStatement#getChoicesubstatements <em>Choicesubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getChoiceStatement()
 * @model
 * @generated
 */
public interface ChoiceStatement extends DatadefStatement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see yang.manager.yang.YangPackage#getChoiceStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link yang.manager.yang.ChoiceStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Choicesubstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.ChoiceSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Choicesubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Choicesubstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getChoiceStatement_Choicesubstatements()
   * @model containment="true"
   * @generated
   */
  EList<ChoiceSubstatement> getChoicesubstatements();

} // ChoiceStatement
