public class factorialLoop {
    public static long calcFact(int n){
        if (n < 0) {
            return -1; //negative numbers can't work for factorial
        }

        if (n==0){
            return 1;
        }

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args){
        System.out.println("Factorial of 5 is:"+ " " + calcFact(5));
    }

}
