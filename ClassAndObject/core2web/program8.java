package CoreJavaPreparation.ClassAndObject.core2web;

class program8 {

    String accountNumber;
    String holderName;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.accountNumber = "123456";
        b1.holderName = "Nishant";
        b1.balance = 10000;

        b1.deposit(5000);
        b1.withdraw(2000);

        b1.displayBalance();
    }
}
    

