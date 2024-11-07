package daythree;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
        arrayExerc();
    }

    //Exercises:
    private static void arrayExerc(){
        //Simple exercises with arrays:
        int[] myArray = new int[]{1, 2, 3, 4, 5};

        int[] newArray = new int[]{10, 20, 30, 40, 50};
        System.out.println("Third element: " + newArray[2]);

        int[] newerArray = new int[]{5, 10, 15, 20};
        newerArray[1] = 12;
        System.out.println("Modified array: ");
        System.out.println(Arrays.toString(newerArray));

        int[] newestArray = new int[]{8, 6, 7, 5, 3, 0, 9};
        int length = newestArray.length;
        System.out.println("Array lenght is: " + length);

        int[] arrayAgain = {4, 2, 8, 1, 6};
        int arraySum = arrayAgain[0] + arrayAgain[1] + arrayAgain[2] + arrayAgain[3] + arrayAgain[4];
        System.out.println("Array sum is: "+ arraySum);

    }
private static void arrayIntro () {

        //Introductory array exercises:
        int[] m = new int[10];
        System.out.println("Initial array: "+ Arrays.toString(m));
        m[2]++;
        m[3]++; //Increment the fourth element by 1
        int length = m.length;
        System.out.println(length);
        m[0] = 7; //The first element gets value 7 to read from that position
        System.out.println(m[3]);

        String[] model = {"Audi", "Tesla"};
        String[] brand = {"Civic", "A3"};
        int numberOfWords = model.length;
        System.out.println(model[0] + " " + brand[1]);
        model[0] = "Model 2";

        System.out.println(m[0]);

        int[] m2 = new int[]{3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(m2));
        System.out.println(Arrays.toString(m));

    }
}
