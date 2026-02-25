package LinkedList.SinglyLİnkedList;

public class MainTestDrive {

    public static void main(String[] args) {

        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.addFirst(1);
        list1.addFirst(2);
        list1.addFirst(3);
        list1.showList();  // 3 2 1 

        list1.addLast(0);
        list1.addLast(4);
        list1.addLast(5);
        list1.addLast(6);
        System.out.println("The list after adding to the end.");
        list1.showList(); // 3 2 1 0 4 5 6

        list1.addAfter(0, 7);
        System.out.println("The desired value was added after the target value.");
        list1.showList();  // 3 2 1 0 7 4 5 6 

    }
}
