import java.util.HashMap;
public class Solution {
    public static int maxFrequencyNumber(int[] arr){ 
		HashMap<Integer, Integer> freq = new HashMap<>();
		for(int n : arr){
			if(freq.containsKey(n)){
				int i = freq.get(n);
				freq.put(n, i+1);
				continue;
			}
			freq.put(n, 1);
		}
		int maxValue=0;
		int maxKey=0;
		for(int n : arr){
			if(freq.get(n)>maxValue){
				maxValue=freq.get(n);
				maxKey=n;
			}
		}
		return maxKey;
	}
}