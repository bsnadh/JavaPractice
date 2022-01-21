package exam;

public class OverloadingEx {

    private static void display(int a, int b) {
        System.out.println(a+b);;
    }
    private static void display(int a,int b,int c) {
        System.out.println(a+b+c);;
    }
    public static void main(String[] args) {
        display(4,5);
        display(4,5,6);
    }
}
