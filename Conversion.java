
import java.util.Scanner;

/**
 *
 * @author Nicholas.keller302
 */
public class Conversion {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //Show menu from menu method
        printMenu();

        int userSelection = scan.nextInt();

        while (userSelection != 0) { //If the user selected 0 end the program
            switch (userSelection) {
                case 1:
                    convertFeetToMeters();
                    break;
                case 2:
                    convertMetersToFeet();
                    break;
                case 3:
                    convertInchesToMeters();
                    break;
            }

            printMenu();
            userSelection = scan.nextInt();
        }
    }

    //Show the conversion menu
    public static void printMenu() {
        System.out.println("Select what you would like to convert");
        System.out.println("---------------------------------------");
        System.out.println("1 -- Feet to Meters");
        System.out.println("2 -- Meters to Feet");
        System.out.println("3 -- Inches to Feet");
        System.out.println("0 -- Exit Program");
    }

    public static void convertInchesToMeters() {
        System.out.print("Convert how many inches to meters?: ");
        int inches = scan.nextInt();
        System.out.println(inches + " inches in meters is " + inches * 0.0254);
    }

    public static void convertFeetToMeters() {
        System.out.print("Convert how many feet to meters?: ");
        int feet = scan.nextInt();
        System.out.println(feet + " feet in meters is " + feet * 0.3048);
    }

    public static void convertMetersToFeet() {
        System.out.print("Convert how many meters to feet?: ");
        int meters = scan.nextInt();
        System.out.println(meters + " meters in feet is " + meters * 3.28084);
    }

}
