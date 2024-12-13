//T:top//
//T:import//
import java.util.*;

// <keyword>:T ::= TKN
public class T extends Keyword /*T:class*/ {

    public static final String $className = "T";
    public static final String $ruleString =
        "<keyword>:T ::= TKN";



    public T() {
//T:init//

    }

    public static T parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<keyword>:T", scn$.lno);
        scn$.match(Token.Match.TKN, trace$);
        return new T();
    }

//T//
}
