public class Array2d {
    public static void main(String[] args) {
        //initialize 3d array
        int[][][] a = {{{1,2,3},{4,5,7,88}},{7,8,}};
        //print 3d array
        for (int[][] arr2d : a) {
            for (int[] arr1d : arr2d) {
                for (int data : arr1d) {
                    System.out.println(data);
                }
            }
        }

    }
}
