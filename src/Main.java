import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 500000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++)
            arrayList.get(i);
        long end = System.currentTimeMillis();
        System.out.println("Time for ArrayList " +(end-start) + "ms");

         start = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++)
            linkedList.get(i);
         end = System.currentTimeMillis();
        System.out.println("Time for LinkedList " +(end-start) + "ms");


    }
}