/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uses Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.UsesStatement#getPre <em>Pre</em>}</li>
 *   <li>{@link yang.manager.yang.UsesStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.UsesStatement#getUsessubstatements <em>Usessubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getUsesStatement()
 * @model
 * @generated
 */
public interface UsesStatement extends DatadefStatement
{
  /**
   * Returns the value of the '<em><b>Pre</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre</em>' attribute.
   * @see #setPre(String)
   * @see yang.manager.yang.YangPackage#getUsesStatement_Pre()
   * @model
   * @generated
   */
  String getPre();

  /**
   * Sets the value of the '{@link yang.manager.yang.UsesStatement#getPre <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre</em>' attribute.
   * @see #getPre()
   * @generated
   */
  void setPre(String value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' reference.
   * @see #setArg(GroupingStatement)
   * @see yang.manager.yang.YangPackage#getUsesStatement_Arg()
   * @model
   * @generated
   */
  GroupingStatement getArg();

  /**
   * Sets the value of the '{@link yang.manager.yang.UsesStatement#getArg <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' reference.
   * @see #getArg()
   * @generated
   */
  void setArg(GroupingStatement value);

  /**
   * Returns the value of the '<em><b>Usessubstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.UsesSubstatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Usessubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Usessubstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getUsesStatement_Usessubstatements()
   * @model containment="true"
   * @generated
   */
  EList<UsesSubstatement> getUsessubstatements();

} // UsesStatement
