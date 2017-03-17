import org.junit.*;
import static org.junit.Assert.*;

public class PartyTimeTest {

  @Test
  public void setPartyTitle_PartyName_Party(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "Party";
    assertEquals(expectedWord, testParty.setPartyTitle("Party"));
  }

  @Test
  public void getPartyTitle_PartyName_Party(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "Party";
    assertEquals(expectedWord, testParty.getPartyTitle("Party"));
  }

}