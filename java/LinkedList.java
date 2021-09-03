public class LinkedList {
    Node head;
    /* IMPLEMENTATION OF SINGLY LINKED LIST */
    static class Node{
        int value; /* this is value of Node*/
        Node next;
        /* below is constructor*/
        Node(int v) {
            value = v; /* sets value */
            /* next is set to null*/
        }
    }
    public void printList() {
        Node nodeHead = head;
        while (nodeHead != null) {
            System.out.print(""+ nodeHead.value+"->");
            nodeHead = nodeHead.next;
        }
    }
}

