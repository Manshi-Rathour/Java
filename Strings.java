import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        // String name = new String("Hello");
        String name = "Hello";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String st = sc.nextLine();
        System.out.println("Your name is "+ st);

        int a = 5;
        float b = 2.45f;
        System.out.printf("The value of a is %d and b is %.2f ", a, b);
    }
}
