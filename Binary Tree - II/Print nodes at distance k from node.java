public class Solution {
	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
	  	nodesAtDistanceK1(root, node, k);
	}
	public static int nodesAtDistanceK1(BinaryTreeNode<Integer> root, int node, int k) {
		if(root==null){
			return -1;
		}
		if(root.data==node){
			helper(root, k);
			return 0;
		}
		int LDist = nodesAtDistanceK1(root.left, node, k);
		if(LDist!=-1){
			if(LDist+1==k){
				System.out.println(root.data);
			}
			else{
				helper(root.right, k-LDist-2);
				return LDist+1;
			}
		}
		int RDist = nodesAtDistanceK1(root.right, node, k);
		if(RDist!=-1){
			if(RDist+1==k){
				System.out.println(root.data);
			}
			else{
				helper(root.left, k-RDist-2);
				return RDist+1;
			}
		}
		return -1;
	}
	public static void helper(BinaryTreeNode<Integer> root, int k){
		if(root==null){
		   return;
	   }
		if(k==0){
			System.out.println(root.data);
		}
		helper(root.left, k-1);
		helper(root.right, k-1);
	}
}