//I am the sole author of the work in this repository.

import structure5.*;
import java.util.Iterator;

/*
 * This class creates a LexiconNode object that represents a single letter in the
 * overall LexiconTrie. It keeps track of a single letter as well as references
 * to chidren nodes that follow it.
 */
class LexiconNode implements Comparable<LexiconNode>{

    /* single letter stored in this node */
    protected char letter;

    /* true if this node ends some path that defines a valid word */
    protected boolean isWord;

    /* a vector data structure that keeps track of the children of
    this LexiconNode */
    protected Vector<LexiconNode> children;

    /**
     * Creates a LexiconNode object that holds a single letter and a flag
     * for whether or not it is the end of a word
     */
    LexiconNode(char let, boolean isWrd){
      letter = Character.toLowerCase(let);
      isWord = isWrd;
      children = new Vector<LexiconNode>();
    }

    /**
     * pre: parameter o is a valid LexiconNode
     * post: returns a negative value if letter is before o alphabetically,
     *    0 if they are the same, and a positive value if it comes after
     */
    public int compareTo(LexiconNode o){
      return Character.compare(letter, o.getLetter());
    }

    /**
     * pre: none
     * post: returns letter
     */
    public char getLetter(){
      return letter;
    }

    /**
     * pre: none
     * post: returns size of children vector
     */
    public int getChildrenSize(){
      return children.size();
    }

    /**
     * pre: none
     * post: returns isWord
     */
    public boolean getIsWord(){
      return isWord;
    }

    /**
     * pre: none
     * post: returns children vector
     */
    public Vector<LexiconNode> getChildren(){
      return children;
    }

    /**
     * pre: none
     * post: isWord is changed from either true to false or false to true
     */
    public void changeIsWord(){
      if(isWord){
        isWord = false;
      }
      else{
        isWord = true;
      }
    }

    /**
     * pre: ln is a valid LexiconNode
     * post: ln is added to children in alphabetical order
     */
    public void addChild(LexiconNode ln){
      int index = 0;
      for(int i = 0; i < children.size(); i++){
        if(ln.compareTo(children.get(i)) <= 0){
          index = i;
          break;
        }
      }
      children.insertElementAt(ln, index);
    }

    /**
     * pre: ch is a valid character
     * post: returns the child whose letter matches ch or null if it does not exist
     */
    public LexiconNode getChild(char ch){
      for(int i = 0; i < children.size(); i++){
        if(children.get(i).getLetter()==ch){
          return children.get(i);
        }
      }
      return null;
    }

    /**
     * pre: ch is a valid character
     * post: ch is removed from the children vector
     */
    public void removeChild(char ch){
      children.remove(getChild(ch));
    }

    /**
     * pre: none
     * post: an iterator that iterates over elements of children is returned
     */
    public Iterator<LexiconNode> iterator(){
      return children.iterator();
    }

}
