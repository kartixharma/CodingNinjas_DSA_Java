public class Solution {
	public static Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> prev = head;
		if(head==null){
			return head;
		}
		if(head.next==null){
			return head;
		}
        while(temp!=null){
			if(prev.data.equals(temp.data)){
				prev.next=temp.next;
				temp=temp.next;
				continue;
			}
			prev=temp;
			temp=temp.next;
		}
		return head;
	}
}