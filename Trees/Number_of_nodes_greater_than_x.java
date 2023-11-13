public class Solution {	
	public static int numNodeGreater(TreeNode<Integer> root,int x){
		return numNodeGreater(root, x, 0);
	}
	public static int numNodeGreater(TreeNode<Integer> root,int x, int n){
		if(root.data>x){
			n++;
			for(TreeNode<Integer> c : root.children){
				n=numNodeGreater(c, x, n);
			}
		}
		else{
			for(TreeNode<Integer> c : root.children){
				n=numNodeGreater(c, x, n);
			}
		}
		return n;
	}
}
