class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative!";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative!";
    }
}

public class ThrowVsThrows {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        try {
//            int c = divide(5,0);
//            System.out.println(c);

            double ar = area(-1);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
            System.out.println(e.toString());
            System.out.println(e.getMessage());
        }

    }
}
