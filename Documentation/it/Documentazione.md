
# Documentazione di Shakespeare project

## Filosofia di sviluppo
Con questo progetto abbiamo voluto realizzare un compilatore per il linguaggio di programmazione Shakespeare. L'obiettivo è generare uno script di ciò che avviene nel file di input, generando in output anche un file pdf suddiviso per atti e scene.

L'idea alla base consiste nell'agevolare il primo approccio alla programmazione per alunni che solitamente studiano argomenti letterari o simili, per loro natura abbastanza lontani dall'informatica. Un caso d'uso potrebbe essere l'utilizzo del nostro software per l'insegnamento a studenti di una scuola di teatro. Questi hanno quindi familiarità con elementi come la divisione in atti e scene di un'opera, e con il susseguirsi di battute degli attori in scena. Sfruttando questo parallelismo unico esistente con il lingauggio Shakespeare, il nostro prodotto si presta bene a favorire il primo contatto tra due ambiti che solitamente sono considerati agli antipodi.

## Tecnologie utilizzate
Abbiamo deciso di implementare la grammatica del linguaggio Shakespeare tramite ANTLRv3 e di gestire la parte implementativa attraverso Java. Utilizzando Eclipse come ambiente di sviluppo abbiamo potuto sfruttare pacchetti per generare il file pdf di output partendo da un html stilizzato ad-hoc. Per la parte grafica del software invece ci siamo appoggiati a Swing.

## Organizzazione file
### Directory principale
Sono presenti la cartella del progetto eclipse "Workspace_Shakespeare", il file che riassume gli elementi del linuaggio Shakespeare "SPL.txt", descritti più approfonditamente dal college New Mexico Tech nel file "Shakespeare programming language.pdf". In "Documentation" si trovano tutti i documenti relativi al lavoro svolto.  

### Workspace_Shakespeare
- In "src" troviamo:
	- "scanPackage" con all'interno i file di Parser e Scanner del linguaggio;
	- "grammarPackage" contiene invece i file generati da ANTLR, compreso quindi il file della grammatica denominato "Shakespeare.g", oltre che l'Handler degli errori;
	- "utilityPackage" comprende dei file di supporto come "CharacterDescriptor.java" per la gestione degli oggetti relativi ai personaggi di scena, "RomanNumber.java" per la manipolazione dei numeri romani, e infine "Util.java" usato per migliorare la leggibilità dello script stampato in console;
	- "interfacePackage" comprende tutti i file relativi alla parte grafica dell'applicativo;
	- "outputPackage" contiene i file relativi al file pdf di output
- In "resources" sono presenti:
	- "images" con tutte le immagini dei personaggi e il resto degli elementi grafici contentuti nel pdf che verrà generato
	- "input.file", ovvero il file di testo da compilare con il programma scritto in linguaggio Shakespeare
	- varie icone utili per l'interfaccia grafica
- "antlr-3.4-complete.jar", cioè la libreria di ANTLRv3.

### Documentation
La documentazione è stata redatta in inglese e italiano, rispettivamente in "en" e it", così da rendere più agevole la compresione per ogni tipologia di utente.
- In "Documentazione.md" viene data una vista d'insieme dell'applicativo realizzato, specificando i motivi che ci hanno portato a realizzarlo e gli elementi del linguaggio che abbiamo considerato.
- In "ManualeUtente.md" vengono dati dei consigli utili che possono aiutare gli utenti meno esperti a muovere i primi passi con il programma.  

## Controlli semantici principali
In questa sezione facciamo una panoramica della gestione della parte semantica del lingauggio Shakespeare, rendendo più chiaro come e quali regole abbiamo implementato nel Parser.

### titleRule, bodyRule e dramatisPersonaeRule
Una volta riconosciuto obbligatoriamente il titolo del programma Shakespeare si passa al corpo del programma, identificando la dichiarazione dei personaggi che potranno entrare in scena, richiedendo un commento per ognuno di essi. Ogni personaggio deve essere dichiarato una sola volta e il suo nome deve essere tra quelli supportati dal linguaggio. 
Ci si aspetta poi l'inizio dell'opera, con un susseguirsi di molteplici atti e scene.

### actRule e sceneRule
Ad ogni cambiamento di atto e scena si verifica la presenza di un numero romano che ne identifica la posizione temporale nell'opera, e di un commento. Verrà quindi controllato che non ci siano buchi temporali, cioè alterazioni della naturale successione numerica, segnalando altrimenti con un messaggio di errore.

### enterRule, exitRule ed exeuntRule
Ad ogni entrata di scena di uno o più personaggi si verifica la fattibilità dell'operazione richiesta. Si controlla che siano presenti in scena al massimo due personaggi allo stesso tempo, che non possano entrare/uscire personaggi non dichiarati e/o già presenti/usciti di scena.

### stageEventRule
Ogni evento scenico è caratterizzato da un personaggio che parla ad un altro personaggio in scena, se presente. Viene dunque svolto il controllo sulla sua presenza in scena, oltre alla valutazione su quale altro personaggio condivida il palcoscenico con lui. 
All'interno di questa regola semantica avvengono tutte le operazioni principali del programma:
	- riempimento e svuotamento dello stack associato ad ogni personaggio
	- input e output di valori interi e ASCII
	- assegnamento di valori

### conditionalRule
Dato che esprime un goto serve verificare che la scena a cui viene richiesto il salto sia esistente all'interno dell'atto corrente. Fondamentale poi aver tenuto traccia delle operazioni svolte durante tale scena, di modo da poterle eseguire di nuovo, implementando così dei cicli nello script.	

### rememberRule e recallRule
Tramite queste due regole avvengono rispettivamente il push e il pop nello stack del personaggio a cui si rivolge il parlante. Occorre quindi verificare che lo stack non sia vuoto al momento della richiesta di far assumere ad un personaggio il valore in cima al rispettivo stack.

### printRule e readRule
- Nel primo caso stiamo stampando a console il valore di un personaggio. Ciò può avvenire in due modi:
	- richiedendo la stampa del valore a lui associato, quindi occorre verificare che sia entrato in scena almeno una volta di modo da poter esser stato quantomeno inizializzato a zero;
	- richiedendo invece la stampa del simbolo ASCII corrispondente al suo valore. In questo caso serve prima controllare che tale valore sia compreso in un intervallo prestabilito, di modo da poter stampare un simbolo valido.
- Con la seconda regola si legge un input dell'utente, che può essere numerico (intero) oppure un simbolo ASCII:
	- nel caso della lettura di un valore numerico si verifica che sia della tipologia Integer; 
	- se invece si vuole leggere un simbolo si procede con il controllo come nel caso dell'input.

### assignmentStatementRule, assignmentComparisonRule e assignmentOperationRule
Tramite queste tre regole avvengono gli assegnamenti di valore dei personaggi. Rispecchiano le tre tipologie esistenti nel linguaggio Shakespeare, ovvero l'assegnamento diretto, per comparazione o attraverso il risultato di un'equazione. Occorre verificare che sia rispettata la forma prevista per ogni tipologia, verificando che ogni assegnamento sia legittimo, cioè eseguito da un personaggio dichiatato e in scena, su un altro personaggio con le stesse caratteristiche.

### adjectiveRule e adjectiveSecondRule
Si occupano di facilitare il conteggio degli aggettivi attribuiti ad un personaggio, di modo così da ricavare il valore esatto della potenza di due da assegnare ai personaggi


