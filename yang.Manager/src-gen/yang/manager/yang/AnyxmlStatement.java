/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anyxml Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.AnyxmlStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.AnyxmlStatement#getAnyxmlsubstatements <em>Anyxmlsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getAnyxmlStatement()
 * @model
 * @generated
 */
public interface AnyxmlStatement extends DatadefStatement, ChoiceSubstatement
{
  /**
   * Returns the value of the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' attribute.
   * @see #setArg(String)
   * @see yang.manager.yang.YangPackage#getAnyxmlStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link yang.manager.yang.AnyxmlStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Anyxmlsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.AnyxmlSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anyxmlsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anyxmlsubstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getAnyxmlStatement_Anyxmlsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<AnyxmlSubstatement> getAnyxmlsubstatements();

} // AnyxmlStatement
