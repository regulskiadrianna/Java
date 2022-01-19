public class Dog extends Mammal{
    public void move(){
        super.move();
        System.out.println("Dogs can walk and run");
    }

    public void bark(){
        System.out.println("Dogs can bark");
    }
}
