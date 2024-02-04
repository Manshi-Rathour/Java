class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        MyEmployee e1 = new MyEmployee();

        e1.setName("Manshi");
        System.out.println(e1.getName());

        e1.setId(123);
        System.out.println(e1.getId());
    }
}
