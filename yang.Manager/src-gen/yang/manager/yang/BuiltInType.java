/**
 */
package yang.manager.yang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Built In Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.BuiltInType#getBtype <em>Btype</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getBuiltInType()
 * @model
 * @generated
 */
public interface BuiltInType extends EObject
{
  /**
   * Returns the value of the '<em><b>Btype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Btype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Btype</em>' attribute.
   * @see #setBtype(String)
   * @see yang.manager.yang.YangPackage#getBuiltInType_Btype()
   * @model
   * @generated
   */
  String getBtype();

  /**
   * Sets the value of the '{@link yang.manager.yang.BuiltInType#getBtype <em>Btype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Btype</em>' attribute.
   * @see #getBtype()
   * @generated
   */
  void setBtype(String value);

} // BuiltInType
