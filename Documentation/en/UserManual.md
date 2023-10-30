# SPL Software User Manual

## Introduction
Thank you for choosing the SPL Software, a powerful and innovative tool designed to bring the timeless beauty of Shakespearean language to the digital age of programming and informatics. The SPL (Shakespeare Programming Language) Software is not just a simple interpreter; it's a comprehensive platform that empowers you to create, edit, compile, and interact with poems in the poetic style of the Bard himself, William Shakespeare.

This user manual is your gateway to unlocking the full potential of the SPL language. Whether you are a seasoned poet, a student of classical literature, or simply someone who admires the artistry of Shakespearean verse under this modern adjustement, our software is your key to immersing yourself in the language that has captivated hearts and minds for centuries.

In this manual, we will walk you through the intricacies of the SPL Software, ensuring that you can harness its features to craft beautiful and meaningful verses, explore the depths of Shakespearean poetry, and engage in a creative journey like no other. From installation to advanced features, we've got you covered.

Prepare to embark on a literary adventure where you can express your thoughts, emotions, and stories through the unparalleled eloquence of Shakespearean poetry. This new enterntaining programming technique mixed with a classical dress is now at your fingertips, and this manual will be your trusty guide to mastering it.

Let's delve into the art of poetry and the science behind the computer programming with the SPL Software and bring the beauty of the Bard's words into the digital age.

## Prerequisites
This software only requires Java, which is a versatile, object-oriented programming language, renowned for portability, used for web, desktop, and mobile applications.
The minimum required version of Java is 1.8.

### Installation of Java
*If you already have Java JRE ( or OpenJDK alternative ) installed and working in your machine you can skip this installation process*

Installing Java can be broken down into five simple steps:

**Step 1: Prepare Your Computer**

Ensure your computer is connected to the internet, and you have administrative privileges to install software.

**Step 2: Download Java**

1. Open your web browser (like Google Chrome or Mozilla Firefox).
2. In the address bar, type "Java download" and press Enter.
3. Look for the official Java download page, typically provided by Oracle or OpenJDK. Click on it to open the page.

**Step 3: Choose the Right Version**

1. On the Java download page, you will see different versions of Java. You'll often find two main types: JDK (Java Development Kit) and JRE (Java Runtime Environment).
2. You only need Java to run existing Java programs, so download the JRE.
3. Click on the download link for the version you need. It's usually labeled as "Download" or something similar.

**Step 4: Accept the License Agreement**

1. After clicking the download link, you'll be taken to a page with a license agreement. Read through it if you like, then look for a checkbox that says "I agree to the Oracle Technology Network License Agreement."
2. Check this box to indicate your agreement.
3. Click the download link again.

**Step 5: Install Java**

1. Once the download is complete, locate the downloaded file. It's often an executable file with a ".exe" extension on Windows or a ".dmg" file on macOS.
2. Double-click the downloaded file to run the installer.
3. Follow the on-screen instructions to install Java. Typically, you can use the default settings unless you have a specific reason to customize them.
4. The installer will complete the installation process, and you'll see a confirmation when it's done.

That's it! You've successfully installed Java on your computer. You can now use Java to run Java applications like our SPL Software.

### Installing SPL Software
If you are running **Windows** you can run the ["*SPL Installer.msi*"](https://github.com/ItzBosk/LFC_project/blob/main/Workspace_Shakespeare/SPL%20Installer.msi) file from our project on github, follow along the simple instructions that are displayed within the installation software and then run the freshed installed SPL Software from the link on your desktop.
If your are running **MacOS** you need to extract the files from ["*SPL Complete.zip*"](https://github.com/ItzBosk/LFC_project/blob/main/Workspace_Shakespeare/SPL_Complete.zip) in your favourite location, and the launch the "*SPL.jar*" executable inside the extracted folder.
If you are running **Linux** follow along the same instructions as per MacOS (ymmv but if you daily use Linux you can figure it out urself)

### Understanding how SPL works (basics)
Creating Shakespeare Programming Language (SPL) code can be a fun, creative way to write programs. Imagine you're telling a story with two characters, and they need to talk to each other, and they also move around. Here's how you can do it:

1. **Title**: Self explanatory
2. **Dramatis Personae**: Pick two characters. These can be any names you like from the following list, such as "Romeo" and "Juliet".  
   {'Romeo', 'Juliet', 'Hamlet', 'Ghost', 'LadyMacbeth', 'Ophelia', 'Mercutio', 'Banquo', 'Gertrude', 'Polonio', 'Shylock', 'Prospero'}  
Each character will represent a stack (like a pile of books) and a current value. They're the actual "variable" of the Shakespeare language.
3. **Acts and Scenes**: It's the logical subdivision of events in a SPL enviroment, an act may contain different scenes. A scene must be declared inside an Act. The numeration is sequential and uses Roman Numbers. There must be at least ACT I and SCENE I
4. **Entering and Exiting**: On the stage there must be a max two character, so the entering and exiting is used to set which one are active in that particular Scene.
5. **Lines and Assignment**: We will discuss this topic deeply later, but for now we can consider this the real part of the SPL because is with Lines and Assignment that the program logic is built, the numbers are created and the characters handles values.
You can choose from the following list all the items that you want to use to build your Script:

NOUNS:   

-POSITIVE NOUN (+1) =  
{'Heaven', 'King', 'Lord', 'angel', 'flower', 'happiness', 'joy', 'plum', 'summer’s day', 'hero', 'rose', 'kingdom', 'pony'}
   
-NEUTRAL NOUN (+1) =   
{'animal', 'aunt', 'brother', 'cat', 'chihuahua', 'cousin', 'cow', 'daughter', 'door', 'face', 'father', 'fellow', 'granddaughter', 'grandfather', 'grandmother', 'grandson', 'hair', 'hamster', 'horse', 'lamp', 'lantern', 'mistletoe', 'moon', 'morning', 'mother', 'nephew', 'niece', 'nose', 'purse', 'road', 'roman', 'sister', 'sky', 'son', 'squirrel', 'stonewall', 'thing', 'town', 'tree', 'uncle','wind'}
    
-NEGATIVE NOUN (-1) =  
 {Hell', 'Microsoft', 'bastard', 'beggar', 'blister', 'codpiece', 'coward', 'curse', 'death', 'devil', 'draught', 'famine', 'flirt-gill', 'goat', 'hate', 'hog', 'hound', 'leech', 'lie', 'pig', 'plague', 'starvation', 'toad', 'war', 'wolf'}

ADJECTIVES

-POSITIVE ADJECTIVE =   
{'amazing', 'beautiful', 'blossoming', 'bold', 'brave', 'charming', 'clearest', 'cunning', 'cute', 'delicious', 'embroidered', 'fair', 'fine', 'gentle', 'golden', 'good', 'handsome', 'happy', 'healthy', 'honest', 'lovely', 'loving', 'mighty', 'noble', 'peaceful', 'pretty', 'prompt', 'proud', 'reddest', 'rich', 'smooth', 'sunny', 'sweet', 'sweetest', 'trustworthy', 'warm'}

-NEUTRAL ADJECTIVE =   
{'big', 'black', 'blue', 'bluest', 'bottomless', 'furry', 'green', 'hard', 'huge', 'large', 'little', 'normal', 'old', 'purple', 'red', 'rural', 'small', 'tiny', 'white', 'yellow'}

-NEGATIVE ADJECTIVE =  
{'bad', 'cowardly', 'cursed', 'damned', 'dirty', 'disgusting', 'distasteful', 'dusty', 'evil', 'fat', 'fat-kidneyed', 'fatherless', 'foul', 'hairy', 'half-witted', 'horrible', 'horrid', 'infected', 'lying', 'miserable', 'misused', 'oozing', 'rotten', 'smelly', 'snotty', 'sorry', 'stinking', 'stuffed', 'stupid', 'vile', 'villainous', 'worried'}

7. **Input and Output**: There are different ways to see and set values in SPL, and you can both interact with Integers or their corrispective in Char value, allowing you to display both numbers, letters, symbols, or combine them if you want.
8. **Conditional Statement**: You can specify some checkings about the current value of a variable and jump to certain location of the code in order to implement a complex structure.
9. **Push and Pop**: Each personae is also a stack. So it's allowed to be pushed a new value onto the stack of the character itself and if needed also to pop the topmost value of his memory.

Remember, in the Shakespeare Programming Language, you're not writing typical code like in other programming languages. Instead, you're creating a story where the characters and their actions represent the code's logic. It's a fun way to write code, almost like writing a play or a script!

## SPL Software
We can divide the SPL Software utilization into two different phases, the writing of the Script with it's compilation and logic, and the PDF generation which can be used by real actors on stage for practice.
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/phome.jpg" style="height:500px"> </img>
### Script writing
In the left field of the first page there is a space which you have to use to write the script down. A basic Script will be loaded on the first start in order to help you understanding how it works.
#### Script logic
In this section we are going to see a complete explanation on how to write a program in SPL.
1. **Title**:
The first line in a Shakespeare program is called the 'title'. The compiler considers anything from the first line to the first period to be a comment.
```
The incredible story of a simple SPL program!
```

2. **Dramatis Personae**:
This is the section where characters (variables) are declared. Each variable can hold a signed integer and is written as "Name, Description"
```
Romeo, the impavid adventurer.
Juliet, the beauty of the youth.
```
3. **Acts and scenes**:
As already said before, a Shakespeare Script is broken into Acts which contain Scenes in which characters (variables) interact. Each Act and Scene is numbered with a Roman numeral and serves as a GOTO label. Any code after the colon is considered a comment. They are written in the form:
```
Act I: Hamlet's insults and flattery.
Scene I: The insulting of Romeo.
```
4. **Enter, exit and exeunt**:
Individual lines of code generally take the form of a piece of dialogue spoken by one character to another; this is how the value of a variable (the character spoken to) is assigned, changed, or output. A character can only be addressed as "you" or "thou". Thus, there must typically be exactly two characters "on stage" whenever lines are spoken: one to speak, and the other to be spoken to. To call a variable to the stage the Enter command is used with a list of one or more characters. The Exit command tells exactly one listed character to leave the stage. Exeunt calls more than one character to leave, or in the case that no characters are listed all the characters will leave the stage. The following format is used:
```
[Enter Juliet]
[Enter Romeo and Juliet]
[Exit Romeo]
[Exeunt Romeo and Juliet]
[Exeunt]
```
5. **Lines, Constants and assignment of values**:
Lines are represented as dialogue spoken by a character, and consist of at least one sentence. Each sentence may assign a new value to a variable, direct a variable to output its value, or direct it to receive an input. Lines can also manipulate stacks or act as if/then or goto statements. A line starts with a character's name and a colon. Since this character is the speaker, the other character on stage is the variable that is addressed as "you" or "thou".
Constants are represented by combinations of nouns and adjectives; the language recognizes a finite list of each, and both lists are separated into those having positive, negative, or neutral tone. Positive and neutral nouns have a value of 1 and negative nouns have a value of -1. Any adjective multiplies a noun by 2, and adjectives can be compounded. Possessive pronouns are ignored by the parser, while words pertaining to basic arithmetic are recognized as operations, such as "sum", "quotient", and "product". A sentence that assigns a value to a character starts with "You" or "Thou", may optionally continue with "are as [any adjective] as", and then gives the mathematical formula in nouns, adjectives, variables, and operations for the new value. In the creation of a value you can also explicit the modifier "not" which negates the value calculated by the following expression. Examples of such lines follow:
```
Hamlet:
 You lying stupid fatherless big smelly half-witted coward!

Juliet:
 You are not as good as a big big King!
```
The mathematical formulae can also use the names of other characters (even if those characters are not on stage) to utilize the current value of that character in a computation, or "yourself" or "thyself" for the character being spoken to.

6. **Input and output**:
Lines can also call for a variable to give output or receive input. "Open your heart" outputs the variable's numerical value, while "Speak your mind" outputs the corresponding ASCII character. "Listen to your heart" or "Open your mind" cause the variable to receive input from the user; the former for a number and the latter for a character.

7. **Conditional statements and gotos**:
An if/then statement is phrased as a question posed by a character. The words "as [any adjective] as" represent a test for equality, while "better" and "worse" correspond to greater than and less than, respectively. A subsequent line, starting "if so" or "if not", determines what happens in response to the truth or falsehood of the original condition. A goto statement begins "Let us", "We shall", or "We must", continues "return to" or "proceed to", and then gives an act or scene. A scene will be parsed as that scene in the current act; a goto statement cannot call a scene in a different act. A conditional statement to call a goto would look like this:
```
Juliet:
 Am I better than you?

Hamlet:
 If so, let us proceed to scene II.
```
8. **Pushing and popping stacks**:
Each variable is a stack. A variable will have an integer pushed onto its stack if a line tells the character to "remember" an appropriate value, such as "Remember me", or "Remember yourself". The topmost value in the stack is popped (i.e., the variable assumes this value) if the character is told to "recall" anything; all text after this word is treated as a comment.


#### Script example
You can write something like this in order to obtain "Hello World!" as output:

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
### Code compilation
In order to compile your freshly written script you can press the Compile button on the bottom of the first page, and see the verbose output of the compilation in the box on the right.
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/pinput.jpg" style="height:500px"> </img>
### PDF generation
Regarding the PDF creation you have to compile your source (Script) and then generate the PDF if you want. In this software you can also customize the images for all the actors to better suit your on stage needs, maybe sustituting the default pictures with some actual pictures of real actors.
#### Characters pictures
In this section you can select and change every image for every character that our SPL implementation supports, and if you want you can reset back to default with the specific button on the interface.
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/ppdf.jpg" style="height:500px"> </img>
#### PDF final export
When you are ready, make sure that your Script has compiled correctly and then you can proceed to generate and export the fully decorated PDF. This process usually takes a little bit of time because the generated file is complex and it purpouse is to be printed and not used on the Computer. If the generation and the export goes well at the end your preferred PDF browser will open showing you the result of the generation, and now you can admire your freshly baked creation. Enjoy!
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/pdf1.jpg" style="height:500px"> </img>
<br>
<img src="https://github.com/ItzBosk/LFC_project/blob/main/Documentation/Pictures/pdf2.jpg" style="height:500px"> </img>
## Uninstall
The process of uninstalling the software is needed only for the Windows version, and just check your program list inside the Control Panel of Windows itself, you'll be able to select the "*Shakespeare Programming Language Software*" and uninstall it directly from the list.
