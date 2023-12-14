public class Solution {
	public static int minCount(int n) {
		int[] dp = new int[n+1];
		dp[0]=0;
		for(int i=1; i<=n; i++){
			int min = Integer.MAX_VALUE;
			for(int j=1; j*j<=i; j++){
				int cur = dp[i-(j*j)];
				if(min > cur){
					min = cur;
				}
			}
			dp[i] = 1+min;
		}
		return dp[n];
	}
}