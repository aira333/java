public class countEvenOdd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int [] arr = {3,5,4,2,7,9};

        for (int num : arr) {
            if (num % 2 == 0) 
                even++;
            else 
                odd++;
        }
        
        System.out.println("even " + even + "odd " + odd);
    }
}
