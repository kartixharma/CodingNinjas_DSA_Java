public class Solution {
	public static void printPostOrder(TreeNode<Integer> root){
		for(TreeNode<Integer> c : root.children){
			printPostOrder(c);
		}
		System.out.print(root.data+" ");
	}
}