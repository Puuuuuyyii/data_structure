package innerClass;

public class Test {
    public static void main(String[] args) {
        OuterClass j = new OuterClass();
        OuterClass.InnerClass i = j.new InnerClass();
    }
}
