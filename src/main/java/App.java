import java.io.Console;

public class App {

  public static void main(String[] args) {
    Console console = System.console();
    PartyTime newPartyEvent = new PartyTime();

    System.out.println("-------------------------------------------");
    System.out.println("Welcome to Party Planner");
    String userPartyName = console.readLine("Enter The Name of Your Event:\n");
    newPartyEvent.setPartyTitle(userPartyName);
    System.out.println("-------------------------------------------");
    String userGuests = console.readLine("How Many Guests You Will Be Inviting?\n");
    newPartyEvent.setPartyGuests(userGuests);

    System.out.println("-------------------------------------------");
    String userFood = console.readLine("Would you Like food?\nYes or No?");
    if(userFood.toLowerCase().equals("yes")){
      System.out.println("-------------------------------------------");
      userFood = console.readLine("What Food Would you Like?\nFinger Food or Single Entree or Full Entree?");
      newPartyEvent.setPartyFood(userFood);
    }

    System.out.println("-------------------------------------------");
    String userDrink = console.readLine("Would you Like Drinks?\nYes or No?");
    if(userDrink.toLowerCase().equals("yes")){
      System.out.println("-------------------------------------------");
      userDrink = console.readLine("How Many Drinks Would you Like per Guest?\nTwo or Four or Full Bar?");
      newPartyEvent.setPartyDrink(userDrink);
    }

    System.out.println("-------------------------------------------");
    String userEntertainment = console.readLine("Would you Like Entertainment?\nYes or No?");
    if(userEntertainment.toLowerCase().equals("yes")){
      System.out.println("-------------------------------------------");
      userEntertainment = console.readLine("What Kind of Entertainment?\nMagician or DJ or Full Band?");
      newPartyEvent.setPartyEntertainment(userEntertainment);
    }

    System.out.println("-------------------------------------------");
    String userDiscount = console.readLine("Where did you hear about us?\nPaper Ad or Online Ad or Friend?");
    newPartyEvent.setPartyDiscount(userDiscount);

    System.out.println("-------------------------------------------");
    System.out.println("Event Name: " + newPartyEvent.getPartyTitle());
    System.out.println("Guest Number: " + newPartyEvent.getPartyGuests());
    System.out.println("Type of Food: " + newPartyEvent.getPartyFood());
    System.out.println("Type of Drink: " + newPartyEvent.getPartyDrink());
    System.out.println("Type of Entertainment: " + newPartyEvent.getPartyEntertainment());
    System.out.println("Any Discounts?: " + newPartyEvent.getPartyDiscount());
    System.out.println("Cost to Party: $"+newPartyEvent.partyCost());
    System.out.println("-------------------------------------------");

  }

}