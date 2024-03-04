class MyNewThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("This is Thread 1!");
            try{
                Thread.sleep(200);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("This is thread 2!");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        MyNewThread1 t1 = new MyNewThread1();
        MyNewThread2 t2 = new MyNewThread2();

        t1.start();

//        try {
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }

        t2.start();
    }
}
