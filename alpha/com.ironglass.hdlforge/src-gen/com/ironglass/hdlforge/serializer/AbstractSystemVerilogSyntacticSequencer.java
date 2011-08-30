package com.ironglass.hdlforge.serializer;

import com.google.inject.Inject;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractSystemVerilogSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SystemVerilogGrammarAccess grammarAccess;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SystemVerilogGrammarAccess) access;
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDATA_TYPERule())
			return getDATA_TYPEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMODULE_KEYWORDRule())
			return getMODULE_KEYWORDToken(ruleCall, node);
		return "";
	}
	
	protected String getDATA_TYPEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "bit";
	}
	protected String getMODULE_KEYWORDToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "module";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		acceptNodes(transition, fromNode, toNode);
	}

}
