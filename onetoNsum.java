import java.util.Scanner;

public class onetoNsum {
    public static void main(String[] args) {
        int n;
        int result = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a number");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            result += i;
            System.out.println("the sum of n natural number is " + result);
        }

        scanner.close();
    }
}

// another formula => result =  n * (n+1) / 2