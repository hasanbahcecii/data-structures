package Queue;

public class StaticQueue {

    private final int size;
    private final char[] arr;
    private int front;
    private int rear;
    private int nItems;

    public StaticQueue(int size) {
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
        arr[++rear] = c;
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

    public void Peek() {
        System.out.println("Front element: " + arr[front]);
        System.out.println("Rear element: " + arr[rear]);
    }

    public void printQueue() {
        if (nItems == 0) {
            System.out.println("Queue boş!");
            return;
        }
        System.out.print("Queue: ");
        int count = 0;
        int index = front;
        while (count < nItems) {
            System.out.print(arr[index] + " ");
            index++;
            if (index == size) { // dairesel mantık
                index = 0;
            }
            count++;
        }
        System.out.println();
    }

}
