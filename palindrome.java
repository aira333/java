import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n;
        int original;
        int reversed = 0;

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a number ");
        n = scanner.nextInt();

        original = n;

        while (n!=0){
            int digit = n%10;
            reversed = reversed * 10 + digit;
            n/=10;
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome number.");
        } else {
            System.out.println(original + " is not a palindrome number.");
        }

        scanner.close();

        
    }
}
