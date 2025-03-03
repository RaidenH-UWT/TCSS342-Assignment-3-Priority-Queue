public class Testing {
    private static void print(Object object) {
        System.out.println(object);
    }
    public static void main(String[] args) {
        // ArrayHeap<Integer> testAH = new ArrayHeap<>();
        // testAH.addElement(10);
        // print(testAH);
        // testAH.addElement(20);
        // print(testAH);
        // testAH.addElement(30);
        // print(testAH);
        // testAH.addElement(5);
        // print(testAH);
        // testAH.addElement(40);
        // print(testAH);
        // testAH.addElement(3);
        // print(testAH);
        // testAH.addElement(2);
        // print(testAH);

        // testAH.removeMin();
        // print(testAH);
        // testAH.removeMin();
        // print(testAH);

        PriorityQueue<Integer> testPQ = new PriorityQueue<>();
        testPQ.insert(10);
        print(testPQ);
        testPQ.insert(20);
        print(testPQ);
        testPQ.insert(30);
        print(testPQ);
        testPQ.insert(5);
        print(testPQ);
        testPQ.insert(40);
        print(testPQ);
        testPQ.insert(3);
        print(testPQ);
        testPQ.insert(2);
        print(testPQ);

        testPQ.remove();
        print(testPQ);
        testPQ.remove();
        print(testPQ);
    }
}