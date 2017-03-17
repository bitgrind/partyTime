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
    String expectedWord = "";
    assertEquals(expectedWord, testParty.getPartyTitle());
  }

  @Test
  public void setPartyGuests_NumberofGuests_GuestNumber(){
    PartyTime testParty = new PartyTime();
    int expectedWord = 30;
    assertEquals(expectedWord, testParty.setPartyGuests(30));
  }

  @Test
  public void getPartyGuests_NumberofGuests_GuestNumber(){
    PartyTime testParty = new PartyTime();
    int expectedWord = 0;
    assertEquals(expectedWord, testParty.getPartyGuests());
  }

  @Test
  public void setPartyFood_TypeOfFood_GuestFood(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "Tacos";
    assertEquals(expectedWord, testParty.setPartyFood("Tacos"));
  }

  @Test
  public void getPartyFood_TypeOfFood_GuestFood(){
    PartyTime testParty = new PartyTime();
    String expectedWord = "";
    assertEquals(expectedWord, testParty.getPartyFood());
  }

}