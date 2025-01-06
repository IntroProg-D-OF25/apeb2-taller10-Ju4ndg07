/***
 * Crea un programa que gestione el inventario de una tienda. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
 * El programa debe permitir agregar nuevos productos, actualizar existencias, buscar productos y eliminarlos.
 */
import java.util.Scanner;
public class ejercicio4{
    public static void main(String[] args) {
        String[][] inventario = new String[5][3]; // Inventario con 5 espacios (Nombre, Precio, Cantidad)
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Mostrar el menú
            System.out.println("\n--- Menú de Inventario ---");
            System.out.println("1. Ver inventario");
            System.out.println("2. Agregar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();


            if (opcion == 4) {
                System.out.println("¡Adiós!");
                break;
            }

            if (opcion == 1) {
                System.out.println("\n--- Inventario ---");
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][0] != null) { 
                        System.out.println("Producto: " + inventario[i][0] + ", Precio: $" + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                }
            }

            else if (opcion == 2) {
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][0] == null) { // Busca un espacio vacío
                        System.out.print("Nombre del producto: ");
                        inventario[i][0] = scanner.nextLine();
                        System.out.print("Precio del producto: ");
                        inventario[i][1] = scanner.nextLine();
                        System.out.print("Cantidad del producto: ");
                        inventario[i][2] = scanner.nextLine();
                        System.out.println("Producto agregado.");
                        break;
                    }
                }
            }

            else if (opcion == 3) {
                System.out.print("Nombre del producto a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreEliminar)) {
                        inventario[i][0] = null; // Eliminar producto
                        inventario[i][1] = null;
                        inventario[i][2] = null;
                        System.out.println("Producto eliminado.");
                        break;
                    }
                }
            }
            else {
                System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }
    }
}


/***
 * --- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 2
Nombre del producto: 222
Precio del producto: 2222
Cantidad del producto: 4
Producto agregado.

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 1

--- Inventario ---
Producto: 222, Precio: $2222, Cantidad: 4

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 1

--- Inventario ---
Producto: 222, Precio: $2222, Cantidad: 4

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 3
Nombre del producto a eliminar: 2222

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 1

--- Inventario ---
Producto: 222, Precio: $2222, Cantidad: 4

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 23
Opci n no v lida. Intenta otra vez.

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 3
Nombre del producto a eliminar: 222
Producto eliminado.

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 1

--- Inventario ---

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 2
Nombre del producto: manzana
Precio del producto: 1
Cantidad del producto: 1000
Producto agregado.

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 1

--- Inventario ---
Producto: manzana, Precio: $1, Cantidad: 1000

--- Men  de Inventario ---
1. Ver inventario
2. Agregar producto
3. Eliminar producto
4. Salir
Elige una opci n: 4
 Adi s!
 */
