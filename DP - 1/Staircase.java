public class Solution {
	public static long staircase(int n) {
		if(n==0){
			return 1;
		}
		if(n<3){
			return n;
		}
		long[] storage = new long[n+1];
		storage[0]=1;
		storage[1]=1;
		storage[2]=2;
		for(int i=3; i<n+1; i++){
				storage[i]=storage[i-1]+storage[i-2]+storage[i-3];	
		}
		return storage[n];
	}
}