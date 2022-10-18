/** Class: AdditionCalculator.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/18/2022
*
* This class – Adds two integers and prints the output while performing proper exception handling
*/

import java.util.Scanner;
import java.util.InputMismatchException;
public class AdditionCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         boolean goodInput  = true;
         do
            {
              try
                {
                 System.out.println("Enter a whole integer: );
                 int num1 = sc.nextInt();
                 System.out.println("Enter a second whole integer: ");
                 int num2 = sc.nextInt();
                 int sum = num1 + num2;
                 goodInput = false;
                 System.out.println("The sum of " + num1 + " + " + num2 + " = " + sum);
                 }
                                    
             catch(InputMismatchException e)
             {
                 System.out.println(e);
                 System.out.println("Error! Input must be an integer. Please try again.");
                 sc.nextLine();
             }
           
         }
          while(goodInput);

    }
}
