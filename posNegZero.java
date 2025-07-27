import java.util.Scanner;

public class posNegZero {
    public static void main (String args[]){
        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        a = scanner.nextInt();

        if (a > 0){
            System.out.println(a + " is a postive number");
        }

        if (a < 0) {
            System.out.println(a + " is a negative neumber");
        }

        if (a == 0) {
            System.out.println(a + " is equal to 0");
        }

        scanner.close();
    }
}
