public class Solution {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null){
			return;
		}
		BinaryTreeNode<Integer> temp=root.left;
		BinaryTreeNode<Integer> dup=new BinaryTreeNode<>(root.data);
		root.left=dup;
		dup.left=temp;
		insertDuplicateNode(dup.left);
		insertDuplicateNode(root.right);
	}	
}