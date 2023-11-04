public class Stack {
    //Define the data members
    private Node head;
    private int size;
    public Stack() {
        //Implement the Constructor
        head = null;
        size = 0;
    }
    /*----------------- Public Functions of Stack -----------------*/
    public int getSize() { 
        //Implement the getSize() function
        return size;
    }
    public boolean isEmpty() {
        //Implement the isEmpty() function
        return (size==0);
    }
    public void push(int element) {
        //Implement the push(element) function
        Node newNode = new Node(element);
        newNode.next=head;
        head=newNode;
        size++;
    }
    public int pop() {
        //Implement the pop() function
        if(isEmpty()){
            return -1;
        }
        int element=head.data;
        Node temp=head.next;
        head.next=null;
        head=temp;
        size--;
        return element;
    }
    public int top() {
        //Implement the top() function
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}