package main.ejercicio_04_depth;

import main.Materia.Models.Node;

public class maxDepth {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.getLeft());  
        int rightDepth = maxDepth(root.getRight());  
        return Math.max(leftDepth, rightDepth) + 1;  
    }
}
