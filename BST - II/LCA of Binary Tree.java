public class Solution {
	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null){
			return -1;
		}
		if(root.data==a || root.data==b){
			return root.data;
		}
		int A = getLCA(root.left, a, b);
		int B = getLCA(root.right, a, b);
		if(A!=-1 && B!=-1){
			return root.data;
		}
		if(A!=-1){
			return A;
		}
		if(B!=-1){
			return B;
		}
		return -1;
	}
}