public class Solution {
	public static int getHeight(TreeNode<Integer> root){
		int h=0;
		for(TreeNode<Integer> c : root.children){
			int ch = getHeight(c);
			h=Math.max(ch, h);
		}
		h++;
		return h;
	}
}