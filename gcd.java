import java.util.ArrayList;
import java.util.List;

public class gcd {
    public static List<Integer> getFactors(int n){
        List<Integer> factors = new ArrayList<>();
        n = Math.abs(n);
        if (n==0) {
            return factors;
        }

        for(int i=1; i<=n; i++){
            if (n%i == 0) {
                factors.add(i);
            }
        }

        return factors;
    }

    public static int findGcd(int num1, int num2){
        if (num1 ==0 && num2 == 0){
            return 0;
        }

        if (num1 == 0) {
            return Math.abs(num2);
        }
        if (num2 == 0) {
            return Math.abs(num1);
        }

        List<Integer> factors1 = getFactors(num1);
        List<Integer> factors2 = getFactors(num2);

        int gcd = 1; // initialize GCD to 1 (smallest possible common divisor)

        // iterate through factors of the first number and check if they are also factors of the second
        for (int factor : factors1) {
            if (factors2.contains(factor)) {
                gcd = factor; // update GCD with the largest common factor found so far
            }
        }
        return gcd;
    }
     public static void main(String[] args) {
        System.out.println("GCD(48, 18) = " + findGcd(48, 18));
    }


}
