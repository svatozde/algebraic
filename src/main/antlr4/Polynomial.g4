grammar Polynomial;

expr    : MINUS expr                        #negative
        | OP expr CP                        #parenExp
        | ABS expr CP                       #abs
	    | left=expr POWER right=expr        #power
	    | left=expr DIV right=expr          #div
        | left=expr PROD right=expr         #prod
	    | left=expr (PLUS|MINUS) right=expr #plusminus
	    | LEN STR CP                        #len
	    | VAR                               #var
	    | NUM                               #const;

CP      : ')';
OP      : '(';
ABS     : 'ABS(';
LEN     : 'LEN(';
PLUS    : '+';
MINUS   : '-';
PROD    : '*';
DIV     : '/';
POWER   : '^';
NUM     : [0-9.]+;
QOT     : '\'';
VAR     : [a-z];
STR     : '\'' ~[']* '\'';
WS      : ' ' -> skip;