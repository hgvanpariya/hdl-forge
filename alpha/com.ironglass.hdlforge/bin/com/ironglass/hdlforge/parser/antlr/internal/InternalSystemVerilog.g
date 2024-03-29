/*
* generated by Xtext
*/
grammar InternalSystemVerilog;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package com.ironglass.hdlforge.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.ironglass.hdlforge.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;

}

@parser::members {

 	private SystemVerilogGrammarAccess grammarAccess;
 	
    public InternalSystemVerilogParser(TokenStream input, SystemVerilogGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Module";	
   	}
   	
   	@Override
   	protected SystemVerilogGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModule
entryRuleModule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModuleRule()); }
	 iv_ruleModule=ruleModule 
	 { $current=$iv_ruleModule.current; } 
	 EOF 
;

// Rule Module
ruleModule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); 
    }
ruleMODULE_KEYWORD
    { 
        afterParserOrEnumRuleCall();
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getModuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='#(' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); 
	    }
		lv_parameters_3_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_3_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4=',' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getModuleAccess().getCommaKeyword_2_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
	    }
		lv_parameters_5_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_5_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=')' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3());
    }
)?	otherlv_7='(' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); 
	    }
		lv_ports_8_0=rulePort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"ports",
        		lv_ports_8_0, 
        		"Port");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_9=',' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getCommaKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); 
	    }
		lv_ports_10_0=rulePort		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"ports",
        		lv_ports_10_0, 
        		"Port");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_11=')' 
    {
    	newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getRightParenthesisKeyword_5());
    }
	otherlv_12=';' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getSemicolonKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getModuleAccess().getModule_itemsModule_itemParserRuleCall_7_0()); 
	    }
		lv_module_items_13_0=ruleModule_item		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModuleRule());
	        }
       		add(
       			$current, 
       			"module_items",
        		lv_module_items_13_0, 
        		"Module_item");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_14='endmodule' 
    {
    	newLeafNode(otherlv_14, grammarAccess.getModuleAccess().getEndmoduleKeyword_8());
    }
)
;





// Entry rule entryRuleModule_item
entryRuleModule_item returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModule_itemRule()); }
	 iv_ruleModule_item=ruleModule_item 
	 { $current=$iv_ruleModule_item.current; } 
	 EOF 
;

// Rule Module_item
ruleModule_item returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getModule_itemAccess().getVARIABLE_DECLARATIONParserRuleCall()); 
    }
    this_VARIABLE_DECLARATION_0=ruleVARIABLE_DECLARATION
    { 
        $current = $this_VARIABLE_DECLARATION_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)
;





// Entry rule entryRulePort
entryRulePort returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	 iv_rulePort=rulePort 
	 { $current=$iv_rulePort.current; } 
	 EOF 
;

// Rule Port
rulePort returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); 
	    }
		lv_direction_0_0=rulePORT_DIRECTION		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPortRule());
	        }
       		set(
       			$current, 
       			"direction",
        		lv_direction_0_0, 
        		"PORT_DIRECTION");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPortRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleVARIABLE_DECLARATION
entryRuleVARIABLE_DECLARATION returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONRule()); }
	 iv_ruleVARIABLE_DECLARATION=ruleVARIABLE_DECLARATION 
	 { $current=$iv_ruleVARIABLE_DECLARATION.current; } 
	 EOF 
;

// Rule VARIABLE_DECLARATION
ruleVARIABLE_DECLARATION returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); 
    }
ruleDATA_TYPE
    { 
        afterParserOrEnumRuleCall();
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVARIABLE_DECLARATIONRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=';' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2());
    }
)
;





// Entry rule entryRuleDATA_TYPE
entryRuleDATA_TYPE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getDATA_TYPERule()); } 
	 iv_ruleDATA_TYPE=ruleDATA_TYPE 
	 { $current=$iv_ruleDATA_TYPE.current.getText(); }  
	 EOF 
;

// Rule DATA_TYPE
ruleDATA_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); 
    }
    this_INTEGER_VECTOR_TYPE_0=ruleINTEGER_VECTOR_TYPE    {
		$current.merge(this_INTEGER_VECTOR_TYPE_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }

    ;





// Entry rule entryRuleINTEGER_VECTOR_TYPE
entryRuleINTEGER_VECTOR_TYPE returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getINTEGER_VECTOR_TYPERule()); } 
	 iv_ruleINTEGER_VECTOR_TYPE=ruleINTEGER_VECTOR_TYPE 
	 { $current=$iv_ruleINTEGER_VECTOR_TYPE.current.getText(); }  
	 EOF 
;

// Rule INTEGER_VECTOR_TYPE
ruleINTEGER_VECTOR_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='bit' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 
    }

    |
	kw='logic' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 
    }

    |
	kw='reg' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); 
    }
)
    ;





// Entry rule entryRuleMODULE_KEYWORD
entryRuleMODULE_KEYWORD returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getMODULE_KEYWORDRule()); } 
	 iv_ruleMODULE_KEYWORD=ruleMODULE_KEYWORD 
	 { $current=$iv_ruleMODULE_KEYWORD.current.getText(); }  
	 EOF 
;

// Rule MODULE_KEYWORD
ruleMODULE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='module' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 
    }

    |
	kw='macromodule' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); 
    }
)
    ;





// Entry rule entryRulePORT_DIRECTION
entryRulePORT_DIRECTION returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getPORT_DIRECTIONRule()); } 
	 iv_rulePORT_DIRECTION=rulePORT_DIRECTION 
	 { $current=$iv_rulePORT_DIRECTION.current.getText(); }  
	 EOF 
;

// Rule PORT_DIRECTION
rulePORT_DIRECTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='input' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 
    }

    |
	kw='output' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 
    }

    |
	kw='inout' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 
    }

    |
	kw='ref' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); 
    }
)
    ;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


