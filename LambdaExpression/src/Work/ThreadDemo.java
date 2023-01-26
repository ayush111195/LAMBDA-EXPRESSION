package Work;

public class ThreadDemo {
    public static void main(String[] args) {

        //First Thred:thread-John

       Runnable thread1=()->{
         //this is the body of thread
         //stuff
         for (int i=1;i<=10;i++) {
             System.out.println(i);
             try {
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
       } ;
       Thread t=new Thread(thread1);
       t.setName("john");
       t.start();
    }
}
