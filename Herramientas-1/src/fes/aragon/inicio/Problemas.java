package fes.aragon.inicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import fes.aragon.excep.IndiceFueraDeRango;
import fes.aragon.utilerias.estaticas.Arreglos;

public class Problemas {

	public static void main(String[] args) throws IndiceFueraDeRango {

		Arreglos<Integer> numeros = new Arreglos<>(10);
		Random rd = new Random();
		int limInfe = 0, limSupe = 99;
		int aux = 0;
		
		/**
		 * Insertar(asignar) los valores Random al arreglo
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.insertar(rd.nextInt(limSupe + 1));
			/*Para guardar en el aux y después compararlos*/
			aux = numeros.recupera(0);
		}

		/**
		 * Comparar los números del arreglo <<Buscamos el número mayor>>
		 */
		for (int i = 1; i < numeros.longitud(); i++) {
			if (aux < numeros.recupera(i)) {
				aux = numeros.recupera(i);
			}
			/* Imprimir los valores del arreglo */
			numeros.imprime();

		}
		/* Para imprimir el números mas grande (aux)*/
		System.out.print("\nNúmero mayor: " + aux);

		
		/**
		 * Comparar los números del arreglo <<Buscamos el número menor>>
		 */
		for (int i = 1; i < numeros.longitud(); i++) {
			if (aux > numeros.recupera(i)) {
				aux = numeros.recupera(i);
			}
		}
		/* Para imprimir el números más grande (aux)*/
		System.out.print("\nNúmero menor: " + aux);
		
		/**
		 * Ordenar los valores de forma ascendente
		 */
		 for (int k = limInfe; k < numeros.longitud(); k++) {
		      aux = numeros.recupera(k);

		    //Para el ordenamiento(ascendente)
		      for (int i = k + 1; i < numeros.longitud(); i++) {
		        if (aux > numeros.recupera(i)) {
		          aux = numeros.recupera(i);
		          limInfe = i;
		        }
		      }

		    //Para asignar el número más grande a la posición E
		      numeros.asignar(limInfe, numeros.recupera(k));
		      numeros.asignar(k, aux);
		}
		System.out.print("\nOrdenado: ");
		numeros.imprime();
      
	}

}
