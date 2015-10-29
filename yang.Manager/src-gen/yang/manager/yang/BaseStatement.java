/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.BaseStatement#getBase <em>Base</em>}</li>
 *   <li>{@link yang.manager.yang.BaseStatement#getBaseunknownstatements <em>Baseunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getBaseStatement()
 * @model
 * @generated
 */
public interface BaseStatement extends IdentitySubstatement, TypeSubStatement
{
  /**
   * Returns the value of the '<em><b>Base</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base</em>' attribute.
   * @see #setBase(String)
   * @see yang.manager.yang.YangPackage#getBaseStatement_Base()
   * @model
   * @generated
   */
  String getBase();

  /**
   * Sets the value of the '{@link yang.manager.yang.BaseStatement#getBase <em>Base</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base</em>' attribute.
   * @see #getBase()
   * @generated
   */
  void setBase(String value);

  /**
   * Returns the value of the '<em><b>Baseunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Baseunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Baseunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getBaseStatement_Baseunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getBaseunknownstatements();

} // BaseStatement
