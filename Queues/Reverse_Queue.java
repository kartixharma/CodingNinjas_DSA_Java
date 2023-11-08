import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static void reverseQueue(Queue<Integer> input) {
		if(input.size()==0 || input.size()==1){
            return;
        }
        int temp=input.poll();
        reverseQueue(input);
        input.add(temp);
	}
}