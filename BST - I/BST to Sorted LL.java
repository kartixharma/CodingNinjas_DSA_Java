public class Solution {
	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if(root==null){
			return null;
		}
		LinkedListNode<Integer> curr = new LinkedListNode<>(root.data);
		if(root.left==null && root.right==null){
			return curr;
		}
		if(root.left==null){
			LinkedListNode<Integer> rightLL = constructLinkedList(root.right);
			curr.next=rightLL;
			return curr;
		}
		LinkedListNode<Integer> leftLL = constructLinkedList(root.left);
		LinkedListNode<Integer> head = leftLL;
		while(leftLL.next!=null){
			leftLL=leftLL.next;
		}
		leftLL.next=curr;
		LinkedListNode<Integer> rightLL = constructLinkedList(root.right);
		curr.next=rightLL;
		return head;
	}
}