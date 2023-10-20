/*

    Following is the Node class already written for the Linked List

    class Node<T> {
        T data;
        Node<T> next;
    
        public Node(T data) {
            this.data = data;
        }
    }

*/

public class Solution {

	public static Node<Integer> mergeSort(Node<Integer> head) {
        if(head==null || head.next==null){
            return head;
        }
		Node<Integer> mid2 = midPoint(head).next;
        Node<Integer> mid1 = midPoint(head);
        Node<Integer> h2 = mergeSort(mid2);
        mid1.next=null;
        Node<Integer> h1 = mergeSort(head);
        return mergeSortedLL(h1, h2);
	}
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
    public static Node<Integer> mergeSortedLL(Node<Integer> head1, Node<Integer> head2) {
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