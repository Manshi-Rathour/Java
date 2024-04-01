import java.util.Calendar;
import java.util.GregorianCalendar;

public class Adv_Java_GregorianCalendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2024));

        //roll method adds/subtracts a single unit of time from the specified time field.

        System.out.println("Date before rolling : " + gc.getTime());
        gc.roll(Calendar.MONTH, true);
        gc.roll(Calendar.DATE, false);
        gc.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + gc.getTime());
    }
}
