/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package factura;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjecutarFactura {

    public static void main(String[] args) {

        FacturaTelefonica f = new FacturaTelefonica();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su numero de telefono: ");
        String n = entrada.nextLine();
        f.setNumTelefono(n);
        System.out.println("Ingrese el numero de minutos consumido: ");
        double minMes = entrada.nextDouble();
        f.setMinConsumidos(minMes);
        System.out.println("Ingrese el valor minimo del minuto: ");
        double vMin = entrada.nextDouble();
        f.setValorMin(vMin);
        
        f.cancelarFactura();

        System.out.printf("El numero de telefono es: %s \n Los minutos "
                + "consumidos fueron: %.2f\n El valor por minuto es: %.2f\n El total "
                + "a cancelar es: %.2f\n", 
                f.getNumTelefono(),
                f.getMinConsumidos(),
                f.getValorMin(),
                f.valorFactura());

    }
}
