import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {
	public static ArrayList<Integer> kLargest(int input[], int k) {
		ArrayList<Integer> arr = new ArrayList<>();
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
		for(int j=0; j<k; j++){
			arr.add(PQ.poll());
		}
		return arr;
	}
}