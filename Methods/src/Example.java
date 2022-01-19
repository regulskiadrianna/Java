public class Example {
    int num = 10;

    Example(){
        System.out.println("This is an example");
    }

    Example(int num){
        this();
        this.num = num;
    }

    public void greet(){
        System.out.println("Welcome");
    }

    public void print(){
        int num = 20;
        System.out.println("Value of the local variable num is " + num);
        System.out.println("Value of the instance variable num is " + this.num);
        this.greet();
    }
}
