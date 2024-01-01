public class BankBalance {
    private double balance;

    public BankBalance (double initialBalance) {
        this.balance=initialBalance;
    }
    public void Deposite(double amount) {
        if (amount > 0) {
            amount += balance;
            System.out.println("Deposite Sucessful Present balance : " + balance  );
        } else {
            System.out.println("Invalid Amount");
        }
    }
    public void Withdrawl(double amount) {
        if (amount > 0 && amount <= balance  ) {
            balance -= amount;
            System.out.println("Amount withdrawl " + amount + " | present balance : " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }
        public double checkBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankBalance myBankBalance = new BankBalance(50000);

            System.out.println("Your Bank Balance : " + myBankBalance.checkBalance());

            myBankBalance.Deposite(1000);
            myBankBalance.Withdrawl(150);

            System.out.println("Final Amount : " + myBankBalance.checkBalance());
        }
}