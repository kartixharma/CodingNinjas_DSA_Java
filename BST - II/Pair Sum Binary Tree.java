import java.util.ArrayList;
import java.util.Collections;
public class Solution {
	public static void treeToArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
		if(root==null){
			return;
		}
		arr.add(root.data);
		treeToArray(root.left, arr);
		treeToArray(root.right, arr);
	}
	static void pairSum(BinaryTreeNode<Integer> root, int sum) {
		ArrayList<Integer> arr=new ArrayList<>();
		treeToArray(root, arr);
		Collections.sort(arr);
		int i=0, j=arr.size()-1;
		while(i<j){
			if(arr.get(i)+arr.get(j)==sum){
				System.out.println(arr.get(i)+" "+arr.get(j));
				i++;
				j--;
			}
			else if(arr.get(i)+arr.get(j)>sum){
				j--;
			}
			else{
				i++;
			}
		}
	}
}