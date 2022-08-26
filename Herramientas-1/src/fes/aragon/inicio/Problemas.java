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
		/**
		 * Intervalo(Aquí se define el intervalo de números que tendrán en forma aleatoria)
		 */
		int max = 99;
		int min = 0;
		// Variable auxiliar
		int aux = 0;
		/**
		 * Insertar(asignar) los valores Random al arreglo
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, (int) (Math.random() * (max - min + 1) + min));
		}
		/**
		 * Comparamos los números del arreglo <<Buscamos el número mayor>>
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			// numeros.imprime();
			if (numeros.recupera(i) > aux) {
				aux = numeros.recupera(i);
			}
		}
		/* Imprimir los valores del arreglo */
		numeros.imprime();

		/* Para imprimir el números menor (aux) */
		System.out.println("El número mayor es: " + aux);

		/**
		 * Comparamos los números del arreglo <<Buscamos el número menor>>
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			if (aux > numeros.recupera(i)) {
				aux = numeros.recupera(i);
			}
		}
		/* Para imprimir el números menor (aux) */
		System.out.print("El número menor es: " + aux);

	}
}