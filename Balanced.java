package exam.src;

public class Balanced {
    static int Balance(int[] array) {
        if(array.length%2==0) {
            for(int i=0; i<=array.length; i++) {
                if(array[i]%2!=0)
                    return 0;
            }
        }
        else if(array.length%2!=0) {
            for(int i=0; i<=array.length; i++) {
                if(array[i]%2==0)
                    return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a[] = {1,2};
        Balance(a);
    }
}
