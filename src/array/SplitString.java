package array;

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            char[] array = string.toCharArray();
            MySplit.split(array);
        }

    }
}
