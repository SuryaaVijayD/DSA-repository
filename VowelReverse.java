import java.util.Arrays;
import java.util.Scanner;

public class VowelReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();

        int l = 0; //icecream
        int r = s.length()-1;

        while(l<r){
            if(check(arr[l]) && check(arr[r])){
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r]= temp;
                l++;
                r--;
            }
            else if(!check(arr[r])){
                r--;
            } else if(!check(arr[l])){
                l++;
            }  else{
                l++;
                r--;
            }
        }
        System.out.println(new String(arr));
    }
    public static boolean check(char ch){
        String[] vowels = {"a", "e", "i", "o", "u"};
        for(int i=0;i<vowels.length;i++){
            if(String.valueOf(ch).equals(vowels[i]) || String.valueOf(ch).equals(vowels[i].toUpperCase())){
                return true;
            }
        }
        return false;
    }
}
