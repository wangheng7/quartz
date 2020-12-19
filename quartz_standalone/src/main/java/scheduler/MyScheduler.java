package scheduler;

import job.MyJob1;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

public class MyScheduler {
    public static void main(String[] args) throws SchedulerException {
        //任务分组
        JobDetail jobDetail = JobBuilder.newJob(MyJob1.class)
                .withIdentity("job1","gorup1")
                .usingJobData("key1","value1")
                .usingJobData("key2",5.21f)
                .build();

        //触发器：定义任务什么时候运行
        Trigger trigger = TriggerBuilder.newTrigger()
                .withIdentity("trigger1","gorup1")
                .startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                    .withIntervalInSeconds(5)
                    .repeatForever())
                .build();

        //创建调度器：操作任务、指挥任务
        //调度线程：QuartzSchedulerThread
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        //把任务和触发器绑定
        scheduler.scheduleJob(jobDetail,trigger);
        scheduler.start();
    }
}
