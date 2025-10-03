public class MaxConsectiveElement {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int max = -1; // 2
        int count = 0; // 3
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 1){
                if(count > max){
                    max = count;
                }
                count = 0;
            } else{
                count++;
            }
        }
        System.out.println(Math.max(max, count));
    }
}
