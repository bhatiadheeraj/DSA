import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5]; /* generated arr = [0,0,0,0,0] */
        arr[0] = 12;
        arr[1] = 13;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /* Array should look like [12,13,0,0,0] */
        String[] stringArray = new String[5];
        stringArray[0] = "indexZero";
        stringArray[1] = "indexOne";
        stringArray[2] = "indexTwo";
        stringArray[3] = "indexThree";
        stringArray[4] = "indexFour";
        /* Printing StringArray as String*/
        System.out.println(Arrays.toString(stringArray));
        /*output will be [indexZero, indexOne, indexTwo, indexThree, indexFour]*/

    }
    /* function to make array null*/
    static void change(int[] arr){
        arr = null;
    }
}