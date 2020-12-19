package runable1;

public class SellTicket {
    public static void main(String[] args) {
        RunableTest rt = new RunableTest();

        Thread thread1 = new Thread(rt,"窗口1");
        Thread thread2 = new Thread(rt,"窗口2");
        Thread thread3 = new Thread(rt,"窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
