import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        //Queue = FIFO data structure. First-In First-Out (Think of being in line)
        // A collection designed for holding elements prior to processing
        // Linear data structure

        //add = enqueue, offer()
        //remove = dequeue, poll)

        Queue<String> listOfPeopleInLine = new LinkedList<String>();

        listOfPeopleInLine.offer("Adrianna");
        listOfPeopleInLine.offer("Sarina");
        listOfPeopleInLine.offer("James");
        listOfPeopleInLine.offer("Jason");
        listOfPeopleInLine.offer("Eva");

        System.out.println(listOfPeopleInLine);
        System.out.println(listOfPeopleInLine.isEmpty());

        listOfPeopleInLine.poll();
        listOfPeopleInLine.poll();
        System.out.println(listOfPeopleInLine);
        System.out.println(listOfPeopleInLine.size());
        System.out.println(listOfPeopleInLine.contains("Eva"));



    }
}
