public class ArraySwap {
    public static void main(String[] args) {
    int ar[] = {3,5};
    swap(ar,0,1);
    System.out.println(ar[0]+","+ar[1]);
    }
    static void swap (int arr[], int index1, int index2) {
        int oldVal = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = oldVal;
    }
}
