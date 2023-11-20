public class Solution {
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null){
			return 0;
		}
		int h=1;
		h+=Math.max(height(root.left),height(root.right));
		return h;
	}
}