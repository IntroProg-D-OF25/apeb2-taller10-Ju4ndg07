
import java.util.Scanner;

/***
 * Crea un programa que gestione el inventario de una tienda, así como la emisión de facturas. 
 * Utiliza una matriz bidimensional para almacenar los productos disponibles en la tienda, con información como nombre, precio y cantidad. 
 * El programa debe permitir facturar un producto dado su código, y unidades deseadas. 
 * Adicional se debe agregar a la factura al 15% del IVA, y si la compra superar los $100, se debe aplicar un descuento.
 * Nota: Considere la alternativa de inexistencias en Stop, para el caso, muestre la alerta respectiva.
 */
public class ejercicio5 {
    public static void main(String[] args) {
        String[][] inventario = new String[10][4]; // Nombre, Precio, Cantidad, Código
        // Inicializar productos
        inventario[0][0] = "Producto1";
        inventario[0][1] = "20.0"; // Precio
        inventario[0][2] = "10"; // Cantidad
        inventario[0][3] = "001"; // Código
        inventario[1][0] = "Producto2";
        inventario[1][1] = "50.0";
        inventario[1][2] = "5";
        inventario[1][3] = "002";
        inventario[2][0] = "Producto3";
        inventario[2][1] = "30.0";
        inventario[2][2] = "20";
        inventario[2][3] = "003";

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Gestión de Inventario y Facturación ---");
            System.out.println("1. Ver inventario");
            System.out.println("2. Facturar producto");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            if (opcion == 3) {
                System.out.println("¡Hasta luego!");
                break;
            }

            if (opcion == 1) {
                System.out.println("\n--- Inventario ---");
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][0] != null) {
                        System.out.println("Código: " + inventario[i][3] + ", Producto: " + inventario[i][0] + ", Precio: $" + inventario[i][1] + ", Cantidad: " + inventario[i][2]);
                    }
                }
            } else if (opcion == 2) {
                // Facturación
                System.out.print("Ingresa el código del producto: ");
                String codigoProducto = scanner.nextLine();
                boolean encontrado = false;
                for (int i = 0; i < inventario.length; i++) {
                    if (inventario[i][3] != null && inventario[i][3].equals(codigoProducto)) {
                        encontrado = true;
                        System.out.print("Ingresa la cantidad de productos a comprar: ");
                        int cantidadCompra = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        
                        int cantidadDisponible = Integer.parseInt(inventario[i][2]);
                        
                        if (cantidadCompra > cantidadDisponible) {
                            System.out.println("¡Alerta! No hay suficientes existencias.");
                        } else {
                            // Calculando el total
                            double precio = Double.parseDouble(inventario[i][1]);
                            double total = precio * cantidadCompra;
                            double iva = total * 0.15; // IVA del 15%
                            double descuento = (total > 100) ? total * 0.10 : 0; // Descuento del 10% si la compra supera $100
                            double totalConIvaYDescuento = total + iva - descuento;

                            System.out.println("\nFactura:");
                            System.out.println("Producto: " + inventario[i][0]);
                            System.out.println("Precio unitario: $" + precio);
                            System.out.println("Cantidad: " + cantidadCompra);
                            System.out.println("Total antes de IVA y descuento: $" + total);
                            System.out.println("IVA (15%): $" + iva);
                            System.out.println("Descuento (10% si es mayor a $100): -$" + descuento);
                            System.out.println("Total con IVA y descuento: $" + totalConIvaYDescuento);
                            
                            // Actualizando inventario
                            inventario[i][2] = String.valueOf(cantidadDisponible - cantidadCompra); // Restando la cantidad vendida
                        }
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            } else {
                System.out.println("Opción inválida. Intenta de nuevo.");
            }
        }
    }
}

/***
 * 
--- Gesti n de Inventario y Facturaci n ---
1. Ver inventario
2. Facturar producto
3. Salir
Selecciona una opci n: 1

--- Inventario ---
C digo: 001, Producto: Producto1, Precio: $20.0, Cantidad: 10
C digo: 002, Producto: Producto2, Precio: $50.0, Cantidad: 5
C digo: 003, Producto: Producto3, Precio: $30.0, Cantidad: 20

--- Gesti n de Inventario y Facturaci n ---
1. Ver inventario
2. Facturar producto
3. Salir
Selecciona una opci n: 2
Ingresa el c digo del producto: 001
Ingresa la cantidad de productos a comprar: 10

Factura:
Producto: Producto1
Precio unitario: $20.0
Cantidad: 10
Total antes de IVA y descuento: $200.0
IVA (15%): $30.0
Descuento (10% si es mayor a $100): -$20.0
Total con IVA y descuento: $210.0

--- Gesti n de Inventario y Facturaci n ---
1. Ver inventario
2. Facturar producto
3. Salir
Selecciona una opci n: 3
 Hasta luego!
 */

