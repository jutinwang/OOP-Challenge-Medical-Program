package Program;
/**
  *This class is assosiated with the filter class. It will initalize and *set the value of 4 variables with the answers to follow up filter *questions from the main class
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-10-28
**/
public class details{
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //These are the variables that will hold the answers to the filter follow up questions
  private String meat;//This one will hold which meat the user ate last
  private String continent;//This one will hold which continent the user went to last
  private String weather;//This one will hold the weather the last time the user went out
  private int numbOfPeople;//This one will hold the number of people they last came in contact with
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/**
  *The constructor will call on 4 mutator, 1 for each variable to set *the value of the variables declared above to the values we set in the *main method. This constructor will be called from the filter class
  *
  *
  *@param raw This holds your response to which meat did you eat last
  *@param place This holds the continent that you went to recently
  *@param outside This holds the weather of the last time you went *outside 
  *@param peopletouched This holds the amount of people you came into *close contact with
**/
  public details (String meat, String continent, String weather, int numbOfPeople){
    this.setmeat(meat);//Calls on meat mutator
    this.setcontienet(continent);//calls on continent mutator
    this.setweather(weather);//calls on weather mutator
    this.setnumbOfPeople(numbOfPeople);//calls on the numbofpeople mutator
  }

  /**
  *This accesor is used to access the private String meat declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getmeat(){
    return meat;
  }

  /**
  *This accesor is used to access the private String continent declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getcontinent(){
    return continent;
  }

  /**
  *This accesor is used to access the private String weather declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getweather(){
    return weather;
  }

  /**
  *This accesor is used to access the private String numbOfPeople *declared above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public int getnumbOfPeople(){
    return numbOfPeople;
  }

  /**
  *This mutator is used to set the value of meat to the newmeat(which *contains the answer to the filter question from main)
  *
  *@param newmeat This contains the answer to the meat followup question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setmeat(String newmeat){
    meat = newmeat;
  }
  /**
  *This mutator is used to set the value of continent to the *newcontienet (which contains the answer to the filter question from *main)
  *
  *@param newcontienet This contains the answer to the travel followup *question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setcontienet (String newcontienet){
    continent = newcontienet;
  }
  /**
  *This mutator is used to set the value of weather to the newweather 
  *(which contains the answer to the filter question from main)
  *
  *@param newweatherThis contains the answer to the weather followup *question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setweather(String newweather){
    weather = newweather;
  }
  /**
  *This mutator is used to set the value of numbOfPeople to the *newnumberOfPeople(which contains the answer to the filter question *from main)
  *
  *@param newnumbOfPeople This contains the answer to the contact *followup question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setnumbOfPeople (int newnumbOfPeople){
    numbOfPeople = newnumbOfPeople;
  }
}
