import java.util.Scanner;

public class TakingInputFromUser {
    public static void main(String[] args){
        System.out.println("Taking input from user: ");
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter 1st no.: ");
//        int a = sc.nextInt();
//        System.out.print("Enter 2nd no.: ");
//        int b = sc.nextInt();
//
//        int sum = a+b;
//        System.out.print("Sum of numbers is: ");
//        System.out.println(sum);


//        System.out.print("Enter your first name: ");
//        String str = sc.next();
//        System.out.println(str);

        System.out.print("Enter your full name: ");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}
