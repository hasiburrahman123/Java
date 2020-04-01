import java .util.Scanner;
public class NumToDate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   //Write code to scanning user input.
        System.out.println("Please Enter The Number(NUM) : ");   // Write a message or user


        int NUM ;    //take a variable name 'NUM'
        NUM = input . nextInt() ;

           // Write a code for statement

        int year = NUM / 365 ;         // This statement is for calculate the year.
        NUM = NUM % 365 ;               //  This statement use for  substract the unused number after calculate the year

       int month = NUM /30 ;          // This statement use or calculate month
        NUM = NUM % 30 ;              // This statement use for  substract the unused number after calculate the month

        int day = NUM;                // Which number will be acquired after getting the year and month

        System.out.println(+day+" days\t" +month+ " months\t"+year+" years");


    }
}
