import java.util.Arrays;

public class Stack {
    public static int MAX = 10000;
    public int top;
    int array[] = new int[MAX];
    public Stack() {
        /* constructor get called when object is initliazed*/
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0); /* automatically gets resolved*/
    }

    boolean push(int x) {
        if(top >= (MAX - 1)) {
            /* when top is increased such that it gets over the MAX size*/
            return false;
        } else {
            top++;
            array[top] = x;
            return true;
        }
    }

    int top() {
        if(top >= 0) return array[top];
        System.out.println("Stack underflow");
        return 0;
    }
    int pop(){
        if(top >= 0) {
            int result = array[top];
            top = top - 1; /* or we can do top--*/
            return result;
        } else {
            System.out.println("Stack underflow");
            return 0;
        }
    }

    void print() {
        for(int i = top; i >= 0; i--){
            System.out.println(""+array[i]);
        }
    }

}
