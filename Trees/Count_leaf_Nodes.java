public class Solution {
	public static int countLeafNodes(TreeNode<Integer> root){
		if(root==null){
			return 0;
		}
		int sum=0;
		if(root.children.isEmpty()){
			return 1;
		}
		for(TreeNode<Integer> c : root.children){
			sum+=countLeafNodes(c);
		}
		return sum;
	}
}