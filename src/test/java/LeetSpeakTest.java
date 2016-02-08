import org.junit.*;
import static org.junit.Assert.*;

public class LeetSpeakTest {

  @Test
  public void isLeetSpeak_returnsAStringAsIsWhenNoLeetspeakIsPresent_wordDoesntChange() {
    LeetSpeak leetSpeak = new LeetSpeak();
    assertEquals("happy", leetSpeak.isLeetSpeak("happy"));
  }

}
