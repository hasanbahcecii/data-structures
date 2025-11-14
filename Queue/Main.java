package Queue;

public class Main {

    public static void main(String[] args) {
        Queue k1 = new Queue(5);

        k1.Enqueue('a');
        k1.Enqueue('b');
        k1.Enqueue('c');

        System.out.println(k1.Dequeue());

        Queue k2 = new Queue(5);

        k1.Enqueue('1');
        k1.Enqueue('2');
        k1.Enqueue('3');

        System.out.println(k2.Dequeue());

    }
}
