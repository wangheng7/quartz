package TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {

    private Timer times;

    public MyTask(){}

    public MyTask(Timer times){
        this.times = times;
    }

    @Override
    public void run() {
        System.out.println("任务开始");

        times.cancel();
    }
}
