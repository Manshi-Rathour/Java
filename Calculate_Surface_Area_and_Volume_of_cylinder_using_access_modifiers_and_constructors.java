class Cylinder{
    private int radius;
    private int height;

    // Using Constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }


    // Using Getter and Setter
    /*
    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }
     */

    public double Surface_Area(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double Volume(){
        return Math.PI * radius * radius * height;
    }
}


class Rectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}

public class Calculate_Surface_Area_and_Volume_of_cylinder_using_access_modifiers_and_constructors {
    public static void main(String[] args) {
        /*
        Cylinder MyCylinder = new Cylinder();
        MyCylinder.setRadius(12);
        System.out.println("Radius of cylinder is: " + MyCylinder.getRadius());

        MyCylinder.setHeight(5);
        System.out.println("Height of cylinder is: " + MyCylinder.getHeight());
         */

        Cylinder MyCylinder = new Cylinder(12, 5);
        System.out.println("Total Surface Area of Cylinder: " + MyCylinder.Surface_Area());
        System.out.println("Volume of Cylinder: " + MyCylinder.Volume());


        // Default constructor
        Rectangle rectangle = new Rectangle();
        System.out.println("Get Length from default constructor: " + rectangle.getLength());
        System.out.println("Get Breadth from default constructor: " + rectangle.getBreadth());

        // Parameterized constructor(Constructor overloading)
        Rectangle rectangle1 = new Rectangle(3,2);

    }
}
