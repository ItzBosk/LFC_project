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
    Handler h; //dichiaro l'handler con dentro le funzioni di controllo in jav
    public Handler getHandler () {
        return h;
    }
    
    // Override e delega nella gestione degli errori sintattici
    public void displayRecognitionError(String[] tokenNames,RecognitionException e) {
     // recupero alcune meta informazioni relative all'errore
        String hdr = " * " + getErrorHeader(e);
        String msg = " - " + getErrorMessage(e, tokenNames);
        
        // recupero il token corrente  
        Token tk = input.LT(1);
        
        // lascio gestire il messaggio all'handler
        h.handleError(tk, hdr, msg);
    }

    void initParser () {
        // passo lo stream di token all'handler 
        h = new Handler(input);
    }
}


/* ****************************
**   Analizzatore semantico (Parser) 
***************************** */
parseSPL 
@init {initParser();} //pezzo di codice eseguito quando regola chiamata, questo metodo inizializza h.
	: 
    	title
    	;

title
	:
    	//{System.out.println("* I'm about to recognize the title..");}
    	titlechar* d=DOT t=WS?
    	{h.checkTitle($d);} //controlla il valore
    	//{System.out.println("    - I recognized the title");}
    	body
    	;
    	
titlechar	:	
	f=ID
	{h.buildTitle($f);}
	;
body    
	:   
    	dramatisPersonae+ //definisco almeno 1 personaggio
    	(acts
    	scenes+)+ // --> anche mettendo scene multiple qua oltre la 1 non viene riconosciuta
    	;

dramatisPersonae
    	:
   	//{System.out.println("* I'm about to recognize a new actor..");}
    	ch=CHARACTER co=COMMENT
    	{h.checkPersonae($ch, $co);}
    	//nella parentesi della regola sopra dovremmo fare in modo che non cerchi
    	//altri caratteri ma che li skippi... come si fa?
    	//Nel senso, se non avessi specificato un altra volta char o one
    	//avrebbe preso Hamlet come personaggio al posto di ID e anche la i maiscola
    	//come one al posto di id 
    	//{System.out.println("* I recognized the new actor");}
    	//{System.out.println();}
    	;

acts
    	:
    	//{System.out.println("* I am about to recognize the next act..");}  
    	ACT rn=ID co=COMMENT  // rn = roman number
    	{h.checkAct($rn, $co);}
    	//{System.out.println("    - Ho riconosciuto un atto");}
    	;
    
scenes  
	:   
    	//{System.out.println("* I'm about to recognize the next scene..");}
    	SCENE rn=ID co=COMMENT 
    	{h.checkScene($rn, $co);}    // rn = roman number
    	//{System.out.println("    - Ho riconosciuto una scena");}
    	enterRule?
    	stageEvent*
    	(exitRule |
    	exeuntRule)?
    	
    	;

// entrano uno o due personaggi
enterRule
	:
	//{System.out.println("* I'm about to recognize an entrance on the scene..");}
   	LB ENTER (ch1=CHARACTER)? (and=AND ch2=CHARACTER)? RB WS?
   	{h.checkEnter($ch1, $and, $ch2);}
   	// o sarebbe meglio considerare and come id e fare check in java se ID = 'and' ???
   	//{System.out.println("* I recognized an entrance on the scene");}
   	//{System.out.println();}
   	//stageEvent+
    	;

// esce un solo personaggio
exitRule
	:
    	//{System.out.println("* I'm about to recognize an exit..");}
    	LB EXIT ch=CHARACTER RB WS?
    	{h.checkExit($ch);}
    	//{System.out.println("* I recognized an exit");}
    	//{System.out.println();}
    	;
    
// escono tutti i personaggi se non specifico nulla, oppure due
exeuntRule
    	:
    	//{System.out.println("* I'm about to recognize a multiple exit..");}
    	LB EXEUNT (ch1=CHARACTER)? (and=AND ch2=CHARACTER)? RB WS?
    	{h.checkExeunt($ch1, $and, $ch2);}
    	//{System.out.println("* I recognized a multiple exit");}
    	//{System.out.println();}
    	;


stageEvent
    	:
    	(ch1=CHARACTER CL WS?
    	(YOU ARE? | THOUART ) 
    	(A?(adjective)* noun1=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN) |
    	(AS (POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE) AS operationtype=(SUMOF | DIFFBET | PRODOF) A  adjectiveSecond+ noun2=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN) 
    	AND A noun3=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN))|
    	(operationtype=(SUMOF | DIFFBET | PRODOF) THYSELF AND A adjective+ noun4=(POSITIVENOUN | NEUTRALNOUN | NEGATIVENOUN)))
    	(EP| DOT))
	{h.checkStageEvent($ch1,$noun1,$noun2,$noun3,$noun4, $operationtype);}
	;
	
adjective
	:
	(POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE)
	{h.adjectiveCounter++;}
	;

//serve per le frasi con as...as per comparare i due pezzi di frase.
adjectiveSecond
	:
	(POSITIVEADJECTIVE | NEUTRALADJECTIVE | NEGATIVEADJECTIVE)
	{h.adjectiveCounter2++;}
	;

/* ****************************
**   Analizzatore sintattico (Lexer/Scanner)
***************************** */

CHARACTER
    :   'Romeo'
    |   'Juliet'
    |   'Hamlet'
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
ACT     	:  	'Act';
SCENE      	:   	'Scene';    
ENTER           :       'Enter';
EXIT            :       'Exit';
EXEUNT          :       'Exeunt';
AND         	:	'and';



YOU         	:   'You';
ARE     	:   'are';
THOUART    	:   'Thou art';
AS      	:   'as';
SUMOF       	:   'the sum of';
DIFFBET        	:   'the difference between';
PRODOF 		:   'the product of';
A		:   'a';
THYSELF		:   'thyself';


//GOTO          :     	'goto';       
// le prossime hanno senso/si può fare?  credo di si
PRINTVALUE     	:       'Open your heart';  
PRINTASCII     	:       'Speak your mind';
READVALUE      	:       'Open your mind';  
READASCII      	:       'Listen to your heart';



fragment 
LETTER 		: 	'a'..'z' | 'A'..'Z';

fragment 
DIGIT 		: 	'0'..'9';


// punteggiatura
CL  	:   ':';
CM  	:   ',';
DOT     :   '.';
//SC    :   ';';
AP      :   '\'';
EP      :   '!';
QM      :   '?';
FS  	:   '/';
LB  	:   '[';        
RB  	:   ']';

// sono le lettere che compongono ogni parola che usiamo
ID  :   ( LETTER |'_') 
        ( LETTER |DIGIT |'_')* 
    ;


COMMENT
    	:   
        (', ' | ': ') (  ~('\n'|'\r')* ) '\r'? '\n'
        ;
        


WS  :   
	( ' '
        | '\t'
        | '\r'
        | '\n'
        )+ {$channel=HIDDEN;}
    ;


// ho visto questo esempio:
// Are you fresher than nothing? -> Checks to see if Puck is holding a zero
// quindi ho pensato di aggiungere lo zero, solo non so in che sezione metterlo, nel dubbio:
//ZERO            :     'nothing';


ERROR_TK        : . ;  //token di errore per handler