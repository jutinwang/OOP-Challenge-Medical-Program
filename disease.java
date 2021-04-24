package Program;
/**
  *This class will inherite the filter statement from the previous class *and further isolate what illnesses you have based on your inputted *symptoms. This will then be sent back to the main class and it will *call on a child class to diagnosis you
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
**/
public class disease extends filter{
  //These are the variables that will be used
  private String symptom1;//This stores the first inputted symptom
  private String symptom2;//This stores the second inputted symptom
  private String symptom3;//This stores the third inputted symptom
  private String symptom4;//This stores the fourth inputted symptom 
  private String symptom5;//This stores the fifth inputted symptom
  private String message;//This stores the final diagnosis and outputs what the program thinks you have
  private static int counter;//This is the first counter that will count matching symptoms
  private static int counter2;//This is the second counter that will count matching symptoms. It will be used to compare with counter1
  private String tester [] = new String [5]; //This is the array that will hold all the symptoms. This will help find the matching illness

  /**
  *This constructor is used to call mutators to set the values of the *private variables at the start of the program
  *
  *
  *@param s1 This is holds the user's first inputted symptom
  *@param s2 This is holds the user's second inputted symptom 
  *@param s3 This is holds the user's third inputted symptom
  *@param s4 This is holds the user's fourth inputted symptom
  *@param s5 This is holds the user's fifth inputted symptom 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public disease (String s1, String s2, String s3, String s4, String s5, String food , String travel, String dress, String health, String contact, String raw, String place, String outside, int peopletouched){
    super (food, travel, dress, health, contact, raw, place, outside, peopletouched);
    this.setsym1(s1);//This calls the mutator for the first symptom
    this.setsym2(s2);//This calls the mutator for the second symptom
    this.setsym3(s3);//This calls the mutator for the third symptom
    this.setsym4(s4);//This calls the mutator for the fourth symptom
    this.setsym5(s5);//This calls the mutator for the fifth symptom
    this.setcounter();//This calls the mutator for the first counter
    this.setcounter2();//This calls the mutator for the second counter
    this.disease(s1, s2, s3, s4, s5);//This calls the mutator to give the array values
    this.setmessage();//This will call the mutator for the message, to set the diagnosis
  }
  //These are the accesors, they allow us to use each of our private variables

  /**
  *This method is used to access the private String symptom1 declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getsymptom1(){
    return symptom1;
  }

  /**
  *This method is used to access the private String symptom2 declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getsymptom2(){
    return symptom2;
  }

  /**
  *This method is used to access the private String symptom3 declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getsymptom3(){
    return symptom3;
  }

  /**
  *This method is used to access the private String symptom4 declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getsymptom4(){
    return symptom4;
  }

  /**
  *This method is used to access the private String symptom5 declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getsymptom5(){
    return symptom5;
  }

  /**
  *This method is used to access the private array tester declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String[] getarray(){
    return tester;
  }

  /**
  *This method is used to access the private int getcounter declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public int getcounter(){
    return counter;
  }

  /**
  *This method is used to access the private int getcounter2 declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public int getcounter2(){
    return counter2;
  }

  /**
  *This method is used to access the private String getmessage declared *above 
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public String getmessage(){
    return message;
  }
//~~~~~~~~~~~~~~~~~These are the mutators, they will give each symptom variable the symptom inputted from the main class~~~~~~~~~~~~~~~~~~~~~~~~

  /**
  *This mutator is used to set the value of a variable with whatever the *user input in the main class
  *
  *@param mal1 This contains the first symptom
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setsym1(String mal1){
    symptom1 = mal1;//This is the mutator for the first symptom variable, it has the first symptom inputted from the user
  }

  /**
  *This mutator is used to set the value of a variable with whatever the *user input in the main class
  *
  *@param mal2 This contains the second symptom
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setsym2(String mal2){//This is the mutator for the second symptom variable, it has the second symptom inputted from the user
    symptom2 = mal2;
  }

  /**
  *This mutator is used to set the value of a variable with whatever the *user input in the main class
  *
  *@param mal3 This contains the third symptom
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setsym3(String mal3){
    symptom3 = mal3;//This is the mutator for the third symptom variable, it has the third symptom inputted from the user
  }

  /**
  *This mutator is used to set the value of a variable with whatever the *user input in the main class
  *
  *@param mal4 This contains the fourth symptom
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setsym4(String mal4){//This is the mutator for the fourth symptom variable, it has the fourth symptom inputted from the user
    symptom4 = mal4;
  }

  /**
  *This mutator is used to set the value of a variable with whatever the *user input in the main class
  *
  *@param mal5 This contains the fifth symptom
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setsym5(String mal5){
    symptom5 = mal5;//This is the mutator for the fifth symptom variable, it has the fifth symptom inputted from the user
  }

  /**
  *This mutator is used to set the value of each position in the array *with whatever the inputs the user gave and was stored in the mutators
  *
  *@param sy1 This has the first symptom inputted by the user
  *@param sy2 This has the second symptom inputted by the user
  *@param sy3 This has the third symptom inputted by the user
  *@param sy4 This has the fourth symptom inputted by the user
  *@param sy5 This has the fifth symptom inputted by the user
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void disease (String sy1, String sy2, String sy3, String sy4, String sy5){//This sets the value of each spot in the array with the corrisponding symptom
    tester[0] = sy1;//This stores symptom 1 in position 0
    tester[1] = sy2;//This stores symptom 2 in position 1
    tester[2] = sy3;//This stores symptom 3 in position 2
    tester[3] = sy4;//This stores symptom 4 in position 3
    tester[4] = sy5;//This stores symptom 5 in position 4
  }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /**
  *This mutator is used to set the value of a variable with a starting *value of 0
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setcounter(){
    counter = 0;//This sets the value of counter to 0
  }

  /**
  *This mutator is used to set the value of a variable with a starting *value of 0
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setcounter2(){
    counter2 = 0;//This sets the value of counter2 to 0
  }
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 /**
  *This mutator is used to set the value of a variable with a special *message based on multiple tests
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public void setmessage (){
      //This switch statement will use output as a variable to check which filters will be applied
      switch (getDiagnosis()){
        //This is what results if the filter is safe
        case "safe":
        message = "safe";//This will set the value of message to tell the user they don't seem to have a problem
        break;
        
        //This is what results if you're high risk
        case "high risk":
        message = "risk";//This will set the message to say that you might have a lot of various diseases/illnesses
        break;

        //This is the result if you only answer y to eating possibly raw food
        case "only food":
        message = "Food related";
        break;

        //This is what happens when you only answer y to being out of canada recently
        case "only travel":
        message = "Travel related";
        break;

        //This will result if you answered y to being badly dressed
        case "only dress":
        message = "Bad dress related";
        break;

        //This will result if you answered y to being unhealthy
        case "only health":
        message = "Unhealthy related";
        break;
        
        //This will result if you answered y to making contact with strangers
        case "only contact":
        message = "Contact related";
        break;

        //This is what happens when you answered y to traveling and getting food poisoning
        case "travel poison":
        for (int x = 0; x < tester.length; x++){//This for loop will look through the array 5 times checking to see if they match symptoms with a disease.

          if (tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("headache") || tester[x].equalsIgnoreCase("cramps") || tester[x].equalsIgnoreCase("loss of appetite")|| tester[x].equalsIgnoreCase("diarrhea")){//If any value in the array matches one of these symptoms, it will add 1 to the counter
            counter += 1 ;//This adds 1 to the counter

          }else if (tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("diarrhea") || tester[x].equalsIgnoreCase("vomiting") || tester[x].equalsIgnoreCase("pains") || tester[x].equalsIgnoreCase("headache")){//If any value in the array matches one of these symptoms, it will add 1 to the counter
            counter2 += 1;//This adds 1 to the second counter
          }
          if (counter > counter2){//If there are more symptoms that relate to salmonella than malaria, it will print this:
            message = "Food related";

          }else if (counter < counter2){//If there are more symptoms that relate to malaira than salmonella, it will print this:
            message = "Travel related";

          }else{//if the previous 2 conditions aren't met, it will print all possible illnesses
            message = "We were unable to determine you exact disease but we think you could have salmonella, e coli or malaria";
          }
        }
        break;

        //This will print if you answered y to traveling and making contact with people
        case "travel contact":
        for (int x = 0; x < tester.length; x++){//This for loop will look through the array 5 times checking to see if they match symptoms with a disease.

        //cold or flu
          if (tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("headache") || tester[x].equalsIgnoreCase("cough") || tester[x].equalsIgnoreCase("pains") || tester[x].equalsIgnoreCase("lost appetite")){//If any value in the array matches one of these symptoms, it will add 1 to the counter
            counter += 1 ;//This adds 1 to the first counter

          //malaria or yellow fever
          }else if (tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("diarrhea") || tester[x].equalsIgnoreCase("vomiting") || tester[x].equalsIgnoreCase("pains") || tester[x].equalsIgnoreCase("headache")){//If any value in the array matches one of these symptoms, it will add 1 to the counter
            counter2 += 1;//This adds 1 to the second counter
          }
          if (counter > counter2){//This sets the value of message to contact because the program has determined you have a contact illness
            message = "Contact related";

          }else if (counter < counter2){//This sets the value of message to travel as the program determined that you have a contact illness
            message = "Travel related";

          //This doesn't effect the program (no option for unknown illness in the program)
          }else{
            message = "We were unable to determine you exact disease but we think you could have flu or malaria";
          }
        }
        break;

        //This is what happens when you answered y to being unhealthy and eating raw food.
        case "unhealthy food":
        for (int x = 0; x < tester.length; x++){
          //heart disease
          if (tester[x].equalsIgnoreCase("difficult breathing") || tester[x].equalsIgnoreCase("rapid heartbeat") || tester[x].equalsIgnoreCase("pains")){//The program looks at all these symptoms and adds 1 to the counter if the symptoms match
            counter += 1 ;
            //E coli or salmonella
          }else if (tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("diarrhea") || tester[x].equalsIgnoreCase("cramps") || tester[x].equalsIgnoreCase("loss of appetite") || tester[x].equalsIgnoreCase("vomiting")){//The program looks at all these symptoms and adds 1 to the counter if the symptoms match
            counter2 += 1;
          }
          if (counter > counter2){//This will set the message to unhealthy related as the program determined that you have a disease from being unhealthy
            message = "Unhealthy related";

          }else if (counter < counter2){//This will set the message to food related as the program determined that you have a food related disease
            message = "Food related";
          
          //This doesn't effect the program (no option for unknown illness in the program)
          }else{
            message = "We were unable to determine you exact disease but we think it could be as bad as heart disease or e coli";
          }
        }
        break;
        
        //This is what happens when you answer y to being poorly dressed and being in contact with strangers
        case "dressed contact":
        for (int x = 0; x < tester.length; x++){
          //the cold
          if (tester[x].equalsIgnoreCase("muscle aches") || tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("cough") || tester[x].equalsIgnoreCase ("loss of appetite")){//The program looks at all these symptoms and adds 1 to the counter if the symptoms match
            counter += 1 ;
            //flu or cold
          }else if (tester[x].equalsIgnoreCase("fever") || tester[x].equalsIgnoreCase("diarrhea") || tester[x].equalsIgnoreCase("vomiting") || tester[x].equalsIgnoreCase("pains") || tester[x].equalsIgnoreCase("headache")){//The program looks at all these symptoms and adds 1 to the counter if the symptoms match
            counter2 += 1;
          }
          if (counter > counter2){//The program has determined that you have an illness relating to weather 
            message = "Bad dress related";

          }else if (counter < counter2){//This sets the value of message to contact because the program has determined you have a contact illness
            message = "Contact related";

          //This doesn't effect the program (no option for unknown illness in the program)
          }else{
            message = "We were unable to determine you exact disease but we think it could be flu or the cold";//This says that the program was unable to find what you exactly have and it says you might have a combo of illnesses
          }
        }
        break;

        
      }
  }

 /**
  *This method is used to return the value of message in a way that the *user can read it when its outputted
  *
  *@return message
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  @Override
  public String toString(){
    return message;//This returns your diagnosis
  }
}

