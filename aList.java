import java.util.ArrayList;
import java.util.Collections;

public class aList {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(1, list.get(2));
        list.set(2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx1 = 1, idx2 = 2;
        list.add(1);
        list.add(2);
        list.add(12);
        list.add(10);
        /*
         * int element = list.get(1);
         * System.out.println(list);
         * System.out.println(element);
         * list.remove(1);
         * System.out.println(list);
         * list.set(0, 23);
         * System.out.println(list);
         * list.add(1, 33);
         * System.out.println(list);
         * System.out.println(list.contains(1));
         * System.out.println(list.contains(23));
         * System.out.println(list.size());
         * for (int i = 0; i < list.size(); i++)
         * System.out.print(list.get(i) + " ");
         * swap(list, idx1, idx2);
         * System.out.println();
         * System.out.println(list);
         * Collections.sort(list);
         * System.out.println(list);
         * Collections.sort(list, Collections.reverseOrder());
         * System.out.println(list);
         */
    }
}
