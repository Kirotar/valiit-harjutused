package weekthreeandfour;

import java.util.ArrayList;
import java.util.List;

public class BankUsers {
    private int username;
    private int pin;
    private double balance;

    //List as a static field. List<BankUsers> bankUsers = BankUsers.getBankUsers(); to get it in another class
    private static List<BankUsers> bankUsers;
//If you need to do the computation in order to initialize your static variables, you can declare a static
// block that gets executed exactly once, when the class is first loaded.
    static {
        int[] username = {000, 001, 002, 003, 004, 005};
        int[] pin = {123, 456, 7890, 3333, 4444, 5555};
        bankUsers = new ArrayList<>();
        for (int i = 0; i < username.length; i++) {
            bankUsers.add(new BankUsers(username[i], pin[i], Account.bankAccounts()[i]));
        }
    }
//getter to get the list
    public static List<BankUsers> getBankUsers() {
        return bankUsers;
    }

    public BankUsers(int username, int pin, double balance) {
        this.username = username;
        this.pin = pin;
        this.balance = balance;
    }
    public int getUsername() {
        return username;
    }
    public void setUsername(int username) {
        this.username = username;
    }
    public int getPin() {
        return pin;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /*public static List<BankUsers> bankUsersList() {
        int[] username = {000, 001, 002, 003, 004, 005};
        int[] pin = {123, 456, 7890, 3333, 4444, 5555};
       // int[] balance = {3000, 1000, 2500, 56000, 56677, 134};

        List<weekthree.BankUsers> bankusers = new ArrayList();
        for (int i = 0; i < username.length; i++) {
            bankusers.add(new weekthree.BankUsers(username [i], pin[i], Account.bankAccounts()[i]));
        }
        return bankusers;
    }*/
}
