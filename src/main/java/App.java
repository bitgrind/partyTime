import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();
    PartyTime newPartyEvent = new PartyTime();

    System.out.println("Welcome to Party Planner");
    String userDifficulty = console.readLine("");


  }

}