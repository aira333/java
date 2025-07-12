public class ifElse {
    public static String checkPosNegzero(int num){
        String number;

        if (num > 0){
            number = "Positive";
        } else if (num < 0){
            number = "Negative";
        } else {
            number = "0";
        }
        return number; 
    }

    public static void main (String[] args){
        System.out.println("Number is -1 " + checkPosNegzero(-1));
    }
}
