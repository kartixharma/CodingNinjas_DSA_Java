public class Solution {
	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if(head==null){
            return head;
        }
        else if(pos==0 && head==null){
            return head;
        }
    	else if(pos==0){
            return head.next;
        }
        else{
            head.next=deleteNodeRec(head.next, pos-1);
            return head;
        }
	}
}