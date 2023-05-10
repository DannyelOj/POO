/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombreHospital;
        String ciudadHospital;
        int numeroCamas;
        int numeroDoctores;
        double presupuestAnual;
        int opc;

        System.out.println("Que tipo de hospital desea ingresar\nOpcion 1"
                + "\nOpcion 2\nOpcion 3");
        opc = entrada.nextInt();
        entrada.nextLine();
        if (opc == 1) {
            System.out.println("Ingrese el nombre del Hospital");
            nombreHospital = entrada.nextLine();
            System.out.println("Ingrese el numero de camas del Hospital");
            numeroCamas = entrada.nextInt();
            System.out.println("Ingrese el numero de doctores del Hospital");
            numeroDoctores = entrada.nextInt();
            System.out.println("Ingrese el presupuesto anual del Hospital");
            presupuestAnual = entrada.nextDouble();

            hospital h1 = new hospital(nombreHospital, numeroCamas,
                    numeroDoctores, presupuestAnual);

            System.out.printf("DATOS DEL HOSPITAL:\nNombre del Hospital: %s\n"
                    + "Ciudad del Hospital: %s\nNumero de camas: %d\n"
                    + "Numero de doctores: %d\nPresupuesto anual: %.2f\n",
                    h1.getNombreHospital(),
                    h1.getCiudadHospital(),
                    h1.getNúmeroCamas(),
                    h1.getNúmeroDoctores(),
                    h1.getPresupuestAnual());

        } else {
            if (opc == 2) {
                System.out.println("Ingrese el nombre del Hospital");
                nombreHospital = entrada.nextLine();
                System.out.println("Ingrese el numero de camas del Hospital");
                numeroCamas = entrada.nextInt();
                System.out.println("Ingrese el numero de doctores del Hospital");
                numeroDoctores = entrada.nextInt();

                hospital h2 = new hospital(nombreHospital, numeroCamas,
                        numeroDoctores);

                System.out.printf("DATOS DEL HOSPITAL:\nNombre del Hospital: %s\n"
                        + "Ciudad del Hospital: %s\nNumero de camas: %d\n"
                        + "Numero de doctores: %d\nPresupuesto anual: %.2f\n",
                        h2.getNombreHospital(),
                        h2.getCiudadHospital(),
                        h2.getNúmeroCamas(),
                        h2.getNúmeroDoctores(),
                        h2.getPresupuestAnual());
            } else {
                if (opc == 3) {
                    System.out.println("Ingrese el nombre del Hospital");
                    nombreHospital = entrada.nextLine();
                    System.out.println("Ingrese el nombre del Hospital");
                    ciudadHospital = entrada.nextLine();
                    System.out.println("Ingrese el numero de camas del Hospital");
                    numeroCamas = entrada.nextInt();
                    System.out.println("Ingrese el numero de doctores del Hospital");
                    numeroDoctores = entrada.nextInt();
                    System.out.println("Ingrese el presupuesto anual del Hospital");
                    presupuestAnual = entrada.nextDouble();

                    hospital h3 = new hospital(nombreHospital, ciudadHospital, 
                            numeroCamas, numeroDoctores, presupuestAnual);

                    System.out.printf("DATOS DEL HOSPITAL:\nNombre del Hospital: %s\n"
                            + "Ciudad del Hospital: %s\nNumero de camas: %d\n"
                            + "Numero de doctores: %d\nPresupuesto anual: %.2f\n",
                            h3.getNombreHospital(),
                            h3.getCiudadHospital(),
                            h3.getNúmeroCamas(),
                            h3.getNúmeroDoctores(),
                            h3.getPresupuestAnual());
                } else {
                    System.out.println("Fuera de Rango");
                }
            }
        }

    }

}
