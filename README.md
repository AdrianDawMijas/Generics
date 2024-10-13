# Proyecto de Estructuras Genéricas

Este proyecto contiene varias clases genéricas que implementan diferentes estructuras de datos y operaciones matemáticas. A continuación se detallan las clases y sus funcionalidades.

## Tabla de Contenidos
- [ArrayGenericPile](#arraygenericpile)
- [GenericMatrix](#genericmatrix)
- [GenericPile](#genericpile)
- [MatrixAplication](#matrixaplication)
- [Operation](#operation)
- [OrdererList](#ordererlist)
- [SimpleGenericCollection](#simplegenericcollection)
- [TestInteger](#testinteger)

---

## ArrayGenericPile

**`ArrayGenericPile<T>`** es una clase genérica que simula una pila utilizando un array como estructura interna.

### Métodos principales:
- `add(T element)`: Añade un elemento al array.
- `extract()`: Extrae y elimina el último elemento añadido.
- `isEmpty()`: Comprueba si la pila está vacía.
- `get(int index)`: Devuelve el elemento en la posición dada.
- `size()`: Retorna el tamaño actual de la pila.

---

## GenericMatrix

**`GenericMatrix<T>`** es una clase genérica que permite crear matrices de cualquier tipo. Utiliza un mapa para almacenar los valores.

### Métodos principales:
- `set(int row, int col, T value)`: Inserta un valor en una posición dada.
- `get(int row, int col)`: Obtiene el valor en una posición dada.
- `getRows()`: Devuelve el número de filas de la matriz.
- `getColumns()`: Devuelve el número de columnas de la matriz.

---

## GenericPile

**`GenericPile<T>`** es una implementación de una pila genérica utilizando una lista enlazada.

### Métodos principales:
- `add(T element)`: Añade un elemento a la pila.
- `extract()`: Extrae el último elemento de la pila.
- `isEmpty()`: Verifica si la pila está vacía.

---

## MatrixAplication

`MatrixAplication` es una clase de prueba que utiliza la clase `GenericMatrix`. En esta aplicación, se crea una matriz de enteros y se rellena con números consecutivos.

### Funcionalidad:
- Crea una matriz de 4 filas y 2 columnas.
- Rellena la matriz con números consecutivos.
- Muestra el contenido de la matriz.
- Muestra el valor de la celda en la fila 1, columna 1.

---

## Operation

**`Operation<E extends Number>`** es una interfaz genérica que define operaciones matemáticas básicas (suma, resta, multiplicación, y división) para cualquier tipo que extienda de `Number`.

### Métodos:
- `E suma(E a)`: Suma dos números.
- `E resta(E a)`: Resta dos números.
- `E product(E a)`: Multiplica dos números.
- `E division(E a)`: Divide dos números, se debe manejar la división por cero.

---

## OrdererList

**`OrdererList<E extends Comparable<E>>`** es una clase genérica que implementa una lista ordenada automáticamente según el orden natural de los elementos.

### Métodos principales:
- `add(E element)`: Añade un elemento en la posición correcta de la lista.
- `get(int index)`: Devuelve el elemento en la posición especificada.
- `size()`: Retorna el tamaño de la lista.
- `isEmpty()`: Verifica si la lista está vacía.
- `remove(E element)`: Elimina el elemento especificado.
- `indexOf(E element)`: Devuelve el índice del elemento dado.
- `toString()`: Devuelve la representación en cadena de la lista.

---

## SimpleGenericCollection

`SimpleGenericCollection` es una clase que no está descrita en el proyecto, por lo que se sugiere agregar un resumen breve de su propósito y los métodos principales.

---

## TestInteger

`TestInteger` es una clase que implementa la interfaz `Operation<Integer>`, que realiza operaciones matemáticas sobre enteros.

### Métodos principales:
- `suma(Integer a)`: Suma el entero actual con otro entero.
- `resta(Integer a)`: Resta un entero del entero actual.
- `product(Integer a)`: Multiplica el entero actual por otro entero.
- `division(Integer a)`: Divide el entero actual entre otro entero.

### Ejemplo de uso:
La clase implementa operaciones básicas de suma, resta, multiplicación y división sobre enteros y prueba su funcionamiento con valores de ejemplo.

---

## Conclusión

Este proyecto proporciona ejemplos claros de estructuras de datos y operaciones matemáticas implementadas de manera genérica, lo que permite su reutilización para diferentes tipos numéricos y objetos. Cada clase tiene un propósito específico y está diseñada para ser flexible y fácil de usar en distintas aplicaciones.
