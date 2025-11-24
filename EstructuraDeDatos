import java.util.List;
import java.util.ArrayList;

class ArbolBinarioBusqueda<T extends Comparable<T>> {
    Nodo<T> raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }
class Nodo<T extends Comparable<T>> {
    T clave;
    Nodo<T> izquierda;
    Nodo<T> derecha;

    public Nodo(T clave) {
        this.clave = clave;
        this.izquierda = null;
        this.derecha = null;
    }
}
    public void insertar(T clave) {
        raiz = insertarRecursivo(raiz, clave);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> actual, T clave) {
        if (actual == null) {
            return new Nodo<>(clave);
        }

       
        if (clave.compareTo(actual.clave) < 0) {
            actual.izquierda = insertarRecursivo(actual.izquierda, clave);
        } 
      
        else if (clave.compareTo(actual.clave) > 0) {
            actual.derecha = insertarRecursivo(actual.derecha, clave);
        }
       

        return actual;
    }

    public boolean buscar(T clave) {
        List<T> recorrido = new ArrayList<>();
        Nodo<T> resultado = buscarRecursivo(raiz, clave, recorrido);
        
        System.out.print("Recorrido para buscar " + clave + ": ");
        for (int i = 0; i < recorrido.size(); i++) {
            System.out.print(recorrido.get(i) + (i < recorrido.size() - 1 ? " -> " : ""));
        }
        System.out.println();
        
        if (resultado != null) {
            System.out.println("CLAVE " + clave + " ENCONTRADA.");
            return true;
        } else {
            System.out.println("CLAVE " + clave + " NO ENCONTRADA.");
            return false;
        }
    }

    private Nodo<T> buscarRecursivo(Nodo<T> actual, T clave, List<T> recorrido) {
        if (actual == null || clave.equals(actual.clave)) {
            if (actual != null) recorrido.add(actual.clave); 
            return actual;
        }

        recorrido.add(actual.clave);

     
        if (clave.compareTo(actual.clave) < 0) {
            return buscarRecursivo(actual.izquierda, clave, recorrido);
        } 
      
        else {
            return buscarRecursivo(actual.derecha, clave, recorrido);
        }
    }

    public void eliminar(T clave) {
        raiz = eliminarRecursivo(raiz, clave);
    }

    private Nodo<T> eliminarRecursivo(Nodo<T> actual, T clave) {
        if (actual == null) {
            return null; 
        }

        if (clave.compareTo(actual.clave) < 0) {
            actual.izquierda = eliminarRecursivo(actual.izquierda, clave);
            return actual;
        } else if (clave.compareTo(actual.clave) > 0) {
            actual.derecha = eliminarRecursivo(actual.derecha, clave);
            return actual;
        }


        if (actual.izquierda == null) {
            return actual.derecha; 
        }
        if (actual.derecha == null) {
            return actual.izquierda; 
        }

        T sucesor = encontrarMinimo(actual.derecha);
        
        actual.clave = sucesor;
        

        actual.derecha = eliminarRecursivo(actual.derecha, sucesor);
        return actual;
    }

    private T encontrarMinimo(Nodo<T> nodo) {
        T minimo = nodo.clave;
        while (nodo.izquierda != null) {
            minimo = nodo.izquierda.clave;
            nodo = nodo.izquierda;
        }
        return minimo;
    }
}
