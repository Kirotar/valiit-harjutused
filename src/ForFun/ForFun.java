package ForFun;

import java.util.Scanner;

public class ForFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // askUsername(sc); //Pass sc on so there are not multiple instances
        sc.close();       // Close Scanner after use


        //Understanding "return":

        int result = calculatorTestAdd(3, 4);
        int result2 = calculatorTestMult(3, 9);
        //int result3 = calculatorTestMulti(2, 7); //Won't work, because void can't return int so result3 doesn't get a value added
calculatorTestMulti(4, 5); //Void code just does it's thing once
System.out.println(result); //Now I can do things with the returned value

    }
        //Simple calculator
    private static int calculatorTestAdd(int first, int second) {
        int sum = first + second;
        System.out.println("Sum: " + sum);
        return sum;
    }

    private static int calculatorTestMult(int first, int second) {
        int sum = first * second;
        System.out.println("Sum: " + sum);
        return sum;
    }

    //Does not work, because void can't return int:
    private static void calculatorTestMulti(int first, int second) {
        int sum = first * second;
        System.out.println("Sum: " + sum);
    }
    private static void numbers() {
        int a = 2;
        int b = 5;
        int c = 3;
        int d = 4;
        int e = 6;
        calculatorTestAdd(a, b);
        calculatorTestAdd(a, d);
        calculatorTestAdd(d, c);
        calculatorTestAdd(e, b);
    }
    //Exercise where the user inserts name, age using different methods
    private static void askUsername(Scanner sc) {
        System.out.print("Enter your username: ");
        String user = sc.nextLine();
        askPassword(user, sc);
    }

    private static void askPassword(String user, Scanner sc) {
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        checkCredentials(password, user, sc);
    }

    private static void checkCredentials(String pass, String user, Scanner sc) {
        String trueUsername = "user123";
        String truePassword = "pass123";
        boolean passwordMatch = truePassword.equals(pass);
        boolean userMatch = trueUsername.equals(user);

        boolean success = passwordMatch && userMatch;
        if (success) {
            askAge(sc);
        } else {
            System.out.println("Password or user does not match");
        }

    }

    private static void askAge(Scanner sc) {
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed, you must be 18 or older.");
        }
    }

    // Method asks for username, sends to next method which asks for password? Or both in the same?
    //Then sends to check if correct and asks for age or ends program.

    private static void fun1() {
        Scanner sc = new Scanner(System.in);

        //Exercise where the user inserts name, age and then birth year
        String truename = "John";
        int trueage = 22;
        int currentYear = 2024;

        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        boolean success = name.equals(truename) && age == trueage;

        if (success == true) {
            System.out.println("Enter birth year: ");
            int birthYear = sc.nextInt();
            if (birthYear == currentYear - trueage) {
                System.out.println("You are successfully verified");
            } else {
                System.out.println("You are not successfully verified");
            }
        } else {
            System.out.println("You are not verified");
        }

//Exercise to evaluate how strong is a password.
        System.out.println("Insert a password: ");
        String password = sc.nextLine();
        int requiredMinimum = 8;
        boolean containsDigit = password.matches(".*[0-9].*");
        boolean containsUppercase = password.matches(".*[A-Z].*"); // ".*" Means that any character can precedde
        // and follow the capital letter, so capital letter can appear anywhere in the String.
        //[A-Z0-9] would match any uppercase letter or digit.
        //[a-zA-Z] would match any uppercase or lowercase letter.
        //If you used "A-Z" without brackets, it would try to match the literal sequence "A-Z,"
        // which doesn’t match any uppercase letter individually and would not work for finding uppercase letters.
        int passwordLenght = password.length();
        boolean numberOfCharacters = passwordLenght >= requiredMinimum;
        boolean passwordIsStrong = containsUppercase && numberOfCharacters && containsDigit;

        if (passwordIsStrong == true) {
            System.out.println("Your password is strong");
        } else {
            System.out.println("Your password is weak");
        }
    }
}