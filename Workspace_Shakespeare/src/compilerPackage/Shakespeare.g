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
	ID* DOT WS?
	{System.out.println("    - Ho riconosciuto il titolo");}
	body
	;

body	:	
	dramatisPersonae+ //definisco alemno 1 personaggio
	acts
	scenes
	;

dramatisPersonae
	:
	{System.out.println("* Sto per riconoscere un attore");}
	CHARACTER COMMENT
	//nella parentesi della regola sopra dovremmo fare in modo che non cerchi
	//altri caratteri ma che li skippi... come si fa?
	//Nel senso, se non avessi specificato un altra volta char o one
	//avrebbe preso Hamlet come personaggio al posto di ID e anche la i maiscola
	//come one al posto di id 
	
	{System.out.println("    - Ho riconosciuto un attore");}

	;

acts
	:
	{System.out.println("* Sto per riconoscere un atto");}	
	ACT root COMMENT
	{System.out.println("    - Ho riconosciuto un atto");}
	;
	
scenes	:	
	SCENE root COMMENT
	;



/* ****************************
**	 Analizzatore sintattico 
**	 aka Lexer, aka Scanner
***************************** */


// --- atomic definitions
one         : 'I';
five        : 'V';
ten         : 'X';
fifty       : 'L';
oneHundred  : 'C';
fiveHundred : 'D';
oneThousand : 'M';

root  : (oneThousand)* hundreds? tens? units?;

// --- I, II, III, IV, IX or V VI, VII, VIII
units : one ((one)* | five  | ten) | five (one)*; 

// --- X, XX, XXX, XL, XC or L, LX, LXX, LXXX
tens  : ten ((ten)* | fifty | oneHundred) | fifty (ten)*;

// --- C, CC, CCC, CD, CM or D, DC, DCC, DCCC 
hundreds : oneHundred ((oneHundred)* | fiveHundred | oneThousand) | fiveHundred (oneHundred)*; 

COMMENT
    :   (', ' | ': ') (  ~('\n'|'\r')* ) '\r'? '\n';
    

CHARACTER
    :   'Romeo'
    |   'Juliet'
    |	'Hamlet'
    |   'Ghost'
    |   'LadyMacbeth'
    |   'Ophelia'
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
LETTER : 'a'..'z' | 'A'..'Z';

fragment 
DIGIT : '0'..'9';


// punteggiatura
PP 	:	':';
CM 	:	',';
DOT   	: 	'.';
//SC 	:	';';
AP    	:	'\'';
EP    	: 	'!';
QM    	:	'?';
FS	:	'/';


// sono le lettere che compongono ogni parola che usiamo
ID  :   ( LETTER |'_') 
		( LETTER |DIGIT |'_')* 
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




