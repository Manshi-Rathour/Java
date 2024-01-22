import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[] args){
        System.out.println("Enter your marks: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks1: ");
        byte m1 = sc.nextByte();
        System.out.println("Enter marks2: ");
        byte m2 = sc.nextByte();
        System.out.println("Enter marks3: ");
        byte m3 = sc.nextByte();
        System.out.println("Enter marks4: ");
        byte m4 = sc.nextByte();
        System.out.println("Enter marks5: ");
        byte m5 = sc.nextByte();

        double marks_obtained = (m1+m2+m3+m4+m5);
        double total_marks = 500;

        double percentage = (marks_obtained / total_marks) * 100;

        System.out.println("Percentage" + percentage + "%");
    }
}
