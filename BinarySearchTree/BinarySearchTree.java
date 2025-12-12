package BinarySearchTree;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRecursive(root, key);
    }

    public Node insertRecursive(Node root, int key) {

        // if its emty create new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.getKey()) {
            root.setLeft(insertRecursive(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(insertRecursive(root.getRight(), key));
        }
        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.getLeft());
            System.out.print(root.getKey() + ", ");
            inorder(root.getRight());
        }
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
