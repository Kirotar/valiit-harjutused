package weekthree;

import java.util.List;
import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        validateUser(sc);
        sc.close();
    }

    private static void validateUser(Scanner sc) {
        List<BankUsers> bankUsers = BankUsers.getBankUsers(); // Retrieve the list of users from a static field in the BankUsers class
        BankUsers currentUser = null;
        int remainingTries = 3;
        do {
            System.out.println("Enter username: ");
            int username = sc.nextInt();

            for (BankUsers user : bankUsers) {
                if (user.getUsername() == username) {
                    currentUser = user;
                    break;
                }
            }

            if (currentUser != null) {
                System.out.println("Username is valid.");
                validatePINInitially(sc, currentUser);
                break;
            } else if (remainingTries > 0) {
                remainingTries--;
                System.out.println("Username is not valid. Remaining tries: " + remainingTries);
            }
        } while (remainingTries > 0);

        if (remainingTries == 0) {
            System.out.println("No remaining tries. Access denied.");
        }
// add inserting PIN before withdrawal, deposit
    }

    private static void validatePINInitially(Scanner sc, BankUsers user) {
        int remainingTries = 3;
        do {
            System.out.println("Enter PIN");
            int pin = sc.nextInt();

            if (user.getPin() == pin) {
                System.out.println("PIN is valid.");
                atmMenu(sc, user);
                break;
            } else if (remainingTries > 0) {
                remainingTries--;
                System.out.println("PIN is not valid. Remaining tries: " + remainingTries);
            }
        } while (remainingTries > 0);

        if (remainingTries == 0) {
            System.out.println("No remaining tries. Access denied.");
        }
    }

    private static void validatePINLater(Scanner sc, BankUsers user) {
        int remainingTries = 3;
        do {
            System.out.println("Enter PIN");
            int pin = sc.nextInt();

            if (user.getPin() == pin) {
                System.out.println("PIN is valid.");
                break;
            } else if (remainingTries > 0) {
                remainingTries--;
                System.out.println("PIN is not valid. Remaining tries: " + remainingTries);
            }
        } while (remainingTries > 0);

        if (remainingTries == 0) {
            System.out.println("No remaining tries. Access denied.");
        }
    }

    private static void atmMenu(Scanner sc, BankUsers user) {
        System.out.println("Insert '1' if you wish to check your current balance, '2' if you wish to withdraw money, " +
                "'3' if you wish to deposit money and '4' if you wish to change your PIN.");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                checkBalance(sc, user);
                break;
            case 2:
                withdrawMoney(sc, user);
                break;
            case 3:
                depositMoney(sc, user);
                break;
            case 4:
                changePIN(sc, user);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    private static void withdrawMoney(Scanner sc, BankUsers user) {
        validatePINLater(sc, user);
        System.out.println("Add the sum you wish to withdraw: ");
        int withdraw = sc.nextInt();
        int newBalance = (int) (user.getBalance() - withdraw);
        if (withdraw > 0 && withdraw <= user.getBalance()) {
            System.out.println("New balance is " + newBalance + ". Press 'Y' to confirm.");
            char confirm = sc.next().charAt(0);
            char upperCase = Character.toUpperCase(confirm);
            if (upperCase == 'Y') {
                user.setBalance(newBalance);
                System.out.println("Transaction confirmed. New balance: " + user.getBalance());
                returnToMenu(sc, user);
            } else {
                System.out.println("Transaction denied.");
                returnToMenu(sc, user);
            }
        } else {
            System.out.println("Insufficient funds. Account balance: " + user.getBalance());
        }
    }


    private static void checkBalance(Scanner sc, BankUsers user) {
        System.out.println("Current balance: " + user.getBalance());
        returnToMenu(sc, user);
    }

    private static void depositMoney(Scanner sc, BankUsers user) {
        validatePINLater(sc, user);
        System.out.println("Add the sum you wish to deposit: ");
        int deposit = sc.nextInt();
        int newBalance = (int) (user.getBalance() + deposit);
        if (deposit > 0) {
            System.out.println("New balance is " + newBalance + ". Press 'Y' to confirm.");
            char confirm = sc.next().charAt(0);
            char upperCase = Character.toUpperCase(confirm);
            if (upperCase == 'Y') {
                user.setBalance(newBalance);
                System.out.println("Transaction confirmed. New balance: " + user.getBalance());
                returnToMenu(sc, user);
            } else {
                System.out.println("Transaction denied.");
                returnToMenu(sc, user);
            }
        }
        System.out.println("Invalid sum.");
        returnToMenu(sc, user);
    }

    private static void returnToMenu(Scanner sc, BankUsers user) {
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("Press '1' if you wish to return to menu or '0' if you wish to exit.");
            int returnToMenu = sc.nextInt();
            switch (returnToMenu) {
                case 1:
                    atmMenu(sc, user);
                    isTrue = false;
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    isTrue = false;
                    break;
                default:
                    System.out.println("Please insert '1' or '0'.");
            }
        }
    }

    private static void changePIN(Scanner sc, BankUsers user) {
        validatePINLater(sc, user);
        int limit = 4;
        System.out.println("Enter new PIN");
        int newPIN = sc.nextInt();
        int length = String.valueOf(newPIN).length();
        if (length == limit) {
            user.setPin(newPIN);
            System.out.println("Your new PIN is: " + newPIN);
        } else {
            System.out.println("PIN needs to be four characters long");
        }
        returnToMenu(sc, user);
    }
}