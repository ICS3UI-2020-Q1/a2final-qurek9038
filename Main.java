import java.util.Scanner;
/** 
 *This program asks the user what the diameter of the pizza they are purchasing, in cm. The program will then calculate the subtotal, the taxes, and the grand total. Lastly the program will output a message depending on the pizza size.
 * @author Khazina Qureshi
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //Create a scanner for user input 
    Scanner input = new Scanner (System.in);

    //Determining variables
    //Subtotal variable 
    double subtotal;

    //Fee for the amount of power to run the oven per pizza
    double powerFee = 0.99;

    //Fee for labour per pizza
    double labourFee = 0.75;

    //Fee for diameter in cm per pizza
    double constantFee = 0.50;

    //Variable for taxes
    double tax;

    //Variable for grand total
    double total;

    //Asking the user for size of pizza in cm 
    System.out.println("What is the size of pizza " + "(in cm)" + (":"));

    //User input 
    int pizzaSize = input.nextInt();

    //Calculating subtotal
    subtotal = labourFee + powerFee + (pizzaSize*constantFee);

    //Displaying subtotal to user 
    System.out.println("Subtotal:" + " $" + subtotal);

    //Calculating tax
    tax = subtotal*0.13;

    //Displaying tax to user
    System.out.println("Taxes:" + " $" + tax);

    //Calculating final total
    total = tax + subtotal;

    //Displaying the grand total to user
    System.out.println("Total:" + " $" + total);

    //Responses that will display based on the diameter of the pizza 
    if (pizzaSize >1 && pizzaSize <20){
      System.out.println("We are going to make you a cute little pizza!");
    }
    if (pizzaSize >20 && pizzaSize <40){
      System.out.println("This will be delicious!");
    }
    if (pizzaSize >40){
      System.out.println("Woah, big pizza! You might need a truck to get this home!");
    }

    
  }
}
