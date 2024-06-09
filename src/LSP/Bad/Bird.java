package LSP.Bad;

//In this example, the Bird class is extended by Ostrich, which overrides the fly method to throw an exception.
// This violates LSP because substituting a Bird with an Ostrich breaks the program.

public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Bird ostrich = new Ostrich();
        ostrich.fly();
    }
}
