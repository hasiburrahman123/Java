import java.awt.geom.Arc2D;
import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        System.out.println("Enter Employee_number , hours and salary_per_hour : ");
        Scanner input = new Scanner(System.in);
        float number = input.nextFloat();
        int salary = input.nextInt();
        float hours = input.nextFloat();
        float SALARY = hours * salary ;
        System.out.println("NUMBER = "+number);
        System.out.println("SALARY = U$ "+SALARY);
    }
}
