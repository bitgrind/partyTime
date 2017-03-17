import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Party Class
public class PartyTime {

  //mVaribles
  private String    mTitle = "PartyTest";
  private Integer   mCost = 0;
  private Integer   mGuests = 5;
  private String    mFood = "";
  private String    mDrink = "";
  private String    mEntertainment = "";
  private String    mDiscount = "";

  //Methods
  public Integer partyCost() {
    Integer cost = 0;
    Integer foodMultiplier = 0;

    if(mFood != "") {
      //setting foodMultiplier to type of Entree
      if(mFood.equals("fingerfood")){
        foodMultiplier = 5;
      } else if (mFood.equals("oneEntree")) {
        foodMultiplier = 15;
      } else if (mFood.equals("fullEntree")) {
        foodMultiplier = 30;
      }
    }

    if(mGuests > 0){
      for(int i = 0; i < mGuests; i++){
        //5 dollars for each guest this is starting price
        //foodMultiplier is how much additional the food will cost per guest
        cost += 5 + (foodMultiplier);
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

  public int setPartyGuests(int guests){
    mGuests = guests;
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

  public int getPartyGuests(){
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