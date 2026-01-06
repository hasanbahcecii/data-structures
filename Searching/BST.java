package Searching;

class Node {

    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}
class BST {
	Node root;

	//Agaca ekleme yapma 
	Node insert(Node node, int key) {
		if (node == null)// arama bitti, eleman yerle�tirilebilir
                {
                    Node newNode=new Node(key);
                    return newNode;
                }
			
		if (key < node.key)
			node.left = insert(node.left, key);
		else if (key > node.key)
			node.right = insert(node.right, key);
		return node;
	}

	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}
        Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {//silinecek d���m bulundu

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
            root.key = successor(root.right);

            // Sa� alt a�a�taki bu minimum de�eri sil
            root.right = delete(root.right, root.key);
        }

        return root;
    }
        private int successor(Node root) {
        int minValue = root.key;
        while (root.left != null) {
            root = root.left;
            minValue = root.key;
        }
        return minValue;
    }

	
	public static void main(String[] args) {
		BST tree = new BST();

		
		tree.root = tree.insert(tree.root, 50);
		tree.insert(tree.root, 30);
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 40);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 60);

		System.out.print("Original BST: ");
		tree.inorder(tree.root);

		System.out.println("\n\nDelete a Leaf Node: 20");
		tree.root = tree.delete(tree.root, 20);
		System.out.print("Modified BST tree after deleting Leaf Node:\n");
		tree.inorder(tree.root);

		System.out.println("\n\nDelete Node with single child: 70");
		tree.root = tree.delete(tree.root, 70);
		System.out.print("Modified BST tree after deleting single child Node:\n");
		tree.inorder(tree.root);

		System.out.println("\n\nDelete Node with both child: 50");
		tree.root = tree.delete(tree.root, 50);
		System.out.print("Modified BST tree after deleting both child Node:\n");
		tree.inorder(tree.root);
	}
}

