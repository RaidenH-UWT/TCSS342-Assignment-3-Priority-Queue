/*
 * parent = (i - 1) / 2
 * lChild = 2i + 1
 * rChild = 2i + 2
 */

@SuppressWarnings("rawtypes") // I PROMISE THEY'RE PARAMETERIZED
public class ArrayHeap<T extends Comparable<T>> {
    private Comparable[] array;
    private int size = 0;

    public ArrayHeap() {
        this(10);
    }

    public ArrayHeap(int capacity) {
        super();
        array = (Comparable[]) new Comparable[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    public void addElement(Comparable theElement) {
        // if we're at capacity, scale up the size of the array
        if (size == array.length) {
            array = scaleUp();
        }
        array[size] = theElement;
        size++;
        if (theElement.compareTo(array[0]) < 0) heapUp(size - 1);
    }

    public Comparable removeMin() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Heap is empty");
        }
        if (size == 1) {
            Comparable temp = array[0];
            array[0] = null;
            size--;
            return temp;
        }
        Comparable temp = array[0];
        array[0] = array[size - 1];
        size--;
        heapDown(0);
        return temp;
    }

    @SuppressWarnings("unchecked")
    private void heapUp(int index) {
        int pIndex = (index - 1) / 2;
        if (array[index].compareTo(array[pIndex]) < 0) {
            swap(index, (index - 1) / 2);
        }
        if (pIndex > 0) heapUp(pIndex);
    }

    @SuppressWarnings("unchecked")
    private void heapDown(int index) {
        // start out with the left child
        int less = (2 * index) + 1;
        // compare with right child, reassign if less than
        if (array[less + 1].compareTo(array[less]) < 0) {
            less++;
        }
        // swap if less is less than index
        if (array[less].compareTo(array[index]) < 0) {
            swap(index, less);
            if ((less * 2) + 1 < size) heapDown(less);
        }
    }

    private void swap(int indexA, int indexB) {
        Comparable temp = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = temp;
    }

    private Comparable[] scaleUp() {
        Comparable[] temp = (Comparable[]) new Comparable[array.length * 2];
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