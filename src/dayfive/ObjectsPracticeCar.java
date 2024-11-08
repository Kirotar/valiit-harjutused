package dayfive;

public class ObjectsPracticeCar {
    //Properties (fields/attributes) of the class:
    String brand;
    String model;
    int year;

    /*if you have not created one Java will make a constructor with defaults null, 0
    public ObjectsPracticeCar(){
        //Initialize default values
        }*/
//Default constructor
    public ObjectsPracticeCar() {
        brand = "Not specified";
        model = "Unknown";
        year = 2000;
    }

    //Parameterized constructor
    //Parameters must be connected to Class properties (fields) using the 'this' keyword
    public ObjectsPracticeCar(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
/* //Override toString() method to return a string representation
@Override
public String toString(){
return "Car [Brand=" + brand 0 ", Model=" + model ", Year=" + year]"}
 */
    //Constructor overloading - multiple constructors with different parameter lists. This allows objects of the class to
// be created in different ways, depending on the data available when the object is instantiated.
    public static void main(String[] args) {
        //OBJECTS:
      /*  Primitive types - can do operations, not methods. String "." gives many options.
      Reference type (non-primitive type): can hold value 'null', start with Capital letter, can call method. E.g. String, Array, Class.
      int = can be '0', can't be 'null', Integer x = can be 'null'
       */
// a class is a template for objects, and an object is an instance of a class.
// When the individual objects are created, they inherit all the variables and methods from the class.

        //Creating objects of the ObjectsPracticeCar class:
        ObjectsPracticeCar car1 = new ObjectsPracticeCar();
        ObjectsPracticeCar car2 = new ObjectsPracticeCar("Honda", "Civic", 2000);
        ObjectsPracticeCar car3 = new ObjectsPracticeCar("Honda2", "Civic2", 2002);
        ObjectsPracticeCar car4 = new ObjectsPracticeCar();

//Calling the method to display details of each car:
        car1.displayDetails();
        System.out.println(" ");
        car2.displayDetails();
        System.out.println(" ");
        car3.displayDetails();
        System.out.println(" ");
        car4.displayDetails();

    }

    public void displayDetails() {
        // Method to display car details
        System.out.println("Car Details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        test();
    }

    private void test() {
        System.out.println("Car test: ");
    }
}


