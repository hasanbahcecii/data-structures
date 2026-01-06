package Searching;

class NodeAVL {

    int key, height;
    NodeAVL left, right;

    NodeAVL(int d) {
        key = d;
        height = 1;
    }
}

public class AVLTree {

    NodeAVL root;

    int height(NodeAVL N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    int getBalance(NodeAVL N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    NodeAVL insert(NodeAVL node, int key) {
        if (node == null) {
            return (new NodeAVL(key));
        }
        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node;
        }
        //denge k�sm�
        node.height = 1 + ((height(node.left) > height(node.right)) ? height(node.left) : height(node.right));
        int balance = getBalance(node);
        //Dengenin hangi y�ne bozuldugunu bul 
        //Left Left durumu
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }
        //Right Right durumu
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }
        //Left Right durumu
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        //Right Left durumu
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
        return node;
    }

    NodeAVL rightRotate(NodeAVL y) {
        NodeAVL x = y.left;
        NodeAVL T2 = x.right; //sakla

        //rotasyon yap 
        x.right = y;
        y.left = T2;

        // y�kseklikleri g�ncelle
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        // yeni k�k 
        return x;
    }

    NodeAVL leftRotate(NodeAVL x) {
        NodeAVL y = x.right;
        NodeAVL T2 = y.left; // sakla

        // rotasyon
        y.left = x; //yeni k�k
        x.right = T2;

        // y�kseklikleri g�ncelle 
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        //yeni k�k 
        return y;
    }

    private NodeAVL successor(NodeAVL root) {
        NodeAVL current = root;

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }

    NodeAVL deleteNode(NodeAVL root, int key) {

        // BST delete
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            // silinecek d���m bulundu
            // Tek veya hi� �ocu�u yok
            // E�er silinecek d���m�n �ocu�u yoksa, do�rudan silinir.
            // E�er silinecek d���m�n bir �ocu�u varsa, bu d���m yerine �ocu�u ge�irilir.
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // �ki �ocu�u varsa
            // Sa� alt a�a�taki en k���k de�eri bul
            NodeAVL temp = successor(root.right);
            root.key = temp.key;
            root.right = deleteNode(root.right, temp.key);
        }

        //AVL eleman silindi�i i�in yukseklik guncelle
        root.height = 1 + max(height(root.left), height(root.right));

        // balance hesapla
        int balance = getBalance(root);

        // Rostasyonlar
        // Left Left
        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        // Left Right
        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // Right Right
        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        // Right Left
        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    void preOrder(NodeAVL node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 9);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 0);
        tree.root = tree.insert(tree.root, 6);
        tree.root = tree.insert(tree.root, 11);
        tree.root = tree.insert(tree.root, -1);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 2);

        /* The constructed AVL Tree would be 
        9 
        / \ 
        1 10 
        / \ \ 
        0 5 11 
        / / \ 
        -1 2 6 
         */
        System.out.println("Preorder traversal of "
                + "constructed tree is : ");
        tree.preOrder(tree.root);

        tree.root = tree.deleteNode(tree.root, 10);

        /* The AVL Tree after deletion of 10 
        1 
        / \ 
        0 9 
        /     / \ 
        -1 5 11 
        / \ 
        2 6 
         */
        System.out.println("");
        System.out.println("Preorder traversal after "
                + "deletion of 10 :");
        tree.preOrder(tree.root);

    }

}
