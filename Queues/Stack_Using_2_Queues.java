import java.util.LinkedList;
import java.util.Queue;
public class Stack {
    //Define the data members
    Queue<Integer> q1;
    Queue<Integer> q2;
    int size;
    public Stack(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
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
        q1.add(element);
        size++;
    }
    public int pop() {
        //Implement the pop() function
        if(size==0){
            return -1;
        }
        size--;
        for(int i=0; i<size; i++){
            q2.add(q1.poll());
        }
        int d = q1.poll();
        for(int i=0; i<size; i++){
            q1.add(q2.poll());
        }
        return d;
    }
    public int top() {
        //Implement the top() function
        if(size==0){
            return -1;
        }
        for(int i=1; i<size; i++){
            q2.add(q1.poll());
        }
        int top = q1.peek();
        q2.add(q1.poll());
        for(int i=0; i<size; i++){
            q1.add(q2.poll());
        }
       q2 = new LinkedList<>();
        return top;
    }
}