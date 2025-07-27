import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n;
        int original;
        int result = 0;
        int digits = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        n = scanner.nextInt();

        original = n;

        int temp = n;
        while (temp!=0){
            digits++;
            temp/=10;
        }

        temp = n;
        while (temp!=0){
            int digit = temp%10;
            result += Math.pow(digit, digits);
            temp /= 10;

        }

        if (original == result) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        scanner.close();


        

    }
}
