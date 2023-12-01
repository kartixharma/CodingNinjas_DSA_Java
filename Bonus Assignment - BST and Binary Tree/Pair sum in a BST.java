import java.util.ArrayList;
public class Solution {
	public static void treeToArray(BinaryTreeNode<Integer> root, ArrayList<Integer> arr){
		if(root==null){
			return;
		}
		treeToArray(root.left, arr);
		arr.add(root.data);
		treeToArray(root.right, arr);
	}
	static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {
		ArrayList<Integer> arr=new ArrayList<>();
		treeToArray(root, arr);
		int i=0, j=arr.size()-1;
		while(i<j){
			if(arr.get(i)+arr.get(j)==s){
				System.out.println(arr.get(i)+" "+arr.get(j));
				i++;
				j--;
			}
			else if(arr.get(i)+arr.get(j)>s){
				j--;
			}
			else{
				i++;
			}
		}
	}
}