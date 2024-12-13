//Rands:top//
//Rands:import//
import java.util.*;

// <rands> **= <exp> +COMMA
public class Rands /*Rands:class*/ {

    public static final String $className = "Rands";
    public static final String $ruleString =
        "<rands> **= <exp> +COMMA";

    public List<Exp> expList;

    public Rands(List<Exp> expList) {
//Rands:init//
        this.expList = expList;
    }

    public static Rands parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<rands>", scn$.lno);
        List<Exp> expList = new ArrayList<Exp>();
        // first trip through the parse
        Token t$ = scn$.cur();
        Token.Match match$ = t$.match;
        switch(match$) {
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
            while(true) {
                expList.add(Exp.parse(scn$, trace$));
                t$ = scn$.cur();
                match$ = t$.match;
                if (match$ != Token.Match.COMMA)
                    break; // not a separator, so we're done
                scn$.match(match$, trace$);
            }
        } // end of switch
        return new Rands(expList);

    }

    public List<Val> evalRands(Env env) {
      List<Val> valList = new ArrayList<Val>();
      for (Exp e : expList)
        valList.add(e.eval(env));
      return valList;
    }
    
    public List<Ref> evalRandsRef(Env env) {
      List<Ref> refList = new ArrayList<Ref>();
      for (Exp e : expList)
        refList.add(new ValRef(e.eval(env)));
      return refList;
    }
    
    public List<Type> evalTypeRands(TypeEnv tenv) {
      List<Type> typeList = new ArrayList<Type>();
      for (Exp e : expList)
        typeList.add(e.evalType(tenv));
      return typeList;
    }
    
    public String toString() {
      String s = "";   // the string to return
      String sep = ""; // no separator for the first expression
      // get all of the expressions in the expression list
      for (Exp e : expList) {
        s += sep + e;
        sep = ",";   // commas separate the rest of the expressions
      }
      return s;
    }

//Rands//
}
