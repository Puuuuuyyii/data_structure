package exception;

public class JoinThread extends Thread {
    public static volatile int	n	= 0;
    public void run() {
        for (int i = 0; i < 10; i++)
            try {
                synchronized(this) {
                    n = n + 1;
                }
                // n = n + 1;
                sleep(3); // 为了使运行结果更随机，延迟3毫秒
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public static void main(String[] args) throws Exception {

        Thread threads[] = new Thread[10];
        for (int i = 0; i < threads.length; i++)
            // 建立10个线程
            threads[i] = new JoinThread();
        for (int i = 0; i < threads.length; i++)
            // 运行刚才建立的10个线程
            threads[i].start();
        for (int i = 0; i < threads.length; i++)
            // 10个线程都执行完后继续
            threads[i].join();
        System.out.println(" n= " + JoinThread.n);
    }
}