package newweek;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            //Risky code
            System.out.println(result);
        } catch (ArithmeticException e) {
            //handle exeption
            System.out.println("Cannot divide by zero.");
        }finally{
            //always executed
            System.out.println("This will always run.");
        }
    }
}
