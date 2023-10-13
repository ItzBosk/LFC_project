# Documentazione del progetto Shakespeare

## Filosofia di sviluppo
Con questo progetto volevamo creare un compilatore per il linguaggio di programmazione Shakespeare. L'obiettivo è generare uno script di ciò che accade nel file di input, generando anche un file PDF suddiviso in atti e scene.

L'idea di fondo è quella di facilitare il primo approccio alla programmazione per gli studenti che abitualmente studiano argomenti letterari o affini, che per loro natura sono piuttosto distanti dall'informatica. Un caso d'uso potrebbe essere l'utilizzo del nostro software per insegnare agli studenti di una scuola di teatro. Hanno quindi familiarità con elementi come la divisione di un'opera in atti e scene, e con la successione delle battute degli attori sulla scena. Sfruttando questo parallelo unico che esiste con la lingua di Shakespeare, il nostro prodotto si presta bene a favorire il primo contatto tra due ambizioni solitamente considerate agli antipodi.

## Tecnologie utilizzate
La creazione di software per apprendere il linguaggio di programmazione Shakespeare implica una combinazione di tecnologie e strumenti per garantire controlli grammaticali adeguati e un'interfaccia user-friendly. Ecco una panoramica delle tecnologie e degli strumenti utilizzati a questo scopo:

1. **ANTLRv3**:
ANTLR (ANother Tool for Language Recognition) è un potente strumento di elaborazione del linguaggio che ti consente di definire una grammatica formale per il tuo linguaggio di programmazione. In questo caso, ANTLRv3 viene utilizzato per implementare i controlli grammaticali per il linguaggio di programmazione Shakespeare. ANTLR può generare parser e lexer, semplificando il lavoro e la convalida del codice scritto.

2. **Java**:
Java è un linguaggio di programmazione versatile e multipiattaforma, adatto a gestire la logica e le funzionalità necessarie per lavorare con il codice Shakespeare. Lo abbiamo utilizzato per gestire e controllare il codice generato da ANTLR e per gestire vari aspetti del software.

3. **IDE Eclipse**:
Abbiamo scelto Eclipse come ambiente di sviluppo per questo progetto. Eclipse fornisce un solido set di strumenti per lo sviluppo Java, tra cui la modifica del codice, il debug e la gestione dei progetti. Supporta inoltre l'integrazione di strumenti e librerie esterni, rendendolo una scelta adatta per lavorare con il codice generato da ANTLR e i componenti Java del software.

4. **Interfaccia utente basata su Swing**:
Il software incorpora un'interfaccia utente creata utilizzando Swing, un toolkit basato su Java per la creazione di interfacce utente grafiche (GUI). Swing consente la creazione di finestre, finestre di dialogo, pulsanti e altri elementi della GUI, fornendo agli studenti un ambiente interattivo e facile da usare per sperimentare il codice Shakespeare.

## Organizzazione dei file
Questa struttura di file organizzata garantisce che i diversi componenti del progetto software siano nettamente separati, semplificando la gestione e il mantenimento della base di codice. Facilita inoltre l'incorporazione di elementi grafici e di risorse nel software, risultando in un'applicazione più user-friendly e visivamente accattivante.

1. **Workspace_Shakespeare (cartella principale del progetto)**:
Questa è la cartella principale del progetto Eclipse. È organizzato in diverse sottodirectory, ciascuna con uno scopo specifico:

- **src (codice sorgente)**:
    Questa directory ospita il codice sorgente del progetto.
   
    a. **scanPackage**:
       All'interno di "scanPackage" troverai i file del parser e dello scanner della lingua. Questi componenti essenziali sono responsabili dell'analisi e della scansione del codice Shakespeare.
   
    b. **grammarPackage**:
       "grammarPackage" contiene i file generati da ANTLR, incluso il file di grammatica denominato "Shakespeare.g." Questo file di grammatica definisce la sintassi e la struttura del linguaggio di programmazione Shakespeare. Inoltre, ospita il gestore degli errori, che gestisce e segnala gli errori durante la compilazione del codice.

    c. **Pacchetto utilità**:
       L'"utilityPackage" comprende vari file di supporto, come "CharacterDescriptor.java" per la gestione degli oggetti relativi ai personaggi all'interno delle scene, "RomanNumber.java" per la manipolazione dei numeri romani e "Util.java". Il file "Util.java" aiuta a migliorare la leggibilità dello script visualizzato nella console.

    d. **interfacePackage**:
       Tutti i file relativi all'aspetto grafico dell'applicazione sono archiviati nel "interfacePackage". Ciò include componenti dell'interfaccia utente ed elementi grafici che migliorano l'esperienza dell'utente.

    e. **outputPackage**:
       Il "outputPackage" è dedicato ai file associati alla generazione del documento PDF di output. Contiene il codice e le risorse responsabili della creazione del documento PDF dal codice Shakespeare elaborato.

- **resources**:
La directory "risorse" contiene varie risorse che supportano la funzionalità e l'aspetto del software:
   
    a. **images**:
       La sottodirectory "immagini" memorizza immagini di personaggi e altri elementi grafici che verranno inclusi nel PDF generato dall'applicazione. Queste immagini aggiungono contesto visivo al documento risultante.

    b. **input.file**:
       "input.file" è il file di testo scritto nel linguaggio di programmazione Shakespeare che il software compilerà ed elaborerà. È il file del codice sorgente che deve essere eseguito dal programma.

    c. **icons**:
       Questa directory contiene una raccolta di icone utilizzate nell'interfaccia utente grafica (GUI) per fornire segnali visivi e rappresentazioni per varie funzioni o caratteristiche all'interno dell'applicazione.

    d. **antlr-3.4-complete.jar**:
       Il file "antlr-3.4-complete.jar" rappresenta la libreria ANTLRv3, una dipendenza cruciale per il parsing del linguaggio e l'analisi del codice. Questa libreria è essenziale per generare parser e lexer dalla grammatica definita e viene utilizzata nel progetto.

2. **SPL.txt**:
Questo file contiene una descrizione di alto livello degli elementi e delle caratteristiche del linguaggio di programmazione shakespeariano. Fornisce una panoramica della sintassi e delle funzionalità del linguaggio.

3. **Linguaggio di programmazione Shakespeare.pdf**:
Questo documento PDF funge da risorsa completa per comprendere il linguaggio di programmazione Shakespeare in modo più dettagliato. Probabilmente include spiegazioni più dettagliate, esempi e forse anche programmi di esempio.

4. **Documentazione (cartella)**:
Questa cartella contiene documentazione aggiuntiva relativa al progetto.
	- **en (sottocartella)**:
		- **Documentation.md**:
     	Documentazione scritta in inglese. Permette di avere una visione d'insieme del progetto, dalle motivazioni della sua realizzazione, attraverso le tecnologie utilizzate ed infine ai controlli semantici implementati.
		- **UserManual.md**:
		Manuale utente scritto in inglese. Fornisce istruzioni e indicazioni su come utilizzare il software, le sue funzionalità e qualsiasi altra informazione pertinente.
	- **it (sottocartella)**:
		- **Documentazione.md**:
     	Equivalente in italiano.
		- **ManualeUtente.md**:
		Equivalente in italiano.
	- **Shakespeare grammar (sottocartella)**:
		- **SyntacticShakespeare.g**:
		Grammatica non decorata (solo parte sintattica).
		- **Shakespeare.g**:
		Grammatica completa.

## Principali controlli semantici
I controlli semantici implementati nel software per gestire il linguaggio di programmazione Shakespeare sono progettati per garantire che il codice aderisca alla grammatica e alle regole uniche del linguaggio. Ecco una ripartizione completa dei principali controlli semantici all'interno del software:

**titleRule, bodyRule e dramatisPersonaeRule**:

- Queste regole rafforzano la struttura corretta di un programma di Shakespeare.
- Il titolo del programma deve essere riconosciuto e i personaggi devono essere dichiarati nella sezione "dramatis personae".
- Ogni dichiarazione di carattere viene controllata per garantire l'unicità e la conformità con i nomi dei caratteri supportati dalla lingua.
- Il programma prevede l'inizio dello spettacolo, che comprende più atti e scene.

**actRule e sceneRule**:

- Queste regole verificano che atti e scene siano strutturati correttamente con numeri romani e commenti.
- Garantiscono che non vi siano lacune o alterazioni nella sequenza numerica degli atti e delle scene.

**enterRule, exitRule ed exeuntRule**:

- Queste regole convalidano la fattibilità dell'ingresso, dell'uscita o dell'uscita dei personaggi sul palco.
- I vincoli includono un massimo di due personaggi sul palco contemporaneamente e restrizioni sull'ingresso/uscita dei personaggi.
  
**stageEventRule**:

- Questa regola è centrale nel programma e comprende diverse operazioni.
- Gestisce gli stack di personaggi, inclusi i valori di spinta e scoppio.
- Gestisce input e output di valori interi e ASCII.
- Garantisce la presenza dei personaggi sulla scena.
- Valuta le interazioni tra i personaggi durante gli eventi sul palco.

**Regola condizionale**:

- Convalida le operazioni "goto" verificando l'esistenza della scena target all'interno dell'atto corrente.
- Tiene traccia delle operazioni all'interno di una scena per supportare i cicli di script.

**ricorda regola e ricordaregola**:

- Queste regole coinvolgono operazioni sullo stack, in cui i valori vengono spinti ed estratti dallo stack di un personaggio.
- Garantisce che la pila di un personaggio non sia vuota quando si richiede il recupero del valore.

**printRule e readRule**:

- In caso di stampa garantisce che il valore del carattere sia stato inizializzato entrando in scena.
- Convalida l'intervallo di valori ASCII prima di stampare un simbolo.
- Per la lettura verifica il tipo di input (numerico o ASCII) ed applica gli opportuni controlli di controllo.

**assignmentStatementRule, assegnazioneComparisonRule e assegnazioneOperationRule**:

- Queste regole gestiscono le assegnazioni dei valori dei caratteri utilizzando tre diverse tipologie: assegnazione diretta, assegnazione tramite confronto e assegnazione tramite il risultato di un'equazione.
- Garantiscono che l'assegnazione segua il formato corretto e che solo i personaggi dichiarati sul palco svolgano gli incarichi.

**aggettivoRegola e aggettivoSecondaRegola**:

- Queste regole contano il numero di aggettivi attribuiti a un personaggio.
- Facilitano il calcolo della potenza di due da assegnare ai caratteri in base al numero di aggettivi.