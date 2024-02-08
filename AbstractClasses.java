abstract class Parent1{
    public Parent1(){
        System.out.println("It is a default constructor.");
    }
    abstract public void greet();
    abstract public void greet1();
}

class Derived2 extends Parent1{
    @Override
    public void greet() {
        System.out.println("Hello!");
    }
    @Override
    public void greet1(){
        System.out.println("Good Morning!");
    }
}


public class AbstractClasses {
    public static void main(String[] args) {
        // Parent1 p = new Parent1();  -- this will give error (we can't make object of abstract class)
        Derived2 d = new Derived2();
        d.greet();
        d.greet1();
    }
}
