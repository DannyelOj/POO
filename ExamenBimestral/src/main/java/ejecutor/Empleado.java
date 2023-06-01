/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.io.*;
/**
 *
 * @author UTPL
 */
public class Empleado {
    
    private int codigo;
    private String nombre;
    private double montoTotalVentas;
    private int numeroVentas;
    private Map<String, Double> tipoSegurosVendidos;

    public Empleado(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoTotalVentas = 0;
        this.numeroVentas = 0;
        this.tipoSegurosVendidos = new HashMap<>();
    }

    public void rVenta(String tipoSeguro, double monto, int añoExpiracion) {
        montoTotalVentas += monto;
        numeroVentas++;

        if (tipoSegurosVendidos.containsKey(tipoSeguro)) {
            double montoVentas = tipoSegurosVendidos.get(tipoSeguro);
            tipoSegurosVendidos.put(tipoSeguro, montoVentas + monto);
        } else {
            tipoSegurosVendidos.put(tipoSeguro, monto);
        }
    }

    public double calcularSalario(double basico) {
        double bono = montoTotalVentas * 0.1;
        double salario = basico + bono;

        Empresa e = new Empresa();
        Empleado vendedorMayorMontoVentas = e.obtenerVendedorMontoVentas();
        Empleado vendedorMayorNumeroVentas = e.obtenerMayorNumeroVentas();

        if (this == vendedorMayorMontoVentas || this == vendedorMayorNumeroVentas) {
            salario += 100; // Premio de incentivo
        }

        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    
    public double obtenerMontoTotalVentas() {
        return montoTotalVentas;
    }

    public int obtenerNumeroVentas() {
        return numeroVentas;
    }

    public Map<String, Double> obtenerTipoSeguroMayorMontoVenta() {
        return tipoSegurosVendidos;
    }

    public Map<String, Double> obtenerTipoSeguroMasVendido() {
        return tipoSegurosVendidos;
    }
}

