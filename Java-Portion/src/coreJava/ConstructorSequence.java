package coreJava;

class ConstructorSequence {
    // Three-parameter constructor
    ConstructorSequence(int a, int b, int c) {
        System.out.println("Three-parameter constructor");
    }

    // Default constructor
    ConstructorSequence() {
        this(1, 2, 3); // Calls three-parameter constructor
        System.out.println("Default constructor");
    }

    // One-parameter constructor
    ConstructorSequence(int a) {
        this(); // Calls default constructor
        System.out.println("One-parameter constructor");
    }

    // Two-parameter constructor
    ConstructorSequence(int a, int b) {
        this(1); // Calls one-parameter constructor
        System.out.println("Two-parameter constructor");
    }

    // Four-parameter constructor
    ConstructorSequence(int a, int b, int c, int d) {
        this(1, 2); // Calls two-parameter constructor
        System.out.println("Four-parameter constructor");
    }

    public static void main(String[] args) {
        // Creating one object to trigger the sequence
        new ConstructorSequence(1, 2, 3, 4);
    }
}
