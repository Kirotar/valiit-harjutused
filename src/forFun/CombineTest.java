package forFun;

import java.util.Scanner;

public class CombineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        guessTheNumber(sc);
        sc.close();
    }

    private static void guessTheNumber(Scanner sc) {
        int randomNum = (int) (Math.random() * 50) + 1;
        System.out.println(randomNum);
        int maxAttempts = 5;

        for (int i = 0; i < maxAttempts; i++) {
            System.out.println("Guess a number between 1 and 50: ");
            int number = sc.nextInt();
            if (!(number == randomNum) && i == maxAttempts - 1) {
                System.out.println("No more tries!");
            } else if (!(number == randomNum)) {
                System.out.println("Try again!");
            } else {
                System.out.println("Correct guess!");
                break;
            }
        }
//How to add. System.out.println("No more tries! You did not guess the number!"); ?

    }
}


