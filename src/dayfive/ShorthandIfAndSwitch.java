package dayfive;

public class ShorthandIfAndSwitch {
    public static void main(String[] args) {
    }
    private static void aboutConditionals() {

            //There is  a short-hand if else, which is known as the ternary operator because it consists of three operands.
            // It can be used to replace multiple lines of code with a single line, and is most often used to replace simple
            // if else statements:
            int time = 20;
            if (time < 18) {
                System.out.println("Good day.");
            } else {
                System.out.println("Good evening.");
            }
//can be made into this:
            int time2 = 20;
            String result = (time2 < 18) ? "Good day." : "Good evening.";
            System.out.println(result);

            //SWITCH
            // Instead of writing many if..else statements, you can use the switch statement.
//Syntax:
    /*    switch(expression) {
            case x:
                // code block
                break;
            case y:
                // code block
                break;
            default:
                // code block
        }*/
            int day = 4;
            switch (day) {
                case 1:
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
            }
// Outputs "Thursday" (day 4)

            //The default keyword specifies some code to run if there is no case match:
            int day2 = 4;
            switch (day2) {
                case 6:
                    System.out.println("Today is Saturday");
                    break;
                case 7:
                    System.out.println("Today is Sunday");
                    break;
                default:
                    System.out.println("Looking forward to the Weekend");
            }
// Outputs "Looking forward to the Weekend"
        }
    }