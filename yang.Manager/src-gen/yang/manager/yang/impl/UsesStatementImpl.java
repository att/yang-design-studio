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

import yang.manager.yang.GroupingStatement;
import yang.manager.yang.UsesStatement;
import yang.manager.yang.UsesSubstatement;
import yang.manager.yang.YangPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Uses Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link yang.manager.yang.impl.UsesStatementImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link yang.manager.yang.impl.UsesStatementImpl#getArg <em>Arg</em>}</li>
 *   <li>{@link yang.manager.yang.impl.UsesStatementImpl#getUsessubstatements <em>Usessubstatements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsesStatementImpl extends DatadefStatementImpl implements UsesStatement
{
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
   * The cached value of the '{@link #getArg() <em>Arg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArg()
   * @generated
   * @ordered
   */
  protected GroupingStatement arg;

  /**
   * The cached value of the '{@link #getUsessubstatements() <em>Usessubstatements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsessubstatements()
   * @generated
   * @ordered
   */
  protected EList<UsesSubstatement> usessubstatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsesStatementImpl()
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
    return YangPackage.eINSTANCE.getUsesStatement();
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
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.USES_STATEMENT__PRE, oldPre, pre));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupingStatement getArg()
  {
    if (arg != null && arg.eIsProxy())
    {
      InternalEObject oldArg = (InternalEObject)arg;
      arg = (GroupingStatement)eResolveProxy(oldArg);
      if (arg != oldArg)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, YangPackage.USES_STATEMENT__ARG, oldArg, arg));
      }
    }
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GroupingStatement basicGetArg()
  {
    return arg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArg(GroupingStatement newArg)
  {
    GroupingStatement oldArg = arg;
    arg = newArg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, YangPackage.USES_STATEMENT__ARG, oldArg, arg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UsesSubstatement> getUsessubstatements()
  {
    if (usessubstatements == null)
    {
      usessubstatements = new EObjectContainmentEList<UsesSubstatement>(UsesSubstatement.class, this, YangPackage.USES_STATEMENT__USESSUBSTATEMENTS);
    }
    return usessubstatements;
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
      case YangPackage.USES_STATEMENT__USESSUBSTATEMENTS:
        return ((InternalEList<?>)getUsessubstatements()).basicRemove(otherEnd, msgs);
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
      case YangPackage.USES_STATEMENT__PRE:
        return getPre();
      case YangPackage.USES_STATEMENT__ARG:
        if (resolve) return getArg();
        return basicGetArg();
      case YangPackage.USES_STATEMENT__USESSUBSTATEMENTS:
        return getUsessubstatements();
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
      case YangPackage.USES_STATEMENT__PRE:
        setPre((String)newValue);
        return;
      case YangPackage.USES_STATEMENT__ARG:
        setArg((GroupingStatement)newValue);
        return;
      case YangPackage.USES_STATEMENT__USESSUBSTATEMENTS:
        getUsessubstatements().clear();
        getUsessubstatements().addAll((Collection<? extends UsesSubstatement>)newValue);
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
      case YangPackage.USES_STATEMENT__PRE:
        setPre(PRE_EDEFAULT);
        return;
      case YangPackage.USES_STATEMENT__ARG:
        setArg((GroupingStatement)null);
        return;
      case YangPackage.USES_STATEMENT__USESSUBSTATEMENTS:
        getUsessubstatements().clear();
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
      case YangPackage.USES_STATEMENT__PRE:
        return PRE_EDEFAULT == null ? pre != null : !PRE_EDEFAULT.equals(pre);
      case YangPackage.USES_STATEMENT__ARG:
        return arg != null;
      case YangPackage.USES_STATEMENT__USESSUBSTATEMENTS:
        return usessubstatements != null && !usessubstatements.isEmpty();
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

} //UsesStatementImpl
