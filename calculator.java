import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int a;
        int b;
        int choice;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number ");
        a = scanner.nextInt();
        System.out.println("enter 2nd number ");
        b = scanner.nextInt();
        
        System.out.println("Choose operation: ");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.println("result: " + (a + b));
                break;
            case 2:
                System.out.println("result: " + (a - b));
                break;
            case 3:
                System.out.println("result: " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("result: " + (a / b));
                } else {
                    System.out.println("cannot divide by zero");
                }
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
        scanner.close();
    }
}
