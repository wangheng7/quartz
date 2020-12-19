package noNameInner;

/*
* 匿名内部类：
*   new 类名或接口名(){
*       重写方法；
*   }
*   本质：是该类或接口的子类对象
* */
public class noNameDemo {
    public static void main(String[] args){
        new Thread(){
            public void run(){
                for(int x=0;x<100;x++){
                    System.out.println(Thread.currentThread().getName()+":::"+x);
                }
            }
        }.start();


        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int x=0;x<100;x++){
                    System.out.println(Thread.currentThread().getName()+":::"+x);
                }
            }
        }){
        }.start();
    }
}
