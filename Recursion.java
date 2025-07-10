/*  a method calling itself is called as recursion */

public class Recursion {
    public static int calcFactorial(int n){
        if (n <= 1){
            return 1;
        }
        else {
            return n *calcFactorial(n-1);
        }
    }

    public static void main(String[] args){
        int num = 5;
        int result = calcFactorial(num);
        System.out.println("factorial of " + num + "is" + result );
    }

}


