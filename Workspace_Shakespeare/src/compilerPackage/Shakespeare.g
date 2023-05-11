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
	
	title
	
	{System.out.println("    - Ho riconosciuto un documento Shakespeare");}
	;

title
	:
	{System.out.println("* Sto per riconoscere il titolo");}
	ID DOT WS?
	dramatisPersonae+ //definisco alemno 1 personaggio
	acts
	scenes
	{System.out.println("    - Ho riconosciuto il titolo");}
	;

dramatisPersonae
	:
	{System.out.println("* Sto per riconoscere un attore");}
	CHARACTER WS? CM WS? ID* DOT WS? 
	
	{System.out.println("    - Ho riconosciuto un attore");}

	;

acts
	:	
	ACT UNITS CL ID* DOT WS
	;
	
scenes	:	
	SCENE UNITS CL ID* DOT WS
	;


/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */
// Romanian numbers (https://gjdanis.github.io/2016/01/23/roman/)
// Basic numbers
ONE         : 'I';
FIVE        : 'V';
TEN         : 'X';
FIFTY       : 'L';
ONEHUNDRED  : 'C';
FIVEHUNDRED : 'D';
ONETHOUSAND : 'M';

ROOT		:	ONETHOUSAND HUNDREDS TENS UNITS ; //DA SISTEMARE, MESSO COSI O NON ANDAVA!!!!!!!!!!!!!!!

// I, II, III, IV, IX or V VI, VII, VIII
UNITS		:	(ONE ((ONE)* | FIVE  | TEN) | FIVE (ONE)*);
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



fragment 
LETTER : 'a'..'z'|'A'..'Z';

fragment 
DIGIT : '0'..'9';


// punteggiatura
CL 	:	':';
CM 	:	',';
DOT   	: 	'.';
//SC 	:	';';
AP    	:	'\'';
EP    	: 	'!';
QM    	:	'?';
FS	:	'/';

// sono le lettere che compongono ogni parola che usiamo
ID  :	( LETTER |'_') 
		( LETTER |DIGIT |'_' )*
    ;

//spazi e new line. non sono visibili come token perche hidden
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;

  
// Brackets
LB	:	'[';		
RB	:	']';


// ho visto questo esempio:
// Are you fresher than nothing? -> Checks to see if Puck is holding a zero
// quindi ho pensato di aggiungere lo zero, solo non so in che sezione metterlo, nel dubbio:
//ZERO            :   	'nothing';





