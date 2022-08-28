package fes.aragon.inicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import componentes.computadora.Bocina;
import componentes.computadora.Monitor;
import componentes.computadora.Mouse;
import componentes.computadora.TarjetaGrafica;
import componentes.computadora.Teclado;
import computadora.computadora;
import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {

	public static void main(String[] args) {

		/*computadora compu = new computadora("Apple", "MacBook",
				new Monitor("Toshiba", "4820-5LG", 32),
				new Teclado("Dell", "Negro", 104), 
				new Mouse("MOFII", "Amarillo", "Inálambrico"),
				new TarjetaGrafica("NVIDIA", 1050, "4 GB", "1250MHz"),
				new Bocina("Sony", "SRS-XB13/BC LA", 20000));

		System.out.println(compu);
		*/
		
		Arreglos < Integer > numeros = new  Arreglos <>( 10 );
		/**
		 * Intervalo(Aquí se define el intervalo de números que tendrán en forma aleatoria)
		 */
		int  max = 99 ;
		int  min = 0 ;
		// Variable auxiliar
		int  auxiliar = 0 ;
		/**
		 * Insertar(asignar) los valores Random al arreglo
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			try {
				numeros.asignar(i, (int)(Math.random()*(max-min+1)+min));
			} catch (IndiceFueraDeRango e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		/*Integer aux = numeros.recupera(0);
		for (int i = 1; i < numeros.longitud(); i++) {
			if(numeros.recupera(i)>aux);
			aux=numeros.recupera(i);
			
		}
		*/
		
		Integer temp = null;
		Integer aux = 0;
		
		try {
			
		
			while (true) {
				
				temp = numeros.siguiente();
				//aux = temp;
				if (temp > aux) {
					aux = temp;
				}
				
				//temp = numeros.siguiente();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			numeros.imprime();
			System.out.println(aux);
			System.out.println(e.getMessage());
		}

	}
}