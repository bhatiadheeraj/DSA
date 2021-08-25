public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 13;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /* Array should look like [12,13,0,0,0] */
    }
}