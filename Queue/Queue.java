package Queue;

public class Queue {

    private final int size;
    private final char[] arr;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        this.size = size;
        arr = new char[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void Enqueue(char c) {
        if (nItems == size) {
            System.out.println("Queue dolu!");
            return;
        }
        if (rear == size - 1) {
            rear = -1;
        }
        arr[rear] = c;
        nItems++;

    }

    public char Dequeue() {
        if (nItems == 0) {
            System.out.println("Queue boş!");
            return '\0';
        }
        char temp = arr[front++];
        if (front == size) {
            front = 0;
        }
        nItems--;
        return temp;
    }
}
