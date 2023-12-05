import java.util.HashMap;
public class Solution {
	public static int getPairsWithDifferenceK(int arr[], int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
		int cnt=0;
        for(int n:arr){	
            if(freq.containsKey(n)){
            	freq.put(n, freq.get(n)+1);
        	}
            else
                freq.put(n,1);  
        }
        if (k==0){
            for (int i: freq.keySet()){
                int val=freq.get(i);
            	cnt+=(val*(val-1))/2;
        	}
            return cnt;
        }
        for (Integer i: freq.keySet()){
            if (freq.containsKey(k+i)){
            	cnt+=(freq.get(i)*freq.get(k+i));
            }
            if (freq.containsKey(i-k)){
            	cnt+=(freq.get(i)*freq.get(i-k));   
            }
        }
        cnt/=2;
        return cnt;
	}
}