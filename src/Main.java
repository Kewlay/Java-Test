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
        // Now since this isn't a static method I can call it without making another object, Important caveat is the fact that, you can still make an object and call it!
        Main Object2 = new Main();
        Object2.NumberTwo();
    }
    public void NumberOne() {
        System.out.println("test");
        // defining program and then having it only print test, of course it doesn't get executed unless called because it's not part of main

    }
    public static void NumberTwo() {
        System.out.println("balls");

    }
}




