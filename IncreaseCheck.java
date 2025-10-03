import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncreaseCheck {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,5};
        System.out.println(check(arr));
    }
    public static boolean check(int[] arr){
        int ptr = 1; // 1,2,0,4,5
        for(int i=0;i<arr.length;i++){
            if(ptr < arr.length && arr[i] > arr[ptr]){
                return false;
            }
            ptr++;
        }
        return true;
    }
}
