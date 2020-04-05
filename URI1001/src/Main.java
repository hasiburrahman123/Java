import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your Integer :");
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int X;
        X = A + B;

        System.out.print("X = " +X+ "\n");
    }
}