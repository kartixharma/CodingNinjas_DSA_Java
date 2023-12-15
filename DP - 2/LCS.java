public class Solution {
	public static int lcs(String s, String t) {
		if (s == null || t == null || s.length() == 0 || t.length() == 0) {
            return 0;
		}
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                if (s.charAt(i-1) == t.charAt(j-1)) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j-1]+1);
                }
            }
        }
        return dp[m][n];
    }
}