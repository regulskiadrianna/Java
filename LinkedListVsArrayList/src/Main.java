import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //LinkedList
        startTime = System.nanoTime();
        linkedList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Linked List: \t " + elapsedTime + " ns");

        //ArrayList
        startTime = System.nanoTime();
        arrayList.get(0);
        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("Array List: \t " + elapsedTime + " ns");

    }
}
