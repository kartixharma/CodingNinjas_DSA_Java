public class Solution {
	public static void replaceWithDepthValue(TreeNode<Integer> root){
		replaceWithDepthValue(root, 0);
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root, int d){
		root.data=d;
		for(TreeNode<Integer> c : root.children){
			replaceWithDepthValue(c, d+1);
		}
	}
}
