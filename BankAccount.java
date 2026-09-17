public class BankAccount {
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Pratham", 10000);

        System.out.println("Account Holder: " + account.accountHolder);
        System.out.println("Initial Balance: " + account.balance);

        account.withdraw(100000);
    }
} 
