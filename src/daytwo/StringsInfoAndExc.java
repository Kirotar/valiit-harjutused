package daytwo;

public class StringsInfoAndExc {
    public static void main(String[] args) {
     /*   //String is immutable. To change a String use "StringBuilder" or sb.toString() or
       String incomingText = "Tallinn";
        String aadress = "Aadress Tartu";
        StringBuilder sb = new StringBuilder(aadress);
        sb.append(", tänav");
        sb.append(", maja");
        sb.append(7.7);
        sb.insert(8, "50444 ");
        System.out.println(sb.toString()); //prints stringbuilder data as string

        String txt = sb.toString(); //stores stringbuilder data as string
        System.out.println(txt);

//data
        char[]data= {'a','b','c','d','e','f'}; //on sama kui
        String abc ="abc";
      String[]dataOfStrings={"one", "two", "three"};

      String str= new String(data);
      System.out.println(str);
str.toUpperCase();

String uni = "University of ";
String tln = "Tallinn";
        String fullName = uni.concat(tln); //liidab kokku
System.out.println(fullName);

//String Operations
      //  indexOf() //uuri ise edasi
        */

        /*
        //Harjutus 1
        String helloWorld = "hello world";
        System.out.println(helloWorld.toUpperCase());

        //Punktiga saab panna mitu erinevat funktsiooni külge.
        Kui tahta ilusamalt ja panna mitu asja kokku, siis eraldi defineerida nt 'uppercase' ja printida siis
        ("text" + uppercase + midagi veel jne)

        //Harjutus 2
        String helloWorld2 = "HELLO WORLD";
        System.out.println(helloWorld2.toLowerCase());

        //Harjutus 3
        System.out.println(helloWorld.contains("world"));

        //Harjutus 4
        char result = helloWorld.charAt(0);
        System.out.println(result);

        //Harjutus 5
        String replacedHello = "Hello World";
        System.out.println(replacedHello.replace('o', 'õ'));

        //Kinnistan
        String insects = "butterfly";
        char returnbug = insects.charAt(5);
        System.out.println(returnbug);

        String text = "lotsoftext";
        System.out.println(text.charAt(0));
        char re = text.charAt(5);
        System.out.println(re);


        System.out.println(insects.replace('t', 'y'));
        */
        //Harjutus 6
        String helloworld = "Hello, World!";
        System.out.println(helloworld.startsWith("Hello"));
        System.out.println(helloworld.endsWith("World!"));
        System.out.println(helloworld.startsWith("Hello") && helloworld.endsWith("World!"));

        boolean starts = helloworld.startsWith("Hello");
        boolean ends = helloworld.endsWith("World!");
        boolean result = starts && ends;


        //Harjutus 7
        System.out.println(helloworld.substring(7, 12));

        //Harjutus 8
        String spell = "abracadabra";
        int first = spell.indexOf('a');
        int last = spell.lastIndexOf('a');

        System.out.println(spell.indexOf('a'));
        System.out.println(spell.lastIndexOf('a'));

        System.out.println("First instance on 'a' is: " + first + " and last instance of 'a' is: " + last);

        //Harjutus 9
        String sentence = "Java is fun.";
        String rep = "fun";
        System.out.println(sentence.replaceFirst(rep, "awesome"));

        /*parem on mitte souti panna hardcoded asju vaid iga asi defineerida enne ära, näiteks:
        String target =
        String replacement =
        String updatedSentence= sentence.replace(target, replacement)
        Ja siis alles print
        */
    }

}
