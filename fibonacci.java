public class fibonacci {
    public static void printFibonacciSeries(int n){
        if(n<0){
            System.out.println("can't be negative");
            return;
        } else if (n==0){
            System.out.println("fibonacci series upto 0 terms : empty");
            return;
        } else if (n==1){
            System.out.println("fibonacci series up tp 1 term: 0");
            return;
        }

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        System.out.print(a + ", " + b);
        
        for (int i = 2; i < n; i++){
            int nextTerm = a + b;
            System.out.print(", " + nextTerm);
            a = b;
            b = nextTerm;
        }

       
    }

     public static void main(String[] args){
            printFibonacciSeries(10);
        }
}
