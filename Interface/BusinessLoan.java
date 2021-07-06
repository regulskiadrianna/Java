public class BusinessLoan extends Loan {
    public BusinessLoan(int loanNumber, String customerLastName, double loanAmount, int term) {
        super(loanNumber, customerLastName, loanAmount, term);
        setInterestRate(.01);
    }

    @Override
    public double totalAmountOwed() {

        return getLoanAmount() + (getLoanAmount() * getInterestRate() * getTerm());
    }

    @Override
    public String toString() {
        return super.toString() + "Total Amount Owed: " + totalAmountOwed() + "\n";
    }

}

