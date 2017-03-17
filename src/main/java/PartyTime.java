import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Party Class
public class PartyTime {

  //mVaribles
  private String    mTitle = "PartyTest";
  private Double    mCost = 0.00;
  private Integer   mGuests = 0;
  private String    mFood = "";
  private String    mDrink = "";
  private String    mEntertainment = "";
  private String    mDiscount = "";

  //Methods
  public Double partyCost() {
    Double cost = 0.00;
    Double foodMultiplier = 0.0;
    Double drinkMultiplier = 0.0;

    if(mFood != "") {
      mFood.toLowerCase();
      //setting foodMultiplier to type of Entree
      if(mFood.equals("finger food")){
        foodMultiplier = 5.0;
      } else if (mFood.equals("one entree")) {
        foodMultiplier = 15.0;
      } else if (mFood.equals("full entree")) {
        foodMultiplier = 30.0;
      } else {
        foodMultiplier = 0.0;
      }
    }

    if(mDrink != "") {
      mDrink.toLowerCase();
      //setting foodMultiplier to type of Entree
      if(mDrink.equals("two")){
        drinkMultiplier = 5.0;
      } else if (mDrink.equals("four")) {
        drinkMultiplier = 15.0;
      } else if (mDrink.equals("full bar")) {
        drinkMultiplier = 30.0;
      } else {
        drinkMultiplier = 0.0;
      }
    }

    if(mEntertainment != "") {
      mEntertainment.toLowerCase();
      //setting foodMultiplier to type of Entree
      if(mEntertainment.equals("magician")){
        cost += 50;
      } else if (mEntertainment.equals("dj")) {
        cost += 200;
      } else if (mEntertainment.equals("full band")) {
        cost += 500;
      } else {
        cost += 0;
      }
    }

    if(mDiscount != "") {


      //setting foodMultiplier to type of Entree
      if(mDiscount.equals("paperAd")){
        cost -= 50;
      } else if (mDiscount.equals("onlineAd")) {
        cost -= 100;
      } else if (mDiscount.equals("friendDiscount")) {
        //giving a 20% discount for friends
        double coupon = 1.0 * cost;
        double percentage = 0.20;
        double savings = 0.0;
        cost -= savings;
      } else {
        cost += 0;
      }
    }

    if(mGuests > 0){
      for(int i = 0; i < mGuests; i++){
        //5 dollars for each guest this is starting price
        //foodMultiplier is how much additional the food will cost per guest
        cost += 5 + foodMultiplier + drinkMultiplier;
      }
    }

    mCost = cost;
    return mCost;
  }

  //SETTERS
  public String setPartyTitle(String title){
    mTitle = title;
    return mTitle;
  }

  public Integer setPartyGuests(String guests){
    mGuests = mGuests.parseInt(guests);
    return mGuests;
  }

  public String setPartyFood(String foodType){
    mFood = foodType;
    return mFood;
  }

  public String setPartyDrink(String drinkType){
    mDrink = drinkType;
    return mDrink;
  }

  public String setPartyEntertainment(String entertainmentType){
    mEntertainment = entertainmentType;
    return mEntertainment;
  }

  public String setPartyDiscount(String discountType){
    mDiscount = discountType;
    return mDiscount;
  }

  //GETTERS
  public String getPartyTitle(){
    return mTitle;
  }

  public Integer getPartyGuests(){
    return mGuests;
  }

  public String getPartyFood(){
    return mFood;
  }

  public String getPartyDrink(){
    return mDrink;
  }

  public String getPartyEntertainment(){
    return mEntertainment;
  }

  public String getPartyDiscount(){
    return mDiscount;
  }
}