import org.junit.*;
import static org.junit.Assert.*;

public class PartyTimeTest {

  @Test
  public void Method_Return_Value(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "Party";
    assertEquals(expectedWord, testParty.partyTitle("Party"));
  }

}