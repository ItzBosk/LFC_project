# How the language works (In our case study, taken from [this official desc](https://web.archive.org/web/20211031164653/http://shakespearelang.sourceforge.net/report/shakespeare/shakespeare.html))

## Title
The first line of every SPL program is the title. The title serves only aesthetic purposes. From the parser's point of view, it's a comment.

## Dramatis Personæ
The next few lines are a list of all characters in the play. They're like variables that can contain signed integer value.
You must declare every character you intend to use, or the program won't compile.
A declaration consists of a name, followed by a description of the character (which is ignored by the parser). 
You can't pick just any name, however; you must use a real Shakespeare character name, such as Romeo, Juliet, or the Ghost (Hamlet's deceased father).
### Allowed characters in our study: 
### {Romeo, Juliet, Ghost, LadyMacbeth, Ofelia, Tebaldo, Claudio, Mercuzio, Banquo, Fulgencio, Gertrude, Desdemona, Jago, Polonio, Macduff, Shylock, Laerte, Orazio, Prospero}
### TODO - It/Eng translation

## Acts and Scenes
A play consists of one or more acts, each act consists of one or more scenes, and each scene consists of lines (where the characters say something) and enter and exit statements.
Acts and scenes are numbered with roman numerals. They begin with the word ``Act'' or ``Scene'', then the number, and then a description of what happens in that act or scene.
Just as with the title and the character descriptions, these descriptions are ignored by the parser.
Acts and scenes also serve as labels, which can be jumped to using goto statements.

## Enter, Exit and Exeunt
To be able to speak their lines, characters must be on stage. The character they address as ``you'' (or ``thou'' or any other second-person pronoun) must also be on stage. But if there is yet another character on stage, it's not clear which one is intended. This is frowned upon by the parser.

Enter Enter and Exit5. These directives cause characters to get on and off stage. ``Enter'' is followed by a list of one or more characters. ``Exit'' is followed by exactly one character. The plural of Exit is ``Exeunt'', which is followed by a list of at least two characters - or none, in which case everyone leaves.

An Enter directive given to a character already on stage, or the other way around, will cause a runtime error.

## Lines
A line consists of the name of a character, a colon, and one or more sentences. In the Hello World program, only two kinds of sentences are used: output, which causes output to the screen, and statements, which cause the second person to assume a certain value.

## Constants
First, we'll explain how constants (that is, constant numbers, such as 17 and 4711) are expressed.

Any noun is a constant with the value 1 or $-1$, depending on whether it's nice or not. For example, ``flower'' has the value 1 because flowers are nice, but ``pig'' has the value $-1$ because pigs are dirty (which doesn't prevent most people from eating them). Neutral nouns, such as ``tree'', count as 1 as well.

By prefixing a noun with an adjective, you multiply it by two. Another adjective, and it is multiplied by two again, and so on. That way, you can easily construct any power of two or its negation. From there, it's easy to construct arbitrary integers using basic arithmetic, such as ``the sum of $X$ and $Y$'', where $X$ and $Y$ are themselves arbitrary integers.

For example, ``the difference between the square of the difference between my little pony and your big hairy hound and the cube of your sorry little codpiece''. Substituting the simple constants with numbers, we get ``the difference between the square of the difference between 2 and 4 and the cube of -4''. Now, since the difference between 2 and 4 is $2 - 4 = -2$, and the cube of $-4$ is $(-4)^3 =
-64$, this is equal to ``the difference between the square of $-2$ and $-64$''. The square of $-2$ is $(-2)^2 = 4$, and the difference of 4 and $-64$ is 60. Thus, ``the difference between the square of the difference between my little pony and your big hairy hound and the cube of your sorry little codpiece'' means 60.

As you see, this way of writing constants gives you much more poetic freedom than in other programming languages.

## Assignment of Values
Now, how do we use those numbers? Well, just have a look at the two statements ``You lying stupid fatherless big smelly half-witted coward!'' and ``You are as stupid as the difference between a handsome rich brave hero and thyself!''

The first one is simple: A second person pronoun, followed by a number. The effect of this statement is to assign the value of that number (in this case, $-64$) to the character being spoken to. Think ``$X=-64$''.

The second one is slightly more complicated. For starters, what is the value of ``thyself''? That's not a noun, that's a reflexive pronoun. It's value is the current value of the character being spoken to. So the number in the second statement is $8 - X$, where $X$ is the value of the character being spoken to. And just as you might expect from your experience with English, the second statement is just another assignment. Think ``$X$ = 8 - $X$''. Being ``as bas as'', ``as good as'', or as [any adjective] as something else, means being equal to that something.

## Output
The other kind of sentence used in the Hello World program is output. There are two different output sentences, ``Open your heart'' and ``Speak your mind''. The first causes the character being spoken to to output her or his value in numerical form, and the other, being more literal, outputs the corresponding letter, digit, or other character, according to the character set being used by your computer.

In this program, we use only the second form. The whole program is a long sequence of constructing a number, writing the corresponding character, constructing the next number, writing the corresponding character, and so on.

