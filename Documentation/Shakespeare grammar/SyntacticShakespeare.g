
CHARACTER
    :   'Romeo'
    |   'Juliet'
    |   'Hamlet'
    |   'Ghost'
    |   'LadyMacbeth'
    |   'Ophelia'
    |   'Mercutio'
    |   'Banquo'
    |   'Gertrude'
    |   'Polonio'
    |   'Shylock'
    |   'Prospero'
    ;

// (+1)
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

// (+1)
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

// (-1)
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
ACT     	:  	'Act';
SCENE      	:   	'Scene';    
ENTER           :	'Enter';
EXIT            :       'Exit';
EXEUNT          :       'Exeunt';
AND         	:	'and';


// assignment
YOU         	:   'You';
ARE     	:   'are';
THOUART    	:   'Thou art';
AS      	:   'as';
SUMOF       	:   'the sum of';
DIFFBET        	:   'the difference between';
PRODOF 		:   'the product of';
A		:   'a';
THYSELF		:   'thyself';

// conditional statement
AMI		:	'Am I';
BETTER		:   	'better';
WORSE		: 	'worse';
THAN		:	'than';
YOUC		: 	'you';
SCENEC		:	'scene';
IFSO		:	'If so,';
IFNOT		:	'If not,';
LETUS		:	'let us';
WESHALL		:	'we shall';
WEMUST		:	'we must';
RETURNTO	:	'return to';		
PROCEEDTO	:	'proceed to';

// input/output
PRINTVALUE     	:       'Open your heart';  
PRINTASCII     	:       'Speak your mind';
READVALUE      	:       'Listen to your heart';
READASCII      	:       'Open your mind';

// push/pop
REMEMBER	:   	'Remember';
ME		:   	'me';
YOURSELF	:   	'yourself';
RECALL		:   	('Recall') (  ~('.'|'!')* ) ;

fragment 
LETTER 		: 	'a'..'z' | 'A'..'Z';

fragment 
DIGIT 		: 	'0'..'9';

// punctuation
CL  		:   	':';
CM  		:	',';
DOT     	:	'.';
SC    		:  	';';
AP      	:  	'\'';
EP      	:  	'!';
QM      	:	'?';
FS  		:	'/';
LB  		:	'[';        
RB  		:	']';

ID  	
	:   
	( LETTER |'_') 
        ( LETTER |DIGIT |'_')* 
   	;

COMMENT
    	:   
        (', ' | ': ') (  ~('\n'|'\r')* ) '\r'? '\n'
        ;
        
WS
	:   
	( ' '
        | '\t'
        | '\r'
        | '\n'
        )+	{$channel=HIDDEN;}
	;

ERROR_TK        : . ;  // error token  for the handler