public class Solution {
	public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        Node<Integer> oddH=null, oddT=null, evenH=null, evenT=null;
        if(head==null || head.next==null){
            return head;
        }
        while(head!=null){
            if(head.data%2!=0){
                if(oddH==null){
                    oddH=head;
                    oddT=head;
                }
                else{
                    oddT.next=head;
                    oddT=head;
                }
        }
            else if(head.data%2==0){
                if(evenH==null){
                    evenH=head;
                    evenT=head;
                }
                else{
                    evenT.next=head;
                    evenT=head;
                }
            }
            
            head=head.next;
	}
    if(evenH==null){
        return oddH;
    }
    else if(oddH==null){
        return evenH;
    }
    else{
        evenT.next=null;    
        oddT.next=evenH;
    }
    return oddH;
}
}