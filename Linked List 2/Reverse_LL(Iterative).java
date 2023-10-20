 public class Solution {
	public static Node<Integer> reverse_I(Node<Integer> head){
        if(head==null){
            return head;
        }
        Node<Integer> curr=head, prev=null, temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
	}
 }