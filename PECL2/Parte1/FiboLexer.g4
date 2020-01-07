lexer grammar FiboLexer;

// Fragmentos
fragment LETRA:
	[a-zA-z]; // Posibles letras mayusculas y minúsculas
fragment DIGITO: [0-9]; // Posibles números y digitos
fragment ESCAPE: '\\' [btnr"\\]; // Carácteres de escape

// Comentarios
COMENTARIO_LINEA: '//' .*? SALTOLINEA -> skip;
COMENTARIO_BLOQUE: '/*' .*? '*/' -> skip;
COMENTARIO_DOCUMENTACION: '/***' .*? '***/' -> skip;

// Elementos de sintaxis
ASIGNAR: ':=';
A_PARENTESIS: '(';
C_PARENTESIS: ')';
COMA: ',';
DOSPUNTOS: ':';
PUNTOCOMA: ';';
SALTOLINEA: [\r\n]+;

// Operadores lógicos
MENOR: '<';
MAYOR: '>';
MENORIGUAL: '<=';
MAYORIGUAL: '>=';
IGUAL: '==';
NOIGUAL: '!=';
BIT_AND: '&';
AND: '&&';
BIT_OR: '|';
OR: '||';

// Operadores matemáticos
SUMA: '+';
RESTA: '-';
MUL: '*';
DIV: '/';

// Tipos de datos:
INT: DIGITO+;
FLOAT: DIGITO+ '.' DIGITO+;
STRING: '"' (ESCAPE | .)*? '"';

// Return de tipos:
R_STRING: 'cadena';
R_NUMBER: 'numero';
R_VOID: 'void';

// Palabras reservadas del lenguaje:
INCLUDE: 'include';
IF: 'if';
WHILE: 'while';
FUNCTION: 'function';
BEGIN: 'begin';
END: 'end';
END_IF: 'endif';
RETURN: 'devolver';
ELSE: 'else';
FOR: 'for';
IN: 'in';

// Identificador de variables
IDENTIFICADOR: LETRA (LETRA | DIGITO)*;

// Espacios en blanco, y cosas que nos saltemos al hacer el análisis léxico.
WS: [ \t\n\r]+ -> skip;
