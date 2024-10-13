/*
Implementa una pila utilizando como atributos un array genérico y
un entero que cuente el número de objetos insertados. La clase se debe llamar PilaArray
y tiene los mismos métodos que la pila del ejercicio anterior.
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArrayGenericPile<T> {

    // Atributo genérico para almacenar los elementos de la pila
    private T[] pila = (T[]) new Object[0];

    // Método para verificar si la pila está vacía
    public boolean isEmpty() {
        return pila.length == 0;
    }

    // Método para extraer (y eliminar) el último elemento añadido a la pila
    public T extract() {
        if (isEmpty()) return null; // Si la pila está vacía, retorna null

        T finalElement = pila[pila.length - 1]; // Último elemento en la pila
        pila = Arrays.copyOf(pila, pila.length - 1); // Copiamos el array reduciendo el tamaño en 1
        return finalElement;
    }

    // Método para añadir un nuevo elemento al final de la pila
    public void add(T element) {
        pila = Arrays.copyOf(pila, pila.length + 1); // Ampliamos el array en 1 posición
        pila[pila.length - 1] = element; // Añadimos el nuevo elemento al final
    }

    // Método principal para probar la clase Pila
    public static void main(String[] args) {
        // Creación de una pila genérica de Strings
        ArrayGenericPile<String> pile = new ArrayGenericPile<>();

        // Añadimos elementos a la pila
        pile.add("A");
        pile.add("B");
        pile.add("C");
        pile.add("D");
        pile.add("E");

        // Mostramos el estado de la pila
        System.out.println("Pila actual: " + pile);

        // Extraemos el último elemento
        System.out.println("Elemento extraído: " + pile.extract());

        // Mostramos la pila después de la extracción
        System.out.println("Pila tras extracción: " + pile);

        // Creación de una nueva pila genérica de Integer
        ArrayGenericPile<Integer> pile2 = new ArrayGenericPile<>();

        // Verificamos si la pila está vacía
        System.out.println("¿Está vacía la pila2? " + pile2.isEmpty());
    }
}
