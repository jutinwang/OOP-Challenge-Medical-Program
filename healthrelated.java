package Program;
/**
  *This child class is called when the filters have determined that you *have contracted a disease based on your bad health. It will print *what symptoms you input and then return a diagnosis based on what you *answered in the clarification question
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-10-28
**/
public class healthrelated extends disease{//This inherites from the parent class

  private static String conclusion;//This initializes the conclusion
  
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
  public healthrelated (String s1, String s2, String s3, String s4, String s5, String food , String travel, String dress, String health, String contact, String raw, String place, String outside, int peopletouched){
    super (s1, s2, s3, s4, s5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This allows us to call the constructor from the parent class
    this.displayinfo();// This calls on the method to print your info
    this.result();//This calls the mutator
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
  *This method will just set conclusion to say that you have health *related illnesses, that you have a bad life style and need to change *in order to prevent further serious illnesses.
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void result(){
    conclusion = "Due to your poor life style, it is possible that you have heart disease or possible an obesity related illness like diabettes. You need to change your life style and get the appropreate help from doctors.";
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
