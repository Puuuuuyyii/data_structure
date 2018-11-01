package exception;

public class ExceptionDemo1 {
    public void fun1() throws MyException1 {
        MyException1 my = null;
        if (my == null){
            throw new MyException1("这个对象是空的!!!!");
        }
    }
}
