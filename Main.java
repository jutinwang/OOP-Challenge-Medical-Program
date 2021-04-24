//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//These are some import statements. These statements will allow use to access the classes that are in the file. The name of each program is after the Program.
import Program.contactrelated;//This is to access the class "contactrelated"
import Program.details;//This is to access the class "details"
import Program.disease;//This is to access the class "disease"
import Program.filter;//This is to access the class "filter"
import Program.foodrelated;//This is to access the class "foodrelated"
import Program.healthrelated;//This is to access the class "healthrelated"
import Program.travelrelated;//This is to access the class "travelrelated"
import Program.weatherrelated;//This is to access the class "weatherrelated"
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
/**
  *The main class will ask you to input your symptoms, answer some *filter questions and then print out your diagnosis after calling many *classes
  *
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-10-28
**/
import java.util.Scanner;//This allows use to get statements
class Main {
    public static String food;//This will hold you answer for the food related question
    public static String travel;//This will hold your answer for the travel related question
    public static String dress;//This will hold your answer for how well you dressed outside question
    public static String health;//This will hold your answer for how healthy you've been 
    public static String contact;//This will hold your answer for if you've been in contact with people question
    public static String mes;//This string allows us to use what was returned from the disease class
    public static String raw;//This variable will hold the answer to the raw meat follow up question
    public static String place;//This variable will hold the answer to the places traveled follow up question
    public static String outside;//This variable will hold the answer to the weather follow up question
    public static int peopletouched;//This variable will hold the answer to the amount of people touched follow up question
  
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    //Variables:
    //These 5 variables are for holding your symptoms that you will input
    String symptom1;
    String symptom2;
    String symptom3;
    String symptom4;
    String symptom5;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //This is the array that holds all the possbile symptoms that you could input
    String symptoms [] = {"Fever", "Headache", "Cough","Difficult breathing","Vomiting","Diarrhoea", "Pains", "Cramps", "Loss of appetite", "rapid heartbeat", "muscle aches"};
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    System.out.println("Hello, welcome to the disease tracker and information program.");//This outputs a friendly hello message
    
      for (int x = 0; x < symptoms.length; x ++){//This for loop prints everthing in the array (which is all the possible symptoms)
        System.out.println (symptoms[x]);//this is the print statement to print the value of symptom at x position
      }
      System.out.println ("List 5 of your most common symptoms:");//This prompts the user to input their 5 symptoms
      symptom1 = input.nextLine();//This is where you input symptom 1
      symptom2 = input.nextLine();//This is where you input symptom 2
      symptom3 = input.nextLine();//This is where you input symptom 3
      symptom4 = input.nextLine();//This is where you input symptom 4
      symptom5 = input.nextLine();//This is where you input symptom 5

      info();//This calls on a method called info. The method will ask 5 questions like if you've been in contact with a lot of people etc, and it will be used to filter out what possible diseases can be hands

      disease d1 = new disease(symptom1, symptom2, symptom3, symptom4, symptom5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This is an object. This will call on a constructor in the disease.java class that has a parameter of 5 strings.
      mes = d1.toString();

      //This is the switch statement that will output what illnesses you might have. The output depends on the mes variable. If the case matches the mes, it will call on the class's parameter for the specific type of illness (food related, travel, contact, bad dress or unhealthy). It also has 2 options for being totally safe or at super risk
      switch (mes){
        case "Food related":
        foodrelated f1 = new foodrelated (symptom1, symptom2, symptom3, symptom4, symptom5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This will call on the constructor in the foodrelated class as the disease was determined to be food related
        System.out.println (f1);//This prints out your diagnosis
        break;

        case "Travel related":
        travelrelated t1 = new travelrelated (symptom1, symptom2, symptom3, symptom4, symptom5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This will call on the constructor in the travelrelated class as the disease was determined to be contracted during travels
        System.out.println (t1);//This prints out your diagnosis
        break;

        case "Bad dress related":
        weatherrelated w1 = new weatherrelated (symptom1, symptom2, symptom3, symptom4, symptom5, food, travel, dress, health, contact, raw, place, outside, peopletouched); //This will call on the constructor in the bad dress related class because the disease was determined to be from being poorly dressed
        System.out.println (w1);//This prints out your diagnosis
        break;

        case "Contact related":
        contactrelated c1 = new contactrelated (symptom1, symptom2, symptom3, symptom4, symptom5, food, travel, dress, health, contact, raw, place, outside, peopletouched);//This will call on the constructor in the contact related class because the disease was determined to be contracted from contact with people
        System.out.println (c1);//This prints out your diagnosis
        break;

        case "Unhealthy related":
        healthrelated h1 = new healthrelated (symptom1, symptom2, symptom3, symptom4, symptom5, food, travel, dress, health, contact, raw, place, outside, peopletouched); //This will call the constructor from the unhealthy class
        System.out.println (h1);//This prints out your diagnosis
        break;

        case "safe":
        System.out.println ("Based on your answers, you shouldn't have any major illnesses. See a doctor if you don't feel like our diagnosis is correct");//This will print out saying that you shouldn't have a disease as you answered no to all the filter questions
        break;

        case "risk":
        System.out.println ("You potentially have a wide range of illnesses that we can't accurately diagnosis. Please see a doctor at once.");//This will print that you might have a multitude of diseases that the program can't determine specifically
        break;
      }
  }

  /**
  *This method is used to gather additional info on the user using the *program so it can filter out what diseases the user might be *experiencing
  *
  *
  *@Author Justin Wang
  *@Version 2.0
  *@Since 2020-11-4
  **/
  public static void info (){//This is the info method, it will ask questions to filter out your illness in the filter class
    Scanner input = new Scanner (System.in);

    //These are the filter questions that will help isolate what potential illnesses you have. The user will input y or n for their answer
    System.out.println ("Have you eaten food that could've been undercooked or come from a fast food chain?(y/n)");//This is the first question which asks about if you've eaten undercooked or fastfood food
    food = input.nextLine();//This is where the user inputs their response

    //This will ask you what meat did you eat last to give you a diagnosis later on
    if (food.equalsIgnoreCase("y")){//only asks if you answered yes to the question above
      System.out.println ("What meat were did you last eat before you got ill?(beef, chicken, pork, fish)");
      raw = input.nextLine();//This is where you input
    }else{
      raw = "na";//This sets the value of raw to na if your answer was no
    }

    System.out.println ("Have you been outside of Canada recently either on vacation or for buisness? (y/n)");//This question asks about if you've been outside of canada(have you been travelling)
    travel = input.nextLine();

    //This will ask what continent you last visited.
    if (travel.equalsIgnoreCase("y")){//only asks if you answered yes to the question above
      System.out.println ("Where did you go outside of Canada (please name which continent)?");
      place = input.nextLine();//This is where you input
    }else{
      place = "na";//This sets place to na if you answered no 
    }

    System.out.println ("Have you been improperly properly dressed for the weather lately? (y/n)");//This question asks if you've been properly dressing for weather
    dress = input.nextLine();

    //This will ask you what the weather was outside to determine what illness you might have 
    if (dress.equalsIgnoreCase("y")){//only asks if you answered yes to the question above
      System.out.println ("What was the weather like (cold, windy, rain, snow, hot)?");
      outside = input.nextLine();//This is where you input
    }else{
      outside = "na";
    }

    //This question doesn't have a follow up
    System.out.println ("Have you been eating unhealthy or not exercising? (y/n)");//This question asks if you've been eating healthy and exercising
    health = input.nextLine();//This is where you input

    System.out.println ("Have you made contact with strangers recently (hugs, handshakes, holding hands etc.)? (y/n)");//This question asks if you've made contact with people recently
    contact = input.nextLine();//This is where you input

    //This follow up will ask for a number, the number of people you came in contact with
    if (contact.equalsIgnoreCase("y")){//only asks if you answered yes to the question above
      System.out.println ("About how many people did you come in contact with?");
      peopletouched = input.nextInt();//This is where you input
    }else{
      peopletouched = 0;//sets number to 0
    }

    filter f1 = new filter (food, travel, dress, health, contact, raw, place, outside, peopletouched);//This calls the constructor in filter (which is the main class)
  }
} 
