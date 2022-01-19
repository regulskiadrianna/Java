public class Main {

    public static void main(String[] args) {
        //Calculation and My_Calculation
        int a = 20;
        int b = 10;
        My_Calculation problem1 = new My_Calculation();
        problem1.addition(a,b);
        problem1.subtraction(a,b);
        problem1.multiplication(a,b);

        //Sub_Class and Super_Class
        Sub_Class obj = new Sub_Class();
        obj.myMethod();


    }
}
