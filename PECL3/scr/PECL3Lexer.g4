lexer grammar PECL3Lexer;

// FRAGMENTS
fragment LETTER: [a-zA-Z];
fragment DIGIT: [0-9];
fragment ESC: '\\' [btnr"\\]; // Caracteres de escape

// Comentarios
LINE_COMMENT: '//' .*? NEWLINE -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
DOC_COMMENT: '/***' .*? '***/' -> skip;

// Simbolos basicos
ASSIGN: ':=';
OP: '(';
CP: ')';
COMMA: ',';
COLON: ':';
SEMI_COLON: ';';
NEWLINE: [\r\n]+;
LESSER: '<';
GREATER: '>';
LESSER_EQ: '<=';
GREATER_EQ: '>=';
EQ: '==';
NOT_EQ: '!=';
BIT_AND: '&';
AND: '&&';
BIT_OR: '|';
OR: '||';
ADD: '+';
SUB: '-';
MULT: '*';
QUOTIENT: '/';
UNDER_SCORE: '_';
OP_BRACKET: '[';
CL_BRACKET: ']';
NOT: '!' ;

// Tipos de datos
INT: ('-')? DIGIT+;
FLOAT: ('-')? DIGIT+ '.' DIGIT*;
STRING: '"' (ESC | .)*? '"';
BOOLEAN: TRUE | FALSE;

// Asignacion de tipos
AS_STRING: 'cadena';
AS_NUMBER: 'numero';
AS_VOID: 'void';
AS_BOOLEAN: 'booleano';

// Palabras reservadas
INCLUDE: 'include';
IF: 'if';
WHILE: 'while';
FUNC: 'function';
ST_BLOCK: 'begin';
END_BLOCK: 'end';
END_IF: 'endif';
ST_DO: 'do';
END_DO: 'enddo';
RETURN: 'devolver';
FROM: 'from';
TO: 'to';
STEP: 'step';
ELSE: 'else';
FOR: 'for';
IN: 'in';
THEN: 'then';
TRUE: 'true';
FALSE: 'false';

// Identificadores
ID: (UNDER_SCORE | LETTER) (LETTER | DIGIT | UNDER_SCORE)*;

// Espacios en blanco, tabuladores..
WS: [ \t\n\r]+ -> skip;
