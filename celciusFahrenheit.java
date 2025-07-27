import java.util.Scanner;

public class celciusFahrenheit {
    public static void main (String args[]){
        float celcius;
        float fahrenheit;

        Scanner scanner = new Scanner (System.in);
        System.out.println("enter celcius value");
        celcius = scanner.nextFloat();
        fahrenheit = (celcius * 9/5) + 32;
        System.out.println("The value of fahrenheit " + fahrenheit );

        scanner.close();
    }
    
}
