public class forLoops {
    public static void main (String[]args){
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++){
                System.out.print("| _ ");
            }
            System.out.println("|");
        }

        for (int i = 1; i <= 7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

        for (int h = 1; h <= 3; h++){
            for (int k = 0; k <= 9; k++) {
                System.out.print(k);
                System.out.print(k);
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
