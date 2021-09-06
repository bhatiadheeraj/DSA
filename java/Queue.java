public class Queue {
    int arraySize = 1000;
    int[] arrayholder;
    int length_checker = 0;
    Queue() {
         arrayholder = new int[arraySize];
    }
    public void enqueue (int input){
        if (length_checker+1 <= arraySize) {
            arrayholder[length_checker] = input;
            length_checker++;
            return;
        }else{
            int[] new_array = new int[arraySize*2];
            for(int i=0; i <arraySize;i++) {
                new_array[i] = arrayholder[i];
            }
            arrayholder = new_array;
            arraySize = arraySize *2;
        }
    }
    public void dequeue() {
        arrayholder[0] = 0;
        for(int i=1; i<=length_checker;i++) {
            arrayholder[i-1] = arrayholder[i];
        }
        arrayholder[length_checker] = 0;
        length_checker--;
        for(int i=0; i<length_checker;i++) {
            System.out.println(""+arrayholder[i]);
        }
    }
    public int front () {
     return arrayholder[0];
    }

    public int rear() {
        return arrayholder[length_checker-1];
    }

}
