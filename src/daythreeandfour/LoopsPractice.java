package daythreeandfour;

//shortcut ctrl + shift + numpad / + wrap in */
public class LoopsPractice {
    public static void main(String[] args) {
        sumOfNonNegative();
        findFirstGreater();

        /*findFirstEven();
        printOddNumbers();
        printMultiples();*/
    }

    private static void sumOfNonNegative() {
        int[] numbers = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int num : numbers) {
            // if you add sum here, it will still add +4 as well as it has not hit break yet
            if (num < 0) {
                break;// stop summing if negative found
            }
            sum += num; // no 'int' !!!
        }
        System.out.println("Sum: " + sum);
    }

    private static void findFirstGreater() {
        int[] numbers = {23, 45, 39, 51, 48, 60};
        for (int greater : numbers) {
            if (greater < 50) {
                continue;
            }
            System.out.println("The first number greater than 50 in: " + greater);
            break;
        }
        //alternative:
        int[] numbers2 = {23, 45, 39, 51, 48, 60};
        for (int greater2 : numbers2) {
            if (greater2 > 50) {
                System.out.println("The first number greater than 50 in: " + greater2);
                break;
            }
        }
    }

    private static void findFirstEven() {
        int[] numbers = {7531, 5875, 636, 19, 1, 30, 21};
        for (int x : numbers) { //foreach loop
            if (x % 2 == 0) {
                System.out.println("The first even number is: " + x);
                break;
            }
        }
    }

    private static void printOddNumbers() {
        for (int i = 1; i <= 20; i += 2) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println("Odd numbers is: " + i);
        }
    }

    private static void printMultiples() {
        for (int i = 3; i <= 30; i += 3) {
            if (i % 6 == 0) {
                continue;
            }
            System.out.println("Multiples of 3 are:" + i);
        }
    }

    private static int rollDice() {
        /*INTO MAIN: int diceRoll = rollDice();
        System.out.println("The dice number is " + diceRoll);*/

        return (int) (Math.random() * 6) + 1; //"return (int) (Math.random() * 6 + 1)"; - also gives result from 1 to 6, but
        // has worse distribution, 6 is less likely to appear
        //(int) in brackets means Type Casting double into int.
    }
    // Widening Casting (automatically) - converting a smaller type to a larger type size
    //byte -> short -> char -> int -> long -> float -> double
    //Narrowing Casting (manually) - converting a larger type to a smaller size type
    //double -> float -> long -> int -> char -> short -> byte

    private static void loopControls() {
        //Example of break, e.g. we are looking for a specific number
        for (int count = 1; count <= 5; count++) {
            if (count == 3) { //Step 1: Check if count is 3
                break; //Step 2: Exit the loop if count is 3
            }
            System.out.println("Count is: " + count); //Step 3: Print count if it's not 3
        }

//Example of continue
        for (int count = 1; count <= 5; count++) {
            if (count == 3) { //Step 1: Check if count is 3
                continue; //Step 2: Skip count 3
            }
            System.out.println("Count is: " + count); //Step 3: Print count if it's not 3
        }
    }

    //Ecercises 1-5:
    private static void printNumbers() {
        // Exercise 1:
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
    }

    private static void printCarArray() {
        //Exercise 2:
        String[] cars = {"Ford", "Honda", "Audi"};
        for (String car : cars) {
            System.out.println(car);
        }
    }

    private static void addTogether() {

        //Exercise 3:

        //with do..while loop:
        int c = 0;
        int total = 0;
        do {
            total = total + c;
            c++;
        } while (c <= 100);
        System.out.println(total);

        //with for loop:k
        int sum = 0;
        for (int number = 0; number <= 100; number++) {
            sum = sum + number;
            //    System.out.println(sum);
        }
        System.out.println(sum);

        //The instructors version:
        int sum2 = 0;
        int i = 1;
        while (i <= 100) {
            sum2 += i; //shorthand for sum= sum + i
            i++;
        }
        System.out.println("The sum of the first 100 integers is " + sum2);
    }

    private static void evenNumbers() {

        //Exercise 4:
        for (int i = 1; i <= 20; i++) { //could also just start with 2 and be: i+=2
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    private static void multiplicationTable() {

        //Exercise 5:
        int numMultiple = 7;
        for (int i2 = 1; i2 <= 10; i2++) {
            int totalOf = numMultiple * i2;
            System.out.println(numMultiple + " x " + i2 + " = " + totalOf);
        }
    }


    // i= 1, j = 1, i=+2 - there '+' does nothing, j += 2 is j=j+2
    private static void loopExamples() {
        //LOOPS :
        /* While (<boolean expression>) {statements are repeated until the condition resolves true
        statement1;
        statement2;}*/

        int count = 6;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
            System.out.println("Count is after count++: " + count);
        }

        //Do...while loop: do{ Statements to be repeated 1 to n times, at least once statement; }While(boolean exp) exp is tested after repetition
        int count1 = 6;
        do {
            System.out.println("Count is: " + count1);
            count1++;
        } while (count1 <= 5);

        //Difference: while checks condition at the beginning, Do..while WILL run at least once and check at the end.

        //For loop: for (int i = 0; i < myArray.length; i++) {
            /*Statements to be repeated exactly myArray.length times
            statement1;
            statement2;
            ...
            }*/
        for (int count2 = 6; count2 <= 5; count2++) {
            System.out.println("Count is: " + count2);
        }

        //Foreach
        //used exclusively to loop through elements in an array (or other data sets):
            /* int[] m = { 5, 1, 3, 7, 8 };
            for (int x : m) {  // The index is not “visible” while looping through
// Statements to be repeated exactly m.length times
                statement1;
                statement2;}*/

        String[] fruits = {"Apple", "Banana", "Orange", "Watermelon"};
        for (String fruit : fruits) {
            System.out.println("Fruit is: " + fruit);
        }
//Keywords to control loops:
        //break - exit the loop immediately, continue - skip the current loop cycle and continue with the next one
    }
}
