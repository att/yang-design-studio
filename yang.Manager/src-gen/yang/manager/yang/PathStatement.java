/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.PathStatement#getPath <em>Path</em>}</li>
 *   <li>{@link yang.manager.yang.PathStatement#getPathunknownstatements <em>Pathunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getPathStatement()
 * @model
 * @generated
 */
public interface PathStatement extends TypeSubStatement
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see yang.manager.yang.YangPackage#getPathStatement_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link yang.manager.yang.PathStatement#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Pathunknownstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UnknownStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pathunknownstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pathunknownstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getPathStatement_Pathunknownstatements()
   * @model containment="true"
   * @generated
   */
  EList<UnknownStatement> getPathunknownstatements();

} // PathStatement
