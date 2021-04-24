package Program;
/**
  *This child class is called when the filters have determined that you *have contracted an illness from raw food. It will print what symptoms *you input and then return a diagnosis based on what you answered in *the clarification question
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-10-28
**/
public class foodrelated extends disease{//This inherites from the parent class

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
  public foodrelated (String s1, String s2, String s3, String s4, String s5, String food , String travel, String dress, String health, String contact, String raw, String place, String outside, int peopletouched){
    super (s1, s2, s3, s4, s5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This allows us to call the constructor from the parent class
    this.displayinfo();// This calls on the method to print your info
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
  *This method sets the value of conclusion based what meat products you *ate last. Your options are beef, chicken, pork or fish.
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void result(){
    switch (getfacts().getmeat()){
      case "beef":
      conclusion = "While eating raw beef won't kill you, the way it was handled might be harmful. Most likely, the beef might have e coli caused by contamination during the slaughtering process. No need for alarm, rest, take proper medication and see a hospital if it gets bad";
      break;

      case "chicken":
      conclusion = "If your chicken wasn't properly cooked, you might have salmonella. This is common in raw chicken consumption. Other illnesses you might have are campylobacter or clostridium perfringens. This is not serious, you can recover after a long rest and medicine. See a doctor if you get worse";
      break;

      case "pork":
      conclusion = "Eating undercooked pork might give you trichinosis, a parasite which lives in your small intestine for a few weeks. This can be easily treated with medication. If you ate your pork in asia or africa, be aware of pork tapeworm.";
      break;

      case "fish":
      conclusion = "If you're feeling sick after eating fish, you might have CFP or ciguatera. This is a toxin that can last for a few days or months.";
      break;
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
