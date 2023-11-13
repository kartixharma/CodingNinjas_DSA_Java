public class Solution {
	public static int sumOfAllNode(TreeNode<Integer> root){
		int sum=root.data;
		for(TreeNode<Integer> c : root.children){
			sum+=sumOfAllNode(c);
		}
		return sum;
	}
}
