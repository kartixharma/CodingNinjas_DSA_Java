public class Solution {
	public static void printIthNode(Node<Integer> head, int i){
		Node<Integer> temp = head;
		int indx=0;
        while(temp!=null){
			temp=temp.next;
			indx++;
			if(indx==i){
				System.out.println(temp.data);
			}
		}
    }
}