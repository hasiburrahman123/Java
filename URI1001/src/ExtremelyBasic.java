import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args){
        System.out.println("Please enter two integer: ");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int sum;
        sum = x + y ;

        System.out.println("The sum of this number is : " +sum);

    }

}
