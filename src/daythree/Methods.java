package daythree;

public class Methods {
    public static void main(String[] args) {
        //Return example, simulate database:

        int id = 1;
        getUser(id);
    }
    private static void getUser(int id){
        getUserFullName();
        getUserAge(id);
    }
        private static String getUserFullName(){
        System.out.println("Name");
        String userFullName = "John Doe"; //This would come from a database
            return userFullName;
    }
    private static int getUserAge(int id){
        System.out.println("Age");
        int age = 30; //This would come from a database
        return age;
    }
}


        //Return example:
        /* in main:
        boolean checkIfNumberIsEven = isEven(4);
        System.out.println(checkIfNumberIsEven);
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
*/

    // Return exapmple:
    /* in main:
        String hello = getGreeting();
int lenght= hello.length();
System.out.println(hello);
    }

    private static String getGreeting() {
        return "Hello World!";
    }
}*/

//Exercise solution by instructor:
     /*   int a = 4;
        int b = 5;
        getArea(a, b);
    }
    private static void getArea(int a, int b) {
        int result = a * b;
        checkArea(result);
    }
    private static void checkArea(int result) {
        int number = 20;
        if (result > number) {
            System.out.println("Area is bigger than " + number);
        } else if (result < number) {
            System.out.println("Area is smaller than " + number);
        } else {
            System.out.println("Area is equal to " + number);
        }
    }
}*/

//Method calling and parameters exercise 2:

       /*getArea();
       getArea2();
       int num = 344;
       checkArea(num);
       checkArea(12);
       checkArea(33);
       checkArea(45);
    }

    private static void getArea() {
        int oneSideOfRectangle = 2;
        int otherSideOfRectangle = 5;
        int areaOfRectangle = oneSideOfRectangle * otherSideOfRectangle;
        System.out.println("Area of rectangle is " + areaOfRectangle);
        checkArea(areaOfRectangle);
    }
    private static void getArea2() {
        int oneSideOfRectangle = 8;
        int otherSideOfRectangle = 8;
        int areaOfRectangle = oneSideOfRectangle * otherSideOfRectangle;
        System.out.println("Area of rectangle is " + areaOfRectangle);
        checkArea(areaOfRectangle);
    }
    private static void checkArea(int areaOfRectangle) {
        int number = 20;
        if (areaOfRectangle > number) {
            System.out.println("Area is bigger than " + number);
        } else if (areaOfRectangle < number){
            System.out.println("Area is smaller than " + number);
        }else {
            System.out.println("Area is equal to " + number);
        }
        }
        */

//Method calling and parameters exercise 1:

        /*int age = 30;
        getPerson(age);
        getListNames();

    //Other methods:

    private static void getPerson(int age) {
        System.out.println("Checking user details: ");
        getName();
        checkUserAge(age);

    }

    private static void getName() {
        System.out.println("John");
    }

    private static void checkUserAge(int age) {
        if (age < 18) {
            System.out.println("You are younger than 18 years. Access denied.");
        } else {
            boolean canDrive = true;
            getPermission(age, canDrive, " ");
            System.out.println("You can drive.");
        }
    }


    private static void getPermission(int age, boolean canDrive, String text) {
        if (canDrive) {
            System.out.println("Age is: " + age);
        }
    }

    private static void getListNames() {
        nameList("Jane ");
        nameList("Joe ");
        nameList("Jo ");
        nameList("Jan ");
    }

    private static void nameList(String lname) {
        System.out.println(lname + "Doe");
    }

}

//Escape sequences
/*System.out.println("Hello\tWorld"); //Puts tab between
        System.out.println("Hello\n\n\nWorld"); //Puts new lines
        System.out.println("Hello\r World"); //Carriage return, puts cursor at the beginning of the line and
        // overwrites whatever was before
        System.out.println("He said, \"Hello World\""); //Uses double quotes, \' uses single, \\ creates one \ e.g C:\\User
        */

//METHODS - parts of code that group certain functions.
//If part of code repeats, maybe it should be a method.
//If parameter defined, must have type specified e.g (int number), parameter is inside brackets, can be several.
//No parameters is (). Signature: name + parameter.
//When a parameter is passed to the method, it is called an argument.
//Note that when you are working with multiple parameters, the method call must have the same number of arguments
// as there are parameters, and the arguments must be passed in the same order. So if (int number, string name) then (5, "Jane")
//Return - method returns value back to code where you can define it and do other things with it.