public class areaofCircle {
    public static double area(int radius){
        return Math.PI * radius * radius;
    }
    
    public static void main(String[] args) {
        int radius = 5;
        double area = area(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);
    }
}
