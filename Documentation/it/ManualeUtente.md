# Manuale utente del software SPL

## Introduzione
Grazie per aver scelto il nostro Software per SPL, uno strumento potente e innovativo progettato per portare la bellezza senza tempo del linguaggio shakespeariano nell'era digitale della programmazione e dell'informatica. Il Software SPL (Shakespeare Programming Language) non è solo un semplice interprete; è una piattaforma completa che ti consente di creare, modificare, compilare e interagire con poesie nello stile poetico di William Shakespeare.

Questo manuale utente è la tua via per sbloccare tutto il potenziale del linguaggio SPL. Che tu sia un poeta esperto, uno studente di letteratura classica o semplicemente qualcuno che ammira l'arte dei versi shakespeariani sotto questo adattamento moderno, potrai trovare nel nostro software la chiave per immergerti nella lingua che ha affascinato cuori e menti per secoli.

In questo manuale ti guideremo attraverso le complessità del software SPL, assicurandoci che tu possa sfruttare le sue funzionalità per creare versi belli e significativi, esplorare le profondità della poesia shakespeariana e intraprendere un viaggio creativo come nessun altro. Dall'installazione alle funzionalità avanzate, ti offriamo la soluzione completa.

Preparati a intraprendere un'avventura letteraria in cui potrai esprimere i tuoi pensieri, emozioni e storie attraverso l'ineguagliabile eloquenza della poesia shakespeariana. Questa nuova divertente tecnica di programmazione abbinata ad un abito classico è ora a portata di mano e questo manuale sarà la tua guida fidata per padroneggiarla.

Approfondiamo l'arte della poesia e la scienza dietro la programmazione informatica con il software SPL e portiamo la bellezza delle parole di Shakespeare nell'era digitale.

## Prerequisiti
Questo software richiede solo Java, che è un linguaggio di programmazione versatile e orientato agli oggetti, rinomato per la portabilità, utilizzato per applicazioni web, desktop e dispositivi mobili.
L'utilizzo del software necessita anche di una buona padronanza della lingua Inglese, perché é stato progettato e costruito per interpretare correttamente solo Script in lingua anglosassone (cioé la stessa lingua di Shakespeare!).

### Installazione di Java
*Se hai già Java JRE (o un'alternativa OpenJDK) installato e funzionante sul tuo computer, puoi saltare questo processo di installazione*

L'installazione di Java può essere suddivisa in cinque semplici passaggi:

**Passaggio 1: prepara il computer**

Assicurati che il tuo computer sia connesso a Internet e di disporre dei privilegi amministrativi per installare il software.

**Passaggio 2: scarica Java**

1. Apri il tuo browser web (come Google Chrome o Mozilla Firefox).
2. Nella barra degli indirizzi, digita "Download Java" e premi Invio.
3. Cerca la pagina di download ufficiale di Java, generalmente fornita da Oracle o OpenJDK. Fai clic su di esso per aprire la pagina.

**Passaggio 3: scegli la versione giusta**

1. Nella pagina di download di Java, vedrai diverse versioni di Java. Troverai spesso due tipi principali: JDK (Java Development Kit) e JRE (Java Runtime Environment).
2. Hai bisogno di Java solo per eseguire i programmi Java esistenti, quindi scarica JRE.
3. Fai clic sul collegamento per il download della versione necessaria. Di solito è etichettato come "Download" o qualcosa di simile.

**Passaggio 4: accetta il contratto di licenza**

1. Dopo aver fatto clic sul collegamento per il download, verrai indirizzato a una pagina con un contratto di licenza. Leggilo se vuoi, quindi cerca una casella di controllo che dice "Accetto il contratto di licenza di Oracle Technology Network".
2. Seleziona questa casella per indicare il tuo accordo.
3. Fai nuovamente clic sul collegamento di download.

**Passaggio 5: installa Java**

1. Una volta completato il download, individua il file scaricato. Spesso si tratta di un file eseguibile con estensione ".exe" su Windows o di un file ".dmg" su macOS.
2. Fai doppio clic sul file scaricato per eseguire il programma di installazione.
3. Segui le istruzioni visualizzate per installare Java. In genere, è possibile utilizzare le impostazioni predefinite a meno che non si abbia un motivo specifico per personalizzarle.
4. Il programma di installazione completerà il processo di installazione e al termine verrà visualizzata una conferma.

Questo è tutto! Hai installato con successo Java sul tuo computer. Ora puoi utilizzare Java per eseguire applicazioni Java come il nostro software SPL.

### Installazione del software SPL
Se utilizzi **Windows** puoi eseguire il file "*SPL Installer.msi*" dalla directory principale del nostro progetto su github, seguire le semplici istruzioni visualizzate all'interno del software di installazione e quindi eseguire la nuova installazione SPL Software dal collegamento sul desktop.
Se utilizzi **MacOS** devi estrarre i file da "*SPL Packaged.zip*" nella tua posizione preferita e avviare l'eseguibile "*SPL.jar*" all'interno della cartella estratta.
Se utilizzi **Linux** segui le stesse istruzioni di MacOS (ymmv ma se usi Linux quotidianamente puoi arrivarci da solo)

### Capire come funziona SPL (nozioni di base)
Creare codice Shakespeare Programming Language (SPL) può essere un modo divertente e creativo per scrivere programmi. Immagina di raccontare una storia con due personaggi, che hanno bisogno di parlare tra loro e di muoversi. Ecco come puoi farlo:
1. **Title**: autoesplicativo
2. **Dramatis Personae**: scegli due personaggi. Questi possono essere i nomi che preferisci dal seguente elenco, come "Romeo" e "Giulietta".
    {'Romeo', 'Giulietta', 'Amleto', 'Ghost', 'LadyMacbeth', 'Ophelia', 'Mercutio', 'Banquo', 'Gertrude', 'Polonio', 'Shylock', 'Prospero'}
Ogni personaggio rappresenterà una pila (come una pila di libri) e un valore corrente. Sono la vera "variabile" della lingua di Shakespeare.
3. **Acts e Scenes**: È la suddivisione logica degli eventi in un ambiente SPL, un atto può contenere diverse scene. Una scena deve essere dichiarata all'interno di un atto. La numerazione è sequenziale e utilizza numeri romani. Devono esserci almeno l'ATTO I e la SCENA I
4. **Entering and Exiting**: Sul palco devono esserci al massimo due personaggi, quindi l'entrata e l'uscita vengono utilizzate per impostare quale è attivo in quella particolare scena.
5. **Linee e Assegnazioni**: Parleremo approfonditamente di questo argomento più avanti, ma per ora possiamo considerarlo la parte vera e propria dell'SPL perché è con Linee e Assegnazioni che si costruisce la logica del programma, si creano i numeri e le i caratteri gestiscono i valori.
6. **Input e Output**: Esistono diversi modi per vedere e impostare i valori in SPL e puoi entrambi interagire con i numeri interi o il loro corrispondente nel valore Char, consentendoti di visualizzare numeri, lettere, simboli o combinarli se vuoi.
7. **Dichiarazione condizionale**: puoi specificare alcuni controlli sul valore corrente di una variabile e passare a una determinata posizione del codice per implementare una struttura complessa.
8. **Push and Pop**: ogni persona è anche una pila. Quindi è consentito inserire un nuovo valore nella pila del personaggio stesso e, se necessario, anche inserire il valore più in alto nella sua memoria.

Ricorda, nel linguaggio di programmazione Shakespeare, non stai scrivendo il codice tipico come in altri linguaggi di programmazione. Stai invece creando una storia in cui i personaggi e le loro azioni rappresentano la logica del codice. È un modo divertente di scrivere codice, quasi come scrivere un'opera teatrale o una sceneggiatura!

##Software SPL
Possiamo dividere l'utilizzo del software SPL in due fasi diverse, la scrittura della sceneggiatura con la sua compilazione e logica, e la generazione del PDF che può essere utilizzato da attori reali sul palco per esercitarsi.
### Sceneggiatura
Nel campo sinistro della prima pagina c'è uno spazio che devi usare per scrivere lo script. Al primo avvio verrà caricato uno Script di base per aiutarti a capire come funziona.
#### Logica dello script
In questa sezione vedremo una spiegazione completa su come scrivere un programma in SPL.
1. **Titolo**:
La prima riga di un programma di Shakespeare si chiama "titolo". Il compilatore considera qualsiasi cosa, dalla prima riga al primo punto, come un commento.
```
The incredible story of a simple SPL program!
```

2. **Dramatis Personae**:
Questa è la sezione in cui vengono dichiarati i caratteri (variabili). Ogni variabile può contenere un intero con segno ed è scritta come "Nome, Descrizione"
```
Romeo, the impavid adventurer.
Juliet, the beauty of the youth.
```
3. **Atti e scene**:
Come già detto prima, una sceneggiatura di Shakespeare è suddivisa in Atti che contengono Scene in cui interagiscono i personaggi (variabili). Ogni atto e scena è numerato con un numero romano e funge da etichetta GOTO. Qualsiasi codice dopo i due punti è considerato un commento. Sono scritti nella forma:
```
Act I: Hamlet's insults and flattery.
Scene I: The insulting of Romeo.
```
4. **Enter, exit e exeunt**:
Le singole righe di codice generalmente assumono la forma di un brano di dialogo pronunciato da un personaggio a un altro; questo è il modo in cui il valore di una variabile (il carattere a cui si parla) viene assegnato, modificato o emesso. Un personaggio può essere indirizzato solo come "tu" o "tu". Pertanto, in genere devono esserci esattamente due personaggi "sul palco" ogni volta che vengono pronunciate le battute: uno per parlare e l'altro con cui parlare. Per chiamare una variabile sullo stage viene utilizzato il comando Invio con un elenco di uno o più caratteri. Il comando Esci dice esattamente a uno dei personaggi elencati di lasciare il palco. Exeunt invita più di un personaggio ad andarsene, o nel caso in cui nessun personaggio sia elencato tutti i personaggi lasceranno il palco. Viene utilizzato il seguente formato:
```
[Enter Juliet]
[Enter Romeo and Juliet]
[Exit Romeo]
[Exeunt Romeo and Juliet]
[Exeunt]
```
5. **Linee, costanti e assegnazione di valori**:
Le linee sono rappresentate come dialoghi pronunciati da un personaggio e consistono in almeno una frase. Ogni frase può assegnare un nuovo valore a una variabile, indirizzare una variabile a produrre il suo valore o indirizzarla a ricevere un input. Le linee possono anche manipolare stack o agire come istruzioni if/then o goto. Una riga inizia con il nome di un personaggio e i due punti. Poiché questo personaggio è l'oratore, l'altro personaggio sul palco è la variabile a cui ci si rivolge come "tu" o "tu".
Le costanti sono rappresentate da combinazioni di nomi e aggettivi; la lingua riconosce un elenco finito di ciascuno, ed entrambi gli elenchi sono separati in quelli con tono positivo, negativo o neutro, come percepito da Åslund e Hasselström. I nomi positivi e neutri hanno un valore pari a 1, mentre i nomi negativi hanno un valore pari a -1. Qualsiasi aggettivo moltiplica un sostantivo per 2 e gli aggettivi possono essere composti. I pronomi possessivi vengono ignorati dal parser, mentre le parole relative all'aritmetica di base vengono riconosciute come operazioni, come "somma", "quoziente" e "cubo". Una frase che assegna un valore a un carattere inizia con "Tu" o "Tu", può facoltativamente continuare con "sono come [qualsiasi aggettivo] come", e quindi fornisce la formula matematica in sostantivi, aggettivi, variabili e operazioni per il nuovo valore. Seguono esempi di tali linee:
```
Hamlet:
 You lying stupid fatherless big smelly half-witted coward!

Juliet:
 You are as villainous as the square root of Romeo!
```
Le formule matematiche possono anche utilizzare i nomi di altri personaggi (anche se quei personaggi non sono sul palco) per utilizzare il valore corrente di quel personaggio in un calcolo, o "te stesso" o "te stesso" per il personaggio a cui si parla.

6. **Ingresso e uscita**:
Le righe possono anche richiedere una variabile per fornire output o ricevere input. "Apri il tuo cuore" restituisce il valore numerico della variabile, mentre "Parla la tua mente" restituisce il carattere ASCII corrispondente. "Ascolta il tuo cuore" o "Apri la tua mente" fanno sì che la variabile riceva input dall'utente; il primo per un numero e il secondo per un carattere.

7. **Dichiarazioni condizionali e goto**:
Un'affermazione if/then è formulata come una domanda posta da un personaggio. Le parole "come [qualsiasi aggettivo] come" rappresentano un test di uguaglianza, mentre "migliore" e "peggiore" corrispondono rispettivamente a maggiore di e minore di. Una riga successiva, che inizia con "se sì" o "se no", determina cosa accade in risposta alla verità o falsità della condizione originaria. Un'istruzione goto inizia con "Lasciaci", "Dobbiamo" o "Dobbiamo", continua "torna a" o "procedi a", e poi fornisce un atto o una scena. Una scena verrà analizzata come quella scena nell'atto corrente; un'istruzione goto non può richiamare una scena in un atto diverso. Un'istruzione condizionale per chiamare goto sarebbe simile a questa:
```
Juliet:
 Am I better than you?

Hamlet:
 If so, let us proceed to scene II.
```
8. **Push e pop delle pile**:
Ogni variabile è uno stack. Una variabile avrà un numero intero inserito nello stack se una riga dice al carattere di "ricordare" un valore appropriato, come "Ricordati di me" o "Ricordati di te stesso". Il valore più in alto nello stack viene estratto (cioè la variabile assume questo valore) se al personaggio viene detto di "ricordare" qualcosa; tutto il testo dopo questa parola viene trattato come un commento.


#### Esempio di script
Puoi scrivere qualcosa del genere per ottenere "UniBG Rules!" come output:

```
The Adventure of UniBG Rules.

Juliet, a bright student with a sunny disposition.
Romeo, a passionate scholar with fiery determination.

Act I: Juliets's bravery.
Scene I: Romeo listen.

[Enter Romeo and Juliet]

Juliet: Listen to me!
Romeo: You are the sum of yourself.


Juliet: Open your mind!
Romeo: You are the sum of yourself.


Romeo: You are the square of yourself.
Juliet: Remember yourself.


Romeo: You are the sum of yourself.
Juliet: You are the difference between yourself and yourself!


Juliet: Speak your mind!
Romeo: Open your heart.


Juliet: Listen to me!
Romeo: You are the sum of yourself.


Juliet: Remember me.

[Exeunt]
```
### Compilazione del codice
Per compilare il tuo script appena scritto puoi premere il pulsante Compila nella parte inferiore della prima pagina e vedere l'output dettagliato della compilazione nella casella a destra.
### Generazione PDF
Per quanto riguarda la creazione del PDF devi compilare il tuo sorgente (Script) e quindi generare il PDF se lo desideri. In questo software puoi anche personalizzare le immagini di tutti gli attori per adattarle meglio alle tue esigenze sul palco, magari sostituendo le immagini predefinite con alcune immagini reali di attori reali.
#### Immagini dei personaggi
In questa sezione puoi selezionare e modificare ogni immagine per ogni personaggio supportato dalla nostra implementazione SPL e, se lo desideri, puoi ripristinare le impostazioni predefinite con l'apposito pulsante sull'interfaccia.
#### Esportazione finale in PDF
Quando sei pronto, assicurati che il tuo script sia stato compilato correttamente e poi puoi procedere con la generazione e l'esportazione del PDF completamente decorato. Questo processo richiede solitamente un po' di tempo perché il file generato è complesso e deve essere stampato e non utilizzato sul computer. Se la generazione e l'esportazione vanno a buon fine, alla fine il tuo browser PDF preferito si aprirà mostrandoti il risultato della generazione, e ora potrai ammirare la tua creazione appena sfornata. Divertiti!
## Disinstalla
Il processo di disinstallazione del software è necessario solo per la versione Windows, e basta controllare l'elenco dei programmi all'interno del Pannello di controllo di Windows stesso, sarai in grado di selezionare "*Shakespeare Programming Language Software*" e disinstallarlo direttamente dal elenco.