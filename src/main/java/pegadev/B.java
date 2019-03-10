package pegadev;
/**
 * 
 * @author adel.bayoudh
 *
 */
public interface B {
    default void printSomething() {
        System.out.println("something else");
    }
}
