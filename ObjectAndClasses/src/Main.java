public class Main {

    public static void main(String[] args) {

        //Object
        Dog myDog = new Dog("Koby");
        myDog.setAge(3);
        myDog.getAge();

        //Object
        Cat myCat = new Cat("Black", "Blue", "Medium", "Logan");
        System.out.println("The cat's name is " + myCat.getCatName() + " \nThe cat's eye color is " + myCat.getEyeColor().toLowerCase());


    }
}
