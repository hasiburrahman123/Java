import java.util.Scanner;

public class CarAverageConsumption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total distance of car: ");
        int TotalDistance = input.nextInt();
        System.out.println("Enter the total spent fuel: ");
        double SpentFuel = input . nextDouble();

        double AverageConsumption = TotalDistance / SpentFuel ;
        System.out.println("The average of consumption is : " +AverageConsumption);
    }
}
