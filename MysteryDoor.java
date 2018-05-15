import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nicholas.keller302
 */
public class MysteryDoor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int userSelection;

        //Show the doors and which number to choose
        System.out.println("Choose a door!");
        System.out.println("#######      #######      #######");
        System.out.println("   1            2            3   ");
        System.out.println("#######      #######      #######");
        
        
        System.out.print("Pick 1, 2 or 3 to see what you won: ");

        userSelection = scan.nextInt(); //Get the number the user entered

        //Run code based on which door the user selected
        switch (userSelection) {
            case 1:
                Random random = new Random();
                System.out.println(random.nextInt(50) + " puppies");
                break;
            case 2:
                System.out.println("You just won $" + cashPrize());
                break;
            case 3:
                System.out.println("You just won a " + getFirstDoorPrize());

                break;
                
        }
    }

    public static String getFirstDoorPrize() {
        //Return prize found behind door number 1
        return "1999 Toyota Camry";
    }

    public static int cashPrize() {
        Random random = new Random();
        //Get random cash prize

        int randomNumber = random.nextInt(1000000);
        return randomNumber;
                
    }
}
