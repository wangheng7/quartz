package runbale3;

public class RunbaleTest3 implements Runnable{

    private static int ticket = 100;

    @Override
    public void run() {
        while(true){
            synchronized(RunbaleTest3.class){
                if(ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"剩余票数"+ticket--);
                }
            }
        }
    }
}
