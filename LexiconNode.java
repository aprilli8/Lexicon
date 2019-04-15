import structure5.*;
import java.util.Iterator;

/*
 * TODO: implement and document this class
 * You may add helper methods and member variables as you see fit.
 */
class LexiconNode implements Comparable<LexiconNode> {

    /* single letter stored in this node */
    protected char letter;

    /* true if this node ends some path that defines a valid word */
    protected boolean isWord;

    /* TODO: a data structure for keeping track of the children of
    this LexiconNode */

    /**
     * TODO: Constructor
     */
    LexiconNode(char letter, boolean isWord) { }

    /**
     * TODO: Compare this LexiconNode to another.
     * (You should just compare the characters stored at the Lexicon
     * Nodes.)
     */
    public int compareTo(LexiconNode o) { return 0; }

    /**
     * TODO: Add LexiconNode child to correct position in child data
     * structure
     */
    public void addChild(LexiconNode ln) { }

    /**
     * TODO: Get LexiconNode child for 'ch' out of child data
     * structure
     */
    public LexiconNode getChild(char ch) { return null; }

    /**
     * TODO: Remove LexiconNode child for 'ch' from child data structure
     */
    public void removeChild(char ch) { }

    /**
     * TODO: create an Iterator that iterates over children in
     * alphabetical order
     */
    public Iterator<LexiconNode> iterator() { return null; }
}
