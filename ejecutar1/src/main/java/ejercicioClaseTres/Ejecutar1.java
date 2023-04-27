/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ejercicioClaseTres;

/**
 *
 * @author UTPL
 */
public class Ejecutar1 {

    public static void main(String[] args) {
        System.out.println("PELICULAS");
        //crear el objeto
        
        Peliculas p = new Peliculas();
        
        p.setVersion(17);
        
        System.out.println("La version ed la pelicula es: " + p.getVersion() );
        
        p.setPresupuesto(45000);
        System.out.println("La presupuesto de la pelicula es: " + p.getPresupuesto() );
        
    }
}
