package LinkedList.SinglyLİnkedList;

public class SinglyLinkedList {

    private SinglyLinkedListNode head;
    private SinglyLinkedListNode current;

    public SinglyLinkedList() {
        head = null;
        current = null;
    }

    // add to the beginning of the list
    public void addFirst(int value) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(value, null);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(int value) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(value, null);
        current = head;

        if (head == null) {
            head = newNode;
            return;
        }
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(newNode);  //add the new node

    }

    public void addBefore(int value) {

    }

    public void addAfter(int targetValue, int value) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(value, null);
        current = head;

        if (head == null) {
            throw new IllegalArgumentException("List is empty!");
        }

        while (current != null) {
            if (current.value == targetValue) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                return;
            }

            current = current.getNext();
        }
        throw new IllegalArgumentException("Value " + targetValue + " not found in the list!");

    }

    // write all the list in order
    public void showList() {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            SinglyLinkedListNode temp = head;
            int i = 1;
            while (temp != null) {
                System.out.println("Node " + i + ": " + temp.value);
                temp = temp.getNext();
                i++;
            }
        }
    }

    public SinglyLinkedListNode getCurrent() {
        return current;
    }

    public void setCurrent(SinglyLinkedListNode current) {
        this.current = current;
    }
}
