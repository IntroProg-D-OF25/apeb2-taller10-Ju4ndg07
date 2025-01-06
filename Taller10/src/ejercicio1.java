/***
 * Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
De la diagonal principal.
De la diagonal segundaria.
Ubicados bajo la diagonal principal.
Ubicados sobre la diagonal principal.
Ubicados bajo la diagonal secundaria.
Ubicados sobre la diagonal secundaria.
 */
import java.util.Random;
public class ejercicio1 {
    public static void main(String[] args) {
        int m = 5;
        int[][] matriz = new int[m][m];
        Random random = new Random();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        // Diagonal principal
        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        // Diagonal secundaria
        System.out.println("\nDiagonal secundaria:");
        for (int i = 0; i < m; i++) {
            System.out.print(matriz[i][m - 1 - i] + " ");
        }
        // Elementos debajo de la diagonal principal
        System.out.println("\nElementos debajo de la diagonal principal:");
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        // Elementos sobre la diagonal principal
        System.out.println("\nElementos sobre la diagonal principal:");
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        // Elementos debajo de la diagonal secundaria
        System.out.println("\nElementos debajo de la diagonal secundaria:");
        for (int i = 1; i < m; i++) {
            for (int j = m - i; j < m; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        // Elementos sobre la diagonal secundaria
        System.out.println("\nElementos sobre la diagonal secundaria:");
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < m - i - 1; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }
}
 /***
  * Matriz:
0 8 3 2 7 
7 5 2 3 0 
9 4 4 4 4 
0 6 9 1 1 
3 0 4 0 0 

Diagonal principal:
0 5 4 1 0 
Diagonal secundaria:
7 3 4 6 3 
Elementos debajo de la diagonal principal:
7 9 4 0 6 9 3 0 4 0 
Elementos sobre la diagonal principal:
8 3 2 7 2 3 0 4 4 1 
Elementos debajo de la diagonal secundaria:
0 4 4 9 1 1 0 4 0 0 
Elementos sobre la diagonal secundaria:
0 8 3 2 7 5 2 9 4 0
  */

