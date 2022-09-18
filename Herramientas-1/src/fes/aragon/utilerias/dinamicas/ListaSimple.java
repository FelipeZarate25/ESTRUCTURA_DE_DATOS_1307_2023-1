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

	public void agregarEnCola(E dato) {
		if (cabeza == null) {
			cabeza = cola = new Nodo<E>(dato);
		} else {
			cola.setSiguiente(new Nodo<E>(dato));
			cola = cola.getSiguiente();
		}
		longitud++;
	}

	public void imprimirElementos() {
		for (Nodo<E> tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
			System.out.println(tmp.getDato());
		}
	}

	public boolean eliminar(E dato) {
		boolean borrado = false;
		if (cabeza != null) {
			if (cabeza == cola && dato.equals(cabeza.getDato())) {
				cabeza = cola = null;
				borrado = true;
				longitud--;
			} else if (dato == cabeza.getDato()) {
				cabeza = cabeza.getSiguiente();
				borrado = true;
				longitud--;
			} else {
				Nodo<E> prd, tmp;
				for (prd = cabeza, tmp = cabeza.getSiguiente(); tmp != null
						&& !tmp.getDato().equals(dato); prd = prd.getSiguiente(), tmp = tmp.getSiguiente())
					;
				if (tmp != null) {
					borrado = true;
					longitud--;
					prd.setSiguiente(tmp.getSiguiente());
					if (tmp == cola) {
						cola = prd;
					}
				}
			}
		}
		return borrado;
	}
	
	public int getLongitud() {
		if (longitud < 0) {
			longitud = 0;	
		}
		return longitud;
	}
	
	public boolean esVacia() {
		return cabeza == null;
	}

	public void eliminarCabeza() {
		if (cabeza == cola) {
			
			if (cabeza == cola) {
				cabeza = cola = null;
				longitud--;
			} else {
				cabeza = cabeza.getSiguiente();
				longitud--;
			}
		}
	}
 
	public void eliminarCola() {
		if (cabeza != null) {
			if (cabeza == cola) {
				cabeza = cola = null;
				longitud--;
			} else {
				Nodo<E> tmp;
				for (tmp = cabeza; tmp.getSiguiente() != cola; tmp=tmp.getSiguiente())
					;
				tmp.setSiguiente(null);
				cola = tmp;
				longitud--;
			}
		}
	}

	public E obtenerNodo(int indice) {
		Nodo<E> tmp = null;
		if (indice <= longitud) {
			tmp = cabeza;
			for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente())
				;
		}
		if (tmp != null) {
			return tmp.getDato();
		} else {
			return null;
		}
	}

	public int estaEnLista(E dato) {
		int indice;
		Nodo<E> tmp = null;
		tmp = cabeza;
		for (indice = 0; indice < longitud - 1 && tmp != null
				&& tmp.getDato().equals(dato); indice++, tmp = tmp.getSiguiente())
			;
		if (tmp != null) {
			return indice;
		} else {
			return -1;
		}
	}

	public boolean eliminarEnIndice(int indice) {
		boolean borrado = false;
		if (indice >= 0 && indice <= longitud - 1) {
			if (cabeza != null) {
				if (cabeza == cola && indice == 0) {
					cabeza = cola = null;
					borrado = true;
					longitud--;
				} else if (indice == 0) {
					cabeza = cabeza.getSiguiente();
					borrado = true;
					longitud--;
				} else {
					Nodo<E> prd, tmp;
					int contador = 1;
					for (prd = cabeza, tmp = cabeza.getSiguiente(); contador < indice; prd = prd
							.getSiguiente(), tmp = tmp.getSiguiente(), contador++)
						;
					if (tmp != null) {
						borrado = true;
						longitud--;
						prd.setSiguiente(tmp.getSiguiente());
						if (tmp == cola) {
							cola = prd;
						}
					}
				}
			}
		}
		return borrado;
	}

	public boolean insertarEnIndice(E dato, int indice) {
		boolean seinserto = false;
		if (indice >= 0 && indice <= longitud - 1) {
			if (indice == 0) {
				this.agregarEnCabeza(dato);
				seinserto = true;
			} else {
				Nodo<E> prv, tmp = null;
				int contador = 0;
				for (prv = null, tmp = cabeza; contador < indice; contador++, prv = tmp, tmp = tmp.getSiguiente())
					;
				prv.setSiguiente(new Nodo<E>(dato, tmp));
				longitud++;
				seinserto = true;
			}
		}
		return seinserto;
	}

	public boolean asignar(E dato, int indice) {
		Nodo<E> tmp = null;
		if (indice <= longitud - 1) {
			tmp = cabeza;
			for (int contador = 0; contador < indice && tmp != null; contador++, tmp = tmp.getSiguiente())
				;
		}
		if (tmp != null) {
			tmp.setDato(dato);
			return true;
		} else {
			return false;
		}
	}

	public void asignar(E dato, E nuevoDato, boolean todos) {
		Nodo<E> tmp = null;
		if (!todos) {
			for (tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
				if (tmp.getDato().equals(dato)) {
					tmp.setDato(nuevoDato);
					return;
				}
			}

		} else {
			for (tmp = cabeza; tmp != null; tmp = tmp.getSiguiente()) {
				if (tmp.getSiguiente().equals(dato)) {
					tmp.setDato(nuevoDato);
					return;
				}
			}
		}
	}

	public E obtenerCabeza() {
		return cabeza.getDato();
	}

	public E obtenerCola() {
		return cola.getDato();
	}

}
