import java.awt.geom.Arc2D;
import java.util.Scanner;

public class Average1 {
    public static void main(String[] args) {
        System.out.println("Enter two integer number: ");
        Scanner input = new Scanner(System.in);

       float A = input . nextFloat();
        float B = input . nextFloat();

    double Average1 = ((A / 11 * 3.5) + (B / 11 * 7.5));
        System.out.print("The Average is :"+Average1+ ".");
    }
}
