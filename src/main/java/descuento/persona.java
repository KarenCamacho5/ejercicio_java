/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package descuento;

public class persona {
    private String nombre;
    private int tipoCliente;
    private int cantidadHojas;
    private double precioPorHoja;
    private double subtotal;
    private double montoDescuento;
    private double netoPorPagar;

    public persona(String nombre, int tipoCliente, int cantidadHojas, double precioPorHoja) {
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.cantidadHojas = cantidadHojas;
        this.precioPorHoja = precioPorHoja;
        this.subtotal = cantidadHojas * precioPorHoja;
        calcularDescuento();
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getMontoDescuento() {
        return montoDescuento;
    }

    public double getNetoPorPagar() {
        return netoPorPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public double getPrecioPorHoja() {
        return precioPorHoja;
    }

    private void calcularDescuento() {
        switch (tipoCliente) {
            case 1:
                montoDescuento = subtotal * 0.05;
                break;
            case 2:
                montoDescuento = subtotal * 0.08;
                break;
            case 3:
                montoDescuento = subtotal * 0.12;
                break;
            case 4:
                montoDescuento = subtotal * 0.15;
                break;
            default:
                montoDescuento = 0;
                break;
        }
        netoPorPagar = subtotal - montoDescuento;
    }
}
