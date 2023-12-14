import java.util.HashMap;
public class Solution {
	public static long bytelandian(long n, HashMap<Long, Long> memo) {
		if (n < 2) {
			return n;
		}
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		long max = Math.max(n, bytelandian(n/2, memo) + bytelandian(n/3, memo) + bytelandian(n/4, memo));
		memo.put(n, max);
		return max;
	}
}	