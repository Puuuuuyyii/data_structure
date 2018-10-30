package linked;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.insertFirst(45);
        linkedList.insertFirst(22);
        linkedList.insertFirst(16);
        linkedList.insertFirst(98);
        linkedList.insertFirst(1);
        linkedList.insertFirst(65);
        linkedList.insertFirst(98);
        linkedList.insertFirst(12);
        linkedList.insertFirst(34);
        linkedList.select(1);
        linkedList.disPlayAll();
        linkedList.deleteByValue(1);
        linkedList.select(1);
        linkedList.disPlayAll();
        linkedList.deleteByIndex(4);
        linkedList.disPlayAll();

    }
    private static int roundUpToPowerOf2(int number) {
        // assert number >= 0 : "number must be non-negative";
        return number >= 1 << 30
                ? 1 << 30
                : (number > 1) ? Integer.highestOneBit((number - 1) << 1) : 1;
    }

}
