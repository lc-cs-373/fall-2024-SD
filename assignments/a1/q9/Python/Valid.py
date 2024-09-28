#Valid:top#
#Valid:import#

# <valid> ::= <keyword> <NAME> <DEFINITION>
class Valid(_Start): #Valid:class#

    className = "Valid"
    ruleString = "<valid> ::= <keyword> <NAME> <DEFINITION>"
    keyword = None
    name = None
    definition = None

    def __init__(keyword, name, definition):
        #Valid:init#
        self.keyword = keyword
        self.name = name
        self.definition = definition

#Valid#
