/**
 * <copyright>
 * </copyright>
 *

 */
package com.ironglass.hdlforge.systemVerilog.impl;

import com.ironglass.hdlforge.systemVerilog.Module;
import com.ironglass.hdlforge.systemVerilog.Parameter;
import com.ironglass.hdlforge.systemVerilog.Port;
import com.ironglass.hdlforge.systemVerilog.SystemVerilogFactory;
import com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SystemVerilogPackageImpl extends EPackageImpl implements SystemVerilogPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass portEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulE_ITEMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass noN_PORT_MODULE_ITEMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulE_OR_GENERATE_ITEMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulE_COMMON_ITEMEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass continuouS_ASSIGNEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lisT_OF_NET_ASSIGNMENTSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modulE_OR_GENERATE_ITEM_DECLARATIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packagE_OR_GENERATE_ITEM_DECLARATIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neT_DECLARATIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lisT_OF_NET_DECL_ASSIGNMENTSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neT_DECL_ASSIGNMENTEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unpackeD_DIMENSIONSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datA_DECLARATIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablE_DECLARATIONEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variablE_DECL_ASSIGNMENTEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SystemVerilogPackageImpl()
  {
    super(eNS_URI, SystemVerilogFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link SystemVerilogPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SystemVerilogPackage init()
  {
    if (isInited) return (SystemVerilogPackage)EPackage.Registry.INSTANCE.getEPackage(SystemVerilogPackage.eNS_URI);

    // Obtain or create and register package
    SystemVerilogPackageImpl theSystemVerilogPackage = (SystemVerilogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SystemVerilogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SystemVerilogPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theSystemVerilogPackage.createPackageContents();

    // Initialize created meta-data
    theSystemVerilogPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSystemVerilogPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SystemVerilogPackage.eNS_URI, theSystemVerilogPackage);
    return theSystemVerilogPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Parameters()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Ports()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Module_items()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_Name()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPort()
  {
    return portEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Direction()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPort_Name()
  {
    return (EAttribute)portEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMODULE_ITEM()
  {
    return modulE_ITEMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNON_PORT_MODULE_ITEM()
  {
    return noN_PORT_MODULE_ITEMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMODULE_OR_GENERATE_ITEM()
  {
    return modulE_OR_GENERATE_ITEMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMODULE_COMMON_ITEM()
  {
    return modulE_COMMON_ITEMEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCONTINUOUS_ASSIGN()
  {
    return continuouS_ASSIGNEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLIST_OF_NET_ASSIGNMENTS()
  {
    return lisT_OF_NET_ASSIGNMENTSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLIST_OF_NET_ASSIGNMENTS_Assignments()
  {
    return (EAttribute)lisT_OF_NET_ASSIGNMENTSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMODULE_OR_GENERATE_ITEM_DECLARATION()
  {
    return modulE_OR_GENERATE_ITEM_DECLARATIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPACKAGE_OR_GENERATE_ITEM_DECLARATION()
  {
    return packagE_OR_GENERATE_ITEM_DECLARATIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNET_DECLARATION()
  {
    return neT_DECLARATIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLIST_OF_NET_DECL_ASSIGNMENTS()
  {
    return lisT_OF_NET_DECL_ASSIGNMENTSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLIST_OF_NET_DECL_ASSIGNMENTS_Nets()
  {
    return (EReference)lisT_OF_NET_DECL_ASSIGNMENTSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNET_DECL_ASSIGNMENT()
  {
    return neT_DECL_ASSIGNMENTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNET_DECL_ASSIGNMENT_Name()
  {
    return (EAttribute)neT_DECL_ASSIGNMENTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNET_DECL_ASSIGNMENT_Dimensions()
  {
    return (EReference)neT_DECL_ASSIGNMENTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNET_DECL_ASSIGNMENT_Value()
  {
    return (EAttribute)neT_DECL_ASSIGNMENTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUNPACKED_DIMENSIONS()
  {
    return unpackeD_DIMENSIONSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUNPACKED_DIMENSIONS_Left_bound()
  {
    return (EAttribute)unpackeD_DIMENSIONSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUNPACKED_DIMENSIONS_Right_bound()
  {
    return (EAttribute)unpackeD_DIMENSIONSEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDATA_DECLARATION()
  {
    return datA_DECLARATIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVARIABLE_DECLARATION()
  {
    return variablE_DECLARATIONEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLIST_OF_VARIABLE_DECL_ASSIGNMENTS()
  {
    return lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLIST_OF_VARIABLE_DECL_ASSIGNMENTS_Variables()
  {
    return (EReference)lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVARIABLE_DECL_ASSIGNMENT()
  {
    return variablE_DECL_ASSIGNMENTEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVARIABLE_DECL_ASSIGNMENT_Name()
  {
    return (EAttribute)variablE_DECL_ASSIGNMENTEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVARIABLE_DECL_ASSIGNMENT_Dimensions()
  {
    return (EReference)variablE_DECL_ASSIGNMENTEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVARIABLE_DECL_ASSIGNMENT_Value()
  {
    return (EAttribute)variablE_DECL_ASSIGNMENTEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemVerilogFactory getSystemVerilogFactory()
  {
    return (SystemVerilogFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__PARAMETERS);
    createEReference(moduleEClass, MODULE__PORTS);
    createEReference(moduleEClass, MODULE__MODULE_ITEMS);

    parameterEClass = createEClass(PARAMETER);
    createEAttribute(parameterEClass, PARAMETER__NAME);

    portEClass = createEClass(PORT);
    createEAttribute(portEClass, PORT__DIRECTION);
    createEAttribute(portEClass, PORT__NAME);

    modulE_ITEMEClass = createEClass(MODULE_ITEM);

    noN_PORT_MODULE_ITEMEClass = createEClass(NON_PORT_MODULE_ITEM);

    modulE_OR_GENERATE_ITEMEClass = createEClass(MODULE_OR_GENERATE_ITEM);

    modulE_COMMON_ITEMEClass = createEClass(MODULE_COMMON_ITEM);

    continuouS_ASSIGNEClass = createEClass(CONTINUOUS_ASSIGN);

    lisT_OF_NET_ASSIGNMENTSEClass = createEClass(LIST_OF_NET_ASSIGNMENTS);
    createEAttribute(lisT_OF_NET_ASSIGNMENTSEClass, LIST_OF_NET_ASSIGNMENTS__ASSIGNMENTS);

    modulE_OR_GENERATE_ITEM_DECLARATIONEClass = createEClass(MODULE_OR_GENERATE_ITEM_DECLARATION);

    packagE_OR_GENERATE_ITEM_DECLARATIONEClass = createEClass(PACKAGE_OR_GENERATE_ITEM_DECLARATION);

    neT_DECLARATIONEClass = createEClass(NET_DECLARATION);

    lisT_OF_NET_DECL_ASSIGNMENTSEClass = createEClass(LIST_OF_NET_DECL_ASSIGNMENTS);
    createEReference(lisT_OF_NET_DECL_ASSIGNMENTSEClass, LIST_OF_NET_DECL_ASSIGNMENTS__NETS);

    neT_DECL_ASSIGNMENTEClass = createEClass(NET_DECL_ASSIGNMENT);
    createEAttribute(neT_DECL_ASSIGNMENTEClass, NET_DECL_ASSIGNMENT__NAME);
    createEReference(neT_DECL_ASSIGNMENTEClass, NET_DECL_ASSIGNMENT__DIMENSIONS);
    createEAttribute(neT_DECL_ASSIGNMENTEClass, NET_DECL_ASSIGNMENT__VALUE);

    unpackeD_DIMENSIONSEClass = createEClass(UNPACKED_DIMENSIONS);
    createEAttribute(unpackeD_DIMENSIONSEClass, UNPACKED_DIMENSIONS__LEFT_BOUND);
    createEAttribute(unpackeD_DIMENSIONSEClass, UNPACKED_DIMENSIONS__RIGHT_BOUND);

    datA_DECLARATIONEClass = createEClass(DATA_DECLARATION);

    variablE_DECLARATIONEClass = createEClass(VARIABLE_DECLARATION);

    lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass = createEClass(LIST_OF_VARIABLE_DECL_ASSIGNMENTS);
    createEReference(lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass, LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VARIABLES);

    variablE_DECL_ASSIGNMENTEClass = createEClass(VARIABLE_DECL_ASSIGNMENT);
    createEAttribute(variablE_DECL_ASSIGNMENTEClass, VARIABLE_DECL_ASSIGNMENT__NAME);
    createEReference(variablE_DECL_ASSIGNMENTEClass, VARIABLE_DECL_ASSIGNMENT__DIMENSIONS);
    createEAttribute(variablE_DECL_ASSIGNMENTEClass, VARIABLE_DECL_ASSIGNMENT__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    noN_PORT_MODULE_ITEMEClass.getESuperTypes().add(this.getMODULE_ITEM());
    modulE_OR_GENERATE_ITEMEClass.getESuperTypes().add(this.getNON_PORT_MODULE_ITEM());
    modulE_COMMON_ITEMEClass.getESuperTypes().add(this.getMODULE_OR_GENERATE_ITEM());
    continuouS_ASSIGNEClass.getESuperTypes().add(this.getMODULE_COMMON_ITEM());
    lisT_OF_NET_ASSIGNMENTSEClass.getESuperTypes().add(this.getCONTINUOUS_ASSIGN());
    modulE_OR_GENERATE_ITEM_DECLARATIONEClass.getESuperTypes().add(this.getMODULE_COMMON_ITEM());
    packagE_OR_GENERATE_ITEM_DECLARATIONEClass.getESuperTypes().add(this.getMODULE_OR_GENERATE_ITEM_DECLARATION());
    neT_DECLARATIONEClass.getESuperTypes().add(this.getPACKAGE_OR_GENERATE_ITEM_DECLARATION());
    lisT_OF_NET_DECL_ASSIGNMENTSEClass.getESuperTypes().add(this.getNET_DECLARATION());
    datA_DECLARATIONEClass.getESuperTypes().add(this.getPACKAGE_OR_GENERATE_ITEM_DECLARATION());
    variablE_DECLARATIONEClass.getESuperTypes().add(this.getDATA_DECLARATION());
    lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass.getESuperTypes().add(this.getVARIABLE_DECLARATION());

    // Initialize classes and features; add operations and parameters
    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Ports(), this.getPort(), null, "ports", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Module_items(), this.getMODULE_ITEM(), null, "module_items", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPort_Direction(), ecorePackage.getEString(), "direction", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPort_Name(), ecorePackage.getEString(), "name", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modulE_ITEMEClass, com.ironglass.hdlforge.systemVerilog.MODULE_ITEM.class, "MODULE_ITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(noN_PORT_MODULE_ITEMEClass, com.ironglass.hdlforge.systemVerilog.NON_PORT_MODULE_ITEM.class, "NON_PORT_MODULE_ITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modulE_OR_GENERATE_ITEMEClass, com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM.class, "MODULE_OR_GENERATE_ITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(modulE_COMMON_ITEMEClass, com.ironglass.hdlforge.systemVerilog.MODULE_COMMON_ITEM.class, "MODULE_COMMON_ITEM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(continuouS_ASSIGNEClass, com.ironglass.hdlforge.systemVerilog.CONTINUOUS_ASSIGN.class, "CONTINUOUS_ASSIGN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lisT_OF_NET_ASSIGNMENTSEClass, com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS.class, "LIST_OF_NET_ASSIGNMENTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLIST_OF_NET_ASSIGNMENTS_Assignments(), ecorePackage.getEString(), "assignments", null, 0, -1, com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modulE_OR_GENERATE_ITEM_DECLARATIONEClass, com.ironglass.hdlforge.systemVerilog.MODULE_OR_GENERATE_ITEM_DECLARATION.class, "MODULE_OR_GENERATE_ITEM_DECLARATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(packagE_OR_GENERATE_ITEM_DECLARATIONEClass, com.ironglass.hdlforge.systemVerilog.PACKAGE_OR_GENERATE_ITEM_DECLARATION.class, "PACKAGE_OR_GENERATE_ITEM_DECLARATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(neT_DECLARATIONEClass, com.ironglass.hdlforge.systemVerilog.NET_DECLARATION.class, "NET_DECLARATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lisT_OF_NET_DECL_ASSIGNMENTSEClass, com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS.class, "LIST_OF_NET_DECL_ASSIGNMENTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLIST_OF_NET_DECL_ASSIGNMENTS_Nets(), this.getNET_DECL_ASSIGNMENT(), null, "nets", null, 0, -1, com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neT_DECL_ASSIGNMENTEClass, com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT.class, "NET_DECL_ASSIGNMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNET_DECL_ASSIGNMENT_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNET_DECL_ASSIGNMENT_Dimensions(), this.getUNPACKED_DIMENSIONS(), null, "dimensions", null, 0, -1, com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNET_DECL_ASSIGNMENT_Value(), ecorePackage.getEString(), "value", null, 0, 1, com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unpackeD_DIMENSIONSEClass, com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS.class, "UNPACKED_DIMENSIONS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUNPACKED_DIMENSIONS_Left_bound(), ecorePackage.getEInt(), "left_bound", null, 0, -1, com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUNPACKED_DIMENSIONS_Right_bound(), ecorePackage.getEInt(), "right_bound", null, 0, -1, com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(datA_DECLARATIONEClass, com.ironglass.hdlforge.systemVerilog.DATA_DECLARATION.class, "DATA_DECLARATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variablE_DECLARATIONEClass, com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION.class, "VARIABLE_DECLARATION", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(lisT_OF_VARIABLE_DECL_ASSIGNMENTSEClass, com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS.class, "LIST_OF_VARIABLE_DECL_ASSIGNMENTS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLIST_OF_VARIABLE_DECL_ASSIGNMENTS_Variables(), this.getVARIABLE_DECL_ASSIGNMENT(), null, "variables", null, 0, -1, com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variablE_DECL_ASSIGNMENTEClass, com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT.class, "VARIABLE_DECL_ASSIGNMENT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVARIABLE_DECL_ASSIGNMENT_Name(), ecorePackage.getEString(), "name", null, 0, 1, com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVARIABLE_DECL_ASSIGNMENT_Dimensions(), this.getUNPACKED_DIMENSIONS(), null, "dimensions", null, 0, -1, com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVARIABLE_DECL_ASSIGNMENT_Value(), ecorePackage.getEString(), "value", null, 0, 1, com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SystemVerilogPackageImpl
