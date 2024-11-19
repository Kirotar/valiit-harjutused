package newweek;

public class deBug {
    public static void main(String[] args) {
        System.out.println("Main method started");
        thirdMethodCall();
        secondMethodCall();
    }

    private static void secondMethodCall() {
        System.out.println("Second method call started");
        doSomething("hello",2,7);
        thirdMethodCall();
    }

    private static void thirdMethodCall() {
        System.out.println("Third method call started");
        String anotherText = "hello";
        int a = 5;
        int b = 6;
        a = a + (b*b);
        System.out.println(a);
        System.out.println(b);
        doSomething(anotherText,a,b);
    }

    private static void doSomething(String text, int helloWorld, int firstB) {
        int a = 4 * 4;
        double randomIsComingFromThirdMethodVariableC = Math.random();
        double b = randomIsComingFromThirdMethodVariableC * 7;
        System.out.println(text);
        System.out.println(a);
        System.out.println(helloWorld);
        System.out.println(b);
    }
}
