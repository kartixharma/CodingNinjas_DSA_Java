public class Solution {
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTree(postOrder, inOrder, 0, 0, postOrder.length-1, inOrder.length-1);
	}
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder, int poSi, int inSi, int poEi, int inEi) {
		if(poSi>poEi || inSi>inEi){
			return null;
		}
		int r=postOrder[poEi];
		int n=0;
		for(int i=0; i<inOrder.length; i++){
			if(inOrder[i]==r){
				n=i;
				break;
			}
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(r);
		root.left=buildTree(postOrder, inOrder, poSi, inSi, n+poSi-inSi-1, n-1);
		root.right=buildTree(postOrder, inOrder, poSi+n-inSi, n+1, poEi-1, inEi);
		return root;
	}
}