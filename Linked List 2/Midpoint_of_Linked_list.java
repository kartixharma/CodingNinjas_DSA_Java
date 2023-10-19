public class Solution {
    public static Node<Integer> midPoint(Node<Integer> head) {
        Node<Integer> slow = head, fast=head;
        if(head!=null){
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        }
        return slow;
    }
}