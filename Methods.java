public class Methods {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = logic(a, b);
        System.out.println(c);
    }
    static int logic(int x, int y){
        int z = 0;
        if (x > y){
            z = (x + y)*2;
        }
        else {
            z = (x - y)*2;
        }
        return z;
    }
}
