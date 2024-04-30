package bst;

public class BinarySearchTree {

    private static class Node {
        private int key;
        private Node left, right;

        public Node(int item) {
            this.key = item;
            this.left = this.right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert1(int key){
        Node newNode = new Node(key);
        if (this.root == null){
            this.root = newNode;
        }
        else {
            Node current = this.root;
            while (true){
                if (key < current.key){
                    if (current.left == null){
                        current.left = newNode;
                        return;
                    }
                    else {
                        current = current.right;
                    }
                }
                else {
                    if (current.right == null){
                        current.right = newNode;
                        return;
                    }
                    else {
                        current = current.right;
                    }
                }
            }
        }
    }

    public void insert(int key) {
        this.root = insertRec(this.root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }

    public void inorder() {
        inorderRec(this.root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null)
            return null;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
}
