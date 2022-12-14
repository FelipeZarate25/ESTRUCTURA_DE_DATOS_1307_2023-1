package fes.aragon.utilerias.dinamicas;


public class Nodo<E> {
	private E dato;
	private Nodo<E> siguiente;
	public Nodo(E dato) {
		this(dato, null);
	}
	public Nodo(E dato, Nodo<E> siguente) {
		this.dato = dato;
		this.siguiente=siguente;
	}
	public E getDato() {
		return dato;
	}
	public void setDato(E dato) {
		this.dato = dato;
	}
	public Nodo<E> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<E> siguiente) {
		this.siguiente = siguiente;
	}
}
