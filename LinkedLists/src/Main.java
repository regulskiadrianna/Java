import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        /*
        Can use stack push/pop
        Cau use queue offer/poll
        LinkedList = Stores nodes in 2 parts (data + address)
        Nodes are non-consecutive memory locations
        Elements are linked using pointers
         */

        LinkedList<String> grade = new LinkedList<String>();

        //Queue
        grade.offer("A");
        grade.offer("B");
        grade.offer("C");
        grade.offer("D");
        grade.offer("F");

        grade.add(4, "E");
        System.out.println(grade);

        grade.remove("E");
        System.out.println(grade);
        System.out.println(grade.indexOf("F"));

        System.out.println(grade.peekFirst());
        System.out.println(grade.peekLast());

        grade.addFirst("0");
        grade.addLast("G");
        System.out.println(grade);
    }
}
