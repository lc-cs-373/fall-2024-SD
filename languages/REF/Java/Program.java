//Program:top//
//Program:import//
import java.util.*;

public abstract class Program extends _Start /*Program:class*/ {

    public static final String $className = "Program";
    public static Program parse(Scan scn$, Trace trace$) {
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
        case DEFINE:
            return Define.parse(scn$,trace$);
        case SET:
        case SUB1OP:
        case DIVOP:
        case IF:
        case MULOP:
        case LBRACE:
        case LET:
        case PROC:
        case LIT:
        case ZEROP:
        case VAR:
        case ADDOP:
        case DOT:
        case ADD1OP:
        case SUBOP:
        case LETREC:
            return Eval.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Program cannot begin with " + t$.errString()
            );
        }
    }

    public static Env env = Env.initEnv(); // the initial environment

//Program//
}
