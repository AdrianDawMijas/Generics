/*
Escribe una aplicación que:

Cree una matriz de Integer de 4 filas y 2 columnas
Rellénala con números consecutivos comenzando por el 1.
Muestra por pantalla la matriz.
Muestra por pantalla el contenido de la celda en la fila 1, columna 2.


 */


import java.util.Scanner;

public class MatrixAplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericMatrix<Integer> integerGenericMatrix = new GenericMatrix<>(4,2);
        int genericNumber = 1;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 3; j++) {
                integerGenericMatrix.set(i, j, genericNumber);
                genericNumber++;
            }
        }
        System.out.println(integerGenericMatrix);
        System.out.println(integerGenericMatrix.get(1,2));
    }
}
