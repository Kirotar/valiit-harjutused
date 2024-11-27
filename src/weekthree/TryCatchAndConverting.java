package weekthree;

import java.util.InputMismatchException;
import java.util.Scanner;


public class TryCatchAndConverting {
    public static void main(String[] args) {
//Casting:
        int sco = 87;
        double avg = sco; //Implicit casting from int to double
        System.out.println(avg);

        double total = 4664.46;
        int rounded = (int) total; //Explicit casting from double to int
        System.out.println(rounded);


    }

    private static void reverse() {
        String text = "123456";

        String textReversed = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            textReversed = ch + textReversed;
        }
        int reversed = Integer.parseInt(textReversed);
        System.out.println("The text reversed is (as numbers): " + reversed);
    }
    //for (int i = text.length() -1, i >= 0, i--){reveresedtext +=text.charAt(i)}

    private static void convertingStrToInt() {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Write here: ");
        word = sc.nextLine();
        try {
            int i = Integer.parseInt(word);
            System.out.println(i);
        } catch (NumberFormatException e) {
            double d = Double.parseDouble(word);
            System.out.println(d);
            //System.out.println("Cannot convert.");
        } catch (InputMismatchException e) {
            System.out.println("Cannot convert.");
        } finally {
            System.out.println("End of program.");
        }
    }

    private static void converting() {
        int num = 123;
        String one = String.valueOf(num);
        System.out.println("int to string: " + one);

        int numTwo = Integer.parseInt(one);
        System.out.println("string to int: " + numTwo);

        String numThree = "123.455";
        double v = Double.parseDouble(numThree);
        System.out.println("String to double: " + v);

    }

    private static void tryCatch() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int result = 100 / num;
            //Risky code
            System.out.println(result);
        } catch (ArithmeticException e) {
            //handle exeption
            System.out.println("Cannot divide by zero.");
        } catch (InputMismatchException e) {
            //handle exeption
            System.out.println("Insert a number.");
        } finally {
            //always executed
            System.out.println("End of program.");
        }
    }
}

