public class whileloop {
    public static int numofDigits(int number) {
        if (number == 0){
            return 1;
        }

        int count = 0;
        int tempNumber = Math.abs(number);
        while(tempNumber > 0){
            tempNumber = tempNumber/10; // integer division by 10 removes the last digit
            count ++;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println("Number of digits in 1234:" + numofDigits(10));
    }
}
