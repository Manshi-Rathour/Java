class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("Id is : " + id);
        System.out.println("Name of the employee is : " + name);
    }

    public int getSalary(){
        return salary;
    }
}



public class OOPs_Custom_class {

    public static void main(String[] args) {
        System.out.println("This is a custom class.");

        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.id = 12;
        e1.name = "Manshi";
        e1.salary = 200000;

        e2.id = 15;
        e2.name = "Ananya";
        e2.salary = 100000;

        e1.printDetails();
        System.out.println("Salary is : " + e1.getSalary());

        e2.printDetails();
        System.out.println("Salary is : " + e2.getSalary());
    }
}
