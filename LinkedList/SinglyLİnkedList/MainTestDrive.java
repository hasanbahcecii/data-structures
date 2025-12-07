package LinkedList.SinglyLİnkedList;

public class MainTestDrive {
    public static void main(String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);

        list1.showList();


        list1.addLast(0);
        System.out.println("The list after adding to the end..");
        list1.showList();

    }
}
