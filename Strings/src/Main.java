public class Main {

    public static void main(String[] args) {

        char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
        String helloString = new String(helloArray);
        System.out.println(helloString);

        String sentance1 = "The total space of this text is ";
        int total = sentance1.length();
        System.out.println(total);

        String firstName = "Adrianna";
        String lastName = "Unknown";
        String emptySpace = " ";

        System.out.println(firstName.concat(emptySpace).concat(lastName));

        // Character at
        String s = "Summer";
        char result = s.charAt(4);
        System.out.println(result);

        //Hashcode
        String blue = new String("My favorite color is blue! ");
        System.out.println("Hashcode for blue is " + blue.hashCode());

        //Index Of
        String orange = new String("I love orange!");
        System.out.println(orange.indexOf("orange"));

        // Last index Of
        String Str = new String("Welcome to Java Programming");
        System.out.println("Last index is: ");
        System.out.println(Str.lastIndexOf("t"));

        //String replace
        String lastName1 = new String("My last name is Potter");
        System.out.println(lastName1);
        System.out.println(lastName1.replace('P', 'T'));

    }
}
