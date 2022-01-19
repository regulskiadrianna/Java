public class Main {

    public static void main(String[] args) {

        Salary s = new Salary("James Bond", "Texas", 3, 30000);
        Employee e = new Salary("Kaitlyn James", "Texas", 44, 40500 );
        System.out.println("Call mailCheck using Salary reference");
        s.mailCheck();
        System.out.println("Call mailCheck using Employee reference");
        e.mailCheck();


    }
}
