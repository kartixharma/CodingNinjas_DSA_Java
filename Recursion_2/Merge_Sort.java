public class Solution {
    public static void sort(int[] arr, int s, int mid, int e){
        int merged[]=new int[e-s+1];
        int x=0;
        int indx1=s;
        int indx2=mid+1;
        while(indx1<=mid && indx2<=e){
            if(arr[indx1]>=arr[indx2]){
                merged[x++]=arr[indx2++];
            }
            else{
                merged[x++]=arr[indx1++];
            }
        }
        while(indx1<=mid){
            merged[x++]=arr[indx1++];
        }
        while(indx2<=e){
            merged[x++]=arr[indx2++];
        }
        for(int i=0, j=s; i<merged.length; i++, j++){
                arr[j]=merged[i];
            }
    }
    public static void mergeSort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        sort(arr, s, mid, e);
    }
}
