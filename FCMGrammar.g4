grammar FCMGrammar;

program :( line | block |ifBlock |whileBlock )* EOF;
block : PARAN_OPEN (line | ifBlock | whileBlock)*  PARAN_CLOSE;
cond :  STATEMENT*;
ifBlock : IF B_OPEN cond B_CLOSE block
        | IF B_OPEN cond B_CLOSE block elseBlock
        | IF B_OPEN cond B_CLOSE block elseifBlock;
elseBlock : ELSE block;
elseifBlock : ELSEIF cond block elseifBlock
              |ELSEIF cond block elseBlock;
whileBlock : WHILE cond block;
line : STATEMENT';';


ELSEIF : 'else if';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
B_OPEN :'(';
B_CLOSE : ')';
PARAN_OPEN : '{';
PARAN_CLOSE : '}';
STATEMENT : [-A-Za-z0-9"=+*,/ ]*;
SPECIAL : [$&:?@#|'<>.^*%!+-]*;
WS  : [ \t\r\n]+ -> skip ;
Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
