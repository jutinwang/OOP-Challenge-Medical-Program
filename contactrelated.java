package Program;
/**
  *This child class is called when the filters have determined that you *have contracted a contact illness. It will print what symptoms you *input and then return a diagnosis based on what you answered in the *clarification question
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-10-28
**/
public class contactrelated extends disease{//This inherites info from the disease parent class
  private static String conclusion;//This initializes the conclusion variable

  /**
  *This constructor is used call mutators to set the values of 5 *variables with whatever the user has inputted
  *
  *
  *@param s1 This is holds the user's first inputted symptom
  *@param s2 This is holds the user's second inputted symptom 
  *@param s3 This is holds the user's third inputted symptom
  *@param s4 This is holds the user's fourth inputted symptom
  *@param s5 This is holds the user's fifth inputted symptom 
  *@param food This holds your answer to food question
  *@param travel This holds your answer to travel question
  *@param dress This holds your answer to dress question
  *@param health This holds your answer to health question
  *@param contact This holds your answer to contact question
  *@param raw This holds your response to which meat did you eat last
  *@param place This holds the continent that you went to recently
  *@param outside This holds the weather of the last time you went *outside 
  *@param peopletouched This holds the amount of people you came into *close contact with
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public contactrelated (String s1, String s2, String s3, String s4, String s5, String food , String travel, String dress, String health, String contact, String raw, String place, String outside, int peopletouched){
    super (s1, s2, s3, s4, s5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This allows us to call the constructor from the parent class
    this.result();//This calls the mutator
  }

  /**
  *This method will display the symptoms you input just as a friendly *reminder in case you forgot
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void displayinfo(){
    System.out.println ("Here are the symptoms:");
    //These 5 print statements will print your symptoms in the order you input them
    System.out.println ("Symptom 1 : " + getsymptom1());
    System.out.println ("Symptom 2 : " + getsymptom2());
    System.out.println ("Symptom 3 : " + getsymptom3());
    System.out.println ("Symptom 4 : " + getsymptom4());
    System.out.println ("Symptom 5 : " + getsymptom5());
  }

  /**
  *This accesor allows you to access the private variable conclusion
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getconclusion(){
    return conclusion;
  }

  /**
  *This method sets the value of conclusion based on the number of people you been in contact with. It contains options for if you've touched less than or equal to 10, greater or equal to 11 and less than 50 and greater than or equal to 51
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void result(){
    if (getfacts().getnumbOfPeople() <= 10){//This is the message that will print if you touched less than or equal to 10 people
      conclusion = "You were unlucky in getting an illness from being in contact with few people but it happens. It's most likely flu and you should recover quite soon. If not, see a doctor immediatly";
    }else if (getfacts().getnumbOfPeople() >= 11 && getfacts().getnumbOfPeople() <= 50){//This is the message that will print if you touched greater or equal to 11 and less than or equal to 50
      conclusion = "It is quite common to catch diseases by being in contact with so many people. Their could be a wide range of illnesses that you could have but generally, you should stay at home, rest and recover to contain the spread.";
    }else if (getfacts().getnumbOfPeople() >= 51){//This is the message that will print if the touched more or equal to 51 people
      conclusion = "The amount of people that you made contact with will make it hard to judge what specifically you have. However, the best advice we can give is to stay home, rest and visit a doctor to be further diagnosised";
    }
  }
  /**
  *This method will return the diagnosis in a readable format to the *main class to be printed
  *
  *@return conclusion
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  @Override
  public String toString(){
    return conclusion;
  }
}
