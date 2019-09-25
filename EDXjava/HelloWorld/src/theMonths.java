
import java.util.Scanner;

public class theMonths {
    static int month = 0;
    public static void main (String[]args){
        monthQuestion();

    }

    public static void monthQuestion(){
        System.out.println("Write the number of the month required");
        ScannerClass monthInput = new ScannerClass();
        int monthNumber = monthInput.numScan();
        daysMonth(monthNumber);
    }

    public static void daysInMonth(int month) {
        if ( month == 1){
            System.out.println("Jan 31 Days");
        }else if ( month == 2){
            System.out.println("Fev 28 Days");
        }else if ( month == 3){
            System.out.println("Mar 31 Days");
        }else if ( month == 4){
            System.out.println("Apr 30 Days");
        }else if ( month == 5){
            System.out.println("May 31 Days");
        }else if ( month == 6){
            System.out.println("Jun 30 Days");
        }else if ( month == 7){
            System.out.println("Jul 31 Days");
        }else if ( month == 8){
            System.out.println("Aug 31 Days");
        }else if ( month == 9){
            System.out.println("Sep 30 Days");
        }else if ( month == 10){
            System.out.println("Oct 31 Days");
        }else if ( month == 11){
            System.out.println("Nov 30 Days");
        }else if ( month == 12){
            System.out.println("Dec 31 Days");
        }else if (month >12 || month <=0){
            System.out.println("Month not existent");
        }


    }

    public static void daysMonth(int month){
        switch (month){
            case 1:
                System.out.println("Jan 31 Days");
                break;
            case 2:
                System.out.println("fev 28 Days");
                break;
            case 3:
                System.out.println("Mar 31 Days");
                break;
            case 4:
                System.out.println("Apr 30 Days");
                break;
            case 5:
                System.out.println("May 31 Days");
                break;
            case 6:
                System.out.println("Jun 30 Days");
                break;
            case 7:
                System.out.println("Jul 31 Days");
                break;
            case 8:
                System.out.println("Aug 31 Days");
                break;
            case 9:
                System.out.println("Sep 30 Days");
                break;
            case 10:
                System.out.println("Oct 31 Days");
                break;
            case 11:
                System.out.println("Nov 30 Days");
                break;
            case 12:
                System.out.println("Dec 31 Days");
                break;

            default:
                System.out.println("Month not existent");
        }
    }
}
