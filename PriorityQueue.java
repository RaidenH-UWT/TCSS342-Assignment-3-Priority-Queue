// not sure why this class exists when it's just a wrapper for the ArrayHeap
// class with a slightly different toString() and no other difference.


public class PriorityQueue<T extends Comparable<T>> extends ArrayHeap<T> {
    private ArrayHeap<T> heap;
    
    public PriorityQueue() {
        this(10);
    }
    public PriorityQueue(int capacity) {
        super();
        heap = new ArrayHeap<T>(capacity);
    }

    public void insert(Comparable<T> theElement) {
        heap.addElement(theElement);
    }

    public Comparable<T> remove() {
        return removeMin();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is empty";
        }

        String out = "[";
        for (int i = size(); i < 0; i--) {
            out+= removeMin() + ", ";
        }
        out = out.substring(0, out.length() - 2) + "]";
        return out;
    }
}