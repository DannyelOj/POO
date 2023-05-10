/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejecutor;

/**
 *
 * @author UTPL
 */
public class vendedor {

    private String nombres;
    private int edad;
    private double pagoMensual;
    private double salarioMinimo;
    private int numeroAutos;
    private double comisionPorAuto;

    public vendedor(String n, int e, double sMinimo, int nAutos) {
        nombres = n;
        edad = e;
        salarioMinimo = sMinimo;
        establecerNumeroAutos(nAutos);
        comisionPorAuto = 150;
    }

    public void establecerNombres(String c) {
        nombres = c;
    }

    public void establecerEdad(int c) {
        edad = c;
    }

    public void calcularPagoMensual() {
        pagoMensual = obtenerSalarioMinimo()
                + (obtenerComisionPorAuto() * obtenerNumeroAutos());
    }

    public void establecerSalarioMinimo(double s) {
        salarioMinimo = s;
    }

    public void establecerNumeroAutos(int s) {
        numeroAutos = s;
    }

    // comisionPorAuto;
    public void establecerComisionPorAuto(double s) {
        comisionPorAuto = s;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public int obtenerEdad() {
        return edad;
    }

    public double obtenerPagoMensual() {
        return pagoMensual;
    }

    public double obtenerSalarioMinimo() {
        return salarioMinimo;
    }

    public int obtenerNumeroAutos() {
        return numeroAutos;
    }

    public double obtenerComisionPorAuto() {
        return comisionPorAuto;
    }

}
