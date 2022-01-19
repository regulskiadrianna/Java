public class Main {

    public static void main(String[] args) {

        MyClass test1 = new MyClass();
        MyClass test2 = new MyClass();
        System.out.println(test1.num + " " + test2.num);

        MyClass test3 = new MyClass(10);
        MyClass test4 = new MyClass(20);
        System.out.println(test3.x + " " + test4.x);


    }
}
