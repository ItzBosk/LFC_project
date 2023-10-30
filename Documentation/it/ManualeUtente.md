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
Se utilizzi **Windows** puoi eseguire il file ["*SPL Installer.msi*"](https://github.com/ItzBosk/LFC_project/blob/main/Workspace_Shakespeare/SPL%20Installer.msi) dalla directory principale del nostro progetto su github, seguire le semplici istruzioni visualizzate all'interno del software di installazione e quindi eseguire la nuova installazione SPL Software dal collegamento sul desktop.
Se utilizzi **MacOS** devi estrarre i file da ["*SPL Complete.zip*"](https://github.com/ItzBosk/LFC_project/blob/main/Workspace_Shakespeare/SPL_Complete.zip) nella tua posizione preferita e avviare l'eseguibile "*SPL.jar*" all'interno della cartella estratta.
Se utilizzi **Linux** segui le stesse istruzioni di MacOS (ymmv ma se usi Linux quotidianamente puoi arrivarci da solo)

### Capire come funziona SPL (nozioni di base)
Creare codice Shakespeare Programming Language (SPL) può essere un modo divertente e creativo per scrivere programmi. Immagina di raccontare una storia con due personaggi, che hanno bisogno di parlare tra loro e di muoversi. Ecco come puoi farlo:
1. **Title**: autoesplicativo
2. **Dramatis Personae**: scegli due personaggi. Questi possono essere i nomi che preferisci dal seguente elenco, come "Romeo" e "Juliet".
{'Romeo', 'Juliet', 'Hamlet', 'Ghost', 'LadyMacbeth', 'Ophelia', 'Mercutio', 'Banquo', 'Gertrude', 'Polonio', 'Shylock', 'Prospero'} 
Ogni personaggio rappresenterà una pila (come una pila di libri) e un valore corrente. Sono la vera "variabile" della lingua di Shakespeare.
3. **Acts e Scenes**: È la suddivisione logica degli eventi in un ambiente SPL, un atto può contenere diverse scene. Una scena deve essere dichiarata all'interno di un atto. La numerazione è sequenziale e utilizza numeri romani. Devono esserci almeno l'ATTO I e la SCENA I
4. **Entering and Exiting**: Sul palco devono esserci al massimo due personaggi, quindi l'entrata e l'uscita vengono utilizzate per impostare quale è attivo in quella particolare scena.
5. **Linee e Assegnazioni**: Parleremo approfonditamente di questo argomento più avanti, ma per ora possiamo considerarlo la parte vera e propria dell'SPL perché è con Linee e Assegnazioni che si costruisce la logica del programma, si creano i numeri e le i caratteri gestiscono i valori.  
Puoi scegliere dalla lista seguente tutti gli elementi che vuoi per creare le tue frasi e il tuo copione:

NOMI:
   
-NOME POSITIVO (+1) =  
{'Heaven', 'King', 'Lord', 'angel', 'flower', 'happiness', 'joy', 'plum', 'summer’s day', 'hero', 'rose', 'kingdom', 'pony'}
   
-NOME NEUTRO (+1) =   
{'animal', 'aunt', 'brother', 'cat', 'chihuahua', 'cousin', 'cow', 'daughter', 'door', 'face', 'father', 'fellow', 'granddaughter', 'grandfather', 'grandmother', 'grandson', 'hair', 'hamster', 'horse', 'lamp', 'lantern', 'mistletoe', 'moon', 'morning', 'mother', 'nephew', 'niece', 'nose', 'purse', 'road', 'roman', 'sister', 'sky', 'son', 'squirrel', 'stonewall', 'thing', 'town', 'tree', 'uncle','wind'}
    
-NOME NEGATIVO (-1) =  
 {Hell', 'Microsoft', 'bastard', 'beggar', 'blister', 'codpiece', 'coward', 'curse', 'death', 'devil', 'draught', 'famine', 'flirt-gill', 'goat', 'hate', 'hog', 'hound', 'leech', 'lie', 'pig', 'plague', 'starvation', 'toad', 'war', 'wolf'}

AGGETTIVI

-AGGETTIVO POSITIVO =   
{'amazing', 'beautiful', 'blossoming', 'bold', 'brave', 'charming', 'clearest', 'cunning', 'cute', 'delicious', 'embroidered', 'fair', 'fine', 'gentle', 'golden', 'good', 'handsome', 'happy', 'healthy', 'honest', 'lovely', 'loving', 'mighty', 'noble', 'peaceful', 'pretty', 'prompt', 'proud', 'reddest', 'rich', 'smooth', 'sunny', 'sweet', 'sweetest', 'trustworthy', 'warm'}

-AGGETTIVO NEUTRO =   
{'big', 'black', 'blue', 'bluest', 'bottomless', 'furry', 'green', 'hard', 'huge', 'large', 'little', 'normal', 'old', 'purple', 'red', 'rural', 'small', 'tiny', 'white', 'yellow'}

-AGGETTIVO NEGATIVO =  
{'bad', 'cowardly', 'cursed', 'damned', 'dirty', 'disgusting', 'distasteful', 'dusty', 'evil', 'fat', 'fat-kidneyed', 'fatherless', 'foul', 'hairy', 'half-witted', 'horrible', 'horrid', 'infected', 'lying', 'miserable', 'misused', 'oozing', 'rotten', 'smelly', 'snotty', 'sorry', 'stinking', 'stuffed', 'stupid', 'vile', 'villainous', 'worried'}

7. **Input e Output**: Esistono diversi modi per vedere e impostare i valori in SPL e puoi entrambi interagire con i numeri interi o il loro corrispondente nel valore Char, consentendoti di visualizzare numeri, lettere, simboli o combinarli se vuoi.
8. **Dichiarazione condizionale**: puoi specificare alcuni controlli sul valore corrente di una variabile e passare a una determinata posizione del codice per implementare una struttura complessa.
9. **Push and Pop**: ogni persona è anche una pila. Quindi è consentito inserire un nuovo valore nella pila del personaggio stesso e, se necessario, anche inserire il valore più in alto nella sua memoria.

Ricorda, nel linguaggio di programmazione Shakespeare, non stai scrivendo il codice tipico come in altri linguaggi di programmazione. Stai invece creando una storia in cui i personaggi e le loro azioni rappresentano la logica del codice. È un modo divertente di scrivere codice, quasi come scrivere un'opera teatrale o una sceneggiatura!

##Software SPL
Possiamo dividere l'utilizzo del software SPL in due fasi diverse, la scrittura della sceneggiatura con la sua compilazione e logica, e la generazione del PDF che può essere utilizzato da attori reali sul palco per esercitarsi.
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/phome.jpg" style="height:500px"> </img>
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
Le singole righe di codice generalmente assumono la forma di un brano di dialogo pronunciato da un personaggio a un altro; questo è il modo in cui il valore di una variabile (il carattere a cui si parla) viene assegnato, modificato o emesso. Un personaggio può essere indirizzato solo come "you" o "thou". Pertanto, in genere devono esserci esattamente due personaggi "sul palco" ogni volta che vengono pronunciate le battute: uno per parlare e l'altro con cui parlare. Per chiamare una variabile sullo stage viene utilizzato il comando Invio con un elenco di uno o più caratteri. Il comando Esci dice esattamente a uno dei personaggi elencati di lasciare il palco. Exeunt invita più di un personaggio ad andarsene, o nel caso in cui nessun personaggio sia elencato tutti i personaggi lasceranno il palco. Viene utilizzato il seguente formato:
```
[Enter Juliet]
[Enter Romeo and Juliet]
[Exit Romeo]
[Exeunt Romeo and Juliet]
[Exeunt]
```
5. **Linee, costanti e assegnazione di valori**:
Le linee sono rappresentate come dialoghi pronunciati da un personaggio e consistono in almeno una frase. Ogni frase può assegnare un nuovo valore a una variabile, indirizzare una variabile a produrre il suo valore o indirizzarla a ricevere un input. Le linee possono anche manipolare stack o agire come istruzioni if/then o goto. Una riga inizia con il nome di un personaggio e i due punti. Poiché questo personaggio è l'oratore, l'altro personaggio sul palco è la variabile a cui ci si rivolge come "you" o "thou".
Le costanti sono rappresentate da combinazioni di nomi e aggettivi; la lingua riconosce un elenco finito di ciascuno, ed entrambi gli elenchi sono separati in quelli con tono positivo, negativo o neutro. I nomi positivi e neutri hanno un valore pari a 1, mentre i nomi negativi hanno un valore pari a -1. Qualsiasi aggettivo moltiplica un sostantivo per 2 e gli aggettivi possono essere composti. I pronomi possessivi vengono ignorati dal parser, mentre le parole relative all'aritmetica di base vengono riconosciute come operazioni, come "sum", "quotient" e "product". Una frase che assegna un valore a un carattere inizia con "You" o "Thou", può facoltativamente continuare con "are as [qualsiasi aggettivo] as", e quindi fornisce la formula matematica in sostantivi, aggettivi, variabili e operazioni per il nuovo valore. Come possibilita aggiuntiva e' possibile usare il costrutto "not" per negare il risultato di un calcolo prima di assegnarlo.
Seguono esempi di tali linee:
```
Hamlet:
 You lying stupid fatherless big smelly half-witted coward!

Juliet:
 You are not as good as a big big King!
```
Le formule matematiche possono anche utilizzare i nomi di altri personaggi (anche se quei personaggi non sono sul palco) per utilizzare il valore corrente di quel personaggio in un calcolo, o "yourself" o "thyselft" per il personaggio a cui si parla.

6. **Ingresso e uscita**:
Le righe possono anche richiedere una variabile per fornire output o ricevere input. "Open your heart" restituisce il valore numerico della variabile, mentre "Speak your mind" restituisce il carattere ASCII corrispondente. "Listen to your heart" o "Open your mind" fanno sì che la variabile riceva input dall'utente; il primo per un numero e il secondo per un carattere.

7. **Dichiarazioni condizionali e goto**:
Un'affermazione if/then è formulata come una domanda posta da un personaggio. Le parole "as [qualsiasi aggettivo] as" rappresentano un test di uguaglianza, mentre "better" e "worse" corrispondono rispettivamente a maggiore di e minore di. Una riga successiva, che inizia con "if so" o "if not", determina cosa accade in risposta alla verità o falsità della condizione originaria. Un'istruzione goto inizia con "Let us", "We shall" o "We must", continua "return to" o "proceed to", e poi fornisce un atto o una scena. Una scena verrà analizzata come quella scena nell'atto corrente; un'istruzione goto non può richiamare una scena in un atto diverso. Un'istruzione condizionale per chiamare goto sarebbe simile a questa:
```
Juliet:
 Am I better than you?

Hamlet:
 If so, let us proceed to scene II.
```
8. **Push e pop delle pile**:
Ogni variabile è uno stack. Una variabile avrà un numero intero inserito nello stack se una riga dice al carattere di "ricordare" un valore appropriato, come "Remember me" o "Remember yourself". Il valore più in alto nello stack viene estratto (cioè la variabile assume questo valore) se al personaggio viene detto di "recall" qualcosa; tutto il testo dopo questa parola viene trattato come un commento.


#### Esempio di script
Puoi scrivere qualcosa del genere per ottenere "Hello World!" come output:

```
The Infamous Hello World Program.

Romeo, a young man with a remarkable patience.
Juliet, a likewise young woman of remarkable grace.
Ophelia, a remarkable woman much in dispute with Hamlet.
Hamlet, the flatterer of Andersen Insulting A/S.


			Act I: Hamlet's insults and flattery.

			Scene I: The insulting of Romeo.

[Enter Hamlet and Romeo]

Hamlet:
You are the sum of a big lovely cute charming brave bold hero and a amazing cute good King!
Speak thy mind.

Romeo:
You are as good as the sum of a happy hamster and a horse.
Thou art as beautiful as the sum of yourself and a rich smooth noble squirrel.
You are as bold as the sum of thyself and a golden gentle handsome fair thing.
You are as fair as the difference between a purple small tiny rural old furry hard tree and yourself.
Speak your mind.

Hamlet:
You are as good as the sum of a smooth warm tiny white lantern and a big big moon.
You are as good as the difference between a rural big black trustworthy warm mighty hard lantern and yourself.
Speak your mind.
Speak thy mind!

Romeo:
Thou art the sum of a pretty clearest blossoming noble door and a face.
You are as honest as the difference between a big sweet warm furry rich gentle fair town and thyself.
Speak your mind.

[Exit Romeo]

			Act II: New World.

			Scene I: Space.

[Enter Juliet]
Juliet:
You are a green old tiny furry proud hero.
Speak your mind!

Hamlet:
You are as damned as the sum of a big rich sweet hard King and a trustworthy noble warm angel.
Thou art the difference between thyself and a flower.

Juliet:
Thou art as furry as the sum of a big purple furry warm pony and a rose.
You are as warm as the difference between a big white hard rich sweet lovely happy Lord and yourself.

Hamlet:
Thou art as evil as the sum of a big large warm lovely golden good happiness and thyself.
Speak thy mind!

Juliet:
Speak your mind.

Hamlet:
You are as peaceful as the difference between a amazing handsome cute charming sister and a big King.

Juliet:
You are the sum of a big warm sunny smooth town and a golden sweet joy.

Hamlet:
You are as smooth as the difference between a amazing blossoming large hard fine good black kingdom and yourself.

Juliet:
You are as dirty as the difference between a beautiful big noble mighty peaceful pretty rich Lord and thyself.

Hamlet:
Speak thy mind!

Juliet:
Speak your mind.

Hamlet:
You are as dusty as the difference between a cute loving trustworthy beautiful white angel and a pretty rich King.
Thou art as miserable as the difference between a noble smooth amazing charming bold blossoming big rose and yourself.
Speak thy mind!

[Exit Hamlet]

			Act III: New era.
			Scene I: Time.

[Enter Ophelia]

Ophelia:
You are as good as the sum of a honest smooth sunny sweet pretty hero and a King.
Speak your mind.

[Exeunt]
```
### Compilazione del codice
Per compilare il tuo script appena scritto puoi premere il pulsante Compila nella parte inferiore della prima pagina e vedere l'output dettagliato della compilazione nella casella a destra.
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/pinput.jpg" style="height:500px"> </img>
### Generazione PDF
Per quanto riguarda la creazione del PDF devi compilare il tuo sorgente (Script) e quindi generare il PDF se lo desideri. In questo software puoi anche personalizzare le immagini di tutti gli attori per adattarle meglio alle tue esigenze sul palco, magari sostituendo le immagini predefinite con alcune immagini reali di attori reali.
#### Immagini dei personaggi
In questa sezione puoi selezionare e modificare ogni immagine per ogni personaggio supportato dalla nostra implementazione SPL e, se lo desideri, puoi ripristinare le impostazioni predefinite con l'apposito pulsante sull'interfaccia.
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/ppdf.jpg" style="height:500px"> </img>
#### Esportazione finale in PDF
Quando sei pronto, assicurati che il tuo script sia stato compilato correttamente e poi puoi procedere con la generazione e l'esportazione del PDF completamente decorato. Questo processo richiede solitamente un po' di tempo perché il file generato è complesso e deve essere stampato e non utilizzato sul computer. Se la generazione e l'esportazione vanno a buon fine, alla fine il tuo browser PDF preferito si aprirà mostrandoti il risultato della generazione, e ora potrai ammirare la tua creazione appena sfornata. Divertiti!
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/pdf1.jpg" style="height:500px"> </img>
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/pdf2.jpg" style="height:500px"> </img>
## Disinstalla
Il processo di disinstallazione del software è necessario solo per la versione Windows, e basta controllare l'elenco dei programmi all'interno del Pannello di controllo di Windows stesso, sarai in grado di selezionare "*Shakespeare Programming Language Software*" e disinstallarlo direttamente dal elenco.
