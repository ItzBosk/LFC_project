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

// quali teniamo?
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
CM 	:	',';
DOT   	: 	'.';
SC 	:	';';
AP    	:	''';
EP    	: 	'!';
QM    	:	'?';


// dovrebbero esserci solo le []
// parentesi
LP 	: '(';		// Parenthesis
RP 	: ')';
LB	:	'[';		// Brackets
RB	:	']';
LBR	:	'{';		// BRaces
RBR	:	'}';


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
NOT			:	'!';
AND			: '&&';
OR			: '||';
XOR			: '^';
AND_BIT :	'&';
OR_BIT 	:	'|';


// non dovrebbero esserci, toglierei
// basic types
VOID 				:	'void';
// attenzione...
BASIC_TYPE 	: 'int' 	| 'long'		| 'short' 	| 
							'float' |	'double'	| 'boolean' | 
							'char'	|	'String';


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
// le prossime hanno senso/si può fare?
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
// così però si può avere IIII, abbiamo visto solo * o +, non come
// limitarle, penso serva qualcosa come: ONE | ONE ONE| ONE ONE ONE

// X, XX, XXX, XL, XC or L, LX, LXX, LXXX
TENS 		:	TEN ((TEN)* | FIFTY | ONEHUNDRED) | FIFTY (TEN)*;

// C, CC, CCC, CD, CM or D, DC, DCC, DCCC 
HUNDREDS	:	ONEHUNDRED ((ONEHUNDRED)* | FIVEHUNDRED | ONETHOUSAND) | FIVEHUNDRED (ONEHUNDRED)*; 


// Characters
ROMEO           :   'Romeo';
JULIET          :   'Juliet';
GHOST           :   'Ghost';
LADYMACBETH     :   'LadyMacbeth';
OFELIA          :   'Ofelia';
TEBALDO         :   'Tebaldo';
CLAUDIO         :   'Claudio';
MERCUZIO        :   'Mercuzio';
BANQUO          :   'Banquo';
FULGENCIO       :   'Fulgencio';
GERTRUDE        :   'Gertrude';
DESDEMONA       :   'Desdemona';
JAGO            :   'Jago';
POLONIO         :   'Polonio';
MACDUFF         :   'Macduff';
SHYLOCK         :   'Shylock';
LAERTE          :   'Laerte';
ORAZIO          :   'Orazio';
PROSPERO        :   'Prospero';

CHARACTER
    :   ROMEO
    :   JULIET
    :   GHOST
    :   LADYMACBETH
    :   OFELIA
    :   TEBALDO
    :   CLAUDIO
    :   MERCUZIO
    :   BANQUO
    :   FULGENCIO
    :   GERTRUDE
    :   DESDEMONA
    :   JAGO
    :   POLONIO
    :   MACDUFF
    :   SHYLOCK
    :   LAERTE
    :   ORAZIO
    :   PROSPERO
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

POSITIVENOUN
    :   HEAVEN
    |   KING
    |   LORD
    |   ANGEL
    |   FLOWER
    |   HAPPINESS
    |   JOY
    |   PLUM
    |   SUMMERDAY
    |   HERO
    |   ROSE
    |   KINGDOM
    |   PONY
    ;

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

NEUTRALNOUN
    :   ANIMAL
    |   AUNT
    |   BROTHER
    |   CAT
    |   CHIHUAHUA
    |   COUSIN
    |   COW
    |   DAUGHTER
    |   DOOR
    |   FACE
    |   FATHER
    |   FELLOW
    |   GRANDDAUGHTER
    |   GRANDFATHER
    |   GRANDMOTHER
    |   GRANDSON
    |   HAIR
    |   HAMSTER
    |   HORSE
    |   LAMP
    |   LANTERN
    |   MISTLETOE
    |   MOON
    |   MORNING
    |   MOTHER
    |   NEPHEW
    |   NIECE
    |   NOSE
    |   PURSE
    |   ROAD
    |   ROMAN
    |   SISTER
    |   SKY
    |   SON
    |   SQUIRREL
    |   STONEWALL
    |   THING
    |   TOWN
    |   TREE
    |   UNCLE
    |   WIND
    ;

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

NEGATIVENOUN
    :   HEAVEN
    |   HELL
    |   MICROSOFT
    |   BASTARD
    |   BEGGAR
    |   BLISTER
    |   CODPIECE
    |   COWARD
    |   CURSE
    |   DEATH
    |   DEVIL
    |   DRAUGHT
    |   FAMINE
    |   FLIRTGILL
    |   GOAT
    |   HATE
    |   HOG
    |   HOUND
    |   LEECH
    |   LIE
    |   PIG
    |   PLAGUE
    |   STARVATION
    |   TOAD
    |   WAR
    |   WOLF
    ;

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

POSITIVEADJECTIVE
    :   AMAZING
    |   BEAUTIFUL
    |   BLOSSOMING
    |   BOLD
    |   BRAVE
    |   CHARMING
    |   CLEAREST
    |   CUNNING
    |   CUTE
    |   DELICIOUS
    |   EMBROIDERED
    |   FAIR
    |   FINE
    |   GENTLE
    |   GOLDEN
    |   GOOD
    |   HANDSOME
    |   HAPPY
    |   HEALTHY
    |   HONEST
    |   LOVELY
    |   LOVING
    |   MIGHTY
    |   NOBLE
    |   PEACEFUL
    |   PRETTY
    |   PROMPT
    |   PROUD
    |   REDDEST
    |   RICH
    |   SMOOTH
    |   SUNNY
    |   SWEET
    |   SWEETEST
    |   TRUSTWORTHY
    |   WARM
    ;

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

NEUTRALADJECTIVE
    :   BIG
    |   BLACK
    |   BLUE
    |   BLUEST
    |   BOTTOMLESS
    |   FURRY
    |   GREEN
    |   HARD
    |   HUGE
    |   LARGE
    |   LITTLE
    |   NORMAL
    |   OLD
    |   PURPLE
    |   RED
    |   RURAL
    |   SMALL
    |   TINY
    |   WHITE
    |   YELLOW
    ;

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

NEGATIVEADJECTIVE
    :   BAD
    |   COWARDLY
    |   CURSED
    |   DAMNED
    |   DIRTY
    |   DISGUSTING
    |   DISTASTEFUL
    |   DUSTY
    |   EVIL
    |   FAT
    |   FATKIDNEYED
    |   FATHERLESS
    |   FOUL
    |   HAIRY
    |   HALFWITTED
    |   HORRIBLE
    |   HORRID
    |   INFECTED
    |   LYING
    |   MISERABLE
    |   MISUSED
    |   OOZING
    |   ROTTEN
    |   SMELLY
    |   SNOTTY
    |   SORRY
    |   STINKING
    |   STUFFED
    |   STUPID
    |   VILE
    |   VILLAINOUS
    |   WORRIED
    ;

// credo servano
ID  :	( LETTER |'_') 
			( LETTER |DIGIT |'_')*
    ;

// non dovrebbero esserci, toglierei
INTEGER :	DIGIT+
    ;

// non dovrebbero esserci, toglierei
FLOAT
    :   DIGIT+ '.' DIGIT* EXPONENT?
    |   '.' DIGIT+ EXPONENT?
    |   DIGIT+ EXPONENT
    ;

// non dovrebbero esserci, toglierei
COMMENT
    :   ('//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/') {$channel=HIDDEN;}
    ;

// penso serva
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

// non credo serva
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

// non credo serva
CHAR:  '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

