package BinarySearchTree;

public class BSTMain {

    public static void main(String[] args) {

        BinarySearchTree tree1 = new BinarySearchTree();

        tree1.insert(1);
        tree1.insert(5);
        tree1.insert(7);
        tree1.insert(9);
        tree1.insert(6);
        tree1.insert(8);
        tree1.insert(11);
        tree1.insert(10);
        tree1.insert(13);
        tree1.insert(16);
        tree1.insert(15);
        tree1.insert(2);
        tree1.insert(4);
        tree1.insert(3);

        System.out.println("Inorder traversal: ");
        tree1.inorder(tree1.root);

    }
}
