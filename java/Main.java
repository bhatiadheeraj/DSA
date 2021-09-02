
public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(40);
        st.pop();
        st.push(70);
        st.push(90);
        System.out.println(""+st.top());
        st.print();
    }
}
