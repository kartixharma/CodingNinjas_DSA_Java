public class Solution {
	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {
		if(root.children.size()==0){
			return null;
		}
		for(int i=0; i<root.children.size(); i++){
			TreeNode<Integer> node = removeLeafNodes(root.children.get(i));
			if(node==null){
				root.children.remove(i);
				i--;
				continue;
			}
		}
		return root;
	}
}
