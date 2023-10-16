public class Solution {
	public static int findDuplicate(int[] arr) {
		int n=arr.length-2;
		int nsum=n*(n+1)/2;
		int asum=0;
		for(int i=0; i<arr.length;i++){
			asum+=arr[i];
		}
		return asum-nsum;
	}
}