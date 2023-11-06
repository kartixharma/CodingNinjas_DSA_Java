import java.util.Stack;
public class Solution {
	public static int[] stockSpan(int[] price) {
  		int[]span = new int[price.length];
  		Stack<Integer> stck = new Stack<Integer>();
  		stck.push(0);
  		span[0] = 1;
  		for(int i = 1 ; i < price.length ; i++){
    		while(!stck.isEmpty() && price[stck.peek()]<price[i]){
        		stck.pop();
    		}
    		if(!stck.isEmpty())
        		span[i] = i - stck.peek();
    		else
        		span[i] = i+1;
    			stck.push(i);
    
  		}
  		return span;
	}
}