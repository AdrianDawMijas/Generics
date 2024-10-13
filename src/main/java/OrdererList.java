/*
Escribe una clase genérica ListaOrdenada con un tipo parametrizado E que sea Comparable…
<E extends Comparable<E>>.... La clase debe tener lo siguiente:

- Un constructor
- void add(E o) - nota: cuando añado el elemento debería añadirse en el orden adecuado,
  recuerda que E tiene que implementar Comparable<E>
- E get(int index)
- int size()
- boolean isEmpty()
- boolean remove(E o)
- int indexOf(E o)
- String toString()
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdererList<E extends Comparable<E>> {

    // Usamos List<E> para almacenar los elementos ordenados
    private List<E> ordererList;

    // Constructor que inicializa la lista
    public OrdererList() {
        this.ordererList = new ArrayList<>();
    }

    // Añade el elemento en el orden adecuado
    public void add(E element) {
        ordererList.add(element);
        Collections.sort(ordererList);  // Ordenamos la lista cada vez que añadimos un elemento
    }

    // Devuelve el elemento en la posición dada
    public E get(int index) {
        return ordererList.get(index);
    }

    // Devuelve el tamaño de la lista
    public int size() {
        return ordererList.size();
    }

    // Verifica si la lista está vacía
    public boolean isEmpty() {
        return ordererList.isEmpty();
    }

    // Elimina el elemento y devuelve si tuvo éxito
    public boolean remove(E o) {
        return ordererList.remove(o);
    }

    // Devuelve el índice del elemento o -1 si no está presente
    public int indexOf(E o) {
        return ordererList.indexOf(o);
    }

    // Sobrescribe el método toString() para mostrar los elementos de la lista
    @Override
    public String toString() {
        return ordererList.toString();
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Creamos una lista ordenada de enteros
        OrdererList<Integer> lista = new OrdererList<>();

        lista.add(10);
        lista.add(5);
        lista.add(20);
        lista.add(15);

        System.out.println("Lista ordenada: " + lista);

        System.out.println("Elemento en índice 2: " + lista.get(2));

        lista.remove(10);
        System.out.println("Lista después de eliminar el 10: " + lista);

        System.out.println("Índice de 20: " + lista.indexOf(20));
    }
}
