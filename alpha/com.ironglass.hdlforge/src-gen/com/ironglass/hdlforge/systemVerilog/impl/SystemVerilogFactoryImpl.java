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
      case SystemVerilogPackage.PARAMETER: return createParameter();
      case SystemVerilogPackage.PORT: return createPort();
      case SystemVerilogPackage.MODULE_ITEM: return createMODULE_ITEM();
      case SystemVerilogPackage.NON_PORT_MODULE_ITEM: return createNON_PORT_MODULE_ITEM();
      case SystemVerilogPackage.MODULE_OR_GENERATE_ITEM: return createMODULE_OR_GENERATE_ITEM();
      case SystemVerilogPackage.MODULE_COMMON_ITEM: return createMODULE_COMMON_ITEM();
      case SystemVerilogPackage.CONTINUOUS_ASSIGN: return createCONTINUOUS_ASSIGN();
      case SystemVerilogPackage.LIST_OF_NET_ASSIGNMENTS: return createLIST_OF_NET_ASSIGNMENTS();
      case SystemVerilogPackage.MODULE_OR_GENERATE_ITEM_DECLARATION: return createMODULE_OR_GENERATE_ITEM_DECLARATION();
      case SystemVerilogPackage.PACKAGE_OR_GENERATE_ITEM_DECLARATION: return createPACKAGE_OR_GENERATE_ITEM_DECLARATION();
      case SystemVerilogPackage.NET_DECLARATION: return createNET_DECLARATION();
      case SystemVerilogPackage.LIST_OF_NET_DECL_ASSIGNMENTS: return createLIST_OF_NET_DECL_ASSIGNMENTS();
      case SystemVerilogPackage.NET_DECL_ASSIGNMENT: return createNET_DECL_ASSIGNMENT();
      case SystemVerilogPackage.UNPACKED_DIMENSIONS: return createUNPACKED_DIMENSIONS();
      case SystemVerilogPackage.DATA_DECLARATION: return createDATA_DECLARATION();
      case SystemVerilogPackage.VARIABLE_DECLARATION: return createVARIABLE_DECLARATION();
      case SystemVerilogPackage.LIST_OF_VARIABLE_DECL_ASSIGNMENTS: return createLIST_OF_VARIABLE_DECL_ASSIGNMENTS();
      case SystemVerilogPackage.VARIABLE_DECL_ASSIGNMENT: return createVARIABLE_DECL_ASSIGNMENT();
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
  public MODULE_ITEM createMODULE_ITEM()
  {
    MODULE_ITEMImpl modulE_ITEM = new MODULE_ITEMImpl();
    return modulE_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NON_PORT_MODULE_ITEM createNON_PORT_MODULE_ITEM()
  {
    NON_PORT_MODULE_ITEMImpl noN_PORT_MODULE_ITEM = new NON_PORT_MODULE_ITEMImpl();
    return noN_PORT_MODULE_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODULE_OR_GENERATE_ITEM createMODULE_OR_GENERATE_ITEM()
  {
    MODULE_OR_GENERATE_ITEMImpl modulE_OR_GENERATE_ITEM = new MODULE_OR_GENERATE_ITEMImpl();
    return modulE_OR_GENERATE_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODULE_COMMON_ITEM createMODULE_COMMON_ITEM()
  {
    MODULE_COMMON_ITEMImpl modulE_COMMON_ITEM = new MODULE_COMMON_ITEMImpl();
    return modulE_COMMON_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CONTINUOUS_ASSIGN createCONTINUOUS_ASSIGN()
  {
    CONTINUOUS_ASSIGNImpl continuouS_ASSIGN = new CONTINUOUS_ASSIGNImpl();
    return continuouS_ASSIGN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LIST_OF_NET_ASSIGNMENTS createLIST_OF_NET_ASSIGNMENTS()
  {
    LIST_OF_NET_ASSIGNMENTSImpl lisT_OF_NET_ASSIGNMENTS = new LIST_OF_NET_ASSIGNMENTSImpl();
    return lisT_OF_NET_ASSIGNMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MODULE_OR_GENERATE_ITEM_DECLARATION createMODULE_OR_GENERATE_ITEM_DECLARATION()
  {
    MODULE_OR_GENERATE_ITEM_DECLARATIONImpl modulE_OR_GENERATE_ITEM_DECLARATION = new MODULE_OR_GENERATE_ITEM_DECLARATIONImpl();
    return modulE_OR_GENERATE_ITEM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PACKAGE_OR_GENERATE_ITEM_DECLARATION createPACKAGE_OR_GENERATE_ITEM_DECLARATION()
  {
    PACKAGE_OR_GENERATE_ITEM_DECLARATIONImpl packagE_OR_GENERATE_ITEM_DECLARATION = new PACKAGE_OR_GENERATE_ITEM_DECLARATIONImpl();
    return packagE_OR_GENERATE_ITEM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NET_DECLARATION createNET_DECLARATION()
  {
    NET_DECLARATIONImpl neT_DECLARATION = new NET_DECLARATIONImpl();
    return neT_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LIST_OF_NET_DECL_ASSIGNMENTS createLIST_OF_NET_DECL_ASSIGNMENTS()
  {
    LIST_OF_NET_DECL_ASSIGNMENTSImpl lisT_OF_NET_DECL_ASSIGNMENTS = new LIST_OF_NET_DECL_ASSIGNMENTSImpl();
    return lisT_OF_NET_DECL_ASSIGNMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NET_DECL_ASSIGNMENT createNET_DECL_ASSIGNMENT()
  {
    NET_DECL_ASSIGNMENTImpl neT_DECL_ASSIGNMENT = new NET_DECL_ASSIGNMENTImpl();
    return neT_DECL_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UNPACKED_DIMENSIONS createUNPACKED_DIMENSIONS()
  {
    UNPACKED_DIMENSIONSImpl unpackeD_DIMENSIONS = new UNPACKED_DIMENSIONSImpl();
    return unpackeD_DIMENSIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DATA_DECLARATION createDATA_DECLARATION()
  {
    DATA_DECLARATIONImpl datA_DECLARATION = new DATA_DECLARATIONImpl();
    return datA_DECLARATION;
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
  public LIST_OF_VARIABLE_DECL_ASSIGNMENTS createLIST_OF_VARIABLE_DECL_ASSIGNMENTS()
  {
    LIST_OF_VARIABLE_DECL_ASSIGNMENTSImpl lisT_OF_VARIABLE_DECL_ASSIGNMENTS = new LIST_OF_VARIABLE_DECL_ASSIGNMENTSImpl();
    return lisT_OF_VARIABLE_DECL_ASSIGNMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VARIABLE_DECL_ASSIGNMENT createVARIABLE_DECL_ASSIGNMENT()
  {
    VARIABLE_DECL_ASSIGNMENTImpl variablE_DECL_ASSIGNMENT = new VARIABLE_DECL_ASSIGNMENTImpl();
    return variablE_DECL_ASSIGNMENT;
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
