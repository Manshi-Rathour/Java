public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 16;
        if (age > 18 && age < 50) {
            System.out.println("Yes you can drive!");
        }
        else if (age > 50) {
            System.out.println("No you cannot drive.");
        }
        else {
            System.out.println("You are not allowed to drive.");
        }
    }
}
