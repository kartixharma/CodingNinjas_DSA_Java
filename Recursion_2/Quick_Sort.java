public class Solution {
	public static int pivot(int[] arr, int s, int e){
	int p = arr[e];
	int pindx=s-1;
	for(int i=s; i<=e; i++){
		if(arr[i]<p){
			pindx++;
			int temp=arr[i];
			arr[i]=arr[pindx];
			arr[pindx]=temp;
		}
	}
	pindx++;
	int temp=arr[pindx];
	arr[pindx]=p;
	arr[e]=temp;
	return pindx;
	}
	public static void quickSort(int[] input,int s, int e) {
		if(s>=e){
			return;
		}
		int pindx=pivot(input, s, e);
		quickSort(input, s, pindx-1);
		quickSort(input, pindx+1, e);
	}	
}