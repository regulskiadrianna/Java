public class Main {

    public static void main(String[] args) {

        // If statement
        int x = 10;
        if (x < 12){
            System.out.println("X is smaller than 12");
        }

        // If else statement
        int y = 20;
        if (y < 10){
            System.out.println("Y is smaller than 10");
        } else {
            System.out.println("Y is bigger than 10");
        }

        // Nested if statement
        int m = 10;
        int s = 20;
        if (m == 10){
            if (s == 20){
                System.out.println("M is " + m + " and S is " + s);
            }
        }

        // Switch statement

        char grade = 'C';
        switch(grade){
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done!");
                break;
            case 'C':
                System.out.println("You passed!");
                break;
            case 'D':
                System.out.println("Try harder!");
                break;
            case 'F':
                System.out.println("You failed!");
                break;
            default:
                System.out.println("Invalid grade, try again.");
        }
        System.out.println("Your grade is " + grade);

    }
}
