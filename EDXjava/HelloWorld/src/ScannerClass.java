import java.util.Scanner;

public class ScannerClass {
    Scanner input = new Scanner(System.in);

    public int numScan(){
        int n = input.nextInt();
        return n;
    }

    public String textScan(){
        String t = input.next();
        return t;
    }

}
