package Queue;

public class Main {

    public static void main(String[] args) {

        // Static queue example 
        StaticQueue k1 = new StaticQueue(10);

        k1.Enqueue('a');
        k1.Enqueue('b');
        k1.Enqueue('c');
        k1.Enqueue('d');
        k1.Enqueue('e');
        k1.Enqueue('f');

        System.out.println("Cikarilan eleman: " + k1.Dequeue());
        k1.printQueue();
        k1.Peek();

        // Dynamic queue example 
        DynamicQueue k2 = new DynamicQueue();

        k2.Enqueue('a');
        k2.Enqueue('b');
        k2.Enqueue('c');
        k2.Enqueue('d');
        k2.Enqueue('e');
        k2.Enqueue('f');

        System.out.println("Cikarilan eleman: " + k2.Dequeue());
        k2.printQueue();
        k2.Peek();
    }
}
