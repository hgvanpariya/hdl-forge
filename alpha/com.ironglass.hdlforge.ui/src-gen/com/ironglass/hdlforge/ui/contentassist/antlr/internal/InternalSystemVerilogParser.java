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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BINARY_NUMBER", "RULE_OCTAL_NUMBER", "RULE_HEX_NUMBER", "RULE_DECIMAL_NUMBER", "RULE_DRIVE_STRENGTH", "RULE_INT", "RULE_BINARY_BASE", "RULE_BINARY_DIGIT", "RULE_OCTAL_BASE", "RULE_OCTAL_DIGIT", "RULE_HEX_BASE", "RULE_HEX_DIGIT", "RULE_DECIMAL_BASE", "RULE_X_DIGIT", "RULE_Z_DIGIT", "RULE_STRENGTH0", "RULE_STRENGTH1", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'trireg'", "'supply0'", "'supply1'", "'tri'", "'triand'", "'trior'", "'tri0'", "'tri1'", "'wire'", "'wand'", "'wor'", "'static'", "'automatic'", "'bit'", "'logic'", "'reg'", "'module'", "'macromodule'", "'input'", "'output'", "'inout'", "'ref'", "'('", "')'", "';'", "'endmodule'", "'#('", "','", "'assign'", "'='", "'['", "':'", "']'", "'const'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_HEX_BASE=15;
    public static final int RULE_ANY_OTHER=26;
    public static final int RULE_DECIMAL_NUMBER=8;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_OCTAL_BASE=13;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_BINARY_NUMBER=5;
    public static final int RULE_INT=10;
    public static final int T__50=50;
    public static final int RULE_DRIVE_STRENGTH=9;
    public static final int RULE_X_DIGIT=18;
    public static final int RULE_OCTAL_NUMBER=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int RULE_BINARY_BASE=11;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_BINARY_DIGIT=12;
    public static final int T__49=49;
    public static final int RULE_HEX_DIGIT=16;
    public static final int RULE_SL_COMMENT=24;
    public static final int RULE_Z_DIGIT=19;
    public static final int RULE_HEX_NUMBER=7;
    public static final int RULE_ML_COMMENT=23;
    public static final int RULE_STRENGTH0=20;
    public static final int RULE_STRENGTH1=21;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=22;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=25;
    public static final int RULE_DECIMAL_BASE=17;

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


    // $ANTLR start "entryRuleParameter"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:89:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:90:1: ( ruleParameter EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:91:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter121);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter128); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:98:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:102:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:103:1: ( ( rule__Parameter__NameAssignment ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:103:1: ( ( rule__Parameter__NameAssignment ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:104:1: ( rule__Parameter__NameAssignment )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:105:1: ( rule__Parameter__NameAssignment )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:105:2: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter154);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:117:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:118:1: ( rulePort EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:119:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_rulePort_in_entryRulePort181);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePort188); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:126:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:130:2: ( ( ( rule__Port__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:131:1: ( ( rule__Port__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:131:1: ( ( rule__Port__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:132:1: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:133:1: ( rule__Port__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:133:2: rule__Port__Group__0
            {
            pushFollow(FOLLOW_rule__Port__Group__0_in_rulePort214);
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


    // $ANTLR start "entryRuleMODULE_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:145:1: entryRuleMODULE_ITEM : ruleMODULE_ITEM EOF ;
    public final void entryRuleMODULE_ITEM() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:146:1: ( ruleMODULE_ITEM EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:147:1: ruleMODULE_ITEM EOF
            {
             before(grammarAccess.getMODULE_ITEMRule()); 
            pushFollow(FOLLOW_ruleMODULE_ITEM_in_entryRuleMODULE_ITEM241);
            ruleMODULE_ITEM();

            state._fsp--;

             after(grammarAccess.getMODULE_ITEMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_ITEM248); 

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
    // $ANTLR end "entryRuleMODULE_ITEM"


    // $ANTLR start "ruleMODULE_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:154:1: ruleMODULE_ITEM : ( ruleNON_PORT_MODULE_ITEM ) ;
    public final void ruleMODULE_ITEM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:158:2: ( ( ruleNON_PORT_MODULE_ITEM ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:159:1: ( ruleNON_PORT_MODULE_ITEM )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:159:1: ( ruleNON_PORT_MODULE_ITEM )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:160:1: ruleNON_PORT_MODULE_ITEM
            {
             before(grammarAccess.getMODULE_ITEMAccess().getNON_PORT_MODULE_ITEMParserRuleCall()); 
            pushFollow(FOLLOW_ruleNON_PORT_MODULE_ITEM_in_ruleMODULE_ITEM274);
            ruleNON_PORT_MODULE_ITEM();

            state._fsp--;

             after(grammarAccess.getMODULE_ITEMAccess().getNON_PORT_MODULE_ITEMParserRuleCall()); 

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
    // $ANTLR end "ruleMODULE_ITEM"


    // $ANTLR start "entryRuleNON_PORT_MODULE_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:173:1: entryRuleNON_PORT_MODULE_ITEM : ruleNON_PORT_MODULE_ITEM EOF ;
    public final void entryRuleNON_PORT_MODULE_ITEM() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:174:1: ( ruleNON_PORT_MODULE_ITEM EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:175:1: ruleNON_PORT_MODULE_ITEM EOF
            {
             before(grammarAccess.getNON_PORT_MODULE_ITEMRule()); 
            pushFollow(FOLLOW_ruleNON_PORT_MODULE_ITEM_in_entryRuleNON_PORT_MODULE_ITEM300);
            ruleNON_PORT_MODULE_ITEM();

            state._fsp--;

             after(grammarAccess.getNON_PORT_MODULE_ITEMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNON_PORT_MODULE_ITEM307); 

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
    // $ANTLR end "entryRuleNON_PORT_MODULE_ITEM"


    // $ANTLR start "ruleNON_PORT_MODULE_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:182:1: ruleNON_PORT_MODULE_ITEM : ( ruleMODULE_OR_GENERATE_ITEM ) ;
    public final void ruleNON_PORT_MODULE_ITEM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:186:2: ( ( ruleMODULE_OR_GENERATE_ITEM ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:187:1: ( ruleMODULE_OR_GENERATE_ITEM )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:187:1: ( ruleMODULE_OR_GENERATE_ITEM )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:188:1: ruleMODULE_OR_GENERATE_ITEM
            {
             before(grammarAccess.getNON_PORT_MODULE_ITEMAccess().getMODULE_OR_GENERATE_ITEMParserRuleCall()); 
            pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_ruleNON_PORT_MODULE_ITEM333);
            ruleMODULE_OR_GENERATE_ITEM();

            state._fsp--;

             after(grammarAccess.getNON_PORT_MODULE_ITEMAccess().getMODULE_OR_GENERATE_ITEMParserRuleCall()); 

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
    // $ANTLR end "ruleNON_PORT_MODULE_ITEM"


    // $ANTLR start "entryRuleMODULE_OR_GENERATE_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:201:1: entryRuleMODULE_OR_GENERATE_ITEM : ruleMODULE_OR_GENERATE_ITEM EOF ;
    public final void entryRuleMODULE_OR_GENERATE_ITEM() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:202:1: ( ruleMODULE_OR_GENERATE_ITEM EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:203:1: ruleMODULE_OR_GENERATE_ITEM EOF
            {
             before(grammarAccess.getMODULE_OR_GENERATE_ITEMRule()); 
            pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_entryRuleMODULE_OR_GENERATE_ITEM359);
            ruleMODULE_OR_GENERATE_ITEM();

            state._fsp--;

             after(grammarAccess.getMODULE_OR_GENERATE_ITEMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM366); 

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
    // $ANTLR end "entryRuleMODULE_OR_GENERATE_ITEM"


    // $ANTLR start "ruleMODULE_OR_GENERATE_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:210:1: ruleMODULE_OR_GENERATE_ITEM : ( ruleMODULE_COMMON_ITEM ) ;
    public final void ruleMODULE_OR_GENERATE_ITEM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:214:2: ( ( ruleMODULE_COMMON_ITEM ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:215:1: ( ruleMODULE_COMMON_ITEM )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:215:1: ( ruleMODULE_COMMON_ITEM )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:216:1: ruleMODULE_COMMON_ITEM
            {
             before(grammarAccess.getMODULE_OR_GENERATE_ITEMAccess().getMODULE_COMMON_ITEMParserRuleCall()); 
            pushFollow(FOLLOW_ruleMODULE_COMMON_ITEM_in_ruleMODULE_OR_GENERATE_ITEM392);
            ruleMODULE_COMMON_ITEM();

            state._fsp--;

             after(grammarAccess.getMODULE_OR_GENERATE_ITEMAccess().getMODULE_COMMON_ITEMParserRuleCall()); 

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
    // $ANTLR end "ruleMODULE_OR_GENERATE_ITEM"


    // $ANTLR start "entryRuleMODULE_COMMON_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:229:1: entryRuleMODULE_COMMON_ITEM : ruleMODULE_COMMON_ITEM EOF ;
    public final void entryRuleMODULE_COMMON_ITEM() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:230:1: ( ruleMODULE_COMMON_ITEM EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:231:1: ruleMODULE_COMMON_ITEM EOF
            {
             before(grammarAccess.getMODULE_COMMON_ITEMRule()); 
            pushFollow(FOLLOW_ruleMODULE_COMMON_ITEM_in_entryRuleMODULE_COMMON_ITEM418);
            ruleMODULE_COMMON_ITEM();

            state._fsp--;

             after(grammarAccess.getMODULE_COMMON_ITEMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_COMMON_ITEM425); 

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
    // $ANTLR end "entryRuleMODULE_COMMON_ITEM"


    // $ANTLR start "ruleMODULE_COMMON_ITEM"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:238:1: ruleMODULE_COMMON_ITEM : ( ( rule__MODULE_COMMON_ITEM__Alternatives ) ) ;
    public final void ruleMODULE_COMMON_ITEM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:242:2: ( ( ( rule__MODULE_COMMON_ITEM__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:243:1: ( ( rule__MODULE_COMMON_ITEM__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:243:1: ( ( rule__MODULE_COMMON_ITEM__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:244:1: ( rule__MODULE_COMMON_ITEM__Alternatives )
            {
             before(grammarAccess.getMODULE_COMMON_ITEMAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:245:1: ( rule__MODULE_COMMON_ITEM__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:245:2: rule__MODULE_COMMON_ITEM__Alternatives
            {
            pushFollow(FOLLOW_rule__MODULE_COMMON_ITEM__Alternatives_in_ruleMODULE_COMMON_ITEM451);
            rule__MODULE_COMMON_ITEM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMODULE_COMMON_ITEMAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMODULE_COMMON_ITEM"


    // $ANTLR start "entryRuleCONTINUOUS_ASSIGN"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:257:1: entryRuleCONTINUOUS_ASSIGN : ruleCONTINUOUS_ASSIGN EOF ;
    public final void entryRuleCONTINUOUS_ASSIGN() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:258:1: ( ruleCONTINUOUS_ASSIGN EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:259:1: ruleCONTINUOUS_ASSIGN EOF
            {
             before(grammarAccess.getCONTINUOUS_ASSIGNRule()); 
            pushFollow(FOLLOW_ruleCONTINUOUS_ASSIGN_in_entryRuleCONTINUOUS_ASSIGN478);
            ruleCONTINUOUS_ASSIGN();

            state._fsp--;

             after(grammarAccess.getCONTINUOUS_ASSIGNRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCONTINUOUS_ASSIGN485); 

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
    // $ANTLR end "entryRuleCONTINUOUS_ASSIGN"


    // $ANTLR start "ruleCONTINUOUS_ASSIGN"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:266:1: ruleCONTINUOUS_ASSIGN : ( ( rule__CONTINUOUS_ASSIGN__Group__0 ) ) ;
    public final void ruleCONTINUOUS_ASSIGN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:270:2: ( ( ( rule__CONTINUOUS_ASSIGN__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:271:1: ( ( rule__CONTINUOUS_ASSIGN__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:271:1: ( ( rule__CONTINUOUS_ASSIGN__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:272:1: ( rule__CONTINUOUS_ASSIGN__Group__0 )
            {
             before(grammarAccess.getCONTINUOUS_ASSIGNAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:273:1: ( rule__CONTINUOUS_ASSIGN__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:273:2: rule__CONTINUOUS_ASSIGN__Group__0
            {
            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__0_in_ruleCONTINUOUS_ASSIGN511);
            rule__CONTINUOUS_ASSIGN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCONTINUOUS_ASSIGNAccess().getGroup()); 

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
    // $ANTLR end "ruleCONTINUOUS_ASSIGN"


    // $ANTLR start "entryRuleLIST_OF_NET_ASSIGNMENTS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:285:1: entryRuleLIST_OF_NET_ASSIGNMENTS : ruleLIST_OF_NET_ASSIGNMENTS EOF ;
    public final void entryRuleLIST_OF_NET_ASSIGNMENTS() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:286:1: ( ruleLIST_OF_NET_ASSIGNMENTS EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:287:1: ruleLIST_OF_NET_ASSIGNMENTS EOF
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSRule()); 
            pushFollow(FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_entryRuleLIST_OF_NET_ASSIGNMENTS538);
            ruleLIST_OF_NET_ASSIGNMENTS();

            state._fsp--;

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIST_OF_NET_ASSIGNMENTS545); 

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
    // $ANTLR end "entryRuleLIST_OF_NET_ASSIGNMENTS"


    // $ANTLR start "ruleLIST_OF_NET_ASSIGNMENTS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:294:1: ruleLIST_OF_NET_ASSIGNMENTS : ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0 ) ) ;
    public final void ruleLIST_OF_NET_ASSIGNMENTS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:298:2: ( ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:299:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:299:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:300:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0 )
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:301:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:301:2: rule__LIST_OF_NET_ASSIGNMENTS__Group__0
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__0_in_ruleLIST_OF_NET_ASSIGNMENTS571);
            rule__LIST_OF_NET_ASSIGNMENTS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getGroup()); 

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
    // $ANTLR end "ruleLIST_OF_NET_ASSIGNMENTS"


    // $ANTLR start "entryRuleNET_ASSIGNMENT"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:313:1: entryRuleNET_ASSIGNMENT : ruleNET_ASSIGNMENT EOF ;
    public final void entryRuleNET_ASSIGNMENT() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:314:1: ( ruleNET_ASSIGNMENT EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:315:1: ruleNET_ASSIGNMENT EOF
            {
             before(grammarAccess.getNET_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_ruleNET_ASSIGNMENT_in_entryRuleNET_ASSIGNMENT598);
            ruleNET_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getNET_ASSIGNMENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_ASSIGNMENT605); 

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
    // $ANTLR end "entryRuleNET_ASSIGNMENT"


    // $ANTLR start "ruleNET_ASSIGNMENT"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:322:1: ruleNET_ASSIGNMENT : ( ( rule__NET_ASSIGNMENT__Group__0 ) ) ;
    public final void ruleNET_ASSIGNMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:326:2: ( ( ( rule__NET_ASSIGNMENT__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:327:1: ( ( rule__NET_ASSIGNMENT__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:327:1: ( ( rule__NET_ASSIGNMENT__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:328:1: ( rule__NET_ASSIGNMENT__Group__0 )
            {
             before(grammarAccess.getNET_ASSIGNMENTAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:329:1: ( rule__NET_ASSIGNMENT__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:329:2: rule__NET_ASSIGNMENT__Group__0
            {
            pushFollow(FOLLOW_rule__NET_ASSIGNMENT__Group__0_in_ruleNET_ASSIGNMENT631);
            rule__NET_ASSIGNMENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNET_ASSIGNMENTAccess().getGroup()); 

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
    // $ANTLR end "ruleNET_ASSIGNMENT"


    // $ANTLR start "entryRuleNET_LVALUE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:341:1: entryRuleNET_LVALUE : ruleNET_LVALUE EOF ;
    public final void entryRuleNET_LVALUE() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:342:1: ( ruleNET_LVALUE EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:343:1: ruleNET_LVALUE EOF
            {
             before(grammarAccess.getNET_LVALUERule()); 
            pushFollow(FOLLOW_ruleNET_LVALUE_in_entryRuleNET_LVALUE658);
            ruleNET_LVALUE();

            state._fsp--;

             after(grammarAccess.getNET_LVALUERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_LVALUE665); 

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
    // $ANTLR end "entryRuleNET_LVALUE"


    // $ANTLR start "ruleNET_LVALUE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:350:1: ruleNET_LVALUE : ( rulePS_OR_HIERARCHICAL_NET_IDENTIFIER ) ;
    public final void ruleNET_LVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:354:2: ( ( rulePS_OR_HIERARCHICAL_NET_IDENTIFIER ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:355:1: ( rulePS_OR_HIERARCHICAL_NET_IDENTIFIER )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:355:1: ( rulePS_OR_HIERARCHICAL_NET_IDENTIFIER )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:356:1: rulePS_OR_HIERARCHICAL_NET_IDENTIFIER
            {
             before(grammarAccess.getNET_LVALUEAccess().getPS_OR_HIERARCHICAL_NET_IDENTIFIERParserRuleCall()); 
            pushFollow(FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_ruleNET_LVALUE691);
            rulePS_OR_HIERARCHICAL_NET_IDENTIFIER();

            state._fsp--;

             after(grammarAccess.getNET_LVALUEAccess().getPS_OR_HIERARCHICAL_NET_IDENTIFIERParserRuleCall()); 

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
    // $ANTLR end "ruleNET_LVALUE"


    // $ANTLR start "entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:369:1: entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER : rulePS_OR_HIERARCHICAL_NET_IDENTIFIER EOF ;
    public final void entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:370:1: ( rulePS_OR_HIERARCHICAL_NET_IDENTIFIER EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:371:1: rulePS_OR_HIERARCHICAL_NET_IDENTIFIER EOF
            {
             before(grammarAccess.getPS_OR_HIERARCHICAL_NET_IDENTIFIERRule()); 
            pushFollow(FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER717);
            rulePS_OR_HIERARCHICAL_NET_IDENTIFIER();

            state._fsp--;

             after(grammarAccess.getPS_OR_HIERARCHICAL_NET_IDENTIFIERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER724); 

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
    // $ANTLR end "entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER"


    // $ANTLR start "rulePS_OR_HIERARCHICAL_NET_IDENTIFIER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:378:1: rulePS_OR_HIERARCHICAL_NET_IDENTIFIER : ( ruleNET_IDENTIFIER ) ;
    public final void rulePS_OR_HIERARCHICAL_NET_IDENTIFIER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:382:2: ( ( ruleNET_IDENTIFIER ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:383:1: ( ruleNET_IDENTIFIER )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:383:1: ( ruleNET_IDENTIFIER )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:384:1: ruleNET_IDENTIFIER
            {
             before(grammarAccess.getPS_OR_HIERARCHICAL_NET_IDENTIFIERAccess().getNET_IDENTIFIERParserRuleCall()); 
            pushFollow(FOLLOW_ruleNET_IDENTIFIER_in_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER750);
            ruleNET_IDENTIFIER();

            state._fsp--;

             after(grammarAccess.getPS_OR_HIERARCHICAL_NET_IDENTIFIERAccess().getNET_IDENTIFIERParserRuleCall()); 

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
    // $ANTLR end "rulePS_OR_HIERARCHICAL_NET_IDENTIFIER"


    // $ANTLR start "entryRuleNET_IDENTIFIER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:397:1: entryRuleNET_IDENTIFIER : ruleNET_IDENTIFIER EOF ;
    public final void entryRuleNET_IDENTIFIER() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:398:1: ( ruleNET_IDENTIFIER EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:399:1: ruleNET_IDENTIFIER EOF
            {
             before(grammarAccess.getNET_IDENTIFIERRule()); 
            pushFollow(FOLLOW_ruleNET_IDENTIFIER_in_entryRuleNET_IDENTIFIER776);
            ruleNET_IDENTIFIER();

            state._fsp--;

             after(grammarAccess.getNET_IDENTIFIERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_IDENTIFIER783); 

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
    // $ANTLR end "entryRuleNET_IDENTIFIER"


    // $ANTLR start "ruleNET_IDENTIFIER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:406:1: ruleNET_IDENTIFIER : ( ruleSIMPLE_IDENTIFIER ) ;
    public final void ruleNET_IDENTIFIER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:410:2: ( ( ruleSIMPLE_IDENTIFIER ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:411:1: ( ruleSIMPLE_IDENTIFIER )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:411:1: ( ruleSIMPLE_IDENTIFIER )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:412:1: ruleSIMPLE_IDENTIFIER
            {
             before(grammarAccess.getNET_IDENTIFIERAccess().getSIMPLE_IDENTIFIERParserRuleCall()); 
            pushFollow(FOLLOW_ruleSIMPLE_IDENTIFIER_in_ruleNET_IDENTIFIER809);
            ruleSIMPLE_IDENTIFIER();

            state._fsp--;

             after(grammarAccess.getNET_IDENTIFIERAccess().getSIMPLE_IDENTIFIERParserRuleCall()); 

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
    // $ANTLR end "ruleNET_IDENTIFIER"


    // $ANTLR start "entryRuleSIMPLE_IDENTIFIER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:425:1: entryRuleSIMPLE_IDENTIFIER : ruleSIMPLE_IDENTIFIER EOF ;
    public final void entryRuleSIMPLE_IDENTIFIER() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:426:1: ( ruleSIMPLE_IDENTIFIER EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:427:1: ruleSIMPLE_IDENTIFIER EOF
            {
             before(grammarAccess.getSIMPLE_IDENTIFIERRule()); 
            pushFollow(FOLLOW_ruleSIMPLE_IDENTIFIER_in_entryRuleSIMPLE_IDENTIFIER835);
            ruleSIMPLE_IDENTIFIER();

            state._fsp--;

             after(grammarAccess.getSIMPLE_IDENTIFIERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSIMPLE_IDENTIFIER842); 

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
    // $ANTLR end "entryRuleSIMPLE_IDENTIFIER"


    // $ANTLR start "ruleSIMPLE_IDENTIFIER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:434:1: ruleSIMPLE_IDENTIFIER : ( RULE_ID ) ;
    public final void ruleSIMPLE_IDENTIFIER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:438:2: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:439:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:439:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:440:1: RULE_ID
            {
             before(grammarAccess.getSIMPLE_IDENTIFIERAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSIMPLE_IDENTIFIER868); 
             after(grammarAccess.getSIMPLE_IDENTIFIERAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleSIMPLE_IDENTIFIER"


    // $ANTLR start "entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:453:1: entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION : ruleMODULE_OR_GENERATE_ITEM_DECLARATION EOF ;
    public final void entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:454:1: ( ruleMODULE_OR_GENERATE_ITEM_DECLARATION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:455:1: ruleMODULE_OR_GENERATE_ITEM_DECLARATION EOF
            {
             before(grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION894);
            ruleMODULE_OR_GENERATE_ITEM_DECLARATION();

            state._fsp--;

             after(grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION901); 

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
    // $ANTLR end "entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "ruleMODULE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:462:1: ruleMODULE_OR_GENERATE_ITEM_DECLARATION : ( rulePACKAGE_OR_GENERATE_ITEM_DECLARATION ) ;
    public final void ruleMODULE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:466:2: ( ( rulePACKAGE_OR_GENERATE_ITEM_DECLARATION ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:467:1: ( rulePACKAGE_OR_GENERATE_ITEM_DECLARATION )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:467:1: ( rulePACKAGE_OR_GENERATE_ITEM_DECLARATION )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:468:1: rulePACKAGE_OR_GENERATE_ITEM_DECLARATION
            {
             before(grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONAccess().getPACKAGE_OR_GENERATE_ITEM_DECLARATIONParserRuleCall()); 
            pushFollow(FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_ruleMODULE_OR_GENERATE_ITEM_DECLARATION927);
            rulePACKAGE_OR_GENERATE_ITEM_DECLARATION();

            state._fsp--;

             after(grammarAccess.getMODULE_OR_GENERATE_ITEM_DECLARATIONAccess().getPACKAGE_OR_GENERATE_ITEM_DECLARATIONParserRuleCall()); 

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
    // $ANTLR end "ruleMODULE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:481:1: entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION : rulePACKAGE_OR_GENERATE_ITEM_DECLARATION EOF ;
    public final void entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:482:1: ( rulePACKAGE_OR_GENERATE_ITEM_DECLARATION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:483:1: rulePACKAGE_OR_GENERATE_ITEM_DECLARATION EOF
            {
             before(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONRule()); 
            pushFollow(FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION953);
            rulePACKAGE_OR_GENERATE_ITEM_DECLARATION();

            state._fsp--;

             after(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION960); 

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
    // $ANTLR end "entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "rulePACKAGE_OR_GENERATE_ITEM_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:490:1: rulePACKAGE_OR_GENERATE_ITEM_DECLARATION : ( ( rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives ) ) ;
    public final void rulePACKAGE_OR_GENERATE_ITEM_DECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:494:2: ( ( ( rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:495:1: ( ( rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:495:1: ( ( rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:496:1: ( rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives )
            {
             before(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:497:1: ( rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:497:2: rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives
            {
            pushFollow(FOLLOW_rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives_in_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION986);
            rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getAlternatives()); 

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
    // $ANTLR end "rulePACKAGE_OR_GENERATE_ITEM_DECLARATION"


    // $ANTLR start "entryRuleNET_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:509:1: entryRuleNET_DECLARATION : ruleNET_DECLARATION EOF ;
    public final void entryRuleNET_DECLARATION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:510:1: ( ruleNET_DECLARATION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:511:1: ruleNET_DECLARATION EOF
            {
             before(grammarAccess.getNET_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleNET_DECLARATION_in_entryRuleNET_DECLARATION1013);
            ruleNET_DECLARATION();

            state._fsp--;

             after(grammarAccess.getNET_DECLARATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_DECLARATION1020); 

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
    // $ANTLR end "entryRuleNET_DECLARATION"


    // $ANTLR start "ruleNET_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:518:1: ruleNET_DECLARATION : ( ( rule__NET_DECLARATION__Group__0 ) ) ;
    public final void ruleNET_DECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:522:2: ( ( ( rule__NET_DECLARATION__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:523:1: ( ( rule__NET_DECLARATION__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:523:1: ( ( rule__NET_DECLARATION__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:524:1: ( rule__NET_DECLARATION__Group__0 )
            {
             before(grammarAccess.getNET_DECLARATIONAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:525:1: ( rule__NET_DECLARATION__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:525:2: rule__NET_DECLARATION__Group__0
            {
            pushFollow(FOLLOW_rule__NET_DECLARATION__Group__0_in_ruleNET_DECLARATION1046);
            rule__NET_DECLARATION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNET_DECLARATIONAccess().getGroup()); 

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
    // $ANTLR end "ruleNET_DECLARATION"


    // $ANTLR start "entryRuleLIST_OF_NET_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:537:1: entryRuleLIST_OF_NET_DECL_ASSIGNMENTS : ruleLIST_OF_NET_DECL_ASSIGNMENTS EOF ;
    public final void entryRuleLIST_OF_NET_DECL_ASSIGNMENTS() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:538:1: ( ruleLIST_OF_NET_DECL_ASSIGNMENTS EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:539:1: ruleLIST_OF_NET_DECL_ASSIGNMENTS EOF
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSRule()); 
            pushFollow(FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS1073);
            ruleLIST_OF_NET_DECL_ASSIGNMENTS();

            state._fsp--;

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS1080); 

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
    // $ANTLR end "entryRuleLIST_OF_NET_DECL_ASSIGNMENTS"


    // $ANTLR start "ruleLIST_OF_NET_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:546:1: ruleLIST_OF_NET_DECL_ASSIGNMENTS : ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 ) ) ;
    public final void ruleLIST_OF_NET_DECL_ASSIGNMENTS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:550:2: ( ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:551:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:551:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:552:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 )
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:553:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:553:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS1106);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getGroup()); 

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
    // $ANTLR end "ruleLIST_OF_NET_DECL_ASSIGNMENTS"


    // $ANTLR start "entryRuleNET_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:565:1: entryRuleNET_DECL_ASSIGNMENT : ruleNET_DECL_ASSIGNMENT EOF ;
    public final void entryRuleNET_DECL_ASSIGNMENT() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:566:1: ( ruleNET_DECL_ASSIGNMENT EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:567:1: ruleNET_DECL_ASSIGNMENT EOF
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_ruleNET_DECL_ASSIGNMENT_in_entryRuleNET_DECL_ASSIGNMENT1133);
            ruleNET_DECL_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getNET_DECL_ASSIGNMENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_DECL_ASSIGNMENT1140); 

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
    // $ANTLR end "entryRuleNET_DECL_ASSIGNMENT"


    // $ANTLR start "ruleNET_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:574:1: ruleNET_DECL_ASSIGNMENT : ( ( rule__NET_DECL_ASSIGNMENT__Group__0 ) ) ;
    public final void ruleNET_DECL_ASSIGNMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:578:2: ( ( ( rule__NET_DECL_ASSIGNMENT__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:579:1: ( ( rule__NET_DECL_ASSIGNMENT__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:579:1: ( ( rule__NET_DECL_ASSIGNMENT__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:580:1: ( rule__NET_DECL_ASSIGNMENT__Group__0 )
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:581:1: ( rule__NET_DECL_ASSIGNMENT__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:581:2: rule__NET_DECL_ASSIGNMENT__Group__0
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__0_in_ruleNET_DECL_ASSIGNMENT1166);
            rule__NET_DECL_ASSIGNMENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getGroup()); 

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
    // $ANTLR end "ruleNET_DECL_ASSIGNMENT"


    // $ANTLR start "entryRuleUNPACKED_DIMENSIONS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:593:1: entryRuleUNPACKED_DIMENSIONS : ruleUNPACKED_DIMENSIONS EOF ;
    public final void entryRuleUNPACKED_DIMENSIONS() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:594:1: ( ruleUNPACKED_DIMENSIONS EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:595:1: ruleUNPACKED_DIMENSIONS EOF
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSRule()); 
            pushFollow(FOLLOW_ruleUNPACKED_DIMENSIONS_in_entryRuleUNPACKED_DIMENSIONS1193);
            ruleUNPACKED_DIMENSIONS();

            state._fsp--;

             after(grammarAccess.getUNPACKED_DIMENSIONSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUNPACKED_DIMENSIONS1200); 

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
    // $ANTLR end "entryRuleUNPACKED_DIMENSIONS"


    // $ANTLR start "ruleUNPACKED_DIMENSIONS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:602:1: ruleUNPACKED_DIMENSIONS : ( ( rule__UNPACKED_DIMENSIONS__Group__0 ) ) ;
    public final void ruleUNPACKED_DIMENSIONS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:606:2: ( ( ( rule__UNPACKED_DIMENSIONS__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:607:1: ( ( rule__UNPACKED_DIMENSIONS__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:607:1: ( ( rule__UNPACKED_DIMENSIONS__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:608:1: ( rule__UNPACKED_DIMENSIONS__Group__0 )
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:609:1: ( rule__UNPACKED_DIMENSIONS__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:609:2: rule__UNPACKED_DIMENSIONS__Group__0
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__0_in_ruleUNPACKED_DIMENSIONS1226);
            rule__UNPACKED_DIMENSIONS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getGroup()); 

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
    // $ANTLR end "ruleUNPACKED_DIMENSIONS"


    // $ANTLR start "entryRuleNET_TYPE_OR_TRIREG"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:621:1: entryRuleNET_TYPE_OR_TRIREG : ruleNET_TYPE_OR_TRIREG EOF ;
    public final void entryRuleNET_TYPE_OR_TRIREG() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:622:1: ( ruleNET_TYPE_OR_TRIREG EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:623:1: ruleNET_TYPE_OR_TRIREG EOF
            {
             before(grammarAccess.getNET_TYPE_OR_TRIREGRule()); 
            pushFollow(FOLLOW_ruleNET_TYPE_OR_TRIREG_in_entryRuleNET_TYPE_OR_TRIREG1253);
            ruleNET_TYPE_OR_TRIREG();

            state._fsp--;

             after(grammarAccess.getNET_TYPE_OR_TRIREGRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_TYPE_OR_TRIREG1260); 

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
    // $ANTLR end "entryRuleNET_TYPE_OR_TRIREG"


    // $ANTLR start "ruleNET_TYPE_OR_TRIREG"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:630:1: ruleNET_TYPE_OR_TRIREG : ( ( rule__NET_TYPE_OR_TRIREG__Alternatives ) ) ;
    public final void ruleNET_TYPE_OR_TRIREG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:634:2: ( ( ( rule__NET_TYPE_OR_TRIREG__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:635:1: ( ( rule__NET_TYPE_OR_TRIREG__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:635:1: ( ( rule__NET_TYPE_OR_TRIREG__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:636:1: ( rule__NET_TYPE_OR_TRIREG__Alternatives )
            {
             before(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:637:1: ( rule__NET_TYPE_OR_TRIREG__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:637:2: rule__NET_TYPE_OR_TRIREG__Alternatives
            {
            pushFollow(FOLLOW_rule__NET_TYPE_OR_TRIREG__Alternatives_in_ruleNET_TYPE_OR_TRIREG1286);
            rule__NET_TYPE_OR_TRIREG__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNET_TYPE_OR_TRIREG"


    // $ANTLR start "entryRuleNET_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:649:1: entryRuleNET_TYPE : ruleNET_TYPE EOF ;
    public final void entryRuleNET_TYPE() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:650:1: ( ruleNET_TYPE EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:651:1: ruleNET_TYPE EOF
            {
             before(grammarAccess.getNET_TYPERule()); 
            pushFollow(FOLLOW_ruleNET_TYPE_in_entryRuleNET_TYPE1313);
            ruleNET_TYPE();

            state._fsp--;

             after(grammarAccess.getNET_TYPERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNET_TYPE1320); 

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
    // $ANTLR end "entryRuleNET_TYPE"


    // $ANTLR start "ruleNET_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:658:1: ruleNET_TYPE : ( ( rule__NET_TYPE__Alternatives ) ) ;
    public final void ruleNET_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:662:2: ( ( ( rule__NET_TYPE__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:663:1: ( ( rule__NET_TYPE__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:663:1: ( ( rule__NET_TYPE__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:664:1: ( rule__NET_TYPE__Alternatives )
            {
             before(grammarAccess.getNET_TYPEAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:665:1: ( rule__NET_TYPE__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:665:2: rule__NET_TYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__NET_TYPE__Alternatives_in_ruleNET_TYPE1346);
            rule__NET_TYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNET_TYPEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNET_TYPE"


    // $ANTLR start "entryRuleDATA_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:677:1: entryRuleDATA_DECLARATION : ruleDATA_DECLARATION EOF ;
    public final void entryRuleDATA_DECLARATION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:678:1: ( ruleDATA_DECLARATION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:679:1: ruleDATA_DECLARATION EOF
            {
             before(grammarAccess.getDATA_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleDATA_DECLARATION_in_entryRuleDATA_DECLARATION1373);
            ruleDATA_DECLARATION();

            state._fsp--;

             after(grammarAccess.getDATA_DECLARATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATA_DECLARATION1380); 

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
    // $ANTLR end "entryRuleDATA_DECLARATION"


    // $ANTLR start "ruleDATA_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:686:1: ruleDATA_DECLARATION : ( ( rule__DATA_DECLARATION__Group__0 ) ) ;
    public final void ruleDATA_DECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:690:2: ( ( ( rule__DATA_DECLARATION__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:691:1: ( ( rule__DATA_DECLARATION__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:691:1: ( ( rule__DATA_DECLARATION__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:692:1: ( rule__DATA_DECLARATION__Group__0 )
            {
             before(grammarAccess.getDATA_DECLARATIONAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:693:1: ( rule__DATA_DECLARATION__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:693:2: rule__DATA_DECLARATION__Group__0
            {
            pushFollow(FOLLOW_rule__DATA_DECLARATION__Group__0_in_ruleDATA_DECLARATION1406);
            rule__DATA_DECLARATION__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATA_DECLARATIONAccess().getGroup()); 

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
    // $ANTLR end "ruleDATA_DECLARATION"


    // $ANTLR start "entryRuleLIFETIME"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:705:1: entryRuleLIFETIME : ruleLIFETIME EOF ;
    public final void entryRuleLIFETIME() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:706:1: ( ruleLIFETIME EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:707:1: ruleLIFETIME EOF
            {
             before(grammarAccess.getLIFETIMERule()); 
            pushFollow(FOLLOW_ruleLIFETIME_in_entryRuleLIFETIME1433);
            ruleLIFETIME();

            state._fsp--;

             after(grammarAccess.getLIFETIMERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIFETIME1440); 

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
    // $ANTLR end "entryRuleLIFETIME"


    // $ANTLR start "ruleLIFETIME"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:714:1: ruleLIFETIME : ( ( rule__LIFETIME__Alternatives ) ) ;
    public final void ruleLIFETIME() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:718:2: ( ( ( rule__LIFETIME__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:719:1: ( ( rule__LIFETIME__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:719:1: ( ( rule__LIFETIME__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:720:1: ( rule__LIFETIME__Alternatives )
            {
             before(grammarAccess.getLIFETIMEAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:721:1: ( rule__LIFETIME__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:721:2: rule__LIFETIME__Alternatives
            {
            pushFollow(FOLLOW_rule__LIFETIME__Alternatives_in_ruleLIFETIME1466);
            rule__LIFETIME__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLIFETIMEAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLIFETIME"


    // $ANTLR start "entryRuleVARIABLE_DECLARATION"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:733:1: entryRuleVARIABLE_DECLARATION : ruleVARIABLE_DECLARATION EOF ;
    public final void entryRuleVARIABLE_DECLARATION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:734:1: ( ruleVARIABLE_DECLARATION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:735:1: ruleVARIABLE_DECLARATION EOF
            {
             before(grammarAccess.getVARIABLE_DECLARATIONRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION1493);
            ruleVARIABLE_DECLARATION();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECLARATIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION1500); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:742:1: ruleVARIABLE_DECLARATION : ( ( rule__VARIABLE_DECLARATION__Group__0 ) ) ;
    public final void ruleVARIABLE_DECLARATION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:746:2: ( ( ( rule__VARIABLE_DECLARATION__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:747:1: ( ( rule__VARIABLE_DECLARATION__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:747:1: ( ( rule__VARIABLE_DECLARATION__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:748:1: ( rule__VARIABLE_DECLARATION__Group__0 )
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:749:1: ( rule__VARIABLE_DECLARATION__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:749:2: rule__VARIABLE_DECLARATION__Group__0
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__0_in_ruleVARIABLE_DECLARATION1526);
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


    // $ANTLR start "entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:761:1: entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS : ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS EOF ;
    public final void entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:762:1: ( ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:763:1: ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS EOF
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSRule()); 
            pushFollow(FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS1553);
            ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

            state._fsp--;

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS1560); 

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
    // $ANTLR end "entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"


    // $ANTLR start "ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:770:1: ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS : ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 ) ) ;
    public final void ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:774:2: ( ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:775:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:775:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:776:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 )
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:777:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:777:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS1586);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getGroup()); 

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
    // $ANTLR end "ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS"


    // $ANTLR start "entryRuleVARIABLE_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:789:1: entryRuleVARIABLE_DECL_ASSIGNMENT : ruleVARIABLE_DECL_ASSIGNMENT EOF ;
    public final void entryRuleVARIABLE_DECL_ASSIGNMENT() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:790:1: ( ruleVARIABLE_DECL_ASSIGNMENT EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:791:1: ruleVARIABLE_DECL_ASSIGNMENT EOF
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_entryRuleVARIABLE_DECL_ASSIGNMENT1613);
            ruleVARIABLE_DECL_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_DECL_ASSIGNMENT1620); 

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
    // $ANTLR end "entryRuleVARIABLE_DECL_ASSIGNMENT"


    // $ANTLR start "ruleVARIABLE_DECL_ASSIGNMENT"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:798:1: ruleVARIABLE_DECL_ASSIGNMENT : ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0 ) ) ;
    public final void ruleVARIABLE_DECL_ASSIGNMENT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:802:2: ( ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:803:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:803:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:804:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0 )
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getGroup()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:805:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:805:2: rule__VARIABLE_DECL_ASSIGNMENT__Group__0
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__0_in_ruleVARIABLE_DECL_ASSIGNMENT1646);
            rule__VARIABLE_DECL_ASSIGNMENT__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getGroup()); 

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
    // $ANTLR end "ruleVARIABLE_DECL_ASSIGNMENT"


    // $ANTLR start "entryRuleDATA_TYPE"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:817:1: entryRuleDATA_TYPE : ruleDATA_TYPE EOF ;
    public final void entryRuleDATA_TYPE() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:818:1: ( ruleDATA_TYPE EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:819:1: ruleDATA_TYPE EOF
            {
             before(grammarAccess.getDATA_TYPERule()); 
            pushFollow(FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE1673);
            ruleDATA_TYPE();

            state._fsp--;

             after(grammarAccess.getDATA_TYPERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATA_TYPE1680); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:826:1: ruleDATA_TYPE : ( ruleINTEGER_VECTOR_TYPE ) ;
    public final void ruleDATA_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:830:2: ( ( ruleINTEGER_VECTOR_TYPE ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:831:1: ( ruleINTEGER_VECTOR_TYPE )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:831:1: ( ruleINTEGER_VECTOR_TYPE )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:832:1: ruleINTEGER_VECTOR_TYPE
            {
             before(grammarAccess.getDATA_TYPEAccess().getINTEGER_VECTOR_TYPEParserRuleCall()); 
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE1706);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:845:1: entryRuleINTEGER_VECTOR_TYPE : ruleINTEGER_VECTOR_TYPE EOF ;
    public final void entryRuleINTEGER_VECTOR_TYPE() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:846:1: ( ruleINTEGER_VECTOR_TYPE EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:847:1: ruleINTEGER_VECTOR_TYPE EOF
            {
             before(grammarAccess.getINTEGER_VECTOR_TYPERule()); 
            pushFollow(FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE1732);
            ruleINTEGER_VECTOR_TYPE();

            state._fsp--;

             after(grammarAccess.getINTEGER_VECTOR_TYPERule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE1739); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:854:1: ruleINTEGER_VECTOR_TYPE : ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) ) ;
    public final void ruleINTEGER_VECTOR_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:858:2: ( ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:859:1: ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:859:1: ( ( rule__INTEGER_VECTOR_TYPE__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:860:1: ( rule__INTEGER_VECTOR_TYPE__Alternatives )
            {
             before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:861:1: ( rule__INTEGER_VECTOR_TYPE__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:861:2: rule__INTEGER_VECTOR_TYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__INTEGER_VECTOR_TYPE__Alternatives_in_ruleINTEGER_VECTOR_TYPE1765);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:873:1: entryRuleMODULE_KEYWORD : ruleMODULE_KEYWORD EOF ;
    public final void entryRuleMODULE_KEYWORD() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:874:1: ( ruleMODULE_KEYWORD EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:875:1: ruleMODULE_KEYWORD EOF
            {
             before(grammarAccess.getMODULE_KEYWORDRule()); 
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD1792);
            ruleMODULE_KEYWORD();

            state._fsp--;

             after(grammarAccess.getMODULE_KEYWORDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMODULE_KEYWORD1799); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:882:1: ruleMODULE_KEYWORD : ( ( rule__MODULE_KEYWORD__Alternatives ) ) ;
    public final void ruleMODULE_KEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:886:2: ( ( ( rule__MODULE_KEYWORD__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:887:1: ( ( rule__MODULE_KEYWORD__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:887:1: ( ( rule__MODULE_KEYWORD__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:888:1: ( rule__MODULE_KEYWORD__Alternatives )
            {
             before(grammarAccess.getMODULE_KEYWORDAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:889:1: ( rule__MODULE_KEYWORD__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:889:2: rule__MODULE_KEYWORD__Alternatives
            {
            pushFollow(FOLLOW_rule__MODULE_KEYWORD__Alternatives_in_ruleMODULE_KEYWORD1825);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:901:1: entryRulePORT_DIRECTION : rulePORT_DIRECTION EOF ;
    public final void entryRulePORT_DIRECTION() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:902:1: ( rulePORT_DIRECTION EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:903:1: rulePORT_DIRECTION EOF
            {
             before(grammarAccess.getPORT_DIRECTIONRule()); 
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION1852);
            rulePORT_DIRECTION();

            state._fsp--;

             after(grammarAccess.getPORT_DIRECTIONRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePORT_DIRECTION1859); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:910:1: rulePORT_DIRECTION : ( ( rule__PORT_DIRECTION__Alternatives ) ) ;
    public final void rulePORT_DIRECTION() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:914:2: ( ( ( rule__PORT_DIRECTION__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:915:1: ( ( rule__PORT_DIRECTION__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:915:1: ( ( rule__PORT_DIRECTION__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:916:1: ( rule__PORT_DIRECTION__Alternatives )
            {
             before(grammarAccess.getPORT_DIRECTIONAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:917:1: ( rule__PORT_DIRECTION__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:917:2: rule__PORT_DIRECTION__Alternatives
            {
            pushFollow(FOLLOW_rule__PORT_DIRECTION__Alternatives_in_rulePORT_DIRECTION1885);
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


    // $ANTLR start "entryRuleNUMBER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:929:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:930:1: ( ruleNUMBER EOF )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:931:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1912);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1919); 

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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:938:1: ruleNUMBER : ( ( rule__NUMBER__Alternatives ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:942:2: ( ( ( rule__NUMBER__Alternatives ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:943:1: ( ( rule__NUMBER__Alternatives ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:943:1: ( ( rule__NUMBER__Alternatives ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:944:1: ( rule__NUMBER__Alternatives )
            {
             before(grammarAccess.getNUMBERAccess().getAlternatives()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:945:1: ( rule__NUMBER__Alternatives )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:945:2: rule__NUMBER__Alternatives
            {
            pushFollow(FOLLOW_rule__NUMBER__Alternatives_in_ruleNUMBER1945);
            rule__NUMBER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "rule__MODULE_COMMON_ITEM__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:957:1: rule__MODULE_COMMON_ITEM__Alternatives : ( ( ruleMODULE_OR_GENERATE_ITEM_DECLARATION ) | ( ruleCONTINUOUS_ASSIGN ) );
    public final void rule__MODULE_COMMON_ITEM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:961:1: ( ( ruleMODULE_OR_GENERATE_ITEM_DECLARATION ) | ( ruleCONTINUOUS_ASSIGN ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=27 && LA1_0<=42)||LA1_0==60) ) {
                alt1=1;
            }
            else if ( (LA1_0==55) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:962:1: ( ruleMODULE_OR_GENERATE_ITEM_DECLARATION )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:962:1: ( ruleMODULE_OR_GENERATE_ITEM_DECLARATION )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:963:1: ruleMODULE_OR_GENERATE_ITEM_DECLARATION
                    {
                     before(grammarAccess.getMODULE_COMMON_ITEMAccess().getMODULE_OR_GENERATE_ITEM_DECLARATIONParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_rule__MODULE_COMMON_ITEM__Alternatives1981);
                    ruleMODULE_OR_GENERATE_ITEM_DECLARATION();

                    state._fsp--;

                     after(grammarAccess.getMODULE_COMMON_ITEMAccess().getMODULE_OR_GENERATE_ITEM_DECLARATIONParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:968:6: ( ruleCONTINUOUS_ASSIGN )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:968:6: ( ruleCONTINUOUS_ASSIGN )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:969:1: ruleCONTINUOUS_ASSIGN
                    {
                     before(grammarAccess.getMODULE_COMMON_ITEMAccess().getCONTINUOUS_ASSIGNParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleCONTINUOUS_ASSIGN_in_rule__MODULE_COMMON_ITEM__Alternatives1998);
                    ruleCONTINUOUS_ASSIGN();

                    state._fsp--;

                     after(grammarAccess.getMODULE_COMMON_ITEMAccess().getCONTINUOUS_ASSIGNParserRuleCall_1()); 

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
    // $ANTLR end "rule__MODULE_COMMON_ITEM__Alternatives"


    // $ANTLR start "rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:979:1: rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives : ( ( ruleNET_DECLARATION ) | ( ruleDATA_DECLARATION ) );
    public final void rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:983:1: ( ( ruleNET_DECLARATION ) | ( ruleDATA_DECLARATION ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=27 && LA2_0<=37)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=38 && LA2_0<=42)||LA2_0==60) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:984:1: ( ruleNET_DECLARATION )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:984:1: ( ruleNET_DECLARATION )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:985:1: ruleNET_DECLARATION
                    {
                     before(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getNET_DECLARATIONParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNET_DECLARATION_in_rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives2030);
                    ruleNET_DECLARATION();

                    state._fsp--;

                     after(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getNET_DECLARATIONParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:990:6: ( ruleDATA_DECLARATION )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:990:6: ( ruleDATA_DECLARATION )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:991:1: ruleDATA_DECLARATION
                    {
                     before(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getDATA_DECLARATIONParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDATA_DECLARATION_in_rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives2047);
                    ruleDATA_DECLARATION();

                    state._fsp--;

                     after(grammarAccess.getPACKAGE_OR_GENERATE_ITEM_DECLARATIONAccess().getDATA_DECLARATIONParserRuleCall_1()); 

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
    // $ANTLR end "rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives"


    // $ANTLR start "rule__NET_TYPE_OR_TRIREG__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1001:1: rule__NET_TYPE_OR_TRIREG__Alternatives : ( ( ruleNET_TYPE ) | ( 'trireg' ) );
    public final void rule__NET_TYPE_OR_TRIREG__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1005:1: ( ( ruleNET_TYPE ) | ( 'trireg' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=28 && LA3_0<=37)) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1006:1: ( ruleNET_TYPE )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1006:1: ( ruleNET_TYPE )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1007:1: ruleNET_TYPE
                    {
                     before(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getNET_TYPEParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNET_TYPE_in_rule__NET_TYPE_OR_TRIREG__Alternatives2079);
                    ruleNET_TYPE();

                    state._fsp--;

                     after(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getNET_TYPEParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1012:6: ( 'trireg' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1012:6: ( 'trireg' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1013:1: 'trireg'
                    {
                     before(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getTriregKeyword_1()); 
                    match(input,27,FOLLOW_27_in_rule__NET_TYPE_OR_TRIREG__Alternatives2097); 
                     after(grammarAccess.getNET_TYPE_OR_TRIREGAccess().getTriregKeyword_1()); 

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
    // $ANTLR end "rule__NET_TYPE_OR_TRIREG__Alternatives"


    // $ANTLR start "rule__NET_TYPE__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1025:1: rule__NET_TYPE__Alternatives : ( ( 'supply0' ) | ( 'supply1' ) | ( 'tri' ) | ( 'triand' ) | ( 'trior' ) | ( 'tri0' ) | ( 'tri1' ) | ( 'wire' ) | ( 'wand' ) | ( 'wor' ) );
    public final void rule__NET_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1029:1: ( ( 'supply0' ) | ( 'supply1' ) | ( 'tri' ) | ( 'triand' ) | ( 'trior' ) | ( 'tri0' ) | ( 'tri1' ) | ( 'wire' ) | ( 'wand' ) | ( 'wor' ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 33:
                {
                alt4=6;
                }
                break;
            case 34:
                {
                alt4=7;
                }
                break;
            case 35:
                {
                alt4=8;
                }
                break;
            case 36:
                {
                alt4=9;
                }
                break;
            case 37:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1030:1: ( 'supply0' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1030:1: ( 'supply0' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1031:1: 'supply0'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getSupply0Keyword_0()); 
                    match(input,28,FOLLOW_28_in_rule__NET_TYPE__Alternatives2132); 
                     after(grammarAccess.getNET_TYPEAccess().getSupply0Keyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1038:6: ( 'supply1' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1038:6: ( 'supply1' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1039:1: 'supply1'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getSupply1Keyword_1()); 
                    match(input,29,FOLLOW_29_in_rule__NET_TYPE__Alternatives2152); 
                     after(grammarAccess.getNET_TYPEAccess().getSupply1Keyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1046:6: ( 'tri' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1046:6: ( 'tri' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1047:1: 'tri'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getTriKeyword_2()); 
                    match(input,30,FOLLOW_30_in_rule__NET_TYPE__Alternatives2172); 
                     after(grammarAccess.getNET_TYPEAccess().getTriKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1054:6: ( 'triand' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1054:6: ( 'triand' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1055:1: 'triand'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getTriandKeyword_3()); 
                    match(input,31,FOLLOW_31_in_rule__NET_TYPE__Alternatives2192); 
                     after(grammarAccess.getNET_TYPEAccess().getTriandKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1062:6: ( 'trior' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1062:6: ( 'trior' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1063:1: 'trior'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getTriorKeyword_4()); 
                    match(input,32,FOLLOW_32_in_rule__NET_TYPE__Alternatives2212); 
                     after(grammarAccess.getNET_TYPEAccess().getTriorKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1070:6: ( 'tri0' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1070:6: ( 'tri0' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1071:1: 'tri0'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getTri0Keyword_5()); 
                    match(input,33,FOLLOW_33_in_rule__NET_TYPE__Alternatives2232); 
                     after(grammarAccess.getNET_TYPEAccess().getTri0Keyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1078:6: ( 'tri1' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1078:6: ( 'tri1' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1079:1: 'tri1'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getTri1Keyword_6()); 
                    match(input,34,FOLLOW_34_in_rule__NET_TYPE__Alternatives2252); 
                     after(grammarAccess.getNET_TYPEAccess().getTri1Keyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1086:6: ( 'wire' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1086:6: ( 'wire' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1087:1: 'wire'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getWireKeyword_7()); 
                    match(input,35,FOLLOW_35_in_rule__NET_TYPE__Alternatives2272); 
                     after(grammarAccess.getNET_TYPEAccess().getWireKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1094:6: ( 'wand' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1094:6: ( 'wand' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1095:1: 'wand'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getWandKeyword_8()); 
                    match(input,36,FOLLOW_36_in_rule__NET_TYPE__Alternatives2292); 
                     after(grammarAccess.getNET_TYPEAccess().getWandKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1102:6: ( 'wor' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1102:6: ( 'wor' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1103:1: 'wor'
                    {
                     before(grammarAccess.getNET_TYPEAccess().getWorKeyword_9()); 
                    match(input,37,FOLLOW_37_in_rule__NET_TYPE__Alternatives2312); 
                     after(grammarAccess.getNET_TYPEAccess().getWorKeyword_9()); 

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
    // $ANTLR end "rule__NET_TYPE__Alternatives"


    // $ANTLR start "rule__LIFETIME__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1115:1: rule__LIFETIME__Alternatives : ( ( 'static' ) | ( 'automatic' ) );
    public final void rule__LIFETIME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1119:1: ( ( 'static' ) | ( 'automatic' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==38) ) {
                alt5=1;
            }
            else if ( (LA5_0==39) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1120:1: ( 'static' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1120:1: ( 'static' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1121:1: 'static'
                    {
                     before(grammarAccess.getLIFETIMEAccess().getStaticKeyword_0()); 
                    match(input,38,FOLLOW_38_in_rule__LIFETIME__Alternatives2347); 
                     after(grammarAccess.getLIFETIMEAccess().getStaticKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1128:6: ( 'automatic' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1128:6: ( 'automatic' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1129:1: 'automatic'
                    {
                     before(grammarAccess.getLIFETIMEAccess().getAutomaticKeyword_1()); 
                    match(input,39,FOLLOW_39_in_rule__LIFETIME__Alternatives2367); 
                     after(grammarAccess.getLIFETIMEAccess().getAutomaticKeyword_1()); 

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
    // $ANTLR end "rule__LIFETIME__Alternatives"


    // $ANTLR start "rule__INTEGER_VECTOR_TYPE__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1141:1: rule__INTEGER_VECTOR_TYPE__Alternatives : ( ( 'bit' ) | ( 'logic' ) | ( 'reg' ) );
    public final void rule__INTEGER_VECTOR_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1145:1: ( ( 'bit' ) | ( 'logic' ) | ( 'reg' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt6=1;
                }
                break;
            case 41:
                {
                alt6=2;
                }
                break;
            case 42:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1146:1: ( 'bit' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1146:1: ( 'bit' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1147:1: 'bit'
                    {
                     before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 
                    match(input,40,FOLLOW_40_in_rule__INTEGER_VECTOR_TYPE__Alternatives2402); 
                     after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getBitKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1154:6: ( 'logic' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1154:6: ( 'logic' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1155:1: 'logic'
                    {
                     before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 
                    match(input,41,FOLLOW_41_in_rule__INTEGER_VECTOR_TYPE__Alternatives2422); 
                     after(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getLogicKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1162:6: ( 'reg' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1162:6: ( 'reg' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1163:1: 'reg'
                    {
                     before(grammarAccess.getINTEGER_VECTOR_TYPEAccess().getRegKeyword_2()); 
                    match(input,42,FOLLOW_42_in_rule__INTEGER_VECTOR_TYPE__Alternatives2442); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1175:1: rule__MODULE_KEYWORD__Alternatives : ( ( 'module' ) | ( 'macromodule' ) );
    public final void rule__MODULE_KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1179:1: ( ( 'module' ) | ( 'macromodule' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==43) ) {
                alt7=1;
            }
            else if ( (LA7_0==44) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1180:1: ( 'module' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1180:1: ( 'module' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1181:1: 'module'
                    {
                     before(grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 
                    match(input,43,FOLLOW_43_in_rule__MODULE_KEYWORD__Alternatives2477); 
                     after(grammarAccess.getMODULE_KEYWORDAccess().getModuleKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1188:6: ( 'macromodule' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1188:6: ( 'macromodule' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1189:1: 'macromodule'
                    {
                     before(grammarAccess.getMODULE_KEYWORDAccess().getMacromoduleKeyword_1()); 
                    match(input,44,FOLLOW_44_in_rule__MODULE_KEYWORD__Alternatives2497); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1201:1: rule__PORT_DIRECTION__Alternatives : ( ( 'input' ) | ( 'output' ) | ( 'inout' ) | ( 'ref' ) );
    public final void rule__PORT_DIRECTION__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1205:1: ( ( 'input' ) | ( 'output' ) | ( 'inout' ) | ( 'ref' ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt8=1;
                }
                break;
            case 46:
                {
                alt8=2;
                }
                break;
            case 47:
                {
                alt8=3;
                }
                break;
            case 48:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1206:1: ( 'input' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1206:1: ( 'input' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1207:1: 'input'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 
                    match(input,45,FOLLOW_45_in_rule__PORT_DIRECTION__Alternatives2532); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getInputKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1214:6: ( 'output' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1214:6: ( 'output' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1215:1: 'output'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 
                    match(input,46,FOLLOW_46_in_rule__PORT_DIRECTION__Alternatives2552); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getOutputKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1222:6: ( 'inout' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1222:6: ( 'inout' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1223:1: 'inout'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 
                    match(input,47,FOLLOW_47_in_rule__PORT_DIRECTION__Alternatives2572); 
                     after(grammarAccess.getPORT_DIRECTIONAccess().getInoutKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1230:6: ( 'ref' )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1230:6: ( 'ref' )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1231:1: 'ref'
                    {
                     before(grammarAccess.getPORT_DIRECTIONAccess().getRefKeyword_3()); 
                    match(input,48,FOLLOW_48_in_rule__PORT_DIRECTION__Alternatives2592); 
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


    // $ANTLR start "rule__NUMBER__Alternatives"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1243:1: rule__NUMBER__Alternatives : ( ( RULE_BINARY_NUMBER ) | ( RULE_OCTAL_NUMBER ) | ( RULE_HEX_NUMBER ) | ( RULE_DECIMAL_NUMBER ) );
    public final void rule__NUMBER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1247:1: ( ( RULE_BINARY_NUMBER ) | ( RULE_OCTAL_NUMBER ) | ( RULE_HEX_NUMBER ) | ( RULE_DECIMAL_NUMBER ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_BINARY_NUMBER:
                {
                alt9=1;
                }
                break;
            case RULE_OCTAL_NUMBER:
                {
                alt9=2;
                }
                break;
            case RULE_HEX_NUMBER:
                {
                alt9=3;
                }
                break;
            case RULE_DECIMAL_NUMBER:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1248:1: ( RULE_BINARY_NUMBER )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1248:1: ( RULE_BINARY_NUMBER )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1249:1: RULE_BINARY_NUMBER
                    {
                     before(grammarAccess.getNUMBERAccess().getBINARY_NUMBERTerminalRuleCall_0()); 
                    match(input,RULE_BINARY_NUMBER,FOLLOW_RULE_BINARY_NUMBER_in_rule__NUMBER__Alternatives2626); 
                     after(grammarAccess.getNUMBERAccess().getBINARY_NUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1254:6: ( RULE_OCTAL_NUMBER )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1254:6: ( RULE_OCTAL_NUMBER )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1255:1: RULE_OCTAL_NUMBER
                    {
                     before(grammarAccess.getNUMBERAccess().getOCTAL_NUMBERTerminalRuleCall_1()); 
                    match(input,RULE_OCTAL_NUMBER,FOLLOW_RULE_OCTAL_NUMBER_in_rule__NUMBER__Alternatives2643); 
                     after(grammarAccess.getNUMBERAccess().getOCTAL_NUMBERTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1260:6: ( RULE_HEX_NUMBER )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1260:6: ( RULE_HEX_NUMBER )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1261:1: RULE_HEX_NUMBER
                    {
                     before(grammarAccess.getNUMBERAccess().getHEX_NUMBERTerminalRuleCall_2()); 
                    match(input,RULE_HEX_NUMBER,FOLLOW_RULE_HEX_NUMBER_in_rule__NUMBER__Alternatives2660); 
                     after(grammarAccess.getNUMBERAccess().getHEX_NUMBERTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1266:6: ( RULE_DECIMAL_NUMBER )
                    {
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1266:6: ( RULE_DECIMAL_NUMBER )
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1267:1: RULE_DECIMAL_NUMBER
                    {
                     before(grammarAccess.getNUMBERAccess().getDECIMAL_NUMBERTerminalRuleCall_3()); 
                    match(input,RULE_DECIMAL_NUMBER,FOLLOW_RULE_DECIMAL_NUMBER_in_rule__NUMBER__Alternatives2677); 
                     after(grammarAccess.getNUMBERAccess().getDECIMAL_NUMBERTerminalRuleCall_3()); 

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
    // $ANTLR end "rule__NUMBER__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1279:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1283:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1284:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__02707);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__1_in_rule__Module__Group__02710);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1291:1: rule__Module__Group__0__Impl : ( ruleMODULE_KEYWORD ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1295:1: ( ( ruleMODULE_KEYWORD ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1296:1: ( ruleMODULE_KEYWORD )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1296:1: ( ruleMODULE_KEYWORD )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1297:1: ruleMODULE_KEYWORD
            {
             before(grammarAccess.getModuleAccess().getMODULE_KEYWORDParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMODULE_KEYWORD_in_rule__Module__Group__0__Impl2737);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1308:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1312:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1313:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__12766);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12769);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1320:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1324:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1325:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1325:1: ( ( rule__Module__NameAssignment_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1326:1: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1327:1: ( rule__Module__NameAssignment_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1327:2: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl2796);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1337:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1341:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1342:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__22826);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22829);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1349:1: rule__Module__Group__2__Impl : ( ( rule__Module__Group_2__0 )? ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1353:1: ( ( ( rule__Module__Group_2__0 )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1354:1: ( ( rule__Module__Group_2__0 )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1354:1: ( ( rule__Module__Group_2__0 )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1355:1: ( rule__Module__Group_2__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_2()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1356:1: ( rule__Module__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==53) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1356:2: rule__Module__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl2856);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1366:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1370:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1371:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__32887);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32890);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1378:1: rule__Module__Group__3__Impl : ( '(' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1382:1: ( ( '(' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1383:1: ( '(' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1383:1: ( '(' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1384:1: '('
            {
             before(grammarAccess.getModuleAccess().getLeftParenthesisKeyword_3()); 
            match(input,49,FOLLOW_49_in_rule__Module__Group__3__Impl2918); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1397:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1401:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1402:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__42949);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__5_in_rule__Module__Group__42952);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1409:1: rule__Module__Group__4__Impl : ( ( rule__Module__Group_4__0 )? ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1413:1: ( ( ( rule__Module__Group_4__0 )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1414:1: ( ( rule__Module__Group_4__0 )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1414:1: ( ( rule__Module__Group_4__0 )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1415:1: ( rule__Module__Group_4__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_4()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1416:1: ( rule__Module__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=45 && LA11_0<=48)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1416:2: rule__Module__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl2979);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1426:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1430:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1431:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__53010);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__6_in_rule__Module__Group__53013);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1438:1: rule__Module__Group__5__Impl : ( ')' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1442:1: ( ( ')' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1443:1: ( ')' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1443:1: ( ')' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1444:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_5()); 
            match(input,50,FOLLOW_50_in_rule__Module__Group__5__Impl3041); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1457:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1461:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1462:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__63072);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__7_in_rule__Module__Group__63075);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1469:1: rule__Module__Group__6__Impl : ( ';' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1473:1: ( ( ';' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1474:1: ( ';' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1474:1: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1475:1: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_6()); 
            match(input,51,FOLLOW_51_in_rule__Module__Group__6__Impl3103); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1488:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1492:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1493:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__73134);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group__8_in_rule__Module__Group__73137);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1500:1: rule__Module__Group__7__Impl : ( ( rule__Module__Module_itemsAssignment_7 )* ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1504:1: ( ( ( rule__Module__Module_itemsAssignment_7 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1505:1: ( ( rule__Module__Module_itemsAssignment_7 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1505:1: ( ( rule__Module__Module_itemsAssignment_7 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1506:1: ( rule__Module__Module_itemsAssignment_7 )*
            {
             before(grammarAccess.getModuleAccess().getModule_itemsAssignment_7()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1507:1: ( rule__Module__Module_itemsAssignment_7 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=42)||LA12_0==55||LA12_0==60) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1507:2: rule__Module__Module_itemsAssignment_7
            	    {
            	    pushFollow(FOLLOW_rule__Module__Module_itemsAssignment_7_in_rule__Module__Group__7__Impl3164);
            	    rule__Module__Module_itemsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1517:1: rule__Module__Group__8 : rule__Module__Group__8__Impl ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1521:1: ( rule__Module__Group__8__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1522:2: rule__Module__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__83195);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1528:1: rule__Module__Group__8__Impl : ( 'endmodule' ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1532:1: ( ( 'endmodule' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1533:1: ( 'endmodule' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1533:1: ( 'endmodule' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1534:1: 'endmodule'
            {
             before(grammarAccess.getModuleAccess().getEndmoduleKeyword_8()); 
            match(input,52,FOLLOW_52_in_rule__Module__Group__8__Impl3223); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1565:1: rule__Module__Group_2__0 : rule__Module__Group_2__0__Impl rule__Module__Group_2__1 ;
    public final void rule__Module__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1569:1: ( rule__Module__Group_2__0__Impl rule__Module__Group_2__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1570:2: rule__Module__Group_2__0__Impl rule__Module__Group_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__03272);
            rule__Module__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__03275);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1577:1: rule__Module__Group_2__0__Impl : ( '#(' ) ;
    public final void rule__Module__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1581:1: ( ( '#(' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1582:1: ( '#(' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1582:1: ( '#(' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1583:1: '#('
            {
             before(grammarAccess.getModuleAccess().getNumberSignLeftParenthesisKeyword_2_0()); 
            match(input,53,FOLLOW_53_in_rule__Module__Group_2__0__Impl3303); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1596:1: rule__Module__Group_2__1 : rule__Module__Group_2__1__Impl rule__Module__Group_2__2 ;
    public final void rule__Module__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1600:1: ( rule__Module__Group_2__1__Impl rule__Module__Group_2__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1601:2: rule__Module__Group_2__1__Impl rule__Module__Group_2__2
            {
            pushFollow(FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__13334);
            rule__Module__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__13337);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1608:1: rule__Module__Group_2__1__Impl : ( ( rule__Module__ParametersAssignment_2_1 ) ) ;
    public final void rule__Module__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1612:1: ( ( ( rule__Module__ParametersAssignment_2_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1613:1: ( ( rule__Module__ParametersAssignment_2_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1613:1: ( ( rule__Module__ParametersAssignment_2_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1614:1: ( rule__Module__ParametersAssignment_2_1 )
            {
             before(grammarAccess.getModuleAccess().getParametersAssignment_2_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1615:1: ( rule__Module__ParametersAssignment_2_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1615:2: rule__Module__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Module__ParametersAssignment_2_1_in_rule__Module__Group_2__1__Impl3364);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1625:1: rule__Module__Group_2__2 : rule__Module__Group_2__2__Impl rule__Module__Group_2__3 ;
    public final void rule__Module__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1629:1: ( rule__Module__Group_2__2__Impl rule__Module__Group_2__3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1630:2: rule__Module__Group_2__2__Impl rule__Module__Group_2__3
            {
            pushFollow(FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__23394);
            rule__Module__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2__3_in_rule__Module__Group_2__23397);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1637:1: rule__Module__Group_2__2__Impl : ( ( rule__Module__Group_2_2__0 )* ) ;
    public final void rule__Module__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1641:1: ( ( ( rule__Module__Group_2_2__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1642:1: ( ( rule__Module__Group_2_2__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1642:1: ( ( rule__Module__Group_2_2__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1643:1: ( rule__Module__Group_2_2__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_2_2()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1644:1: ( rule__Module__Group_2_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==54) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1644:2: rule__Module__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_2_2__0_in_rule__Module__Group_2__2__Impl3424);
            	    rule__Module__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1654:1: rule__Module__Group_2__3 : rule__Module__Group_2__3__Impl ;
    public final void rule__Module__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1658:1: ( rule__Module__Group_2__3__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1659:2: rule__Module__Group_2__3__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2__3__Impl_in_rule__Module__Group_2__33455);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1665:1: rule__Module__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Module__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1669:1: ( ( ')' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1670:1: ( ')' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1670:1: ( ')' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1671:1: ')'
            {
             before(grammarAccess.getModuleAccess().getRightParenthesisKeyword_2_3()); 
            match(input,50,FOLLOW_50_in_rule__Module__Group_2__3__Impl3483); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1692:1: rule__Module__Group_2_2__0 : rule__Module__Group_2_2__0__Impl rule__Module__Group_2_2__1 ;
    public final void rule__Module__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1696:1: ( rule__Module__Group_2_2__0__Impl rule__Module__Group_2_2__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1697:2: rule__Module__Group_2_2__0__Impl rule__Module__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__Module__Group_2_2__0__Impl_in_rule__Module__Group_2_2__03522);
            rule__Module__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_2_2__1_in_rule__Module__Group_2_2__03525);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1704:1: rule__Module__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1708:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1709:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1709:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1710:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_2_2_0()); 
            match(input,54,FOLLOW_54_in_rule__Module__Group_2_2__0__Impl3553); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1723:1: rule__Module__Group_2_2__1 : rule__Module__Group_2_2__1__Impl ;
    public final void rule__Module__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1727:1: ( rule__Module__Group_2_2__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1728:2: rule__Module__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_2_2__1__Impl_in_rule__Module__Group_2_2__13584);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1734:1: rule__Module__Group_2_2__1__Impl : ( ( rule__Module__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__Module__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1738:1: ( ( ( rule__Module__ParametersAssignment_2_2_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1739:1: ( ( rule__Module__ParametersAssignment_2_2_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1739:1: ( ( rule__Module__ParametersAssignment_2_2_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1740:1: ( rule__Module__ParametersAssignment_2_2_1 )
            {
             before(grammarAccess.getModuleAccess().getParametersAssignment_2_2_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1741:1: ( rule__Module__ParametersAssignment_2_2_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1741:2: rule__Module__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__Module__ParametersAssignment_2_2_1_in_rule__Module__Group_2_2__1__Impl3611);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1755:1: rule__Module__Group_4__0 : rule__Module__Group_4__0__Impl rule__Module__Group_4__1 ;
    public final void rule__Module__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1759:1: ( rule__Module__Group_4__0__Impl rule__Module__Group_4__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1760:2: rule__Module__Group_4__0__Impl rule__Module__Group_4__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__03645);
            rule__Module__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__03648);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1767:1: rule__Module__Group_4__0__Impl : ( ( rule__Module__PortsAssignment_4_0 ) ) ;
    public final void rule__Module__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1771:1: ( ( ( rule__Module__PortsAssignment_4_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1772:1: ( ( rule__Module__PortsAssignment_4_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1772:1: ( ( rule__Module__PortsAssignment_4_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1773:1: ( rule__Module__PortsAssignment_4_0 )
            {
             before(grammarAccess.getModuleAccess().getPortsAssignment_4_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1774:1: ( rule__Module__PortsAssignment_4_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1774:2: rule__Module__PortsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__Module__PortsAssignment_4_0_in_rule__Module__Group_4__0__Impl3675);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1784:1: rule__Module__Group_4__1 : rule__Module__Group_4__1__Impl ;
    public final void rule__Module__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1788:1: ( rule__Module__Group_4__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1789:2: rule__Module__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__13705);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1795:1: rule__Module__Group_4__1__Impl : ( ( rule__Module__Group_4_1__0 )* ) ;
    public final void rule__Module__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1799:1: ( ( ( rule__Module__Group_4_1__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1800:1: ( ( rule__Module__Group_4_1__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1800:1: ( ( rule__Module__Group_4_1__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1801:1: ( rule__Module__Group_4_1__0 )*
            {
             before(grammarAccess.getModuleAccess().getGroup_4_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1802:1: ( rule__Module__Group_4_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==54) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1802:2: rule__Module__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Module__Group_4_1__0_in_rule__Module__Group_4__1__Impl3732);
            	    rule__Module__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1816:1: rule__Module__Group_4_1__0 : rule__Module__Group_4_1__0__Impl rule__Module__Group_4_1__1 ;
    public final void rule__Module__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1820:1: ( rule__Module__Group_4_1__0__Impl rule__Module__Group_4_1__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1821:2: rule__Module__Group_4_1__0__Impl rule__Module__Group_4_1__1
            {
            pushFollow(FOLLOW_rule__Module__Group_4_1__0__Impl_in_rule__Module__Group_4_1__03767);
            rule__Module__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Module__Group_4_1__1_in_rule__Module__Group_4_1__03770);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1828:1: rule__Module__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__Module__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1832:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1833:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1833:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1834:1: ','
            {
             before(grammarAccess.getModuleAccess().getCommaKeyword_4_1_0()); 
            match(input,54,FOLLOW_54_in_rule__Module__Group_4_1__0__Impl3798); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1847:1: rule__Module__Group_4_1__1 : rule__Module__Group_4_1__1__Impl ;
    public final void rule__Module__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1851:1: ( rule__Module__Group_4_1__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1852:2: rule__Module__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Module__Group_4_1__1__Impl_in_rule__Module__Group_4_1__13829);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1858:1: rule__Module__Group_4_1__1__Impl : ( ( rule__Module__PortsAssignment_4_1_1 ) ) ;
    public final void rule__Module__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1862:1: ( ( ( rule__Module__PortsAssignment_4_1_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1863:1: ( ( rule__Module__PortsAssignment_4_1_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1863:1: ( ( rule__Module__PortsAssignment_4_1_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1864:1: ( rule__Module__PortsAssignment_4_1_1 )
            {
             before(grammarAccess.getModuleAccess().getPortsAssignment_4_1_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1865:1: ( rule__Module__PortsAssignment_4_1_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1865:2: rule__Module__PortsAssignment_4_1_1
            {
            pushFollow(FOLLOW_rule__Module__PortsAssignment_4_1_1_in_rule__Module__Group_4_1__1__Impl3856);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1879:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1883:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1884:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03890);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03893);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1891:1: rule__Port__Group__0__Impl : ( ( rule__Port__DirectionAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1895:1: ( ( ( rule__Port__DirectionAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1896:1: ( ( rule__Port__DirectionAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1896:1: ( ( rule__Port__DirectionAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1897:1: ( rule__Port__DirectionAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getDirectionAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1898:1: ( rule__Port__DirectionAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1898:2: rule__Port__DirectionAssignment_0
            {
            pushFollow(FOLLOW_rule__Port__DirectionAssignment_0_in_rule__Port__Group__0__Impl3920);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1908:1: rule__Port__Group__1 : rule__Port__Group__1__Impl ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1912:1: ( rule__Port__Group__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1913:2: rule__Port__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13950);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1919:1: rule__Port__Group__1__Impl : ( ( rule__Port__NameAssignment_1 ) ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1923:1: ( ( ( rule__Port__NameAssignment_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1924:1: ( ( rule__Port__NameAssignment_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1924:1: ( ( rule__Port__NameAssignment_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1925:1: ( rule__Port__NameAssignment_1 )
            {
             before(grammarAccess.getPortAccess().getNameAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1926:1: ( rule__Port__NameAssignment_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1926:2: rule__Port__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl3977);
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


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1940:1: rule__CONTINUOUS_ASSIGN__Group__0 : rule__CONTINUOUS_ASSIGN__Group__0__Impl rule__CONTINUOUS_ASSIGN__Group__1 ;
    public final void rule__CONTINUOUS_ASSIGN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1944:1: ( rule__CONTINUOUS_ASSIGN__Group__0__Impl rule__CONTINUOUS_ASSIGN__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1945:2: rule__CONTINUOUS_ASSIGN__Group__0__Impl rule__CONTINUOUS_ASSIGN__Group__1
            {
            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__0__Impl_in_rule__CONTINUOUS_ASSIGN__Group__04011);
            rule__CONTINUOUS_ASSIGN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__1_in_rule__CONTINUOUS_ASSIGN__Group__04014);
            rule__CONTINUOUS_ASSIGN__Group__1();

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__0"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1952:1: rule__CONTINUOUS_ASSIGN__Group__0__Impl : ( 'assign' ) ;
    public final void rule__CONTINUOUS_ASSIGN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1956:1: ( ( 'assign' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1957:1: ( 'assign' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1957:1: ( 'assign' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1958:1: 'assign'
            {
             before(grammarAccess.getCONTINUOUS_ASSIGNAccess().getAssignKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__CONTINUOUS_ASSIGN__Group__0__Impl4042); 
             after(grammarAccess.getCONTINUOUS_ASSIGNAccess().getAssignKeyword_0()); 

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__0__Impl"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1971:1: rule__CONTINUOUS_ASSIGN__Group__1 : rule__CONTINUOUS_ASSIGN__Group__1__Impl rule__CONTINUOUS_ASSIGN__Group__2 ;
    public final void rule__CONTINUOUS_ASSIGN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1975:1: ( rule__CONTINUOUS_ASSIGN__Group__1__Impl rule__CONTINUOUS_ASSIGN__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1976:2: rule__CONTINUOUS_ASSIGN__Group__1__Impl rule__CONTINUOUS_ASSIGN__Group__2
            {
            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__1__Impl_in_rule__CONTINUOUS_ASSIGN__Group__14073);
            rule__CONTINUOUS_ASSIGN__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__2_in_rule__CONTINUOUS_ASSIGN__Group__14076);
            rule__CONTINUOUS_ASSIGN__Group__2();

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__1"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1983:1: rule__CONTINUOUS_ASSIGN__Group__1__Impl : ( ( RULE_DRIVE_STRENGTH )? ) ;
    public final void rule__CONTINUOUS_ASSIGN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1987:1: ( ( ( RULE_DRIVE_STRENGTH )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1988:1: ( ( RULE_DRIVE_STRENGTH )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1988:1: ( ( RULE_DRIVE_STRENGTH )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1989:1: ( RULE_DRIVE_STRENGTH )?
            {
             before(grammarAccess.getCONTINUOUS_ASSIGNAccess().getDRIVE_STRENGTHTerminalRuleCall_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1990:1: ( RULE_DRIVE_STRENGTH )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DRIVE_STRENGTH) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:1990:3: RULE_DRIVE_STRENGTH
                    {
                    match(input,RULE_DRIVE_STRENGTH,FOLLOW_RULE_DRIVE_STRENGTH_in_rule__CONTINUOUS_ASSIGN__Group__1__Impl4104); 

                    }
                    break;

            }

             after(grammarAccess.getCONTINUOUS_ASSIGNAccess().getDRIVE_STRENGTHTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__1__Impl"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2000:1: rule__CONTINUOUS_ASSIGN__Group__2 : rule__CONTINUOUS_ASSIGN__Group__2__Impl rule__CONTINUOUS_ASSIGN__Group__3 ;
    public final void rule__CONTINUOUS_ASSIGN__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2004:1: ( rule__CONTINUOUS_ASSIGN__Group__2__Impl rule__CONTINUOUS_ASSIGN__Group__3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2005:2: rule__CONTINUOUS_ASSIGN__Group__2__Impl rule__CONTINUOUS_ASSIGN__Group__3
            {
            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__2__Impl_in_rule__CONTINUOUS_ASSIGN__Group__24135);
            rule__CONTINUOUS_ASSIGN__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__3_in_rule__CONTINUOUS_ASSIGN__Group__24138);
            rule__CONTINUOUS_ASSIGN__Group__3();

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__2"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2012:1: rule__CONTINUOUS_ASSIGN__Group__2__Impl : ( ruleLIST_OF_NET_ASSIGNMENTS ) ;
    public final void rule__CONTINUOUS_ASSIGN__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2016:1: ( ( ruleLIST_OF_NET_ASSIGNMENTS ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2017:1: ( ruleLIST_OF_NET_ASSIGNMENTS )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2017:1: ( ruleLIST_OF_NET_ASSIGNMENTS )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2018:1: ruleLIST_OF_NET_ASSIGNMENTS
            {
             before(grammarAccess.getCONTINUOUS_ASSIGNAccess().getLIST_OF_NET_ASSIGNMENTSParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_rule__CONTINUOUS_ASSIGN__Group__2__Impl4165);
            ruleLIST_OF_NET_ASSIGNMENTS();

            state._fsp--;

             after(grammarAccess.getCONTINUOUS_ASSIGNAccess().getLIST_OF_NET_ASSIGNMENTSParserRuleCall_2()); 

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__2__Impl"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__3"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2029:1: rule__CONTINUOUS_ASSIGN__Group__3 : rule__CONTINUOUS_ASSIGN__Group__3__Impl ;
    public final void rule__CONTINUOUS_ASSIGN__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2033:1: ( rule__CONTINUOUS_ASSIGN__Group__3__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2034:2: rule__CONTINUOUS_ASSIGN__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__CONTINUOUS_ASSIGN__Group__3__Impl_in_rule__CONTINUOUS_ASSIGN__Group__34194);
            rule__CONTINUOUS_ASSIGN__Group__3__Impl();

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__3"


    // $ANTLR start "rule__CONTINUOUS_ASSIGN__Group__3__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2040:1: rule__CONTINUOUS_ASSIGN__Group__3__Impl : ( ';' ) ;
    public final void rule__CONTINUOUS_ASSIGN__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2044:1: ( ( ';' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2045:1: ( ';' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2045:1: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2046:1: ';'
            {
             before(grammarAccess.getCONTINUOUS_ASSIGNAccess().getSemicolonKeyword_3()); 
            match(input,51,FOLLOW_51_in_rule__CONTINUOUS_ASSIGN__Group__3__Impl4222); 
             after(grammarAccess.getCONTINUOUS_ASSIGNAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__CONTINUOUS_ASSIGN__Group__3__Impl"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2067:1: rule__LIST_OF_NET_ASSIGNMENTS__Group__0 : rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_NET_ASSIGNMENTS__Group__1 ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2071:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_NET_ASSIGNMENTS__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2072:2: rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_NET_ASSIGNMENTS__Group__1
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__04261);
            rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__1_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__04264);
            rule__LIST_OF_NET_ASSIGNMENTS__Group__1();

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group__0"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2079:1: rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl : ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 ) ) ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2083:1: ( ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2084:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2084:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2085:1: ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 )
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2086:1: ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2086:2: rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl4291);
            rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsAssignment_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2096:1: rule__LIST_OF_NET_ASSIGNMENTS__Group__1 : rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2100:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2101:2: rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__14321);
            rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl();

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group__1"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2107:1: rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl : ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 )* ) ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2111:1: ( ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2112:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2112:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2113:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 )*
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getGroup_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2114:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==54) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2114:2: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl4348);
            	    rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2128:1: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0 : rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1 ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2132:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2133:2: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__04383);
            rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__04386);
            rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1();

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2140:1: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2144:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2145:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2145:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2146:1: ','
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getCommaKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl4414); 
             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2159:1: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1 : rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2163:1: ( rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2164:2: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__14445);
            rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl();

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2170:1: rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl : ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 ) ) ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2174:1: ( ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2175:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2175:1: ( ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2176:1: ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 )
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsAssignment_1_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2177:1: ( rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2177:2: rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl4472);
            rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsAssignment_1_1()); 

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl"


    // $ANTLR start "rule__NET_ASSIGNMENT__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2191:1: rule__NET_ASSIGNMENT__Group__0 : rule__NET_ASSIGNMENT__Group__0__Impl rule__NET_ASSIGNMENT__Group__1 ;
    public final void rule__NET_ASSIGNMENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2195:1: ( rule__NET_ASSIGNMENT__Group__0__Impl rule__NET_ASSIGNMENT__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2196:2: rule__NET_ASSIGNMENT__Group__0__Impl rule__NET_ASSIGNMENT__Group__1
            {
            pushFollow(FOLLOW_rule__NET_ASSIGNMENT__Group__0__Impl_in_rule__NET_ASSIGNMENT__Group__04506);
            rule__NET_ASSIGNMENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_ASSIGNMENT__Group__1_in_rule__NET_ASSIGNMENT__Group__04509);
            rule__NET_ASSIGNMENT__Group__1();

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
    // $ANTLR end "rule__NET_ASSIGNMENT__Group__0"


    // $ANTLR start "rule__NET_ASSIGNMENT__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2203:1: rule__NET_ASSIGNMENT__Group__0__Impl : ( ruleNET_LVALUE ) ;
    public final void rule__NET_ASSIGNMENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2207:1: ( ( ruleNET_LVALUE ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2208:1: ( ruleNET_LVALUE )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2208:1: ( ruleNET_LVALUE )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2209:1: ruleNET_LVALUE
            {
             before(grammarAccess.getNET_ASSIGNMENTAccess().getNET_LVALUEParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNET_LVALUE_in_rule__NET_ASSIGNMENT__Group__0__Impl4536);
            ruleNET_LVALUE();

            state._fsp--;

             after(grammarAccess.getNET_ASSIGNMENTAccess().getNET_LVALUEParserRuleCall_0()); 

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
    // $ANTLR end "rule__NET_ASSIGNMENT__Group__0__Impl"


    // $ANTLR start "rule__NET_ASSIGNMENT__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2220:1: rule__NET_ASSIGNMENT__Group__1 : rule__NET_ASSIGNMENT__Group__1__Impl rule__NET_ASSIGNMENT__Group__2 ;
    public final void rule__NET_ASSIGNMENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2224:1: ( rule__NET_ASSIGNMENT__Group__1__Impl rule__NET_ASSIGNMENT__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2225:2: rule__NET_ASSIGNMENT__Group__1__Impl rule__NET_ASSIGNMENT__Group__2
            {
            pushFollow(FOLLOW_rule__NET_ASSIGNMENT__Group__1__Impl_in_rule__NET_ASSIGNMENT__Group__14565);
            rule__NET_ASSIGNMENT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_ASSIGNMENT__Group__2_in_rule__NET_ASSIGNMENT__Group__14568);
            rule__NET_ASSIGNMENT__Group__2();

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
    // $ANTLR end "rule__NET_ASSIGNMENT__Group__1"


    // $ANTLR start "rule__NET_ASSIGNMENT__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2232:1: rule__NET_ASSIGNMENT__Group__1__Impl : ( '=' ) ;
    public final void rule__NET_ASSIGNMENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2236:1: ( ( '=' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2237:1: ( '=' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2237:1: ( '=' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2238:1: '='
            {
             before(grammarAccess.getNET_ASSIGNMENTAccess().getEqualsSignKeyword_1()); 
            match(input,56,FOLLOW_56_in_rule__NET_ASSIGNMENT__Group__1__Impl4596); 
             after(grammarAccess.getNET_ASSIGNMENTAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__NET_ASSIGNMENT__Group__1__Impl"


    // $ANTLR start "rule__NET_ASSIGNMENT__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2251:1: rule__NET_ASSIGNMENT__Group__2 : rule__NET_ASSIGNMENT__Group__2__Impl ;
    public final void rule__NET_ASSIGNMENT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2255:1: ( rule__NET_ASSIGNMENT__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2256:2: rule__NET_ASSIGNMENT__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NET_ASSIGNMENT__Group__2__Impl_in_rule__NET_ASSIGNMENT__Group__24627);
            rule__NET_ASSIGNMENT__Group__2__Impl();

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
    // $ANTLR end "rule__NET_ASSIGNMENT__Group__2"


    // $ANTLR start "rule__NET_ASSIGNMENT__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2262:1: rule__NET_ASSIGNMENT__Group__2__Impl : ( ruleNUMBER ) ;
    public final void rule__NET_ASSIGNMENT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2266:1: ( ( ruleNUMBER ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2267:1: ( ruleNUMBER )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2267:1: ( ruleNUMBER )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2268:1: ruleNUMBER
            {
             before(grammarAccess.getNET_ASSIGNMENTAccess().getNUMBERParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleNUMBER_in_rule__NET_ASSIGNMENT__Group__2__Impl4654);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNET_ASSIGNMENTAccess().getNUMBERParserRuleCall_2()); 

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
    // $ANTLR end "rule__NET_ASSIGNMENT__Group__2__Impl"


    // $ANTLR start "rule__NET_DECLARATION__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2285:1: rule__NET_DECLARATION__Group__0 : rule__NET_DECLARATION__Group__0__Impl rule__NET_DECLARATION__Group__1 ;
    public final void rule__NET_DECLARATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2289:1: ( rule__NET_DECLARATION__Group__0__Impl rule__NET_DECLARATION__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2290:2: rule__NET_DECLARATION__Group__0__Impl rule__NET_DECLARATION__Group__1
            {
            pushFollow(FOLLOW_rule__NET_DECLARATION__Group__0__Impl_in_rule__NET_DECLARATION__Group__04689);
            rule__NET_DECLARATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_DECLARATION__Group__1_in_rule__NET_DECLARATION__Group__04692);
            rule__NET_DECLARATION__Group__1();

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
    // $ANTLR end "rule__NET_DECLARATION__Group__0"


    // $ANTLR start "rule__NET_DECLARATION__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2297:1: rule__NET_DECLARATION__Group__0__Impl : ( ruleNET_TYPE_OR_TRIREG ) ;
    public final void rule__NET_DECLARATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2301:1: ( ( ruleNET_TYPE_OR_TRIREG ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2302:1: ( ruleNET_TYPE_OR_TRIREG )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2302:1: ( ruleNET_TYPE_OR_TRIREG )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2303:1: ruleNET_TYPE_OR_TRIREG
            {
             before(grammarAccess.getNET_DECLARATIONAccess().getNET_TYPE_OR_TRIREGParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleNET_TYPE_OR_TRIREG_in_rule__NET_DECLARATION__Group__0__Impl4719);
            ruleNET_TYPE_OR_TRIREG();

            state._fsp--;

             after(grammarAccess.getNET_DECLARATIONAccess().getNET_TYPE_OR_TRIREGParserRuleCall_0()); 

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
    // $ANTLR end "rule__NET_DECLARATION__Group__0__Impl"


    // $ANTLR start "rule__NET_DECLARATION__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2314:1: rule__NET_DECLARATION__Group__1 : rule__NET_DECLARATION__Group__1__Impl rule__NET_DECLARATION__Group__2 ;
    public final void rule__NET_DECLARATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2318:1: ( rule__NET_DECLARATION__Group__1__Impl rule__NET_DECLARATION__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2319:2: rule__NET_DECLARATION__Group__1__Impl rule__NET_DECLARATION__Group__2
            {
            pushFollow(FOLLOW_rule__NET_DECLARATION__Group__1__Impl_in_rule__NET_DECLARATION__Group__14748);
            rule__NET_DECLARATION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_DECLARATION__Group__2_in_rule__NET_DECLARATION__Group__14751);
            rule__NET_DECLARATION__Group__2();

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
    // $ANTLR end "rule__NET_DECLARATION__Group__1"


    // $ANTLR start "rule__NET_DECLARATION__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2326:1: rule__NET_DECLARATION__Group__1__Impl : ( ruleLIST_OF_NET_DECL_ASSIGNMENTS ) ;
    public final void rule__NET_DECLARATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2330:1: ( ( ruleLIST_OF_NET_DECL_ASSIGNMENTS ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2331:1: ( ruleLIST_OF_NET_DECL_ASSIGNMENTS )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2331:1: ( ruleLIST_OF_NET_DECL_ASSIGNMENTS )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2332:1: ruleLIST_OF_NET_DECL_ASSIGNMENTS
            {
             before(grammarAccess.getNET_DECLARATIONAccess().getLIST_OF_NET_DECL_ASSIGNMENTSParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_rule__NET_DECLARATION__Group__1__Impl4778);
            ruleLIST_OF_NET_DECL_ASSIGNMENTS();

            state._fsp--;

             after(grammarAccess.getNET_DECLARATIONAccess().getLIST_OF_NET_DECL_ASSIGNMENTSParserRuleCall_1()); 

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
    // $ANTLR end "rule__NET_DECLARATION__Group__1__Impl"


    // $ANTLR start "rule__NET_DECLARATION__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2343:1: rule__NET_DECLARATION__Group__2 : rule__NET_DECLARATION__Group__2__Impl ;
    public final void rule__NET_DECLARATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2347:1: ( rule__NET_DECLARATION__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2348:2: rule__NET_DECLARATION__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NET_DECLARATION__Group__2__Impl_in_rule__NET_DECLARATION__Group__24807);
            rule__NET_DECLARATION__Group__2__Impl();

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
    // $ANTLR end "rule__NET_DECLARATION__Group__2"


    // $ANTLR start "rule__NET_DECLARATION__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2354:1: rule__NET_DECLARATION__Group__2__Impl : ( ';' ) ;
    public final void rule__NET_DECLARATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2358:1: ( ( ';' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2359:1: ( ';' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2359:1: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2360:1: ';'
            {
             before(grammarAccess.getNET_DECLARATIONAccess().getSemicolonKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__NET_DECLARATION__Group__2__Impl4835); 
             after(grammarAccess.getNET_DECLARATIONAccess().getSemicolonKeyword_2()); 

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
    // $ANTLR end "rule__NET_DECLARATION__Group__2__Impl"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2379:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0 : rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1 ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2383:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2384:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__04872);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__04875);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1();

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2391:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl : ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 ) ) ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2395:1: ( ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2396:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2396:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2397:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 )
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2398:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2398:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl4902);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsAssignment_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2408:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1 : rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2412:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2413:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__14932);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl();

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2419:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl : ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 )* ) ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2423:1: ( ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2424:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2424:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2425:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 )*
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getGroup_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2426:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2426:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl4959);
            	    rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2440:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0 : rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1 ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2444:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2445:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__04994);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__04997);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1();

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2452:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2456:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2457:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2457:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2458:1: ','
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getCommaKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl5025); 
             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2471:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1 : rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2475:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2476:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__15056);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl();

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2482:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl : ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 ) ) ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2486:1: ( ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2487:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2487:1: ( ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2488:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 )
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsAssignment_1_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2489:1: ( rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2489:2: rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl5083);
            rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsAssignment_1_1()); 

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2503:1: rule__NET_DECL_ASSIGNMENT__Group__0 : rule__NET_DECL_ASSIGNMENT__Group__0__Impl rule__NET_DECL_ASSIGNMENT__Group__1 ;
    public final void rule__NET_DECL_ASSIGNMENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2507:1: ( rule__NET_DECL_ASSIGNMENT__Group__0__Impl rule__NET_DECL_ASSIGNMENT__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2508:2: rule__NET_DECL_ASSIGNMENT__Group__0__Impl rule__NET_DECL_ASSIGNMENT__Group__1
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__0__Impl_in_rule__NET_DECL_ASSIGNMENT__Group__05117);
            rule__NET_DECL_ASSIGNMENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__1_in_rule__NET_DECL_ASSIGNMENT__Group__05120);
            rule__NET_DECL_ASSIGNMENT__Group__1();

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group__0"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2515:1: rule__NET_DECL_ASSIGNMENT__Group__0__Impl : ( ( rule__NET_DECL_ASSIGNMENT__NameAssignment_0 ) ) ;
    public final void rule__NET_DECL_ASSIGNMENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2519:1: ( ( ( rule__NET_DECL_ASSIGNMENT__NameAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2520:1: ( ( rule__NET_DECL_ASSIGNMENT__NameAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2520:1: ( ( rule__NET_DECL_ASSIGNMENT__NameAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2521:1: ( rule__NET_DECL_ASSIGNMENT__NameAssignment_0 )
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getNameAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2522:1: ( rule__NET_DECL_ASSIGNMENT__NameAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2522:2: rule__NET_DECL_ASSIGNMENT__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__NameAssignment_0_in_rule__NET_DECL_ASSIGNMENT__Group__0__Impl5147);
            rule__NET_DECL_ASSIGNMENT__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group__0__Impl"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2532:1: rule__NET_DECL_ASSIGNMENT__Group__1 : rule__NET_DECL_ASSIGNMENT__Group__1__Impl rule__NET_DECL_ASSIGNMENT__Group__2 ;
    public final void rule__NET_DECL_ASSIGNMENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2536:1: ( rule__NET_DECL_ASSIGNMENT__Group__1__Impl rule__NET_DECL_ASSIGNMENT__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2537:2: rule__NET_DECL_ASSIGNMENT__Group__1__Impl rule__NET_DECL_ASSIGNMENT__Group__2
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__1__Impl_in_rule__NET_DECL_ASSIGNMENT__Group__15177);
            rule__NET_DECL_ASSIGNMENT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__2_in_rule__NET_DECL_ASSIGNMENT__Group__15180);
            rule__NET_DECL_ASSIGNMENT__Group__2();

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group__1"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2544:1: rule__NET_DECL_ASSIGNMENT__Group__1__Impl : ( ( rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 )* ) ;
    public final void rule__NET_DECL_ASSIGNMENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2548:1: ( ( ( rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2549:1: ( ( rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2549:1: ( ( rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2550:1: ( rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 )*
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getDimensionsAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2551:1: ( rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==57) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2551:2: rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1_in_rule__NET_DECL_ASSIGNMENT__Group__1__Impl5207);
            	    rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getDimensionsAssignment_1()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group__1__Impl"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2561:1: rule__NET_DECL_ASSIGNMENT__Group__2 : rule__NET_DECL_ASSIGNMENT__Group__2__Impl ;
    public final void rule__NET_DECL_ASSIGNMENT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2565:1: ( rule__NET_DECL_ASSIGNMENT__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2566:2: rule__NET_DECL_ASSIGNMENT__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__2__Impl_in_rule__NET_DECL_ASSIGNMENT__Group__25238);
            rule__NET_DECL_ASSIGNMENT__Group__2__Impl();

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group__2"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2572:1: rule__NET_DECL_ASSIGNMENT__Group__2__Impl : ( ( rule__NET_DECL_ASSIGNMENT__Group_2__0 )? ) ;
    public final void rule__NET_DECL_ASSIGNMENT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2576:1: ( ( ( rule__NET_DECL_ASSIGNMENT__Group_2__0 )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2577:1: ( ( rule__NET_DECL_ASSIGNMENT__Group_2__0 )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2577:1: ( ( rule__NET_DECL_ASSIGNMENT__Group_2__0 )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2578:1: ( rule__NET_DECL_ASSIGNMENT__Group_2__0 )?
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getGroup_2()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2579:1: ( rule__NET_DECL_ASSIGNMENT__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==56) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2579:2: rule__NET_DECL_ASSIGNMENT__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__0_in_rule__NET_DECL_ASSIGNMENT__Group__2__Impl5265);
                    rule__NET_DECL_ASSIGNMENT__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getGroup_2()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group__2__Impl"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group_2__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2595:1: rule__NET_DECL_ASSIGNMENT__Group_2__0 : rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl rule__NET_DECL_ASSIGNMENT__Group_2__1 ;
    public final void rule__NET_DECL_ASSIGNMENT__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2599:1: ( rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl rule__NET_DECL_ASSIGNMENT__Group_2__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2600:2: rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl rule__NET_DECL_ASSIGNMENT__Group_2__1
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl_in_rule__NET_DECL_ASSIGNMENT__Group_2__05302);
            rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__1_in_rule__NET_DECL_ASSIGNMENT__Group_2__05305);
            rule__NET_DECL_ASSIGNMENT__Group_2__1();

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group_2__0"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2607:1: rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl : ( '=' ) ;
    public final void rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2611:1: ( ( '=' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2612:1: ( '=' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2612:1: ( '=' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2613:1: '='
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getEqualsSignKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl5333); 
             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group_2__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2626:1: rule__NET_DECL_ASSIGNMENT__Group_2__1 : rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl ;
    public final void rule__NET_DECL_ASSIGNMENT__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2630:1: ( rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2631:2: rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl_in_rule__NET_DECL_ASSIGNMENT__Group_2__15364);
            rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl();

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group_2__1"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2637:1: rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl : ( ( rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 ) ) ;
    public final void rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2641:1: ( ( ( rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2642:1: ( ( rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2642:1: ( ( rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2643:1: ( rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 )
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getValueAssignment_2_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2644:1: ( rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2644:2: rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1_in_rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl5391);
            rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2658:1: rule__UNPACKED_DIMENSIONS__Group__0 : rule__UNPACKED_DIMENSIONS__Group__0__Impl rule__UNPACKED_DIMENSIONS__Group__1 ;
    public final void rule__UNPACKED_DIMENSIONS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2662:1: ( rule__UNPACKED_DIMENSIONS__Group__0__Impl rule__UNPACKED_DIMENSIONS__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2663:2: rule__UNPACKED_DIMENSIONS__Group__0__Impl rule__UNPACKED_DIMENSIONS__Group__1
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__0__Impl_in_rule__UNPACKED_DIMENSIONS__Group__05425);
            rule__UNPACKED_DIMENSIONS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__1_in_rule__UNPACKED_DIMENSIONS__Group__05428);
            rule__UNPACKED_DIMENSIONS__Group__1();

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__0"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2670:1: rule__UNPACKED_DIMENSIONS__Group__0__Impl : ( '[' ) ;
    public final void rule__UNPACKED_DIMENSIONS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2674:1: ( ( '[' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2675:1: ( '[' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2675:1: ( '[' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2676:1: '['
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeftSquareBracketKeyword_0()); 
            match(input,57,FOLLOW_57_in_rule__UNPACKED_DIMENSIONS__Group__0__Impl5456); 
             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__0__Impl"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2689:1: rule__UNPACKED_DIMENSIONS__Group__1 : rule__UNPACKED_DIMENSIONS__Group__1__Impl rule__UNPACKED_DIMENSIONS__Group__2 ;
    public final void rule__UNPACKED_DIMENSIONS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2693:1: ( rule__UNPACKED_DIMENSIONS__Group__1__Impl rule__UNPACKED_DIMENSIONS__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2694:2: rule__UNPACKED_DIMENSIONS__Group__1__Impl rule__UNPACKED_DIMENSIONS__Group__2
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__1__Impl_in_rule__UNPACKED_DIMENSIONS__Group__15487);
            rule__UNPACKED_DIMENSIONS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__2_in_rule__UNPACKED_DIMENSIONS__Group__15490);
            rule__UNPACKED_DIMENSIONS__Group__2();

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__1"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2701:1: rule__UNPACKED_DIMENSIONS__Group__1__Impl : ( ( rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 ) ) ;
    public final void rule__UNPACKED_DIMENSIONS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2705:1: ( ( ( rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2706:1: ( ( rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2706:1: ( ( rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2707:1: ( rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 )
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeft_boundAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2708:1: ( rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2708:2: rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1_in_rule__UNPACKED_DIMENSIONS__Group__1__Impl5517);
            rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeft_boundAssignment_1()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__1__Impl"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2718:1: rule__UNPACKED_DIMENSIONS__Group__2 : rule__UNPACKED_DIMENSIONS__Group__2__Impl rule__UNPACKED_DIMENSIONS__Group__3 ;
    public final void rule__UNPACKED_DIMENSIONS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2722:1: ( rule__UNPACKED_DIMENSIONS__Group__2__Impl rule__UNPACKED_DIMENSIONS__Group__3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2723:2: rule__UNPACKED_DIMENSIONS__Group__2__Impl rule__UNPACKED_DIMENSIONS__Group__3
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__2__Impl_in_rule__UNPACKED_DIMENSIONS__Group__25547);
            rule__UNPACKED_DIMENSIONS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__3_in_rule__UNPACKED_DIMENSIONS__Group__25550);
            rule__UNPACKED_DIMENSIONS__Group__3();

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__2"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2730:1: rule__UNPACKED_DIMENSIONS__Group__2__Impl : ( ':' ) ;
    public final void rule__UNPACKED_DIMENSIONS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2734:1: ( ( ':' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2735:1: ( ':' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2735:1: ( ':' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2736:1: ':'
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getColonKeyword_2()); 
            match(input,58,FOLLOW_58_in_rule__UNPACKED_DIMENSIONS__Group__2__Impl5578); 
             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__2__Impl"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__3"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2749:1: rule__UNPACKED_DIMENSIONS__Group__3 : rule__UNPACKED_DIMENSIONS__Group__3__Impl rule__UNPACKED_DIMENSIONS__Group__4 ;
    public final void rule__UNPACKED_DIMENSIONS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2753:1: ( rule__UNPACKED_DIMENSIONS__Group__3__Impl rule__UNPACKED_DIMENSIONS__Group__4 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2754:2: rule__UNPACKED_DIMENSIONS__Group__3__Impl rule__UNPACKED_DIMENSIONS__Group__4
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__3__Impl_in_rule__UNPACKED_DIMENSIONS__Group__35609);
            rule__UNPACKED_DIMENSIONS__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__4_in_rule__UNPACKED_DIMENSIONS__Group__35612);
            rule__UNPACKED_DIMENSIONS__Group__4();

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__3"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__3__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2761:1: rule__UNPACKED_DIMENSIONS__Group__3__Impl : ( ( rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 ) ) ;
    public final void rule__UNPACKED_DIMENSIONS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2765:1: ( ( ( rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2766:1: ( ( rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2766:1: ( ( rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2767:1: ( rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 )
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getRight_boundAssignment_3()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2768:1: ( rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2768:2: rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3_in_rule__UNPACKED_DIMENSIONS__Group__3__Impl5639);
            rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getRight_boundAssignment_3()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__3__Impl"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__4"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2778:1: rule__UNPACKED_DIMENSIONS__Group__4 : rule__UNPACKED_DIMENSIONS__Group__4__Impl ;
    public final void rule__UNPACKED_DIMENSIONS__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2782:1: ( rule__UNPACKED_DIMENSIONS__Group__4__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2783:2: rule__UNPACKED_DIMENSIONS__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__UNPACKED_DIMENSIONS__Group__4__Impl_in_rule__UNPACKED_DIMENSIONS__Group__45669);
            rule__UNPACKED_DIMENSIONS__Group__4__Impl();

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__4"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Group__4__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2789:1: rule__UNPACKED_DIMENSIONS__Group__4__Impl : ( ']' ) ;
    public final void rule__UNPACKED_DIMENSIONS__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2793:1: ( ( ']' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2794:1: ( ']' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2794:1: ( ']' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2795:1: ']'
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getRightSquareBracketKeyword_4()); 
            match(input,59,FOLLOW_59_in_rule__UNPACKED_DIMENSIONS__Group__4__Impl5697); 
             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getRightSquareBracketKeyword_4()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Group__4__Impl"


    // $ANTLR start "rule__DATA_DECLARATION__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2818:1: rule__DATA_DECLARATION__Group__0 : rule__DATA_DECLARATION__Group__0__Impl rule__DATA_DECLARATION__Group__1 ;
    public final void rule__DATA_DECLARATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2822:1: ( rule__DATA_DECLARATION__Group__0__Impl rule__DATA_DECLARATION__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2823:2: rule__DATA_DECLARATION__Group__0__Impl rule__DATA_DECLARATION__Group__1
            {
            pushFollow(FOLLOW_rule__DATA_DECLARATION__Group__0__Impl_in_rule__DATA_DECLARATION__Group__05738);
            rule__DATA_DECLARATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DATA_DECLARATION__Group__1_in_rule__DATA_DECLARATION__Group__05741);
            rule__DATA_DECLARATION__Group__1();

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
    // $ANTLR end "rule__DATA_DECLARATION__Group__0"


    // $ANTLR start "rule__DATA_DECLARATION__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2830:1: rule__DATA_DECLARATION__Group__0__Impl : ( ( 'const' )? ) ;
    public final void rule__DATA_DECLARATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2834:1: ( ( ( 'const' )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2835:1: ( ( 'const' )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2835:1: ( ( 'const' )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2836:1: ( 'const' )?
            {
             before(grammarAccess.getDATA_DECLARATIONAccess().getConstKeyword_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2837:1: ( 'const' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2838:2: 'const'
                    {
                    match(input,60,FOLLOW_60_in_rule__DATA_DECLARATION__Group__0__Impl5770); 

                    }
                    break;

            }

             after(grammarAccess.getDATA_DECLARATIONAccess().getConstKeyword_0()); 

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
    // $ANTLR end "rule__DATA_DECLARATION__Group__0__Impl"


    // $ANTLR start "rule__DATA_DECLARATION__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2849:1: rule__DATA_DECLARATION__Group__1 : rule__DATA_DECLARATION__Group__1__Impl rule__DATA_DECLARATION__Group__2 ;
    public final void rule__DATA_DECLARATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2853:1: ( rule__DATA_DECLARATION__Group__1__Impl rule__DATA_DECLARATION__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2854:2: rule__DATA_DECLARATION__Group__1__Impl rule__DATA_DECLARATION__Group__2
            {
            pushFollow(FOLLOW_rule__DATA_DECLARATION__Group__1__Impl_in_rule__DATA_DECLARATION__Group__15803);
            rule__DATA_DECLARATION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DATA_DECLARATION__Group__2_in_rule__DATA_DECLARATION__Group__15806);
            rule__DATA_DECLARATION__Group__2();

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
    // $ANTLR end "rule__DATA_DECLARATION__Group__1"


    // $ANTLR start "rule__DATA_DECLARATION__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2861:1: rule__DATA_DECLARATION__Group__1__Impl : ( ( ruleLIFETIME )? ) ;
    public final void rule__DATA_DECLARATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2865:1: ( ( ( ruleLIFETIME )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2866:1: ( ( ruleLIFETIME )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2866:1: ( ( ruleLIFETIME )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2867:1: ( ruleLIFETIME )?
            {
             before(grammarAccess.getDATA_DECLARATIONAccess().getLIFETIMEParserRuleCall_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2868:1: ( ruleLIFETIME )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=38 && LA21_0<=39)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2868:3: ruleLIFETIME
                    {
                    pushFollow(FOLLOW_ruleLIFETIME_in_rule__DATA_DECLARATION__Group__1__Impl5834);
                    ruleLIFETIME();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDATA_DECLARATIONAccess().getLIFETIMEParserRuleCall_1()); 

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
    // $ANTLR end "rule__DATA_DECLARATION__Group__1__Impl"


    // $ANTLR start "rule__DATA_DECLARATION__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2878:1: rule__DATA_DECLARATION__Group__2 : rule__DATA_DECLARATION__Group__2__Impl ;
    public final void rule__DATA_DECLARATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2882:1: ( rule__DATA_DECLARATION__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2883:2: rule__DATA_DECLARATION__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DATA_DECLARATION__Group__2__Impl_in_rule__DATA_DECLARATION__Group__25865);
            rule__DATA_DECLARATION__Group__2__Impl();

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
    // $ANTLR end "rule__DATA_DECLARATION__Group__2"


    // $ANTLR start "rule__DATA_DECLARATION__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2889:1: rule__DATA_DECLARATION__Group__2__Impl : ( ruleVARIABLE_DECLARATION ) ;
    public final void rule__DATA_DECLARATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2893:1: ( ( ruleVARIABLE_DECLARATION ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2894:1: ( ruleVARIABLE_DECLARATION )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2894:1: ( ruleVARIABLE_DECLARATION )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2895:1: ruleVARIABLE_DECLARATION
            {
             before(grammarAccess.getDATA_DECLARATIONAccess().getVARIABLE_DECLARATIONParserRuleCall_2()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECLARATION_in_rule__DATA_DECLARATION__Group__2__Impl5892);
            ruleVARIABLE_DECLARATION();

            state._fsp--;

             after(grammarAccess.getDATA_DECLARATIONAccess().getVARIABLE_DECLARATIONParserRuleCall_2()); 

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
    // $ANTLR end "rule__DATA_DECLARATION__Group__2__Impl"


    // $ANTLR start "rule__VARIABLE_DECLARATION__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2912:1: rule__VARIABLE_DECLARATION__Group__0 : rule__VARIABLE_DECLARATION__Group__0__Impl rule__VARIABLE_DECLARATION__Group__1 ;
    public final void rule__VARIABLE_DECLARATION__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2916:1: ( rule__VARIABLE_DECLARATION__Group__0__Impl rule__VARIABLE_DECLARATION__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2917:2: rule__VARIABLE_DECLARATION__Group__0__Impl rule__VARIABLE_DECLARATION__Group__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__0__Impl_in_rule__VARIABLE_DECLARATION__Group__05927);
            rule__VARIABLE_DECLARATION__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__1_in_rule__VARIABLE_DECLARATION__Group__05930);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2924:1: rule__VARIABLE_DECLARATION__Group__0__Impl : ( ruleDATA_TYPE ) ;
    public final void rule__VARIABLE_DECLARATION__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2928:1: ( ( ruleDATA_TYPE ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2929:1: ( ruleDATA_TYPE )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2929:1: ( ruleDATA_TYPE )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2930:1: ruleDATA_TYPE
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getDATA_TYPEParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDATA_TYPE_in_rule__VARIABLE_DECLARATION__Group__0__Impl5957);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2941:1: rule__VARIABLE_DECLARATION__Group__1 : rule__VARIABLE_DECLARATION__Group__1__Impl rule__VARIABLE_DECLARATION__Group__2 ;
    public final void rule__VARIABLE_DECLARATION__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2945:1: ( rule__VARIABLE_DECLARATION__Group__1__Impl rule__VARIABLE_DECLARATION__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2946:2: rule__VARIABLE_DECLARATION__Group__1__Impl rule__VARIABLE_DECLARATION__Group__2
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__1__Impl_in_rule__VARIABLE_DECLARATION__Group__15986);
            rule__VARIABLE_DECLARATION__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__2_in_rule__VARIABLE_DECLARATION__Group__15989);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2953:1: rule__VARIABLE_DECLARATION__Group__1__Impl : ( ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS ) ;
    public final void rule__VARIABLE_DECLARATION__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2957:1: ( ( ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2958:1: ( ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2958:1: ( ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2959:1: ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getLIST_OF_VARIABLE_DECL_ASSIGNMENTSParserRuleCall_1()); 
            pushFollow(FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_rule__VARIABLE_DECLARATION__Group__1__Impl6016);
            ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECLARATIONAccess().getLIST_OF_VARIABLE_DECL_ASSIGNMENTSParserRuleCall_1()); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2970:1: rule__VARIABLE_DECLARATION__Group__2 : rule__VARIABLE_DECLARATION__Group__2__Impl ;
    public final void rule__VARIABLE_DECLARATION__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2974:1: ( rule__VARIABLE_DECLARATION__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2975:2: rule__VARIABLE_DECLARATION__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECLARATION__Group__2__Impl_in_rule__VARIABLE_DECLARATION__Group__26045);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2981:1: rule__VARIABLE_DECLARATION__Group__2__Impl : ( ';' ) ;
    public final void rule__VARIABLE_DECLARATION__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2985:1: ( ( ';' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2986:1: ( ';' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2986:1: ( ';' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:2987:1: ';'
            {
             before(grammarAccess.getVARIABLE_DECLARATIONAccess().getSemicolonKeyword_2()); 
            match(input,51,FOLLOW_51_in_rule__VARIABLE_DECLARATION__Group__2__Impl6073); 
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


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3006:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0 : rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1 ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3010:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3011:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__06110);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__06113);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1();

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3018:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl : ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 ) ) ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3022:1: ( ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3023:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3023:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3024:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 )
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3025:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3025:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl6140);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesAssignment_0()); 

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3035:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1 : rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3039:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3040:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__16170);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl();

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3046:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl : ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 )* ) ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3050:1: ( ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3051:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3051:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3052:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 )*
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getGroup_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3053:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==54) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3053:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl6197);
            	    rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getGroup_1()); 

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3067:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0 : rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1 ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3071:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3072:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__06232);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__06235);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1();

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3079:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl : ( ',' ) ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3083:1: ( ( ',' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3084:1: ( ',' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3084:1: ( ',' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3085:1: ','
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getCommaKeyword_1_0()); 
            match(input,54,FOLLOW_54_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl6263); 
             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3098:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1 : rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3102:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3103:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__16294);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl();

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3109:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl : ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 ) ) ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3113:1: ( ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3114:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3114:1: ( ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3115:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 )
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesAssignment_1_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3116:1: ( rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3116:2: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl6321);
            rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesAssignment_1_1()); 

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3130:1: rule__VARIABLE_DECL_ASSIGNMENT__Group__0 : rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group__1 ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3134:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3135:2: rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__06355);
            rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__06358);
            rule__VARIABLE_DECL_ASSIGNMENT__Group__1();

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group__0"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3142:1: rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl : ( ( rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 ) ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3146:1: ( ( ( rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3147:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3147:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3148:1: ( rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 )
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getNameAssignment_0()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3149:1: ( rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3149:2: rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl6385);
            rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3159:1: rule__VARIABLE_DECL_ASSIGNMENT__Group__1 : rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group__2 ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3163:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group__2 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3164:2: rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group__2
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__16415);
            rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__2_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__16418);
            rule__VARIABLE_DECL_ASSIGNMENT__Group__2();

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group__1"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3171:1: rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl : ( ( rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 )* ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3175:1: ( ( ( rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 )* ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3176:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 )* )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3176:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 )* )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3177:1: ( rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 )*
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getDimensionsAssignment_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3178:1: ( rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==57) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3178:2: rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl6445);
            	    rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getDimensionsAssignment_1()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group__2"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3188:1: rule__VARIABLE_DECL_ASSIGNMENT__Group__2 : rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3192:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3193:2: rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__26476);
            rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl();

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group__2"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3199:1: rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl : ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 )? ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3203:1: ( ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 )? ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3204:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 )? )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3204:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 )? )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3205:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 )?
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getGroup_2()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3206:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==56) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3206:2: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl6503);
                    rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3222:1: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0 : rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1 ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3226:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3227:2: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__06540);
            rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__06543);
            rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1();

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3234:1: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl : ( '=' ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3238:1: ( ( '=' ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3239:1: ( '=' )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3239:1: ( '=' )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3240:1: '='
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getEqualsSignKeyword_2_0()); 
            match(input,56,FOLLOW_56_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl6571); 
             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getEqualsSignKeyword_2_0()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3253:1: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1 : rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3257:1: ( rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3258:2: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__16602);
            rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl();

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3264:1: rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl : ( ( rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 ) ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3268:1: ( ( ( rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 ) ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3269:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 ) )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3269:1: ( ( rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3270:1: ( rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 )
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getValueAssignment_2_1()); 
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3271:1: ( rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3271:2: rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl6629);
            rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getValueAssignment_2_1()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3286:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3290:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3291:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3291:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3292:1: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Module__NameAssignment_16668); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3301:1: rule__Module__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__Module__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3305:1: ( ( ruleParameter ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3306:1: ( ruleParameter )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3306:1: ( ruleParameter )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3307:1: ruleParameter
            {
             before(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_16699);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3316:1: rule__Module__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__Module__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3320:1: ( ( ruleParameter ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3321:1: ( ruleParameter )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3321:1: ( ruleParameter )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3322:1: ruleParameter
            {
             before(grammarAccess.getModuleAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_2_16730);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3331:1: rule__Module__PortsAssignment_4_0 : ( rulePort ) ;
    public final void rule__Module__PortsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3335:1: ( ( rulePort ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3336:1: ( rulePort )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3336:1: ( rulePort )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3337:1: rulePort
            {
             before(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_06761);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3346:1: rule__Module__PortsAssignment_4_1_1 : ( rulePort ) ;
    public final void rule__Module__PortsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3350:1: ( ( rulePort ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3351:1: ( rulePort )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3351:1: ( rulePort )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3352:1: rulePort
            {
             before(grammarAccess.getModuleAccess().getPortsPortParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_1_16792);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3361:1: rule__Module__Module_itemsAssignment_7 : ( ruleMODULE_ITEM ) ;
    public final void rule__Module__Module_itemsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3365:1: ( ( ruleMODULE_ITEM ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3366:1: ( ruleMODULE_ITEM )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3366:1: ( ruleMODULE_ITEM )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3367:1: ruleMODULE_ITEM
            {
             before(grammarAccess.getModuleAccess().getModule_itemsMODULE_ITEMParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleMODULE_ITEM_in_rule__Module__Module_itemsAssignment_76823);
            ruleMODULE_ITEM();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getModule_itemsMODULE_ITEMParserRuleCall_7_0()); 

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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3376:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3380:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3381:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3381:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3382:1: RULE_ID
            {
             before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment6854); 
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3391:1: rule__Port__DirectionAssignment_0 : ( rulePORT_DIRECTION ) ;
    public final void rule__Port__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3395:1: ( ( rulePORT_DIRECTION ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3396:1: ( rulePORT_DIRECTION )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3396:1: ( rulePORT_DIRECTION )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3397:1: rulePORT_DIRECTION
            {
             before(grammarAccess.getPortAccess().getDirectionPORT_DIRECTIONParserRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePORT_DIRECTION_in_rule__Port__DirectionAssignment_06885);
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
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3406:1: rule__Port__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Port__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3410:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3411:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3411:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3412:1: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Port__NameAssignment_16916); 
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


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3421:1: rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0 : ( ruleNET_ASSIGNMENT ) ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3425:1: ( ( ruleNET_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3426:1: ( ruleNET_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3426:1: ( ruleNET_ASSIGNMENT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3427:1: ruleNET_ASSIGNMENT
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsNET_ASSIGNMENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNET_ASSIGNMENT_in_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_06947);
            ruleNET_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsNET_ASSIGNMENTParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0"


    // $ANTLR start "rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3436:1: rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1 : ( ruleNET_ASSIGNMENT ) ;
    public final void rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3440:1: ( ( ruleNET_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3441:1: ( ruleNET_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3441:1: ( ruleNET_ASSIGNMENT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3442:1: ruleNET_ASSIGNMENT
            {
             before(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsNET_ASSIGNMENTParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNET_ASSIGNMENT_in_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_16978);
            ruleNET_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getLIST_OF_NET_ASSIGNMENTSAccess().getAssignmentsNET_ASSIGNMENTParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3451:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0 : ( ruleNET_DECL_ASSIGNMENT ) ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3455:1: ( ( ruleNET_DECL_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3456:1: ( ruleNET_DECL_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3456:1: ( ruleNET_DECL_ASSIGNMENT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3457:1: ruleNET_DECL_ASSIGNMENT
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsNET_DECL_ASSIGNMENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNET_DECL_ASSIGNMENT_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_07009);
            ruleNET_DECL_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsNET_DECL_ASSIGNMENTParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0"


    // $ANTLR start "rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3466:1: rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1 : ( ruleNET_DECL_ASSIGNMENT ) ;
    public final void rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3470:1: ( ( ruleNET_DECL_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3471:1: ( ruleNET_DECL_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3471:1: ( ruleNET_DECL_ASSIGNMENT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3472:1: ruleNET_DECL_ASSIGNMENT
            {
             before(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsNET_DECL_ASSIGNMENTParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleNET_DECL_ASSIGNMENT_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_17040);
            ruleNET_DECL_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getLIST_OF_NET_DECL_ASSIGNMENTSAccess().getNetsNET_DECL_ASSIGNMENTParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__NameAssignment_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3481:1: rule__NET_DECL_ASSIGNMENT__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__NET_DECL_ASSIGNMENT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3485:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3486:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3486:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3487:1: RULE_ID
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NET_DECL_ASSIGNMENT__NameAssignment_07071); 
             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__NameAssignment_0"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3496:1: rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1 : ( ruleUNPACKED_DIMENSIONS ) ;
    public final void rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3500:1: ( ( ruleUNPACKED_DIMENSIONS ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3501:1: ( ruleUNPACKED_DIMENSIONS )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3501:1: ( ruleUNPACKED_DIMENSIONS )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3502:1: ruleUNPACKED_DIMENSIONS
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getDimensionsUNPACKED_DIMENSIONSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUNPACKED_DIMENSIONS_in_rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_17102);
            ruleUNPACKED_DIMENSIONS();

            state._fsp--;

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getDimensionsUNPACKED_DIMENSIONSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1"


    // $ANTLR start "rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3511:1: rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1 : ( ruleNUMBER ) ;
    public final void rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3515:1: ( ( ruleNUMBER ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3516:1: ( ruleNUMBER )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3516:1: ( ruleNUMBER )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3517:1: ruleNUMBER
            {
             before(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getValueNUMBERParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleNUMBER_in_rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_17133);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNET_DECL_ASSIGNMENTAccess().getValueNUMBERParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3526:1: rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1 : ( RULE_INT ) ;
    public final void rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3530:1: ( ( RULE_INT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3531:1: ( RULE_INT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3531:1: ( RULE_INT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3532:1: RULE_INT
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeft_boundINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__UNPACKED_DIMENSIONS__Left_boundAssignment_17164); 
             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getLeft_boundINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1"


    // $ANTLR start "rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3541:1: rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3 : ( RULE_INT ) ;
    public final void rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3545:1: ( ( RULE_INT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3546:1: ( RULE_INT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3546:1: ( RULE_INT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3547:1: RULE_INT
            {
             before(grammarAccess.getUNPACKED_DIMENSIONSAccess().getRight_boundINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__UNPACKED_DIMENSIONS__Right_boundAssignment_37195); 
             after(grammarAccess.getUNPACKED_DIMENSIONSAccess().getRight_boundINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3556:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0 : ( ruleVARIABLE_DECL_ASSIGNMENT ) ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3560:1: ( ( ruleVARIABLE_DECL_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3561:1: ( ruleVARIABLE_DECL_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3561:1: ( ruleVARIABLE_DECL_ASSIGNMENT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3562:1: ruleVARIABLE_DECL_ASSIGNMENT
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesVARIABLE_DECL_ASSIGNMENTParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_07226);
            ruleVARIABLE_DECL_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesVARIABLE_DECL_ASSIGNMENTParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0"


    // $ANTLR start "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3571:1: rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1 : ( ruleVARIABLE_DECL_ASSIGNMENT ) ;
    public final void rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3575:1: ( ( ruleVARIABLE_DECL_ASSIGNMENT ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3576:1: ( ruleVARIABLE_DECL_ASSIGNMENT )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3576:1: ( ruleVARIABLE_DECL_ASSIGNMENT )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3577:1: ruleVARIABLE_DECL_ASSIGNMENT
            {
             before(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesVARIABLE_DECL_ASSIGNMENTParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_17257);
            ruleVARIABLE_DECL_ASSIGNMENT();

            state._fsp--;

             after(grammarAccess.getLIST_OF_VARIABLE_DECL_ASSIGNMENTSAccess().getVariablesVARIABLE_DECL_ASSIGNMENTParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3586:1: rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3590:1: ( ( RULE_ID ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3591:1: ( RULE_ID )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3591:1: ( RULE_ID )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3592:1: RULE_ID
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_07288); 
             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3601:1: rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1 : ( ruleUNPACKED_DIMENSIONS ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3605:1: ( ( ruleUNPACKED_DIMENSIONS ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3606:1: ( ruleUNPACKED_DIMENSIONS )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3606:1: ( ruleUNPACKED_DIMENSIONS )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3607:1: ruleUNPACKED_DIMENSIONS
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getDimensionsUNPACKED_DIMENSIONSParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleUNPACKED_DIMENSIONS_in_rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_17319);
            ruleUNPACKED_DIMENSIONS();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getDimensionsUNPACKED_DIMENSIONSParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1"


    // $ANTLR start "rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1"
    // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3616:1: rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1 : ( ruleNUMBER ) ;
    public final void rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3620:1: ( ( ruleNUMBER ) )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3621:1: ( ruleNUMBER )
            {
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3621:1: ( ruleNUMBER )
            // ../com.ironglass.hdlforge.ui/src-gen/com/ironglass/hdlforge/ui/contentassist/antlr/internal/InternalSystemVerilog.g:3622:1: ruleNUMBER
            {
             before(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getValueNUMBERParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleNUMBER_in_rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_17350);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getVARIABLE_DECL_ASSIGNMENTAccess().getValueNUMBERParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModule_in_entryRuleModule61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModule68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0_in_ruleModule94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__NameAssignment_in_ruleParameter154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_entryRulePort181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePort188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0_in_rulePort214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_ITEM_in_entryRuleMODULE_ITEM241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_ITEM248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNON_PORT_MODULE_ITEM_in_ruleMODULE_ITEM274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNON_PORT_MODULE_ITEM_in_entryRuleNON_PORT_MODULE_ITEM300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNON_PORT_MODULE_ITEM307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_ruleNON_PORT_MODULE_ITEM333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_in_entryRuleMODULE_OR_GENERATE_ITEM359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_COMMON_ITEM_in_ruleMODULE_OR_GENERATE_ITEM392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_COMMON_ITEM_in_entryRuleMODULE_COMMON_ITEM418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_COMMON_ITEM425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MODULE_COMMON_ITEM__Alternatives_in_ruleMODULE_COMMON_ITEM451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTINUOUS_ASSIGN_in_entryRuleCONTINUOUS_ASSIGN478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCONTINUOUS_ASSIGN485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__0_in_ruleCONTINUOUS_ASSIGN511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_entryRuleLIST_OF_NET_ASSIGNMENTS538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIST_OF_NET_ASSIGNMENTS545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__0_in_ruleLIST_OF_NET_ASSIGNMENTS571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_ASSIGNMENT_in_entryRuleNET_ASSIGNMENT598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_ASSIGNMENT605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_ASSIGNMENT__Group__0_in_ruleNET_ASSIGNMENT631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_LVALUE_in_entryRuleNET_LVALUE658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_LVALUE665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_ruleNET_LVALUE691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePS_OR_HIERARCHICAL_NET_IDENTIFIER724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_IDENTIFIER_in_rulePS_OR_HIERARCHICAL_NET_IDENTIFIER750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_IDENTIFIER_in_entryRuleNET_IDENTIFIER776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_IDENTIFIER783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_IDENTIFIER_in_ruleNET_IDENTIFIER809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSIMPLE_IDENTIFIER_in_entryRuleSIMPLE_IDENTIFIER835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSIMPLE_IDENTIFIER842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSIMPLE_IDENTIFIER868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_OR_GENERATE_ITEM_DECLARATION901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_ruleMODULE_OR_GENERATE_ITEM_DECLARATION927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePACKAGE_OR_GENERATE_ITEM_DECLARATION960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives_in_rulePACKAGE_OR_GENERATE_ITEM_DECLARATION986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECLARATION_in_entryRuleNET_DECLARATION1013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_DECLARATION1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECLARATION__Group__0_in_ruleNET_DECLARATION1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS1073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIST_OF_NET_DECL_ASSIGNMENTS1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0_in_ruleLIST_OF_NET_DECL_ASSIGNMENTS1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECL_ASSIGNMENT_in_entryRuleNET_DECL_ASSIGNMENT1133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_DECL_ASSIGNMENT1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__0_in_ruleNET_DECL_ASSIGNMENT1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNPACKED_DIMENSIONS_in_entryRuleUNPACKED_DIMENSIONS1193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUNPACKED_DIMENSIONS1200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__0_in_ruleUNPACKED_DIMENSIONS1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_OR_TRIREG_in_entryRuleNET_TYPE_OR_TRIREG1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_TYPE_OR_TRIREG1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_TYPE_OR_TRIREG__Alternatives_in_ruleNET_TYPE_OR_TRIREG1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_in_entryRuleNET_TYPE1313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNET_TYPE1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_TYPE__Alternatives_in_ruleNET_TYPE1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_DECLARATION_in_entryRuleDATA_DECLARATION1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATA_DECLARATION1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DATA_DECLARATION__Group__0_in_ruleDATA_DECLARATION1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIFETIME_in_entryRuleLIFETIME1433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIFETIME1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIFETIME__Alternatives_in_ruleLIFETIME1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_entryRuleVARIABLE_DECLARATION1493 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_DECLARATION1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__0_in_ruleVARIABLE_DECLARATION1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS1553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLIST_OF_VARIABLE_DECL_ASSIGNMENTS1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0_in_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_entryRuleVARIABLE_DECL_ASSIGNMENT1613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_DECL_ASSIGNMENT1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__0_in_ruleVARIABLE_DECL_ASSIGNMENT1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_entryRuleDATA_TYPE1673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATA_TYPE1680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_ruleDATA_TYPE1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_VECTOR_TYPE_in_entryRuleINTEGER_VECTOR_TYPE1732 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER_VECTOR_TYPE1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__INTEGER_VECTOR_TYPE__Alternatives_in_ruleINTEGER_VECTOR_TYPE1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_entryRuleMODULE_KEYWORD1792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMODULE_KEYWORD1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MODULE_KEYWORD__Alternatives_in_ruleMODULE_KEYWORD1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_entryRulePORT_DIRECTION1852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePORT_DIRECTION1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PORT_DIRECTION__Alternatives_in_rulePORT_DIRECTION1885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Alternatives_in_ruleNUMBER1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_OR_GENERATE_ITEM_DECLARATION_in_rule__MODULE_COMMON_ITEM__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCONTINUOUS_ASSIGN_in_rule__MODULE_COMMON_ITEM__Alternatives1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECLARATION_in_rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_DECLARATION_in_rule__PACKAGE_OR_GENERATE_ITEM_DECLARATION__Alternatives2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_in_rule__NET_TYPE_OR_TRIREG__Alternatives2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__NET_TYPE_OR_TRIREG__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__NET_TYPE__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__NET_TYPE__Alternatives2152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__NET_TYPE__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__NET_TYPE__Alternatives2192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__NET_TYPE__Alternatives2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NET_TYPE__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NET_TYPE__Alternatives2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NET_TYPE__Alternatives2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NET_TYPE__Alternatives2292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__NET_TYPE__Alternatives2312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__LIFETIME__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__LIFETIME__Alternatives2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__INTEGER_VECTOR_TYPE__Alternatives2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__INTEGER_VECTOR_TYPE__Alternatives2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__INTEGER_VECTOR_TYPE__Alternatives2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__MODULE_KEYWORD__Alternatives2477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__MODULE_KEYWORD__Alternatives2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__PORT_DIRECTION__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__PORT_DIRECTION__Alternatives2552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PORT_DIRECTION__Alternatives2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PORT_DIRECTION__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BINARY_NUMBER_in_rule__NUMBER__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_OCTAL_NUMBER_in_rule__NUMBER__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_NUMBER_in_rule__NUMBER__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_NUMBER_in_rule__NUMBER__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__0__Impl_in_rule__Module__Group__02707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group__1_in_rule__Module__Group__02710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_KEYWORD_in_rule__Module__Group__0__Impl2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__1__Impl_in_rule__Module__Group__12766 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__2_in_rule__Module__Group__12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__NameAssignment_1_in_rule__Module__Group__1__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__2__Impl_in_rule__Module__Group__22826 = new BitSet(new long[]{0x0022000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__3_in_rule__Module__Group__22829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0_in_rule__Module__Group__2__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__3__Impl_in_rule__Module__Group__32887 = new BitSet(new long[]{0x0005E00000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__4_in_rule__Module__Group__32890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Module__Group__3__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__4__Impl_in_rule__Module__Group__42949 = new BitSet(new long[]{0x0005E00000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__5_in_rule__Module__Group__42952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0_in_rule__Module__Group__4__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__5__Impl_in_rule__Module__Group__53010 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group__6_in_rule__Module__Group__53013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Module__Group__5__Impl3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__6__Impl_in_rule__Module__Group__63072 = new BitSet(new long[]{0x109007FFF8000000L});
    public static final BitSet FOLLOW_rule__Module__Group__7_in_rule__Module__Group__63075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Module__Group__6__Impl3103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group__7__Impl_in_rule__Module__Group__73134 = new BitSet(new long[]{0x109007FFF8000000L});
    public static final BitSet FOLLOW_rule__Module__Group__8_in_rule__Module__Group__73137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Module_itemsAssignment_7_in_rule__Module__Group__7__Impl3164 = new BitSet(new long[]{0x108007FFF8000002L});
    public static final BitSet FOLLOW_rule__Module__Group__8__Impl_in_rule__Module__Group__83195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Module__Group__8__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__0__Impl_in_rule__Module__Group_2__03272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1_in_rule__Module__Group_2__03275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Module__Group_2__0__Impl3303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__1__Impl_in_rule__Module__Group_2__13334 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2_in_rule__Module__Group_2__13337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ParametersAssignment_2_1_in_rule__Module__Group_2__1__Impl3364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__2__Impl_in_rule__Module__Group_2__23394 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_2__3_in_rule__Module__Group_2__23397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__0_in_rule__Module__Group_2__2__Impl3424 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2__3__Impl_in_rule__Module__Group_2__33455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Module__Group_2__3__Impl3483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__0__Impl_in_rule__Module__Group_2_2__03522 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__1_in_rule__Module__Group_2_2__03525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Module__Group_2_2__0__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_2_2__1__Impl_in_rule__Module__Group_2_2__13584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__ParametersAssignment_2_2_1_in_rule__Module__Group_2_2__1__Impl3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__0__Impl_in_rule__Module__Group_4__03645 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1_in_rule__Module__Group_4__03648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PortsAssignment_4_0_in_rule__Module__Group_4__0__Impl3675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4__1__Impl_in_rule__Module__Group_4__13705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__0_in_rule__Module__Group_4__1__Impl3732 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__0__Impl_in_rule__Module__Group_4_1__03767 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__1_in_rule__Module__Group_4_1__03770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Module__Group_4_1__0__Impl3798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__Group_4_1__1__Impl_in_rule__Module__Group_4_1__13829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Module__PortsAssignment_4_1_1_in_rule__Module__Group_4_1__1__Impl3856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__0__Impl_in_rule__Port__Group__03890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Port__Group__1_in_rule__Port__Group__03893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__DirectionAssignment_0_in_rule__Port__Group__0__Impl3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__Group__1__Impl_in_rule__Port__Group__13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Port__NameAssignment_1_in_rule__Port__Group__1__Impl3977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__0__Impl_in_rule__CONTINUOUS_ASSIGN__Group__04011 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__1_in_rule__CONTINUOUS_ASSIGN__Group__04014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__CONTINUOUS_ASSIGN__Group__0__Impl4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__1__Impl_in_rule__CONTINUOUS_ASSIGN__Group__14073 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__2_in_rule__CONTINUOUS_ASSIGN__Group__14076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DRIVE_STRENGTH_in_rule__CONTINUOUS_ASSIGN__Group__1__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__2__Impl_in_rule__CONTINUOUS_ASSIGN__Group__24135 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__3_in_rule__CONTINUOUS_ASSIGN__Group__24138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_ASSIGNMENTS_in_rule__CONTINUOUS_ASSIGN__Group__2__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CONTINUOUS_ASSIGN__Group__3__Impl_in_rule__CONTINUOUS_ASSIGN__Group__34194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__CONTINUOUS_ASSIGN__Group__3__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__04261 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__1_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__04264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_0_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__0__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__14321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0_in_rule__LIST_OF_NET_ASSIGNMENTS__Group__1__Impl4348 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__04383 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__04386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__0__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__14445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_1_in_rule__LIST_OF_NET_ASSIGNMENTS__Group_1__1__Impl4472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_ASSIGNMENT__Group__0__Impl_in_rule__NET_ASSIGNMENT__Group__04506 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_rule__NET_ASSIGNMENT__Group__1_in_rule__NET_ASSIGNMENT__Group__04509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_LVALUE_in_rule__NET_ASSIGNMENT__Group__0__Impl4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_ASSIGNMENT__Group__1__Impl_in_rule__NET_ASSIGNMENT__Group__14565 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__NET_ASSIGNMENT__Group__2_in_rule__NET_ASSIGNMENT__Group__14568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__NET_ASSIGNMENT__Group__1__Impl4596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_ASSIGNMENT__Group__2__Impl_in_rule__NET_ASSIGNMENT__Group__24627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NET_ASSIGNMENT__Group__2__Impl4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECLARATION__Group__0__Impl_in_rule__NET_DECLARATION__Group__04689 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NET_DECLARATION__Group__1_in_rule__NET_DECLARATION__Group__04692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_TYPE_OR_TRIREG_in_rule__NET_DECLARATION__Group__0__Impl4719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECLARATION__Group__1__Impl_in_rule__NET_DECLARATION__Group__14748 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__NET_DECLARATION__Group__2_in_rule__NET_DECLARATION__Group__14751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_NET_DECL_ASSIGNMENTS_in_rule__NET_DECLARATION__Group__1__Impl4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECLARATION__Group__2__Impl_in_rule__NET_DECLARATION__Group__24807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__NET_DECLARATION__Group__2__Impl4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__04872 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__04875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_0_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__0__Impl4902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__14932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group__1__Impl4959 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__04994 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__0__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__15056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_1_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__Group_1__1__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__0__Impl_in_rule__NET_DECL_ASSIGNMENT__Group__05117 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__1_in_rule__NET_DECL_ASSIGNMENT__Group__05120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__NameAssignment_0_in_rule__NET_DECL_ASSIGNMENT__Group__0__Impl5147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__1__Impl_in_rule__NET_DECL_ASSIGNMENT__Group__15177 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__2_in_rule__NET_DECL_ASSIGNMENT__Group__15180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_1_in_rule__NET_DECL_ASSIGNMENT__Group__1__Impl5207 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group__2__Impl_in_rule__NET_DECL_ASSIGNMENT__Group__25238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__0_in_rule__NET_DECL_ASSIGNMENT__Group__2__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl_in_rule__NET_DECL_ASSIGNMENT__Group_2__05302 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__1_in_rule__NET_DECL_ASSIGNMENT__Group_2__05305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__NET_DECL_ASSIGNMENT__Group_2__0__Impl5333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl_in_rule__NET_DECL_ASSIGNMENT__Group_2__15364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_1_in_rule__NET_DECL_ASSIGNMENT__Group_2__1__Impl5391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__0__Impl_in_rule__UNPACKED_DIMENSIONS__Group__05425 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__1_in_rule__UNPACKED_DIMENSIONS__Group__05428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__UNPACKED_DIMENSIONS__Group__0__Impl5456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__1__Impl_in_rule__UNPACKED_DIMENSIONS__Group__15487 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__2_in_rule__UNPACKED_DIMENSIONS__Group__15490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Left_boundAssignment_1_in_rule__UNPACKED_DIMENSIONS__Group__1__Impl5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__2__Impl_in_rule__UNPACKED_DIMENSIONS__Group__25547 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__3_in_rule__UNPACKED_DIMENSIONS__Group__25550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__UNPACKED_DIMENSIONS__Group__2__Impl5578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__3__Impl_in_rule__UNPACKED_DIMENSIONS__Group__35609 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__4_in_rule__UNPACKED_DIMENSIONS__Group__35612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Right_boundAssignment_3_in_rule__UNPACKED_DIMENSIONS__Group__3__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UNPACKED_DIMENSIONS__Group__4__Impl_in_rule__UNPACKED_DIMENSIONS__Group__45669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__UNPACKED_DIMENSIONS__Group__4__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DATA_DECLARATION__Group__0__Impl_in_rule__DATA_DECLARATION__Group__05738 = new BitSet(new long[]{0x100007FFF8000000L});
    public static final BitSet FOLLOW_rule__DATA_DECLARATION__Group__1_in_rule__DATA_DECLARATION__Group__05741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__DATA_DECLARATION__Group__0__Impl5770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DATA_DECLARATION__Group__1__Impl_in_rule__DATA_DECLARATION__Group__15803 = new BitSet(new long[]{0x100007FFF8000000L});
    public static final BitSet FOLLOW_rule__DATA_DECLARATION__Group__2_in_rule__DATA_DECLARATION__Group__15806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIFETIME_in_rule__DATA_DECLARATION__Group__1__Impl5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DATA_DECLARATION__Group__2__Impl_in_rule__DATA_DECLARATION__Group__25865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECLARATION_in_rule__DATA_DECLARATION__Group__2__Impl5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__0__Impl_in_rule__VARIABLE_DECLARATION__Group__05927 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__1_in_rule__VARIABLE_DECLARATION__Group__05930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATA_TYPE_in_rule__VARIABLE_DECLARATION__Group__0__Impl5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__1__Impl_in_rule__VARIABLE_DECLARATION__Group__15986 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__2_in_rule__VARIABLE_DECLARATION__Group__15989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLIST_OF_VARIABLE_DECL_ASSIGNMENTS_in_rule__VARIABLE_DECLARATION__Group__1__Impl6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECLARATION__Group__2__Impl_in_rule__VARIABLE_DECLARATION__Group__26045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__VARIABLE_DECLARATION__Group__2__Impl6073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__06110 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__06113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_0_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__0__Impl6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group__1__Impl6197 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__06232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__06235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__0__Impl6263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_1_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__Group_1__1__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__06355 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__06358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_0_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__0__Impl6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__16415 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__2_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__16418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__1__Impl6445 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__26476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0_in_rule__VARIABLE_DECL_ASSIGNMENT__Group__2__Impl6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__06540 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__06543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__0__Impl6571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__16602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_1_in_rule__VARIABLE_DECL_ASSIGNMENT__Group_2__1__Impl6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Module__NameAssignment_16668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_16699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__Module__ParametersAssignment_2_2_16730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_06761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePort_in_rule__Module__PortsAssignment_4_1_16792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMODULE_ITEM_in_rule__Module__Module_itemsAssignment_76823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameter__NameAssignment6854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePORT_DIRECTION_in_rule__Port__DirectionAssignment_06885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Port__NameAssignment_16916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_ASSIGNMENT_in_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_06947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_ASSIGNMENT_in_rule__LIST_OF_NET_ASSIGNMENTS__AssignmentsAssignment_1_16978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECL_ASSIGNMENT_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_07009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNET_DECL_ASSIGNMENT_in_rule__LIST_OF_NET_DECL_ASSIGNMENTS__NetsAssignment_1_17040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NET_DECL_ASSIGNMENT__NameAssignment_07071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNPACKED_DIMENSIONS_in_rule__NET_DECL_ASSIGNMENT__DimensionsAssignment_17102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NET_DECL_ASSIGNMENT__ValueAssignment_2_17133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__UNPACKED_DIMENSIONS__Left_boundAssignment_17164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__UNPACKED_DIMENSIONS__Right_boundAssignment_37195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_07226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_DECL_ASSIGNMENT_in_rule__LIST_OF_VARIABLE_DECL_ASSIGNMENTS__VariablesAssignment_1_17257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_DECL_ASSIGNMENT__NameAssignment_07288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUNPACKED_DIMENSIONS_in_rule__VARIABLE_DECL_ASSIGNMENT__DimensionsAssignment_17319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__VARIABLE_DECL_ASSIGNMENT__ValueAssignment_2_17350 = new BitSet(new long[]{0x0000000000000002L});

}