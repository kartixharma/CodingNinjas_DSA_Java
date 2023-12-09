import java.util.PriorityQueue;
public class Solution {
	public static int kthLargest(int n, int input[], int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		int i=0;
		for( ; i<k; i++){
			PQ.add(input[i]);
		}
		for( ; i<input.length; i++){
			int min = PQ.peek();
			if(min<input[i]){
				PQ.poll();
				PQ.add(input[i]);
			}
		}
		return PQ.peek();
	}
}