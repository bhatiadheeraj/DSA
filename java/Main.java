
public class Main {
    public static void main(String[] args) {
        /* Stack st = new Stack();
        st.push(1);
        st.push(40);
        st.pop();
        st.push(70);
        st.push(90);
        System.out.println(""+st.top());
        st.print(); */
        LinkedList singlyLinkedList = new LinkedList();
        singlyLinkedList.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(45);
        singlyLinkedList.head.next = second;
        second.next = new LinkedList.Node(90);
        singlyLinkedList.printList();

        System.out.println("/****DOUBLY LINKED LIST*****/");

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.head = new DoublyLinkedList.Node(50);
        DoublyLinkedList.Node secondDN = new DoublyLinkedList.Node(2);
        doublyLinkedList.head.next = secondDN;
        secondDN.prev = doublyLinkedList.head;
        doublyLinkedList.head.prev = null;
        System.out.println(doublyLinkedList.head.next);

        doublyLinkedList.append(5);
        doublyLinkedList.printList(doublyLinkedList.head);
    }
}
