public class Solution {
	public static int findNode(Node<Integer> head, int n) {
		Node<Integer> temp=head;
		int indx=0;
		while(temp!=null){
			if(temp.data==n){
				return indx;
			}
			temp=temp.next;
			indx++;
		}
		return -1;
	}
}