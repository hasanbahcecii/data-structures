package OOP3;
// Test için main

public class Main {
    public static void main(String[] args) {
        BinaryFile bf = new BinaryFile("deneme.bin", "/home/hasan");
        TextFile tf = new TextFile("metin.txt", "/home/hasan");

        System.out.println(bf.Info());
        System.out.println("-------------------");
        System.out.println(tf.Info());

        bf.Read();
        tf.Read();
    }
}
