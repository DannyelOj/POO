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
public class Empresa {

    private List<Empleado> vendedores;

    public Empresa() {
        vendedores = new ArrayList<>();
    }

    public void agregarVendedor(Empleado empleado) {
        vendedores.add(empleado);
    }

    public Empleado obtenerVendedorMontoVentas() {
        Empleado vendedorMayorMontoVentas = null;
        double maxMontoVentas = 0;

        for (Empleado vendedor : vendedores) {
            double montoVentas = vendedor.obtenerMontoTotalVentas();
            if (montoVentas > maxMontoVentas) {
                maxMontoVentas = montoVentas;
                vendedorMayorMontoVentas = vendedor;
            }
        }

        return vendedorMayorMontoVentas;
    }

    public Empleado obtenerMayorNumeroVentas() {
        Empleado vendedorMayorNumeroVentas = null;
        int maxNumeroVentas = 0;

        for (Empleado vendedor : vendedores) {
            int numeroVentas = vendedor.obtenerNumeroVentas();
            if (numeroVentas > maxNumeroVentas) {
                maxNumeroVentas = numeroVentas;
                vendedorMayorNumeroVentas = vendedor;
            }
        }

        return vendedorMayorNumeroVentas;
    }

    public String obtenerSeguroMayorMontoVentas() {
        Map<String, Double> tipoSegurosMontoVentas = new HashMap<>();

        for (Empleado vendedor : vendedores) {
            Map<String, Double> tipoSegurosVendidos = vendedor.obtenerTipoSeguroMayorMontoVenta();
            for (Map.Entry<String, Double> entry : tipoSegurosVendidos.entrySet()) {
                String tipoSeguro = entry.getKey();
                double montoVentas = entry.getValue();
                tipoSegurosMontoVentas.put(tipoSeguro, tipoSegurosMontoVentas.getOrDefault(tipoSeguro, 0.0) + montoVentas);
            }
        }

        String tipoSeguroMayorMontoVentas = null;
        double maxMontoVentas = 0;

        for (Map.Entry<String, Double> entry : tipoSegurosMontoVentas.entrySet()) {
            String tipoSeguro = entry.getKey();
            double montoVentas = entry.getValue();
            if (montoVentas > maxMontoVentas) {
                maxMontoVentas = montoVentas;
                tipoSeguroMayorMontoVentas = tipoSeguro;
            }
        }

        return tipoSeguroMayorMontoVentas;
    }

    public String obtenerTipoSeguroMasVendido() {
        Map<String, Integer> tipoSegurosVentas = new HashMap<>();

        for (Empleado vendedor : vendedores) {
            Map<String, Double> tipoSegurosVendidos = vendedor.obtenerTipoSeguroMasVendido();
            for (Map.Entry<String, Double> entry : tipoSegurosVendidos.entrySet()) {
                String tipoSeguro = entry.getKey();
                tipoSegurosVentas.put(tipoSeguro, tipoSegurosVentas.getOrDefault(tipoSeguro, 0) + 1);
            }
        }

        String tipoSeguroMasVendido = null;
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : tipoSegurosVentas.entrySet()) {
            String tipoSeguro = entry.getKey();
            int ventas = entry.getValue();
            if (ventas > maxVentas) {
                maxVentas = ventas;
                tipoSeguroMasVendido = tipoSeguro;
            }
        }

        return tipoSeguroMasVendido;

    }
}


