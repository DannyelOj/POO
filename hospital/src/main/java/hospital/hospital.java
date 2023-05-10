/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

/**
 *
 * @author UTPL
 */
public class hospital {

 
        
    private String nombreHospital;
    private String ciudadHospital;
    private int numeroCamas;
    private int numeroDoctores;
    private double presupuestAnual;

    public hospital(String nombre, 
            int camas, int doctores, double presupuesto) {

        nombreHospital = nombre;
        ciudadHospital = "Quito";
        numeroCamas = camas;
        numeroDoctores = doctores;
        presupuestAnual = presupuesto;
    }
    //constructor 2
    public hospital(String nombre,int camas, int doctores) {

        nombreHospital = nombre;
        ciudadHospital = "Quito";
        numeroCamas = camas;
        numeroDoctores = doctores;
        presupuestAnual = 2500.00;
    }
    //constructor 3
    
    public hospital(String nombre, String ciudad,
            int camas, int doctores, double presupuesto) {

        nombreHospital = nombre;
        ciudadHospital = ciudad;
        numeroCamas = camas;
        numeroDoctores = doctores;
        presupuestAnual = presupuesto;
    }

    
    public String getNombreHospital() {
        return nombreHospital;
    }

    public void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getCiudadHospital() {
        return ciudadHospital;
    }

    public void setCiudadHospital(String ciudadHospital) {
        this.ciudadHospital = ciudadHospital;
    }

    public int getNúmeroCamas() {
        return numeroCamas;
    }

    public void setNúmeroCamas(int númeroCamas) {
        this.numeroCamas = númeroCamas;
    }

    public int getNúmeroDoctores() {
        return numeroDoctores;
    }

    public void setNúmeroDoctores(int númeroDoctores) {
        this.numeroDoctores = númeroDoctores;
    }

    public double getPresupuestAnual() {
        return presupuestAnual;
    }

    public void setPresupuestAnual(int presupuestAnual) {
        this.presupuestAnual = presupuestAnual;
    }

}
