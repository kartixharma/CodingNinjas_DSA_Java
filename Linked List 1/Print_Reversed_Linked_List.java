public class Solution {
	public static void printReverse(Node<Integer> root) {
		if(root==null){
			return;
		}
		if(root.next==null){
			System.out.print(root.data+" ");	
			return;
		}
		printReverse(root.next);
		System.out.print(root.data+" ");
	}
}