import java.util.Scanner;

public class URI_1012_solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer number : ");
        double A = input . nextDouble();
        double B = input . nextDouble();
        double C = input . nextDouble();

       double pi = 3.14159;

       double triangle = A * C / 2 ;
       double  circle =(   C * C * pi ) ;
       double square = B * B ;
       double rectangle = A * B ;
       double trapezium = (((A + B ) / 2 ) * C );

       System.out.println("triangle " +triangle);
        System.out.println("Circle " +circle);
        System.out.println("trapezium "+trapezium );
        System.out.println("square "+square);
        System.out.println("rectangle " +rectangle);


    }
}
