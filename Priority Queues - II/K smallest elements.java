import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		ArrayList<Integer> arr = new ArrayList<>();
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for(int i=0; i<n; i++){
			PQ.add(input[i]);
		}
		for(int j=0; j<k; j++){
			arr.add(PQ.poll());
		}
		return arr;
	}
}