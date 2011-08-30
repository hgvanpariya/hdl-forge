/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog.impl;

import com.ironglass.hdlforge.systemVerilog.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemVerilogFactoryImpl extends EFactoryImpl implements SystemVerilogFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SystemVerilogFactory init()
  {
    try
    {
      SystemVerilogFactory theSystemVerilogFactory = (SystemVerilogFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ironglass.com/hdlforge/SystemVerilog"); 
      if (theSystemVerilogFactory != null)
      {
        return theSystemVerilogFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new SystemVerilogFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemVerilogFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case SystemVerilogPackage.MODULE: return createModule();
      case SystemVerilogPackage.MODULE_ITEM: return createModule_item();
      case SystemVerilogPackage.PARAMETER: return createParameter();
      case SystemVerilogPackage.PORT: return createPort();
      case SystemVerilogPackage.VARIABLE_DECLARATION: return createVARIABLE_DECLARATION();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module_item createModule_item()
  {
    Module_itemImpl module_item = new Module_itemImpl();
    return module_item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARIABLE_DECLARATION createVARIABLE_DECLARATION()
  {
    VARIABLE_DECLARATIONImpl variablE_DECLARATION = new VARIABLE_DECLARATIONImpl();
    return variablE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemVerilogPackage getSystemVerilogPackage()
  {
    return (SystemVerilogPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static SystemVerilogPackage getPackage()
  {
    return SystemVerilogPackage.eINSTANCE;
  }

} //SystemVerilogFactoryImpl
