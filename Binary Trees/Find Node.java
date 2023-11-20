import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    Queue<BinaryTreeNode<Integer>> pNodes = new LinkedList<>();
		pNodes.add(root);
		boolean flag = false;
		while(!pNodes.isEmpty()){
			BinaryTreeNode<Integer> front=pNodes.poll();
			if(front.data==x){
				flag = true;
				break;
			}
			if(front.right!=null)
				pNodes.add(front.right);
			if(front.left!=null)
				pNodes.add(front.left);
		}
		return flag;	
	}
}