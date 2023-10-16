import java.util.*;
import java.lang.*;
public class solution {

    public static int maximumProfit(int budget[]) {
	    
        Arrays.sort(budget);
        int ans=Integer.MIN_VALUE;
        int l=budget.length;
    	for(int i=0;i<l;i++)
    	{
        	ans=Math.max(ans,budget[i]*(l-i));
    	}
    	return ans;
        
	}
}