import java.util.Arrays;

public class sortArray {
    public static void main(String[] args) {
        int arr [] = {3,7,8,9,5};

        for (int i = 1; i < arr.length; i++){
            for (int j = i + 1; i < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
            }
        }

        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}
