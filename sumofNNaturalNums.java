import java.util.Scanner;

public class sumofNNaturalNums {
    public static int naturalnums(int number){
        int i = 1;
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        for (i = 1; i <= number; i++){
            sum += i;
        }        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a positive integer N: ");
        int n = scanner.nextInt();
        
        int result = naturalnums(n);
        if (result == -1) {
            System.out.println("enter a non-negative number.");
        } else {
            System.out.println("the sum of first " + n + " natural numbers is: " + result);
        }
        scanner.close();
    }
}
