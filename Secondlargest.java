import java.util.Arrays;

public class Secondlargest {
    public static void main (String[] args){
        int [] nums = {6,7,4,3,2,1};
        Arrays.sort(nums);
        int seclarge = nums[nums.length - 2];
        System.out.println("the second largest number is" + seclarge);
    }
}
