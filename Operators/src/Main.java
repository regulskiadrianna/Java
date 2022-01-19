public class Main {

    public static void main(String[] args) {

        // variable x = (expression) ? value if true : value if false
        int a, b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println("Value of b is " + b);

        b = ( a == 10) ? 20 : 30;
        System.out.println("Value of b is " + b);

        //InstanceOf Operator
        // (Object reference variable ) instanceof (class/interface type)

        String name = "Lukas";

        boolean result = name instanceof String;
        System.out.println(result);
    }
}
