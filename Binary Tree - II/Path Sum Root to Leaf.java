import java.util.ArrayList;
public class Solution {
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		ArrayList<Integer> path = new ArrayList<>();
		rootToLeafPathsSumToK(root, k, path);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, ArrayList<Integer> path){
		if(root==null){
			return;
		}
		k-=root.data;
		path.add(root.data);
		if(root.left==null && root.right==null && k==0){
			for(int i : path){
				System.out.print(i+" ");
			}
			System.out.println();
			path.remove(path.size()-1);
			return;
		}
		rootToLeafPathsSumToK(root.left, k, path);
		rootToLeafPathsSumToK(root.right, k, path);
		path.remove(path.size()-1);
	}
}