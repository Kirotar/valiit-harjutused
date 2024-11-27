package weektwo;

import java.util.*;

public class SetAndMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //insertSentence(sc);
        // guessTheNumber(sc);

        interestCalculator(sc);

        sc.close();
        //setOfChar();
        //hashMapTry();
        //addUserToMap();
        //studentGrades();
        //removeAPair();
    }

    private static void addUserToMap() {
        Map<String, String> jobs = new HashMap<>();
        jobs.put("Kate", "janitor"); //First id keySet, second is value
        jobs.put("Joe", "boss");
        jobs.put("Lucy", "henchman");
        jobs.put("John", "driver");
        for (String positions : jobs.keySet()) {
            System.out.println(positions + " works as a " + jobs.get(positions) + ".");
        }
        for (String key : jobs.keySet()) {
            System.out.println(key);
        }
        for (String value : jobs.values()) {
            System.out.println(value);
        }

        Map<String, Integer> map = new HashMap<>();
        map.put("Test", 1);
        map.put("Test2", 2);
        map.put("Test3", 3);
        map.put("Test4", 4);
        //Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        for (String key : map.keySet()) {
            System.out.println(key + " works as a " + map.get(key) + "."); //map.get will get value of that key
        }
        for (Integer value : map.values()) {
            System.out.println(value);
        }
    }

    private static void studentGrades() {
        Map<String, Integer> studentGrades = new HashMap<>();
        studentGrades.put("Jan", 1);
        studentGrades.put("Joe", 5);
        studentGrades.put("Jim", 4);
        studentGrades.put("Jolene", 3);
        studentGrades.put("Jimmy", 2);

        System.out.println("Jim's grade is: " + studentGrades.get("Jim"));
        System.out.println("Joe's grade is: " + studentGrades.get("Joe"));
        System.out.println("Jan's grade is: " + studentGrades.get("Jan"));
        System.out.println("Jolene's grade is: " + studentGrades.get("Jolene"));
        System.out.println("Jimmy's grade is: " + studentGrades.get("Jimmy"));
    }

    private static void removeAPair() {
        Map<String, Integer> nameSalary = new HashMap<>();
        nameSalary.put("Joe", 1200);
        nameSalary.put("Jane", 1800);
        nameSalary.put("Harry", 2500);
        nameSalary.put("Sam", 1300);
        nameSalary.put("Judith", 3500);

        String emplyeeToRemove;
        emplyeeToRemove = "Jane";
        nameSalary.remove(emplyeeToRemove);

        System.out.println(nameSalary);
        for (String nameKey : nameSalary.keySet()) {
            System.out.println("Name: " + nameKey + ", salary: " + nameSalary.get(nameKey));

        }
    }

    private static void hashMapTry() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Mati", 25);
        ages.put("Kati", 30);
        ages.put("Tõnu", 35);
        ages.put("Anu", 100);
        ages.put("Johanna", 15);
        for (String nameKey : ages.keySet()) {
            System.out.println(nameKey + " is " + ages.get(nameKey) + " years old.");
        }
        for (String key : ages.keySet()) {
            System.out.println(key);
        }
        System.out.println(" ");
        for (Integer value : ages.values()) {
            System.out.println(value);
        }
        System.out.println(" ");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }

    private static void booleanTest() {
        boolean isTrue = true; // !true to make false
        boolean isFalse = false;
        System.out.println(isTrue); //!isTrue to make false
        System.out.println(isTrue && isFalse); //Gives false, add !isFalse to make true
        System.out.println(5 != 5);
        // != does not equal
        // == equals
        //EMPTY, BLANK:
      /*  text.isEmpty - boolean to check if String is empty
        text.isBlank - boolean to check if String has text or only space
        */
    }


    private static void setOfChar() {
        //set of lowercase alphabet chars , remove vowels, print only consonants.
        Set<Character> characters = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) { //Adds letters from specified start to end.
            characters.add(c);
        }
        System.out.println(characters);

        Set<Character> vowelsTwo = Set.of('a', 'e', 'i', 'o', 'u');

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        characters.removeAll(vowels);

        System.out.println("Set of consonants: " + characters);
    }

    private static void insertSentence(Scanner sc) {
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        splitSentence(sentence);
        makeSetPrint(sentence);
    }

    private static void splitSentence(String sentence) {
        String[] words = sentence.split("\\s+"); // "\s+" one or more whitespace characters (\s means whitespace, and + means one or more).
        makeSetPrint(words);
    }

    private static void makeSetPrint(String words) {
        Set<String> uniqueWords = new HashSet<String>();
        uniqueWords.addAll(Arrays.asList(words.split("\\s+"))); //Takes the sentence, splits it and adds it to Set
        for (String i : uniqueWords) {
            System.out.println(i.toLowerCase());
        }
        System.out.println("Unique words: " + uniqueWords);

    }

    private static void makeSetPrint(String[] words) {
        Set<String> uniqueWords = new HashSet<String>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        for (String i : uniqueWords) {
            System.out.println(i.toLowerCase());
        }
        System.out.println("Unique words: " + uniqueWords);


    }

    private static void guessTheNumber(Scanner sc) {
        int randomNum = (int) (Math.random() * 50) + 1;
        System.out.println(randomNum);
        int maxAttempts = 5;
        //DO WHILE loop:
       /* do {
            System.out.println("Guess a number between 1 and 50: ");
            int number = sc.nextInt();
            if (randomNum == number) {
                System.out.println("Correct guess!");
            } else {
                System.out.println("Try again!");
            }
            maxAttempts--;
        } while (maxAttempts >= 1);*/

//FOR loop:
        for (int i = 0; i < maxAttempts; i++) {
            System.out.println("Guess a number between 1 and 50: ");
            int number = sc.nextInt();
            if (!(number == randomNum)) {
                System.out.println("Try again!");
            } else {
                System.out.println("Correct guess!");
                break;
            }
        }
//How to add. System.out.println("No more tries! You did not guess the number!"); ?

    }

    private static void iteratorConvertingToList() {
        //1.Iterator
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println(" ");

        //2.Converting to a List
        Set<String> setTwo = new HashSet<>();
        set.add("Joe");
        set.add("Jim");
        set.add("Jolene");

        List<String> list = new ArrayList<>(setTwo); //Convert Set to List
        System.out.println(list.get(0)); //Access by index


    }

    private static void interestCalculator(Scanner sc) {
        //Math.pow(2,3); //Astmeline arvutus, arv, mis astmel

        System.out.println("Insert initial amount: ");
        int initialMoney = sc.nextInt(); //P is the principal amount (initial amount of money) - user input?
        System.out.println("Insert how many years you wish to invest: "); //t time the money is invested in years - user input
        int years = sc.nextInt();
        System.out.println("How often is the interest compounded: ");
        int compounded = sc.nextInt(); //n number of times the interest is componded in a year
        int count = 1;
        double rate = getRate(sc);
        double result = initialMoney * (Math.pow((1 + (rate / compounded)), compounded * years)); //A amount of money accumulated after interest(principal + interest)
        System.out.println(result);

        //Calculations written out
   /*     double first = (1 + (rate / compounded));
        double second = compounded * years;
        double third = Math.pow(first, second);
        double result2 = initialMoney * third; */

        //System.out.println(result2);

        /*A amount of money accumulated after interest(principal + interest)
        P is the principal amount (initial amount of money) - user input?
        r annual interest rate in decimal form so "5% = 0.05" - user input?
        n number of times the interest is componded in a year
        t time the money is invested in years - user input
        A=P(1+(r/n))astmes n*t
        double result2 = initialMoney(Math.pow((1 + (rate / compounded)), compounded * years)
         */
    }

    private static double getRate(Scanner sc) {
        int count = 1;
        double rateInt = -1;  // Declare rateInt outside the loop with an initia
        for (int i = 0; i < count; i++) {
            System.out.println("Insert interest rate percentage (0-100): ");
            rateInt = sc.nextDouble(); //r annual interest rate in decimal form so "5% = 0.05". // Assign user input to rateInt (without 'double' in front
            if (rateInt < 0 || rateInt > 100) {
                System.out.println("Number is outside specified value, insert a number between 0-100.");
                i--;  // Decrement i to repeat the iteration if input is invalid
            } else {
                rateInt = rateInt / 100;
                break;
            }
        }
        return rateInt;
    }
}

