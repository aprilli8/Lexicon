# Lab 9: Super Lexicon

## Useful Links
 * [Course Homepage](https://williams-cs.github.io/cs136s19-www/) (with TA schedule)
 * [Lab Webpage](https://williams-cs.github.io/cs136s19-www/assets/labs/lab8/lexicon.html)
 * [Lab Hints](https://williams-cs.github.io/cs136s19-www/assets/labs/lab8/tips_n_tricks.html)


## Repository Contents
This repository contains the starter files for writing and testing
your trie-based Lexicon.

## Using Main.java to Test

```
$ java Main
```

If you hit the `Enter` key, you will be given a list of options.

```
a  add        Add <word>                Add word to lexicon
c  contains   Contains <str>            Search lexicon for word/prefix
rem  remove   Remove <word>             Removes word from lexicon
rea  read     Read <filename>           Add words from named file to lexicon
p  print      Print                     Print all words in lexicon 
s  suggest    Suggest <target> <dist>   Find suggestions for target within distance
m  match      Match <regex>             Find matches for pattern
q  quit       Quit                      Quit the program
i  iter       iter                      test iter
```

After selecting a command, `Main` will execute the corresponding methods
in your Lexicon code. (This is why it is important to have "stubs" for
functions that are not yet implemented.) Test your functionality
incrementally!
