public class Solution {
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		replaceWithLargerNodesSum(root, 0);
	}
	public static int replaceWithLargerNodesSum(BinaryTreeNode<Integer> root, int sum){
		if(root==null){
			return 0;
		}
		int data=root.data;
		int rs=replaceWithLargerNodesSum(root.right, sum);
		root.data+=rs+sum;
		int ls=replaceWithLargerNodesSum(root.left, root.data);
		return ls+data+rs;
	}
}