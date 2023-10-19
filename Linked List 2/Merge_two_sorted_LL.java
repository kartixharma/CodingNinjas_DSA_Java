public class Solution {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer> t1 = head1, t2=head2, t3=head1, head=head1;
        if(t1.data>=t2.data){
            head=t2;
            t3=t2;
            t2=t2.next;
        }
        else{
            head=t1;
            t3=t1;
            t1=t1.next;
        }
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                t3.next=t1;
                t3=t1;
                t1=t1.next;
            }
            else{
                t3.next=t2;
                t3=t2;
                t2=t2.next;
            }
        }
        if(t1==null){
            t3.next=t2;            
        }
        else if(t2==null){
            t3.next=t1;
        }
            
        return head;
    }
}