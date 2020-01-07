parser grammar FiboParser;
options {
	tokenVocab = FiboLexer;
}

programa: (
		saltolinea* (
			def_variable
			| def_funcion
			| libreria
			| asignacion
			| funcion
		) saltolinea
	)*;

// Funciones basicas

// Retorno de variable. No pongo varias porque Java no lo soporta
return_val: return_ a_parentesis exp c_parentesis puntoycoma;

// While
while_op:
	while_ a_parentesis exp_logica c_parentesis saltolinea* begin saltolinea* (
		expr
		| def_variable
		| asignacion
		| funcionalidad_basica
	)* saltolinea* end;

// IF
if_op:
	if_ a_parentesis exp_logica c_parentesis saltolinea* (
		expr
		| def_variable
		| asignacion
		| funcionalidad_basica
	)* saltolinea* end_if;

// Else
else_op:
	else_ saltolinea* (
		expr
		| def_variable
		| asignacion
		| funcionalidad_basica
	)* saltolinea* end_if;

// For
for_op:
	for_ a_parentesis for_eval c_parentesis saltolinea* begin saltolinea* (
		expr
		| def_variable
		| asignacion
		| funcionalidad_basica
	)* saltolinea* end;

// For en intervalo
for_eval:
	identificador in (variable_id | numero) dospuntos (
		variable_id
		| numero
	);

// Funcionalidades
funcionalidad_basica:
	while_op
	| if_op
	| else_op
	| for_op
	| return_val;

asignacion: identificador asignar expr;

libreria: include identificador puntoycoma;

// Define una función, con su identificador, argumentos y conjunto de expresiones
def_funcion:
	function identificador a_parentesis (
		r_variable identificador (coma r_variable identificador)*
	)* c_parentesis dospuntos retorno saltolinea* begin saltolinea* (
		expr
		| def_variable
		| asignacion
		| funcionalidad_basica
	)* return_val* saltolinea* end;

// Definir variable
def_variable: retorno ((identificador puntoycoma) | asignacion);

// Llamada a función
funcion:
	funcion_id a_parentesis (exp (coma exp)*)* c_parentesis;

// Expresión en la sintaxis
expr: (exp | exp_logica) puntoycoma;

// Cualquier expresión: operaciones, llamadas a funciones, etc.
exp:
	exp (mul | div) exp
	| exp (suma | resta) exp
	| valor
	| a_parentesis exp c_parentesis
	| funcion
	| variable_id;

// Contiene al menos una expresión lógica
exp_logica:
	exp (
		menor
		| mayor
		| menorigual
		| mayorigual
		| igual
		| noigual
	)
	// Pero puede tener más
	exp (
		(bit_and | and | bit_or | or) exp (
			menor
			| mayor
			| menorigual
			| mayorigual
			| igual
			| noigual
		) exp
	)*;

// Operaciones matematicas
suma: SUMA;
resta: RESTA;
mul: MUL;
div: DIV;

// Operaciones logicas
menor: MENOR;
mayor: MAYOR;
menorigual: MENORIGUAL;
mayorigual: MAYORIGUAL;
igual: IGUAL;
noigual: NOIGUAL;
bit_and: BIT_AND;
and: AND;
bit_or: BIT_OR;
or: OR;

// Elementos de sintaxis
funcion_id: identificador;
variable_id: identificador;
identificador: IDENTIFICADOR;
asignar: ASIGNAR;
a_parentesis: A_PARENTESIS;
c_parentesis: C_PARENTESIS;
coma: COMA;
dospuntos: DOSPUNTOS;
puntoycoma: PUNTOCOMA;
saltolinea: SALTOLINEA;

// Palabras reservadas
begin: BEGIN;
end: END;
end_if: END_IF;
include: INCLUDE;
function: FUNCTION;
in: IN;

// Palabras reservadas en conflicto con sintaxis del target
if_: IF;
else_: ELSE;
while_: WHILE;
for_: FOR;
return_: RETURN;

// Tipos de datos
string: STRING;
numero: INT | FLOAT;
valor: numero | string;

// Return de tipos:
r_string: R_STRING;
r_number: R_NUMBER;
r_void: R_VOID;

// Returns
r_variable: r_string | r_number;
retorno: r_variable | r_void;
