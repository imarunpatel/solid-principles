package LSP.Good;

//In this example, we use an abstract Bird class with a move method.
// The FlyingBird subclass implements flying behavior, while the Ostrich subclass implements walking behavior.
// This adheres to LSP because each subclass can replace the superclass without breaking the program.

public class Main {
    public static void main(String[] args) {
        Bird flyingBird = new FlyingBird();
        flyingBird.move();

        Bird ostrich = new Ostrich();
        ostrich.move();
    }
}
