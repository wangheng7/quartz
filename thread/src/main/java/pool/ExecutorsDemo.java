package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void main(String[] args){
        //创建两个线程对象
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.shutdown();
    }
}
