package daythree;

import java.util.Scanner;

public class Fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Exercise where the user inserts name, age and then birth year
       /* String truename = "John";
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
*/

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
