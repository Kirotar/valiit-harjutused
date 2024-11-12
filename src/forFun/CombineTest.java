package forFun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CombineTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //guessTheNumber(sc);
        //guessTwo(sc);
        wordFrequency(sc);
        sc.close();
    }

    private static void wordFrequency(Scanner sc) {
        System.out.println("Enter sentence: ");
        String sentence = sc.nextLine();
        sentence.toLowerCase();
        String[] splitSentence = sentence.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : splitSentence) {
            Integer count = wordCount.get(word);
            if (count == null) {
                count = 0;
            }
            wordCount.put(word, ++count); /* Why ++count is better than count +1 : In this case, ++count is appropriate,
            because it updates count immediately, storing the incremented value directly in the map. If you used count + 1,
            you’d have to update count explicitly (count = count + 1) before placing it in the map, or else the value of
            count would not be stored persistently. So ++count here is a compact way to increment and store the updated
            value at the same time.*/
        }
        System.out.println(wordCount);

    }

    private static void guessTwo(Scanner sc) {
        int randomNum = (int) (Math.random() * 10) + 1;
        System.out.println(randomNum);

        String decision; //Will be defined by used (Y/N), and then used for the switch
        boolean repeat = true;//Will help to define Y and N as true/false values
        while (repeat) {
            System.out.println("Guess a number between 1 and 10: ");
            int number = sc.nextInt();
            if (!(number == randomNum)) {
                System.out.println("Wrong number! Guess again? Y/N");
                decision = sc.next();
                switch (decision) {
                    case "N":
                        System.out.println("Goodbye!");
                        repeat = false;
                        break;
                    case "Y":
                        repeat = true;
                        break; //Adding break after each case in switch ensures that only the intended code for the matched case is
                    // executed, preventing unexpected behavior in the loop.
                    default:
                        repeat = true;
                }
            } else {
                System.out.println("Correct guess!");
                break;
            }
        }

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


