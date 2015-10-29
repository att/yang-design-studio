/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Require Instance Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.RequireInstanceStatement#getRequire <em>Require</em>}</li>
 *   <li>{@link yang.manager.yang.RequireInstanceStatement#getRequireunknownstatements <em>Requireunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getRequireInstanceStatement()
 * @model
 * @generated
 */
public interface RequireInstanceStatement extends TypeSubStatement
{
  /**
   * Returns the value of the '<em><b>Require</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Require</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Require</em>' attribute.
   * @see #setRequire(String)
   * @see yang.manager.yang.YangPackage#getRequireInstanceStatement_Require()
   * @model
   * @generated
   */
  String getRequire();

  /**
   * Sets the value of the '{@link yang.manager.yang.RequireInstanceStatement#getRequire <em>Require</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Require</em>' attribute.
   * @see #getRequire()
   * @generated
   */
  void setRequire(String value);

  /**
   * Returns the value of the '<em><b>Requireunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requireunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requireunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getRequireInstanceStatement_Requireunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getRequireunknownstatements();

} // RequireInstanceStatement
