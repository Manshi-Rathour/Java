public class Adv_Java_Date_and_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());                    //milliseconds
        System.out.println(System.currentTimeMillis()/1000);               //seconds
        System.out.println(System.currentTimeMillis()/1000/3600);          //hours
        System.out.println(System.currentTimeMillis()/1000/3600/24);       //days
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);   //years
    }
}
