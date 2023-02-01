/**
 * Language to concisely represent modal logic formulas with known modalities:
 * - time (future): G, F, X, U
 * - time (past): S
 * - belief: Bi
 * - knowledge: Ki
 * - possibility: P, C
 */
grammar Modl;

formulae : (formula '.')+ ;

// TODO rootFormula : proposition | nAryBooleanFormula | unaryBooleanFormula | ...

formula :
    | proposition
    | booleanFormula
    | temporalFormula
    | quantification ;

proposition : ID ;

booleanFormula :
    | unaryBooleanFormula
    | disjointUnionFormula
    | enclosedBooleanFormula ;

unaryBooleanFormula : negation ;

negation : '¬' formula ;

enclosedBooleanFormula : '(' nAryBooleanFormula ')' ;

nAryBooleanFormula :
    | binaryBooleanFormula
    | otherNAryBooleanFormula ;

binaryBooleanFormula :
    | implication
    | equivalence ;

otherNAryBooleanFormula :
    | conjunction
    | disjunction
    | disjointUnionFormula ;

implication : formula '→' formula ;

equivalence : formula '↔' formula ;

conjunction : formula ('∧' formula)+ ;

disjunction : formula ('∨' formula)+ ;

disjointUnionFormula : '{' proposition+ '}' ;

quantification :
    | existentialQuantification
    | universalQuantification ;

// TODO support CTL* by allowing any formula after a quantifier

existentialQuantification : 'E' temporalFormula ;

universalQuantification : 'A' temporalFormula ;

temporalFormula :
    | unaryTemporalFormula
    | enclosedBinaryTemporalFormula ;

unaryTemporalFormula :
    | always
    | eventually
    | next ;

always : 'G' formula ;

eventually : 'F' formula ; // 'finally' is an ANTLR keyword

next : 'X' formula ;

enclosedBinaryTemporalFormula : '(' binaryTemporalFormula ')' ;

binaryTemporalFormula :
    | until
    | release ;

until : formula 'U' formula ;

release : formula 'R' formula ;

ID : [a-z][a-zA-Z0-9_]* ;

WS : [ \t]+ -> skip ;

CRLF : '\r'? '\n' -> skip ;