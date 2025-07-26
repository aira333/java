public class swapTwoNums {
    public static void main(String[] args){
        int a = 9;
        int b = 8;

        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a after swapping is " + a);
        System.out.println("a after swapping is " + b);

    }
    
}
