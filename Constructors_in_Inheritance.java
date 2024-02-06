class Base1{
    Base1(){
        System.out.println("I am a constructor of Base1 class.");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor of Base1 class with value of x as " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a constructor of Derived1 class.");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor of Derived1 class with value of y as " + y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a constructor of ChildOfDerived class.");
    }
    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of ChildOfDerived class with value of z as " + z);
    }
}


public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        // Base1 b = new Base1();

        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(2, 4);

        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(2, 4, 6);
    }
}
