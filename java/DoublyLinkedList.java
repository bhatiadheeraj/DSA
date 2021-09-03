public class DoublyLinkedList {
    Node head;
    static class Node{
        int value;
        Node next,prev;
        Node (int v) {;
            value =v;
        }
    }

    public Node getHead() {
        return head;
    }

    public void push (int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    /* append to last*/
    public void append(int newData) {
        Node newNode = new Node(newData);
        Node last = head;
        if(head == null) {
            head = newNode;
            newNode.prev = null;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    public void InsertAfter(Node prevNode, int val) {
        Node newNode = new Node(val);
        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if (newNode.next !=null) {
            newNode.next.prev = newNode;
        }
    }

    public void printList(Node node) {
        Node start = null;
        while (node != null) {
            System.out.print(node.value+"->");
            start = node;
            node = node.next;
        }
        System.out.println("\nStarting from behind");

        while (start != null) {
            System.out.print(start.value + "->");
            start = start.prev;
        }
    }

}
