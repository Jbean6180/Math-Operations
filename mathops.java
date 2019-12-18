//TO DO:  Import the Scanner class.
import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    //TO DO:  Declare variables for user input, quarters, dimes, nickels, pennies, and total.
    int userInput;
    double quarters;
    double dimes;
    double nickels;
    double pennies;
    double total;
    //TO DO:  Create a Scanner object.
     Scanner myScanner = new Scanner(System.in);
    //TO DO:  Prompt the user to enter the number of quarters they have.
    System.out.print("Please enter the number of quarters you have:");
    //TO DO:  Store their answer in the user input variable you created earlier.
    userInput = myScanner.nextInt();
    //TO DO:  Calculate the amount of change and store it in the quarters variable.
    quarters = userInput * .25;
    //TO DO:  Prompt the user to enter the number of dimes they have.
    System.out.print("Please enter the number of dimes you have:");
    //TO DO:  Store their answer in the user input variable you created earlier.
    userInput = myScanner.nextInt();
    //TO DO:  Calculate the amount of change and store it in the dimes variable.
    dimes = userInput * .10;
    //TO DO:  Prompt the user to enter the number of nickels they have.
    System.out.print("Please enter the number of nickels you have:");
    //TO DO:  Store their answer in the user input variable you created earlier.
    userInput = myScanner.nextInt();
    //TO DO:  Calculate the amount of change and store it in the nickels variable.
    nickels = userInput * .05;
    //TO DO:  Prompt the user to enter the number of pennies they have.
    System.out.print("Please enter the number of pennies you have:");
    //TO DO:  Store their answer in the user input variable you created earlier.
    userInput = myScanner.nextInt();
    //TO DO:  Calculate the amount of change and store it in the pennies variable.
    pennies = userInput * .01;
    //TO DO:  Using the value from quarters, dimes, nickels, and pennies variables, calculate the user's total.
    total = quarters + dimes + nickels + pennies;
    //TO DO:  Print out the user's total (i.e. "Your total in dollars is $").
    System.out.print("Your total in dollars is $");
    
    //DO NOT DELETE THE LINE OF CODE BELOW
    System.out.printf("%.2f", total);
    
    
    
    
  }
}
