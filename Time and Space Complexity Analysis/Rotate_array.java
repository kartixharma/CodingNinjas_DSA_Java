public class Solution {  
    public static void rotate(int[] arr, int d) {
        int si=0;
        int ei=arr.length-1;
    	while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            ei--;
            si++;
        }
        si=0;
        ei=arr.length-d-1;
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            ei--;
            si++;
    }
        si=arr.length-d;
        ei=arr.length-1;
        while(si<ei){
            int temp=arr[si];
            arr[si]=arr[ei];
            arr[ei]=temp;
            ei--;
            si++;
    }
}
}