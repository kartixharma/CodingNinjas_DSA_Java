public class Queue {
	//Define the data members
	Node front=null;
	Node rear=null;
	int size=0;
	/*----------------- Public Functions of Stack -----------------*/
	public int getSize() { 
		//Implement the getSize() function
		return size;
    }
    public boolean isEmpty() { 
    	//Implement the isEmpty() function
		return (size==0);
    }
    public void enqueue(int data) {
		//Implement the enqueue(element) function
		Node newNode = new Node(data);
		if(size==0){
			front=newNode;
			rear=newNode;
			size=1;
		}
		else{
		rear.next=newNode;
		rear=newNode;
		size++;
		}
    }
    public int dequeue() {
		//Implement the dequeue() function
		if(size==0){
			return -1;
		}
		int d=front.data;
		front=front.next;
		size--;
		return d;
    }
    public int front() {
    	//Implement the front() function
		if(size==0){
			return -1;
		}
		return front.data;
    }
}