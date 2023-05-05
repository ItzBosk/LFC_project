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
parseJava 
	: SC
	;


/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

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

fragment 
LETTER : 'a'..'z'|'A'..'Z';
fragment 
DIGIT : '0'..'9';

// comparatori
ASSING	: '=';
EQ 			: '==';
NEQ 		: '!=';
GT 			: '>';
GE			: '>=';
LT 			: '<';

// punteggiatura
AT	: '@';
CL 	:	':';
CM 	:	',';
DOT : '.';
SC 	: ';';

// parentesi
LP 	: '(';		// Parenthesis
RP 	: ')';
LB	:	'[';		// Brackets
RB	:	']';
LBR	:	'{';		// BRaces
RBR	:	'}';

// operatori
ADD		: '+';
SUB		: '-';
STAR	: '*';
DIV		: '/';
MOD		:	'%';

// operatori logici
NOT			:	'!';
AND			: '&&';
OR			: '||';
XOR			: '^';
AND_BIT :	'&';
OR_BIT 	:	'|';

// basic types
VOID 				:	'void';
// attenzione...
BASIC_TYPE 	: 'int' 	| 'long'		| 'short' 	| 
							'float' |	'double'	| 'boolean' | 
							'char'	|	'String';
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
ABSTRACT			:	'abstract';
ASSERT				:	'assert';
BREAK					:	'break';
BYTE					:	'byte';
CASE					:	'case';
CATCH					:	'catch';
CLASS					:	'class';
CONTINUE			:	'continue';
DEFAULT				:	'default';
DO						:	'do';
ELSE					:	'else';
ENUM					:	'enum';
EXTENDS				:	'extends';
FINAL					:	'final';
FINALLY				:	'finally';
FOR						:	'for';
IF						:	'if';
IMPLEMENTS		:	'implements';
IMPORT				:	'import';
INSTANCEOF		:	'instanceof';
INTERFACE			:	'interface';
NATIVE				:	'native';
NEW						:	'new';
PACKAGE				:	'package';
PRIVATE				:	'private';
PROTECTED			:	'protected';
PUBLIC				:	'public';
RETURN				:	'return';
STATIC				:	'static';
SUPER					:	'super';
SWITCH				:	'switch';
SYNCHRONIZED	:	'synchronized';
THIS					:	'this';
THROW					:	'throw';
THROWS				:	'throws';
TRANSIENT			:	'transient';
TRY						:	'try';
VOLATILE			:	'volatile';
WHILE					:	'while';

		
ID  :	( LETTER |'_') 
			( LETTER |DIGIT |'_')*
    ;


INTEGER :	DIGIT+
    ;

FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

// List of Nouns
// Positive Nouns (+1)
HEAVEN          :   'Heaven';
KING            :   'King';
LORD            :   'Lord';
ANGEL           :   'angel';
FLOWER          :   'flower';
HAPPINESS       :   'happiness';
JOY             :   'joy';
PLUM            :   'plum';
SUMMERDAY       :   'summer’s day';  // è un problema se sono scritti diversi
HERO            :   'hero';
ROSE            :   'rose';
KINGDOM         :   'kingdom';
PONY            :   'pony';

// Neutral Nouns (+1)
ANIMAL          :   'animal';
AUNT            :   'aunt';
BROTHER         :   'brother';
CAT             :   'cat';
CHIHUAHUA       :   'chihuahua';
COUSIN          :   'cousin';
COW             :   'cow';
DAUGHTER        :   'daughter';
DOOR            :   'door';
FACE            :   'face';
FATHER          :   'father';
FELLOW          :   'fellow';
GRANDDAUGHTER   :   'granddaughter';
GRANDFATHER     :   'grandfather';
GRANDMOTHER     :   'grandmother';
GRANDSON        :   'grandson';
HAIR            :   'hair';
HAMSTER         :   'hamster';
HORSE           :   'horse';
LAMP            :   'lamp';
LANTERN         :   'lantern';
MISTLETOE       :   'mistletoe';
MOON            :   'moon';
MORNING         :   'morning';
MOTHER          :   'mother';
NEPHEW          :   'nephew';
NIECE           :   'niece';
NOSE            :   'nose';
PURSE           :   'purse';
ROAD            :   'road';
ROMAN           :   'roman';
SISTER          :   'sister';
SKY             :   'sky';
SON             :   'son';
SQUIRREL        :   'squirrel';
STONEWALL       :   'stone wall';   // anche se c'è uno spazio va bene? + stesso dubbio di SUMMERDAY
THING           :   'thing';
TOWN            :   'town';
TREE            :   'tree';
UNCLE           :   'uncle';
WIND            :   'wind';

// Negative Nouns (-1)
HELL            :   'Hell';
MICROSOFT       :   'Microsoft';
BASTARD         :   'bastard';
BEGGAR          :   'beggar';
BLISTER         :   'blister';
CODPIECE        :   'codpiece';
COWARD          :   'coward';
CURSE           :   'curse';
DEATH           :   'death';
DEVIL           :   'devil';
DRAUGHT         :   'draught';
FAMINE          :   'famine';
FLIRTGILL       :   'flirt-gill';   // con sto trattino che sfaccim
GOAT            :   'goat';
HATE            :   'hate';
HOG             :   'hog';
HOUND           :   'hound';
LEECH           :   'leech';
LIE             :   'lie';
PIG             :   'pig';
PLAGUE          :   'plague';
STARVATION      :   'starvation';
TOAD            :   'toad';
WAR             :   'war';
WOLF            :   'wolf';


// List of Adjectives
// Positive Adjectives
AMAZING         :   'amazing';
BEAUTIFUL       :   'beautiful';
BLOSSOMING      :   'blossoming';
BOLD            :   'bold';
BRAVE           :   'brave';
CHARMING        :   'charming';
CLEAREST        :   'clearest';
CUNNING         :   'cunning';
CUTE            :   'cute';
DELICIOUS       :   'delicious';
EMBROIDERED     :   'embroidered';
FAIR            :   'fair';
FINE            :   'fine';
GENTLE          :   'gentle';
GOLDEN          :   'golden';
GOOD            :   'good';
HANDSOME        :   'handsome';
HAPPY           :   'happy';
HEALTHY         :   'healthy';
HONEST          :   'honest';
LOVELY          :   'lovely';
LOVING          :   'loving';
MIGHTY          :   'mighty';
NOBLE           :   'noble';
PEACEFUL        :   'peaceful';
PRETTY          :   'pretty';
PROMPT          :   'prompt';
PROUD           :   'proud';
REDDEST         :   'reddest';
RICH            :   'rich';
SMOOTH          :   'smooth';
SUNNY           :   'sunny';
SWEET           :   'sweet';
SWEETEST        :   'sweetest';
TRUSTWORTHY     :   'trustworthy';
WARM            :   'warm';

// Neutral Adjectives
BIG             :   'big';
BLACK           :   'black';
BLUE            :   'blue';
BLUEST          :   'bluest';
BOTTOMLESS      :   'bottomless';
FURRY           :   'furry';
GREEN           :   'green';
HARD            :   'hard';
HUGE            :   'huge';
LARGE           :   'large';
LITTLE          :   'little';
NORMAL          :   'normal';
OLD             :   'old';
PURPLE          :   'purple';
RED             :   'red';
RURAL           :   'rural';
SMALL           :   'small';
TINY            :   'tiny';
WHITE           :   'white';
YELLOW          :   'yellow';

// Negative Adjectives
BAD             :   'bad';
COWARDLY        :   'cowardly';
CURSED          :   'cursed';
DAMNED          :   'damned';
DIRTY           :   'dirty';
DISGUSTING      :   'disgusting';
DISTASTEFUL     :   'distasteful';
DUSTY           :   'dusty';
EVIL            :   'evil';
FAT             :   'fat';
FATKIDNEYED     :   'fat-kidneyed';  // doubts
FATHERLESS      :   'fatherless';
FOUL            :   'foul';
HAIRY           :   'hairy';
HALFWITTED      :   'half-witted';  // doubts
HORRIBLE        :   'horrible';
HORRID          :   'horrid';
INFECTED        :   'infected';
LYING           :   'lying';
MISERABLE       :   'miserable';
MISUSED         :   'misused';
OOZING          :   'oozing';
ROTTEN          :   'rotten';
SMELLY          :   'smelly';
SNOTTY          :   'snotty';
SORRY           :   'sorry';
STINKING        :   'stinking';
STUFFED         :   'stuffed';
STUPID          :   'stupid';
VILE            :   'vile';
VILLAINOUS      :   'villainous';
WORRIED         :   'worried';
