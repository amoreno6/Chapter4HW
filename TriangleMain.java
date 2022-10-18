/** Class: Triangle.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 10/18/2022
*
* This class – Main class for Triangle assignment. Tests 3 new triangles and shows proper exeception handling if triangle sides do not follow triangle method. 
*/
public class TriangleMain
{
    public static void main(String[] args) throws IllegalTriangleSideException
      {
        Triangle t1 = new Triangle(2,1.4,1.1);
        Triangle t2 = new Triangle(3,9,6);
        Triangle t3 = new Triangle(1,6.6,2.8);
       
           try 
             {
                    t1.checkSides();
                    t2.checkSides();
                    t3.checkSides();
              } 
          catch (IllegalTriangleSideException e) 
              {
                  System.out.println(e);
              }

       }
}
