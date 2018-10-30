package array;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        System.out.println(myQueue.isEmpty());
        myQueue.insert(10);
        myQueue.insert(27);
        myQueue.insert(56);
        myQueue.insert(18);
        myQueue.insert(3);
        myQueue.insert(6);
        myQueue.insert(465);
        myQueue.insert(235);
        myQueue.insert(968);
        myQueue.insert(1556);
        System.out.println(myQueue.isFull());
        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());
        myQueue.remove();
        System.out.println(myQueue.peek());
    }
}
