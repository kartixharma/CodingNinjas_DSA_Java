import java.util.ArrayList;
import java.util.PriorityQueue;
public class Solution {
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		ArrayList<Integer> arr = new ArrayList<>();
		PriorityQueue<Integer> PQ = new PriorityQueue<>();
		for(int i=0; i<input.size(); i++){
			for(int j=0; j<input.get(i).size(); j++){
				PQ.add(input.get(i).get(j));
			}
		}
		while(!PQ.isEmpty()){
			arr.add(PQ.poll());
		}
		return arr;
	}
}