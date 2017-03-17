import org.junit.*;
import static org.junit.Assert.*;

public class PartyTime {

  @Test
  public void difficulty_returnUserDifficulty_Hard(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "";
    assertEquals(expectedWord, testParty.setMethod(""));
  }

}