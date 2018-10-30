package array;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(10);
        System.out.println(myStack.isEmpty());
        myStack.push(10);
        myStack.push(27);
        myStack.push(56);
        myStack.push(18);
        myStack.push(3);
        myStack.push(6);
        myStack.push(465);
        myStack.push(235);
        myStack.push(968);
        myStack.push(1556);
        System.out.println(myStack.isFull());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
    }
}
