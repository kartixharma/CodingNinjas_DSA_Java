import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> pNodes = new LinkedList<>();
		pNodes.add(root);
		while(!pNodes.isEmpty()){
			BinaryTreeNode<Integer> front=pNodes.poll();
			if(front.left==null)
				System.out.print(front.data+":L:"+(-1)+",");
			else{
				System.out.print(front.data+":L:"+front.left.data+",");
				pNodes.add(front.left);
			}
			if(front.right==null)
				System.out.println("R:"+(-1));
			else{
				System.out.println("R:"+front.right.data);
				pNodes.add(front.right);
			}
		}
	}
}