public class whileLoop {
    public static void main (String[]args){
        char test = 'v';
        String writtenWord = "nbvbnvwq";
        while (writtenWord.indexOf(test)>=1){
            //code to search for the chart
            System.out.println("Please write a word");
            ScannerClass newWord = new ScannerClass();
            writtenWord = newWord.textScan();
            //Answer
            System.out.println("Found");
        }
        System.out.println("Not Found");
    }
}
