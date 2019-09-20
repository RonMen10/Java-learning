import java.util.Scanner;

import static java.lang.Math.PI;

public class LearnScanner {
    static double salary1;
    static double expense;

    public static void main (String[]args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("hello, What's your name?");
        String name = input1.next();
        System.out.println("hello " + name);
        edad();
        salary();
        expenses();
        savings();
        cos1();
    }

    public static void edad () {
        Scanner input2 = new Scanner(System.in);
        System.out.println("How old are you");
        int edad1 = input2.nextInt();
        System.out.println("At " + edad1 + " you are still young");
    }
    public static void salary (){
        Scanner input3 = new Scanner(System.in);
        System.out.println("How much do you make/month?");
        salary1 = input3.nextDouble();
        System.out.println("That's great");
    }
    public static void expenses (){
        Scanner input4 = new Scanner(System.in);
        System.out.println("How much do you spend monthly?");
        expense = input4.nextDouble();
        System.out.println("OK, good!");
    }

    public static void savings(){
        double savedMoney = salary1 - expense;
        System.out.println("This is what you should be saving " + savedMoney);
    }

    public static double cos1 (){
        double a = PI;
        double cos = Math.cos(a);
        System.out.println("the cos of Pi is " + cos);
        return a;
    }

}
