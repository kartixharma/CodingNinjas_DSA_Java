public class Solution {
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		return 1+Math.max(height(root.left),height(root.right));
	}
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int opt1=1+height(root.left)+height(root.right);
		int opt2=diameterOfBinaryTree(root.left);
		int opt3=diameterOfBinaryTree(root.right);
		return Math.max(opt1, Math.max(opt2, opt3));
	}
}