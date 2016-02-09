//import console portion of Java codebase
import java.io.Console;

public class LeetSpeak{
  public static void main(String[] args) {}

    //define method
    public String isLeetSpeak(String word) {
      String e = word.replace('e', '3');
      String o = e.replace('o','0');
      String capitalI = o.replace('I', '1');

      char[] array = capitalI.toCharArray();

      for (char character : array) {

      if (character.valueOf('s').equals(0)) {
      return character;
      } else {
        String test = character.toString();
      return test.replace('s', 'z');
      }
}
}
}
