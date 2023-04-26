/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.clases3;

/**
 *
 * @author UTPL
 */
public class Hospital {

    public class Hospital{
        String nombres;
        int numeroCamas;
        double presupuesto;
        
        //2. Definir constructor

        public Hospital(String nombres, int numeroCamas, double presupuesto) {
            this.nombres = nombres;
            this.numeroCamas = numeroCamas;
            this.presupuesto = presupuesto;
        }
        
        //3. Metodos get y set

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public int getNumeroCamas() {
            return numeroCamas;
        }

        public void setNumeroCamas(int numeroCamas) {
            this.numeroCamas = numeroCamas;
        }

        public double getPresupuesto() {
            return presupuesto;
        }

        public void setPresupuesto(double presupuesto) {
            this.presupuesto = presupuesto;
        }
        
        //4. Otros metodos
        
    }
}
