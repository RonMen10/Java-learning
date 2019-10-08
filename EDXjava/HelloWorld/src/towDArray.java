import java.util.Arrays;

public class towDArray {


    private static int A [][] = new int[0][0];
    private static int B [][] = new int [0][0];
    private static int C [][] = new int[0][0];

    public static void main(String[]args){
        // int [][] @Name = new int [row][column]
        A = new int[4][4];
       for (int row = 0; row < A.length; row++ ){
           for (int col = 0; col < A.length; col++){
               A[row][col] = 5;
           }
       }

        B = new int[4][4];
        for (int row = 0; row < B.length; row++ ){
           for (int col = 0; col < B.length; col++){
               B[row][col] = 6;

           }
       }

        C = new int[4][4];
        for (int row = 0; row < C.length; row++ ){
           for (int col = 0; col < C.length; col++){
               C[row][col] = A[row][col] + B[row][col];
               //System.out.println(Arrays.toString(new int[] {C [row][col]}));

           }
       }
        sumaMatrices();
    }

    public static void sumaMatrices(){
        int[][] D = new int[4][4];
        for (int row = 0; row < D.length; row++ ){
            for (int col = 0; col < D.length; col++){
               D[row][col] = A[row][col] + B[row][col];
                System.out.println(Arrays.toString(new int[] {D [row][col]}));

            }
        }
    }
}
