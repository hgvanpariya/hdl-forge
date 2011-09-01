package com.ironglass.hdlforge.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;
import com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_ASSIGNMENTS;
import com.ironglass.hdlforge.systemVerilog.LIST_OF_NET_DECL_ASSIGNMENTS;
import com.ironglass.hdlforge.systemVerilog.LIST_OF_VARIABLE_DECL_ASSIGNMENTS;
import com.ironglass.hdlforge.systemVerilog.Module;
import com.ironglass.hdlforge.systemVerilog.NET_DECL_ASSIGNMENT;
import com.ironglass.hdlforge.systemVerilog.Parameter;
import com.ironglass.hdlforge.systemVerilog.Port;
import com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage;
import com.ironglass.hdlforge.systemVerilog.UNPACKED_DIMENSIONS;
import com.ironglass.hdlforge.systemVerilog.VARIABLE_DECL_ASSIGNMENT;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractSystemVerilogSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected SystemVerilogGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SystemVerilogPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SystemVerilogPackage.LIST_OF_NET_ASSIGNMENTS:
				if(context == grammarAccess.getMODULE_ITEMRule() ||
				   context == grammarAccess.getNON_PORT_MODULE_ITEMRule() ||
				   context == grammarAccess.getMODULE_OR_GENERATE_ITEMRule() ||
				   context == grammarAccess.getMODULE_COMMON_ITEMRule() ||
				   context == grammarAccess.getCONTINUOUS_ASSIGNRule() ||
				   context == grammarAccess.getLIST_OF_NET_ASSIGNMENTSRule()) {
					sequence_LIST_OF_NET_ASSIGNMENTS_LIST_OF_NET_ASSIGNMENTS(context, (LIST_OF_NET_ASSIGNMENTS) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.LIST_OF_NET_DECL_ASSIGNMENTS:
				if(context == grammarAccess.getMODULE_ITEMRule() ||
				   context == grammarAccess.getNON_PORT_MODULE_ITEMRule() ||
				   context == grammarAccess.getMODULE_OR_GENERATE_ITEMRule() ||
				   context == grammarAccess.getMODULE_COMMON_ITEMRule() ||
				   context == grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONRule() ||
				   context == grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONRule() ||
				   context == grammarAccess.getNET_DECLARATIONRule() ||
				   context == grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSRule()) {
					sequence_LIST_OF_NET_DECL_ASSIGNMENTS_LIST_OF_NET_DECL_ASSIGNMENTS(context, (LIST_OF_NET_DECL_ASSIGNMENTS) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.LIST_OF_VARIABLE_DECL_ASSIGNMENTS:
				if(context == grammarAccess.getMODULE_ITEMRule() ||
				   context == grammarAccess.getNON_PORT_MODULE_ITEMRule() ||
				   context == grammarAccess.getMODULE_OR_GENERATE_ITEMRule() ||
				   context == grammarAccess.getMODULE_COMMON_ITEMRule() ||
				   context == grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONRule() ||
				   context == grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONRule() ||
				   context == grammarAccess.getDATA_DECLARATIONRule() ||
				   context == grammarAccess.getVARIABLE_DECLARATIONRule() ||
				   context == grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSRule()) {
					sequence_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_LIST_OF_VARIABLE_DECL_ASSIGNMENTS(context, (LIST_OF_VARIABLE_DECL_ASSIGNMENTS) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.NET_DECL_ASSIGNMENT:
				if(context == grammarAccess.getNET_DECL_ASSIGNMENTRule()) {
					sequence_NET_DECL_ASSIGNMENT_NET_DECL_ASSIGNMENT(context, (NET_DECL_ASSIGNMENT) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.PORT:
				if(context == grammarAccess.getPortRule()) {
					sequence_Port_Port(context, (Port) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.UNPACKED_DIMENSIONS:
				if(context == grammarAccess.getUNPACKED_DIMENSIONSRule()) {
					sequence_UNPACKED_DIMENSIONS_UNPACKED_DIMENSIONS(context, (UNPACKED_DIMENSIONS) semanticObject); 
					return; 
				}
				else break;
			case SystemVerilogPackage.VARIABLE_DECL_ASSIGNMENT:
				if(context == grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule()) {
					sequence_VARIABLE_DECL_ASSIGNMENT_VARIABLE_DECL_ASSIGNMENT(context, (VARIABLE_DECL_ASSIGNMENT) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (assignments+=NET_ASSIGNMENT assignments+=NET_ASSIGNMENT*)
	 *
	 * Features:
	 *    assignments[1, *]
	 */
	protected void sequence_LIST_OF_NET_ASSIGNMENTS_LIST_OF_NET_ASSIGNMENTS(EObject context, LIST_OF_NET_ASSIGNMENTS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nets+=NET_DECL_ASSIGNMENT nets+=NET_DECL_ASSIGNMENT*)
	 *
	 * Features:
	 *    nets[1, *]
	 */
	protected void sequence_LIST_OF_NET_DECL_ASSIGNMENTS_LIST_OF_NET_DECL_ASSIGNMENTS(EObject context, LIST_OF_NET_DECL_ASSIGNMENTS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=VARIABLE_DECL_ASSIGNMENT variables+=VARIABLE_DECL_ASSIGNMENT*)
	 *
	 * Features:
	 *    variables[1, *]
	 */
	protected void sequence_LIST_OF_VARIABLE_DECL_ASSIGNMENTS_LIST_OF_VARIABLE_DECL_ASSIGNMENTS(EObject context, LIST_OF_VARIABLE_DECL_ASSIGNMENTS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=Parameter parameters+=Parameter*)? (ports+=Port ports+=Port*)? module_items+=MODULE_ITEM*)
	 *
	 * Features:
	 *    name[1, 1]
	 *    parameters[0, *]
	 *    ports[0, *]
	 *    module_items[0, *]
	 */
	protected void sequence_Module_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=UNPACKED_DIMENSIONS* value=NUMBER?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    dimensions[0, *]
	 *    value[0, 1]
	 */
	protected void sequence_NET_DECL_ASSIGNMENT_NET_DECL_ASSIGNMENT(EObject context, NET_DECL_ASSIGNMENT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_Parameter_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SystemVerilogPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemVerilogPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (direction=PORT_DIRECTION name=ID)
	 *
	 * Features:
	 *    direction[1, 1]
	 *    name[1, 1]
	 */
	protected void sequence_Port_Port(EObject context, Port semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SystemVerilogPackage.Literals.PORT__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemVerilogPackage.Literals.PORT__DIRECTION));
			if(transientValues.isValueTransient(semanticObject, SystemVerilogPackage.Literals.PORT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemVerilogPackage.Literals.PORT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0(), semanticObject.getDirection());
		feeder.accept(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left_bound+=INT right_bound+=INT)
	 *
	 * Features:
	 *    left_bound[1, 1]
	 *    right_bound[1, 1]
	 */
	protected void sequence_UNPACKED_DIMENSIONS_UNPACKED_DIMENSIONS(EObject context, UNPACKED_DIMENSIONS semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID dimensions+=UNPACKED_DIMENSIONS* value=NUMBER?)
	 *
	 * Features:
	 *    name[1, 1]
	 *    dimensions[0, *]
	 *    value[0, 1]
	 */
	protected void sequence_VARIABLE_DECL_ASSIGNMENT_VARIABLE_DECL_ASSIGNMENT(EObject context, VARIABLE_DECL_ASSIGNMENT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
