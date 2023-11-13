import java.util.LinkedList;
import java.util.Queue;
public class Solution {
	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> nodes = new LinkedList<>();
		nodes.add(root);
		nodes.add(null);
		while(!nodes.isEmpty()){
			TreeNode<Integer> frnt = nodes.poll();
			if(frnt!=null){
				System.out.print(frnt.data+" ");
				for(TreeNode<Integer> i : frnt.children){
					nodes.add(i);
				}
			}
			else{
				System.out.println();
				if(!nodes.isEmpty()){
					nodes.add(null);	
				}
			}
		}
	}
}
