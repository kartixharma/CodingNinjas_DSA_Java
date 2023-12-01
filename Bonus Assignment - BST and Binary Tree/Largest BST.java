public class Solution {
	public static boolean isBST(BinaryTreeNode<Integer> root, int min, int max){
		if(root==null){
			return true;
		}
		else if(!(root.data>min && root.data<max)){
			return false;
		}
		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		if(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
			return height(root);
		}
		return Math.max(largestBSTSubtree(root.left), largestBSTSubtree(root.right));
	}
}