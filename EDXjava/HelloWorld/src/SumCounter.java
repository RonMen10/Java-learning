import java.util.Scanner;

public class SumCounter {
    static int N = 0;
    public static void main (String[] args){
        System.out.println("Please define the N number of digits");
        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        if(N <= 0 ){
            System.out.println("N should be a positive non-zero number");
        }else {
            sumMaker();
        }

    }

    public static void sumMaker(){
        int sum = 0;
        for (int i=1; i<=N; i++){
            sum = sum + i;
        }
        System.out.println("The Sum of digits is = " + sum);
    }
}
