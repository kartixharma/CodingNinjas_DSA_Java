
public class Solution {

	public static int firstIndex(int input[], int x) {
		return firstIndex1(input, x, 0);
	}
	public static int firstIndex1(int input[], int x, int s){
		if(s==input.length-1){
			return -1;
		}
		if(input[s]==x){
			return s;
		}
		return firstIndex1(input,x,s+1);
	}
}