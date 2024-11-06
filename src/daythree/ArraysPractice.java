package daythree;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        int[] m = new int[10];
        int length = m.length;
        System.out.println(length);

        String[] model = {"Audi", "Tesla"};
        String[] brand = {"Civic", "A3"};
        int numberOfWords = model.length;
        System.out.println(model[0] + " " + brand[1]);
        //model[0]=1; //Starts to read from that position

        System.out.println(m[0]);

        int [] m2 = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(m2));
        System.out.println(Arrays.toString(m));

    }
}
