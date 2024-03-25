import java.util.ArrayDeque;

public class Adv_Java_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(2);
        ad.add(5);
        ad.add(7);
        ad.add(9);
        ad.add(6);
        ad.addFirst(10);
        ad.addLast(20);

        //System.out.println(ad.getFirst());
        //System.out.println(ad.peekFirst());


        //System.out.println(ad.getLast());
        //System.out.println(ad.peekLast());

        //System.out.println(ad.removeFirst());
        //System.out.println(ad.pollFirst());

        //System.out.println(ad.removeLast());
        //System.out.println(ad.pollLast());

        System.out.println(ad);
    }
}
