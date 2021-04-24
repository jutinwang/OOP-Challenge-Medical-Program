package Program;
/**
  *This class will take your response to questions you answered in the *main class and create a filter statement that will be used in the *next class to isolate what illnesses you might have
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
**/
public class filter{//This is the beginning of the filter class

//~~~~~~~~~~~~~These are the variables for the class~~~~~~~~~~~~~~~~
  private String food;//This is the variable for holding the answer to the food poisoning question
  private String travel;//This is the variable for holding the answer to the outside travel question
  private String dress;//This is the variable for holding the answer to the question that asks if you dressed appropriate for weather
  private String health;//This is the variable for holding the answer to the general health related question
  private String contact;//This is the variable for holding the answer to the contact with other people question
  private String diagnosis;//This will store the diagnosis as a string
  private details facts;
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/**
  *This constructor is used call mutators to set the values of 5 *variables with whatever the user has inputted
  *
  *
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
  public filter (String food, String travel, String dress, String health, String contact, String raw, String place, String outside, int peopletouched){
    this.setfood(food);//This calls on the mutator to set the value of food with the answer to the question
    this.settravel(travel);//This calls on the mutator to set the value of travel with the answer to the question
    this.setdress(dress);//This calls on the mutator to set the value of dress with the answer to the question
    this.sethealth(health);//This calls on the mutator to set the value of health with the answer to the question
    this.setcontact(contact);//This calls on the mutator to set the value of contact with the answer to the question
    this.setdiagnosis();
    facts = new details(raw, place, outside, peopletouched);

  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
  *This method is used to access the private String food declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getFood(){//This is the accesor for the food variable
    return food;
  }
  /**
  *This method is used to access the private String travel declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getTravel(){//This is the accesor for the travel variable
    return travel;
  }
  /**
  *This method is used to access the private String dress declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getDress(){//This is the accesor for the dress variable
    return dress;
  }
  /**
  *This method is used to access the private String health declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getHealth(){//This is the accesor for the health variable
    return health;
  }
  /**
  *This method is used to access the private String contact declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getContact(){//This is the accesor for the contact variable
    return contact;
  }
  /**
  *This method is used to access the private String diagnosis declared 
  *above 
  *
  *@Author Justin Wang
  *@Version 1.0
  *@Since 2020-11-4
  **/
  public String getDiagnosis(){
    return diagnosis;
  }
  public details getfacts(){
    return facts;
  }


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  
/*~~~~~~~~~~~~~~~~~~~~~~~~These are the mutators~~~~~~~~~~~~~~~~~~~~~~~~~
These mutators will set the value of each variable based on what you answered in the filter quiz. If the value is not y or n, it will set the answer to n by default
*/

  /**
  *This mutator is used to check the value of the user's input in the *main class. If it doesn't match either y or n, it will set the value *of food to n. Otherwise, it will set the value of food to whatever *the user inputted 
  *
  *@param newfood This parameter contains the user's answer to the food *question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setfood(String newfood){
    if (!(newfood.equalsIgnoreCase("y")) && (!(newfood.equalsIgnoreCase("n")))){//This if checks the value of newfood and sets the value to n if newfood != y or n
      food = "n";//This sets the value of food to n
    }else{//If everything is ok, it will set the value of food to newfood
      food = newfood;
    }
  }

  /**
  *This mutator is used to check the value of the user's input in the *main class. If it doesn't match either y or n, it will set the value *of travel to n. Otherwise, it will set the value of travel to *whatever the user inputted 
  *
  *@param newtravel This parameter contains the user's answer to the *travel question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void settravel(String newtravel){
    if (!(newtravel.equalsIgnoreCase("y")) && (!(newtravel.equalsIgnoreCase("n")))){//This if checks the value of newtravel and sets the value to n if newtravel != y or n
      travel = "n";//This sets the value of travel to n
    }else{//If everything is ok, it will set the value of travel to newtravel
      travel = newtravel;
    }
  }

  /**
  *This mutator is used to check the value of the user's input in the *main class. If it doesn't match either y or n, it will set the value *of dress to n. Otherwise, it will set the value of dress to whatever *the user inputted 
  *
  *@param newdress This parameter contains the answer to the dress *question
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setdress(String newdress){
    if (!(newdress.equalsIgnoreCase("y")) && (!(newdress.equalsIgnoreCase("n")))){//This if checks the value of newdress and sets the value to n if newdress != y or n
      dress = "n";//This sets the value of dress to n
    }else{//If everything is ok, it will set the value of dress to newdress
      dress = newdress;
    }
  }

  /**
  *This mutator is used to check the value of the user's input in the *main class. If it doesn't match either y or n, it will set the value *of health to n. Otherwise, it will set the value of health to *whatever the user inputted 
  *
  *@param newhealth This parameter conatins the answer to the healthy *question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void sethealth(String newhealth){
    if (!(newhealth.equalsIgnoreCase("y")) && (!(newhealth.equalsIgnoreCase("n")))){//This if checks the value of newhealth and sets the value to n if newhealth != y or n
      health = "n";//This sets the value of health to n
    }else{//If everything is ok, it will set the value of health to newhealth
      health = newhealth;
    }
  }
  
  /**
  *This mutator is used to check the value of the user's input in the *main class. If it doesn't match either y or n, it will set the value *of contact to n. Otherwise, it will set the value of contact to *whatever the user inputted 
  *
  *@param newcontact This parameter contains the answer contact question
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setcontact(String newcontact){
    if (!(newcontact.equalsIgnoreCase("y")) && (!(newcontact.equalsIgnoreCase("n")))){//This if checks the value of newcontact and sets the value to n if newcontact != y or n
      contact = "n";//This sets the value of contact to n
    }else{//If everything is ok, it will set the value of contact to newcontact
      contact = newcontact;
    }
  }
  
/**
  *This mutator is used to set the value of diagnosis with a special *message. This message will then be printed into a txt file to be used *in the disease class program/check
  *
  *
  *@Author Justin Wang
  *@Version 1.0
  *@Since 2020-11-4
  **/
  public void setdiagnosis (){
    //If you answered no to all the test question
    if (food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("n")){
      diagnosis = "safe";

   
   //This is what happens when you answer yes to all the questions
  }else if (food.equalsIgnoreCase("y") && travel.equalsIgnoreCase("y") && dress.equalsIgnoreCase("y") && health.equalsIgnoreCase("y") && contact.equalsIgnoreCase("y")){
    diagnosis = "high risk";

  //This will happen if you answer yes to only the food question
  }else if (food.equalsIgnoreCase("y") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("n")){
      diagnosis = "only food";
     
  //This is what happens if you only answer yes to the travel question
  }else if (food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("y") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("n")){
      diagnosis = "only travel";//This sets the value of diagnosis to only travel

  //This is the outcome for if you answered yes to only the dress question
  }else if (food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("y") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("n")){
      diagnosis = "only dress";//This sets the value of diagnosis to only dress
  

  //This if happens if you answered yes to only the health question
  }else if (food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("y") && contact.equalsIgnoreCase("n")){

      diagnosis = "only health";//This sets the value of diagnosis to only health

  //This is what happens when you answer yes to only the contact question
  }else if(food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("y")){
 
      diagnosis = "only contact";//This sets the value of diagnosis to only contact

    //That was the end of the single answer outcomes
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//This is the start of double answer results

//This is the "getting food poison while on vacation" path
  }else if(food.equalsIgnoreCase("y") && travel.equalsIgnoreCase("y") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("n")){

      diagnosis = "travel poison";//This stores the value of diagnosis as travel poison

  //This is the "you made contact with strangers during travels" path
  }else if(food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("y") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("y")){
 
      diagnosis = "travel contact";//This sets the value of diagnosis to travel contact


  //This is the "eating unhealthy raw food" path
  }else if(food.equalsIgnoreCase("y") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("n") && health.equalsIgnoreCase("y") && contact.equalsIgnoreCase("n")){
      diagnosis = "unhealthy food";//This sets the value of diagnosis to unhealthy food


  //this is the "poorly dressed and made contact with strangers" path
  }else if(food.equalsIgnoreCase("n") && travel.equalsIgnoreCase("n") && dress.equalsIgnoreCase("y") && health.equalsIgnoreCase("n") && contact.equalsIgnoreCase("y")){

      diagnosis = "dressed contact";//This sets the value of diagnosis as dressed contact
    }
  }
  /**
  *This method is used to return the value of diagnosis in a way that *the user can read it when its outputted
  *
  *@return diagnosis
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  @Override
  public String toString(){
      return diagnosis;
    }
}
