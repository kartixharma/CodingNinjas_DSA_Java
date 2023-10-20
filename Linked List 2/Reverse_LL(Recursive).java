public class Solution {
	public static Node<Integer> reverseRec(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> tail = head.next;
		Node<Integer> smallLL = reverseRec(head.next);
        tail.next=head;
        head.next=null;
        return smallLL;
	}
}