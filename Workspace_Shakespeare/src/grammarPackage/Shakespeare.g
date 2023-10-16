grammar Shakespeare;

options {
    language = Java;
}

@header {
    package grammarPackage;
}

@lexer::header {
    package grammarPackage;
}

@members {
    SPLhandler h;	// Handler declaration
    public SPLhandler getHandler () {
        return h;
    }
    
    // Override and delegation in the management of syntactic errors
    public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
     // getting some meta info of the error
        String hdr = " * " + getErrorHeader(e);
        String msg = " - " + getErrorMessage(e, tokenNames);
        
        // current token
        Token tk = input.LT(1);
        
        // let the handler handle the message
        h.handleError(tk, hdr, msg);
    }

    // passing token stream to the handler	
    void initParser () {
        h = new SPLhandler(input);
    }
}


/* ****************************
**   Semantic analyzer (Parser) 
***************************** */
parseSPL 
@init {initParser();}
	: 
    	titleRule
    	;

// get the tile of the SPL program
titleRule
	:
    	titlecharRule* d=DOT
    	{h.checkTitle($d);}
    	bodyRule
    	;
    	
titlecharRule
	:	
	f=ID
	{h.buildTitle($f);}
	;
	
bodyRule    
	:   
    	dramatisPersonaeRule+
    	(actRule sceneRule+)+
    	;

// stage character declaration
dramatisPersonaeRule
    	:
    	ch=CHARACTER co=COMMENT
    	{h.checkPersonae($ch, $co);}
    	;

// act declaration
actRule
    	:
    	ACT rn=ID co=COMMENT  // rn = roman number
    	{h.checkAct($rn, $co);}
    	;
    
// scene declaration
sceneRule  
	:   
    	SCENE rn=ID co=COMMENT 
    	{h.checkScene($rn, $co);}    // rn = roman number
    	enterRule?
    	stageEventRule*
    	conditionalRule?
    	(exitRule | exeuntRule)?
    	;

// entrance of one or two stage characters
enterRule
	:
   	LB ENTER (ch1=CHARACTER)? (and=AND ch2=CHARACTER)? RB
   	{h.checkEnter($ch1, $and, $ch2);}
    	;

// exit of one stage character
exitRule
	:
    	LB EXIT ch=CHARACTER RB
    	{h.checkExit($ch);}
    	;
    
// exit of all stage characters if nothing is specified, otherwise two specific ones
exeuntRule
    	:
    	LB EXEUNT (ch1=CHARACTER)? (and=AND ch2=CHARACTER)? RB
    	{h.checkExeunt($ch1, $and, $ch2);}
    	;
	
stageEventRule
    	:
    	ch=CHARACTER CL
    	(
    	rememberRule [ch] 
    	| recallRule [ch] 
    	| printRule[ch] 
    	| readRule [ch] 
    	| wh=(YOU ARE? | THOUART) neg=(NOT)? 
    		(
    		assignmentStatementRule [ch,wh,neg]
    		| assignmentComparisonRule [ch,wh,neg]
    		| assignmentOperationRule [ch,wh,neg]
    		) 
    	)*
	;


// assign a value with a statement
//you are a big cow.
assignmentStatementRule [Token ch, Token wh, Token neg]
	:
	A? (adjectiveRule)* noun=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN)
	el=(EP | DOT)
	{h.checkAssignmentStatement($ch, $noun, $wh, $el, $neg);}
	;


// assign a value with a comparison	
//You are as cowardly as the sum of a rose and a big rose. 	
//You are as cowardly as the sum of a rose and yourself/thyself/me.
//You are as cowardly as the sum of yourself/thyself/me and a rose.
//You are as cowardly as the sum of yourself/thyself/me and yourself/thyself/me.
assignmentComparisonRule [Token ch, Token wh, Token neg]
	:
	(
	AS 
	adj=(POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE)
	AS 
	operationtype=(SUMOF | DIFFBET | PRODOF | QUOTOF)
	(A adjectiveRule* noun1=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN)
	|
	sub1=(THYSELF | YOURSELF | ME)
	)
	AND
	(A adjectiveSecondRule* noun2=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN)
	| sub2=(THYSELF | YOURSELF | ME)
	)
	)
	el=(EP| DOT)
	{h.checkAssignmentComparison($ch, $noun1, $noun2, $sub1, $sub2, $operationtype, $wh, $adj, $el, $neg);}
	;


// assign a value with an equation
//you are the difference between yourself and a big big rose
//you are the difference between a big rose and yourself.
//you are the difference between a big rose and a big rose.
//you are the difference between thyself and yourself. =0
//you are the difference between thyself and me.
assignmentOperationRule [Token ch, Token wh, Token neg]
	:
	operationtype=(SUMOF | DIFFBET | PRODOF| QUOTOF) 
	(sub1=(THYSELF | YOURSELF | ME)
	|
	A adjectiveRule* noun1=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN) 
	)
	AND(
	A adjectiveRule* noun2=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN) 
	|
	sub2=(THYSELF | YOURSELF | ME))
	el=(EP| DOT)
	{h.checkAssignmentOperation($ch, $noun1, $noun2, $sub1, $sub2, $operationtype, $wh, $el, $neg);}
	;

// counts the number of adjectives in order to calculate the assignment value
adjectiveRule
	:
	adj=(POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE)
	{h.adjectiveCounter++;
	 h.adjBuilder($adj);}
	;

// conditional statement to perform  a goto
conditionalRule
	:
	ch1=CHARACTER CL
	AMI 
	ev=(
		BETTER 
		| (AS (POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE) AS) 
		| WORSE
	) 
	THAN YOUC QM

 	ch2=CHARACTER CL
	gt=(IFSO | IFNOT) 
	gt2=(LETUS | WESHALL | WEMUST) 
	gt3rs=(RETURNTO | PROCEEDTO) 
	gt4=SCENEC rn=ID DOT
	
	{h.checkConditional($ch1, $ev, $ch2, $gt, $gt2, $gt3rs, $gt4, $rn);}
	;
	
// counts the number of the second list of adjectives in order to calculate the assignment value
adjectiveSecondRule
	:
	adj=(POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE)
	{h.adjectiveCounter2++;
	 h.adjBuilder2($adj);}
	;

// push an element into the stack of a stage character
rememberRule [Token ch]
	:
	REMEMBER who=(ME | YOURSELF) DOT
	{h.checkRemember($ch, $who);}
	;

// pop an element from the stack of a stage character
recallRule [Token ch]
	:
	RECALL DOT
	{h.checkRecall($ch);}
	;

// print the value of a character (value or ASCII)
printRule [Token ch]
	:
	phrase=(PRINTVALUE | PRINTASCII | PRINTASCII2)
	wh=(DOT | EP)
	{h.checkPrint($ch, $phrase, $wh);}
	;

// read an input (value or ASCII)
readRule [Token ch]
	:
	phrase=(READVALUE | READASCII)
	wh=(DOT | EP)
	{h.checkRead($ch, $phrase, $wh);}
	;

/* ****************************
**   Syntax parser (Lexer/Scanner)
***************************** */

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
    |   'summer\'s day'
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
YOU         	:	'You';
ARE     	:   	'are';
THOUART    	:   	'Thou art';
AS      	:   	'as';
SUMOF       	:   	'the sum of';
DIFFBET        	:   	'the difference between';
PRODOF 		:   	'the product of';
QUOTOF		:	'the quotient of';
A		: 	'a';
THYSELF		:   	'thyself';
NOT		:	'not';

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
PRINTASCII2     :    	'Speak thy mind';
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