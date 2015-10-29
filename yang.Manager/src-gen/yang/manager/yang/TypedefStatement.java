/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.TypedefStatement#getName <em>Name</em>}</li>
 *   <li>{@link yang.manager.yang.TypedefStatement#getTypedefsubstatemnet <em>Typedefsubstatemnet</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getTypedefStatement()
 * @model
 * @generated
 */
public interface TypedefStatement extends ModuleStatement, SubmoduleStatement, RpcSubstatement, InputSubstatement, OutputSubstatement, NotificationSubstatement, ContainerSubstatement, ListSubstatement, GroupingSubstatement
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
   * @see yang.manager.yang.YangPackage#getTypedefStatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link yang.manager.yang.TypedefStatement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Typedefsubstatemnet</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.TypedefSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typedefsubstatemnet</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typedefsubstatemnet</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getTypedefStatement_Typedefsubstatemnet()
   * @model containment="true"
   * @generated
   */
  EList<TypedefSubstatement> getTypedefsubstatemnet();

} // TypedefStatement
