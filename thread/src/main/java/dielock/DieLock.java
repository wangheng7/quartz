package dielock;

public class DieLock implements Runnable{

    private Boolean flag;

    public DieLock(Boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        while (true){
            if(flag){
                synchronized(MyLock.obj1){
                    System.out.println("if obj1");
                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (MyLock.obj2){
                        System.out.println("if obj2");
                    }
                }
            }else {
                synchronized(MyLock.obj2){
                    System.out.println("else obj2");
                    try {
                        Thread.sleep(900);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (MyLock.obj1){
                        System.out.println("else obj1");
                    }
                }
            }
        }
    }
}
