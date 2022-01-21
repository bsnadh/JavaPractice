public class U1 {
    public static void main(int[] args) {
        int a[][] = {{1,2,3},{5,3,8},{7,3,6}};
        for (int[] innerArray : a)
        {
           for (int val : innerArray)
           {
               System.out.println(val);
           }
        }
        }
    }
       