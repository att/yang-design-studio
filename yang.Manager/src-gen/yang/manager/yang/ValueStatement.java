/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.ValueStatement#getIntarg <em>Intarg</em>}</li>
 *   <li>{@link yang.manager.yang.ValueStatement#getValueunknownstatements <em>Valueunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getValueStatement()
 * @model
 * @generated
 */
public interface ValueStatement extends EnumSubstatement
{
  /**
   * Returns the value of the '<em><b>Intarg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Intarg</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Intarg</em>' attribute.
   * @see #setIntarg(String)
   * @see yang.manager.yang.YangPackage#getValueStatement_Intarg()
   * @model
   * @generated
   */
  String getIntarg();

  /**
   * Sets the value of the '{@link yang.manager.yang.ValueStatement#getIntarg <em>Intarg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Intarg</em>' attribute.
   * @see #getIntarg()
   * @generated
   */
  void setIntarg(String value);

  /**
   * Returns the value of the '<em><b>Valueunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Valueunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Valueunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getValueStatement_Valueunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getValueunknownstatements();

} // ValueStatement
