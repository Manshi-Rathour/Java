class First{
    public int a;
    public int n(){
        return 4;
    }
    public void method(){
        System.out.println("Method of class First.");
    }
}

class Second extends First{
    @Override
    public void method(){
        System.out.println("Method of class Second.");
    }
    public void method1(){
        System.out.println("Method 1 of class Second.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        First f = new First();
        f.method();

        Second s = new Second();
        s.method();
    }
}
