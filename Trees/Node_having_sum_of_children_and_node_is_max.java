public class Solution {
	public static int treeSum(TreeNode<Integer> root){
		int sum=root.data;
		for(TreeNode<Integer> c : root.children){
			sum+=c.data;
		}
		return sum;
	}
	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
		TreeNode<Integer> maxNode=null;
		int rootSum=treeSum(root);
		int max=Integer.MIN_VALUE;
		for(TreeNode<Integer> c : root.children){
			TreeNode<Integer> maxNode1=null;
			int childSum;
			maxNode1 = maxSumNode(c);
			childSum=treeSum(maxNode1);
			if(childSum>max){
				max=childSum;
				maxNode=maxNode1;
			}
		}
		if(rootSum>max){
			return root;
		}
		return maxNode;
	}
}
