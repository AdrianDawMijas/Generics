/*
Escribe una interfaz ColeccionSimpleGenerica , que como su propio nombre indica, es genérica, con los siguientes métodos:

estaVacia(): devuelve true si la pila está vacía y false en caso contrario
extraer(): devuelve y elimina el primer elemento de la colección.
primero(): devuelve el primer elemento de la colección.
aniadir(): añade un objeto por el extremo que corresponda.

*/

// Definición de la interfaz genérica ColeccionSimpleGenerica

public interface SimpleGenericCollection<T> {

    // Devuelve true si la colección está vacía, false en caso contrario
    boolean estaVacia();

    // Devuelve y elimina el primer elemento de la colección
    T extraer();

    // Devuelve el primer elemento de la colección sin eliminarlo
    T primero();

    // Añade un elemento a la colección
    void aniadir(T elemento);
}
