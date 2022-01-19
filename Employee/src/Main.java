public class Main {

    public static void main(String[] args) {

        Employee person1 = new Employee("James Smith");
        Employee person2 = new Employee("Katie Anne");

        person1.setAge(34);
        person1.setDestination("Software Developer");
        person1.setSalary(1000.00);

        person2.setAge(30);
        person2.setDestination("Android Developer");
        person2.setSalary(4000.00);

        person1.printEmployee();
        System.out.println("");
        person2.printEmployee();


    }
}
