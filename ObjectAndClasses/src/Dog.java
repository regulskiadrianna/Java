public class Dog {
    String breed;
    int age;
    String color;
    String name;

    //Constructors
    public Dog(){

    }

    //Constructor with one parameter
    public Dog(String name){
        System.out.println("The dog's name is " + name);
    }

    //Setter and Getter
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        System.out.println("The dog's age is " + age);
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Methods
    void barking(){

    }

    void hungry(){

    }

    void sleeping(){

    }
}
