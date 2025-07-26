import java.util.Scanner;

public class largestamong3num {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        a = scanner.nextInt();
       
        System.out.println("Enter 2nd number ");
        b = scanner.nextInt();
       
        System.out.println("Enter 3rd number ");
        c = scanner.nextInt();
        

        if (a>c && a>b){
            System.out.println("a is greater than b and c "+ a);
        }

        else if (b>a && b>c){
            System.out.println("b is greater than a and c");

        }

        else {
            System.out.println("C is greater than a and b");
        }

        scanner.close();
    }
}
