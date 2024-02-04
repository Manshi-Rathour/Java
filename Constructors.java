class MyMainEmployee{
    public MyMainEmployee(){
        int id = 0;
        String name = "Your-Name";
        System.out.println("Id: "+ id + ", Name: "+ name);
    }

    // Constructor overloading
    public MyMainEmployee(int id, String name){
        System.out.println("Id: "+ id + ", Name: "+ name);
    }
    public MyMainEmployee(int id, String name, int salary){
        System.out.println("Id: "+ id + ", Name: "+ name + ", Salary: "+ salary);
    }
}

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee obj1 = new MyMainEmployee();
        MyMainEmployee obj2 = new MyMainEmployee(12, "Name1");
        MyMainEmployee obj3 = new MyMainEmployee(15, "Name2", 800000);
    }
}
