import java.util.List;
import java.util.ArrayList;
import java.util.Random;

//Party Class
public class PartyTime {

  //mVaribles
  private String    mTitle = "";
  private int       mGuests = 0;
  private String    mFood = "";

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
}