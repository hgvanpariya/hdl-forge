package com.ironglass.hdlforge.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;
import com.ironglass.hdlforge.systemVerilog.Module;
import com.ironglass.hdlforge.systemVerilog.Parameter;
import com.ironglass.hdlforge.systemVerilog.Port;
import com.ironglass.hdlforge.systemVerilog.SystemVerilogPackage;
import com.ironglass.hdlforge.systemVerilog.VARIABLE_DECLARATION;
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
			case SystemVerilogPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module_Module(context, (Module) semanticObject); 
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
			case SystemVerilogPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getModule_itemRule() ||
				   context == grammarAccess.getVARIABLE_DECLARATIONRule()) {
					sequence_VARIABLE_DECLARATION_VARIABLE_DECLARATION(context, (VARIABLE_DECLARATION) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=Parameter parameters+=Parameter*)? (ports+=Port ports+=Port*)? module_items+=Module_item*)
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
	 *     name=ID
	 *
	 * Features:
	 *    name[1, 1]
	 */
	protected void sequence_VARIABLE_DECLARATION_VARIABLE_DECLARATION(EObject context, VARIABLE_DECLARATION semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SystemVerilogPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SystemVerilogPackage.Literals.VARIABLE_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
