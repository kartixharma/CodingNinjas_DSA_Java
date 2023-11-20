public class Solution {
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root==null){
			return;
		}
		else if(root.left==null && root.right!=null){
			System.out.print(root.right.data+" ");
			printNodesWithoutSibling(root.right);
		}
		else if(root.left!=null && root.right==null){
			System.out.print(root.left.data+" ");
			printNodesWithoutSibling(root.left);
		}
		else{
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}
	}
}