import java.util.Scanner;
public class Main

{
    public static void main() { // The main class that java first looks at and executes with no caveats
        System.out.println("Welcome World, This place will showcase my progression in learning java, hope you're ready for it");
        System.out.println("Java's slogan is due! Write once, run anywhere!");
        Main Object1 = new Main();
        // if I want to call another non-static method to do something from the main method I make a new main object
        Object1.NumberOne();
        // and I now CALL this new main object to perform whatever method program does
        NumberTwo();
        // Now since this is a static method I can call it without making another object, Important caveat is the fact that, you can still make an object and call it!
        Main Object2 = new Main();
        Object2.NumberTwo();

        // Now to experiment with variables
        Main Object3 = new Main();
        Object3.Variables();

        // Now to call operations so we can see some math go down
        Object3.Operations();
        // Also apparently I don't need to define an object each time I want to call another method from main, interesting.
        Object3.InputTest();
    }
    public void NumberOne() {
        System.out.println("test");
        // defining program and then having it only print test, of course it doesn't get executed unless called because it's not part of main

    }
    public static void NumberTwo() {
        System.out.println("balls");
    }
    public void Variables() {
        String textstring;
        textstring = "HELLO";
        String TEST = "TEST";
        textstring = "HAHA FOOLED YA!"; // Pay attention, your variable can change values multiple times, they are NOT fixed!
        int a = 5;
        float b = 1.99f;
        double c = 1.24;
        boolean d = true;
        System.out.println("your string variable is " + textstring + " And your shorter string entry is "+ TEST + " and your integer variable is " + a + " and your float variable is " + b + " Also your double variable is " + c + " And for the last variable your boolean is "+ d);
        // By the way, a double variable is more accurate than a float variable, however, it uses more memory, and you can probably get away with using float in most places
    }
    public void Operations() {
        // There's an awesome concept here, apparently this operations method can't see anything inside the variables method, so you can't just use the a and b variables we defined before, we have to define new ones
        int a = 1;
        float b = 3.99f;
        System.out.println(a + b); // Mathematical Operation because no string is involved
        System.out.println("The result of the sum of variables a and b is " + a + b); // String is involved so now you just smush the numbers together
        System.out.println("The result of the sum of variables a and b is " + (a + b)); // If you do the addition inside parenthesis it won't concatenate!
        System.out.println(a % b); // Calculates the remainder of 1/3.99
    }
    public void InputTest() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Scanner bc = new Scanner(System.in);
        int a = bc.nextInt();

        System.out.println("Something: "+name);
        System.out.println("integer something something: "+a);
        System.out.println("a break");
        name = sc.nextLine(); // To re-assign a variable you have to remove the type declaration from behind it
        a = sc.nextInt(); // To re-assign a variable you have to remove the type declaration from behind it
        System.out.println("Something: "+name); // both taken from the same scanner
        System.out.println("integer something something: "+a); // both taken from the same scanner

    }
}




