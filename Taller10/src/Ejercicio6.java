import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        char[][] tablero = new char[3][3];
        inicializarTablero(tablero);
        Scanner scanner = new Scanner(System.in);
        char jugadorActual = 'X';
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            mostrarTablero(tablero);
            System.out.print("Jugador " + jugadorActual + ", ingresa tu movimiento (fila, columna): ");
            int fila = scanner.nextInt() - 1;
            int columna = scanner.nextInt() - 1;

            if (esMovimientoValido(tablero, fila, columna)) {
                tablero[fila][columna] = jugadorActual;
                juegoTerminado = hayGanador(tablero) || tableroLleno(tablero);
                jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Movimiento inválido. Intenta de nuevo.");
            }
        }

        mostrarTablero(tablero);

        if (hayGanador(tablero)) {
            System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
        } else {
            System.out.println("¡Empate!");
        }
    }

    // Inicializa el tablero con espacios vacíos
    private static void inicializarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Muestra el tablero en la consola
    private static void mostrarTablero(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Verifica si el movimiento es válido (posición dentro del tablero y vacía)
    private static boolean esMovimientoValido(char[][] tablero, int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == ' ';
    }

    // Verifica si hay un ganador
    private static boolean hayGanador(char[][] tablero) {
        // Comprobar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != ' ') {
                return true;
            }
            if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != ' ') {
                return true;
            }
        }
        if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != ' ') {
            return true;
        }
        if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != ' ') {
            return true;
        }
        return false;
    }

    // Verifica si el tablero está lleno
    private static boolean tableroLleno(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}