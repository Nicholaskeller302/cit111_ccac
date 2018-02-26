/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Nicholas.keller302
 */
public class RoadTrip {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        final double BIG_RED_MILES_PER_GALLON = 13.0;
        final double AVERAGE_GAS_PRICE = 3.11;
        
        String carMake = "1997 Dodge Dakota";
        String carName = "BigRed";
        int maxWeight = 2000; // primitive type variable
        int currentNumberOfWeight = 1150;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 140.00;
        double distanceToCherrySpringsStatePark = 177.0;
        boolean destinationReached = false;
        
        double legDistance;
        
        //simulation
        System.out.println("***Road trip simulator***");
        System.out.println("Make of car; " + carMake + " that can carry: " + maxWeight);
        System.out.println("Print doubles: " + distanceToCherrySpringsStatePark);
        
        System.out.println("--> Beginning of trip stats <--");
        System.out.println("Make of car: " + carMake + " that can carry: " + maxWeight);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance To Destination: " + distanceToCherrySpringsStatePark);
        System.out.println("Full Car? " + carFull + "; Current odemeter: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println("Starting trip with " + currentNumberOfWeight + " Weight");
        System.out.println("Destination Reached? " + destinationReached);
        System.out.println("****************************************");
        
        System.out.println();
        System.out.println("Beginning leg 1:");
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToCherrySpringsStatePark * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odometer by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, over-write distance
        distanceToCherrySpringsStatePark = distanceToCherrySpringsStatePark - legDistance;
        
        //"see" 600 pounds of firewood for free on side of road
        System.out.println("Wicked! All this free firewood? Who would ever pass this up?");
        
        // Looks back to see if there is enough room in the bed of truck for the wood 
        if(carFull == false){
            System.out.println("Bed of truck is only halfway full, I can totally pick up all this wood.");
            currentNumberOfWeight = currentNumberOfWeight + 600;
            // alternative shorter version: currentNumberOfWeight ++
        } // closes if()
        
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * price per gallon
        double gasPriceForLeg = (legDistance / BIG_RED_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;;
        //deduct $ spent on gas from money remaining and over-write cahsOnHand
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        // reprint the variable that need adjusted
        System.out.println();
        System.out.println("****Variable stats at end of the leg 1****");
        System.out.println("Distance To Destination: " + distanceToCherrySpringsStatePark);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
         System.out.println("I have $" + cashOnHand + " to spend on this trip");

        System.out.println("Destination Reached? " + destinationReached);
        
        // Solution to exercise for completing road trip
        
        //Step 1 in guide: set leg distance to 88 miles
        legDistance = 88.00;
        
        // Step 2: Sumulate finding a pair of hitchhikers and check car status
        System.out.println("Woah! There is even more free wood! Another hundred pounds!");
        if(carFull == false){
            System.out.println("Truck bed is not completely full! Picking even more wood! Whoop!");
            currentNumberOfWeight = currentNumberOfWeight + 100;
        }
        
        // Step 3: Calculate fuel price for driving another 88 miles
        gasPriceForLeg = (legDistance / BIG_RED_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Amount spent on gas leg 2: " + gasPriceForLeg);
        
        // Step 4: Print out leg two data:
        System.out.println();
        System.out.println("****Variable stats at end of the leg 2****");
        System.out.println("Distance To Destination: " + distanceToCherrySpringsStatePark);
        System.out.println("Full bed?" + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfWeight + " weight in bed");
        System.out.println("Destination Reached? " + destinationReached);
        
        // Step 5: Get remaining distance to utah as leg distance
        legDistance = distanceToCherrySpringsStatePark  - legDistance;
        
        
        
        // Step 7: pay for gas for rest of trip
        gasPriceForLeg = (legDistance / BIG_RED_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        cashOnHand = cashOnHand - gasPriceForLeg;
        System.out.println("Cash paid for gas on final leg: " + gasPriceForLeg);
        
        // Step 8: Arrive! and toggle destination reached var
        destinationReached = true;
        
        // Step 9: Print out final stats:
        
        System.out.println();
        System.out.println("****Variable stats at end of the leg 3****");
        System.out.println("Distance To Destination: " + distanceToCherrySpringsStatePark);
        System.out.println("Is the bed full yet?" + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + cashOnHand + " to spend on this trip");
        System.out.println(currentNumberOfWeight + "Total amount of weight in the bed");
        System.out.println("Destination Reached? " + destinationReached);
        }
        
    } // close class main
   

