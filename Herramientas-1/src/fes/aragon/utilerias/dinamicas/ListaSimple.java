package fes.aragon.utilerias.dinamicas;

public class ListaSimple<E> {
	protected Nodo<E> cabeza, cola;
	protected int longitud = 0;
	public ListaSimple() {
		cabeza = cola = null;
	}
	public void agregarEnCabeza(E dato) {
		cabeza = new Nodo<E>(dato, cabeza);
		if (cola == null) {
			cola = cabeza;
		}
		longitud++;
	}
	public void imprimirElementos() {
		for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.getDato());
		}
	}
	public E obtenerCabeza() {
		return cabeza.getDato();
	}
	public E obtenerCola() {
		return cola.getDato();
	}

}