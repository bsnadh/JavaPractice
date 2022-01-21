package exam.src;

public class StaticBlock {
    //static variable
    static int a = 10;
    static int b;
    // static block gets executed exactly once when the class is first loaded
    // when the variable is declared static a single copy of variable is created and shared among all the objects at the class level

    //static block
    static {
        System.out.println("static block");
        b = a+40;
    }
    public static void main(String[] args) {
        System.out.println(b*2);
    }
}
