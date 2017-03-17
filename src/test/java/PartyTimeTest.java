import org.junit.*;
import static org.junit.Assert.*;

public class PartyTime {

  @Test
  public void Method_Return_Value(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "";
    assertEquals(expectedWord, testParty.setMethod(""));
  }

}