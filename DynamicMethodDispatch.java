class Phone{
    public void showTime(){
        System.out.println("Time is 8 pm");
    }
    public void on(){
        System.out.println("Turning On the Phone...");
    }
}

class SmartPhone extends Phone{
    public void on(){
        System.out.println("Turning On the SmartPhone...");
    }
    public void music(){
        System.out.println("Playing the music...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        // SmartPhone obj2 = new Phone(); // Not allowed
        obj.on();
        obj.showTime();
        // obj.music(); // This will throw error because reference is Phone class, and we are accessing method of SmartPhone class
    }
}
