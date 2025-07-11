public class Triangle {
    public static boolean isValidTriangle(int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0){
            return false;
        }

        // the third side of a triangle must be less than the sum of the other 2 sides of the triangle

        if ((a + b > c) && 
            (a + b > b) &&
            (b + c > a)) {
            return true;
            } else {
                return false;
            }
    }
    
    public static void main(String[] args) {
        System.out.println("sides (3,4,5)" + isValidTriangle(3, 4, 5));
    }
}
