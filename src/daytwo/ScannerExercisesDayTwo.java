package daytwo;

import java.util.Scanner;

public class ScannerExercisesDayTwo {
    public static void main(String[] args) {
        //Harjutus 1
        System.out.println("Hello, World!");

        //Harjutus 2
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Insert a number.");
        int num = sc.nextInt();
        System.out.println("Insert another number.");
        int num2 = sc.nextInt();
        int sum = num + num2;
        int sub = num - num2;
        int mul = num * num2;
        int div = num / num2;
        System.out.println("Addition: " + sum + ", subtraction: " + sub + ", multiplication: " + mul + ", division " + div);
*/
        //Harjutus 3
        /*System.out.println("Insert a number.");
        int num3 = sc.nextInt();
        if (num3 % 2 != 0) { //!!!Odd or even - % jäägiga jagamine, odd(number % 2 != 0) - kui jagatise jääk pole 0 (on 1),
            // even(number % 2 == 0) - kui jagatise jääk on 0). Jagab kuni jääb kas 1 või 0.!!!
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }*/

        //Harjutus 4
/*System.out.println("Insert a number:");
        int num4 = sc.nextInt();
        System.out.println("Insert another number:");
        int num5 = sc.nextInt();
        System.out.println("Insert another number:");
        int num6 = sc.nextInt();
        if (num4 > num5 && num4 > num6) {
            System.out.println("The greatest number is: " + num4);
        }  else if (num5 > num4 && num5 > num6) {
            System.out.println("The greatest number is: "+ num5);
        } else if (num6 > num4 && num6 > num5) {
            System.out.println("The greatest number is: " + num6);
        } else {
            System.out.println("The numbers are equal");
        }*/

        //Harjutus 5
        /*System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Hello " + name + ". You are an adult!");
        } else if (age < 18 && age >= 12) {
            System.out.println("Hello " + name + ". You are a teenager!");
        } else {
            System.out.println("Hello " + name + ". You are a kid!");
        }*/
//Harjutus 6
        String correctUsername = "user123";
        String correctPassword = "pass123";

        System.out.println("Welcome. \nEnter your username: ");
        String name = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        boolean success = name.equals(correctUsername) && password.equals(correctPassword);

        if (success == true) {
            System.out.println("Enter your age: ");
            int age = sc.nextInt();
            if (age > 18) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login unsuccessful, you must be 18 or older.");
            }
        } else {
            System.out.println("Login unsuccessful, invalid credentials.");
        }
    }
}


