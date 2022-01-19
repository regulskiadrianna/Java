public class Main {

    public static void main(String[] args) {
        BankAccount adriannasAccount = new BankAccount();
        adriannasAccount.withdraw(100.0);
        adriannasAccount.deposit(1000.0);
        adriannasAccount.withdraw(40.0);
        System.out.println(adriannasAccount.getBalance());

    }
}
