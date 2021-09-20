grammar FCMGrammar;

program :( line | block |ifBlock |whileBlock )*;
block : PARAN_OPEN (line | ifBlock | whileBlock)*  PARAN_CLOSE;
cond :  STATEMENT SPECIAL STATEMENT
        | STATEMENT*;
ifBlock : IF'('cond')'block
        | IF'('cond')'block elseBlock
        | IF'('cond')'block elseifBlock;
elseBlock : ELSE block;
elseifBlock : ELSEIF '('cond')'block elseifBlock
              |ELSEIF '('cond')'block elseBlock;


whileBlock : WHILE '('cond')'block;
line : STATEMENT';';

ELSEIF : 'else if';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
PARAN_OPEN : '{';
PARAN_CLOSE : '}';
STATEMENT : [A-Za-z0-9"" ]*;
SPECIAL : [$&+,:;=?@#|'<>.^*()%!-]*;
WS  : [ \t\r\n]+ -> skip ;
Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
