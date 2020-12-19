package TimerTask;

import java.util.Timer;

public class TimerDemo2 {
    public static void main(String[] args){
        Timer ti = new Timer();
        //任务，启动时间，间隔时长
        ti.schedule(new MyTask2(),5000,5000);
    }
}
