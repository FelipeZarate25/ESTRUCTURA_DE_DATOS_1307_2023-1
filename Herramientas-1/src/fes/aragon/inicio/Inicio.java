package fes.aragon.inicio;

import fes.aragon.utilerias.dinamicas.ListaSimple;

public class Inicio {

	public static void main(String[] args) {

		ListaSimple<Integer> objetos = new ListaSimple<>();

		try {
			// (int i = 0; i < 20; i++)
			for (int i = 20; i > 0; i--) {
				objetos.agregarEnCabeza(i);
			}
			
			objetos.imprimirElementos();

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
