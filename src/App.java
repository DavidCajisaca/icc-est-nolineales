import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorrido;

public class App {
    public static void main(String[] args) throws Exception {
        runArbolBinario();
        preOrderIperativo();
        preOrderRecursivo();
    }

    public static void runArbolBinario() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40,20,60,10,30,50,70,5,15,55};

        // Ingresar valores
        for (int valor : valores) {
            arbolBinario.insert(valor);

        }   
        // Mostrar el árbol
        arbolBinario.printTree();
     }
     
      public static void preOrderIperativo() {
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40,20,60,10,30,50,70,5,15,55};
        // Ingresar valores
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        ArbolRecorrido arbolRecorrido = new ArbolRecorrido();
        System.out.println("\nPre-Order Iperativo");
        arbolRecorrido.preOrderIterativo(arbolBinario.getRoot());
        System.out.println("\n ");

     }
        
    public static void preOrderRecursivo(){
        ArbolBinario arbolBinario = new ArbolBinario();
        int[] valores = {40,20,60,10,30,50,70,5,15,55};
        // Ingresar valores
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
        ArbolRecorrido arbolRecorrido = new ArbolRecorrido();
        System.out.println("\n Pre-Order Recurs");
        arbolRecorrido.preOrderrecursivo(arbolBinario.getRoot());
        System.out.println("\n Post Order");
        arbolRecorrido.postOrder(arbolBinario.getRoot());
        System.out.println("\n In Order");
        arbolRecorrido.inOrder(arbolBinario.getRoot());
    }
    


}
