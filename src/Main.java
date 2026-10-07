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
        System.out.println("your string variable is " + textstring + " And your shorter string entry is "+ TEST + " and your integer variable is " + a + " and your float variable is " + b );
    }
    public void Operations() {
        // There's an awesome concept here, apparently this operations method can't see anything inside the variables method, so you can't just use the a and b variables we defined before, we have to define new ones
        int a = 1;
        float b = 3.99f;
        System.out.println(a + b);
    }
}




