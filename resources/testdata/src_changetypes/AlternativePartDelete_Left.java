
public class Compute {
    MessageQueue mq;
  
    public Compute(MessageQueue mq) {
      this.mq = mq;
    }
  
    public int countNumberOfOccurrences(String e) {
      if (mq.size() == 0) {
        return -1;
      }
      if (!mq.contains(e)) {
        return 0;
      }
      else{}
      int counter = 0;
      for (int i = 0; i < mq.size(); i++) {
        if (e.equals(mq.getAt(i))) {
          counter++;
        }
        else{}
      }
      return counter;
    }
  }