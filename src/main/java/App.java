import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();
    PartyTime newPartyEvent = new PartyTime();

    System.out.println("Welcome to Party Planner");
    String userPartyName = console.readLine("Please Enter The Name of Your Event:\n");
    newPartyEvent.setPartyTitle(userPartyName);
    String userGuests = console.readLine("Please Enter How Many Guests You Will Be Inviting?\n");
    newPartyEvent.setPartyGuests(userGuests);

    System.out.println("Cost to Party: "+newPartyEvent.partyCost());

  }

}