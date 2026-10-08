import java.util.Scanner;
public class FirstTry

{
        static void main() {
            int a = 9;
            switch (a) {
                case 1, 2: // You can merge cases like so, in order to keep your code clean
                break;
                case 3:
                    System.out.println("We've reached case 3");
                case 7:
                    System.out.println("a has the value of " + a);
                    // Whatever's in front of case is the value it's going to be checking against the variable inside the switch() function which appears to be a
                break;
                default: // default is essentially the "else" of our switch function, basically if switch was else if, default is the "else"
                    System.out.println("You've reached the end, turn back now.");
                    orcondition();
                break;
            }
        }
        public static void andcondition() {

            Scanner A= new Scanner(System.in);
            int a = A.nextInt();
                if(a>18 && a<50) { // And signs are the operator for AND
                System.out.println("Welcome! You're in the targeted audience");
            }
                else {
                    System.out.println("What...?");
                }
        }
        public static void orcondition() {
            Scanner A = new Scanner(System.in);
            System.out.println("Hey, please enter your age and height respectively ");
            int a = A.nextInt();
            int b = A.nextInt();
            if (a > 18 || b > 140) { // Parallel lines is the operator for OR
                System.out.println("Welcome in! You've met at least one of the conditions for this message");
            } else if(!(b==140)) { // A single exclam mark is the NOT operator
                System.out.println("We know for sure that you aren't 140cm tall"); // This is braindead I'm just testing out the NOT operator
            } else {
                System.out.println("What the fuck is your problem");
            }
        }
    }