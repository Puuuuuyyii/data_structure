package array;

public class MyQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int length;
    public MyQueue(int maxSize) {
        this.maxSize = maxSize;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        length = 0;
    }

    public void insert(int element) {
        if (rear == maxSize - 1){
            rear = -1;
        }
        queueArray[++ rear] = element;
        length ++;
    }

    public void remove() {
        if (front == maxSize){
            front = 0;
        }
        front ++;
        length --;
    }

    public int peek(){
        return queueArray[front];
    }
    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

}
