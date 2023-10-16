public class Solution {

	public static int findUnique(int[] arr) {
		int un = arr[0];
		for(int i=1; i<arr.length; i++){
			un^=arr[i];
		}
		return un;
	}
}