import java.util.ArrayList;

public class PQ {
	// Complete this class
	ArrayList<Integer> heap ;
	
	public PQ(){
		heap = new ArrayList<Integer>();
	}
	boolean isEmpty() {
		// Implement the isEmpty() function here
		return heap.size()==0;
	}

	int getSize() {
		// Implement the getSize() function here
		return heap.size();
	}

	int getMax() {
		// Implement the getMax() function here
		return heap.get(0);
	}

	void insert(int element) {
		// Implement the insert() function here
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
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

	int removeMax() {
		// Implement the removeMax() function here
		int n = getMax();
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int parent = 0;
		int max = 0;
		int leftChild = 1;
		int rightChild = 2;
		while(leftChild < heap.size()){
			if(heap.get(leftChild) > heap.get(max))
				max = leftChild;
			if(rightChild < heap.size() && heap.get(rightChild) > heap.get(max))
				max = rightChild;
			if(max == parent)
				break;
			int temp = heap.get(parent);
			heap.set(parent, heap.get(max));
			heap.set(max, temp);
			parent = max;
			leftChild = 2 * parent + 1;
			rightChild = 2 * parent + 2;
		}
		return n;
	}
	}
