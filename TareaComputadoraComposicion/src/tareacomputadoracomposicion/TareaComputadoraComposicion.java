/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareacomputadoracomposicion;

import componentes.computadora.Bocina;
import componentes.computadora.Monitor;
import componentes.computadora.Mouse;
import componentes.computadora.TarjetaGrafica;
import componentes.computadora.Teclado;
import computadora.Computadora;

/**
 *
 * @author Felipe Zarate
 */
public class TareaComputadoraComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computadora compu = new Computadora("Apple", "MacBook",
                new Monitor("Toshiba", "4820-5LG", 32),
                new Teclado("Dell", "Negro", 104),
                new Mouse("MOFII", "Amarillo", "Inálambrico"),
                new TarjetaGrafica("NVIDIA", 1050, "4 GB", "1250MHz"),
                new Bocina("Sony", "SRS-XB13/BC LA", 20000));
        
        System.out.println(compu);
        
    }
    
}
