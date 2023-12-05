import java.util.HashMap;
public class Solution {
	public static void printIntersection(int[] arr1,int[] arr2){
		HashMap<Integer, Integer> freq = new HashMap<>();
		for(int n : arr1){
			if(freq.containsKey(n))
				freq.put(n, freq.get(n)+1);
			else
			freq.put(n, 1);	
		}
		for(int n : arr2){
			if(freq.containsKey(n)){
				if(freq.get(n)==0){
				continue;
			}
				System.out.println(n);
				freq.put(n, freq.get(n)-1);
			}
		}
	}
