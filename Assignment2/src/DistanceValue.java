import java . util . Scanner;

public class DistanceValue {           // Take a class name of DistanceValue
    public static void main(String[] args) {
         double x1 , x2 , y1 , y2 ;         // Indicate the type of number
         double DistanceValue;

         Scanner input = new Scanner(System.in);      //Write a code to  identifying user input

        System.out.println(" Please Enter The Value (x1 y1): ");  //Indicate the first one contains

        x1  = input . nextDouble() ;
        y1  = input . nextDouble() ;

        System.out.println("Please Enter The Value (x2 y2):  ");   //Indicate the second one contains

        x2 = input . nextDouble() ;
        y2 = input . nextDouble() ;

        DistanceValue =   Math . sqrt( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));  // Write the formula to compute this equation.
        System.out.printf("Distance Value is : %.4f", +DistanceValue);  // Write the code to Calculate and print the message.
    }

}
