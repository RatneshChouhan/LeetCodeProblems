package com.rc.tech;


class Node {
    int data;
    Node left;
    Node right;

    public Node(int i) {
        this.data = i;
        left = null;
        right = null;
    }
}

class BinaryTree {
    Node root;
    int max_level = 0;

    void BinaryTree() {
        root = null;
    }

    public void leftView() {
        leftView(root, 1);
    }

    private void leftView(Node node, int level) {
        if (node == null)
            return;
        if (max_level < level) {
            System.out.print(node.data + "-->");
            max_level = level;
        }
        leftView(node.left, level + 1);
        leftView(node.right, level + 1);
    }
}

public class LeftViewOfBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.leftView();
    }


}


