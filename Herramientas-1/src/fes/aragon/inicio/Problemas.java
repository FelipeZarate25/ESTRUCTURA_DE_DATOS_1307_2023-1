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
		int aux = 0;

		/**
		 * Inicializar el arreglo
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, 0);
		}
		/**
		 * Insertar(asignar) los valores Random al arreglo
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			numeros.asignar(i, (int) (Math.random() * 99));
		}

		/**
		 * Comparar los números del arreglo <<Buscamos el número mayor>>
		 */
		for (int i = 0; i < numeros.longitud(); i++) {
			for (int j = 0; j < numeros.longitud(); j++) {
				if (numeros.recupera(j) > aux) {
					aux = numeros.recupera(j);
				}
			}
			/* Imprimir los valores del arreglo */
			numeros.imprime();
		}
		System.out.println("El número mayor es: " + aux);

		/**
		 * Comparar los números del arreglo <<Buscamos el número menor>>
		 */
		for (int i = 1; i < numeros.longitud(); i++) {
			if (aux > numeros.recupera(i)) {
				aux = numeros.recupera(i);
			}
		}
		/* Para imprimir el números más grande (aux) */
		System.out.print("El número menor es: " + aux);

	}

}