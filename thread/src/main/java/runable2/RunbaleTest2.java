package runable2;

public class RunbaleTest2 implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            synchronized(this){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"剩余票数："+ticket--);
                }

            }
        }
    }
}
