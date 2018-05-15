import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nicholas.keller302
 */
public class Calculator {

    static Scanner scanner = new Scanner(System.in);
    int operations = 0;

    public Calculator() {
        //Start program by welcoming user
        System.out.println("***Welcome to Nicks Calculator***\n");
        
        System.out.print("Please enter your math equations or \":e\" to exit: ");
        String userInput = scanner.nextLine(); //Get the equation
       
        while (!userInput.matches(":e")) { //If the user typed :e then end the program
             
            //Get answer from input string and return it
             float answer = calculateEquation(userInput); 
             System.out.println(userInput + " = " + answer);
             System.out.print("Please enter your math equations or \":e\" to exit: ");
             userInput = scanner.nextLine();
        }
    }

    //Returns number of operations, or how many times the program should loop
    private int countOperations(List<String> equation) {
        int numOperations = 0;

        for (int i = 0; i < equation.size(); i++) {
            if (equation.get(i).matches("\\+") || equation.get(i).matches("\\-")
            || equation.get(i).matches("\\*") || equation.get(i).matches("\\/")) {
                numOperations++;
            }
        }
        return numOperations;
    }
    
    //Returns float answer from string
    private float calculateEquation(String equation) {
        String[] splitEquation = equation.split(" ");
        List<String> terms = new LinkedList<String>(Arrays.asList(splitEquation));
        operations = countOperations(terms);
        float currentValue = 0;
        for (int passes = 0; passes < operations; passes++) { //For each operation loop 
            for (int i = 0; i < terms.size(); i++) {//Loop through list
                if (terms.get(i).matches("\\+")) { //If addition 
                    float num1 = Float.parseFloat(terms.get(i - 1));
                    float num2 = Float.parseFloat(terms.get(i + 1));
                    currentValue = num1 + num2;
                    terms.set(i+1, Float.toString(currentValue));
                    terms.remove(i-1);
                    terms.remove(i-1);
                    break;
                } else if (terms.get(i).matches("\\-")) {//If subtraction 
                    float num1 = Float.parseFloat(terms.get(i - 1));
                    float num2 = Float.parseFloat(terms.get(i + 1));
                    currentValue = num1 - num2;
                    terms.set(i+1, Float.toString(currentValue));
                    terms.remove(i-1);
                    terms.remove(i-1);
                    break;
                } else if (terms.get(i).matches("\\/")) { //If division 
                    float num1 = Float.parseFloat(terms.get(i - 1));
                    float num2 = Float.parseFloat(terms.get(i + 1));
                    currentValue = num1 / num2;
                    terms.set(i+1, Float.toString(currentValue));
                    terms.remove(i-1);
                    terms.remove(i-1);
                    break;
                } else if (terms.get(i).matches("\\*")) { //If multiplication 
                    float num1 = Float.parseFloat(terms.get(i - 1));
                    float num2 = Float.parseFloat(terms.get(i + 1));
                    currentValue = num1 * num2;
                    terms.set(i+1, Float.toString(currentValue));
                    terms.remove(i-1);
                    terms.remove(i-1);
                    break;
                }
            }
        }

        return Float.parseFloat(terms.get(0)); //Return result
    }

    //Start program
    public static void main(String[] args) {
        Calculator calc = new Calculator();

    }

}
