/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogFactory
 * @model kind="package"
 * @generated
 */
public interface SystemVerilogPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "systemVerilog";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ironglass.com/hdlforge/SystemVerilog";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "systemVerilog";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SystemVerilogPackage eINSTANCE = com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl.init();

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getModule()
   * @generated
   */
  int MODULE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__PORTS = 2;

  /**
   * The feature id for the '<em><b>Module items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__MODULE_ITEMS = 3;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.ParameterImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.PortImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getPort()
   * @generated
   */
  int PORT = 2;

  /**
   * The feature id for the '<em><b>Direction</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__DIRECTION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = 1;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_ITEMImpl <em>MODULE ITEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_ITEMImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_ITEM()
   * @generated
   */
  int MODULE_ITEM = 3;

  /**
   * The number of structural features of the '<em>MODULE ITEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.NON_PORT_MODULE_ITEMImpl <em>NON PORT MODULE ITEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.NON_PORT_MODULE_ITEMImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getNON_PORT_MODULE_ITEM()
   * @generated
   */
  int NON_PORT_MODULE_ITEM = 4;

  /**
   * The number of structural features of the '<em>NON PORT MODULE ITEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NON_PORT_MODULE_ITEM_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEMImpl <em>MODULE OR GENERATE ITEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEMImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_OR_GENERATE_ITEM()
   * @generated
   */
  int MODULE_OR_GENERATE_ITEM = 5;

  /**
   * The number of structural features of the '<em>MODULE OR GENERATE ITEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_OR_GENERATE_ITEM_FEATURE_COUNT = NON_PORT_MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_COMMON_ITEMImpl <em>MODULE COMMON ITEM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_COMMON_ITEMImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_COMMON_ITEM()
   * @generated
   */
  int MODULE_COMMON_ITEM = 6;

  /**
   * The number of structural features of the '<em>MODULE COMMON ITEM</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_COMMON_ITEM_FEATURE_COUNT = MODULE_OR_GENERATE_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.CONTINUOUS_ASSIGNImpl <em>CONTINUOUS ASSIGN</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.CONTINUOUS_ASSIGNImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getCONTINUOUS_ASSIGN()
   * @generated
   */
  int CONTINUOUS_ASSIGN = 7;

  /**
   * The number of structural features of the '<em>CONTINUOUS ASSIGN</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTINUOUS_ASSIGN_FEATURE_COUNT = MODULE_COMMON_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_ASSIGNMENTSImpl <em>LIST OF NET ASSIGNMENTS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_ASSIGNMENTSImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getLIST_OF_NET_ASSIGNMENTS()
   * @generated
   */
  int LIST_OF_NET_ASSIGNMENTS = 8;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OF_NET_ASSIGNMENTS__ASSIGNMENTS = CONTINUOUS_ASSIGN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LIST OF NET ASSIGNMENTS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OF_NET_ASSIGNMENTS_FEATURE_COUNT = CONTINUOUS_ASSIGN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEM_DECLARATIONImpl <em>MODULE OR GENERATE ITEM DECLARATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEM_DECLARATIONImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_OR_GENERATE_ITEM_DECLARATION()
   * @generated
   */
  int MODULE_OR_GENERATE_ITEM_DECLARATION = 9;

  /**
   * The number of structural features of the '<em>MODULE OR GENERATE ITEM DECLARATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_OR_GENERATE_ITEM_DECLARATION_FEATURE_COUNT = MODULE_COMMON_ITEM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.PACKAGE_OR_GENERATE_ITEM_DECLARATIONImpl <em>PACKAGE OR GENERATE ITEM DECLARATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.PACKAGE_OR_GENERATE_ITEM_DECLARATIONImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getPACKAGE_OR_GENERATE_ITEM_DECLARATION()
   * @generated
   */
  int PACKAGE_OR_GENERATE_ITEM_DECLARATION = 10;

  /**
   * The number of structural features of the '<em>PACKAGE OR GENERATE ITEM DECLARATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_OR_GENERATE_ITEM_DECLARATION_FEATURE_COUNT = MODULE_OR_GENERATE_ITEM_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.NET_DECLARATIONImpl <em>NET DECLARATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.NET_DECLARATIONImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getNET_DECLARATION()
   * @generated
   */
  int NET_DECLARATION = 11;

  /**
   * The number of structural features of the '<em>NET DECLARATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECLARATION_FEATURE_COUNT = PACKAGE_OR_GENERATE_ITEM_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_DECL_ASSIGNMENTSImpl <em>LIST OF NET DECL ASSIGNMENTS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_DECL_ASSIGNMENTSImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getLIST_OF_NET_DECL_ASSIGNMENTS()
   * @generated
   */
  int LIST_OF_NET_DECL_ASSIGNMENTS = 12;

  /**
   * The feature id for the '<em><b>Nets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OF_NET_DECL_ASSIGNMENTS__NETS = NET_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LIST OF NET DECL ASSIGNMENTS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OF_NET_DECL_ASSIGNMENTS_FEATURE_COUNT = NET_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.NET_DECL_ASSIGNMENTImpl <em>NET DECL ASSIGNMENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.NET_DECL_ASSIGNMENTImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getNET_DECL_ASSIGNMENT()
   * @generated
   */
  int NET_DECL_ASSIGNMENT = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECL_ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECL_ASSIGNMENT__DIMENSIONS = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECL_ASSIGNMENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>NET DECL ASSIGNMENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NET_DECL_ASSIGNMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.UNPACKED_DIMENSIONSImpl <em>UNPACKED DIMENSIONS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.UNPACKED_DIMENSIONSImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getUNPACKED_DIMENSIONS()
   * @generated
   */
  int UNPACKED_DIMENSIONS = 14;

  /**
   * The feature id for the '<em><b>Left bound</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_DIMENSIONS__LEFT_BOUND = 0;

  /**
   * The feature id for the '<em><b>Right bound</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_DIMENSIONS__RIGHT_BOUND = 1;

  /**
   * The number of structural features of the '<em>UNPACKED DIMENSIONS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNPACKED_DIMENSIONS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.DATA_DECLARATIONImpl <em>DATA DECLARATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.DATA_DECLARATIONImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getDATA_DECLARATION()
   * @generated
   */
  int DATA_DECLARATION = 15;

  /**
   * The number of structural features of the '<em>DATA DECLARATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_DECLARATION_FEATURE_COUNT = PACKAGE_OR_GENERATE_ITEM_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl <em>VARIABLE DECLARATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getVARIABLE_DECLARATION()
   * @generated
   */
  int VARIABLE_DECLARATION = 16;

  /**
   * The number of structural features of the '<em>VARIABLE DECLARATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = DATA_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_VARIABLE_DECL_ASSIGNMENTSImpl <em>LIST OF VARIABLE DECL ASSIGNMENTS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_VARIABLE_DECL_ASSIGNMENTSImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getLIST_OF_VARIABLE_DECL_ASSIGNMENTS()
   * @generated
   */
  int LIST_OF_VARIABLE_DECL_ASSIGNMENTS = 17;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VARIABLES = VARIABLE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>LIST OF VARIABLE DECL ASSIGNMENTS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_OF_VARIABLE_DECL_ASSIGNMENTS_FEATURE_COUNT = VARIABLE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECL_ASSIGNMENTImpl <em>VARIABLE DECL ASSIGNMENT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECL_ASSIGNMENTImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getVARIABLE_DECL_ASSIGNMENT()
   * @generated
   */
  int VARIABLE_DECL_ASSIGNMENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_ASSIGNMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Dimensions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_ASSIGNMENT__DIMENSIONS = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_ASSIGNMENT__VALUE = 2;

  /**
   * The number of structural features of the '<em>VARIABLE DECL ASSIGNMENT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_ASSIGNMENT_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.Module#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Module#getParameters()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.Module#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Module#getPorts()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.Module#getModule_items <em>Module items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Module items</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Module#getModule_items()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Module_items();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.Port#getDirection <em>Direction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Direction</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Port#getDirection()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Direction();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.Port#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Port#getName()
   * @see #getPort()
   * @generated
   */
  EAttribute getPort_Name();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_ITEM <em>MODULE ITEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MODULE ITEM</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_ITEM
   * @generated
   */
  EClass getMODULE_ITEM();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.NON_PORT_MODULE_ITEM <em>NON PORT MODULE ITEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NON PORT MODULE ITEM</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.NON_PORT_MODULE_ITEM
   * @generated
   */
  EClass getNON_PORT_MODULE_ITEM();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM <em>MODULE OR GENERATE ITEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MODULE OR GENERATE ITEM</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM
   * @generated
   */
  EClass getMODULE_OR_GENERATE_ITEM();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_COMMON_ITEM <em>MODULE COMMON ITEM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MODULE COMMON ITEM</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_COMMON_ITEM
   * @generated
   */
  EClass getMODULE_COMMON_ITEM();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.CONTINUOUS_ASSIGN <em>CONTINUOUS ASSIGN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CONTINUOUS ASSIGN</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.CONTINUOUS_ASSIGN
   * @generated
   */
  EClass getCONTINUOUS_ASSIGN();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS <em>LIST OF NET ASSIGNMENTS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LIST OF NET ASSIGNMENTS</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS
   * @generated
   */
  EClass getLIST_OF_NET_ASSIGNMENTS();

  /**
   * Returns the meta object for the attribute list '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Assignments</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS#getAssignments()
   * @see #getLIST_OF_NET_ASSIGNMENTS()
   * @generated
   */
  EAttribute getLIST_OF_NET_ASSIGNMENTS_Assignments();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM_DECLARATION <em>MODULE OR GENERATE ITEM DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>MODULE OR GENERATE ITEM DECLARATION</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM_DECLARATION
   * @generated
   */
  EClass getMODULE_OR_GENERATE_ITEM_DECLARATION();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.PACKAGE_OR_GENERATE_ITEM_DECLARATION <em>PACKAGE OR GENERATE ITEM DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PACKAGE OR GENERATE ITEM DECLARATION</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.PACKAGE_OR_GENERATE_ITEM_DECLARATION
   * @generated
   */
  EClass getPACKAGE_OR_GENERATE_ITEM_DECLARATION();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.NET_DECLARATION <em>NET DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NET DECLARATION</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECLARATION
   * @generated
   */
  EClass getNET_DECLARATION();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS <em>LIST OF NET DECL ASSIGNMENTS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LIST OF NET DECL ASSIGNMENTS</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS
   * @generated
   */
  EClass getLIST_OF_NET_DECL_ASSIGNMENTS();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS#getNets <em>Nets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Nets</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS#getNets()
   * @see #getLIST_OF_NET_DECL_ASSIGNMENTS()
   * @generated
   */
  EReference getLIST_OF_NET_DECL_ASSIGNMENTS_Nets();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT <em>NET DECL ASSIGNMENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>NET DECL ASSIGNMENT</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT
   * @generated
   */
  EClass getNET_DECL_ASSIGNMENT();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT#getName()
   * @see #getNET_DECL_ASSIGNMENT()
   * @generated
   */
  EAttribute getNET_DECL_ASSIGNMENT_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT#getDimensions()
   * @see #getNET_DECL_ASSIGNMENT()
   * @generated
   */
  EReference getNET_DECL_ASSIGNMENT_Dimensions();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT#getValue()
   * @see #getNET_DECL_ASSIGNMENT()
   * @generated
   */
  EAttribute getNET_DECL_ASSIGNMENT_Value();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS <em>UNPACKED DIMENSIONS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UNPACKED DIMENSIONS</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS
   * @generated
   */
  EClass getUNPACKED_DIMENSIONS();

  /**
   * Returns the meta object for the attribute list '{@link com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS#getLeft_bound <em>Left bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Left bound</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS#getLeft_bound()
   * @see #getUNPACKED_DIMENSIONS()
   * @generated
   */
  EAttribute getUNPACKED_DIMENSIONS_Left_bound();

  /**
   * Returns the meta object for the attribute list '{@link com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS#getRight_bound <em>Right bound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Right bound</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS#getRight_bound()
   * @see #getUNPACKED_DIMENSIONS()
   * @generated
   */
  EAttribute getUNPACKED_DIMENSIONS_Right_bound();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.DATA_DECLARATION <em>DATA DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DATA DECLARATION</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.DATA_DECLARATION
   * @generated
   */
  EClass getDATA_DECLARATION();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION <em>VARIABLE DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VARIABLE DECLARATION</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION
   * @generated
   */
  EClass getVARIABLE_DECLARATION();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS <em>LIST OF VARIABLE DECL ASSIGNMENTS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LIST OF VARIABLE DECL ASSIGNMENTS</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS
   * @generated
   */
  EClass getLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS#getVariables()
   * @see #getLIST_OF_VARIABLE_DECL_ASSIGNMENTS()
   * @generated
   */
  EReference getLIST_OF_VARIABLE_DECL_ASSIGNMENTS_Variables();

  /**
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT <em>VARIABLE DECL ASSIGNMENT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VARIABLE DECL ASSIGNMENT</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT
   * @generated
   */
  EClass getVARIABLE_DECL_ASSIGNMENT();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT#getName()
   * @see #getVARIABLE_DECL_ASSIGNMENT()
   * @generated
   */
  EAttribute getVARIABLE_DECL_ASSIGNMENT_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT#getDimensions <em>Dimensions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dimensions</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT#getDimensions()
   * @see #getVARIABLE_DECL_ASSIGNMENT()
   * @generated
   */
  EReference getVARIABLE_DECL_ASSIGNMENT_Dimensions();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT#getValue()
   * @see #getVARIABLE_DECL_ASSIGNMENT()
   * @generated
   */
  EAttribute getVARIABLE_DECL_ASSIGNMENT_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SystemVerilogFactory getSystemVerilogFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.ModuleImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PARAMETERS = eINSTANCE.getModule_Parameters();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__PORTS = eINSTANCE.getModule_Ports();

    /**
     * The meta object literal for the '<em><b>Module items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__MODULE_ITEMS = eINSTANCE.getModule_Module_items();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.ParameterImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.PortImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__DIRECTION = eINSTANCE.getPort_Direction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PORT__NAME = eINSTANCE.getPort_Name();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_ITEMImpl <em>MODULE ITEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_ITEMImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_ITEM()
     * @generated
     */
    EClass MODULE_ITEM = eINSTANCE.getMODULE_ITEM();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.NON_PORT_MODULE_ITEMImpl <em>NON PORT MODULE ITEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.NON_PORT_MODULE_ITEMImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getNON_PORT_MODULE_ITEM()
     * @generated
     */
    EClass NON_PORT_MODULE_ITEM = eINSTANCE.getNON_PORT_MODULE_ITEM();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEMImpl <em>MODULE OR GENERATE ITEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEMImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_OR_GENERATE_ITEM()
     * @generated
     */
    EClass MODULE_OR_GENERATE_ITEM = eINSTANCE.getMODULE_OR_GENERATE_ITEM();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_COMMON_ITEMImpl <em>MODULE COMMON ITEM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_COMMON_ITEMImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_COMMON_ITEM()
     * @generated
     */
    EClass MODULE_COMMON_ITEM = eINSTANCE.getMODULE_COMMON_ITEM();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.CONTINUOUS_ASSIGNImpl <em>CONTINUOUS ASSIGN</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.CONTINUOUS_ASSIGNImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getCONTINUOUS_ASSIGN()
     * @generated
     */
    EClass CONTINUOUS_ASSIGN = eINSTANCE.getCONTINUOUS_ASSIGN();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_ASSIGNMENTSImpl <em>LIST OF NET ASSIGNMENTS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_ASSIGNMENTSImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getLIST_OF_NET_ASSIGNMENTS()
     * @generated
     */
    EClass LIST_OF_NET_ASSIGNMENTS = eINSTANCE.getLIST_OF_NET_ASSIGNMENTS();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST_OF_NET_ASSIGNMENTS__ASSIGNMENTS = eINSTANCE.getLIST_OF_NET_ASSIGNMENTS_Assignments();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEM_DECLARATIONImpl <em>MODULE OR GENERATE ITEM DECLARATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.MODULE_OR_GENERATE_ITEM_DECLARATIONImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getMODULE_OR_GENERATE_ITEM_DECLARATION()
     * @generated
     */
    EClass MODULE_OR_GENERATE_ITEM_DECLARATION = eINSTANCE.getMODULE_OR_GENERATE_ITEM_DECLARATION();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.PACKAGE_OR_GENERATE_ITEM_DECLARATIONImpl <em>PACKAGE OR GENERATE ITEM DECLARATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.PACKAGE_OR_GENERATE_ITEM_DECLARATIONImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getPACKAGE_OR_GENERATE_ITEM_DECLARATION()
     * @generated
     */
    EClass PACKAGE_OR_GENERATE_ITEM_DECLARATION = eINSTANCE.getPACKAGE_OR_GENERATE_ITEM_DECLARATION();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.NET_DECLARATIONImpl <em>NET DECLARATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.NET_DECLARATIONImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getNET_DECLARATION()
     * @generated
     */
    EClass NET_DECLARATION = eINSTANCE.getNET_DECLARATION();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_DECL_ASSIGNMENTSImpl <em>LIST OF NET DECL ASSIGNMENTS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_NET_DECL_ASSIGNMENTSImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getLIST_OF_NET_DECL_ASSIGNMENTS()
     * @generated
     */
    EClass LIST_OF_NET_DECL_ASSIGNMENTS = eINSTANCE.getLIST_OF_NET_DECL_ASSIGNMENTS();

    /**
     * The meta object literal for the '<em><b>Nets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_OF_NET_DECL_ASSIGNMENTS__NETS = eINSTANCE.getLIST_OF_NET_DECL_ASSIGNMENTS_Nets();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.NET_DECL_ASSIGNMENTImpl <em>NET DECL ASSIGNMENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.NET_DECL_ASSIGNMENTImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getNET_DECL_ASSIGNMENT()
     * @generated
     */
    EClass NET_DECL_ASSIGNMENT = eINSTANCE.getNET_DECL_ASSIGNMENT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_DECL_ASSIGNMENT__NAME = eINSTANCE.getNET_DECL_ASSIGNMENT_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NET_DECL_ASSIGNMENT__DIMENSIONS = eINSTANCE.getNET_DECL_ASSIGNMENT_Dimensions();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NET_DECL_ASSIGNMENT__VALUE = eINSTANCE.getNET_DECL_ASSIGNMENT_Value();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.UNPACKED_DIMENSIONSImpl <em>UNPACKED DIMENSIONS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.UNPACKED_DIMENSIONSImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getUNPACKED_DIMENSIONS()
     * @generated
     */
    EClass UNPACKED_DIMENSIONS = eINSTANCE.getUNPACKED_DIMENSIONS();

    /**
     * The meta object literal for the '<em><b>Left bound</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNPACKED_DIMENSIONS__LEFT_BOUND = eINSTANCE.getUNPACKED_DIMENSIONS_Left_bound();

    /**
     * The meta object literal for the '<em><b>Right bound</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNPACKED_DIMENSIONS__RIGHT_BOUND = eINSTANCE.getUNPACKED_DIMENSIONS_Right_bound();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.DATA_DECLARATIONImpl <em>DATA DECLARATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.DATA_DECLARATIONImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getDATA_DECLARATION()
     * @generated
     */
    EClass DATA_DECLARATION = eINSTANCE.getDATA_DECLARATION();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl <em>VARIABLE DECLARATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getVARIABLE_DECLARATION()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVARIABLE_DECLARATION();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_VARIABLE_DECL_ASSIGNMENTSImpl <em>LIST OF VARIABLE DECL ASSIGNMENTS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.LIST_OF_VARIABLE_DECL_ASSIGNMENTSImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getLIST_OF_VARIABLE_DECL_ASSIGNMENTS()
     * @generated
     */
    EClass LIST_OF_VARIABLE_DECL_ASSIGNMENTS = eINSTANCE.getLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VARIABLES = eINSTANCE.getLIST_OF_VARIABLE_DECL_ASSIGNMENTS_Variables();

    /**
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECL_ASSIGNMENTImpl <em>VARIABLE DECL ASSIGNMENT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECL_ASSIGNMENTImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getVARIABLE_DECL_ASSIGNMENT()
     * @generated
     */
    EClass VARIABLE_DECL_ASSIGNMENT = eINSTANCE.getVARIABLE_DECL_ASSIGNMENT();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL_ASSIGNMENT__NAME = eINSTANCE.getVARIABLE_DECL_ASSIGNMENT_Name();

    /**
     * The meta object literal for the '<em><b>Dimensions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL_ASSIGNMENT__DIMENSIONS = eINSTANCE.getVARIABLE_DECL_ASSIGNMENT_Dimensions();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL_ASSIGNMENT__VALUE = eINSTANCE.getVARIABLE_DECL_ASSIGNMENT_Value();

  }

} //SystemVerilogPackage
