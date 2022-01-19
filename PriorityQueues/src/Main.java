import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        /*
        Priority Queue = A FIFO date structure that serves elements
        with the highest priorities first
        before elements with lower priority
        offer/poll/isEmpty
         */

        Queue<Double> gpa = new PriorityQueue<Double>(Collections.reverseOrder());
        //Collections.reverseOrder() changes the order from highest to lowest.
        gpa.offer(3.50);
        gpa.offer(2.33);
        gpa.offer(4.00);
        gpa.offer(1.45);
        gpa.offer(3.00);

        while(!gpa.isEmpty()){
            System.out.println(gpa.poll());
        }
    }
}
