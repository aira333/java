import java.util.Scanner;

public class voworConsonant {
    public static void main (String[] args) {
        String a;
        Scanner scanner =  new Scanner(System.in);
        a = scanner.next();

        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("u")) {
            System.out.println(a + " is a vowel");
        } else {
            System.out.println(a + " is a consonant");
        }

        scanner.close();
    }
}
