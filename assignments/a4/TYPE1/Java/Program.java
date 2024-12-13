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
        case DECLARE:
            return Declare.parse(scn$,trace$);
        case LET:
        case ADD1OP:
        case DIVOP:
        case SUB1OP:
        case VAR:
        case TRUE:
        case FALSE:
        case LETREC:
        case NEP:
        case NOTOP:
        case ANDOP:
        case ZEROP:
        case DOT:
        case MULOP:
        case LBRACE:
        case GTP:
        case ADDOP:
        case LEP:
        case EQP:
        case PROC:
        case LIT:
        case GEP:
        case SUBOP:
        case LTP:
        case OROP:
        case IF:
        case SET:
            return Eval.parse(scn$,trace$);
        default:
            throw new PLCCException(
                "Parse error",
                "Program cannot begin with " + t$.errString()
            );
        }
    }

    public static Env env = Env.initEnv(); // top-level value environment
    public static TypeEnv tenv = TypeEnv.initTypeEnv(); // top-level type env

//Program//
}
