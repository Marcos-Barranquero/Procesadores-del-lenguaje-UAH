parser grammar PECL3Parser;
options {
	tokenVocab = PECL3Lexer;
}

prog: (
		newline
		| def_var
		| def_func
		| lib
		| assign_sc
	)*;

// Funciones basicas
return_val: return_kw op_par? (expr_content|logic_expr) cl_par? semi_colon;

while_op:
	while_kw op_par logic_expr cl_par(
		(newline* (expr_total | def_var | assign_sc) newline*)
		| (newline* block_start)?
		  newline*(expr_total
					| def_var
					| assign_sc
					| basic_func
				)* (newline* block_end)?);

if_op:
	if_kw op_par (logic_expr|func_call) cl_par then_kw newline* (
		expr_total
		| def_var
		| assign_sc
		| basic_func
	)* newline* (if_end | else_op);

else_op:
	else_kw newline* (expr_total | def_var | assign_sc | basic_func)* newline* if_end;

for_op:  
	(
		for_kw identifier from_kw (identifier | int_n) to_kw (identifier| int_n	) step_op? do_start newline*
		 block_start? newline*
	) (expr_total | def_var | assign_sc | basic_func)* newline* do_end block_end?;

// step para los for
step_op:
	(
		step_kw (identifier | int_n)
	);

// Funcionalidades
basic_func: while_op | if_op | for_op | return_val;

assign_sc: assign semi_colon ;

assign:
	identifier (
		(assign_value (expr_content | logic_expr))
		| (
			op_bracket (int_n | identifier) cl_bracket assign_value op_par (
				expr_content (comma expr_content)*
			)? cl_par
		)
	);

	

lib: include_kw identifier semi_colon;

def_func:
	func_kw identifier op_par (
		as_var_type identifier (comma as_var_type identifier)*
	)* cl_par colon as_type newline* block_start newline* (
		expr_total
		| def_var
		| assign_sc
		| basic_func
	)* (newline* return_val)? newline* block_end;

def_var:
	as_type (
		((var_definition | assign) comma)* (var_definition | assign) semi_colon
	);

var_definition: identifier (op_bracket (int_n | identifier)? cl_bracket)? ;

func_call:
	func_id op_par (expr_content (comma expr_content)*)* cl_par;

func_sc: func_call semi_colon; // Solo en el caso que se llame desde el archivo y no desde una expresion normal

expr_total: (expr_content | logic_expr) semi_colon;

expr_content:
	expr_content (mult | quotient) expr_content
	| expr_content (add | sub) expr_content
	| value
	| op_par expr_content cl_par
	| func_call
	| var_id;

logic_expr:
	(
		((not? boolean_n)
		| (not? identifier) 
		| (not? expr_content(lesser | greater | lesser_eq | greater_eq | eq | not_eq) not? expr_content))
		((bit_and | and | bit_or | or) logic_expr)*
	);

// Operaciones matematicas
add: ADD;
sub: SUB;
mult: MULT;
quotient: QUOTIENT;

// Operaciones logicas
lesser: LESSER;
greater: GREATER;
lesser_eq: LESSER_EQ;
greater_eq: GREATER_EQ;
eq: EQ;
not_eq: NOT_EQ;
bit_and: BIT_AND;
and: AND;
bit_or: BIT_OR;
or: OR;

// Identificadores, elementos basicos y palabras reservadas
func_id: identifier;
var_id: identifier;
identifier: ID;
assign_value: ASSIGN;
op_par: OP;
cl_par: CP;
comma: COMMA;
colon: COLON;
semi_colon: SEMI_COLON;
newline: NEWLINE;
block_start: ST_BLOCK;
do_start: ST_DO;
do_end: END_DO;
block_end: END_BLOCK;
if_end: END_IF;
include_kw: INCLUDE;
func_kw: FUNC;
in_kw: IN;
if_kw: IF;
else_kw: ELSE;
while_kw: WHILE;
for_kw: FOR;
return_kw: RETURN;
from_kw: FROM;
to_kw: TO;
step_kw: STEP;
then_kw: THEN;
true_kw: TRUE;
false_kw: FALSE;
op_bracket: OP_BRACKET;
cl_bracket: CL_BRACKET;
not: NOT ;

// Tipos de datos
string: STRING;
boolean_n: BOOLEAN;
int_n: INT;
float_n: FLOAT;
number: int_n | float_n;
value: number | string;

// Asignacion de tipos
type_string: AS_STRING;
type_number: AS_NUMBER;
type_void: AS_VOID;
type_boolean: AS_BOOLEAN;

as_var_type: type_string | type_number|type_boolean;
as_type: as_var_type | type_void;
