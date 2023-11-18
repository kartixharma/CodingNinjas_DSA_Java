import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		Queue<TreeNode<Integer>> pNodes = new LinkedList<>();
		boolean flag = false;
		pNodes.add(root);
		while(!pNodes.isEmpty()){
			TreeNode<Integer> temp = pNodes.poll();
			if(temp.data==x){
				flag = true;
				break;
			}
			for(TreeNode<Integer> c : temp.children){
				pNodes.add(c);
			}
		}
		return flag;	
	}
}
