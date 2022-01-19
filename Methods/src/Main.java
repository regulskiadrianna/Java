public class Main {

    public static void main(String[] args) {
        methodRankPoints(304);

        int a = 10;
        int b = 20;
        System.out.println("Before swapping, a = " + a + " b = " + b);

        swapFunction(a, b);
        System.out.println("After swapping, a = " + a + " b = " + b);

        //Example.java
        Example example1 = new Example();
        example1.print();
        Example example2 = new Example(20);
        example2.print();
    }

    public static void methodRankPoints(double points){
        if(points >=202.5){
            System.out.println("Rank: A1");
        } else if (points >= 122.4){
            System.out.println("Rank A2");
        } else{
            System.out.println("Rank A3");
        }
    }

    public static void swapFunction(int a, int b){
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
        int c= a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }





}



