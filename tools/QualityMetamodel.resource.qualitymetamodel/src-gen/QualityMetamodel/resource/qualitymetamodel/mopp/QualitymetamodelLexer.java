// $ANTLR 3.4

	package QualityMetamodel.resource.qualitymetamodel.mopp;


import org.antlr.runtime3_4_0.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class QualitymetamodelLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int ADDOP=4;
    public static final int BAGTYPE=5;
    public static final int BOOLEANTYPE=6;
    public static final int BOOLOP=7;
    public static final int COLLECTIONTYPE=8;
    public static final int COMMENT=9;
    public static final int ENVTYPE=10;
    public static final int EQ=11;
    public static final int FLOAT=12;
    public static final int INTEGER=13;
    public static final int INTEGERTYPE=14;
    public static final int INTOP=15;
    public static final int LAMBDATYPE=16;
    public static final int LINEBREAK=17;
    public static final int MAPTYPE=18;
    public static final int MULOP=19;
    public static final int NEQ=20;
    public static final int NOTOP=21;
    public static final int OCLANYTYPE=22;
    public static final int OCLTYPE=23;
    public static final int ORDEREDSETTYPE=24;
    public static final int QUOTED_34_34_92=25;
    public static final int QUOTED_39_39_92=26;
    public static final int REALTYPE=27;
    public static final int RELOP=28;
    public static final int SEQUENCETYPE=29;
    public static final int SETTYPE=30;
    public static final int STRINGTYPE=31;
    public static final int TEXT=32;
    public static final int TUPLE=33;
    public static final int TUPLETYPE=34;
    public static final int WHITESPACE=35;

    	public java.util.List<org.antlr.runtime3_4_0.RecognitionException> lexerExceptions  = new java.util.ArrayList<org.antlr.runtime3_4_0.RecognitionException>();
    	public java.util.List<Integer> lexerExceptionsPosition = new java.util.ArrayList<Integer>();
    	
    	public void reportError(org.antlr.runtime3_4_0.RecognitionException e) {
    		lexerExceptions.add(e);
    		lexerExceptionsPosition.add(((org.antlr.runtime3_4_0.ANTLRStringStream) input).index());
    	}


    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public QualitymetamodelLexer() {} 
    public QualitymetamodelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public QualitymetamodelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Qualitymetamodel.g"; }

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:15:7: ( '!' )
            // Qualitymetamodel.g:15:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16:7: ( '#' )
            // Qualitymetamodel.g:16:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:17:7: ( '(' )
            // Qualitymetamodel.g:17:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:18:7: ( ')' )
            // Qualitymetamodel.g:18:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:19:7: ( ',' )
            // Qualitymetamodel.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:20:7: ( '->' )
            // Qualitymetamodel.g:20:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:21:7: ( '.' )
            // Qualitymetamodel.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:22:7: ( '..' )
            // Qualitymetamodel.g:22:9: '..'
            {
            match(".."); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:23:7: ( ':' )
            // Qualitymetamodel.g:23:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:24:7: ( '::' )
            // Qualitymetamodel.g:24:9: '::'
            {
            match("::"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:25:7: ( ';' )
            // Qualitymetamodel.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:26:7: ( 'AggregatedValueMetric' )
            // Qualitymetamodel.g:26:9: 'AggregatedValueMetric'
            {
            match("AggregatedValueMetric"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:27:7: ( 'Boolean,' )
            // Qualitymetamodel.g:27:9: 'Boolean,'
            {
            match("Boolean,"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:28:7: ( 'Integer,' )
            // Qualitymetamodel.g:28:9: 'Integer,'
            {
            match("Integer,"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:29:7: ( 'OclUndefined' )
            // Qualitymetamodel.g:29:9: 'OclUndefined'
            {
            match("OclUndefined"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:30:7: ( 'Real,' )
            // Qualitymetamodel.g:30:9: 'Real,'
            {
            match("Real,"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:31:7: ( 'String,' )
            // Qualitymetamodel.g:31:9: 'String,'
            {
            match("String,"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:32:7: ( 'UNSET' )
            // Qualitymetamodel.g:32:9: 'UNSET'
            {
            match("UNSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:33:7: ( '[' )
            // Qualitymetamodel.g:33:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:34:7: ( ']' )
            // Qualitymetamodel.g:34:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:35:7: ( '],' )
            // Qualitymetamodel.g:35:9: '],'
            {
            match("],"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:36:7: ( '_type:' )
            // Qualitymetamodel.g:36:9: '_type:'
            {
            match("_type:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:37:7: ( 'aggregatedValue:' )
            // Qualitymetamodel.g:37:9: 'aggregatedValue:'
            {
            match("aggregatedValue:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:38:7: ( 'calculatedBy:' )
            // Qualitymetamodel.g:38:9: 'calculatedBy:'
            {
            match("calculatedBy:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:39:7: ( 'context' )
            // Qualitymetamodel.g:39:9: 'context'
            {
            match("context"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:40:7: ( 'def' )
            // Qualitymetamodel.g:40:9: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:41:7: ( 'description:' )
            // Qualitymetamodel.g:41:9: 'description:'
            {
            match("description:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:42:7: ( 'else' )
            // Qualitymetamodel.g:42:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:43:7: ( 'endif' )
            // Qualitymetamodel.g:43:9: 'endif'
            {
            match("endif"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:44:7: ( 'env' )
            // Qualitymetamodel.g:44:9: 'env'
            {
            match("env"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:45:7: ( 'expr:' )
            // Qualitymetamodel.g:45:9: 'expr:'
            {
            match("expr:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:46:7: ( 'false' )
            // Qualitymetamodel.g:46:9: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:47:7: ( 'id:' )
            // Qualitymetamodel.g:47:9: 'id:'
            {
            match("id:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:48:7: ( 'if' )
            // Qualitymetamodel.g:48:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:49:7: ( 'import' )
            // Qualitymetamodel.g:49:9: 'import'
            {
            match("import"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:50:7: ( 'in' )
            // Qualitymetamodel.g:50:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:51:7: ( 'iterate' )
            // Qualitymetamodel.g:51:9: 'iterate'
            {
            match("iterate"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:52:7: ( 'let' )
            // Qualitymetamodel.g:52:9: 'let'
            {
            match("let"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:53:7: ( 'measuredBy:' )
            // Qualitymetamodel.g:53:9: 'measuredBy:'
            {
            match("measuredBy:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:54:7: ( 'metamodel' )
            // Qualitymetamodel.g:54:9: 'metamodel'
            {
            match("metamodel"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:55:7: ( 'metricProviders:' )
            // Qualitymetamodel.g:55:9: 'metricProviders:'
            {
            match("metricProviders:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:56:7: ( 'module' )
            // Qualitymetamodel.g:56:9: 'module'
            {
            match("module"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:57:7: ( 'name:' )
            // Qualitymetamodel.g:57:9: 'name:'
            {
            match("name:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:58:7: ( 'qualityAttributes:' )
            // Qualitymetamodel.g:58:9: 'qualityAttributes:'
            {
            match("qualityAttributes:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:59:7: ( 'qualityTypes:' )
            // Qualitymetamodel.g:59:9: 'qualityTypes:'
            {
            match("qualityTypes:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:60:7: ( 'qualityValues:' )
            // Qualitymetamodel.g:60:9: 'qualityValues:'
            {
            match("qualityValues:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:61:7: ( 'self' )
            // Qualitymetamodel.g:61:9: 'self'
            {
            match("self"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:62:7: ( 'set:' )
            // Qualitymetamodel.g:62:9: 'set:'
            {
            match("set:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:63:7: ( 'static' )
            // Qualitymetamodel.g:63:9: 'static'
            {
            match("static"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:64:7: ( 'super' )
            // Qualitymetamodel.g:64:9: 'super'
            {
            match("super"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:65:7: ( 'then' )
            // Qualitymetamodel.g:65:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:66:7: ( 'true' )
            // Qualitymetamodel.g:66:9: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:67:7: ( 'type:' )
            // Qualitymetamodel.g:67:9: 'type:'
            {
            match("type:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:68:7: ( 'value:' )
            // Qualitymetamodel.g:68:9: 'value:'
            {
            match("value:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:69:7: ( 'values:' )
            // Qualitymetamodel.g:69:9: 'values:'
            {
            match("values:"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:70:7: ( '{' )
            // Qualitymetamodel.g:70:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:71:7: ( '|' )
            // Qualitymetamodel.g:71:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:72:7: ( '}' )
            // Qualitymetamodel.g:72:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "NOTOP"
    public final void mNOTOP() throws RecognitionException {
        try {
            int _type = NOTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16838:6: ( ( 'not' ) )
            // Qualitymetamodel.g:16839:2: ( 'not' )
            {
            // Qualitymetamodel.g:16839:2: ( 'not' )
            // Qualitymetamodel.g:16839:2: 'not'
            {
            match("not"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTOP"

    // $ANTLR start "BOOLOP"
    public final void mBOOLOP() throws RecognitionException {
        try {
            int _type = BOOLOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16841:7: ( ( ( 'and' | 'or' | 'xor' | 'implies' ) ) )
            // Qualitymetamodel.g:16842:2: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            {
            // Qualitymetamodel.g:16842:2: ( ( 'and' | 'or' | 'xor' | 'implies' ) )
            // Qualitymetamodel.g:16842:2: ( 'and' | 'or' | 'xor' | 'implies' )
            {
            // Qualitymetamodel.g:16842:2: ( 'and' | 'or' | 'xor' | 'implies' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt1=1;
                }
                break;
            case 'o':
                {
                alt1=2;
                }
                break;
            case 'x':
                {
                alt1=3;
                }
                break;
            case 'i':
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // Qualitymetamodel.g:16842:3: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // Qualitymetamodel.g:16842:9: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 3 :
                    // Qualitymetamodel.g:16842:14: 'xor'
                    {
                    match("xor"); 



                    }
                    break;
                case 4 :
                    // Qualitymetamodel.g:16842:20: 'implies'
                    {
                    match("implies"); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLOP"

    // $ANTLR start "INTOP"
    public final void mINTOP() throws RecognitionException {
        try {
            int _type = INTOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16844:6: ( ( ( 'div' | 'mod' ) ) )
            // Qualitymetamodel.g:16845:2: ( ( 'div' | 'mod' ) )
            {
            // Qualitymetamodel.g:16845:2: ( ( 'div' | 'mod' ) )
            // Qualitymetamodel.g:16845:2: ( 'div' | 'mod' )
            {
            // Qualitymetamodel.g:16845:2: ( 'div' | 'mod' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='d') ) {
                alt2=1;
            }
            else if ( (LA2_0=='m') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // Qualitymetamodel.g:16845:3: 'div'
                    {
                    match("div"); 



                    }
                    break;
                case 2 :
                    // Qualitymetamodel.g:16845:9: 'mod'
                    {
                    match("mod"); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTOP"

    // $ANTLR start "RELOP"
    public final void mRELOP() throws RecognitionException {
        try {
            int _type = RELOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16847:6: ( ( ( '>' | '<' | '>=' | '<=' ) ) )
            // Qualitymetamodel.g:16848:2: ( ( '>' | '<' | '>=' | '<=' ) )
            {
            // Qualitymetamodel.g:16848:2: ( ( '>' | '<' | '>=' | '<=' ) )
            // Qualitymetamodel.g:16848:2: ( '>' | '<' | '>=' | '<=' )
            {
            // Qualitymetamodel.g:16848:2: ( '>' | '<' | '>=' | '<=' )
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='>') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='=') ) {
                    alt3=3;
                }
                else {
                    alt3=1;
                }
            }
            else if ( (LA3_0=='<') ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2=='=') ) {
                    alt3=4;
                }
                else {
                    alt3=2;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Qualitymetamodel.g:16848:3: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // Qualitymetamodel.g:16848:7: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Qualitymetamodel.g:16848:11: '>='
                    {
                    match(">="); 



                    }
                    break;
                case 4 :
                    // Qualitymetamodel.g:16848:16: '<='
                    {
                    match("<="); 



                    }
                    break;

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RELOP"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16850:3: ( ( '=' ) )
            // Qualitymetamodel.g:16851:2: ( '=' )
            {
            // Qualitymetamodel.g:16851:2: ( '=' )
            // Qualitymetamodel.g:16851:2: '='
            {
            match('='); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "NEQ"
    public final void mNEQ() throws RecognitionException {
        try {
            int _type = NEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16853:4: ( ( '<>' ) )
            // Qualitymetamodel.g:16854:2: ( '<>' )
            {
            // Qualitymetamodel.g:16854:2: ( '<>' )
            // Qualitymetamodel.g:16854:2: '<>'
            {
            match("<>"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEQ"

    // $ANTLR start "ADDOP"
    public final void mADDOP() throws RecognitionException {
        try {
            int _type = ADDOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16856:6: ( ( ( '-' | '+' ) ) )
            // Qualitymetamodel.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ADDOP"

    // $ANTLR start "MULOP"
    public final void mMULOP() throws RecognitionException {
        try {
            int _type = MULOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16859:6: ( ( ( '*' | '/' ) ) )
            // Qualitymetamodel.g:
            {
            if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULOP"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16862:8: ( ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* ) )
            // Qualitymetamodel.g:16863:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            {
            // Qualitymetamodel.g:16863:2: ( '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )* )
            // Qualitymetamodel.g:16863:2: '--' (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            {
            match("--"); 



            // Qualitymetamodel.g:16863:6: (~ ( '\\n' | '\\r' | '\\uffff' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '\u0000' && LA4_0 <= '\t')||(LA4_0 >= '\u000B' && LA4_0 <= '\f')||(LA4_0 >= '\u000E' && LA4_0 <= '\uFFFE')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Qualitymetamodel.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFE') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16866:6: ( ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ ) )
            // Qualitymetamodel.g:16867:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            {
            // Qualitymetamodel.g:16867:2: ( ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+ )
            // Qualitymetamodel.g:16867:2: ( '-' )? ( ( '0' .. '9' ) )+ '.' ( ( '0' .. '9' ) )+
            {
            // Qualitymetamodel.g:16867:2: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Qualitymetamodel.g:16867:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Qualitymetamodel.g:16867:6: ( ( '0' .. '9' ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Qualitymetamodel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            match('.'); 

            // Qualitymetamodel.g:16867:22: ( ( '0' .. '9' ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Qualitymetamodel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16869:8: ( ( ( '-' )? ( ( '0' .. '9' ) )+ ) )
            // Qualitymetamodel.g:16870:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            {
            // Qualitymetamodel.g:16870:2: ( ( '-' )? ( ( '0' .. '9' ) )+ )
            // Qualitymetamodel.g:16870:2: ( '-' )? ( ( '0' .. '9' ) )+
            {
            // Qualitymetamodel.g:16870:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='-') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Qualitymetamodel.g:16870:2: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // Qualitymetamodel.g:16870:6: ( ( '0' .. '9' ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Qualitymetamodel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRINGTYPE"
    public final void mSTRINGTYPE() throws RecognitionException {
        try {
            int _type = STRINGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16872:11: ( ( 'String' ) )
            // Qualitymetamodel.g:16873:2: ( 'String' )
            {
            // Qualitymetamodel.g:16873:2: ( 'String' )
            // Qualitymetamodel.g:16873:2: 'String'
            {
            match("String"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRINGTYPE"

    // $ANTLR start "BOOLEANTYPE"
    public final void mBOOLEANTYPE() throws RecognitionException {
        try {
            int _type = BOOLEANTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16875:12: ( ( 'Boolean' ) )
            // Qualitymetamodel.g:16876:2: ( 'Boolean' )
            {
            // Qualitymetamodel.g:16876:2: ( 'Boolean' )
            // Qualitymetamodel.g:16876:2: 'Boolean'
            {
            match("Boolean"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEANTYPE"

    // $ANTLR start "INTEGERTYPE"
    public final void mINTEGERTYPE() throws RecognitionException {
        try {
            int _type = INTEGERTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16878:12: ( ( 'Integer' ) )
            // Qualitymetamodel.g:16879:2: ( 'Integer' )
            {
            // Qualitymetamodel.g:16879:2: ( 'Integer' )
            // Qualitymetamodel.g:16879:2: 'Integer'
            {
            match("Integer"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGERTYPE"

    // $ANTLR start "REALTYPE"
    public final void mREALTYPE() throws RecognitionException {
        try {
            int _type = REALTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16881:9: ( ( 'Real' ) )
            // Qualitymetamodel.g:16882:2: ( 'Real' )
            {
            // Qualitymetamodel.g:16882:2: ( 'Real' )
            // Qualitymetamodel.g:16882:2: 'Real'
            {
            match("Real"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REALTYPE"

    // $ANTLR start "COLLECTIONTYPE"
    public final void mCOLLECTIONTYPE() throws RecognitionException {
        try {
            int _type = COLLECTIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16884:15: ( ( 'Collection' ) )
            // Qualitymetamodel.g:16885:2: ( 'Collection' )
            {
            // Qualitymetamodel.g:16885:2: ( 'Collection' )
            // Qualitymetamodel.g:16885:2: 'Collection'
            {
            match("Collection"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLLECTIONTYPE"

    // $ANTLR start "BAGTYPE"
    public final void mBAGTYPE() throws RecognitionException {
        try {
            int _type = BAGTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16887:8: ( 'Bag' )
            // Qualitymetamodel.g:16888:1: 'Bag'
            {
            match("Bag"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BAGTYPE"

    // $ANTLR start "ORDEREDSETTYPE"
    public final void mORDEREDSETTYPE() throws RecognitionException {
        try {
            int _type = ORDEREDSETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16889:15: ( 'OrderedSet' )
            // Qualitymetamodel.g:16890:1: 'OrderedSet'
            {
            match("OrderedSet"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDEREDSETTYPE"

    // $ANTLR start "SEQUENCETYPE"
    public final void mSEQUENCETYPE() throws RecognitionException {
        try {
            int _type = SEQUENCETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16891:13: ( 'Sequence' )
            // Qualitymetamodel.g:16892:1: 'Sequence'
            {
            match("Sequence"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEQUENCETYPE"

    // $ANTLR start "SETTYPE"
    public final void mSETTYPE() throws RecognitionException {
        try {
            int _type = SETTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16893:8: ( 'Set' )
            // Qualitymetamodel.g:16894:1: 'Set'
            {
            match("Set"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SETTYPE"

    // $ANTLR start "OCLANYTYPE"
    public final void mOCLANYTYPE() throws RecognitionException {
        try {
            int _type = OCLANYTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16895:11: ( ( 'OclAny' ) )
            // Qualitymetamodel.g:16896:2: ( 'OclAny' )
            {
            // Qualitymetamodel.g:16896:2: ( 'OclAny' )
            // Qualitymetamodel.g:16896:2: 'OclAny'
            {
            match("OclAny"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCLANYTYPE"

    // $ANTLR start "OCLTYPE"
    public final void mOCLTYPE() throws RecognitionException {
        try {
            int _type = OCLTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16898:8: ( ( 'OclType' ) )
            // Qualitymetamodel.g:16899:2: ( 'OclType' )
            {
            // Qualitymetamodel.g:16899:2: ( 'OclType' )
            // Qualitymetamodel.g:16899:2: 'OclType'
            {
            match("OclType"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCLTYPE"

    // $ANTLR start "TUPLETYPE"
    public final void mTUPLETYPE() throws RecognitionException {
        try {
            int _type = TUPLETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16901:10: ( ( 'TupleType' ) )
            // Qualitymetamodel.g:16902:2: ( 'TupleType' )
            {
            // Qualitymetamodel.g:16902:2: ( 'TupleType' )
            // Qualitymetamodel.g:16902:2: 'TupleType'
            {
            match("TupleType"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TUPLETYPE"

    // $ANTLR start "TUPLE"
    public final void mTUPLE() throws RecognitionException {
        try {
            int _type = TUPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16904:6: ( 'Tuple' )
            // Qualitymetamodel.g:16905:1: 'Tuple'
            {
            match("Tuple"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TUPLE"

    // $ANTLR start "MAPTYPE"
    public final void mMAPTYPE() throws RecognitionException {
        try {
            int _type = MAPTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16906:8: ( 'Map' )
            // Qualitymetamodel.g:16907:1: 'Map'
            {
            match("Map"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAPTYPE"

    // $ANTLR start "LAMBDATYPE"
    public final void mLAMBDATYPE() throws RecognitionException {
        try {
            int _type = LAMBDATYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16908:11: ( ( 'Lambda' ) )
            // Qualitymetamodel.g:16909:2: ( 'Lambda' )
            {
            // Qualitymetamodel.g:16909:2: ( 'Lambda' )
            // Qualitymetamodel.g:16909:2: 'Lambda'
            {
            match("Lambda"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LAMBDATYPE"

    // $ANTLR start "ENVTYPE"
    public final void mENVTYPE() throws RecognitionException {
        try {
            int _type = ENVTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16911:8: ( ( 'Env' ) )
            // Qualitymetamodel.g:16912:2: ( 'Env' )
            {
            // Qualitymetamodel.g:16912:2: ( 'Env' )
            // Qualitymetamodel.g:16912:2: 'Env'
            {
            match("Env"); 



            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ENVTYPE"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16914:5: ( ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* ) )
            // Qualitymetamodel.g:16915:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            {
            // Qualitymetamodel.g:16915:2: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )* )
            // Qualitymetamodel.g:16915:2: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Qualitymetamodel.g:16915:21: ( ( 'A' .. 'Z' | 'a' .. 'z' ) | ( '0' .. '9' ) | '_' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'Z')||LA10_0=='_'||(LA10_0 >= 'a' && LA10_0 <= 'z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Qualitymetamodel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "LINEBREAK"
    public final void mLINEBREAK() throws RecognitionException {
        try {
            int _type = LINEBREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16917:10: ( ( ( '\\r\\n' | '\\'r' | '\\n' ) ) )
            // Qualitymetamodel.g:16918:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            {
            // Qualitymetamodel.g:16918:2: ( ( '\\r\\n' | '\\'r' | '\\n' ) )
            // Qualitymetamodel.g:16918:2: ( '\\r\\n' | '\\'r' | '\\n' )
            {
            // Qualitymetamodel.g:16918:2: ( '\\r\\n' | '\\'r' | '\\n' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case '\r':
                {
                alt11=1;
                }
                break;
            case '\'':
                {
                alt11=2;
                }
                break;
            case '\n':
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // Qualitymetamodel.g:16918:3: '\\r\\n'
                    {
                    match("\r\n"); 



                    }
                    break;
                case 2 :
                    // Qualitymetamodel.g:16918:10: '\\'r'
                    {
                    match("'r"); 



                    }
                    break;
                case 3 :
                    // Qualitymetamodel.g:16918:16: '\\n'
                    {
                    match('\n'); 

                    }
                    break;

            }


            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINEBREAK"

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16921:11: ( ( ( ' ' | '\\t' | '\\f' ) ) )
            // Qualitymetamodel.g:16922:2: ( ( ' ' | '\\t' | '\\f' ) )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = 99; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "QUOTED_34_34_92"
    public final void mQUOTED_34_34_92() throws RecognitionException {
        try {
            int _type = QUOTED_34_34_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16925:16: ( ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) ) )
            // Qualitymetamodel.g:16926:2: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) )
            {
            // Qualitymetamodel.g:16926:2: ( ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' ) )
            // Qualitymetamodel.g:16926:2: ( '\"' ) ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )* ( '\"' )
            {
            // Qualitymetamodel.g:16926:2: ( '\"' )
            // Qualitymetamodel.g:16926:3: '\"'
            {
            match('\"'); 

            }


            // Qualitymetamodel.g:16926:7: ( ( '\\\\' '\"' ) | ( '\\\\' '\\\\' ) | (~ ( '\"' | '\\\\' ) ) )*
            loop12:
            do {
                int alt12=4;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='\\') ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2=='\"') ) {
                        alt12=1;
                    }
                    else if ( (LA12_2=='\\') ) {
                        alt12=2;
                    }


                }
                else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '!')||(LA12_0 >= '#' && LA12_0 <= '[')||(LA12_0 >= ']' && LA12_0 <= '\uFFFF')) ) {
                    alt12=3;
                }


                switch (alt12) {
            	case 1 :
            	    // Qualitymetamodel.g:16926:8: ( '\\\\' '\"' )
            	    {
            	    // Qualitymetamodel.g:16926:8: ( '\\\\' '\"' )
            	    // Qualitymetamodel.g:16926:9: '\\\\' '\"'
            	    {
            	    match('\\'); 

            	    match('\"'); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Qualitymetamodel.g:16926:18: ( '\\\\' '\\\\' )
            	    {
            	    // Qualitymetamodel.g:16926:18: ( '\\\\' '\\\\' )
            	    // Qualitymetamodel.g:16926:19: '\\\\' '\\\\'
            	    {
            	    match('\\'); 

            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Qualitymetamodel.g:16926:29: (~ ( '\"' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // Qualitymetamodel.g:16926:44: ( '\"' )
            // Qualitymetamodel.g:16926:45: '\"'
            {
            match('\"'); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_34_34_92"

    // $ANTLR start "QUOTED_39_39_92"
    public final void mQUOTED_39_39_92() throws RecognitionException {
        try {
            int _type = QUOTED_39_39_92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Qualitymetamodel.g:16928:16: ( ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) ) )
            // Qualitymetamodel.g:16929:2: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) )
            {
            // Qualitymetamodel.g:16929:2: ( ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' ) )
            // Qualitymetamodel.g:16929:2: ( '\\'' ) ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )* ( '\\'' )
            {
            // Qualitymetamodel.g:16929:2: ( '\\'' )
            // Qualitymetamodel.g:16929:3: '\\''
            {
            match('\''); 

            }


            // Qualitymetamodel.g:16929:8: ( ( '\\\\' '\\'' ) | ( '\\\\' '\\\\' ) | (~ ( '\\'' | '\\\\' ) ) )*
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='\\') ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2=='\'') ) {
                        alt13=1;
                    }
                    else if ( (LA13_2=='\\') ) {
                        alt13=2;
                    }


                }
                else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '&')||(LA13_0 >= '(' && LA13_0 <= '[')||(LA13_0 >= ']' && LA13_0 <= '\uFFFF')) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // Qualitymetamodel.g:16929:9: ( '\\\\' '\\'' )
            	    {
            	    // Qualitymetamodel.g:16929:9: ( '\\\\' '\\'' )
            	    // Qualitymetamodel.g:16929:10: '\\\\' '\\''
            	    {
            	    match('\\'); 

            	    match('\''); 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // Qualitymetamodel.g:16929:20: ( '\\\\' '\\\\' )
            	    {
            	    // Qualitymetamodel.g:16929:20: ( '\\\\' '\\\\' )
            	    // Qualitymetamodel.g:16929:21: '\\\\' '\\\\'
            	    {
            	    match('\\'); 

            	    match('\\'); 

            	    }


            	    }
            	    break;
            	case 3 :
            	    // Qualitymetamodel.g:16929:31: (~ ( '\\'' | '\\\\' ) )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // Qualitymetamodel.g:16929:47: ( '\\'' )
            // Qualitymetamodel.g:16929:48: '\\''
            {
            match('\''); 

            }


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUOTED_39_39_92"

    public void mTokens() throws RecognitionException {
        // Qualitymetamodel.g:1:8: ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 )
        int alt14=90;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // Qualitymetamodel.g:1:10: T__36
                {
                mT__36(); 


                }
                break;
            case 2 :
                // Qualitymetamodel.g:1:16: T__37
                {
                mT__37(); 


                }
                break;
            case 3 :
                // Qualitymetamodel.g:1:22: T__38
                {
                mT__38(); 


                }
                break;
            case 4 :
                // Qualitymetamodel.g:1:28: T__39
                {
                mT__39(); 


                }
                break;
            case 5 :
                // Qualitymetamodel.g:1:34: T__40
                {
                mT__40(); 


                }
                break;
            case 6 :
                // Qualitymetamodel.g:1:40: T__41
                {
                mT__41(); 


                }
                break;
            case 7 :
                // Qualitymetamodel.g:1:46: T__42
                {
                mT__42(); 


                }
                break;
            case 8 :
                // Qualitymetamodel.g:1:52: T__43
                {
                mT__43(); 


                }
                break;
            case 9 :
                // Qualitymetamodel.g:1:58: T__44
                {
                mT__44(); 


                }
                break;
            case 10 :
                // Qualitymetamodel.g:1:64: T__45
                {
                mT__45(); 


                }
                break;
            case 11 :
                // Qualitymetamodel.g:1:70: T__46
                {
                mT__46(); 


                }
                break;
            case 12 :
                // Qualitymetamodel.g:1:76: T__47
                {
                mT__47(); 


                }
                break;
            case 13 :
                // Qualitymetamodel.g:1:82: T__48
                {
                mT__48(); 


                }
                break;
            case 14 :
                // Qualitymetamodel.g:1:88: T__49
                {
                mT__49(); 


                }
                break;
            case 15 :
                // Qualitymetamodel.g:1:94: T__50
                {
                mT__50(); 


                }
                break;
            case 16 :
                // Qualitymetamodel.g:1:100: T__51
                {
                mT__51(); 


                }
                break;
            case 17 :
                // Qualitymetamodel.g:1:106: T__52
                {
                mT__52(); 


                }
                break;
            case 18 :
                // Qualitymetamodel.g:1:112: T__53
                {
                mT__53(); 


                }
                break;
            case 19 :
                // Qualitymetamodel.g:1:118: T__54
                {
                mT__54(); 


                }
                break;
            case 20 :
                // Qualitymetamodel.g:1:124: T__55
                {
                mT__55(); 


                }
                break;
            case 21 :
                // Qualitymetamodel.g:1:130: T__56
                {
                mT__56(); 


                }
                break;
            case 22 :
                // Qualitymetamodel.g:1:136: T__57
                {
                mT__57(); 


                }
                break;
            case 23 :
                // Qualitymetamodel.g:1:142: T__58
                {
                mT__58(); 


                }
                break;
            case 24 :
                // Qualitymetamodel.g:1:148: T__59
                {
                mT__59(); 


                }
                break;
            case 25 :
                // Qualitymetamodel.g:1:154: T__60
                {
                mT__60(); 


                }
                break;
            case 26 :
                // Qualitymetamodel.g:1:160: T__61
                {
                mT__61(); 


                }
                break;
            case 27 :
                // Qualitymetamodel.g:1:166: T__62
                {
                mT__62(); 


                }
                break;
            case 28 :
                // Qualitymetamodel.g:1:172: T__63
                {
                mT__63(); 


                }
                break;
            case 29 :
                // Qualitymetamodel.g:1:178: T__64
                {
                mT__64(); 


                }
                break;
            case 30 :
                // Qualitymetamodel.g:1:184: T__65
                {
                mT__65(); 


                }
                break;
            case 31 :
                // Qualitymetamodel.g:1:190: T__66
                {
                mT__66(); 


                }
                break;
            case 32 :
                // Qualitymetamodel.g:1:196: T__67
                {
                mT__67(); 


                }
                break;
            case 33 :
                // Qualitymetamodel.g:1:202: T__68
                {
                mT__68(); 


                }
                break;
            case 34 :
                // Qualitymetamodel.g:1:208: T__69
                {
                mT__69(); 


                }
                break;
            case 35 :
                // Qualitymetamodel.g:1:214: T__70
                {
                mT__70(); 


                }
                break;
            case 36 :
                // Qualitymetamodel.g:1:220: T__71
                {
                mT__71(); 


                }
                break;
            case 37 :
                // Qualitymetamodel.g:1:226: T__72
                {
                mT__72(); 


                }
                break;
            case 38 :
                // Qualitymetamodel.g:1:232: T__73
                {
                mT__73(); 


                }
                break;
            case 39 :
                // Qualitymetamodel.g:1:238: T__74
                {
                mT__74(); 


                }
                break;
            case 40 :
                // Qualitymetamodel.g:1:244: T__75
                {
                mT__75(); 


                }
                break;
            case 41 :
                // Qualitymetamodel.g:1:250: T__76
                {
                mT__76(); 


                }
                break;
            case 42 :
                // Qualitymetamodel.g:1:256: T__77
                {
                mT__77(); 


                }
                break;
            case 43 :
                // Qualitymetamodel.g:1:262: T__78
                {
                mT__78(); 


                }
                break;
            case 44 :
                // Qualitymetamodel.g:1:268: T__79
                {
                mT__79(); 


                }
                break;
            case 45 :
                // Qualitymetamodel.g:1:274: T__80
                {
                mT__80(); 


                }
                break;
            case 46 :
                // Qualitymetamodel.g:1:280: T__81
                {
                mT__81(); 


                }
                break;
            case 47 :
                // Qualitymetamodel.g:1:286: T__82
                {
                mT__82(); 


                }
                break;
            case 48 :
                // Qualitymetamodel.g:1:292: T__83
                {
                mT__83(); 


                }
                break;
            case 49 :
                // Qualitymetamodel.g:1:298: T__84
                {
                mT__84(); 


                }
                break;
            case 50 :
                // Qualitymetamodel.g:1:304: T__85
                {
                mT__85(); 


                }
                break;
            case 51 :
                // Qualitymetamodel.g:1:310: T__86
                {
                mT__86(); 


                }
                break;
            case 52 :
                // Qualitymetamodel.g:1:316: T__87
                {
                mT__87(); 


                }
                break;
            case 53 :
                // Qualitymetamodel.g:1:322: T__88
                {
                mT__88(); 


                }
                break;
            case 54 :
                // Qualitymetamodel.g:1:328: T__89
                {
                mT__89(); 


                }
                break;
            case 55 :
                // Qualitymetamodel.g:1:334: T__90
                {
                mT__90(); 


                }
                break;
            case 56 :
                // Qualitymetamodel.g:1:340: T__91
                {
                mT__91(); 


                }
                break;
            case 57 :
                // Qualitymetamodel.g:1:346: T__92
                {
                mT__92(); 


                }
                break;
            case 58 :
                // Qualitymetamodel.g:1:352: T__93
                {
                mT__93(); 


                }
                break;
            case 59 :
                // Qualitymetamodel.g:1:358: NOTOP
                {
                mNOTOP(); 


                }
                break;
            case 60 :
                // Qualitymetamodel.g:1:364: BOOLOP
                {
                mBOOLOP(); 


                }
                break;
            case 61 :
                // Qualitymetamodel.g:1:371: INTOP
                {
                mINTOP(); 


                }
                break;
            case 62 :
                // Qualitymetamodel.g:1:377: RELOP
                {
                mRELOP(); 


                }
                break;
            case 63 :
                // Qualitymetamodel.g:1:383: EQ
                {
                mEQ(); 


                }
                break;
            case 64 :
                // Qualitymetamodel.g:1:386: NEQ
                {
                mNEQ(); 


                }
                break;
            case 65 :
                // Qualitymetamodel.g:1:390: ADDOP
                {
                mADDOP(); 


                }
                break;
            case 66 :
                // Qualitymetamodel.g:1:396: MULOP
                {
                mMULOP(); 


                }
                break;
            case 67 :
                // Qualitymetamodel.g:1:402: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 68 :
                // Qualitymetamodel.g:1:410: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 69 :
                // Qualitymetamodel.g:1:416: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 70 :
                // Qualitymetamodel.g:1:424: STRINGTYPE
                {
                mSTRINGTYPE(); 


                }
                break;
            case 71 :
                // Qualitymetamodel.g:1:435: BOOLEANTYPE
                {
                mBOOLEANTYPE(); 


                }
                break;
            case 72 :
                // Qualitymetamodel.g:1:447: INTEGERTYPE
                {
                mINTEGERTYPE(); 


                }
                break;
            case 73 :
                // Qualitymetamodel.g:1:459: REALTYPE
                {
                mREALTYPE(); 


                }
                break;
            case 74 :
                // Qualitymetamodel.g:1:468: COLLECTIONTYPE
                {
                mCOLLECTIONTYPE(); 


                }
                break;
            case 75 :
                // Qualitymetamodel.g:1:483: BAGTYPE
                {
                mBAGTYPE(); 


                }
                break;
            case 76 :
                // Qualitymetamodel.g:1:491: ORDEREDSETTYPE
                {
                mORDEREDSETTYPE(); 


                }
                break;
            case 77 :
                // Qualitymetamodel.g:1:506: SEQUENCETYPE
                {
                mSEQUENCETYPE(); 


                }
                break;
            case 78 :
                // Qualitymetamodel.g:1:519: SETTYPE
                {
                mSETTYPE(); 


                }
                break;
            case 79 :
                // Qualitymetamodel.g:1:527: OCLANYTYPE
                {
                mOCLANYTYPE(); 


                }
                break;
            case 80 :
                // Qualitymetamodel.g:1:538: OCLTYPE
                {
                mOCLTYPE(); 


                }
                break;
            case 81 :
                // Qualitymetamodel.g:1:546: TUPLETYPE
                {
                mTUPLETYPE(); 


                }
                break;
            case 82 :
                // Qualitymetamodel.g:1:556: TUPLE
                {
                mTUPLE(); 


                }
                break;
            case 83 :
                // Qualitymetamodel.g:1:562: MAPTYPE
                {
                mMAPTYPE(); 


                }
                break;
            case 84 :
                // Qualitymetamodel.g:1:570: LAMBDATYPE
                {
                mLAMBDATYPE(); 


                }
                break;
            case 85 :
                // Qualitymetamodel.g:1:581: ENVTYPE
                {
                mENVTYPE(); 


                }
                break;
            case 86 :
                // Qualitymetamodel.g:1:589: TEXT
                {
                mTEXT(); 


                }
                break;
            case 87 :
                // Qualitymetamodel.g:1:594: LINEBREAK
                {
                mLINEBREAK(); 


                }
                break;
            case 88 :
                // Qualitymetamodel.g:1:604: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 89 :
                // Qualitymetamodel.g:1:615: QUOTED_34_34_92
                {
                mQUOTED_34_34_92(); 


                }
                break;
            case 90 :
                // Qualitymetamodel.g:1:631: QUOTED_39_39_92
                {
                mQUOTED_39_39_92(); 


                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\6\uffff\1\51\1\71\1\73\1\uffff\7\61\1\uffff\1\107\1\uffff\15\61"+
        "\3\uffff\2\61\1\uffff\1\46\3\uffff\1\150\5\61\13\uffff\12\61\2\uffff"+
        "\13\61\1\u0088\1\61\1\u008a\16\61\1\u009b\1\61\3\uffff\5\61\1\62"+
        "\1\uffff\2\61\1\u00a4\6\61\1\u00ad\2\61\1\u009b\2\61\1\u00b2\1\61"+
        "\1\u00b4\2\61\1\u00b7\2\61\2\uffff\1\61\1\uffff\1\61\1\u00bd\2\61"+
        "\1\u00b4\1\61\1\u00c3\11\61\1\uffff\1\u009b\2\61\1\u00cf\1\61\1"+
        "\u00d1\2\61\1\uffff\5\61\1\u00da\2\61\1\uffff\4\61\1\uffff\1\61"+
        "\1\uffff\1\u00e2\1\61\1\uffff\5\61\1\uffff\5\61\1\uffff\1\61\1\u00ef"+
        "\1\uffff\2\61\1\u00f2\1\u00f3\4\61\1\uffff\1\61\1\uffff\7\61\2\uffff"+
        "\2\61\1\u0102\4\61\1\uffff\1\u0107\1\uffff\1\u0108\7\61\1\uffff"+
        "\1\61\1\uffff\1\61\1\u0112\3\uffff\2\61\1\u0117\5\61\1\u011d\2\61"+
        "\1\u0121\1\61\1\uffff\4\61\2\uffff\1\u0127\5\61\1\u012d\1\61\1\u012f"+
        "\2\uffff\3\61\1\uffff\1\u0133\1\61\1\u0136\1\u0138\1\61\1\uffff"+
        "\1\u013a\1\61\2\uffff\3\61\1\u013f\1\61\1\uffff\1\u009b\1\u0141"+
        "\3\61\1\uffff\1\61\2\uffff\2\61\1\uffff\1\61\4\uffff\1\61\1\uffff"+
        "\1\61\1\u014d\2\61\1\uffff\1\61\1\uffff\13\61\1\uffff\4\61\1\u0160"+
        "\5\61\1\u0166\2\61\1\u0169\4\61\1\uffff\4\61\1\u0172\1\uffff\2\61"+
        "\1\uffff\3\61\1\uffff\4\61\1\uffff\1\61\1\u017d\2\61\1\uffff\5\61"+
        "\1\uffff\1\61\1\uffff\2\61\1\uffff\5\61\1\uffff\5\61\2\uffff\4\61"+
        "\1\uffff\2\61\1\u0198\1\uffff";
    static final String DFA14_eofS =
        "\u0199\uffff";
    static final String DFA14_minS =
        "\1\11\5\uffff\1\55\1\56\1\72\1\uffff\1\147\1\141\1\156\1\143\2\145"+
        "\1\116\1\uffff\1\54\1\uffff\1\147\1\141\1\145\1\154\1\141\1\144"+
        "\2\145\1\141\1\165\1\145\1\150\1\141\3\uffff\1\162\1\157\1\uffff"+
        "\1\76\3\uffff\1\56\1\157\1\165\2\141\1\156\2\uffff\1\0\10\uffff"+
        "\1\147\1\157\1\147\1\164\1\154\1\144\1\141\1\162\1\161\1\123\2\uffff"+
        "\1\147\1\144\1\154\1\156\1\146\1\166\1\163\1\144\1\160\1\154\1\72"+
        "\1\60\1\160\1\60\1\145\1\164\1\141\1\144\1\155\1\164\1\141\1\154"+
        "\1\141\1\160\1\145\1\165\1\160\1\154\1\60\1\162\3\uffff\1\154\2"+
        "\160\1\155\1\166\1\0\1\uffff\1\162\1\154\1\60\1\145\1\101\1\145"+
        "\1\154\1\151\1\165\1\60\1\105\1\162\1\60\1\143\1\164\1\60\1\143"+
        "\1\60\1\145\1\151\1\60\1\162\1\163\2\uffff\1\154\1\uffff\1\162\1"+
        "\60\1\163\1\141\1\60\1\145\1\60\1\154\1\146\1\72\1\164\1\145\1\156"+
        "\2\145\1\165\1\uffff\1\60\2\154\1\60\1\142\1\60\2\145\1\uffff\1"+
        "\147\2\156\1\171\1\162\1\54\1\156\1\145\1\uffff\1\124\1\145\1\165"+
        "\1\145\1\uffff\1\162\1\uffff\1\60\1\146\1\uffff\1\72\1\145\1\162"+
        "\1\151\1\141\1\uffff\1\165\1\155\1\151\1\154\1\72\1\uffff\1\151"+
        "\1\60\1\uffff\1\151\1\162\2\60\1\72\3\145\1\uffff\1\144\1\uffff"+
        "\1\147\1\141\1\145\1\144\1\171\1\160\1\145\2\uffff\1\147\1\156\1"+
        "\60\1\147\1\154\1\170\1\151\1\uffff\1\60\1\uffff\1\60\1\164\1\145"+
        "\1\164\1\162\1\157\1\143\1\145\1\uffff\1\164\1\uffff\1\143\1\60"+
        "\3\uffff\1\72\1\143\1\60\2\141\1\156\1\162\1\145\1\60\1\145\1\144"+
        "\1\54\1\143\1\uffff\2\141\1\164\1\160\2\uffff\1\60\1\163\2\145\1"+
        "\144\1\120\1\60\1\171\1\60\2\uffff\1\72\1\164\1\171\1\uffff\1\60"+
        "\1\164\2\54\1\146\1\uffff\1\60\1\123\2\uffff\1\145\2\164\1\60\1"+
        "\164\1\uffff\2\60\1\144\1\145\1\162\1\uffff\1\101\2\uffff\1\151"+
        "\1\160\1\uffff\1\145\4\uffff\1\151\1\uffff\1\145\1\60\2\145\1\uffff"+
        "\1\151\1\uffff\1\102\1\154\1\157\1\164\1\171\1\141\1\157\1\145\1"+
        "\144\1\156\1\164\1\uffff\2\144\1\157\1\171\1\60\1\166\1\164\1\160"+
        "\1\154\1\156\1\60\1\126\1\145\1\60\1\126\1\102\1\156\1\72\1\uffff"+
        "\1\151\1\162\1\145\1\165\1\60\1\uffff\1\141\1\144\1\uffff\1\141"+
        "\1\171\1\72\1\uffff\1\144\1\151\1\163\1\145\1\uffff\1\154\1\60\1"+
        "\154\1\72\1\uffff\1\145\1\142\1\72\1\163\1\165\1\uffff\1\165\1\uffff"+
        "\1\162\1\165\1\uffff\1\72\2\145\1\163\1\164\1\uffff\1\115\2\72\2"+
        "\145\2\uffff\1\163\1\164\1\72\1\162\1\uffff\1\151\1\143\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\5\uffff\1\76\1\56\1\72\1\uffff\1\147\1\157\1\156\1\162\1"+
        "\145\1\164\1\116\1\uffff\1\54\1\uffff\1\156\1\157\1\151\1\170\1"+
        "\141\1\164\1\145\2\157\2\165\1\171\1\141\3\uffff\1\162\1\157\1\uffff"+
        "\1\76\3\uffff\1\71\1\157\1\165\2\141\1\156\2\uffff\1\uffff\10\uffff"+
        "\1\147\1\157\1\147\1\164\1\154\1\144\1\141\1\162\1\164\1\123\2\uffff"+
        "\1\147\1\144\1\154\1\156\1\163\1\166\1\163\1\166\1\160\1\154\1\72"+
        "\1\172\1\160\1\172\1\145\2\164\1\144\1\155\1\164\1\141\1\164\1\141"+
        "\1\160\1\145\1\165\1\160\1\154\1\172\1\162\3\uffff\1\154\2\160\1"+
        "\155\1\166\1\uffff\1\uffff\1\162\1\154\1\172\1\145\1\125\1\145\1"+
        "\154\1\151\1\165\1\172\1\105\1\162\1\172\1\143\1\164\1\172\1\143"+
        "\1\172\1\145\1\151\1\172\1\162\1\163\2\uffff\1\157\1\uffff\1\162"+
        "\1\172\1\163\1\162\1\172\1\145\1\172\1\154\1\146\1\72\1\164\1\145"+
        "\1\156\2\145\1\165\1\uffff\1\172\2\154\1\172\1\142\1\172\2\145\1"+
        "\uffff\1\147\2\156\1\171\1\162\1\172\1\156\1\145\1\uffff\1\124\1"+
        "\145\1\165\1\145\1\uffff\1\162\1\uffff\1\172\1\146\1\uffff\1\72"+
        "\1\145\1\162\1\151\1\141\1\uffff\1\165\1\155\1\151\1\154\1\72\1"+
        "\uffff\1\151\1\172\1\uffff\1\151\1\162\2\172\1\72\3\145\1\uffff"+
        "\1\144\1\uffff\1\147\1\141\1\145\1\144\1\171\1\160\1\145\2\uffff"+
        "\1\147\1\156\1\172\1\147\1\154\1\170\1\151\1\uffff\1\172\1\uffff"+
        "\1\172\1\164\1\145\1\164\1\162\1\157\1\143\1\145\1\uffff\1\164\1"+
        "\uffff\1\143\1\172\3\uffff\1\163\1\143\1\172\2\141\1\156\1\162\1"+
        "\145\1\172\1\145\1\144\1\172\1\143\1\uffff\2\141\1\164\1\160\2\uffff"+
        "\1\172\1\163\2\145\1\144\1\120\1\172\1\171\1\172\2\uffff\1\72\1"+
        "\164\1\171\1\uffff\1\172\1\164\2\172\1\146\1\uffff\1\172\1\123\2"+
        "\uffff\1\145\2\164\1\172\1\164\1\uffff\2\172\1\144\1\145\1\162\1"+
        "\uffff\1\126\2\uffff\1\151\1\160\1\uffff\1\145\4\uffff\1\151\1\uffff"+
        "\1\145\1\172\2\145\1\uffff\1\151\1\uffff\1\102\1\154\1\157\1\164"+
        "\1\171\1\141\1\157\1\145\1\144\1\156\1\164\1\uffff\2\144\1\157\1"+
        "\171\1\172\1\166\1\164\1\160\1\154\1\156\1\172\1\126\1\145\1\172"+
        "\1\126\1\102\1\156\1\72\1\uffff\1\151\1\162\1\145\1\165\1\172\1"+
        "\uffff\1\141\1\144\1\uffff\1\141\1\171\1\72\1\uffff\1\144\1\151"+
        "\1\163\1\145\1\uffff\1\154\1\172\1\154\1\72\1\uffff\1\145\1\142"+
        "\1\72\1\163\1\165\1\uffff\1\165\1\uffff\1\162\1\165\1\uffff\1\72"+
        "\2\145\1\163\1\164\1\uffff\1\115\2\72\2\145\2\uffff\1\163\1\164"+
        "\1\72\1\162\1\uffff\1\151\1\143\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\3\uffff\1\13\7\uffff\1\23\1\uffff\1"+
        "\26\15\uffff\1\70\1\71\1\72\2\uffff\1\76\1\uffff\1\77\1\101\1\102"+
        "\6\uffff\1\126\1\127\1\uffff\1\130\1\131\1\6\1\103\1\10\1\7\1\12"+
        "\1\11\12\uffff\1\25\1\24\36\uffff\1\100\1\104\1\105\6\uffff\1\132"+
        "\27\uffff\1\41\1\42\1\uffff\1\44\20\uffff\1\74\10\uffff\1\113\10"+
        "\uffff\1\116\4\uffff\1\32\1\uffff\1\75\2\uffff\1\36\5\uffff\1\46"+
        "\5\uffff\1\73\2\uffff\1\60\10\uffff\1\123\1\uffff\1\125\7\uffff"+
        "\1\20\1\111\7\uffff\1\34\1\uffff\1\37\10\uffff\1\53\1\uffff\1\57"+
        "\2\uffff\1\63\1\64\1\65\15\uffff\1\22\4\uffff\1\35\1\40\11\uffff"+
        "\1\62\1\66\3\uffff\1\122\5\uffff\1\117\2\uffff\1\21\1\106\5\uffff"+
        "\1\43\5\uffff\1\52\1\uffff\1\61\1\67\2\uffff\1\124\1\uffff\1\15"+
        "\1\107\1\16\1\110\1\uffff\1\120\4\uffff\1\31\1\uffff\1\45\13\uffff"+
        "\1\115\22\uffff\1\50\5\uffff\1\121\2\uffff\1\114\3\uffff\1\47\4"+
        "\uffff\1\112\4\uffff\1\33\5\uffff\1\17\1\uffff\1\30\2\uffff\1\55"+
        "\5\uffff\1\56\5\uffff\1\27\1\51\4\uffff\1\54\3\uffff\1\14";
    static final String DFA14_specialS =
        "\63\uffff\1\1\72\uffff\1\0\u012a\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\64\1\62\1\uffff\1\64\1\62\22\uffff\1\64\1\1\1\65\1\2\3\uffff"+
            "\1\63\1\3\1\4\1\52\1\51\1\5\1\6\1\7\1\52\12\53\1\10\1\11\1\47"+
            "\1\50\1\46\2\uffff\1\12\1\13\1\54\1\61\1\60\3\61\1\14\2\61\1"+
            "\57\1\56\1\61\1\15\2\61\1\16\1\17\1\55\1\20\5\61\1\21\1\uffff"+
            "\1\22\1\uffff\1\23\1\uffff\1\24\1\61\1\25\1\26\1\27\1\30\2\61"+
            "\1\31\2\61\1\32\1\33\1\34\1\44\1\61\1\35\1\61\1\36\1\37\1\61"+
            "\1\40\1\61\1\45\2\61\1\41\1\42\1\43",
            "",
            "",
            "",
            "",
            "",
            "\1\67\2\uffff\12\53\4\uffff\1\66",
            "\1\70",
            "\1\72",
            "",
            "\1\74",
            "\1\76\15\uffff\1\75",
            "\1\77",
            "\1\100\16\uffff\1\101",
            "\1\102",
            "\1\104\16\uffff\1\103",
            "\1\105",
            "",
            "\1\106",
            "",
            "\1\110\6\uffff\1\111",
            "\1\112\15\uffff\1\113",
            "\1\114\3\uffff\1\115",
            "\1\116\1\uffff\1\117\11\uffff\1\120",
            "\1\121",
            "\1\122\1\uffff\1\123\6\uffff\1\124\1\125\5\uffff\1\126",
            "\1\127",
            "\1\130\11\uffff\1\131",
            "\1\132\15\uffff\1\133",
            "\1\134",
            "\1\135\16\uffff\1\136\1\137",
            "\1\140\11\uffff\1\141\6\uffff\1\142",
            "\1\143",
            "",
            "",
            "",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "",
            "",
            "",
            "\1\147\1\uffff\12\53",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "\162\157\1\156\uff8d\157",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170\2\uffff\1\171",
            "\1\172",
            "",
            "",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177\14\uffff\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083\21\uffff\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0089",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d\22\uffff\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\7\uffff\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u009c",
            "",
            "",
            "",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\0\157",
            "",
            "\1\u00a2",
            "\1\u00a3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00a5",
            "\1\u00a7\22\uffff\1\u00a8\1\u00a6",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00ae",
            "\1\u00af",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b0",
            "\1\u00b1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b3",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b5",
            "\1\u00b6",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "",
            "\1\u00bb\2\uffff\1\u00ba",
            "",
            "\1\u00bc",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00be",
            "\1\u00bf\20\uffff\1\u00c0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\24\61\1\u00c1\5\61",
            "\1\u00c2",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00cd",
            "\1\u00ce",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d0",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9\3\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "",
            "\1\u00e1",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "\1\u0101",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "",
            "\1\u0110",
            "",
            "\1\u0111",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "",
            "\1\u0113\70\uffff\1\u0114",
            "\1\u0115",
            "\12\61\7\uffff\23\61\1\u0116\6\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120\3\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61",
            "\1\u0122",
            "",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u012e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0134",
            "\1\u0135\3\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61",
            "\1\u0137\3\uffff\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32"+
            "\61",
            "\1\u0139",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u013b",
            "",
            "",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0140",
            "",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "",
            "\1\u0145\22\uffff\1\u0146\1\uffff\1\u0147",
            "",
            "",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "",
            "",
            "",
            "",
            "\1\u014b",
            "",
            "\1\u014c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u014e",
            "\1\u014f",
            "",
            "\1\u0150",
            "",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\u015b",
            "",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u0167",
            "\1\u0168",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "",
            "\1\u0173",
            "\1\u0174",
            "",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            "\1\u017e",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "",
            "\1\u0185",
            "",
            "\1\u0186",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "",
            "",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "",
            "\1\u0196",
            "\1\u0197",
            "\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | NOTOP | BOOLOP | INTOP | RELOP | EQ | NEQ | ADDOP | MULOP | COMMENT | FLOAT | INTEGER | STRINGTYPE | BOOLEANTYPE | INTEGERTYPE | REALTYPE | COLLECTIONTYPE | BAGTYPE | ORDEREDSETTYPE | SEQUENCETYPE | SETTYPE | OCLANYTYPE | OCLTYPE | TUPLETYPE | TUPLE | MAPTYPE | LAMBDATYPE | ENVTYPE | TEXT | LINEBREAK | WHITESPACE | QUOTED_34_34_92 | QUOTED_39_39_92 );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_110 = input.LA(1);

                        s = -1;
                        if ( ((LA14_110 >= '\u0000' && LA14_110 <= '\uFFFF')) ) {s = 111;}

                        else s = 50;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_51 = input.LA(1);

                        s = -1;
                        if ( (LA14_51=='r') ) {s = 110;}

                        else if ( ((LA14_51 >= '\u0000' && LA14_51 <= 'q')||(LA14_51 >= 's' && LA14_51 <= '\uFFFF')) ) {s = 111;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}