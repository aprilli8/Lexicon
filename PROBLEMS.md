# Lexicon Thought Questions

1. For each node in the trie, you need to store pointers to its children nodes. What data structure did you use to store the pointers to children nodes? Justify the choice you made.
   * Data structure choice: Vectors
   * Justification: I chose to use a Vector because it provides a fairly flexible data structure that support many of the
   functions that would be useful in the creation of a LexiconTrie. In particular, since we don't know what nodes need to
   be added to another, Vectors help create a data structure of the minimum number of required nodes that can easily be
   expanded to fit in additional nodes, saving space by not reserving unnecessary space for all the possible children of a
   node. The Vector class also supports a function that allows children nodes to be easily inserted into the vector in
   alphabetical order, which is helpful in creating the structure of the tree.

2. Suppose we use an `OrderedVector` instead of a trie for storing our lexicon. Discuss how the process of searching for suggested spelling corrections would differ from our trie-based implementation. Which is more efficient? Why?
   * Searching in a trie: To search for spelling corrections in a trie, we would follow the path of the target string through
   each of its nodes and take detours to neighboring nodes that are within the maximum distance specified by the input.
   * Searching in an `OrderedVector`: To search for spelling corrections in an OrderedVector, we would need to search through
   every single word in the Vector and check to see if its difference to the target String is within the maximum distance.
   * Which is more efficient?: The trie would be the more efficient process because one would only need to search through
   a smaller portion of all the words in the tree. Since the function would only continue to follow a potential spelling
   correction if it is within the maximum distance, it would never need to check words that are extremely far off from the
   target string, whereas in the OrderedVector, the function would have no choice but to pass through each word in the Vector.
