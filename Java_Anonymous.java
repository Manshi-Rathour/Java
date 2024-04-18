@FunctionalInterface
interface DemoAno{
    void meth1();
//    void meth2();
}
//class myclass implements DemoAno{
//    @Override
//    public void meth1() {
//        System.out.println("This is method 1");
//    }
//}

//class AnonyDemo implements DemoAno{
//    public void display(){
//        System.out.println("Hello");
//    }
//
//    @Override
//    public void meth1() {
//        System.out.println("This is meth1");
//    }
//
//    @Override
//    public void meth2() {
//        System.out.println("This is meth2");
//    }
//}

public class Java_Anonymous {
    public static void main(String[] args) {
//        DemoAno obj = new AnonyDemo();
//        obj.meth1();

        // Anonymous Class
//        DemoAno obj = new DemoAno() {
//            @Override
//            public void meth1() {
//                System.out.println("This is meth1");
//            }
//
////            @Override
////            public void meth2() {
////                System.out.println("This is meth2");
////            }
//        };
//        obj.meth1();



        // Lambda Expressions

//        DemoAno obj = new myclass();
//        obj.meth1();
        DemoAno obj = ()->{System.out.println("I am method 1 from this lambda " );};
        obj.meth1();
    }
}
