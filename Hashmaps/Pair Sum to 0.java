import java.util.*;
public class Solution {
	public static int PairSum(int[] input, int size) {
		HashMap<Integer, Integer> freq = new HashMap<>();
		int cnt=0;
		for(int n : input){
			if(freq.containsKey(-n)){
					cnt+=freq.get(-n);
				if(freq.containsKey(n))
					freq.put(n, freq.get(n)+1);
				else
					freq.put(n, 1);
			}
			else
				if(freq.containsKey(n))
					freq.put(n, freq.get(n)+1);
				else
					freq.put(n, 1);
		}
		return cnt;
	}
}