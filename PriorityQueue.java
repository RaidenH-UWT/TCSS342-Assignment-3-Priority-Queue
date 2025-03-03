// not sure why this class exists when it's just a wrapper for the ArrayHeap
// class with a slightly different toString() and no other difference.

@SuppressWarnings("rawtypes") // I PROMISE THEY'RE PARAMETERIZED
public class PriorityQueue<T extends Comparable<T>> {
    private ArrayHeap<T> heap;
    
    public PriorityQueue() {
        this(10);
    }
    public PriorityQueue(int capacity) {
        super();
        heap = new ArrayHeap<T>(capacity);
    }

    public void insert(Comparable theElement) {
        heap.addElement(theElement);
    }

    public Comparable remove() {
        return heap.removeMin();
    }

    @Override
    public String toString() {
        // TODO: create a copy of heap so that you can print without removing stuff from 
        if (heap.isEmpty()) {
            return "Queue is empty";
        } else {
            return heap.toString();
        }
    }
}