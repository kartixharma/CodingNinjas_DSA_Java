import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root==null){
			return null;
		}
		if(root.data==data){
			ArrayList<Integer> path = new ArrayList<>();
			path.add(root.data);
			return path;
		}
		ArrayList<Integer> leftPath = getPath(root.left, data);
		if(leftPath!=null){
			leftPath.add(root.data);
			return leftPath;
		}
		ArrayList<Integer> rightPath = getPath(root.right, data);
		if(rightPath!=null){
			rightPath.add(root.data);
			return rightPath;
		}
		return null;
	}
}