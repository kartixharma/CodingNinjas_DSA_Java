public class Solution {
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		Node<Integer> temp = head;
		Node<Integer> prev = head;
		int indx=0;
        while(temp!=null){
			if(pos==0){
				head=head.next;
				break;
			}
			else if(indx==pos){
				prev.next=temp.next;
			}
			prev=temp;
			temp=temp.next;
			indx++;
		}
	return head;
	}
}