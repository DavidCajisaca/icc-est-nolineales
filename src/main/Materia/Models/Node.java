package main.Materia.Models;

public class Node {
    private int value;
    private Node left, right;
    private int height;  // Añadido para almacenar la altura del nodo

    // Constructor
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.height = 0;  // Inicializa la altura
    }

    // Métodos getters y setters
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    // Métodos para la altura
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
