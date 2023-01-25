/**
 * Language to concisely represent modal logic formulas with known modalities:
 * - time (future): G, F, X, U
 * - time (past): S
 * - belief: Bi
 * - knowledge: Ki
 * - possibility: P, C
 */
grammar Modl;

//formulae : formula (CRLF formula)* ;

formula :
    | singleFormula
    | booleanFormula
    | temporalFormula ;

singleFormula :
    | quantification
    | enclosedFormula
    | negatedFormula
    | proposition ;

enclosedFormula : '(' formula ')' ;

negatedFormula : '¬' singleFormula ;

proposition : ID ;

booleanFormula :
    | conjunction
    | disjunction
    | implication
    | equivalence ;

conjunction : singleFormula '∧' singleFormula ;

disjunction : singleFormula '∨' singleFormula ;

implication : singleFormula '→' singleFormula ;

equivalence : singleFormula '↔' singleFormula ;

quantification :
    | existentialQuantification
    | universalQuantification ;

// TODO support CTL* by allowing any singleFormula after a quantifier

existentialQuantification : 'E' temporalFormula ;

universalQuantification : 'A' temporalFormula ;

temporalFormula :
    | always
    | eventually
    | next
    | until
    | release ;

always : 'G' singleFormula ;

eventually : 'F' singleFormula ; // 'finally' is an ANTLR keyword

next : 'X' singleFormula ;

until : singleFormula 'U' singleFormula ;

release : singleFormula 'R' singleFormula ;

ID : [a-z][a-zA-Z0-9_]* ;

WS : [ \t]+ -> skip ;

CRLF : '\r'? '\n' ;