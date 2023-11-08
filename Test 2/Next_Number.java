public class Solution {
	public static LinkedListNode<Integer> nextLargeNumber(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp=head, prev=null;
		LinkedListNode<Integer> zero = new LinkedListNode<>(0);
		if(head==null){
			return null;
		}
		else if(head.next==null){
			head.data+=1;
			return head;
		}
		while(temp.next!=null){
			prev=temp;
			temp=temp.next;
		}
		if(temp.data==9){
			temp.data=0;
			while(prev.data==9){
				prev.data=0;
				if(prev==head){
					temp=head;
					while(temp.next!=null){
						temp=temp.next;
					}
					temp.next=zero;
					break;
				}
				temp=head;
				while(temp.next!=prev){
					temp=temp.next;
				}
				prev=temp;
			}
			prev.data+=1;
		}
		else{
			temp.data+=1;
		}
		return head;
	}
}