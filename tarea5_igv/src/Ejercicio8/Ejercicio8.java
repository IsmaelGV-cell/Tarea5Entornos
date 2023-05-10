package Ejercicio8;

public class Ejercicio8 {

	public int ej8(int x, int y) {
		int contador = 0;

		for (int i = 0; i < y; i++) {
			if (i % x == 0) {
				contador++;
			}
		}

		return contador;
	}

}
