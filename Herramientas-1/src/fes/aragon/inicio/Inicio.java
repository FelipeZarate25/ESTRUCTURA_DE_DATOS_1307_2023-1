package fes.aragon.inicio;

import fes.aragon.utilerias.dinamicas.ListaSimple;

public class Inicio {

	public static void main(String[] args) {

		ListaSimple<Integer> datos1 = new ListaSimple<>();
        datos1.agregarEnCabeza(34);
        datos1.agregarEnCabeza(12);
        datos1.agregarEnCabeza(90);
        datos1.agregarEnCabeza(25);
        datos1.agregarEnCabeza(30);
        datos1.agregarEnCola(100);
        datos1.imprimirElementos();
        
        System.out.println("***********************************ELIMINAR CABEZA************************************");
        datos1.eliminarCabeza();
        datos1.imprimirElementos();
        
        System.out.println("***********************************ELIMINAR COLA***************************************");
        datos1.eliminarCola();
        datos1.imprimirElementos();
       
        System.out.println("***********************************OBTENER NODO****************************************");
        datos1.obtenerNodo(0);
        datos1.imprimirElementos();
       
        System.out.println("***********************************ESTA EN LISTA**************************************");
        datos1.estaEnLista(0);
        datos1.imprimirElementos();
        
//        computadora cp = new computadora();
//        cp.setMarca("ACER");
//        cp.setModelo("A1");
//        datos2.agregarEnCabeza(cp);
//        datos2.imprimirElementos();
        
        
        
        
	}

}
