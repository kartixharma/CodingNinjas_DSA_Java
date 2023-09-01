public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		if(input.length==0){
			return false;
		}
		int sinput[]= new int[input.length-1];
		for(int i=1; i<input.length; i++){
			sinput[i-1]=input[i];
		}
		if(input[0]==x){
			return true;
		}
		return checkNumber(sinput, x);
	}
}