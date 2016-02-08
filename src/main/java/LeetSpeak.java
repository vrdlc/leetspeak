//import console portion of Java codebase
import java.io.Console;

public class LeetSpeak{
  public static void main(String[] args) {}

    //define method
    public String isLeetSpeak(String word) {
      String e = word.replace('e', '3');
      String o = e.replace('o','0');
      return o.replace('I', '1');

    }
}
