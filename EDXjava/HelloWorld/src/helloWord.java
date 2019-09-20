public class helloWord {
    private static double p;
    public static void main (String[] args){
        toPrint();
        toPrint2();

    }

    public static void toPrint(){
        System.out.println("hello World");
    }
    public static void toPrint2(){
        String t = "time ";
        int h = 20;
        calcTime();
        System.out.println("hello second " + t + p );
        toPrint();
    }

    public static void calcTime() {
        int n = 32;
        double s = 3.4;
        p  = n + s;
    }
}
