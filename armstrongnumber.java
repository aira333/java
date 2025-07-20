public class armstrongnumber {
    public static boolean isArmstrong(int number){
        if (number < 0) {
            return false; // does not work for negative numbers
        }
        if (number == 0){
            return true; // because 0^1 = 0 which is an armstrong number
        }

        int originalnum = number;
        int sumOfPowers = 0;
        int numberofDigits = 0;

        int tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            numberofDigits++;
        }

        tempNumber = originalnum;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfPowers += Math.pow(digit, numberofDigits);
            tempNumber /= 10;
        }

        return sumOfPowers == originalnum;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(9));
    }
}
