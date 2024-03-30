import java.util.*;

public class Adv_Java_Date_class {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(2024,3, 30);  //both dates are different
        System.out.println(d1.compareTo(d));

        System.out.println("The number of milliseconds passed since Jan 1, 1970 :" + d.getTime() );
        System.out.println("The current date is : " + d.getDate());
        System.out.println("The current year is : " + d.getYear()); //(2024 - 1900)
        System.out.println("The current seconds : " + d.getSeconds());


    }
}
