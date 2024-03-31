interface Bicycle{
    int a = 45;
    void applyBreak();
    void speedUp();
}

interface HornBicycle{
    void blowHorn();
}

class AvonCycle implements Bicycle, HornBicycle{
    public void applyBreak(){
        System.out.println("Applying Breaks!");
    }
    public void speedUp(){
        System.out.println("Applying SpeedUp!");
    }
    public void blowHorn(){
        System.out.println("Blowing Horn!");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.applyBreak();
        System.out.println(av.a);

        // We cannot modify the properties in Interfaces as they are final
        // av.a = 454;
        // System.out.println(av.a);

        av.blowHorn();
    }
}
