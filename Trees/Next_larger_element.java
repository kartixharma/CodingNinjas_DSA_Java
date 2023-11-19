public class Solution {
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		TreeNode<Integer> node=null;
		int min=Integer.MAX_VALUE;
			for(TreeNode<Integer> c : root.children){
				TreeNode<Integer> temp = findNextLargerNode(c, n);
				if(temp==null){
					continue;
				}
				if(temp.data<min && temp.data>n){
					min=temp.data;
					node=temp;
				}
			}
			if(root.data<min && root.data>n){
				return root;
			}
			return node;
	}
}