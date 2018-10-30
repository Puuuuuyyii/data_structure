package array;

public class MySplit {
    public static void split (char[] array){
        MyCharStack stack = new MyCharStack(100);
        for (int i = 0; i < array.length; i ++){
            if (array[i] == '{' || array[i] == '[' || array[i] == '('){
                stack.push(array[i]);
            }
            if (array[i] == '}' && stack.pop() == '{') {
                System.out.println("有一对大括号");
            }
            if (array[i] == ']' && stack.pop() == '[') {
                System.out.println("有一对中括号");
            }
            if (array[i] == ')' && stack.pop() == '(') {
                System.out.println("有一对小括号");
            }
        }
    }
}
