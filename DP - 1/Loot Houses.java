public class Solution {
	public static int maxMoneyLooted(int[] houses) {
		if(houses.length==0){
			return 0;
		}
		int[] dp = new int[houses.length];
		dp[0]=arr[0];
		dp[1]=Math.max(houses[0], houses[1]);
		for(int i=2; i<dp.length; i++){
			dp[i]=Math.max(houses[i]+dp[i-2], dp[i-1]);
		}
		return dp[dp.length-1];
	}
}