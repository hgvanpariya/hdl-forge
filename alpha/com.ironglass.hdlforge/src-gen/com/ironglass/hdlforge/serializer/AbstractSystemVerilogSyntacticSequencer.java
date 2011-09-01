package com.ironglass.hdlforge.serializer;

import com.google.inject.Inject;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractSystemVerilogSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SystemVerilogGrammarAccess grammarAccess;
	protected AbstractElementAlias match_CONTINUOUS_ASSIGN_DRIVE_STRENGTHTerminalRuleCall_1_q;
	protected AbstractElementAlias match_DATA_DECLARATION_ConstKeyword_0_q_LIFETIMEParserRuleCall_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SystemVerilogGrammarAccess) access;
		match_CONTINUOUS_ASSIGN_DRIVE_STRENGTHTerminalRuleCall_1_q = new TokenAlias(true, false, grammarAccess.getCONTINUOUS_ASSIGNAccess().getDRIVE_STRENGTHTerminalRuleCall_1());
		match_DATA_DECLARATION_ConstKeyword_0_q_LIFETIMEParserRuleCall_1_q = new GroupAlias(false, false, new TokenAlias(true, false, grammarAccess.getDATA_DECLARATIONAccess().getConstKeyword_0()), new TokenAlias(true, false, grammarAccess.getDATA_DECLARATIONAccess().getLIFETIMEParserRuleCall_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDATA_TYPERule())
			return getDATA_TYPEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getDRIVE_STRENGTHRule())
			return getDRIVE_STRENGTHToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLIFETIMERule())
			return getLIFETIMEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMODULE_KEYWORDRule())
			return getMODULE_KEYWORDToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNET_TYPE_OR_TRIREGRule())
			return getNET_TYPE_OR_TRIREGToken(ruleCall, node);
		return "";
	}
	
	protected String getDATA_TYPEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "bit";
	}
	protected String getDRIVE_STRENGTHToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(supply0,supply1)";
	}
	protected String getLIFETIMEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "static";
	}
	protected String getMODULE_KEYWORDToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "module";
	}
	protected String getNET_TYPE_OR_TRIREGToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "supply0";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_CONTINUOUS_ASSIGN_DRIVE_STRENGTHTerminalRuleCall_1_q.equals(transition.getAmbiguousSyntax()))
			emit_CONTINUOUS_ASSIGN_DRIVE_STRENGTHTerminalRuleCall_1_q(semanticObject, transition, fromNode, toNode);
		else if(match_DATA_DECLARATION_ConstKeyword_0_q_LIFETIMEParserRuleCall_1_q.equals(transition.getAmbiguousSyntax()))
			emit_DATA_DECLARATION_ConstKeyword_0_q_LIFETIMEParserRuleCall_1_q(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     DRIVE_STRENGTH?
	 */
	protected void emit_CONTINUOUS_ASSIGN_DRIVE_STRENGTHTerminalRuleCall_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     'const'? LIFETIME?
	 */
	protected void emit_DATA_DECLARATION_ConstKeyword_0_q_LIFETIMEParserRuleCall_1_q(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
