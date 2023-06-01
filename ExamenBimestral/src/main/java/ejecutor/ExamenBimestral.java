/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
public class ExamenBimestral {

    public static void main(String[] args) {
        System.out.println("Examen Primer Bimester\nDaniel Ojeda");

        Empresa e = new Empresa();

        //Empleado 1 hace referencia a Jorge Luis
        Empleado v1 = new Empleado(1, "Jorge Luis");
        v1.rVenta("Coche", 8228, 2027);
        v1.rVenta("Vida", 1201, 2030);
        e.agregarVendedor(v1);
        
        //Empleado 2 hace referencia a Lourdes
        Empleado v2 = new Empleado(2, "Lourdes");
        v2.rVenta("Coche", 327, 2028);
        v2.rVenta("Vida", 5326, 2026);
        e.agregarVendedor(v2);
        
        //Empleado 3 hace referencia a Alina
        Empleado v3 = new Empleado(3, "Alina");
        v3.rVenta("Coche", 9569, 2021);
        v3.rVenta("Vida", 8716, 2026);
        v3.rVenta("Vida", 5113, 2029);
        v3.rVenta("Vida", 2397, 2025);
        e.agregarVendedor(v3);

        Empleado vendedorMayorMontoVentas = e.obtenerVendedorMontoVentas();
        Empleado vendedorMayorNumeroVentas = e.obtenerMayorNumeroVentas();
        String tipoSeguroMayorMontoVentas = e.obtenerSeguroMayorMontoVentas();
        String tipoSeguroMasVendido = e.obtenerTipoSeguroMasVendido();
        
        /*Los valores definidos se tomaron con los 
        datos de la tabla 1 de la pregunta 1*/
      
        System.out.println("-------------------------------------------------");
        System.out.println("-----------------REPORTE FINAL-------------------");
        System.out.printf("Tipo de seguro con mayor monto en ventas: %s\nTipo de"
                + " seguro más vendido: %s\nVendedor con mayor monto de ventas: "
                + "%s\nVendedor con mayor número de ventas: %s\n",
                tipoSeguroMayorMontoVentas,
                tipoSeguroMasVendido,
                vendedorMayorMontoVentas.getNombre(), 
                vendedorMayorNumeroVentas.getNombre() );
        System.out.println("-------------------------------------------------");
        

        double salarioEmpleado1 = v1.calcularSalario(450.00);
        double salarioEmpleado2 = v2.calcularSalario(450.00);
        double salarioEmpleado3 = v3.calcularSalario(450.00);
        
        System.out.println("--------------SALARIOS VENDEDORES----------------");
        System.out.printf("Salario de Jorge Luis: %.2f\nSalario de Lourdes: "
                + "%.2f\nSalario de Alina: %.2f\n",
                salarioEmpleado1,
                salarioEmpleado2,
                salarioEmpleado3);
        System.out.println("-------------------------------------------------");
        
    }

}

