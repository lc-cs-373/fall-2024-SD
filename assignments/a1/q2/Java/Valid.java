//Valid:top//
//Valid:import//
import java.util.*;

// <valid> ::= <keyword> <NAME> <DEFINITION>
public class Valid extends _Start /*Valid:class*/ {

    public static final String $className = "Valid";
    public static final String $ruleString =
        "<valid> ::= <keyword> <NAME> <DEFINITION>";

    public Keyword keyword;
    public Token name;
    public Token definition;

    public Valid(Keyword keyword, Token name, Token definition) {
//Valid:init//
        this.keyword = keyword;
        this.name = name;
        this.definition = definition;
    }

    public static Valid parse(Scan scn$, Trace trace$) {
        if (trace$ != null)
            trace$ = trace$.nonterm("<valid>", scn$.lno);
        Keyword keyword = Keyword.parse(scn$, trace$);
        Token name = scn$.match(Token.Match.NAME, trace$);
        Token definition = scn$.match(Token.Match.DEFINITION, trace$);
        return new Valid(keyword, name, definition);
    }

//Valid//
}
