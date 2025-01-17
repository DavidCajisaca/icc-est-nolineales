package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;
import main.Materia.Models.NodeG;

public class Graph {
   private List<NodeG> nodes;
    public Graph(){
        this.nodes = new ArrayList<>();
    }
public NodeG addNodeg(int value) {
    NodeG newNode = new NodeG(value);
    nodes.add(newNode);
    return newNode; 
}
public void addEdge(NodeG src, NodeG dest){
    src.addNeighbors(dest);
    dest.addNeighbors(src);

}
public NodeG getNodeByValue(int value) {
    for (NodeG node : nodes) {
        if (node.getValue() == value) {
            return node;
        }
    }
    return null; // Return null if no matching node is found
}

public void printGraph(){
    for(NodeG node:nodes){
        System.out.print("Nodo: "+node.getValue());
        System.out.print(" Vecinos: ");
        for(NodeG neighbor:node.getNeighbors()){
            System.out.println(neighbor.getValue());
        }
        System.out.println();

    }
    
}
}
