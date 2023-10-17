public class Solution {
    public static int length(Node head){
        Node temp = head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }
}