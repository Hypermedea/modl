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

formula :
    | proposition
    | booleanFormula
    | temporalFormula
    | quantification ;

proposition : ID ;

booleanFormula :
    | unaryBooleanFormula
    | enclosedBinaryBooleanFormula ;

unaryBooleanFormula : negation ;

negation : '¬' formula ;

enclosedBinaryBooleanFormula : '(' binaryBooleanFormula ')' ;

binaryBooleanFormula :
    | conjunction
    | disjunction
    | implication
    | equivalence ;

conjunction : formula '∧' formula ;

disjunction : formula '∨' formula ;

implication : formula '→' formula ;

equivalence : formula '↔' formula ;

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