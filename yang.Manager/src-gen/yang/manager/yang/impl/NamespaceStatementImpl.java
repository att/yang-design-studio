/**
 */
package yang.manager.yang.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import yang.manager.yang.NamespaceStatement;
import yang.manager.yang.UnknownStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.NamespaceStatementImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link yang.manager.yang.impl.NamespaceStatementImpl#getNamespaceunknownstatements <em>Namespaceunknownstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceStatementImpl extends ModuleStatementImpl implements NamespaceStatement
{
  /**
   * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected static final String URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUri()
   * @generated
   * @ordered
   */
  protected String uri = URI_EDEFAULT;

  /**
   * The cached value of the '{@link #getNamespaceunknownstatements() <em>Namespaceunknownstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaceunknownstatements()
   * @generated
   * @ordered
   */
  protected EList<UnknownStatement> namespaceunknownstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NamespaceStatementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return YangPackage.eINSTANCE.getNamespaceStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUri()
  {
    return uri;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUri(String newUri)
  {
    String oldUri = uri;
    uri = newUri;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.NAMESPACE_STATEMENT__URI, oldUri, uri));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UnknownStatement> getNamespaceunknownstatements()
  {
    if (namespaceunknownstatements == null)
    {
      namespaceunknownstatements = new EObjectContainmentEList<UnknownStatement>(UnknownStatement.class, this, YangPackage.NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS);
    }
    return namespaceunknownstatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case YangPackage.NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS:
        return ((InternalEList<?>)getNamespaceunknownstatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case YangPackage.NAMESPACE_STATEMENT__URI:
        return getUri();
      case YangPackage.NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS:
        return getNamespaceunknownstatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case YangPackage.NAMESPACE_STATEMENT__URI:
        setUri((String)newValue);
        return;
      case YangPackage.NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS:
        getNamespaceunknownstatements().clear();
        getNamespaceunknownstatements().addAll((Collection<? extends UnknownStatement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.NAMESPACE_STATEMENT__URI:
        setUri(URI_EDEFAULT);
        return;
      case YangPackage.NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS:
        getNamespaceunknownstatements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case YangPackage.NAMESPACE_STATEMENT__URI:
        return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
      case YangPackage.NAMESPACE_STATEMENT__NAMESPACEUNKNOWNSTATEMENTS:
        return namespaceunknownstatements != null && !namespaceunknownstatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (uri: ");
    result.append(uri);
    result.append(')');
    return result.toString();
  }

} //NamespaceStatementImpl
