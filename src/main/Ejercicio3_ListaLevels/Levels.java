package main.Ejercicio3_ListaLevels;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.Materia.Models.Node;

public class Levels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        
        if (root == null) {
            return result; 
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                currentLevel.add(currentNode);
                if (currentNode.getLeft() != null) {
                    queue.add(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.add(currentNode.getRight());
                }
            }

            result.add(currentLevel);
        }

        return result;
    }

    public void printLevels(Node root) {
        List<List<Node>> levels = listLevels(root);

        for (List<Node> level : levels) {
            StringBuilder levelOutput = new StringBuilder();

            for (int i = 0; i < level.size(); i++) {
                if (i > 0) {
                    levelOutput.append("->");
                }
                levelOutput.append(level.get(i).getValue());
            }

            System.out.println(levelOutput.toString());
        }
    }
}