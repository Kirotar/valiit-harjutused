package weektwo;

import java.util.Scanner;

public class TernaryTry {
    public static void main(String[] args) {
        //findMaximum();
        Scanner sc = new Scanner(System.in);
        //votingAge(sc);
        sc.close();
    }


    private static void findMaximum() {
        int a = 10;
        int b = 20;
        int result = (a > b) ? a : b;
        System.out.println("The maximum number is " + result);
    }

    private static void votingAge(Scanner sc) {
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        String canVote = (age >= 18) ? "Eligible to vote" : "Not eligible to vote.";
        System.out.println(canVote);
    }

    private static void ternary() {
        int number = 7;
        String result = (number % 2 == 0) ? "even" : "odd"; //Ternary operator. (if) ? then : else; : will tell if the number is even or odd
        int resultTwo = (number % 2 == 0) ? 1 : 2;
        System.out.println("The number " + number + " is " + result);
        System.out.println(resultTwo);
    }
}
