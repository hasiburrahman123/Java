import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
public class RepresentDate {
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 int day = input . nextInt();
// Write a code with switch statement
 switch (day){
     case 1 :
         System.out.println("The inputted number 1 represent saturday");//It will be print first day
         break;
     case 2 :
         System.out.println("The inputted number 2 represent Sunday.");//It will be print second day
         break ;
     case 3 :
         System.out.println("The inputted number 3 represent Monday.");//It will be print third day
         break;
     case 4 :
         System.out.println("The inputted number 4 represent Tuesday.");//It will be print fourth day
         break;
     case 5 :
         System.out.println("The inputted number 5 represent Wednesday.");//It will be print fifth day
         break;
     case 6 :
         System.out.println("The inputted number 6 represent Thursday.");//It will be print sixth day
         break;
     case 7 :
         System.out.println("The inputted number 7 represent Friday.");//It will be print seventh day
         break;
     default:
         System.out.println("Sorry!! Your inputted out of the range and the range is 1 - 7.");// It will be print when user input unranged number.
          break;

 }

    }
}
