/** Class: ArrayIndex.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/18/2022
*
* This class – This program creates an array of 50 random double values andoutputs the index that a user requests while performing proper array exception handling.
*/
import java.util.Random;
import java.uti.Scanner;


public class ArrayIndex 
{
    public static void main(String[] args) 
    {
        double [] randomArray = new double[50];
        Random num = new Random();
        Scanner sc = new Scanner(System.in);
      
        for(int i  = 0; i < randomArray.length; i++) 
        {
            randomArray[i] = num.nextDouble();
        }
        System.out.println("Enter any index within the array range (Up to 50): ");
       
      while(true) 
        {
            try 
              {
                int index = sc.nextInt();
                System.out.println(randomArray[index]);
                break;
              } 
                catch (ArrayIndexOutOfBoundsException e) 
                {
                  System.out.println("Error! Input is out of range. Please try again. ");
                }
          
        }

    }
}
