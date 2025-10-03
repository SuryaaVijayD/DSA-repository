import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        int l = 0;
        int r = arr.length-1;
        while(l<r){
            if(arr[l] == 0 && arr[r] != 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            } else if(arr[l] != 0){
                l++;
            } else if(arr[r] == 0){
                r--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
