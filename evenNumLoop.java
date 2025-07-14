public class evenNumLoop {
    public void printEvenNumbers(){
        System.out.println("Even numbers between 1 and 100");
        for(int i = 1; i <= 100; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        evenNumLoop print = new evenNumLoop();
        print.printEvenNumbers();
    }
}
