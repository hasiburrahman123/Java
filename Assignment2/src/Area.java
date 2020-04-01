 import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

       double R ;      // Indicate the type of number


        double PI = 3.14159 , area;       // Write the value of PI.


       Scanner input = new Scanner(System.in);   // Write a code to  identifying user input.


        System.out.println("Please Enter The Radius (R) :");     //Write a code to present the message to user.
        R = input . nextDouble();


        area = (PI * (R *R ));     // writing  formula to getting exact solution of area.


                    // Writing code to show the result of user input.

        System.out.printf("THE AREA IS = %.4f",+area );//Here we use 'printf' because we need to show four places after decimal point.
                                                       // If i use printf then mustbe i need to use comma (,)
    }
}
