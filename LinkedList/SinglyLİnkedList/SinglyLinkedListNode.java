package LinkedList.SinglyLİnkedList;

public class SinglyLinkedListNode {

    public int value;
    private SinglyLinkedListNode next;

    public SinglyLinkedListNode(int value, SinglyLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public LinkedList.SinglyLİnkedList.SinglyLinkedListNode getNext() {
        return next;
    }

    public void setNext(LinkedList.SinglyLİnkedList.SinglyLinkedListNode next) {
        this.next = next;
    }
}
