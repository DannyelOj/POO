/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

/**
 *
 * @author UTPL
 */
public class FacturaTelefonica {
    
    //atributos
    
    private String numTelefono;
    private double minConsumidos;
    private double valorMin;
    private double cancelarFactura;
   
    
    //get and setter

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public double getMinConsumidos() {
        return minConsumidos;
    }

    public void setMinConsumidos(double minConsumidos) {
        this.minConsumidos = minConsumidos;
    }

    public double getValorMin() {
        return valorMin;
    }

    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }
    
    public void cancelarFactura(){
        cancelarFactura = minConsumidos * valorMin;
    }
    
    public double valorFactura (){
        return cancelarFactura      ;
    }
    
}
