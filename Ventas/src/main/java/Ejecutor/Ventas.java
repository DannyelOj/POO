/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Ejecutor;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ventas {

    public static void main(String[] args) {
        // variables para ingreso de datos
        String nombre;
        int edad;
        double sMinino;
        int autos;
        boolean bandera;
        String opcion;
        Scanner entrada = new Scanner(System.in);

        // Inicio de proceso iterativo 
        bandera = true;
        while (bandera) { // bandera == true
            System.out.println("Ingrese el nombre del vendedor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese edad del vendedor");
            edad = entrada.nextInt();
            System.out.println("Ingrese el salario mínimo");
            sMinino = entrada.nextDouble();
            System.out.println("Ingrese el número de autos vendidos");
            autos = entrada.nextInt();

            // con los datos ingresados se crea el objeto de tipo Vendedor
            vendedor v = new vendedor(nombre, edad, sMinino, autos);
            v.calcularPagoMensual();
            System.out.printf("Datos de Vendedor\n"
                    + "Nombre: %s\n"
                    + "Edad: %s\n"
                    + "Salario mínimo: %.2f\n"
                    + "Número de autos: %d\n"
                    + "Pago mensual: %.2f\n", v.obtenerNombres(), v.obtenerEdad(),
                    v.obtenerSalarioMinimo(), v.obtenerNumeroAutos(),
                    v.obtenerPagoMensual());

            entrada.nextLine(); // limpieza del buffer
            System.out.println("Desea ingresar más vendedores. Ingrese n para"
                    + "salir");
            opcion = entrada.nextLine();
            if (opcion.equals("n")) {
                bandera = false;
            }

        }
    }
}
