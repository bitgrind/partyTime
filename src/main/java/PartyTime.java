import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Party Class
public class PartyTime {

  //mVaribles
  private String    mTitle = "";
  private int       mGuests = 0;
  private String    mFood = "";
  private String    mDrink = "";
  private String    mEntertainment = "";
  private String    mDiscount = "";

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