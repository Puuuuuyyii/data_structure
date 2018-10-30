package array;

public class MyStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    /**
     * 入栈操作
     * @param element
     */
    public void push(int element) {
        top ++;
        stackArray[top] = element;
    }

    /**
     * 出栈操作
     * @return
     */
    public int pop() {
        return stackArray[top --];
    }

    /**
     * 读取栈顶元素
     * @return
     */
    public int peek() {
        return stackArray[top];
    }

    public boolean isEmpty(){return top == -1;}

    public boolean isFull(){return top == maxSize - 1;}
}
