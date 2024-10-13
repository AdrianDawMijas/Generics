/*
Escribe una clase Pila genérica usando para ello un atributo del tipo LinkedList.
La clase Pila tendrá los siguientes métodos:

estaVacia(): devuelve true si la pila está vacía y false en caso contrario.
extraer(): devuelve y elimina el primer elemento de la colección.
primero(): devuelve el primer elemento de la colección.
aniadir(): añade un objeto por el extremo que corresponda.
toString(): devuelve en forma de String la información de la colección.
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.LinkedList;

// Lombok genera automáticamente los constructores y métodos getters/setters
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenericPile<T> {

    // Usamos una LinkedList para almacenar los elementos de la pila
    private LinkedList<T> pile = new LinkedList<>();

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return pile.isEmpty();
    }

    // Método para extraer (y eliminar) el último elemento añadido (comportamiento típico de una pila)
    public T extract() {
        return pile.removeLast(); // removeLast() elimina y devuelve el último elemento de la lista
    }

    // Método para añadir un nuevo elemento a la pila
    public void add(T value) {
        pile.add(value); // add() añade el elemento al final de la lista (comportamiento típico de una pila)
    }

    // Método principal para probar la clase Pila
    public static void main(String[] args) {
        // Creación de una instancia de Pila genérica que almacenará Integer
        GenericPile<Integer> pile = new GenericPile<>();

        // Añadimos algunos elementos a la pila
        pile.add(1);
        pile.add(2);
        pile.add(3);
        pile.add(4);
        pile.add(5);

        // Extraemos y mostramos el último elemento añadido
        System.out.println("Extracted: " + pile.extract());

        // Mostramos la pila después de la extracción
        System.out.println("Pile after extraction: " + pile);
    }
}
