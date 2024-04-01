import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Adv_Java_DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);


        //DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // This is the format
        //String myDate = dt.format(df);
        //System.out.println(mydate);


        //DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a"); // This is the format
        //String myDate = dt.format(df);
        //System.out.println(mydate);


        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;
        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date in ISO format : "+ myDate);


        //DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;//
        //String myDate = dt.format(df);
        //System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);
    }
}
