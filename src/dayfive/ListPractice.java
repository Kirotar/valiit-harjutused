package dayfive;

//needs packages:

import java.util.ArrayList;
import java.util.List;
// import java.util.Collections;  // Import the Collections class

public class ListPractice {
    //LIST
    /*List can consist of any type of elements. Size not predefined, can expand.
    List object can hold similar values (1,9,3,5)
    Most important methods: add(), get(), remove(), set()
     */
    public static void main(String[] args) {
          /*  KODUTÖÖ List<Integer> numbers = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                numbers.add(i);
            }
        //Listi suurus on 10 aga elemente on 0 1 2 3 4 5 6 7 8 9 seega ta ei saagi 10 kohta üldse kätte

            for (int i = numbers.size(); i >= 0; i--) {
                if (numbers.get(i) % 2 == 0) {
                    numbers.remove(i);
                }
            }

            System.out.println("List after removing even numbers: " + numbers);*/
        }

    private static void numbersList() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
    }

    private static void list() {
        List<String> listOfNames = new ArrayList<>();

        listOfNames.add("Alex"); //add adds a name
        listOfNames.add("Bob");
        listOfNames.add("Charlie");
        listOfNames.add("Joe");
        listOfNames.add("Jane");

        System.out.println(listOfNames);

        for (String name : listOfNames) {
            System.out.println(name);
        }

        listOfNames.remove(1); //If you remove one, the next one becomes the next in line. remove removes name.
        listOfNames.remove("Jane"); //changes list item if you know the String but not the position

        System.out.println("Print out name: " + listOfNames.get(0)); //get gets you list item from the specified postiton
        System.out.println("Print out name: " + listOfNames.get(1));

        listOfNames.set(1, "John"); //changes list item at position 1

        System.out.println("Names after modification: " + listOfNames);

        //To remove all the elements in the ArrayList, use the clear() method. listOfNames.clear();
        //To find out how many elements an ArrayList have, use the size method. listOfNames.size();
    }
//Another useful class in the java.util package is the Collections class, which include the sort()
// method for sorting lists alphabetically or numerically: Collections.sort(listOfNames);

}

