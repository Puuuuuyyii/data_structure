package mulitThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {
    public static void main(String[] args) {
        ExecutorService executors = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 15; i ++){
            MyTask myTask = new MyTask(i);
            executors.execute(myTask);
        }
        executors.shutdown();
    }

}
class MySecondTask implements Runnable {
    private int taskNum;

    public MySecondTask(int taskNum) {
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行task" + taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task" + taskNum + "执行完毕");
    }
}