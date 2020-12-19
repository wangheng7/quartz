package runbale3;

public class SellTicket3 {
    public static void main(String[] args) {
        RunbaleTest3 rt3 = new RunbaleTest3();

        Thread thread1 = new Thread(rt3,"窗口1");
        Thread thread2 = new Thread(rt3,"窗口2");
        Thread thread3 = new Thread(rt3,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
