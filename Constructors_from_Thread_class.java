class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }

    public void run(){
        System.out.println("Good Day!");
    }
}

public class Constructors_from_Thread_class {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Manshi");
        System.out.println("The id of the thread t1 is " + t1.getId());
        System.out.println("The name of the thread t1 is " + t1.getName());

        MyThr t2 = new MyThr("Rathour");
        System.out.println("The id of the thread t2 is " + t2.getId());
        System.out.println("The name of the thread t2 is " + t2.getName());

        t1.start();
        t2.start();
    }
}
