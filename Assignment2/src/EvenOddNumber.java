import java.util.Scanner;
public class EvenOddNumber {
    public static void main(String[] args) {
               int N;  // Write a Take an integer  number

        Scanner input = new Scanner(System.in) ;  //Write a code to  identifying user input .
        N = input . nextInt();

       if(N % 2 == 0){              // Write a code to calculate the even number
           System.out.println("Even Number");
       }
       else {                        //Write a code to calculate the Odd number
           System.out.println("Odd number");
       }




    }
}
