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


fragment 
LETTER : 'a'..'z'|'A'..'Z';

fragment 
DIGIT : '0'..'9';

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

// punteggiatura
CL 	:	':';
//CM 	:	',';
DOT   	: 	'.';
//SC 	:	';';
//AP    	:	'’'; //cambiato rispetto al classico " ' " perche crea errore, in ogni caso non serve usarlo
EP    	: 	'!';
QM    	:	'?';

// sono le lettere che compongono ogni parola che usiamo
ID  :	( LETTER |'_') 
		( LETTER |DIGIT |'_')*
    ;



