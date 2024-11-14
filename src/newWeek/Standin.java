package newWeek;

import java.util.Scanner;

public class Standin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //dayOfWeek(sc);
        //calculator(sc);
        //grading(sc);
        //months(sc);
        //season(sc);
        sc.close();
    }


    private static void equals (){
    //To compare Strings use equals, because '==' checks for reference equality (if they point to the same memory location,
        // but with objects each has their own location),
        // equals() checks for content equality
    String str1 = "hello";
    String str2 = "hello";
    String str3 = new String ("hello");

    System.out.println (str1==str2);
    System.out.println (str1==str3);
    System.out.println(str1.equals(str3));
    }


    private static void season(Scanner sc) {
        int season;
        System.out.println("Insert month (1-12) to view what season it is in:");
        season = sc.nextInt();
        switch (season) {
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Autumn");
                break;
        }
    }

    private static void months(Scanner sc) {
        int days;
        System.out.println("Insert month (1-12) to view how many days in that month:");
        days = sc.nextInt();

        switch (days) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 4: // Can be case 4, 6, 9, 11:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("Invalid number");
        }
    }

    private static void grading(Scanner sc) {
        char grade;
        System.out.println("Insert student grade:");
        grade = sc.next().toUpperCase().charAt(0); //Makes into Uppercase, looks at first char

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }

    private static void calculator(Scanner sc) {
        double first;
        double second;
        System.out.println("Insert the calculation (number, (+,',/,*), number):");
        first = sc.nextDouble();
        sc.nextLine(); //If you use nextInt() or nextDouble() just before nextLine(), nextLine() might pick up the leftover
        // newline character. This happens because nextInt() or nextDouble() only reads the numeric part,
        // leaving the newline behind.
        // To fix this, add an extra sc.nextLine(); before String operator = sc.nextLine(); if you read other data before it.
        String operator = sc.nextLine().trim(); //trim will remove extra spaces
        //or char and charAt(0)
        second = sc.nextDouble();
        double result = 0;

        switch (operator) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Cannot divide by 0.");
                }
                break;
            case "*":
                result = first * second;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        System.out.println("Result: " + result);

    }

    private static void dayOfWeek(Scanner sc) {
        System.out.println("Insert a number from 1 to 7");
        int day = sc.nextInt();
        switch (day) {
            case 1: //If cases do the same, you can put them on the same line - case 1: case 2:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                //code block if none match
                System.out.println("Invalid. Number needs to be between 1-7.");
                break;

        }
    }

    private static void switchTry() {
        int number = 45;
        switch (number) { //The value of the expression can be int, short, or byte. char, String, enumerated type.
            case 1:
                System.out.println("First number is 1");
                break;
            case 2:
                System.out.println("First number is 2");
                break;
            case 3:
                System.out.println("First number is 3");
                break;
            case 4:
                System.out.println("First number is 4");
                break;
            case 5:
                System.out.println("First number is 5");
                break;
            default:
                //code block if none match
                System.out.println("Invalid.");
                break;
        }
    }
}
