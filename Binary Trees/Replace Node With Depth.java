public class Solution {
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
	    changeToDepthTree(root, 0);
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root, int d){
		if(root==null){
			return;
		}
		root.data=d;
		changeToDepthTree(root.left, d+1);
		changeToDepthTree(root.right, d+1);
	}
}