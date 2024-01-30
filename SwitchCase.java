import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age) {
            case 18 -> System.out.println("You are going to be adult.");
            case 23 -> System.out.println("You are going to get a job.");
            case 60 -> System.out.println("You are going to be retired.");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using this java code!");

        // switch(age){
//        case 18 :
//            System.out.println("You are going to be adult.");
//            break;
//        case 23 :
//            System.out.println("You are going to get a job.");
//            break;
//        case 60 :
//            System.out.println("You are going to be retired.");
//            break;
//        default:
//            System.out.println("Enjoy your life!");
//    }
//        System.out.println("Thanks for using this java code!");



    }

}

