public class Solution {

	public static int[] allIndexes(int input[], int x) {
		return allIndexes1(input, x, 0);
	}
	public static int[] allIndexes1(int input[], int x, int s){
		if(s==input.length){
			int in=0;
			for(int i=0; i<input.length; i++){
				if(input[i]!=0){
					in++;
				}
			}
			int arr[]=new int[in];
			in=0;
			for(int i=0; i<input.length; i++){
				if(input[i]!=0){
					arr[in]=i;
					in++;
				}
			}
			return arr;
		}
		if(input[s]!=x){
			input[s]=0;
		}
		return allIndexes1(input, x, s+1);
	}
}