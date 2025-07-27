import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        int n;
        long fact = 1;

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a number ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            fact = fact * i;
            
        }

        System.out.println("the factorial of n is " + fact);

        scanner.close();
    }
}
