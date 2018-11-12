# Lab 9: Super Lexicon

## Useful Links
 * [Course Homepage](http://cs.williams.edu/~cs136/index.html) (with TA schedule)
 * [Lab Webpage](http://cs.williams.edu/~cs136/labs/lexicon.html)
 * [Lab Hints](http://cs.williams.edu/~cs136/labs/lexicon-hints.html)


## Repository Contents
This repository contains the starter files for writing and testing
your Trie-based Lexicon.

## Using Main.java to Test

```
$ java Main
```

If you hit enter, you will be given a list of options.

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

After selecting a command, Main will execute the corresponding methods
in your Lexicon code. (This is why it is important to have "stubs" for
functions that are not yet implemented.) Test your functionality
incrementally!


# Lexicon Thought Questions

 1. For each node in the trie, you need to store pointers to its children nodes. What data structure did you use to store the pointers to children nodes? Justify the choice you made.
   * Data structure choice:
   * Justification:
2. Suppose we use an OrderedVector instead of a trie for storing our Lexicon. Discuss how the process of searching for suggested spelling corrections would differ from our trie-based implementation. Which is more efficient? Why?
   * Searching in a trie:
   * Searching in an OrderedVector:
   * Which is more efficient? (_justify your answer_)

