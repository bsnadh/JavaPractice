
/**
 * 
 * final keyword is used to denote constants -> it is used with variables, methods, classes
 * the final variable cannot be reinitialized with another value
 * the final class cannot be extended
 * the final method cannot be overridden
 */
final class Hello {}
public class Final extends Hello {

    void r() {
        System.out.println("x");
    }
    public static void main(String[] args) {
        Final h = new Final();
        h.r();
    }
}

