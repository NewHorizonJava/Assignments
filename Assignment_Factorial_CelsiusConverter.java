/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_factorial_celsiusconverter;

/**
 *
 * @author MagShehu
 */
public class Assignment_Factorial_CelsiusConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declare variables
        int factorial;
        int factorial_end;
        int factorialMultiplier;
        double faranheit;
        double celsius;
        double faranheitToCelsius;
        double celsiusToFaranheit;
        
        //Initialise variables
        factorial = 1;
        faranheit = 102;
        celsius = 39;
        factorial_end = 2;
        
        //perform calculations
        for (factorialMultiplier=9; factorialMultiplier>=factorial_end; factorialMultiplier--){
            factorial = factorial * factorialMultiplier;
            System.out.print(factorialMultiplier + " x ");
        }
        
        factorial = factorial * 1;
        System.out.print("1 ");
        
        faranheitToCelsius = (faranheit - 32)/1.8;
        celsiusToFaranheit = celsius * 1.8 + 32;
        
        //display results
        System.out.println("is " + factorial);
        
        
        System.out.println("The conversion of " + faranheit + " Faranheits to Celsius is " + faranheitToCelsius);
        System.out.println("The conversion of " + celsius + " Celsius to Faranheit is " + celsiusToFaranheit);
    }
    
}
