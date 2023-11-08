public class Solution {
    public static void deleteAlternateNodes(Node<Integer> head) {
        while(head.next!=null){
            if(head.next.next==null || head.next==null){
                head.next=null;
            }
            else{
                head.next=head.next.next;
                head=head.next;
            }
        }
    }
}