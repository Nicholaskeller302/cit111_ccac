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
public class Variables {
    
    public static void main(String[] args) {
        int yearsEleSchl;
        int yearsMS;
        int yearsHS;
        int yearsCollege;
        int totalYears;
        
        // giving them a value
        yearsEleSchl = 5;
        yearsMS = 3;
        yearsHS = 4;
        yearsCollege = 2;
        totalYears = yearsEleSchl + yearsMS + yearsHS + yearsCollege;
        
        // the phrase before the total years
        System.out.println("Total years in school : " + totalYears);
        
    } // close main method
} // close class Variables
