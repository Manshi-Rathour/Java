import java.util.HashSet;

public class Adv_Java_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6,0.5f);
        hs.add(2);
        hs.add(5);
        hs.add(6);
        hs.add(10);
        hs.add(11);

        System.out.println(hs);
    }
}
