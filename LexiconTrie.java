import structure5.*;
import java.util.Iterator;

public class LexiconTrie implements Lexicon {
    
    /*
    * The constructor initializes a newly allocated lexicon
    * to represent an empty word list.
    */
    public LexiconTrie() { }
    
    /*
    * This member function adds the specified word to this lexicon.
    * It returns true if the word was added (i.e. previously did
    * not appear in this lexicon) and false otherwise. The
    * word is expected to contain only lowercase letters.
    */
    public boolean addWord(String word) {return true;}

     /*
    * This member function opens the specified file, expecting a
    * text file containing one word per line, and adds each word
    * to this lexicon. The value returned is the count of
    * new words that were added. If the file doesn't exist or was unable
    * to be opened, the function returns 0.
    */
    public int addWordsFromFile(String filename) {return 0;}
    
    /*
    * This member function attempts to remove a specified word from
    * this lexicon. If the word appears in the lexicon, it is removed and true is returned.
    * If the word was not contained in the lexicon, the lexicon is
    * unchanged and false is returned.  
    */
    public boolean removeWord(String word) {return true;}
    
    /*
    * This member function returns the number of words contained
    * in this lexicon. 
    */
    public int numWords() {return 0;}
    
    /*
    * This member function returns true if the specified
    * word exists in this lexicon, false otherwise.
    */
    public boolean containsWord(String word){return true;}
    
    /*
    * This member function returns true if any words in
    * the lexicon begin with the specified prefix, false
    * otherwise. A word is defined to be a prefix of itself
    * and the empty string is a prefix of everything.
    */
    public boolean containsPrefix(String prefix){return true;}
    
    /*
    * This member function returns an iterator over all
    * words contained in the lexicon. Accessing the
    * words from the iterator will retrieve them in
    * alpahbetical order.
    */
    public Iterator<String> iterator() {return null;}
    
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
