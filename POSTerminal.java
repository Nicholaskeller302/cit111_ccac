/**
 *
 * @author Nicholas.keller302
 */
public class POSTerminal {
    public static int numCheeseSlicesOrdered = 0;
    public static int numPepperoniSlicesOrdered = 0;
    
    public static void main(String[] args) {
        displayOrderTotatls();
        orderCheeseSlices(2);
        orderPepperoniSlices(1);
        
        displayOrderTotatls();
        orderCheeseSlices(1);
        orderPepperoniSlices(5);
        displayOrderTotatls();
    }
    
    
    public static void orderCheeseSlices(int num) {
        numCheeseSlicesOrdered += num;
        System.out.println("You ordered " + num + " slices of cheese pizza");
    }
    
    public static void orderPepperoniSlices(int num) {
        numPepperoniSlicesOrdered += num;
        System.out.println("You ordered " + num + " slices of pepperoni pizza");
    }
    
    public static void displayOrderTotatls() {
        System.out.println("\n*********************** ORDER TOTALS ***********************");
        System.out.println("Total cheese slices ordered: " + numCheeseSlicesOrdered);
        System.out.println("Total pepperoni slices ordered: " + numPepperoniSlicesOrdered);
        System.out.println("************************************************************\n");
    }
}
