interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHorn();
}

class AvonCycle implements Bicycle, HornBicycle{
    public void applyBreak(int dec){
        System.out.println("Applying Breaks!");
    }
    public void speedUp(int inc){
        System.out.println("Applying SpeedUp!");
    }
    public void blowHorn(){
        System.out.println("Blowing Horn!");
    }
}

public class Interface {
    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.applyBreak(1);
        System.out.println(av.a);

        // We cannot modify the properties in Interfaces as they are final
        // av.a = 454;
        // System.out.println(av.a);

        av.blowHorn();
    }
}
