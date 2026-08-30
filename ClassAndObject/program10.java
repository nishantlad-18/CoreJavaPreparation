package CoreJavaPreparation.ClassAndObject;

class BankAccount {

    String accountHolder;
    double balance;

    static double interestRate = 5.0;

    static void displayInterestRate() {
        System.out.println("Interest Rate = " + interestRate + "%");
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.accountHolder = "Nishant";
        b1.balance = 50000;

        System.out.println("Account Holder: " + b1.accountHolder);
        System.out.println("Balance: " + b1.balance);

        BankAccount.displayInterestRate();
    }
}