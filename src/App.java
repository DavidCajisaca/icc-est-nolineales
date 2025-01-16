import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import main.Ejercicio3_ListaLevels.Levels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;
import main.ejercicio_02_invert.invertTree;
import main.ejercicio_04_depth.maxDepth;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------- EJERCICIO 1 ----------");
        runEjercicio1();
        System.out.println("\n---------- EJERCICIO 2 ----------");
        runEjercicio2();
        System.out.println("\n---------- EJERCICIO 3 ----------");
        runEjercicio3();
        System.out.println("\n---------- EJERCICIO 4 ----------");
        runEjercicio4();
    }

    public static void runEjercicio1() {
        ArbolBinario arbolBinario = new ArbolBinario();
        
        int[] valores = {5, 3, 7, 2, 4, 6, 8};
        
        System.out.println("Input: " + java.util.Arrays.toString(valores));
        
        for (int value : valores) {
            arbolBinario.insert(value);
        }
        
        Node root = arbolBinario.getRoot();
        System.out.println("Árbol Binario:");
        
        int height = getHeight(root);
        for (int level = 1; level <= height; level++) {
            printLevel(root, level);
            System.out.println();
        }
    }
    
    public static int getHeight(Node node) {
        if (node == null) return 0;
        int leftHeight = getHeight(node.getLeft());
        int rightHeight = getHeight(node.getRight());
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
    public static void printLevel(Node node, int level) {
        if (node == null) return;
        if (level == 1) {
            System.out.print(node.getValue() + "  ");
        } else {
            printLevel(node.getLeft(), level - 1);
            printLevel(node.getRight(), level - 1);
        }
    }
    
    
   public static void runEjercicio2() {
    ArbolBinario arbolBinario = new ArbolBinario();
    invertTree invertHelper = new invertTree();  

    int[] valores = {4, 2, 7, 1, 3, 6, 9};
    
    System.out.println("Input:");
    System.out.println("   4");
    System.out.println("2     7");
    System.out.println("1 3 6 9");

    Node root = null;

    for (int value : valores) {
        arbolBinario.insert(value);
    }

    root = arbolBinario.getRoot();
    System.out.println("Árbol Binario Normal:");
    printLevels(root);

    Node invertedRoot = invertHelper.invertTree(root);
    arbolBinario.setRoot(invertedRoot);

    System.out.println("Árbol Binario Invertido:");
    printLevels(invertedRoot);
}

public static void printLevels(Node root) {
    if (root == null) return;

    List<List<Node>> levels = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        List<Node> currentLevel = new ArrayList<>();

        for (int i = 0; i < levelSize; i++) {
            Node node = queue.poll();
            currentLevel.add(node);

            if (node.getLeft() != null) queue.add(node.getLeft());
            if (node.getRight() != null) queue.add(node.getRight());
        }

        levels.add(currentLevel);
    }

    for (List<Node> level : levels) {
        for (int i = 0; i < level.size(); i++) {
            System.out.print(level.get(i).getValue());
            if (i < level.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    
    public static void runEjercicio3() {
        ArbolBinario arbolBinario = new ArbolBinario();
        Levels levels = new Levels();
        
        int[] valores = {4, 2, 7, 1, 3, 6, 9}; 
        System.out.println("Input:");
        
        System.out.println("   4"); 
        System.out.println(" 2    7"); 
        System.out.println("1 3 6 9"); 
        
        for (int value : valores) {
            arbolBinario.insert(value);
        }
        
        List<List<Node>> levelsList = levels.listLevels(arbolBinario.getRoot());
        
        System.out.println("Output:");
        
        for (int i = 0; i < levelsList.size(); i++) {
            List<Node> level = levelsList.get(i);
            
            for (int j = 0; j < level.size(); j++) {
                System.out.print(level.get(j).getValue());
                if (j < level.size() - 1) {
                    System.out.print(" -> ");  
                }
            }
            System.out.println();
        }
    }
    
    public static void runEjercicio4() {
        ArbolBinario arbolBinario = new ArbolBinario();
        maxDepth depthHelper = new maxDepth();
        int[] valores = {3, 9, 20, 15, 7}; 
        System.out.println("Lista de entrada: " + java.util.Arrays.toString(valores)); 
        for (int value : valores) {
            arbolBinario.insert(value);
        }
        System.out.println("Árbol Binario:");
        arbolBinario.printTree();
        int maxDepth = depthHelper.maxDepth(arbolBinario.getRoot());
        System.out.println("La profundidad máxima del árbol binario es: " + maxDepth);
    }
}
