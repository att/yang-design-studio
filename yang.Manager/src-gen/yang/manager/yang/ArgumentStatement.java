/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.ArgumentStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.ArgumentStatement#getArgumentsubstatements <em>Argumentsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getArgumentStatement()
 * @model
 * @generated
 */
public interface ArgumentStatement extends ExtensionSubstatement
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
   * @see yang.manager.yang.YangPackage#getArgumentStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link yang.manager.yang.ArgumentStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Argumentsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.ArgumentSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argumentsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argumentsubstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getArgumentStatement_Argumentsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<ArgumentSubstatement> getArgumentsubstatements();

} // ArgumentStatement
