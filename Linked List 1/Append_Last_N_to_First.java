public class Solution {
	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
		Node<Integer> temp =head;
		int lstindx=0;
		if(temp!=null){
		while(true){
			if(temp.next==null){
				temp.next=head;
				lstindx++;
				break;
			}
			temp=temp.next;
			lstindx++;
		}
		temp=head;
		int strtindx=lstindx-n-1;
		int i=0;
		while(true){
			if(i==strtindx){
				head=temp.next;
				temp.next=null;
				break;
			}
			temp=temp.next;
			i++;
		}
		}
		return head;
	}
}