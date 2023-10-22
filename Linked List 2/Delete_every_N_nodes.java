public class Solution {
	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        Node<Integer> temp=head, temp1=null;
        if(M==0){
            return null;
        }
        while(temp!=null){
            int m=1;
            int n=1;
            while(m<M && temp.next!=null){
                temp=temp.next;
                m++;
            }
            temp1=temp;
            while(n<=N && temp.next!=null){
                temp=temp.next;
                n++;
            }
            temp1.next=temp.next;
            temp=temp.next;
        }
        return head;
	}
}