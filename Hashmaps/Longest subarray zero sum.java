import java.util.HashMap;
public class Solution {
    public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int sum=0;
        int max=0;
        int L=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            if(map.containsKey(sum)){
                int k=map.get(sum);
                int l=i-k;
                L=l;
			}
            else
            	map.put(sum,i);
            if(sum==0)
                L=i+1;
            if(L>max)
                max=L;
        }
	return max;
    }
}