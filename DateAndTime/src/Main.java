import java.util.Date;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("Current Date: " + ft.format(dNow));

        String str = String.format("Current Date/Time: %tc", date);
        System.out.println(str);

       /*
        Date dueDate = new Date();
        System.out.println("%1$s %2$tB %2$td, %2$tY", "Due date: ", dueDate);
       */


    }
}
