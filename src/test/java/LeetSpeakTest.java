import org.junit.*;
import static org.junit.Assert.*;

public class LeetSpeakTest {

  @Test
  public void isLeetSpeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    LeetSpeak leetSpeak = new LeetSpeak();
    assertEquals("happy", leetSpeak.isLeetSpeak("happy"));
  }

  @Test
  public void isLeetSpeak_replaceEveryEWith3_wordChanges() {
    LeetSpeak leetSpeak = new LeetSpeak();
    assertEquals("3l3phant", leetSpeak.isLeetSpeak("elephant"));
  }

  @Test
  public void isLeetSpeak_replaceEveryOWith0_wordChanges() {
    LeetSpeak leetSpeak = new LeetSpeak();
    assertEquals("0liphant", leetSpeak.isLeetSpeak("oliphant"));
  }

  @Test
  public void isLeetSpeak_replaceEveryIWith1_wordChanges() {
    LeetSpeak leetSpeak = new LeetSpeak();
    assertEquals("1gloo", leetSpeak.isLeetSpeak("Igloo"));
  }

//NO toUpper OR toLower
}
