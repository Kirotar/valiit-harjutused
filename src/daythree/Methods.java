package daythree;

public class Methods {

    private static void nameList(String lname){
        System.out.println(lname+ "Doe");
    }
    public static void main(String[] args) {
        getPerson();
        nameList("Jane");
        nameList("Joe");
        nameList("Jo");
        nameList("Jan");
    }
    //Other methods:

    private static void getPerson() {
        System.out.println("Checking user details: ");
        getName();

    }

    private static void getName() {
        System.out.println("John");
        checkUserAge();
    }

    private static void checkUserAge() {
        int age = 30;
        if (age > 18) {
            System.out.println("You are older than 18 years");
            getAge();
        }else{
            System.out.println("You are younger than 18 years. Access denied.");
        }
    }

    private static void getAge() {
        System.out.println("Age is: 30.");
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