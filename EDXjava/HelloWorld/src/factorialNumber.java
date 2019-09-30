public class factorialNumber {
public static void main(String[]args){
    System.out.println("Enter a number to find its factorial");
    factorialFinder();
}

    public static void factorialFinder(){
    int vfNumber = 1;
    int sumFactorial = 1;

        //code to get the number
        ScannerClass newNumber = new ScannerClass();
        int fNumber = newNumber.numScan();

        while (vfNumber<=fNumber){
        //code to calculate the factorial of a number
        sumFactorial = sumFactorial * vfNumber;

        vfNumber++;
    }
        System.out.println("The factorial of " + fNumber + " is " + sumFactorial);
    }
}
