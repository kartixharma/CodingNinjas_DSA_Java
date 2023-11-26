public class Solution {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pNodes = new LinkedList<>();
		pNodes.add(root);
		pNodes.add(null);
		while(!pNodes.isEmpty()){
			BinaryTreeNode<Integer> top=pNodes.poll();
			if(top!=null){
				System.out.print(top.data+" ");
				if(top.left!=null){
					pNodes.add(top.left);
				}
				if(top.right!=null){
					pNodes.add(top.right);
				}
			}
			else{
				if(!pNodes.isEmpty()){
					pNodes.add(null);
					System.out.println();
				}
			}
		}
	}
}