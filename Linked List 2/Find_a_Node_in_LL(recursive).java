public class Solution {
	public static int findNodeRec(Node<Integer> head, int n) {
    	return findNodeRec(head, n, 0);
	}
    public static int findNodeRec(Node<Integer> head, int n, int i) {
    	if(head==null){
            return -1;
        }
        else if(head.data==n){
            return i;
        }
        return findNodeRec(head.next, n, ++i);
	}
}