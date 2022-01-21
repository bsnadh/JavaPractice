// in this thread example the value of amount is unpredictable

public class ThreadEx extends Thread {
    public static int amount = 0;
    public static void main(String[] args) {
        ThreadEx thread = new ThreadEx();
        thread.start();
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run() {
        amount++;
        System.out.println(amount);
    }
}
