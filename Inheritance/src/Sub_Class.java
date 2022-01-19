public class Sub_Class extends Super_Class {
    int num = 10;

    public void display(){
        System.out.println("This is the display method of subclass.");
    }

    public void myMethod(){
        Sub_Class sub = new Sub_Class();
        sub.display();
        super.display();
        System.out.println("Value of the variable named num in sub class: " + sub.num);
        System.out.println("Value of the variable named num is super class: " + super.num);
    }
}
