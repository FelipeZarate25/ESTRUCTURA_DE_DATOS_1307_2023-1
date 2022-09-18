package fes.aragon.inicio;

import java.util.Random;

public class Tarea {
	public static int MAX = 0;

	public static void main(String[] args) {

		int v[] = new int[10];
		int aux[] = new int[10];
		clearArray(v);
		clearArray(aux);

		fillArray(v);
		for (int i = 0; i < 10; i++) {
			System.out.println(v[i] + "");
		}

		System.out.println("");
		int e = 0;
		for (int i = 0; i < 10; i++) {
			e = v[i];
			if (!findElement(aux, e)) {
				System.out.println("El valor " + e + " se encuentra " + countElement(v, e) + " Veces");
				addelement(aux, e);
			}
		}
	}

	public static int countElement(int[] v, int e) {
		int c = 0;
		for (int i = 0; i < 10; i++) {
			if (v[i] == e) {
				c++;
			}
		}
		return c;
	}

	public static boolean findElement(int[] v, int e) {
		for (int i = 0; i < 10; i++) {
			if (v[i] == e)
				return true;
		}
		return false;
	}

	public static boolean addelement(int[] v, int e) {
		if (MAX < v.length) {
			v[MAX++] = e;
			return true;
		}
		return false;
	}

	public static void clearArray(int[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = 0;
		}
	}

	public static void fillArray(int[] v) {
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			v[i] = r.nextInt(10) + 1;
		}
	}

}
