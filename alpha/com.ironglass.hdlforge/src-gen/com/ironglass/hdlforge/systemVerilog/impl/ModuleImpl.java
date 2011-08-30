/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog.impl;

import com.ironglass.hdlforge.systemVerilog.Module;
import com.ironglass.hdlforge.systemVerilog.Module_item;
import com.ironglass.hdlforge.systemVerilog.Parameter;
import com.ironglass.hdlforge.systemVerilog.Port;
import com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl#getModule_items <em>Module items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

  /**
   * The cached value of the '{@link #getModule_items() <em>Module items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModule_items()
   * @generated
   * @ordered
   */
  protected EList<Module_item> module_items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return SystemVerilogPackage.Literals.MODULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SystemVerilogPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, SystemVerilogPackage.MODULE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<Port>(Port.class, this, SystemVerilogPackage.MODULE__PORTS);
    }
    return ports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Module_item> getModule_items()
  {
    if (module_items == null)
    {
      module_items = new EObjectContainmentEList<Module_item>(Module_item.class, this, SystemVerilogPackage.MODULE__MODULE_ITEMS);
    }
    return module_items;
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
      case SystemVerilogPackage.MODULE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case SystemVerilogPackage.MODULE__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case SystemVerilogPackage.MODULE__MODULE_ITEMS:
        return ((InternalEList<?>)getModule_items()).basicRemove(otherEnd, msgs);
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
      case SystemVerilogPackage.MODULE__NAME:
        return getName();
      case SystemVerilogPackage.MODULE__PARAMETERS:
        return getParameters();
      case SystemVerilogPackage.MODULE__PORTS:
        return getPorts();
      case SystemVerilogPackage.MODULE__MODULE_ITEMS:
        return getModule_items();
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
      case SystemVerilogPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case SystemVerilogPackage.MODULE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case SystemVerilogPackage.MODULE__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case SystemVerilogPackage.MODULE__MODULE_ITEMS:
        getModule_items().clear();
        getModule_items().addAll((Collection<? extends Module_item>)newValue);
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
      case SystemVerilogPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case SystemVerilogPackage.MODULE__PARAMETERS:
        getParameters().clear();
        return;
      case SystemVerilogPackage.MODULE__PORTS:
        getPorts().clear();
        return;
      case SystemVerilogPackage.MODULE__MODULE_ITEMS:
        getModule_items().clear();
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
      case SystemVerilogPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case SystemVerilogPackage.MODULE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case SystemVerilogPackage.MODULE__PORTS:
        return ports != null && !ports.isEmpty();
      case SystemVerilogPackage.MODULE__MODULE_ITEMS:
        return module_items != null && !module_items.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ModuleImpl
