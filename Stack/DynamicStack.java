package Stack;

public class DynamicStack {

    private Node top;

    public DynamicStack() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " stack'e eklendi.");
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack boş.");
            return -1;
        } else {
            int poppedValue = top.data;
            top = top.next;
            System.out.println(poppedValue + " stack'ten çıkarıldı.");
            return poppedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack boş.");
            return -1;
        } else {
            return top.data;
        }
    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
