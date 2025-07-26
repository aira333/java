import java.util.Scanner;

public class oddorEve {
    public static void main (String[] args){
        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();

        System.out.println("You entered: " + num);

        if (num % 2 == 0) {
            System.out.println("this is an even number");
        }
        else {
            System.out.println("this is an odd number");
        }
        
        scanner.close(); // idk why, apparently to prevent resource leak !?
    }
}
