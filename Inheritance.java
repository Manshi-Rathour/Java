class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

}

class Derived extends Base {
    public int y;
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(2);
        System.out.println("Getting x from base class using object of base class: " + b.getX());

        Derived d = new Derived();
        d.setX(3);
        System.out.println("Getting x from base class using object of derived class: " + d.getX());

        d.setY(4);
        System.out.println("Getting y from derived class using object of derived class: " + d.getY());
    }
}
