// Interfaz genérica Operation con un tipo parametrizado E que extiende de Number
// Esto significa que E debe ser un tipo numérico (como Integer, Double, etc.)
public interface Operation<E extends Number> {

    // Método para sumar. Recibe un valor de tipo E y devuelve la suma con el valor actual (también de tipo E)
    E suma(E a);

    // Método para restar. Recibe un valor de tipo E y devuelve el resultado de restarlo del valor actual
    E resta(E a);

    // Método para multiplicar. Recibe un valor de tipo E y devuelve el producto con el valor actual
    E product(E a);

    // Método para dividir. Recibe un valor de tipo E y devuelve el resultado de la división del valor actual por el parámetro
    // Nota: Se debe tener en cuenta la división por cero en la implementación
    E division(E a);
}

