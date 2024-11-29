package weekthreeandfour;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int[] bankAccounts() {
        int[] balance = {3000, 1000, 2500, 56000, 56677, 134};
        return balance;
    }

}