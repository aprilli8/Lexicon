//I am the sole author of the work in this repository.

import structure5.*;
import java.util.Iterator;

/*
 * This class creates a LexiconIterator that creates an alphabetical vector of
 * all the words in the tree.
 */
public class LexiconIterator extends AbstractIterator<String> {

  /* Vector of all the words */
  protected Vector<String> words;

  /* keeps track of current element of vector being tracked */
  protected int count;

  /**
   * Constructor initializes words vector and populates it with all the words
   */
  public LexiconIterator(LexiconNode root){
    words = new Vector<String>();
    count = 0;
    buildWords(root, "");
  }

  /**
   * pre: currentNode is a valid LexiconNode and soFar is a valid String
   * post: recursively calls itself in a pre-order traversal of the tree and
   *      adds all words to the words vector
   */
  private void buildWords(LexiconNode currentNode, String soFar){
    if(currentNode.getIsWord()){
      words.add(soFar);
    }
    if(currentNode.getChildrenSize()==0){
      return;
    }
    for(LexiconNode child : currentNode.getChildren()){
      buildWords(child, new String(soFar + child.getLetter()));
    }
  }

  /**
   * pre: none
   * post: returns true if count not at the end of the vector, false if otherwise
   */
  public boolean hasNext(){
    return count<words.size();
  }

  /**
   * pre: none
   * post: sets count to 0
   */
  public void reset(){
    count = 0;
  }

  /**
   * pre: none
   * post: returns the word at the next count in the vector
   */
  public String next(){
    return words.get(count++);
  }

  /**
   * pre: none
   * post: returns the word at the current count in the vector
   */
  public String get(){
    return words.get(count);
  }

}
