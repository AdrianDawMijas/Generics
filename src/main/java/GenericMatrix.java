/*
Escribe una clase Matriz genérica con los siguientes métodos:

- Un constructor que recibe por parámetro el número de filas y columnas de la matriz.
- `set()`: recibe por parámetro la fila, la columna y el elemento a insertar. El elemento es de tipo genérico. Este método inserta el elemento en la posición indicada.
- `get()`: recibe por parámetro la fila y la columna. Devuelve el elemento en esa posición. El elemento devuelto es genérico.
- `getColumns()`: devuelve el número de columnas de la matriz.
- `getRows()`: devuelve el número de filas de la matriz.
- `toString()`: devuelve en forma de String la información de la matriz.
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class GenericMatrix<T> {

    private int rows;
    private int columns;
    private Map<PositionMatrix, T> matrixTMap = new HashMap<>();

    // Constructor que recibe el número de filas y columnas
    public GenericMatrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    // Método para insertar un elemento en la matriz
    public void set(int row, int column, T value) {
        if (row > rows || column > columns) {
            throw new IndexOutOfBoundsException("Position out of matrix bounds");
        }
        matrixTMap.put(new PositionMatrix(row, column), value);
    }

    // Método para obtener un elemento en la matriz
    public T get(int row, int column) {
        if (row > rows || column > columns) {
            throw new IndexOutOfBoundsException("Position out of matrix bounds");
        }
        return matrixTMap.get(new PositionMatrix(row, column));
    }


    // Sobrescribimos el método toString() para mostrar la matriz
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=1; i < rows+1; i++) {
            for (int j=1; j < columns+1; j++) {
                T value = matrixTMap.get(new PositionMatrix(i, j));
                sb.append(value != null ? value : "null").append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Creación de una matriz genérica de 3x3
        GenericMatrix<String> matrix = new GenericMatrix<>(3, 3);

        // Insertamos algunos elementos
        matrix.set(0, 0, "A");
        matrix.set(1, 1, "B");
        matrix.set(2, 2, "C");

        // Mostramos la matriz
        System.out.println(matrix);

        // Obtenemos un elemento en una posición específica
        System.out.println("Elemento en (1, 1): " + matrix.get(1, 1));
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class PositionMatrix {
    private int row;   // Fila
    private int column; // Columna

    // Sobrescribimos equals() y hashCode() para asegurar que PositionMatrix funcione correctamente en el Map
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PositionMatrix that = (PositionMatrix) o;
        return row == that.row && column == that.column;
    }

    @Override
    public int hashCode() {
        return 31 * row + column;
    }
}
