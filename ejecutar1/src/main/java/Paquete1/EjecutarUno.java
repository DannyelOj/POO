/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete1;
import ejercicioClaseTres.Peliculas;
/**
 *
 * @author UTPL
 */
public class EjecutarUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Peliculas p1 = new Peliculas();
        p1.setVersion(18);
        System.out.println("La version es: "+ p1.getVersion() );
        
        p1.setPresupuesto(199);
        System.out.println("La version es: "+ p1.getPresupuesto() );
    }
    
}
