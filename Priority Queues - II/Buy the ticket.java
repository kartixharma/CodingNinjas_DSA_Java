import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class Solution {
	public static int buyTicket(int input[], int k) {
		Queue<Integer> indices = new LinkedList<>();
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<input.length; i++){
			indices.add(i);
            PQ.add(input[i]);
        }
       	int time=0;
    	while (!indices.isEmpty()){
            if (input[indices.peek()] < PQ.peek()){
                indices.add(indices.poll());
            }
            else{
                int i = indices.poll();
                PQ.poll();
                time++;
                if (i == k){
                    break;
                }
            }
        }
        return time;
	}
}