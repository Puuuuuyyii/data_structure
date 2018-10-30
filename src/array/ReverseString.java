package array;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            char[] array = string.toCharArray();
            MyCharStack stack = new MyCharStack(100);
            for (int i = 0; i < array.length; i++){
                stack.push(array[i]);
            }
            for (int i = 0; i < array.length; i++){
                System.out.print(stack.pop());
            }
            System.out.println();
        }
    }
}
