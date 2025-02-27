public class ArrayHeap<T extends Comparable<T>> {
    private Comparable<T>[] array;
    private int size = 0;

    public ArrayHeap() {
        this(10);
    }

    @SuppressWarnings("unchecked")
    public ArrayHeap(int capacity) {
        super();
        array = (Comparable<T>[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addElement(Comparable<T> theElement) {
        // TODO: add a new element to the heap maintaining minHeap, make sure to resize if full. time complexity should be O(log n)
        // if we're at capacity, scale up the size of the array
        if (size == array.length) {
            array = scaleUp();
        }
        array[size] = theElement;
        size++;
        // TODO: heapify
    }

    public Comparable<T> removeMin() {
        // TODO: remove and return the element with the smallest value (index 0) make sure to check for underflow
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        size--;
        // TODO: heapify
        return array[0];
    }

    private Comparable<T>[] scaleUp() {
        @SuppressWarnings("unchecked")
        Comparable<T>[] temp = (Comparable<T>[]) new Comparable[array.length * 2];
        // how tf do i do this in O(log n)
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }

    @Override
    public String toString() {
        String out = "[";
        for (int i = 0; i < size; i++) {
            out+= array[i] + ", ";
        }
        out = out.substring(0, out.length() - 2) + "]";
        return out;
    }
}