package daytwo;

import java.util.Scanner; //imported class

public class ScannerAndVariableNames {
    int number; //instance variables
    static String name = "John"; //static variable

    //naming constants
   /* public static final double PI = 3.14159265358979323846;
    public static final String APP_NAME = "MyApp";
    public final int MAX_USERS = 100;*/

    public static void main(String[] args) {

        //Local variables are inside method, constructor, block (can't be accessed outside)

        //Scanneriga erinev info
/*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your info: " + name + ", " + age);
        ++age;
        System.out.println("Your age next year is: " + age);

        System.out.println("Enter first number: ");
        int n = scanner.nextInt();
        System.out.println("Enter second number: ");
        int n1 = scanner.nextInt();
        int kokkuliidetudNumbrid = n + n1;
        System.out.println("Your numbers are: " + kokkuliidetudNumbrid + ", " + n + " and " + n1);
        n1++;
        System.out.println("Your next number is: " + n1);*/

        //Changing all variable names Shift+F6, refactor or Rename usages
        /*String user = "Joe";
        System.out.println(user);
        int lenghtOfMan = user.length();
        System.out.println(lenghtOfMan);*/

        System.out.println(name);
    }

    public double multiply() {
        double a = 2; //local variable
        double b = 4;
        return a * b;
    }

}

