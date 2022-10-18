/** Class: IllegalTriangleSideException.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/18/2022
*
* This class – Creates a custom Exception for the triangle class.
*/
public class IllegalTriangleSideException extends Exception
{
    public IllegalTriangleSideException()
    {
         System.out.println("Error! This is not a triangle. Please try again.");
    }

  
