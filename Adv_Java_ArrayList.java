import java.util.*;

public class Adv_Java_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(0, 10);
        l1.addFirst(20);
        l1.addLast(30);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        //l1.addAll(l2);
        //l1.addAll(0, l2);
        l1.set(0, 100);
        System.out.println(l1.contains(1));
        System.out.println(l1.indexOf(4));

        for (int i=0; i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }

    }
}
