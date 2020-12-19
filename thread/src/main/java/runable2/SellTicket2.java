package runable2;

public class SellTicket2 {
    public static void main(String[] args) {
        RunbaleTest2 rt2 = new RunbaleTest2();

        Thread thread1 = new Thread(rt2,"窗口3");
        Thread thread2 = new Thread(rt2,"窗口2");
        Thread thread3 = new Thread(rt2,"窗口1");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
