public class Employee {
    public String name;
    public int age;
    public String destination;
    public double salary;

    //Constructor
    public Employee(String name){
        this.name = name;
    }

    //Setter
    public void setAge(int age){
        this.age = age;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }


    //Method
    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Destination: " + destination);
        System.out.println("Salary: " + salary);
    }
}
