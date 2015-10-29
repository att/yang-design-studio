/**
 */
package yang.manager.yang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link yang.manager.yang.ImportStatement#getImportURI <em>Import URI</em>}</li>
 *   <li>{@link yang.manager.yang.ImportStatement#getImportsubstatements <em>Importsubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @see yang.manager.yang.YangPackage#getImportStatement()
 * @model
 * @generated
 */
public interface ImportStatement extends ModuleStatement, SubmoduleStatement
{
  /**
   * Returns the value of the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import URI</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import URI</em>' attribute.
   * @see #setImportURI(String)
   * @see yang.manager.yang.YangPackage#getImportStatement_ImportURI()
   * @model
   * @generated
   */
  String getImportURI();

  /**
   * Sets the value of the '{@link yang.manager.yang.ImportStatement#getImportURI <em>Import URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import URI</em>' attribute.
   * @see #getImportURI()
   * @generated
   */
  void setImportURI(String value);

  /**
   * Returns the value of the '<em><b>Importsubstatements</b></em>' containment reference list.
   * The list contents are of type {@link yang.manager.yang.ImportSubstatements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Importsubstatements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Importsubstatements</em>' containment reference list.
   * @see yang.manager.yang.YangPackage#getImportStatement_Importsubstatements()
   * @model containment="true"
   * @generated
   */
  EList<ImportSubstatements> getImportsubstatements();

} // ImportStatement
