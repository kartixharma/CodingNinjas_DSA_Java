public class Solution {
	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		int n=0;
		if(root==null){
			return 0;
		}
		else if(root.data>x){
			n++;
			n+=countNodesGreaterThanX(root.left, x);
			n+=countNodesGreaterThanX(root.right, x);
			return n;
		}
		n+=countNodesGreaterThanX(root.left, x);
		n+=countNodesGreaterThanX(root.right, x);
		return n;
	}
}