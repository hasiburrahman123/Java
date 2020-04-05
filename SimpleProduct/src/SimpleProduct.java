import java.util.Scanner;

public class SimpleProduct {
    public static void main(String[] args) {
        System.out.println("Enter two integer number: ");
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int PROD = A * B ;
        System.out.println("The Multiplication is "+PROD+ ".");
    }
}
