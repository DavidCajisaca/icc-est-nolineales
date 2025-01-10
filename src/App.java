import main.Ejercicio3_ListaLevels.Levels;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Controllers.ArbolRecorrido;
public class App {
    public static void main(String[] args) throws Exception {
       /*  runArbolBinario();
        preOrderIperativo();
        preOrderRecursivo();*/
        runejercicio3();
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
    
    public static void runejercicio3() {
        // Crear un árbol binario
        ArbolBinario arbolBinario = new ArbolBinario();
        Levels levels = new Levels();
    
        // Insertar valores
        int[] valores = {4, 2, 7, 1, 3, 6, 9};
        for (int valor : valores) {
            arbolBinario.insert(valor);
        }
    
        // Imprimir niveles en el formato solicitado
        System.out.println("Niveles del árbol:");
        levels.printLevels(arbolBinario.getRoot());
    }
    
    
}
