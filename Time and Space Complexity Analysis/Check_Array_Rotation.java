public class Solution {
    public static int arrayRotateCheck(int[] arr){
        int k=0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                k=i+1;
                break;
            }
        }
        return k;
    }
}