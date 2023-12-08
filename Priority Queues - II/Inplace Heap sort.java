public class Solution {
	public static int removeMin(int[] heap, int size) {
		int n = heap[0];
		heap[0] = heap[size-1];
		size--;
		int parent = 0;
		int min = 0;
		int leftChild = 1;
		int rightChild = 2;
		while(leftChild < size){
			if(heap[leftChild]< heap[min])
				min = leftChild;
			if(rightChild < size && heap[rightChild] < heap[min])
				min = rightChild;
			if(min!=parent){
			int temp = heap[parent];
			heap[parent] = heap[min];
			heap[min] = temp;
			parent = min;
			leftChild = 2 * parent + 1;
			rightChild = 2 * parent + 2;
			}
			else{
				break;
			}
		}
		return n;
	}
	public static void inplaceHeapSort(int arr[]) {
		// building heap
		for(int i=0; i<arr.length; i++){
			int child=i;
			int parent=(i-1)/2;
			while(child>0){
				if(arr[child]<arr[parent]){
					int tmp=arr[child];
					arr[child]=arr[parent];
					arr[parent]=tmp;
					child=parent;
					parent=(child-1)/2;
				}
				else
					break;
			}
		}
		//Heapify & Sorting
		int size=arr.length;
		for(int i=arr.length; i>0; i--){
			arr[i-1] = removeMin(arr, i);
		}
	}
}