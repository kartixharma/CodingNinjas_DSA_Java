public class Solution {
    public static  Node<Integer> swapNodes(Node<Integer> head,int i,int j){
        Node<Integer> temp=head,prev=null,c1=null,c2=null,p1=null,p2=null, t=null;;
        int pos=0;
        if(i==j){
            return head;
        }
        while(temp!=null){
            if(pos==i){
                p1=prev;
                c1=temp;
            }
            else if(pos==j){
                p2=prev;
                c2=temp;
            }
            prev=temp;
            temp=temp.next;
            pos++;
        }
        if(p1!=null){
            p1.next=c2;
        }
        else{
            head=c2;
        }
        if(p2!=null){
            p2.next=c1;
        }
        else{
            head=c1;
        }
        t=c2.next;
        c2.next=c1.next;
        c1.next=t;
        return head;
    }
}