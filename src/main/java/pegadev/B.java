package pegadev;

public interface B {
    default void printSomething() {
        System.out.println("something else");
    }
}
