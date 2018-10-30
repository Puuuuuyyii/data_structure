package array;

public class MyCharStack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public MyCharStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }

    /**
     * 入栈操作
     * @param element
     */
    public void push(char element) {
        top ++;
        stackArray[top] = element;
    }

    /**
     * 出栈操作
     * @return
     */
    public char pop() {
        return stackArray[top --];
    }

    /**
     * 读取栈顶元素
     * @return
     */
    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty(){return top == -1;}

    public boolean isFull(){return top == maxSize - 1;}
}
