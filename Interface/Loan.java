public abstract class Loan implements LoanConstants {

    private int loanNumber;
    private String customerLastName;
    private double loanAmount;
    private double interestRate;
    private int term;

    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        if (loanAmount > maximum_loan) {

            this.loanAmount = maximum_loan;
        } else {
            this.loanAmount = loanAmount;
        }

        if (term == short_term || term == medium_term || term == long_term) {
            this.term = term;
        } else {

            this.term = short_term;
        }
    }

    public int getLoanNumber() {
        return loanNumber;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate += interestRate;
    }


    public double getLoanAmount() {
        return loanAmount;
    }

    public int getTerm() {
        return term;
    }

    public abstract double totalAmountOwed();

    @Override
    public String toString() {
        return "Loan:\nLoan Number: " + loanNumber + "\nCustomer Last Name: " + customerLastName + "\nLoan Amount: "
                + loanAmount + "\nTerm: " + term + "\n";
    }

}

