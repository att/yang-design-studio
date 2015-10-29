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

import yang.manager.yang.BuiltInType;
import yang.manager.yang.TypeStatement;
import yang.manager.yang.TypeSubStatement;
import yang.manager.yang.TypedefStatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.TypeStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link yang.manager.yang.impl.TypeStatementImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link yang.manager.yang.impl.TypeStatementImpl#getImporttype <em>Importtype</em>}</li>
 *   <li>{@link yang.manager.yang.impl.TypeStatementImpl#getTypesubstatements <em>Typesubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeStatementImpl extends LeafSubstatementImpl implements TypeStatement
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected BuiltInType type;

  /**
   * The default value of the '{@link #getPre() <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected static final String PRE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPre() <em>Pre</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPre()
   * @generated
   * @ordered
   */
  protected String pre = PRE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImporttype() <em>Importtype</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImporttype()
   * @generated
   * @ordered
   */
  protected TypedefStatement importtype;

  /**
   * The cached value of the '{@link #getTypesubstatements() <em>Typesubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypesubstatements()
   * @generated
   * @ordered
   */
  protected EList<TypeSubStatement> typesubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeStatementImpl()
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
    return YangPackage.eINSTANCE.getTypeStatement();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuiltInType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(BuiltInType newType, NotificationChain msgs)
  {
    BuiltInType oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YangPackage.TYPE_STATEMENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(BuiltInType newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YangPackage.TYPE_STATEMENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YangPackage.TYPE_STATEMENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.TYPE_STATEMENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPre()
  {
    return pre;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPre(String newPre)
  {
    String oldPre = pre;
    pre = newPre;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.TYPE_STATEMENT__PRE, oldPre, pre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefStatement getImporttype()
  {
    if (importtype != null && importtype.eIsProxy())
    {
      InternalEObject oldImporttype = (InternalEObject)importtype;
      importtype = (TypedefStatement)eResolveProxy(oldImporttype);
      if (importtype != oldImporttype)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, YangPackage.TYPE_STATEMENT__IMPORTTYPE, oldImporttype, importtype));
      }
    }
    return importtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefStatement basicGetImporttype()
  {
    return importtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImporttype(TypedefStatement newImporttype)
  {
    TypedefStatement oldImporttype = importtype;
    importtype = newImporttype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.TYPE_STATEMENT__IMPORTTYPE, oldImporttype, importtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeSubStatement> getTypesubstatements()
  {
    if (typesubstatements == null)
    {
      typesubstatements = new EObjectContainmentEList<TypeSubStatement>(TypeSubStatement.class, this, YangPackage.TYPE_STATEMENT__TYPESUBSTATEMENTS);
    }
    return typesubstatements;
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
      case YangPackage.TYPE_STATEMENT__TYPE:
        return basicSetType(null, msgs);
      case YangPackage.TYPE_STATEMENT__TYPESUBSTATEMENTS:
        return ((InternalEList<?>)getTypesubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.TYPE_STATEMENT__TYPE:
        return getType();
      case YangPackage.TYPE_STATEMENT__PRE:
        return getPre();
      case YangPackage.TYPE_STATEMENT__IMPORTTYPE:
        if (resolve) return getImporttype();
        return basicGetImporttype();
      case YangPackage.TYPE_STATEMENT__TYPESUBSTATEMENTS:
        return getTypesubstatements();
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
      case YangPackage.TYPE_STATEMENT__TYPE:
        setType((BuiltInType)newValue);
        return;
      case YangPackage.TYPE_STATEMENT__PRE:
        setPre((String)newValue);
        return;
      case YangPackage.TYPE_STATEMENT__IMPORTTYPE:
        setImporttype((TypedefStatement)newValue);
        return;
      case YangPackage.TYPE_STATEMENT__TYPESUBSTATEMENTS:
        getTypesubstatements().clear();
        getTypesubstatements().addAll((Collection<? extends TypeSubStatement>)newValue);
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
      case YangPackage.TYPE_STATEMENT__TYPE:
        setType((BuiltInType)null);
        return;
      case YangPackage.TYPE_STATEMENT__PRE:
        setPre(PRE_EDEFAULT);
        return;
      case YangPackage.TYPE_STATEMENT__IMPORTTYPE:
        setImporttype((TypedefStatement)null);
        return;
      case YangPackage.TYPE_STATEMENT__TYPESUBSTATEMENTS:
        getTypesubstatements().clear();
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
      case YangPackage.TYPE_STATEMENT__TYPE:
        return type != null;
      case YangPackage.TYPE_STATEMENT__PRE:
        return PRE_EDEFAULT == null ? pre != null : !PRE_EDEFAULT.equals(pre);
      case YangPackage.TYPE_STATEMENT__IMPORTTYPE:
        return importtype != null;
      case YangPackage.TYPE_STATEMENT__TYPESUBSTATEMENTS:
        return typesubstatements != null && !typesubstatements.isEmpty();
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
    result.append(" (pre: ");
    result.append(pre);
    result.append(')');
    return result.toString();
  }

} //TypeStatementImpl
