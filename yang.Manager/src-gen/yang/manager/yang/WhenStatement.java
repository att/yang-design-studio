/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>When Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.WhenStatement#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.WhenStatement#getWhensubstatements <em>Whensubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getWhenStatement()
 * @model
 * @generated
 */
public interface WhenStatement extends ContainerSubstatement, ListSubstatement, LeafSubstatement, LeafListSubstatement, ChoiceSubstatement, CaseSubstatement, AnyxmlSubstatement, UsesSubstatement, AugmentSubstatement
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
   * @see yang.manager.yang.YangPackage#getWhenStatement_Arg()
   * @model
   * @generated
   */
  String getArg();

  /**
   * Sets the value of the '{@link yang.manager.yang.WhenStatement#getArg <em>Arg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' attribute.
   * @see #getArg()
   * @generated
   */
  void setArg(String value);

  /**
   * Returns the value of the '<em><b>Whensubstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.WhenSubstatements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whensubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whensubstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getWhenStatement_Whensubstatements()
   * @model containment="true"
   * @generated
   */
  EList<WhenSubstatements> getWhensubstatements();

} // WhenStatement
