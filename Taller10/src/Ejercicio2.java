/***
 * Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
La suma de las dos matrices (considerar las restricciones matemáticas para ello).
La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 */
import java.util.Random;
public class Ejercicio2 {
    public static void main(String[] args) {
        int filas = 3, columnas = 3;
        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];
        int[][] suma = new int[filas][columnas];
        int[][] multiplicacion = new int[filas][columnas];
        Random random = new Random();

        // Llenar matrices con números aleatorios
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz1[i][j] = random.nextInt(10);
                matriz2[i][j] = random.nextInt(10);
            }
        }

        // Sumar las matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        // Multiplicar las matrices
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < columnas; k++) {
                    multiplicacion[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        // Imprimir matrices y resultados directamente
        System.out.println("Matriz 1:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(suma[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Multiplicación:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(multiplicacion[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/***
 * Matriz 1:
2 3 0 
5 4 1 
7 2 2 
Matriz 2:
9 5 7 
5 0 4 
6 5 7 
Suma:
11 8 7 
10 4 5 
13 7 9 
Multiplicaci�n:
33 10 26 
71 30 58 
85 45 71 
 */