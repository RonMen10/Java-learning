import java.util.ArrayList;

public class arrayListExercise {
    public static void main(String[]args){
        listOfPrimes();
    }

    public static void listOfPrimes(){
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i <= 9;i++ ){
            primeNumbers.add(i, i);
            System.out.println(primeNumbers.get(i));
        }
    }
}
