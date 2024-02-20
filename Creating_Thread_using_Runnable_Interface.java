class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Thread 1");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println("Thread 2");
            i++;
        }
    }
}


public class Creating_Thread_using_Runnable_Interface {
    public static void main(String[] args) {
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread th1 = new Thread(t1);

        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
    }
}
