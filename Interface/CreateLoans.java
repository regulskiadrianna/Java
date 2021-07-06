/*
This program tracks all new construction loans. The application calculates the total amount owed at the due date.
*/


import java.util.Scanner;

public class CreateLoans {

    public static void main(String[] args) {

        Loan[] loans = new Loan[5];
        Scanner input = new Scanner(System.in);
        System.out.println(("Welcome to the program"));
        System.out.print("Please enter the prime interest rate: ");
        double rate = input.nextDouble() / 100;
        input.nextLine();
        for (int i = 0; i < loans.length; i++) {

            System.out.println("Please pick from the following loan types: \n1: Business\n2: Personal");
            String typeOfLoan = input.nextLine();
            System.out.print("Please enter customer's last name: ");
            String customerLastName = input.nextLine();
            System.out.print("Please enter the loan amount: ");
            double amountOfLoan = input.nextDouble();
            System.out.print("Please enter the loan number: ");
            int loanNumber = input.nextInt();
            input.nextLine();
            System.out.print("Please enter the term in year: ");
            int term = input.nextInt();
            input.nextLine();

            if (typeOfLoan == "1") {

                loans[i] = new BusinessLoan(loanNumber, customerLastName, amountOfLoan, term);
                loans[i].setInterestRate(rate);

            } else {

                loans[i] = new PersonalLoan(loanNumber, customerLastName, amountOfLoan, term);
                loans[i].setInterestRate(rate);
            }
        }

        for (Loan loan : loans) {

            System.out.println(loan.toString());
        }
    }
}

