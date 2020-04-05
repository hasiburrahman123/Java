import java.util.Scanner;

public class SimpleSum {
    public static void main(String[] args) {
        System.out.println("Enter two integer: ");
        Scanner input = new Scanner(System.in);
        int A = input . nextInt();
        int B = input . nextInt();

        int SOMA = A + B ;
        System.out.println("The sum is "+SOMA+ ".");
    }
}
