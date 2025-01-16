package main.Materia.Controllers;

import main.Materia.Models.Node;

public class ArbolBinario {
    private Node root;  

    public ArbolBinario() {
        this.root = null;  
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);  
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));  
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));  
        }
        return root;
    }

    public void printTree() {
        printTree(root, 0);  
    }

    private void printTree(Node node, int level) {
        if (node != null) {
            printTree(node.getRight(), level + 1);  
            for (int i = 0; i < level; i++) {
                System.out.print("   ");  
            }
            System.out.println(node.getValue());  
            printTree(node.getLeft(), level + 1);  
        }
    }
}
