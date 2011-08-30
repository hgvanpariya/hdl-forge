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
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.Module_itemImpl <em>Module item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.Module_itemImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getModule_item()
   * @generated
   */
  int MODULE_ITEM = 1;

  /**
   * The number of structural features of the '<em>Module item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.ParameterImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 2;

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
  int PORT = 3;

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
   * The meta object id for the '{@link com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl <em>VARIABLE DECLARATION</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl
   * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getVARIABLE_DECLARATION()
   * @generated
   */
  int VARIABLE_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = MODULE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>VARIABLE DECLARATION</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = MODULE_ITEM_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.Module_item <em>Module item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module item</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.Module_item
   * @generated
   */
  EClass getModule_item();

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
   * Returns the meta object for class '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION <em>VARIABLE DECLARATION</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VARIABLE DECLARATION</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION
   * @generated
   */
  EClass getVARIABLE_DECLARATION();

  /**
   * Returns the meta object for the attribute '{@link com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION#getName()
   * @see #getVARIABLE_DECLARATION()
   * @generated
   */
  EAttribute getVARIABLE_DECLARATION_Name();

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
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.Module_itemImpl <em>Module item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.Module_itemImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getModule_item()
     * @generated
     */
    EClass MODULE_ITEM = eINSTANCE.getModule_item();

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
     * The meta object literal for the '{@link com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl <em>VARIABLE DECLARATION</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.ironglass.hdlforge.systemVerilog.impl.VARIABLE_DECLARATIONImpl
     * @see com.ironglass.hdlforge.systemVerilog.impl.SystemVerilogPackageImpl#getVARIABLE_DECLARATION()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVARIABLE_DECLARATION();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVARIABLE_DECLARATION_Name();

  }

} //SystemVerilogPackage
