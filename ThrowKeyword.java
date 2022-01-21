public class ThrowKeyword {
    public static void divide() {
        throw new ArithmeticException("trying to divide by zero");
    }
    public static void main(String[] args) {
        divide();
    }
}
