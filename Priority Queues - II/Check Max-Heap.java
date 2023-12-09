public class Solution {
	public static boolean checkMaxHeap(int arr[]) {
		return checkMaxHeap(arr, 0);
	}
	public static boolean checkMaxHeap(int arr[], int parent){
		if(parent>=arr.length){
			return true;
		}
		if(2*parent+1>=arr.length){
			return true;
		}
		if(2*parent+2>=arr.length){
			return arr[parent]>arr[2*parent+1];
			
		}
		if(arr[parent]>arr[2*parent+1] && arr[parent]>arr[2*parent+2])
			return checkMaxHeap(arr, 2*parent+1) && checkMaxHeap(arr, 2*parent+2);
		return false;
	}
	
}