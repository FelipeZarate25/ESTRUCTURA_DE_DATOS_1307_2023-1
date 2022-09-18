package fes.aragon.inicio;

import java.util.Scanner;
import fes.aragon.utilerias.dinamicas.ListaSimple;

public class Inicio {

	private static int NUMLIST = 10000;

	public static void main(String[] args) {
		ListaSimple<Integer> numeros = new ListaSimple<>();
		ListaSimple<Auxiliar> numRep = new ListaSimple<>();
		int max = 200, min = 1;

		for (int i = 0; i < NUMLIST; i++) {
			Integer rd = (int) (Math.random() * (max - min + 1) + min);
			numeros.agregarEnCabeza(rd);
		}
		for (int i = min; i <= max; i++) {
			final Auxiliar aux = new Auxiliar(i);
			for (int j = 0; j < numeros.getLongitud(); j++) {
				if (numeros.obtenerNodo(j) == i) {
					aux.inConta();
				}
			}
			if (aux.getContador() != 0) {
				numRep.agregarEnCabeza(aux);
			}
		}

		numRep.imprimirElementos();
		
		System.out.println("*******************************************************************************************************\n");
		System.out.println("NOTA: Ingresar un valor del 1 al 200...............");
		System.out.println("Dame el número: ");
		Scanner valor = new Scanner(System.in);
		Integer name = valor.nextInt();

		for (int i = 0; i < numeros.getLongitud(); i++) {
			if (numeros.obtenerNodo(i) == (int) name) {
				numeros.eliminarEnIndice(i);
			}
		}

		for (int i = 0; i < numRep.getLongitud(); i++) {
			if (numRep.obtenerNodo(i).getNumero() == (int) name) {
				numRep.eliminarEnIndice(i);
			}
		}
		numRep.imprimirElementos();
	}
}





