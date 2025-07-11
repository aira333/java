public class callingMethod {
    // staic methods belongs to the class, can call them directly using the class name
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){
        int sum1 = callingMethod.add(5,3);
        System.out.println("5 + 3 = " + sum1);

        int sum2 = callingMethod.add(100, 25);
        System.out.println("100 + 25 = " + sum2);
    }
}
