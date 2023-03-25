package Tutorials.binarytreesearch;

public class BinaryTree {

    Node root;

    // If the new node's value is lower than the current node's, we go to the left child;
    // If the new node's value is higher than the current node's, we go to the right child;
    // When the current node is null, we've reached a leaf node and we can insert the new node in that position.

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }
    
}
