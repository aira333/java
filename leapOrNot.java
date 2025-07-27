import java.util.Scanner;

public class leapOrNot {
    public static void main (String args[]){
        int year;

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter a year ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year%400 == 0)) {
            System.out.println("this is a leap year " + year);

        }

        else {
            System.out.println("this is not a leap year " + year);
        }

        scanner.close();
    }
}
