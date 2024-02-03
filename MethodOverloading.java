public class MethodOverloading {

    int multiply(int x, int y){
        return x*y;
    }
    double multiply(double x, double y){
        return x*y;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int c = obj.multiply(2, 4);
        double d = obj.multiply(2.3, 4.5);

        System.out.println(c);
        System.out.println(d);
    }
}
