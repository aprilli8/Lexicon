import structure5.*;
import java.util.Iterator;

public class LexiconIterator extends AbstractIterator<String> {
  Vector<String> listOfWords;
  int currentIndex;

  public LexiconIterator(Vector<String> listOfWords) {
    this.listOfWords = listOfWords;
    currentIndex = 0;
  }

  public boolean hasNext(){
    return currentIndex < listOfWords.size();
  }

  public String next() {
    return listOfWords.get(currentIndex++);
  }
  public String get() {
    return listOfWords.get(currentIndex);
  }

  public void reset() {
    currentIndex = 0;
  }
}
