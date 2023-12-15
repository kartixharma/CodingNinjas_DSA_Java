public class Solution {
	public static int minCostPath(int[][] input) {
		int n=input.length, m=input[0].length;
		int[][] dp=new int[n+1][m+1];
		for(int i=0; i<=n; i++){
			for(int j=0; j<=m; j++){
				dp[i][j]=Integer.MAX_VALUE;
			}
		}
		for (int i=n-1; i>=0; i--){
			for (int j=m-1; j>=0; j--){
				if (i==n-1 && j==m-1){
					dp[i][j]=input[i][j];
				}else{
				dp[i][j]=input[i][j]+Math.min(dp[i+1][j], Math.min(dp[i][j+1], dp[i+1][j+1]));
				}
			}
		}
		return dp[0][0];
	}
}