class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while(i< 1000){
            System.out.println("Good Day! " + this.getName());
            i++;
        }

    }
}


public class ThreadPriorities {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Name1");
        MyThread t2 = new MyThread("Name2");
        MyThread t3 = new MyThread("Name3");
        MyThread t4 = new MyThread("Name4");
        MyThread t5 = new MyThread("Name5 (most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
