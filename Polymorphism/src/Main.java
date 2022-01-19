import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Salary s = new Salary("Adrianna James", "Illinois, USA", 3, 1000);
        Employee e = new Salary("John Adams" , "Boston, USA", 2 , 300);
        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();
        System.out.println("Call mailCheck using Employee reference -- ");
        e.mailCheck();


    }
}
