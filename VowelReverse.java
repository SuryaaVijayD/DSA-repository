import java.util.Scanner;
import java.util.Arrays;
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
/* Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.



Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"



Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.*/
