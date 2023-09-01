
public class Solution {

	public static int lastIndex(int input[], int x) {
		return lastIndex1(input, x, input.length-1);
	}
	public static int lastIndex1(int input[], int x,int L){
		if(L==0){
			return -1;
		}
		if(input[L]==x){
			return L;
		}
		return lastIndex1(input, x, L-1);
	}
	
}