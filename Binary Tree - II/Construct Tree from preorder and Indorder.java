public class Solution {
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		return buildTree(preOrder, inOrder, 0, 0, preOrder.length-1, inOrder.length-1);
	}
	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder, int prSi, int inSi, int prEi, int inEi) {
		if(prSi>prEi || inSi>inEi){
			return null;
		}
		int r=preOrder[prSi];
		int n=0;
		for(int i=0; i<inOrder.length; i++){
			if(inOrder[i]==r){
				n=i;
				break;
			}
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(r);
		root.left=buildTree(preOrder, inOrder, prSi+1, inSi, n+prSi-inSi, n-1);
		root.right=buildTree(preOrder, inOrder, prSi+n-inSi+1, n+1, prEi, inEi);
		return root;
	}
}