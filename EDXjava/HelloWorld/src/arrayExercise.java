import java.util.Arrays;

public class arrayExercise {

    public static void main(String[]args) {

        int[] laCasa = new int[10];
        for (int i = 0; i < laCasa.length; i++) {
            laCasa[i] = i + 1;
        }
        System.out.println(Arrays.toString(laCasa));
        int a = laCasa[4];
        System.out.println("esto " + a);


        //equals(array1, array2) : returns true if the two arrays contain the same elements in the same order
        int[] casa2 = new int[laCasa.length];
        Arrays.equals(laCasa, casa2);
        System.out.println(Arrays.toString(casa2));

        //fill(array, value): fills every index of the array with a copy of the given value
        Arrays.fill(casa2, 100);
        System.out.println(Arrays.toString(casa2));


        //copyOf(array, newLength): creates a new array object with the given length and fills it with values in the same
        // order as the original array. If there are left over indexes those are filled with the data type's zero value
        int[] casa3 = Arrays.copyOf(laCasa, 9);
        System.out.println(Arrays.toString(casa3));

        //sort(array): arranges the values in the array in sorted order from smallest to largest
        casa3[7] = 23;
        casa3[0] = 25;
        Arrays.sort(casa3);
        System.out.println(Arrays.toString(casa3));

        //binarySearch(array, value): returns the index of th given value in a sorted array. Will return a negative number if the value doesn't exist in the array.
        System.out.println(Arrays.binarySearch(casa3,23));
        System.out.println(Arrays.binarySearch(casa3,100));

    }
}
