//I am the sole author of the work in this repository.

import structure5.*;
import java.util.Iterator;
import java.util.Scanner;

/*
 * This class creates a LexiconTrie object that consists of many LexiconNodes
 * that make up words. Words from a file can also be added to the tree.
 */
public class LexiconTrie implements Lexicon{

    /* LexiconNode that stores an empty root */
    protected LexiconNode root;

    /* keeps track of number of words in the Lexicon */
    protected int wordCount;

    /*
    * The constructor initializes a newly allocated lexicon
    * to represent an empty word list.
    */
    public LexiconTrie(){
      root = new LexiconNode(' ', false);
      wordCount = 0;
    }

    /*
    * This member function adds the specified word to this lexicon. The
    * word is expected to contain only lowercase letters.
    * pre: word is a valid String
    * post: returns true if the word was added (i.e. previously did
    * not appear in this lexicon) and false otherwise.
    */
    public boolean addWord(String word){
      word = word.toLowerCase();
      LexiconNode current = root;
      //searches for the existence of each node in the required path and creates
      //the node if it does not exist
      for(int i = 0; i < word.length(); i++){
        if(current.getChild(word.charAt(i))!=null){
          current = current.getChild(word.charAt(i));
        }
        else{
          LexiconNode newNode = new LexiconNode(word.charAt(i), false);
          current.addChild(newNode);
          current = newNode;
        }
      }
      //if the word already existed, returns false, else turn the isWord flag on
      //and returns true
      if(current.getIsWord()){
        return false;
      }
      else{
        current.changeIsWord();
        wordCount++;
        return true;
      }
    }

    /*
    * This member function opens the specified file, expecting a
    * text file containing one word per line, and adds each word
    * to this lexicon.
    * pre: filename is a valid file of Strings
    * post: returns the count of new words that were added. If the file doesn't
    * exist or was unable to be opened, the function returns 0.
    */
    public int addWordsFromFile(String filename){
      Scanner scan = new Scanner(new FileStream(filename));
      int fileWordCount = 0;
      while(scan.hasNextLine()){
        addWord(scan.nextLine());
        fileWordCount++;
      }
      return fileWordCount;
    }

    /*
    * This member function attempts to remove a specified word from
    * this lexicon.
    * pre: word is a valid String
    * post: if the word appears in the lexicon, it is unflagged as a word,
    *     any unnecessary letter nodes are removed, and true is returned;
    *     else if the word was not contained in the lexicon, the lexicon is
    *     unchanged and false is returned
    */
    public boolean removeWord(String word){
      word = word.toLowerCase();
      LexiconNode current = root;
      //keeps track of last valid word in the path before the one being removed
      LexiconNode lastWord = root;
      LexiconNode lastWordChild = root.getChild(word.charAt(0));
      //searches along the path of the word
      for(int i = 0; i < word.length(); i++){
        if(current.getChild(word.charAt(i))!=null){
          current = current.getChild(word.charAt(i));
          if(i!=word.length()-1 && current.getIsWord()){
            lastWord = current;
            lastWordChild = current.getChild(word.charAt(i+1));
          }
        }
        else{
          return false;
        }
      }
      //unflags word if it is currently true and removes all children up to
      //the last node that was a word
      if(current.getIsWord()){
        current.changeIsWord();
        if(current.getChildrenSize()==0){
          lastWord.removeChild(lastWordChild.getLetter());
        }
        wordCount--;
        return true;
      }
      else{
        return false;
      }
    }

    /*
    * This member function returns the number of words contained
    * in this lexicon.
    * pre: none
    * post: returns wordCount
    */
    public int numWords(){
      return wordCount;
    }

    /*
    * This member function returns true if the specified
    * word exists in this lexicon, false otherwise.
    * pre: word is a valid string
    * post: returns true if word exists, false if it does not
    */
    public boolean containsWord(String word){
      word = word.toLowerCase();
      LexiconNode current = root;
      for(int i = 0; i < word.length(); i++){
        if(current.getChild(word.charAt(i))!=null){
          current = current.getChild(word.charAt(i));
        }
        else{
          return false;
        }
      }
      if(current.getIsWord()){
        return true;
      }
      else{
        return false;
      }
    }

    /*
    * This member function returns true if any words in
    * the lexicon begin with the specified prefix, false
    * otherwise. A word is defined to be a prefix of itself
    * and the empty string is a prefix of everything.
    * pre: prefix is a valid String
    * post: returns true if path to prefix exists, false if it does not
    */
    public boolean containsPrefix(String prefix){
      prefix = prefix.toLowerCase();
      LexiconNode current = root;
      for(int i = 0; i < prefix.length(); i++){
        if(prefix.equals(" ") || current.getChild(prefix.charAt(i))!=null){
          current = current.getChild(prefix.charAt(i));
        }
        else{
          return false;
        }
      }
      return true;
    }

    /*
    * This member function returns an iterator over all
    * words contained in the lexicon. Accessing the
    * words from the iterator will retrieve them in
    * alpahbetical order.
    * pre: none
    * post: returns an iterator that iterates over all the words in the tree
    *     in alphabetical order
    */
    public Iterator<String> iterator(){
      LexiconIterator iter = new LexiconIterator(root);
      return iter;
    }

    /*
    * (OPTIONAL:) This member function returns a pointer to a set of strings,
    * where each entry is a suggested correction for the target.
    * All words in the lexicon with a distance to the target that
    * is less than or equal to the parameter distance should be in
    * the returned set.
    */
    public Set<String> suggestCorrections(String target, int maxDistance) {return null;}

    /*
    * (OPTIONAL:) This member function returns a pointer to a set of strings,
    * where each entry is match for the regular expression pattern.
    * All words in the lexicon that match the pattern should be in
    * the returned set.
    */
    public Set<String> matchRegex(String pattern){return null;}
}
