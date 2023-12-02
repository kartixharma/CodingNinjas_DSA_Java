import java.util.ArrayList;
public class Solution {
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		if(root==null){
			return null;
		}
		if(root.left==null && root.right==null){
			ArrayList<Integer> path = new ArrayList<>();
			path.add(root.data);
			return path;
		}
		ArrayList<Integer> LPath = longestRootToLeafPath(root.left);
		ArrayList<Integer> RPath = longestRootToLeafPath(root.right);
		if(LPath==null){
			RPath.add(root.data);
			return RPath;
		}
		if(RPath==null){
			LPath.add(root.data);
			return LPath;
		}
		if(LPath.size()<RPath.size()){
			RPath.add(root.data);
			return RPath;
		}
		else{
			LPath.add(root.data);
			return LPath;
		}
	}
}