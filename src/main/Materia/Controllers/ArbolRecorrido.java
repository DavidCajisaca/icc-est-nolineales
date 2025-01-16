package main.Materia.Controllers;

import java.util.Stack;
import main.Materia.Models.Node;

public class ArbolRecorrido {
    public void preOrderIterativo(Node root) 
    {
        if (root == null){
            return;
    }
    Stack <Node> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()){
        Node node = stack.pop();
        System.out.print(node.getValue()+" , ");
        if(node.getRight()!=null){
            stack.push(node.getRight());

        }
        if(node.getLeft()!=null){
            stack.push(node.getLeft());
        }
    }
    }
    public void preOrderrecursivo (Node node){
        if(node!=null){
            System.out.print(node.getValue()+" , ");
            preOrderrecursivo(node.getLeft());
            preOrderrecursivo(node.getRight());
            
        }

    }
    public void postOrder(Node node){
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getValue()+" , ");       
        }
    }
    public void inOrder(Node node){
        if(node!=null){
            inOrder(node.getLeft());
            System.out.print(node.getValue()+" , ");
            inOrder(node.getRight());
            
        }
    }
}
