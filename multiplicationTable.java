import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a number");
        n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            int result;
            result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }

        scanner.close();
    }
}
