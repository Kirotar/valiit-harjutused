package daytwo;

import java.util.Scanner;

public class ExercisesDayTwo {
    public static void main(String[] args) {
      //Harjutus 1
        System.out.println("Hello, World!");

        //Harjutus 2
        Scanner sc = new Scanner(System.in);
       /* System.out.println("Insert a number.");
        int num = sc.nextInt();
        System.out.println("Insert another number.");
        int num2 = sc.nextInt();
        int sum = num + num2;
        int sub = num - num2;
        int mul = num * num2;
        int div = num / num2;
        System.out.println("Addition: " + sum + ", subtraction: " + sub + ", multiplication: " + mul + ", division " + div);
*/
        //Harjutus 3
        System.out.println("Insert a number.");
        int num3 = sc.nextInt();
        if (num3 % 2 != 0) { //!!!Odd or even - % jäägiga jagamine, odd(number % 2 != 0) - kui jagatise jääk pole 0 (on 1),
            // even(number % 2 == 0) - kui jagatise jääk on 0). Jagab kuni jääb kas 1 või 0.
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
