/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package descuento;

import java.util.Scanner;

/**
 *
 * @author Janus
 */
public class Ejercicio_Java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre =scanner.nextLine();
        System.out.print("Ingrese el tipo de cliente (1, 2, 3, 4): ");
        int tipoCliente = scanner.nextInt();
        System.out.print("Ingrese la cantidad de hojas compradas: ");
        int cantidadHojas = scanner.nextInt();
        System.out.print("Ingrese el precio por hoja: ");
        double precioPorHoja = scanner.nextDouble();
        
        persona cliente = new persona(nombre, tipoCliente, cantidadHojas, precioPorHoja);
        
        System.out.println("Nombre del cliente: " + cliente.getNombre());
        System.out.println("Subtotal por pagar: $" + cliente.getSubtotal());
        System.out.println("Neto por pagar: $" + cliente.getNetoPorPagar());
        
        
    }
}
