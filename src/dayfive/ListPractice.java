package dayfive;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    //LIST
    /*List can consist of any type of elements. Size not predefined, can expand.
    List object can hold similar values (1,9,3,5)
    Most important methods: add(), get(), remove(), set()
     */
    public static void main(String[] args) {
   /* }
       private static void list(){*/
        List<String> listOfNames= new ArrayList<>();

        listOfNames.add("Alex"); //add adds a name
        listOfNames.add("Bob");
        listOfNames.add("Charlie");
        listOfNames.add("Joe");
        listOfNames.add("Jane");

        System.out.println(listOfNames);

        for(String name :listOfNames) {
            System.out.println(name);}

        listOfNames.remove(1); //If you remove one, the next one becomes the next in line. remove removes name.

        System.out.println("Print out name: " + listOfNames.get(0)); //get gets you list item from the specified postiton
        System.out.println("Print out name: " + listOfNames.get(1));

        listOfNames.set(1, "John"); //changes list item at position 1
           System.out.println("Names after modification: "+ listOfNames);
    }


    }

