import java.util.ArrayList;

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty() {
		return heap.size() == 0;
	}

	int size() {
		return heap.size();
	}

	int getMin() throws PriorityQueueException {
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) < heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMin() throws PriorityQueueException{
		if (isEmpty()) {
			// Throw an exception
			throw new PriorityQueueException();
		}
		int n = getMin();
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parent = 0;
		int min = 0;
		int leftChild = 1;
		int rightChild = 2;
		while(leftChild < heap.size()){
			if(heap.get(leftChild) < heap.get(min))
				min = leftChild;
			if(rightChild < heap.size() && heap.get(rightChild) < heap.get(min))
				min = rightChild;
			if(min == parent)
				break;
			int temp = heap.get(parent);
			heap.set(parent, heap.get(min));
			heap.set(min, temp);
			parent = min;
			leftChild = 2 * parent + 1;
			rightChild = 2 * parent + 2;
		}
		return n;
	}
}
class PriorityQueueException extends Exception {

}
