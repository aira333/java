import java.util.Scanner;

public class primeOrNot {
    public static void main(String[] args) {
        int n;
        boolean isPrime = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        n = scanner.nextInt();

        if (n<=1){
            isPrime = false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n%1 == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println(n + "is a prime number ");
        } else {
            System.out.println(n + "is not a prime number ");
        }

        scanner.close();
    }
}
