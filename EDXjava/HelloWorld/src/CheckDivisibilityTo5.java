import java.util.Scanner;

public class CheckDivisibilityTo5 {
    public static void main (String[]args){
    checkDiv5();
    }

    public static void checkDiv5(){
       System.out.println("Write a number to check if it is divisible by 5");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if ((number % 10)==0){
            System.out.println("TRUE");
        } else if ((number % 10)==5){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        System.out.println("Last digit = " + (number % 10));
    }
}
