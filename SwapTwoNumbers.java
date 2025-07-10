// with temp 
// public class SwapTwoNumbers {
//     public static void tempVal(int x, int y){
//         int temp = x;
//         x = y;
//         y = temp;
//         System.out.println("x = " + x + ", y = " + y);
//     }

//     public static void main(String[] args){
//         int x = 5;
//         int y = 4;
//         tempVal(x, y);
//     }
// }

// without temp
public class SwapTwoNumbers{
    public static void tempVal(int x, int y){
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(" num1 = " + x + ", num2 = " + y);
    }

    public static void main(String[] args){
        int x = 6;
        int y = 0;
        tempVal(x, y);
    }
}
