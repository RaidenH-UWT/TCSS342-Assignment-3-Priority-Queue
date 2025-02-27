public class Testing {
    private static void print(Object object) {
        System.out.println(object);
    }
    public static void main(String[] args) {
        ArrayHeap<Integer> test = new ArrayHeap<>();
        test.addElement(10);
        test.addElement(20);
        print(test);
        print(test.size());
    }
}