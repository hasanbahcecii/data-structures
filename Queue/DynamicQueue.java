package Queue;

public class DynamicQueue {

    int size = 0;
    Node front;
    Node rear;

    public DynamicQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Kuyruğa eleman ekleme
    public void Enqueue(char c) {
        Node newNode = new Node(c, null);
        if (rear == null) { // kuyruk boşsa
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode; // eski rear'ın next'i yeni node'u gösterir
            rear = newNode;      // rear güncellenir
        }
        size++;
    }

    // Kuyruktan eleman çıkarma
    public Node Dequeue() {
        if (front == null) {
            System.out.println("Queue boş!");
            return null;
        }
        Node temp = front;   // çıkarılacak node
        front = front.next;  // front'u bir sonraki node'a kaydır
        if (front == null) { // kuyruk tamamen boşaldıysa rear da null olmalı
            rear = null;
        }
        size--;
        return temp;
    }

    // Kuyruğun başındaki elemanı göster
    public void Peek() {
        if (front == null) {
            System.out.println("Queue boş!");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Kuyruğu yazdır
    public void printQueue() {
        if (front == null) {
            System.out.println("Queue boş!");
            return;
        }
        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
