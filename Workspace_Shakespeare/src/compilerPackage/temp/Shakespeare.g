grammar Shakespeare;

options {
	language = Java;
}

@header {
	package compilerPackage;
}

@lexer::header {
	package compilerPackage;
}

@members {

}


/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */
parseSPL 
	: 
	{System.out.println("* Sto per riconoscere un documento Shakespeare");}
	//roba da eseguire
	// title:{};
	// body:{};	
	title
	{System.out.println("    - Ho riconosciuto un documento Shakespeare");}
	;

title
	:
	{System.out.println("* Sto per riconoscere il titolo");}
	ID DOT
	{System.out.println("    - Ho riconosciuto il titolo");}
	;

/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */

// quali teniamo?
//fragment
//EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;


//fragment
//HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

/*fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;
*/

/*
fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
*/
fragment 
LETTER : 'a'..'z'|'A'..'Z';

fragment 
DIGIT : '0'..'9';


// da rivedere
// comparatori
EQ 	:	'Is' CHARACTER 'as' GOOD 'as' 'CHARACTER';
GT 	: 	'Is' CHARACTER POSITIVEADJECTIVE 'than' 'CHARACTER';
LT 	: 	'Is' CHARACTER NEGATIVEADJECTIVE 'than' 'CHARACTER';
// due dubbi:
// - NICEADJECTIVE e BADADJECTIVE si ricavano da Positive Adjectives e Negative Adjectives, solo ho casi diversi in base all'aggettivo (amazing -> more amazing than, brave -> braver than)
// - come gestisco casi come "Am I as miserable as a blister?", nel senso si usa sempre questa forma e quindi bisogna cambiare sopra? e un personaggio può comparare solo se stesso con altri oppure  X può comparare Y e Z?


// punteggiatura
CL 	:	':';
//CM 	:	',';
DOT   	: 	'.';
//SC 	:	';';
//AP    	:	'’'; //cambiato rispetto al classico " ' " perche crea errore, in ogni caso non serve usarlo
EP    	: 	'!';
QM    	:	'?';


// dovrebbero esserci solo le []
// parentesi
//LP 	: '(';		// Parenthesis
//RP 	: ')';
LB	:	'[';		// Brackets
RB	:	']';
//LBR	:	'{';		// BRaces
//RBR	:	'}';


// da capire meglio, esempio:
// You are as tiny as the sum of yourself and a hamster. -> Adds one to Puck
// operatori
// si gioca ancora parole nice e non (da capire meglio)
ADD	:	'sum';
SUB	:	'-';
STAR	:	'*';
DIV	:	'/';
MOD	:	'%';


// non dovrebbero esserci, toglierei
// operatori logici
/*
NOT			:	'!';
AND			: '&&';
OR			: '||';
XOR			: '^';
AND_BIT :	'&';
OR_BIT 	:	'|';
*/

// non dovrebbero esserci, toglierei
// basic types
//VOID 				:	'void';
// attenzione...
//BASIC_TYPE 	: 'int' 	| 'long'		| 'short' 	| 
	//						'float' |	'double'	| 'boolean' | 
	//						'char'	|	'String';


// non dovrebbero esserci, toglierei
/* attenzione
VOID 			:	'void';
BOOLEAN		:	'boolean';
CHAR			:	'char';
DOUBLE		:	'double';
FLOAT			:	'float';
INT				:	'int';
LONG			:	'long';
SHORT			:	'short';
STRING		:	'String'; // attenzione
*/							
		
					
// keywords
ACT		:	'Act';
SCENE		:	'Scene';	
ENTER           :   	'Enter';
EXIT            :   	'Exit';
EXEUNT          :   	'Exeunt';
GOTO            :   	'goto';       
// le prossime hanno senso/si può fare?  credo di si
OUTPUTVALUE     :   	'Open your heart';  
OUTPUTASCII     :   	'Speak your mind';
INPUTVALUE      :   	'Open your mind';  
INPUTASCII      :   	'Listen to your heart';


// ho visto questo esempio:
// Are you fresher than nothing? -> Checks to see if Puck is holding a zero
// quindi ho pensato di aggiungere lo zero, solo non so in che sezione metterlo, nel dubbio:
ZERO            :   	'nothing';


// Romanian numbers (https://gjdanis.github.io/2016/01/23/roman/)
// Basic numbers
ONE         : 'I';
FIVE        : 'V';
TEN         : 'X';
FIFTY       : 'L';
ONEHUNDRED  : 'C';
FIVEHUNDRED : 'D';
ONETHOUSAND : 'M';

ROOT		:	(ONETHOUSAND)* HUNDREDS? TENS? UNITS?;

// I, II, III, IV, IX or V VI, VII, VIII
UNITS		:	ONE ((ONE)* | FIVE  | TEN) | FIVE (ONE)*;
// così però si può avere IIII, abbiamo visto solo * o +, non come --> nelle lezioni successive lo spiega
// limitarle, penso serva qualcosa come: ONE | ONE ONE| ONE ONE ONE

// X, XX, XXX, XL, XC or L, LX, LXX, LXXX
TENS 		:	TEN ((TEN)* | FIFTY | ONEHUNDRED) | FIFTY (TEN)*;

// C, CC, CCC, CD, CM or D, DC, DCC, DCCC 
HUNDREDS	:	ONEHUNDRED ((ONEHUNDRED)* | FIVEHUNDRED | ONETHOUSAND) | FIVEHUNDRED (ONEHUNDRED)*; 


CHARACTER
    :   'Romeo'
    |   'Juliet'
    |   'Ghost'
    |   'LadyMacbeth'
    |   'Ofelia'
    |   'Tebaldo'
    |   'Claudio'
    |   'Mercuzio'
    |   'Banquo'
    |   'Fulgencio'
    |   'Gertrude'
    |   'Desdemona'
    |   'Jago'
    |   'Polonio'
    |   'Macduff'
    |   'Shylock'
    |   'Laerte'
    |   'Orazio'
    |   'Prospero'
    ;


// Positive Nouns (+1)
POSITIVENOUN
    :   'Heaven'
    |   'King'
    |   'Lord'
    |   'angel'
    |   'flower'
    |   'happiness'
    |   'joy'
    |   'plum'
    |   'summer’s day'
    |   'hero'
    |   'rose'
    |   'kingdom'
    |   'pony'
    ;


// Neutral Nouns (+1)
NEUTRALNOUN
    :   'animal'
    |   'aunt'
    |   'brother'
    |   'cat'
    |   'chihuahua'
    |   'cousin'
    |   'cow'
    |   'daughter'
    |   'door'
    |   'face'
    |   'father'
    |   'fellow'
    |   'granddaughter'
    |   'grandfather'
    |   'grandmother'
    |   'grandson'
    |   'hair'
    |   'hamster'
    |   'horse'
    |   'lamp'
    |   'lantern'
    |   'mistletoe'
    |   'moon'
    |   'morning'
    |   'mother'
    |   'nephew'
    |   'niece'
    |   'nose'
    |   'purse'
    |   'road'
    |   'roman'
    |   'sister'
    |   'sky'
    |   'son'
    |   'squirrel'
    |   'stonewall'
    |   'thing'
    |   'town'
    |   'tree'
    |   'uncle'
    |   'wind'
    ;


// Negative Nouns (-1)
NEGATIVENOUN
    :   'Hell'
    |   'Microsoft'
    |   'bastard'
    |   'beggar'
    |   'blister'
    |   'codpiece'
    |   'coward'
    |   'curse'
    |   'death'
    |   'devil'
    |   'draught'
    |   'famine'
    |   'flirt-gill'
    |   'goat'
    |   'hate'
    |   'hog'
    |   'hound'
    |   'leech'
    |   'lie'
    |   'pig'
    |   'plague'
    |   'starvation'
    |   'toad'
    |   'war'
    |   'wolf'
    ;


POSITIVEADJECTIVE
    :   'amazing'
    |   'beautiful'
    |   'blossoming'
    |   'bold'
    |   'brave'
    |   'charming'
    |   'clearest'
    |   'cunning'
    |   'cute'
    |   'delicious'
    |   'embroidered'
    |   'fair'
    |   'fine'
    |   'gentle'
    |   'golden'
    |   'good'
    |   'handsome'
    |   'happy'
    |   'healthy'
    |   'honest'
    |   'lovely'
    |   'loving'
    |   'mighty'
    |   'noble'
    |   'peaceful'
    |   'pretty'
    |   'prompt'
    |   'proud'
    |   'reddest'
    |   'rich'
    |   'smooth'
    |   'sunny'
    |   'sweet'
    |   'sweetest'
    |   'trustworthy'
    |   'warm'
    ;


NEUTRALADJECTIVE
    :   'big'
    |   'black'
    |   'blue'
    |   'bluest'
    |   'bottomless'
    |   'furry'
    |   'green'
    |   'hard'
    |   'huge'
    |   'large'
    |   'little'
    |   'normal'
    |   'old'
    |   'purple'
    |   'red'
    |   'rural'
    |   'small'
    |   'tiny'
    |   'white'
    |   'yellow'
    ;


NEGATIVEADJECTIVE
    :   'bad'
    |   'cowardly'
    |   'cursed'
    |   'damned'
    |   'dirty'
    |   'disgusting'
    |   'distasteful'
    |   'dusty'
    |   'evil'
    |   'fat'
    |   'fat-kidneyed'
    |   'fatherless'
    |   'foul'
    |   'hairy'
    |   'half-witted'
    |   'horrible'
    |   'horrid'
    |   'infected'
    |   'lying'
    |   'miserable'
    |   'misused'
    |   'oozing'
    |   'rotten'
    |   'smelly'
    |   'snotty'
    |   'sorry'
    |   'stinking'
    |   'stuffed'
    |   'stupid'
    |   'vile'
    |   'villainous'
    |   'worried'
    ;

// sono le lettere che compongono ogni parola che usiamo
ID  :	( LETTER |'_') 
		( LETTER |DIGIT |'_')*
    ;

// non dovrebbero esserci, toglierei
//INTEGER :	DIGIT+
 //   ;

// non dovrebbero esserci, toglierei
/*FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;
*/
// non dovrebbero esserci, toglierei
//COMMENT
 //   :   ('//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
 //   |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
  //  ;

// penso serva
/*
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;
*/

// non credo serva
/*
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

// non credo serva
CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;
*/
