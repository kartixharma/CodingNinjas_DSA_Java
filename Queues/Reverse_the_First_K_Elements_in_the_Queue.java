import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        if (input.size()==0 || input.size()==1 || k==0 || k==1){
            return input;
        }
        reverse(input,k);
        for (int i=0;i<input.size()-k;i++){
        	input.add(input.poll());
        }
        return input;
	}
    public static void reverse(Queue<Integer> input, int k) {
        if (k==0) {
            return;
        }
        int data=input.remove();
        reverse(input,k-1);
        input.add(data);
	}
}