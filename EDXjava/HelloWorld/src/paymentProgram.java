public class paymentProgram {
    public static void main(String[]args){
        System.out.println("Enter the number of hours you have worked this month");
        paymentCalculator();
    }

    public static void paymentCalculator(){
        int workedHours = 0;
        ScannerClass hoursNumber = new ScannerClass();
        workedHours = hoursNumber.numScan();

        if (workedHours <= 40 && workedHours > 0){
            System.out.println("This month your Salary is " + 8 * workedHours);

        } else if(workedHours > 40 && workedHours <= 60){
            int x = workedHours - 40;
            System.out.println("This month your Salary is " + ((8 * 40) + (8 * 1.5 * x)));

        }else if(workedHours>60){
            System.out.println("You should work 60 hours in a month MAX, you will be paid only for that time");
            System.out.println("This month your Salary is " + ((8 * 40) + (8 * 1.5 * 20)));

        }else if(workedHours == 0){
            System.out.println("This month your Salary is " + 0);


        } else {
            System.out.println("You can NOT report less than 0 worked hours");

        }
    }
}
