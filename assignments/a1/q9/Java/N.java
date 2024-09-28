//N:top//
//N:import//
import java.util.*;

// <keyword>:N ::= 
public class N extends Keyword /*N:class*/ {

    public static final String $className = "N";
    public static final String $ruleString =
        "<keyword>:N ::= ";



    public N() {
//N:init//

    }

    public static N parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<keyword>:N", scn$.lno);
        return new N();
    }

//N//
}
