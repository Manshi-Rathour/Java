public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        System.out.println("Arithmetic Operator: ");
        int a = 5;
        // int b = a + 3;
        int b = a % 2;
        System.out.println(b);

        // Assignment operators
        System.out.println("Assignment Operator: ");
        int c = 2;
        c += 2;
        System.out.println(c);

        // Comparison operator
        System.out.println("Comparison Operator: ");
        System.out.println(64 > 6);

        // Logical operator
        System.out.println("Logical Operator: ");
        System.out.println(64 > 5 && 15 < 3);
        System.out.println(12 > 4 || 11 < 1);

        // Bitwise operator
        System.out.println("Bitwise Operator: ");
        System.out.println(2|1);
        System.out.println(2&1);

        // Increment & Decrement operators
        System.out.println("Increment & Decrement Operators: ");
        int x = 6;
        System.out.println(x++);
        System.out.println(x);

        int y = 8;
        System.out.println(++y);
        System.out.println(y);

        char z = 'a';
        System.out.println(++z);
    }
}
