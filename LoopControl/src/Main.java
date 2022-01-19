public class Main {

    public static void main(String[] args) {

        int [] numbers = {10 , 20 , 30, 40, 50};

        for (int i: numbers){
            System.out.print(i);
            System.out.print(",");
        }

        System.out.println("\n");
        String [] names = {"Adrianna", "Jeniffer", "Joe", "Dave"};

        for(String n: names){
            System.out.print(n);
            System.out.print(",");
        }

        System.out.println("\n");

        //While loop
        int a = 10;

        while (a < 20){
            System.out.println("Value of a is " + a);
            a++;
        }

        //For loop
        for(int x = 0; x < 10; x++){
            System.out.println("Value of x: " + x);
        }

        //Do while loop
        int b = 0;
        do {
            System.out.println("Value of b is " + b);
            b++;
        }while (b < 5);

    }
}
