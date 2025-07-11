public class leapyear {
    public static boolean isLeapYear(int year) {
        if (year <= 0){
            return false;
        }

        // leap year is divisible by 4
        // not divisible by 100 unless also divisible by 400

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        } 
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("is 2000 is a leap year" + isLeapYear(2000));
    }
        
    }

