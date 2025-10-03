import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(largestElement(new int[]{1, 2, 3, 4, 8, 12, 0}));
    }
    public static int largestElement(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i:nums){
            arr.add(i);
        }
        Collections.sort(arr);
        return arr.getLast();

    }
}