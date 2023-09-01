public class Solution {
	public static int sum(int input[]) {
		if(input.length==0){
			return 0;
		}
		int sinput[]= new int[input.length-1];
		for(int i=1; i<input.length; i++){
			sinput[i-1]=input[i];
		}
		return input[0]+sum(sinput);
	}
}