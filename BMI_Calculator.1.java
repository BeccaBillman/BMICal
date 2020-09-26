/************************************************************************************************
 * File Name:   BMI_Calculator.java
 * 
 * Due Date:    <20 Oct 17>
 * 
 * Author:      <Becca Billman>
 * 
 * Program Description:  
 *              Body Mass Index (BMI) is calculated by dividing a peron's weight in pounds (lbs 
 *              by their height in inches (in) squared and multiplying by a conversion factor 
 *              of 703. A high BMI can be an indicator of high body fatness.  BMI can be used 
 *              to screen for weight categories that may lead to health problems but it is not 
 *              diagnostic of the body fatness or health of an individual.    
 * 
 * Input:       The user will enter four values:   name, height (feet), 
 *              height (inches), and weight (pounds)
 *
 * Output:      Print the BMI to the screen and the URL to the CDC concerning 
 *              healthy lifestyle.
 *
 * Processing:  Calculate BMI by dividing weight in pounds (lbs) by height in 
 *              inches (in) squared and multiplying by a conversion factor of 703.
 * **********************************************************************************************/

import java.util.Scanner;

public class BMI_Calculator {
    
  public static void main(String[] args)   {

        /****************************************************************************************************
        //Step 1:   Declare AT LEAST Six Variables - Four integers (for which three of the four variables have been  
        //          declared for you), One double, and One String (which is declared for you).
        //
        //Explaination:
        //          The String variable will capture the user's name from the keyboard.  
        //          Two integer variables declared below will store the user's weight and height (inches).
        //          The third integer variable will store the result of converting the feet to inches.
        //          The fourth integer variable will store the result of converting the height to inches.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO DECLARE SIX VARIABLES.
        //
        //NOTE:  THE NUMBER OF VARIABLES YOU DECLARE MAY VARY.  IT DEPENDS ON HOW YOU DESIGN YOUR PROGRAM!!
        ****************************************************************************************************/
        
        //INSERT YOUR CODE & COMMENTS BELOW
        String fname = "";
        int weight, totalHeight, feetToInch, feet, inches;
        double bmi;
      
        /************************************************************************************************
        //Step 2:   Create and instantiate a Scanner object to accept input from the keyboard. 
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO CREATE A SCANNER OBJECT.
        *************************************************************************************************/
       
        //INSERT YOUR CODE & COMMENTS BELOW
      
            //Create Scanner object 
            Scanner inp = new Scanner (System.in);

        /************************************************************************************************
        //Step 3:   Print the BMI Calculator Banner to the screen
        //
        //Task:     THIS STEP IS COMPLETED.
        ************************************************************************************************/     
      
        System.out.println("\n\n******************************************************************** ");
        System.out.println("\n\t\tWelcome to the Adult BMI Calculator!\n");
        System.out.println("********************************************************************\n ");    

        /************************************************************************************************
        //Step 4:   Prompt the user for their name.
        //
        //Task:     THIS STEP IS COMPLETED.
        ************************************************************************************************/ 

        System.out.print("Please enter your name then press the enter key: ");
        
        /************************************************************************************************
        //Step 5:   Read the name from the keyboard.  
        //          
        //Hint:     Use either the next() or nextLine() methods to read the name.
        //
        //Task:     COMPLETE THIS SECTION BY READING THE NAME FROM THE KEYBOARD.
        *************************************************************************************************/
           
        //INSERT YOUR CODE & COMMENTS BELOW
         //read the users name 
           fname = inp.next();
        /************************************************************************************************
        //Step 6:   Prompt the user for their height (feet).
        //
        //Task:     THIS STEP IS COMPLETED.
        ************************************************************************************************/ 
        
        System.out.print("\nPlease enter your height (feet) then press enter.  \n[Example:  If you are 5'3'', you would enter 5.] ");
        
        /************************************************************************************************
        //Step 7:   Read the height (feet) from the keyboard.  
        //          
        //Hint:     Use the nextInt() method to read the height (feet).
        //
        //Task:     COMPLETE THIS SECTION BY READING THE HEIGHT (FEET) FROM THE KEYBOARD.
        *************************************************************************************************/
               
        //INSERT YOUR CODE & COMMENTS BELOW
        feet = inp.nextInt(); //reading an integer from the keyboard and assigning it to feet
      
        /************************************************************************************************
        //Step 8:   Prompt the user for their height (inches).
        //
        //Task:     THIS STEP IS COMPLETED.
        ************************************************************************************************/ 
        
        System.out.print("\nPlease enter your height (inches) then press enter.  \n[Example:  If you are 5'3'', you would enter 3.] ");
      
        /************************************************************************************************
        //Step 9:   Read the height (inches) from the keyboard.  
        //          
        //Hint:     Use the nextInt() method to read the height (inches).
        //
        //Task:     COMPLETE THIS SECTION BY READING THE HEIGHT (INCHES) FROM THE KEYBOARD.
        *************************************************************************************************/
               
        //INSERT YOUR CODE & COMMENTS BELOW
        inches = inp.nextInt(); //reading an integer from the keyboard and assigning it to inches
        /************************************************************************************************
        //Step 10:   Prompt the user for their weight (round).
        //
        //Task:     THIS STEP IS COMPLETED.
        ************************************************************************************************/ 
          
        System.out.print("\nPlease enter your weight (round) then press enter. ");
      
        /************************************************************************************************
        //Step 11:  Read the weight (round) from the keyboard.  
        //          
        //Hint:     Use the nextInt() method to read the weight (round).
        //
        //Task:     COMPLETE THIS SECTION BY READING THE WEIGHT (ROUND) FROM THE KEYBOARD.
        *************************************************************************************************/
    
        //INSERT YOUR CODE & COMMENTS BELOW
        weight = inp.nextInt(); //reading an integer from the keyboard and assigning it to weight  

        /************************************************************************************************
        //Step 12:  (PROCESSING) Convert the height (feet) to inches and store the value in the appropriate 
        //          variable.
        //
        //HINT #1:  Don't forget to assign the result of the calculation to a variable using the 
        //          (=) assignment operator.
        //
        //HINT #2:  To convert feet to inches, multipy feet by 12.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO CONVERT THE HEIGHT (FEET) TO INCHES.
        *************************************************************************************************/
        //INSERT YOUR CODE & COMMENTS BELOW
        feetToInch = feet * 12;
        
        /************************************************************************************************
        //Step 13:  (PROCESSING) Calculate the total height to inches and store the value in the appropriate 
        //          variable.
        //
        //HINT #1:  Don't forget to assign the result of the calculation to a variable using the 
        //          (=) assignment operator.
        //
        //HINT #2:  To calculate the total height in inches, find the sum of the height (as inches)
        //          and the feet (as inches).
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO CONVERT THE TOTAL HEIGHT TO INCHES.
        *************************************************************************************************/
         
        //INSERT YOUR CODE & COMMENTS BELOW
        totalHeight = feetToInch + inches;
        
        /************************************************************************************************
        //Step 14:  (PROCESSING) Calculate the BMI and store the value in the appropriate variable.
        //
        //HINT #1:  Don't forget to assign the result of the calculation to a variable using the 
        //          (=) assignment operator.
        //
        //HINT #2:  Refer to the CDC Website to learn how the BMI is calculated for pounds and inches.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO CONVERT THE TOTAL HEIGHT TO INCHES.
        *************************************************************************************************/
                  
        //INSERT YOUR CODE & COMMENTS BELOW
        
        bmi = (weight / Math.pow(totalHeight,2)) * 703;
        
        bmi = (double)Math.round(bmi * 10d) / 10d;
          
        /**************************************************************************************************
        //Step 15:  (OUTPUT) Display the BMI total to the screen.  
        //                 
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO PRINT THE BMI SCORE AND NAME TO THE SCREEN.
        ***************************************************************************************************/   
         
        //INSERT YOUR CODE & COMMENTS BELOW
        System.out.print("Hello " + fname + " your BMI percentage is: ");
        System.out.println(bmi + "%");
        
        /************************************************************************************************
        //Step 16:   Display a thank you message to the screen and provide the CDC URL for more information.
        //
        //Task:     THIS STEP IS COMPLETED.
        ************************************************************************************************/ 
      
        System.out.println("\nThanks for using the Adult BMI Calculator!  For more information about");
        System.out.println("the importance of a healthy diet and physical activity in reaching a");
        System.out.println("healthy weight, visit:\n");
        System.out.println("https://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html\n\n");
      
  }//end of main
    
}//end of BMI_Calculator class
