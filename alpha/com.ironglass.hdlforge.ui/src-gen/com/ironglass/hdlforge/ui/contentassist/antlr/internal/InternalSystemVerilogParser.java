package com.ironglass.hdlforge.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import com.ironglass.hdlforge.services.SystemVerilogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemVerilogParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'bit'", "'logic'", "'reg'", "'module'", "'macromodule'", "'input'", "'output'", "'inout'", "'ref'", "'('", "')'", "';'", "'endmodule'", "'#('", "','"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSystemVerilogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemVerilogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemVerilogParser.tokenNames; }
    public String getGrammarFileName() { return "../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g"; }


     
     	private SystemVerilogGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SystemVerilogGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleModule"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:61:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:62:1: ( ruleModule EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:63:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_ruleModule_in_entryRuleModule61);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:70:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:74:2: ( ( ( rule__Module__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:75:1: ( ( rule__Module__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:75:1: ( ( rule__Module__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:76:1: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:77:1: ( rule__Module__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:77:2: rule__Module__Group__0
            {
            pushFollow(FOLLOW_rule__Module__Group__0_in_ruleModule94);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleModule_item"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:89:1: entryRuleModule_item : ruleModule_item EOF ;
    public final void entryRuleModule_item() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:90:1: ( ruleModule_item EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:91:1: ruleModule_item EOF
            {
             before(grammarAccess.getModule_itemRule()); 
            pushFollow(FOLLOW_ruleModule_item_in_entryRuleModule_item121);
            ruleModule_item();

            state._fsp--;

             after(grammarAccess.getModule_itemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModule_item128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule_item"


    // $ANTLR start "ruleModule_item"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:98:1: ruleModule_item : ( ruleVARIABLE_DECLARATION ) ;
    public final void ruleModule_item() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:102:2: ( ( ruleVARIABLE_DECLARATION ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:103:1: ( ruleVARIABLE_DECLARATION )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:103:1: ( ruleVARIABLE_DECLARATION )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:104:1: ruleVARIABLE_DECLARATION
            {
             before(grammarAccess.getModule_itemAccess().getVARIABLE_DECLARATIONParserRuleCall()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_ruleModule_item154);
            ruleVARIABLE_DECLARATION();

            state._fsp--;

             after(grammarAccess.getModule_itemAccess().getVARIABLE_DECLARATIONParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule_item"


    // $ANTLR start "entryRuleParameter"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:117:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:118:1: ( ruleParameter EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:119:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter180);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter187); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:126:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:130:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:131:1: ( ( rule__Parameter__NameAssignment ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:131:1: ( ( rule__Parameter__NameAssignment ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:132:1: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:133:1: ( rule__Parameter__NameAssignment )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:133:2: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter213);
            rule__Parameter__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRulePort"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:145:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:146:1: ( rulePort EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:147:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort240);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort247); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:154:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:158:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:159:1: ( ( rule__Port__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:159:1: ( ( rule__Port__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:160:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:161:1: ( rule__Port__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:161:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort273);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "entryRuleVARIABLE_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:173:1: entryRuleVARIABLE_DECLARATION : ruleVARIABLE_DECLARATION EOF ;
    public final void entryRuleVARIABLE_DECLARATION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:174:1: ( ruleVARIABLE_DECLARATION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:175:1: ruleVARIABLE_DECLARATION EOF
            {
             before(grammarAccess.getVARIABLE_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION300);
            ruleVARIABLE_DECLARATION();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECLARATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVARIABLE_DECLARATION"


    // $ANTLR start "ruleVARIABLE_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:182:1: ruleVARIABLE_DECLARATION : ( ( rule__VARIABLE_DECLARATION__Group__0 ) ) ;
    public final void ruleVARIABLE_DECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:186:2: ( ( ( rule__VARIABLE_DECLARATION__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:187:1: ( ( rule__VARIABLE_DECLARATION__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:187:1: ( ( rule__VARIABLE_DECLARATION__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:188:1: ( rule__VARIABLE_DECLARATION__Group__0 )
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:189:1: ( rule__VARIABLE_DECLARATION__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:189:2: rule__VARIABLE_DECLARATION__Group__0
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__0_in_ruleVARIABLE_DECLARATION333);
            rule__VARIABLE_DECLARATION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_DECLARATIONAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVARIABLE_DECLARATION"


    // $ANTLR start "entryRuleDATA_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:201:1: entryRuleDATA_TYPE : ruleDATA_TYPE EOF ;
    public final void entryRuleDATA_TYPE() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:202:1: ( ruleDATA_TYPE EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:203:1: ruleDATA_TYPE EOF
            {
             before(grammarAccess.getDATA_TYPERule()); 
            pushFollow(FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE360);
            ruleDATA_TYPE();

            state._fsp--;

             after(grammarAccess.getDATA_TYPERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATA_TYPE367); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDATA_TYPE"


    // $ANTLR start "ruleDATA_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:210:1: ruleDATA_TYPE : ( ruleINTEGER_VECTOR_TYPE ) ;
    public final void ruleDATA_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:214:2: ( ( ruleINTEGER_VECTOR_TYPE ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:215:1: ( ruleINTEGER_VECTOR_TYPE )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:215:1: ( ruleINTEGER_VECTOR_TYPE )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:216:1: ruleINTEGER_VECTOR_TYPE
            {
             before(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); 
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE393);
            ruleINTEGER_VECTOR_TYPE();

            state._fsp--;

             after(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATA_TYPE"


    // $ANTLR start "entryRuleINTEGER_VECTOR_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:229:1: entryRuleINTEGER_VECTOR_TYPE : ruleINTEGER_VECTOR_TYPE EOF ;
    public final void entryRuleINTEGER_VECTOR_TYPE() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:230:1: ( ruleINTEGER_VECTOR_TYPE EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:231:1: ruleINTEGER_VECTOR_TYPE EOF
            {
             before(grammarAccess.getINTEGER_VECTOR_TYPERule()); 
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE419);
            ruleINTEGER_VECTOR_TYPE();

            state._fsp--;

             after(grammarAccess.getINTEGER_VECTOR_TYPERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE426); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleINTEGER_VECTOR_TYPE"


    // $ANTLR start "ruleINTEGER_VECTOR_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:238:1: ruleINTEGER_VECTOR_TYPE : ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) ) ;
    public final void ruleINTEGER_VECTOR_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:242:2: ( ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:243:1: ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:243:1: ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:244:1: ( rule__INTEGER_VECTOR_TYPE__Alternatives )
            {
             before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:245:1: ( rule__INTEGER_VECTOR_TYPE__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:245:2: rule__INTEGER_VECTOR_TYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__INTEGER_VECTOR_TYPE__Alternatives_in_ruleINTEGER_VECTOR_TYPE452);
            rule__INTEGER_VECTOR_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleINTEGER_VECTOR_TYPE"


    // $ANTLR start "entryRuleMODULE_KEYWORD"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:257:1: entryRuleMODULE_KEYWORD : ruleMODULE_KEYWORD EOF ;
    public final void entryRuleMODULE_KEYWORD() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:258:1: ( ruleMODULE_KEYWORD EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:259:1: ruleMODULE_KEYWORD EOF
            {
             before(grammarAccess.getMODULE_KEYWORDRule()); 
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD479);
            ruleMODULE_KEYWORD();

            state._fsp--;

             after(grammarAccess.getMODULE_KEYWORDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_KEYWORD486); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMODULE_KEYWORD"


    // $ANTLR start "ruleMODULE_KEYWORD"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:266:1: ruleMODULE_KEYWORD : ( ( rule__MODULE_KEYWORD__Alternatives ) ) ;
    public final void ruleMODULE_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:270:2: ( ( ( rule__MODULE_KEYWORD__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:271:1: ( ( rule__MODULE_KEYWORD__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:271:1: ( ( rule__MODULE_KEYWORD__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:272:1: ( rule__MODULE_KEYWORD__Alternatives )
            {
             before(grammarAccess.getMODULE_KEYWORDAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:273:1: ( rule__MODULE_KEYWORD__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:273:2: rule__MODULE_KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_rule__MODULE_KEYWORD__Alternatives_in_ruleMODULE_KEYWORD512);
            rule__MODULE_KEYWORD__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMODULE_KEYWORDAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMODULE_KEYWORD"


    // $ANTLR start "entryRulePORT_DIRECTION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:285:1: entryRulePORT_DIRECTION : rulePORT_DIRECTION EOF ;
    public final void entryRulePORT_DIRECTION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:286:1: ( rulePORT_DIRECTION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:287:1: rulePORT_DIRECTION EOF
            {
             before(grammarAccess.getPORT_DIRECTIONRule()); 
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION539);
            rulePORT_DIRECTION();

            state._fsp--;

             after(grammarAccess.getPORT_DIRECTIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePORT_DIRECTION546); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePORT_DIRECTION"


    // $ANTLR start "rulePORT_DIRECTION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:294:1: rulePORT_DIRECTION : ( ( rule__PORT_DIRECTION__Alternatives ) ) ;
    public final void rulePORT_DIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:298:2: ( ( ( rule__PORT_DIRECTION__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:299:1: ( ( rule__PORT_DIRECTION__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:299:1: ( ( rule__PORT_DIRECTION__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:300:1: ( rule__PORT_DIRECTION__Alternatives )
            {
             before(grammarAccess.getPORT_DIRECTIONAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:301:1: ( rule__PORT_DIRECTION__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:301:2: rule__PORT_DIRECTION__Alternatives
            {
            pushFollow(FOLLOW_rule__PORT_DIRECTION__Alternatives_in_rulePORT_DIRECTION572);
            rule__PORT_DIRECTION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPORT_DIRECTIONAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePORT_DIRECTION"


    // $ANTLR start "rule__INTEGER_VECTOR_TYPE__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:313:1: rule__INTEGER_VECTOR_TYPE__Alternatives : ( ( 'bit' ) | ( 'logic' ) | ( 'reg' ) );
    public final void rule__INTEGER_VECTOR_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:317:1: ( ( 'bit' ) | ( 'logic' ) | ( 'reg' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:318:1: ( 'bit' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:318:1: ( 'bit' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:319:1: 'bit'
                    {
                     before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__INTEGER_VECTOR_TYPE__Alternatives609); 
                     after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:326:6: ( 'logic' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:326:6: ( 'logic' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:327:1: 'logic'
                    {
                     before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__INTEGER_VECTOR_TYPE__Alternatives629); 
                     after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:334:6: ( 'reg' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:334:6: ( 'reg' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:335:1: 'reg'
                    {
                     before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); 
                    match(input,13,FOLLOW_13_in_rule__INTEGER_VECTOR_TYPE__Alternatives649); 
                     after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__INTEGER_VECTOR_TYPE__Alternatives"


    // $ANTLR start "rule__MODULE_KEYWORD__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:347:1: rule__MODULE_KEYWORD__Alternatives : ( ( 'module' ) | ( 'macromodule' ) );
    public final void rule__MODULE_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:351:1: ( ( 'module' ) | ( 'macromodule' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:352:1: ( 'module' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:352:1: ( 'module' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:353:1: 'module'
                    {
                     before(grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 
                    match(input,14,FOLLOW_14_in_rule__MODULE_KEYWORD__Alternatives684); 
                     after(grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:360:6: ( 'macromodule' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:360:6: ( 'macromodule' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:361:1: 'macromodule'
                    {
                     before(grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__MODULE_KEYWORD__Alternatives704); 
                     after(grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MODULE_KEYWORD__Alternatives"


    // $ANTLR start "rule__PORT_DIRECTION__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:373:1: rule__PORT_DIRECTION__Alternatives : ( ( 'input' ) | ( 'output' ) | ( 'inout' ) | ( 'ref' ) );
    public final void rule__PORT_DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:377:1: ( ( 'input' ) | ( 'output' ) | ( 'inout' ) | ( 'ref' ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:378:1: ( 'input' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:378:1: ( 'input' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:379:1: 'input'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 
                    match(input,16,FOLLOW_16_in_rule__PORT_DIRECTION__Alternatives739); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:386:6: ( 'output' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:386:6: ( 'output' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:387:1: 'output'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 
                    match(input,17,FOLLOW_17_in_rule__PORT_DIRECTION__Alternatives759); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:394:6: ( 'inout' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:394:6: ( 'inout' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:395:1: 'inout'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 
                    match(input,18,FOLLOW_18_in_rule__PORT_DIRECTION__Alternatives779); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:402:6: ( 'ref' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:402:6: ( 'ref' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:403:1: 'ref'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); 
                    match(input,19,FOLLOW_19_in_rule__PORT_DIRECTION__Alternatives799); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PORT_DIRECTION__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:417:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:421:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:422:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0831);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0834);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:429:1: rule__Module__Group__0__Impl : ( ruleMODULE_KEYWORD ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:433:1: ( ( ruleMODULE_KEYWORD ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:434:1: ( ruleMODULE_KEYWORD )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:434:1: ( ruleMODULE_KEYWORD )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:435:1: ruleMODULE_KEYWORD
            {
             before(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_rule__Module__Group__0__Impl861);
            ruleMODULE_KEYWORD();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:446:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:450:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:451:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1890);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1893);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:458:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:462:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:463:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:463:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:464:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:465:1: ( rule__Module__NameAssignment_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:465:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl920);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:475:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:479:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:480:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2950);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2953);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:487:1: rule__Module__Group__2__Impl : ( ( rule__Module__Group_2__0 )? ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:491:1: ( ( ( rule__Module__Group_2__0 )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:492:1: ( ( rule__Module__Group_2__0 )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:492:1: ( ( rule__Module__Group_2__0 )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:493:1: ( rule__Module__Group_2__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_2()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:494:1: ( rule__Module__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:494:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl980);
                    rule__Module__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:504:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:508:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:509:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31011);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31014);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:516:1: rule__Module__Group__3__Impl : ( '(' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:520:1: ( ( '(' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:521:1: ( '(' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:521:1: ( '(' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:522:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__Module__Group__3__Impl1042); 
             after(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:535:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:539:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:540:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41073);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41076);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:547:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:551:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:552:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:552:1: ( ( rule__Module__Group_4__0 )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:553:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:554:1: ( rule__Module__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=16 && LA5_0<=19)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:554:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1103);
                    rule__Module__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:564:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:568:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:569:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51134);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51137);
            rule__Module__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:576:1: rule__Module__Group__5__Impl : ( ')' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:580:1: ( ( ')' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:581:1: ( ')' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:581:1: ( ')' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:582:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group__5__Impl1165); 
             after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:595:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:599:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:600:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61196);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__61199);
            rule__Module__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:607:1: rule__Module__Group__6__Impl : ( ';' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:611:1: ( ( ';' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:612:1: ( ';' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:612:1: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:613:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_6()); 
            match(input,22,FOLLOW_22_in_rule__Module__Group__6__Impl1227); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:626:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:630:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:631:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__71258);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__8_in_rule__Module__Group__71261);
            rule__Module__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:638:1: rule__Module__Group__7__Impl : ( ( rule__Module__Module_itemsAssignment_7 )* ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:642:1: ( ( ( rule__Module__Module_itemsAssignment_7 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:643:1: ( ( rule__Module__Module_itemsAssignment_7 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:643:1: ( ( rule__Module__Module_itemsAssignment_7 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:644:1: ( rule__Module__Module_itemsAssignment_7 )*
            {
             before(grammarAccess.getModuleAccess().getModule_itemsAssignment_7()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:645:1: ( rule__Module__Module_itemsAssignment_7 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=11 && LA6_0<=13)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:645:2: rule__Module__Module_itemsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Module__Module_itemsAssignment_7_in_rule__Module__Group__7__Impl1288);
            	    rule__Module__Module_itemsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getModule_itemsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group__8"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:655:1: rule__Module__Group__8 : rule__Module__Group__8__Impl ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:659:1: ( rule__Module__Group__8__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:660:2: rule__Module__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__81319);
            rule__Module__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8"


    // $ANTLR start "rule__Module__Group__8__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:666:1: rule__Module__Group__8__Impl : ( 'endmodule' ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:670:1: ( ( 'endmodule' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:671:1: ( 'endmodule' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:671:1: ( 'endmodule' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:672:1: 'endmodule'
            {
             before(grammarAccess.getModuleAccess().getEndmoduleKeyword_8()); 
            match(input,23,FOLLOW_23_in_rule__Module__Group__8__Impl1347); 
             after(grammarAccess.getModuleAccess().getEndmoduleKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8__Impl"


    // $ANTLR start "rule__Module__Group_2__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:703:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:707:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:708:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__01396);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__01399);
            rule__Module__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__0"


    // $ANTLR start "rule__Module__Group_2__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:715:1: rule__Module__Group_2__0__Impl : ( '#(' ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:719:1: ( ( '#(' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:720:1: ( '#(' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:720:1: ( '#(' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:721:1: '#('
            {
             before(grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__Module__Group_2__0__Impl1427); 
             after(grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__0__Impl"


    // $ANTLR start "rule__Module__Group_2__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:734:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:738:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:739:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__11458);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__11461);
            rule__Module__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__1"


    // $ANTLR start "rule__Module__Group_2__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:746:1: rule__Module__Group_2__1__Impl : ( ( rule__Module__ParametersAssignment_2_1 ) ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:750:1: ( ( ( rule__Module__ParametersAssignment_2_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:751:1: ( ( rule__Module__ParametersAssignment_2_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:751:1: ( ( rule__Module__ParametersAssignment_2_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:752:1: ( rule__Module__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getModuleAccess().getParametersAssignment_2_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:753:1: ( rule__Module__ParametersAssignment_2_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:753:2: rule__Module__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Module__ParametersAssignment_2_1_in_rule__Module__Group_2__1__Impl1488);
            rule__Module__ParametersAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getParametersAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__1__Impl"


    // $ANTLR start "rule__Module__Group_2__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:763:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl rule__Module__Group_2__3 ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:767:1: ( rule__Module__Group_2__2__Impl rule__Module__Group_2__3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:768:2: rule__Module__Group_2__2__Impl rule__Module__Group_2__3
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__21518);
            rule__Module__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__3_in_rule__Module__Group_2__21521);
            rule__Module__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__2"


    // $ANTLR start "rule__Module__Group_2__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:775:1: rule__Module__Group_2__2__Impl : ( ( rule__Module__Group_2_2__0 )* ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:779:1: ( ( ( rule__Module__Group_2_2__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:780:1: ( ( rule__Module__Group_2_2__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:780:1: ( ( rule__Module__Group_2_2__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:781:1: ( rule__Module__Group_2_2__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_2_2()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:782:1: ( rule__Module__Group_2_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:782:2: rule__Module__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_2_2__0_in_rule__Module__Group_2__2__Impl1548);
            	    rule__Module__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__2__Impl"


    // $ANTLR start "rule__Module__Group_2__3"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:792:1: rule__Module__Group_2__3 : rule__Module__Group_2__3__Impl ;
    public final void rule__Module__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:796:1: ( rule__Module__Group_2__3__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:797:2: rule__Module__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__3__Impl_in_rule__Module__Group_2__31579);
            rule__Module__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__3"


    // $ANTLR start "rule__Module__Group_2__3__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:803:1: rule__Module__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Module__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:807:1: ( ( ')' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:808:1: ( ')' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:808:1: ( ')' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:809:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,21,FOLLOW_21_in_rule__Module__Group_2__3__Impl1607); 
             after(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2__3__Impl"


    // $ANTLR start "rule__Module__Group_2_2__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:830:1: rule__Module__Group_2_2__0 : rule__Module__Group_2_2__0__Impl rule__Module__Group_2_2__1 ;
    public final void rule__Module__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:834:1: ( rule__Module__Group_2_2__0__Impl rule__Module__Group_2_2__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:835:2: rule__Module__Group_2_2__0__Impl rule__Module__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2_2__0__Impl_in_rule__Module__Group_2_2__01646);
            rule__Module__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2_2__1_in_rule__Module__Group_2_2__01649);
            rule__Module__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2_2__0"


    // $ANTLR start "rule__Module__Group_2_2__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:842:1: rule__Module__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:846:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:847:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:847:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:848:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_2_2_0()); 
            match(input,25,FOLLOW_25_in_rule__Module__Group_2_2__0__Impl1677); 
             after(grammarAccess.getModuleAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2_2__0__Impl"


    // $ANTLR start "rule__Module__Group_2_2__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:861:1: rule__Module__Group_2_2__1 : rule__Module__Group_2_2__1__Impl ;
    public final void rule__Module__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:865:1: ( rule__Module__Group_2_2__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:866:2: rule__Module__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2_2__1__Impl_in_rule__Module__Group_2_2__11708);
            rule__Module__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2_2__1"


    // $ANTLR start "rule__Module__Group_2_2__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:872:1: rule__Module__Group_2_2__1__Impl : ( ( rule__Module__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Module__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:876:1: ( ( ( rule__Module__ParametersAssignment_2_2_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:877:1: ( ( rule__Module__ParametersAssignment_2_2_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:877:1: ( ( rule__Module__ParametersAssignment_2_2_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:878:1: ( rule__Module__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getModuleAccess().getParametersAssignment_2_2_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:879:1: ( rule__Module__ParametersAssignment_2_2_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:879:2: rule__Module__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Module__ParametersAssignment_2_2_1_in_rule__Module__Group_2_2__1__Impl1735);
            rule__Module__ParametersAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getParametersAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_2_2__1__Impl"


    // $ANTLR start "rule__Module__Group_4__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:893:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:897:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:898:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01769);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01772);
            rule__Module__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0"


    // $ANTLR start "rule__Module__Group_4__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:905:1: rule__Module__Group_4__0__Impl : ( ( rule__Module__PortsAssignment_4_0 ) ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:909:1: ( ( ( rule__Module__PortsAssignment_4_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:910:1: ( ( rule__Module__PortsAssignment_4_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:910:1: ( ( rule__Module__PortsAssignment_4_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:911:1: ( rule__Module__PortsAssignment_4_0 )
            {
             before(grammarAccess.getModuleAccess().getPortsAssignment_4_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:912:1: ( rule__Module__PortsAssignment_4_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:912:2: rule__Module__PortsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Module__PortsAssignment_4_0_in_rule__Module__Group_4__0__Impl1799);
            rule__Module__PortsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getPortsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__0__Impl"


    // $ANTLR start "rule__Module__Group_4__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:922:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:926:1: ( rule__Module__Group_4__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:927:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11829);
            rule__Module__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1"


    // $ANTLR start "rule__Module__Group_4__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:933:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__Group_4_1__0 )* ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:937:1: ( ( ( rule__Module__Group_4_1__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:938:1: ( ( rule__Module__Group_4_1__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:938:1: ( ( rule__Module__Group_4_1__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:939:1: ( rule__Module__Group_4_1__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_4_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:940:1: ( rule__Module__Group_4_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:940:2: rule__Module__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_4_1__0_in_rule__Module__Group_4__1__Impl1856);
            	    rule__Module__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4__1__Impl"


    // $ANTLR start "rule__Module__Group_4_1__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:954:1: rule__Module__Group_4_1__0 : rule__Module__Group_4_1__0__Impl rule__Module__Group_4_1__1 ;
    public final void rule__Module__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:958:1: ( rule__Module__Group_4_1__0__Impl rule__Module__Group_4_1__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:959:2: rule__Module__Group_4_1__0__Impl rule__Module__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4_1__0__Impl_in_rule__Module__Group_4_1__01891);
            rule__Module__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4_1__1_in_rule__Module__Group_4_1__01894);
            rule__Module__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_1__0"


    // $ANTLR start "rule__Module__Group_4_1__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:966:1: rule__Module__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:970:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:971:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:971:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:972:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_4_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Module__Group_4_1__0__Impl1922); 
             after(grammarAccess.getModuleAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_1__0__Impl"


    // $ANTLR start "rule__Module__Group_4_1__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:985:1: rule__Module__Group_4_1__1 : rule__Module__Group_4_1__1__Impl ;
    public final void rule__Module__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:989:1: ( rule__Module__Group_4_1__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:990:2: rule__Module__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4_1__1__Impl_in_rule__Module__Group_4_1__11953);
            rule__Module__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_1__1"


    // $ANTLR start "rule__Module__Group_4_1__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:996:1: rule__Module__Group_4_1__1__Impl : ( ( rule__Module__PortsAssignment_4_1_1 ) ) ;
    public final void rule__Module__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1000:1: ( ( ( rule__Module__PortsAssignment_4_1_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1001:1: ( ( rule__Module__PortsAssignment_4_1_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1001:1: ( ( rule__Module__PortsAssignment_4_1_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1002:1: ( rule__Module__PortsAssignment_4_1_1 )
            {
             before(grammarAccess.getModuleAccess().getPortsAssignment_4_1_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1003:1: ( rule__Module__PortsAssignment_4_1_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1003:2: rule__Module__PortsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Module__PortsAssignment_4_1_1_in_rule__Module__Group_4_1__1__Impl1980);
            rule__Module__PortsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getPortsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_4_1__1__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1017:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1021:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1022:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02014);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02017);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1029:1: rule__Port__Group__0__Impl : ( ( rule__Port__DirectionAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1033:1: ( ( ( rule__Port__DirectionAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1034:1: ( ( rule__Port__DirectionAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1034:1: ( ( rule__Port__DirectionAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1035:1: ( rule__Port__DirectionAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getDirectionAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1036:1: ( rule__Port__DirectionAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1036:2: rule__Port__DirectionAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__DirectionAssignment_0_in_rule__Port__Group__0__Impl2044);
            rule__Port__DirectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getDirectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1046:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1050:1: ( rule__Port__Group__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1051:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12074);
            rule__Port__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1057:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1061:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1062:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1062:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1063:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1064:1: ( rule__Port__NameAssignment_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1064:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2101);
            rule__Port__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1078:1: rule__VARIABLE_DECLARATION__Group__0 : rule__VARIABLE_DECLARATION__Group__0__Impl rule__VARIABLE_DECLARATION__Group__1 ;
    public final void rule__VARIABLE_DECLARATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1082:1: ( rule__VARIABLE_DECLARATION__Group__0__Impl rule__VARIABLE_DECLARATION__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1083:2: rule__VARIABLE_DECLARATION__Group__0__Impl rule__VARIABLE_DECLARATION__Group__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__0__Impl_in_rule__VARIABLE_DECLARATION__Group__02135);
            rule__VARIABLE_DECLARATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__1_in_rule__VARIABLE_DECLARATION__Group__02138);
            rule__VARIABLE_DECLARATION__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__Group__0"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1090:1: rule__VARIABLE_DECLARATION__Group__0__Impl : ( ruleDATA_TYPE ) ;
    public final void rule__VARIABLE_DECLARATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1094:1: ( ( ruleDATA_TYPE ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1095:1: ( ruleDATA_TYPE )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1095:1: ( ruleDATA_TYPE )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1096:1: ruleDATA_TYPE
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDATA_TYPE_in_rule__VARIABLE_DECLARATION__Group__0__Impl2165);
            ruleDATA_TYPE();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__Group__0__Impl"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1107:1: rule__VARIABLE_DECLARATION__Group__1 : rule__VARIABLE_DECLARATION__Group__1__Impl rule__VARIABLE_DECLARATION__Group__2 ;
    public final void rule__VARIABLE_DECLARATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1111:1: ( rule__VARIABLE_DECLARATION__Group__1__Impl rule__VARIABLE_DECLARATION__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1112:2: rule__VARIABLE_DECLARATION__Group__1__Impl rule__VARIABLE_DECLARATION__Group__2
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__1__Impl_in_rule__VARIABLE_DECLARATION__Group__12194);
            rule__VARIABLE_DECLARATION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__2_in_rule__VARIABLE_DECLARATION__Group__12197);
            rule__VARIABLE_DECLARATION__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__Group__1"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1119:1: rule__VARIABLE_DECLARATION__Group__1__Impl : ( ( rule__VARIABLE_DECLARATION__NameAssignment_1 ) ) ;
    public final void rule__VARIABLE_DECLARATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1123:1: ( ( ( rule__VARIABLE_DECLARATION__NameAssignment_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1124:1: ( ( rule__VARIABLE_DECLARATION__NameAssignment_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1124:1: ( ( rule__VARIABLE_DECLARATION__NameAssignment_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1125:1: ( rule__VARIABLE_DECLARATION__NameAssignment_1 )
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1126:1: ( rule__VARIABLE_DECLARATION__NameAssignment_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1126:2: rule__VARIABLE_DECLARATION__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__NameAssignment_1_in_rule__VARIABLE_DECLARATION__Group__1__Impl2224);
            rule__VARIABLE_DECLARATION__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__Group__1__Impl"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1136:1: rule__VARIABLE_DECLARATION__Group__2 : rule__VARIABLE_DECLARATION__Group__2__Impl ;
    public final void rule__VARIABLE_DECLARATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1140:1: ( rule__VARIABLE_DECLARATION__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1141:2: rule__VARIABLE_DECLARATION__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__2__Impl_in_rule__VARIABLE_DECLARATION__Group__22254);
            rule__VARIABLE_DECLARATION__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__Group__2"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1147:1: rule__VARIABLE_DECLARATION__Group__2__Impl : ( ';' ) ;
    public final void rule__VARIABLE_DECLARATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1151:1: ( ( ';' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1152:1: ( ';' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1152:1: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1153:1: ';'
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_22_in_rule__VARIABLE_DECLARATION__Group__2__Impl2282); 
             after(grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__Group__2__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1173:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1177:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1178:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1178:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1179:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_12324); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__ParametersAssignment_2_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1188:1: rule__Module__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Module__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1192:1: ( ( ruleParameter ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1193:1: ( ruleParameter )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1193:1: ( ruleParameter )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1194:1: ruleParameter
            {
             before(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_12355);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ParametersAssignment_2_1"


    // $ANTLR start "rule__Module__ParametersAssignment_2_2_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1203:1: rule__Module__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Module__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1207:1: ( ( ruleParameter ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1208:1: ( ruleParameter )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1208:1: ( ruleParameter )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1209:1: ruleParameter
            {
             before(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_2_12386);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Module__PortsAssignment_4_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1218:1: rule__Module__PortsAssignment_4_0 : ( rulePort ) ;
    public final void rule__Module__PortsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1222:1: ( ( rulePort ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1223:1: ( rulePort )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1223:1: ( rulePort )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1224:1: rulePort
            {
             before(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_02417);
            rulePort();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PortsAssignment_4_0"


    // $ANTLR start "rule__Module__PortsAssignment_4_1_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1233:1: rule__Module__PortsAssignment_4_1_1 : ( rulePort ) ;
    public final void rule__Module__PortsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1237:1: ( ( rulePort ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1238:1: ( rulePort )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1238:1: ( rulePort )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1239:1: rulePort
            {
             before(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_1_12448);
            rulePort();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__PortsAssignment_4_1_1"


    // $ANTLR start "rule__Module__Module_itemsAssignment_7"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1248:1: rule__Module__Module_itemsAssignment_7 : ( ruleModule_item ) ;
    public final void rule__Module__Module_itemsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1252:1: ( ( ruleModule_item ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1253:1: ( ruleModule_item )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1253:1: ( ruleModule_item )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1254:1: ruleModule_item
            {
             before(grammarAccess.getModuleAccess().getModule_itemsModule_itemParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleModule_item_in_rule__Module__Module_itemsAssignment_72479);
            ruleModule_item();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getModule_itemsModule_itemParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Module_itemsAssignment_7"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1263:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1267:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1268:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1268:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1269:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment2510); 
             after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__Port__DirectionAssignment_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1278:1: rule__Port__DirectionAssignment_0 : ( rulePORT_DIRECTION ) ;
    public final void rule__Port__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1282:1: ( ( rulePORT_DIRECTION ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1283:1: ( rulePORT_DIRECTION )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1283:1: ( rulePORT_DIRECTION )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1284:1: rulePORT_DIRECTION
            {
             before(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_rule__Port__DirectionAssignment_02541);
            rulePORT_DIRECTION();

            state._fsp--;

             after(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__DirectionAssignment_0"


    // $ANTLR start "rule__Port__NameAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1293:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1297:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1298:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1298:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1299:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_12572); 
             after(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NameAssignment_1"


    // $ANTLR start "rule__VARIABLE_DECLARATION__NameAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1308:1: rule__VARIABLE_DECLARATION__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VARIABLE_DECLARATION__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1312:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1313:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1313:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1314:1: RULE_ID
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_DECLARATION__NameAssignment_12603); 
             after(grammarAccess.getVARIABLE_DECLARATIONAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_DECLARATION__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_item_in_entryRuleModule_item121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule_item128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_ruleModule_item154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter180 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__0_in_ruleVARIABLE_DECLARATION333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATA_TYPE367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__INTEGER_VECTOR_TYPE__Alternatives_in_ruleINTEGER_VECTOR_TYPE452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_KEYWORD486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MODULE_KEYWORD__Alternatives_in_ruleMODULE_KEYWORD512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePORT_DIRECTION546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PORT_DIRECTION__Alternatives_in_rulePORT_DIRECTION572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__INTEGER_VECTOR_TYPE__Alternatives609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__INTEGER_VECTOR_TYPE__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__INTEGER_VECTOR_TYPE__Alternatives649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__MODULE_KEYWORD__Alternatives684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__MODULE_KEYWORD__Alternatives704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PORT_DIRECTION__Alternatives739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PORT_DIRECTION__Alternatives759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PORT_DIRECTION__Alternatives779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PORT_DIRECTION__Alternatives799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__0831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__0834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_rule__Module__Group__0__Impl861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__1890 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__2950 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__31011 = new BitSet(new long[]{0x00000000002F0000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__31014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Module__Group__3__Impl1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__41073 = new BitSet(new long[]{0x00000000002F0000L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__41076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__51134 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__51137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group__5__Impl1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__61196 = new BitSet(new long[]{0x0000000000803800L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__61199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Module__Group__6__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__71258 = new BitSet(new long[]{0x0000000000803800L});
    public static final BitSet FOLLOW_rule__Module__Group__8_in_rule__Module__Group__71261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Module_itemsAssignment_7_in_rule__Module__Group__7__Impl1288 = new BitSet(new long[]{0x0000000000003802L});
    public static final BitSet FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__81319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Module__Group__8__Impl1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__01396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__01399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Module__Group_2__0__Impl1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__11458 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__11461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ParametersAssignment_2_1_in_rule__Module__Group_2__1__Impl1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__21518 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__3_in_rule__Module__Group_2__21521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__0_in_rule__Module__Group_2__2__Impl1548 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__3__Impl_in_rule__Module__Group_2__31579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Module__Group_2__3__Impl1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__0__Impl_in_rule__Module__Group_2_2__01646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__1_in_rule__Module__Group_2_2__01649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Module__Group_2_2__0__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__1__Impl_in_rule__Module__Group_2_2__11708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ParametersAssignment_2_2_1_in_rule__Module__Group_2_2__1__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__01769 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__01772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PortsAssignment_4_0_in_rule__Module__Group_4__0__Impl1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__11829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__0_in_rule__Module__Group_4__1__Impl1856 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__0__Impl_in_rule__Module__Group_4_1__01891 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__1_in_rule__Module__Group_4_1__01894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Module__Group_4_1__0__Impl1922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__1__Impl_in_rule__Module__Group_4_1__11953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PortsAssignment_4_1_1_in_rule__Module__Group_4_1__1__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__02014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__02017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__DirectionAssignment_0_in_rule__Port__Group__0__Impl2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__12074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__0__Impl_in_rule__VARIABLE_DECLARATION__Group__02135 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__1_in_rule__VARIABLE_DECLARATION__Group__02138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_rule__VARIABLE_DECLARATION__Group__0__Impl2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__1__Impl_in_rule__VARIABLE_DECLARATION__Group__12194 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__2_in_rule__VARIABLE_DECLARATION__Group__12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__NameAssignment_1_in_rule__VARIABLE_DECLARATION__Group__1__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__2__Impl_in_rule__VARIABLE_DECLARATION__Group__22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__VARIABLE_DECLARATION__Group__2__Impl2282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_12355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_2_12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_02417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_1_12448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModule_item_in_rule__Module__Module_itemsAssignment_72479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment2510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_rule__Port__DirectionAssignment_02541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_DECLARATION__NameAssignment_12603 = new BitSet(new long[]{0x0000000000000002L});

}