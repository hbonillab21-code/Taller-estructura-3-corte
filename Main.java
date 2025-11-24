public class Main {
    public static void main(String[] args) {
      
        System.out.println("## 1. Creación del Árbol A (Enteros) ##");
        ArbolBinarioBusqueda<Integer> arbolA = new ArbolBinarioBusqueda<>();
        Integer[] clavesA = {10, 43, 24, -10, 54, 0, 23, 82, 43}; // Incluí 43 dos veces por si acaso
        for (Integer clave : clavesA) {
            arbolA.insertar(clave);
        }
        System.out.println("Árbol A creado con éxito.");
     
        System.out.println("\n## 2. Creación del Árbol B (Enteros) ##");
        ArbolBinarioBusqueda<Integer> arbolB = new ArbolBinarioBusqueda<>();
        Integer[] clavesB = {32, 67, 43, 25, 52, 56, 78, 64, 23, 67}; // Incluí 67 dos veces
        for (Integer clave : clavesB) {
            arbolB.insertar(clave);
        }
        System.out.println("Árbol B creado con éxito.");
    
        System.out.println("\n## 3. Creación del Árbol C (Caracteres) ##");
        ArbolBinarioBusqueda<Character> arbolC = new ArbolBinarioBusqueda<>();
        Character[] clavesC = {'A', 'Y', 'F', 'G', 'X', 'W', 'U', 'Z', 'R', 'B'};
        for (Character clave : clavesC) {
            arbolC.insertar(clave);
        }
        System.out.println("Árbol C creado con éxito.");
     
        System.out.println("\n" + "-".repeat(50));
        System.out.println("## Búsqueda de Claves (Preguntas 1-3) ##");
        System.out.println("-".repeat(50));
        
       
        System.out.println("\n*** Árbol A: Búsqueda de 22, 2, 24, 23 ***");
        arbolA.buscar(22);
        arbolA.buscar(2); 
        arbolA.buscar(24);
        arbolA.buscar(23);

        
        System.out.println("\n*** Árbol B: Búsqueda de 23, 24, 25 ***");
        arbolB.buscar(23);
        arbolB.buscar(24); 
        arbolB.buscar(25);

        System.out.println("\n*** Árbol C: Búsqueda de U, V, W ***");
        arbolC.buscar('U');
        arbolC.buscar('V');
        arbolC.buscar('W');


        System.out.println("\n" + "-".repeat(50));
        System.out.println("## Adición de Claves (Preguntas 4.1 - 4.3) ##");
        System.out.println("-".repeat(50));

  
        System.out.println("\n*** Adicionando claves a Árbol A ***");
        Integer[] adicionesA = {-5, -3, 22, 44};
        for (Integer clave : adicionesA) {
            arbolA.insertar(clave);
        }
        System.out.println("Claves {-5, -3, 22, 44} añadidas al Árbol A.");

       
        System.out.println("\n*** Adicionando claves a Árbol B ***");
        Integer[] adicionesB = {24, 26, 27};
        for (Integer clave : adicionesB) {
            arbolB.insertar(clave);
        }
        System.out.println("Claves {24, 26, 27} añadidas al Árbol B.");
        
        System.out.println("\n*** Adicionando claves a Árbol C ***");
        Character[] adicionesC = {'L', 'M', 'N', 'O'};
        for (Character clave : adicionesC) {
            arbolC.insertar(clave);
        }
        System.out.println("Claves {L, M, N, O} añadidas al Árbol C.");


        System.out.println("\n" + "-".repeat(50));
        System.out.println("## Eliminación de Claves ##");
        System.out.println("-".repeat(50));

        // Elimine las siguientes claves del árbol A: {10, 54, 82}
        System.out.println("\n*** Eliminando claves del Árbol A ***");
        Integer[] eliminacionesA = {10, 54, 82};
        for (Integer clave : eliminacionesA) {
            arbolA.eliminar(clave);
            System.out.println("Clave " + clave + " eliminada del Árbol A.");
        }
    }
}
.
